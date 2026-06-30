package android.support.v4.os;

/* loaded from: classes13.dex */
public class ResultReceiver implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.os.ResultReceiver> CREATOR = new e.d();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9009d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f9010e;

    /* renamed from: f, reason: collision with root package name */
    public e.c f9011f;

    public ResultReceiver(android.os.Handler handler) {
        this.f9009d = true;
        this.f9010e = handler;
    }

    public void a(int i17, android.os.Bundle bundle) {
    }

    public void b(int i17, android.os.Bundle bundle) {
        if (this.f9009d) {
            android.os.Handler handler = this.f9010e;
            if (handler != null) {
                handler.post(new e.f(this, i17, bundle));
                return;
            } else {
                a(i17, bundle);
                return;
            }
        }
        e.c cVar = this.f9011f;
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
            if (this.f9011f == null) {
                this.f9011f = new e.e(this);
            }
            parcel.writeStrongBinder(this.f9011f.asBinder());
        }
    }

    public ResultReceiver(android.os.Parcel parcel) {
        this.f9009d = false;
        e.c cVar = null;
        this.f9010e = null;
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        int i17 = e.b.f245484d;
        if (readStrongBinder != null) {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(e.c.F0);
            if (queryLocalInterface != null && (queryLocalInterface instanceof e.c)) {
                cVar = (e.c) queryLocalInterface;
            } else {
                cVar = new e.a(readStrongBinder);
            }
        }
        this.f9011f = cVar;
    }
}
