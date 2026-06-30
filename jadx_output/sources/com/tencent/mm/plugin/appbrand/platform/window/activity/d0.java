package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public final class d0 implements com.tencent.mm.plugin.appbrand.utils.g4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.platform.window.activity.e0 f87577a;

    public d0(com.tencent.mm.plugin.appbrand.platform.window.activity.e0 e0Var) {
        this.f87577a = e0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.g4
    public final void a(com.tencent.mm.plugin.appbrand.utils.f4 f4Var, com.tencent.mm.plugin.appbrand.utils.f4 f4Var2) {
        com.tencent.mm.plugin.appbrand.platform.window.activity.e0 e0Var = this.f87577a;
        boolean z17 = android.provider.Settings.System.getInt(e0Var.f87582b.getContentResolver(), "accelerometer_rotation", 0) == 0;
        java.lang.String str = e0Var.f87581a;
        java.util.Objects.toString(f4Var2);
        if (!z17 && e0Var.f87583c != f4Var2) {
            for (com.tencent.mm.plugin.appbrand.platform.window.activity.f0 f0Var : e0Var.f87586f) {
                kotlin.jvm.internal.o.d(f4Var2);
                tf.a aVar = (tf.a) f0Var;
                aVar.getClass();
                java.util.Objects.toString(f4Var2);
                tf.c cVar = aVar.f418779a;
                if (!cVar.b()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onOrientationChanged, not in foreground");
                } else if (cVar.f418790d && cVar.f418791e) {
                    java.lang.ref.WeakReference weakReference = cVar.f418789c;
                    if (weakReference == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onOrientationChanged, mPageViewRef is null");
                    } else {
                        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get();
                        if (v5Var == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onOrientationChanged, thePageView is null");
                        } else {
                            xi1.g windowAndroid = v5Var.getRuntime().getWindowAndroid();
                            if (windowAndroid == null || !windowAndroid.shouldInLargeScreenCompatMode()) {
                                com.tencent.mm.plugin.appbrand.jsapi.w0 a17 = cVar.f418788b.a();
                                int i17 = cVar.f418787a.f252497d;
                                a17.getClass();
                                v5Var.toString();
                                f4Var2.toString();
                                int ordinal = f4Var2.ordinal();
                                java.lang.String str2 = ordinal != 1 ? ordinal != 2 ? ordinal != 4 ? null : "landscape" : "landscapeLeft" : "portrait";
                                if (str2 != null) {
                                    java.util.HashMap hashMap = new java.util.HashMap(2);
                                    hashMap.put("viewId", java.lang.Integer.valueOf(i17));
                                    hashMap.put("orientation", str2);
                                    java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandOnVideoOrientationChanged", "dispatch, name: " + a17.k() + ", data: " + jSONObject);
                                    a17.f82374f = jSONObject;
                                    a17.v(v5Var, v5Var.getComponentId());
                                    a17.m();
                                    com.tencent.mm.plugin.appbrand.e9 v37 = v5Var.v3();
                                    if (v37 != null) {
                                        a17.f82374f = jSONObject;
                                        a17.v(v37, v5Var.getComponentId());
                                        a17.m();
                                    }
                                }
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AbsAutoRotationPluginHandlerCommons", "onOrientationChanged: disable autoRotationEnabled for pad compat mode");
                            }
                        }
                    }
                }
            }
            kotlin.jvm.internal.o.d(f4Var2);
            e0Var.f87583c = f4Var2;
        }
        kotlin.jvm.internal.o.d(f4Var2);
        e0Var.getClass();
    }
}
