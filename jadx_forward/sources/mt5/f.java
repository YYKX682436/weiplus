package mt5;

/* loaded from: classes8.dex */
public class f implements android.content.ServiceConnection {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f412849e;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f412848d = null;

    /* renamed from: f, reason: collision with root package name */
    public final mt5.e f412850f = new mt5.e(this);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f412851g = new java.util.concurrent.CountDownLatch(2);

    public f(android.content.Context context) {
        this.f412849e = context.getApplicationContext();
    }

    public final void a() {
        try {
            this.f412849e.unbindService(this);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            try {
                obtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDService");
                obtain.writeStrongBinder(this.f412850f);
                iBinder.transact(2, obtain, obtain2, 0);
                obtain2.readException();
            } catch (java.lang.Exception unused) {
                this.f412851g.countDown();
                a();
            }
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f412851g.countDown();
    }
}
