package be1;

/* loaded from: classes7.dex */
public class t0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4234x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f4235x24728b = "setKeepScreenOn";

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f101043g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f101044h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f101045i = false;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 f101046m;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn data is null");
            lVar.a(i17, o("fail:data is null"));
            return;
        }
        if (lVar.mo50352x76847179() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn, server context is nul");
            lVar.a(i17, o("fail:context is null"));
            return;
        }
        if (!(lVar.mo50352x76847179() instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn, server context is not activity, don't do invoke");
            lVar.a(i17, o("fail:context is null"));
            return;
        }
        boolean z17 = false;
        boolean optBoolean = jSONObject.optBoolean("keepScreenOn", false);
        this.f101045i = optBoolean;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn, keepScreenOn:%b, appId:%s", java.lang.Boolean.valueOf(optBoolean), lVar.mo48798x74292566());
        synchronized (this) {
            this.f101043g = lVar;
        }
        if (optBoolean) {
            if (this.f101046m == null) {
                this.f101046m = new be1.s0(this, lVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(lVar.mo48798x74292566(), this.f101046m);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.b(lVar.mo48798x74292566()) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u0.INIT || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.b(lVar.mo48798x74292566()) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u0.ON_CREATE || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.b(lVar.mo48798x74292566()) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u0.ON_RESUME) {
                z17 = C();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetKeepScreenOn", "background status, don't acquire");
            }
        } else if (!D()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetKeepScreenOn", "fail, has not set screen");
            lVar.a(i17, o("fail:has not set screen"));
            return;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetKeepScreenOn", "reset screen off");
            z17 = E();
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn ok");
            lVar.a(i17, o("ok"));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn fail");
            lVar.a(i17, o("fail"));
        }
    }

    public final synchronized boolean C() {
        if (this.f101043g.mo50352x76847179() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetKeepScreenOn", "acquire fail, server context is nul");
            return false;
        }
        if (!(this.f101043g.mo50352x76847179() instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetKeepScreenOn", "acquire fail, context is not Activity, is ".concat(this.f101043g.mo50352x76847179().getClass().getSimpleName()));
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetKeepScreenOn", "acquire ok");
        android.app.Activity activity = (android.app.Activity) this.f101043g.mo50352x76847179();
        if (this.f101044h == null) {
            this.f101044h = ((android.os.PowerManager) activity.getSystemService("power")).newWakeLock(536870922, "MicroMsg.JsApiSetKeepScreenOn");
        }
        if (this.f101044h.isHeld()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetKeepScreenOn", "wakeLock has held ");
        } else {
            android.os.PowerManager.WakeLock wakeLock = this.f101044h;
            yj0.a.c(wakeLock, "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetKeepScreenOn", "acquire", "()Z", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            wakeLock.acquire();
            yj0.a.f(wakeLock, "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetKeepScreenOn", "acquire", "()Z", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetKeepScreenOn", "wakeLock acquire");
        }
        return true;
    }

    public final synchronized boolean D() {
        boolean z17;
        android.os.PowerManager.WakeLock wakeLock = this.f101044h;
        if (wakeLock != null) {
            z17 = wakeLock.isHeld();
        }
        return z17;
    }

    public final synchronized boolean E() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetKeepScreenOn", "release");
        android.os.PowerManager.WakeLock wakeLock = this.f101044h;
        if (wakeLock == null || !wakeLock.isHeld()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetKeepScreenOn", "wakeLock is  null");
            return false;
        }
        android.os.PowerManager.WakeLock wakeLock2 = this.f101044h;
        yj0.a.c(wakeLock2, "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetKeepScreenOn", "release", "()Z", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        wakeLock2.release();
        yj0.a.f(wakeLock2, "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetKeepScreenOn", "release", "()Z", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        this.f101044h = null;
        return true;
    }
}
