package com.tencent.mm.plugin.appbrand.jsapi.system;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetScreenBrightness2;", "Lcom/tencent/mm/plugin/appbrand/jsapi/f;", "Lcom/tencent/mm/plugin/appbrand/jsapi/l;", "<init>", "()V", "Companion", "luggage-commons-jsapi-default-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class JsApiSetScreenBrightness2 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 229;
    public static final java.lang.String NAME = "setScreenBrightness";

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2.Companion f83439i = new com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2.Companion(null);

    /* renamed from: g, reason: collision with root package name */
    public float f83440g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public androidx.lifecycle.x f83441h;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetScreenBrightness2$Companion;", "", "", "CTRL_INDEX", "I", "", "MAGIC_OVERRIDE_NONE", "F", "", "NAME", "Ljava/lang/String;", "TAG", "<init>", "()V", "luggage-commons-jsapi-default-impl_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public static final void a(com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2.Companion companion, android.app.Activity activity, float f17) {
            android.view.WindowManager.LayoutParams attributes;
            companion.getClass();
            android.view.Window window = activity.getWindow();
            if (window == null || (attributes = window.getAttributes()) == null) {
                return;
            }
            if (java.lang.Float.compare(-1.0f, f17) == 0) {
                attributes.screenBrightness = -1.0f;
            } else {
                attributes.screenBrightness = java.lang.Float.max(f17, 0.01f);
            }
            activity.getWindow().setAttributes(attributes);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(final com.tencent.mm.plugin.appbrand.jsapi.l env, final org.json.JSONObject data, final int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        final com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2$invoke$logI$1 jsApiSetScreenBrightness2$invoke$logI$1 = new com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2$invoke$logI$1(env, i17);
        env.m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2$invoke$1
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("data:");
                org.json.JSONObject jSONObject = data;
                sb6.append(jSONObject);
                sb6.append(", appState:");
                final com.tencent.mm.plugin.appbrand.jsapi.l lVar = env;
                sb6.append(lVar.getAppState());
                java.lang.String sb7 = sb6.toString();
                final yz5.l lVar2 = yz5.l.this;
                lVar2.invoke(sb7);
                float optDouble = (float) jSONObject.optDouble("value", Double.NaN);
                final com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2 jsApiSetScreenBrightness2 = this;
                jsApiSetScreenBrightness2.f83440g = optDouble;
                boolean isNaN = java.lang.Float.isNaN(optDouble);
                int i18 = i17;
                if (!isNaN) {
                    float f17 = jsApiSetScreenBrightness2.f83440g;
                    if (f17 <= 1.0f && (f17 >= 0.0f || java.lang.Float.compare(-1.0f, f17) == 0)) {
                        if (u81.b.FOREGROUND == lVar.getAppState()) {
                            com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2.Companion companion = com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2.f83439i;
                            companion.getClass();
                            android.app.Activity a17 = q75.a.a(lVar.getContext());
                            if (a17 != null) {
                                com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2.Companion.a(companion, a17, jsApiSetScreenBrightness2.f83440g);
                            }
                        }
                        if (jsApiSetScreenBrightness2.f83441h == null && lVar.getLifecycleOwner() != null) {
                            androidx.lifecycle.x xVar = new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2$invoke$1.1
                                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
                                public final void onPaused() {
                                    yz5.l.this.invoke("onPaused, restore to BRIGHTNESS_OVERRIDE_NONE");
                                    com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2.Companion companion2 = com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2.f83439i;
                                    companion2.getClass();
                                    android.app.Activity a18 = q75.a.a(lVar.getContext());
                                    if (a18 != null) {
                                        com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2.Companion.a(companion2, a18, -1.0f);
                                    }
                                }

                                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
                                public final void onResumed() {
                                    com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2 jsApiSetScreenBrightness22 = jsApiSetScreenBrightness2;
                                    if (java.lang.Float.isNaN(jsApiSetScreenBrightness22.f83440g)) {
                                        return;
                                    }
                                    yz5.l.this.invoke("onResumed, restore to " + jsApiSetScreenBrightness22.f83440g);
                                    com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2.Companion companion2 = com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2.f83439i;
                                    companion2.getClass();
                                    android.app.Activity a18 = q75.a.a(lVar.getContext());
                                    if (a18 != null) {
                                        com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2.Companion.a(companion2, a18, jsApiSetScreenBrightness22.f83440g);
                                    }
                                }
                            };
                            androidx.lifecycle.y lifecycleOwner = lVar.getLifecycleOwner();
                            kotlin.jvm.internal.o.d(lifecycleOwner);
                            lifecycleOwner.mo133getLifecycle().a(xVar);
                            jsApiSetScreenBrightness2.f83441h = xVar;
                        }
                        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                        if (str == null) {
                            str = "";
                        }
                        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        try {
                            jSONObject2.put("errno", 0);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                        }
                        lVar.a(i18, jsApiSetScreenBrightness2.u(str, jSONObject2));
                        return;
                    }
                }
                lVar.a(i18, jsApiSetScreenBrightness2.o("fail: value invalid"));
            }
        });
    }
}
