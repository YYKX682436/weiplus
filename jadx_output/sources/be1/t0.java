package be1;

/* loaded from: classes7.dex */
public class t0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "setKeepScreenOn";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.l f19510g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f19511h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19512i = false;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.v0 f19513m;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn data is null");
            lVar.a(i17, o("fail:data is null"));
            return;
        }
        if (lVar.getContext() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn, server context is nul");
            lVar.a(i17, o("fail:context is null"));
            return;
        }
        if (!(lVar.getContext() instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn, server context is not activity, don't do invoke");
            lVar.a(i17, o("fail:context is null"));
            return;
        }
        boolean z17 = false;
        boolean optBoolean = jSONObject.optBoolean("keepScreenOn", false);
        this.f19512i = optBoolean;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn, keepScreenOn:%b, appId:%s", java.lang.Boolean.valueOf(optBoolean), lVar.getAppId());
        synchronized (this) {
            this.f19510g = lVar;
        }
        if (optBoolean) {
            if (this.f19513m == null) {
                this.f19513m = new be1.s0(this, lVar);
            }
            com.tencent.mm.plugin.appbrand.x0.a(lVar.getAppId(), this.f19513m);
            if (com.tencent.mm.plugin.appbrand.x0.b(lVar.getAppId()) == com.tencent.mm.plugin.appbrand.u0.INIT || com.tencent.mm.plugin.appbrand.x0.b(lVar.getAppId()) == com.tencent.mm.plugin.appbrand.u0.ON_CREATE || com.tencent.mm.plugin.appbrand.x0.b(lVar.getAppId()) == com.tencent.mm.plugin.appbrand.u0.ON_RESUME) {
                z17 = C();
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetKeepScreenOn", "background status, don't acquire");
            }
        } else if (!D()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetKeepScreenOn", "fail, has not set screen");
            lVar.a(i17, o("fail:has not set screen"));
            return;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetKeepScreenOn", "reset screen off");
            z17 = E();
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn ok");
            lVar.a(i17, o("ok"));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn fail");
            lVar.a(i17, o("fail"));
        }
    }

    public final synchronized boolean C() {
        if (this.f19510g.getContext() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetKeepScreenOn", "acquire fail, server context is nul");
            return false;
        }
        if (!(this.f19510g.getContext() instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetKeepScreenOn", "acquire fail, context is not Activity, is ".concat(this.f19510g.getContext().getClass().getSimpleName()));
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetKeepScreenOn", "acquire ok");
        android.app.Activity activity = (android.app.Activity) this.f19510g.getContext();
        if (this.f19511h == null) {
            this.f19511h = ((android.os.PowerManager) activity.getSystemService("power")).newWakeLock(536870922, "MicroMsg.JsApiSetKeepScreenOn");
        }
        if (this.f19511h.isHeld()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetKeepScreenOn", "wakeLock has held ");
        } else {
            android.os.PowerManager.WakeLock wakeLock = this.f19511h;
            yj0.a.c(wakeLock, "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetKeepScreenOn", "acquire", "()Z", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            wakeLock.acquire();
            yj0.a.f(wakeLock, "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetKeepScreenOn", "acquire", "()Z", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetKeepScreenOn", "wakeLock acquire");
        }
        return true;
    }

    public final synchronized boolean D() {
        boolean z17;
        android.os.PowerManager.WakeLock wakeLock = this.f19511h;
        if (wakeLock != null) {
            z17 = wakeLock.isHeld();
        }
        return z17;
    }

    public final synchronized boolean E() {
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetKeepScreenOn", "release");
        android.os.PowerManager.WakeLock wakeLock = this.f19511h;
        if (wakeLock == null || !wakeLock.isHeld()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetKeepScreenOn", "wakeLock is  null");
            return false;
        }
        android.os.PowerManager.WakeLock wakeLock2 = this.f19511h;
        yj0.a.c(wakeLock2, "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetKeepScreenOn", "release", "()Z", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        wakeLock2.release();
        yj0.a.f(wakeLock2, "com/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetKeepScreenOn", "release", "()Z", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        this.f19511h = null;
        return true;
    }
}
