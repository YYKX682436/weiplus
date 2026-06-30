package lb;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f399188b;

    /* renamed from: c, reason: collision with root package name */
    public lb.i f399189c;

    /* renamed from: d, reason: collision with root package name */
    public lb.c f399190d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f399191e;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f399187a = new byte[0];

    /* renamed from: f, reason: collision with root package name */
    public final android.content.ServiceConnection f399192f = new lb.d(this, null);

    public e(android.content.Context context) {
        new lb.a(this);
        this.f399188b = new java.lang.ref.WeakReference(context);
    }

    public static void a(lb.e eVar) {
        android.content.Context context;
        synchronized (eVar.f399187a) {
            if (eVar.f399189c == null) {
                android.content.Intent intent = new android.content.Intent("com.huawei.nfc.action.OPEN_AIDL_API_PAY");
                intent.setPackage("com.huawei.wallet");
                java.lang.ref.WeakReference weakReference = eVar.f399188b;
                boolean bindService = (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) ? false : context.bindService(intent, eVar.f399192f, 1);
                "---bindService---end:".concat(java.lang.String.valueOf(bindService));
                if (bindService) {
                    eVar.f399191e = true;
                    if (eVar.f399189c == null) {
                        try {
                            eVar.f399187a.wait();
                        } catch (java.lang.Exception unused) {
                        }
                    }
                }
                lb.c cVar = eVar.f399190d;
                if (cVar != null) {
                    ((com.p3263xee53b379.i) cVar).a(0, new android.os.Bundle());
                }
                eVar.b();
            }
        }
    }

    public final void b() {
        android.content.ServiceConnection serviceConnection;
        if (this.f399191e) {
            this.f399191e = false;
            this.f399189c = null;
            java.lang.ref.WeakReference weakReference = this.f399188b;
            if (weakReference == null || (serviceConnection = this.f399192f) == null) {
                return;
            }
            try {
                android.content.Context context = (android.content.Context) weakReference.get();
                if (context != null) {
                    context.unbindService(serviceConnection);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
