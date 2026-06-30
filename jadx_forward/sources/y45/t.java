package y45;

/* loaded from: classes11.dex */
public final class t implements sc0.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f540923a;

    /* renamed from: b, reason: collision with root package name */
    public final sc0.a[] f540924b = {null};

    public t(android.content.Context context, java.lang.String str) {
        if (!(context instanceof android.app.Application)) {
            context.getApplicationContext();
        }
        this.f540923a = str;
    }

    public void a() {
        synchronized (this.f540924b) {
            sc0.a[] aVarArr = this.f540924b;
            sc0.a aVar = aVarArr[0];
            if (aVar == null) {
                d55.u.d("MicroMsg.RecoveryWatchDog", "[!] %s: end() was called without calling start().", this.f540923a);
                return;
            }
            aVarArr[0] = null;
            y45.u.a().removeCallbacks(aVar);
            d55.u.b("MicroMsg.RecoveryWatchDog", "[+] %s: end() was called, stack: %s", this.f540923a, android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
    }
}
