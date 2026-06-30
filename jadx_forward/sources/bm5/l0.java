package bm5;

/* loaded from: classes13.dex */
public class l0 extends android.os.Binder {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.IBinder[] f104232d;

    public l0(android.os.IBinder[] iBinderArr) {
        this.f104232d = iBinderArr;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 != 1) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        synchronized (this.f104232d) {
            this.f104232d[0] = parcel.readStrongBinder();
            this.f104232d.notifyAll();
        }
        return true;
    }
}
