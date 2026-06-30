package com.tencent.mm.plugin.appbrand.jsapi.sensor;

/* loaded from: classes7.dex */
public class u extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 472;
    public static final java.lang.String NAME = "enableDeviceOrientationChangeListening";

    /* renamed from: g, reason: collision with root package name */
    public boolean f83045g = false;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.utils.h4 f83046h;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(final com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        if (jSONObject.optBoolean("enable", false)) {
            java.util.Map map = com.tencent.mm.plugin.appbrand.jsapi.sensor.b0.f82982h;
            final com.tencent.mm.plugin.appbrand.jsapi.sensor.b0 a17 = com.tencent.mm.plugin.appbrand.jsapi.sensor.b0.a(lVar.getAppId(), true);
            java.util.Objects.requireNonNull(a17);
            a17.f82984b = lVar.getAppId();
            a17.f82985c = lVar;
            a17.f82983a = true;
            a17.f82986d.p(lVar);
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.sensor.b0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.utils.f4 f4Var;
                    com.tencent.mm.plugin.appbrand.jsapi.sensor.b0 b0Var = com.tencent.mm.plugin.appbrand.jsapi.sensor.b0.this;
                    b0Var.getClass();
                    com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = lVar;
                    if (lVar2.getContext() != null) {
                        int i17 = lVar2.getContext().getResources().getConfiguration().orientation;
                        if (i17 == 2) {
                            com.tencent.mm.plugin.appbrand.utils.f4 f4Var2 = b0Var.f82987e;
                            f4Var = com.tencent.mm.plugin.appbrand.utils.f4.REVERSE_LANDSCAPE;
                            if (f4Var2 != f4Var) {
                                f4Var = com.tencent.mm.plugin.appbrand.utils.f4.LANDSCAPE;
                            }
                        } else {
                            f4Var = i17 == 1 ? com.tencent.mm.plugin.appbrand.utils.f4.PORTRAIT : com.tencent.mm.plugin.appbrand.utils.f4.NONE;
                        }
                        b0Var.f82988f = f4Var;
                        b0Var.c(f4Var);
                    }
                }
            });
            com.tencent.mars.xlog.Log.i("MicroMsg.OrientationConfigListenerHelper", "startListen appId:%s", a17.f82984b);
            if (!this.f83045g) {
                com.tencent.mm.plugin.appbrand.utils.h4 h4Var = new com.tencent.mm.plugin.appbrand.utils.h4(lVar.getContext(), new com.tencent.mm.plugin.appbrand.jsapi.sensor.t(lVar.getAppId()));
                this.f83046h = h4Var;
                h4Var.enable();
                this.f83045g = true;
                androidx.lifecycle.y lifecycleOwner = lVar.getLifecycleOwner();
                if (lifecycleOwner != null) {
                    ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.jsapi.sensor.r(this, lifecycleOwner));
                }
            }
        } else {
            java.util.Map map2 = com.tencent.mm.plugin.appbrand.jsapi.sensor.b0.f82982h;
            com.tencent.mm.plugin.appbrand.jsapi.sensor.b0 a18 = com.tencent.mm.plugin.appbrand.jsapi.sensor.b0.a(lVar.getAppId(), false);
            if (a18 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OrientationConfigListenerHelper", "stopListen appId:%s", a18.f82984b);
                a18.f82984b = "";
                a18.f82985c = null;
                a18.f82983a = false;
                a18.f82988f = com.tencent.mm.plugin.appbrand.utils.f4.NONE;
            }
            if (this.f83045g) {
                this.f83046h.disable();
                this.f83046h = null;
                this.f83045g = false;
            }
        }
        return o("ok");
    }
}
