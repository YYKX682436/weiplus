package p001xcca8366f.p003x91727fcf.v4.os;

/* renamed from: android.support.v4.os.ResultReceiver */
/* loaded from: classes13.dex */
public class C0050x5b3754c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c> f74x681a0c0c = new e.d();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f90542d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f90543e;

    /* renamed from: f, reason: collision with root package name */
    public e.c f90544f;

    public C0050x5b3754c(android.os.Handler handler) {
        this.f90542d = true;
        this.f90543e = handler;
    }

    public void a(int i17, android.os.Bundle bundle) {
    }

    public void b(int i17, android.os.Bundle bundle) {
        if (this.f90542d) {
            android.os.Handler handler = this.f90543e;
            if (handler != null) {
                handler.post(new e.f(this, i17, bundle));
                return;
            } else {
                a(i17, bundle);
                return;
            }
        }
        e.c cVar = this.f90544f;
        if (cVar != null) {
            try {
                cVar.V5(i17, bundle);
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        synchronized (this) {
            if (this.f90544f == null) {
                this.f90544f = new e.e(this);
            }
            parcel.writeStrongBinder(this.f90544f.asBinder());
        }
    }

    public C0050x5b3754c(android.os.Parcel parcel) {
        this.f90542d = false;
        e.c cVar = null;
        this.f90543e = null;
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        int i17 = e.b.f327017d;
        if (readStrongBinder != null) {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(e.c.F0);
            if (queryLocalInterface != null && (queryLocalInterface instanceof e.c)) {
                cVar = (e.c) queryLocalInterface;
            } else {
                cVar = new e.a(readStrongBinder);
            }
        }
        this.f90544f = cVar;
    }
}
