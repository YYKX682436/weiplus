package com.tencent.mm.plugin.appbrand.skyline.nativeview;

/* loaded from: classes7.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f88933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.skyline.nativeview.t0 f88934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf.f f88935f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f88936g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f88937h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f88938i;

    public q0(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.skyline.nativeview.t0 t0Var, sf.f fVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, org.json.JSONObject jSONObject) {
        this.f88933d = k0Var;
        this.f88934e = t0Var;
        this.f88935f = fVar;
        this.f88936g = lVar;
        this.f88937h = i17;
        this.f88938i = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap;
        boolean z17;
        sh1.e eVar;
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f88933d;
        if (!(k0Var instanceof com.tencent.mm.plugin.appbrand.skyline.nativeview.f)) {
            if (k0Var instanceof com.tencent.mm.plugin.appbrand.skyline.nativeview.i) {
                int optInt = this.f88938i.optInt("viewId");
                com.tencent.mm.plugin.appbrand.skyline.nativeview.k0 k0Var2 = com.tencent.mm.plugin.appbrand.skyline.nativeview.k0.f88902a;
                java.lang.String jSONObject = this.f88938i.toString();
                kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                sh1.g b17 = k0Var2.b(optInt);
                if (b17 != null) {
                    b17.d(jSONObject);
                    return;
                }
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt(dm.i4.COL_ID, optInt);
                bundle.putString("params", jSONObject);
                com.tencent.mm.ipcinvoker.d0.d(str2, bundle, com.tencent.mm.plugin.appbrand.skyline.nativeview.g0.f88895d.getClass(), com.tencent.mm.plugin.appbrand.skyline.nativeview.h0.f88896d);
                return;
            }
            if (!(k0Var instanceof com.tencent.mm.plugin.appbrand.skyline.nativeview.g)) {
                if (k0Var instanceof com.tencent.mm.plugin.appbrand.skyline.nativeview.h) {
                    com.tencent.mm.plugin.appbrand.skyline.nativeview.t0 t0Var = this.f88934e;
                    t0Var.f88948i = null;
                    t0Var.f88946g = null;
                    int optInt2 = this.f88938i.optInt("viewId");
                    com.tencent.mm.plugin.appbrand.skyline.nativeview.k0 k0Var3 = com.tencent.mm.plugin.appbrand.skyline.nativeview.k0.f88902a;
                    java.lang.String jSONObject2 = this.f88938i.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    k0Var3.d(optInt2, jSONObject2);
                    return;
                }
                return;
            }
            int optInt3 = this.f88938i.optInt("viewId");
            com.tencent.mm.plugin.appbrand.skyline.nativeview.k0 k0Var4 = com.tencent.mm.plugin.appbrand.skyline.nativeview.k0.f88902a;
            java.lang.String jSONObject3 = this.f88938i.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            sh1.g b18 = k0Var4.b(optInt3);
            if (b18 != null) {
                b18.b(jSONObject3);
                return;
            }
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.w9.f193053a;
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt(dm.i4.COL_ID, optInt3);
            bundle2.putString("params", jSONObject3);
            com.tencent.mm.ipcinvoker.d0.d(str3, bundle2, com.tencent.mm.plugin.appbrand.skyline.nativeview.x.f88956d.getClass(), com.tencent.mm.plugin.appbrand.skyline.nativeview.y.f88957d);
            return;
        }
        this.f88934e.f88948i = this.f88935f;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f88936g;
        kotlin.jvm.internal.o.d(lVar);
        u81.b appState = lVar.getAppState();
        kotlin.jvm.internal.o.f(appState, "getAppState(...)");
        if (appState != u81.b.FOREGROUND) {
            com.tencent.mars.xlog.Log.e("SkylineNativeViewPluginHandler", "id:" + this.f88934e.f252497d + " insertNativeView fail, state:" + appState);
            com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = this.f88936g;
            if (lVar2 != null) {
                int i17 = this.f88937h;
                com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var5 = this.f88933d;
                k0Var5.getClass();
                str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                try {
                    jSONObject4.put("errno", 4);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                lVar2.a(i17, k0Var5.u(str, jSONObject4));
                return;
            }
            return;
        }
        int optInt4 = this.f88938i.optInt("viewId");
        java.lang.String optString = this.f88938i.optString("nativeViewType");
        com.tencent.mars.xlog.Log.i("SkylineNativeViewPluginHandler", "id:" + optInt4 + " insertNativeView");
        sf.f fVar = this.f88934e.f88948i;
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = fVar != null ? fVar.m() : null;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = m17 instanceof com.tencent.mm.plugin.appbrand.page.n7 ? (com.tencent.mm.plugin.appbrand.page.n7) m17 : null;
        com.tencent.mm.plugin.appbrand.skyline.nativeview.k0 k0Var6 = com.tencent.mm.plugin.appbrand.skyline.nativeview.k0.f88902a;
        kotlin.jvm.internal.o.d(n7Var);
        android.view.View contentView = n7Var.getContentView();
        kotlin.jvm.internal.o.d(optString);
        java.lang.String jSONObject5 = this.f88938i.toString();
        kotlin.jvm.internal.o.f(jSONObject5, "toString(...)");
        kf.b bVar = this.f88934e.f88946g;
        kotlin.jvm.internal.o.d(bVar);
        com.tencent.mm.plugin.appbrand.skyline.nativeview.t0 invoker = this.f88934e;
        kotlin.jvm.internal.o.g(invoker, "invoker");
        k0Var6.c();
        synchronized (k0Var6) {
            hashMap = com.tencent.mm.plugin.appbrand.skyline.nativeview.k0.f88903b;
            com.tencent.mm.plugin.appbrand.skyline.nativeview.t tVar = (com.tencent.mm.plugin.appbrand.skyline.nativeview.t) hashMap.get(optString);
            z17 = tVar != null ? tVar.f88944a : false;
        }
        if (z17) {
            synchronized (k0Var6) {
                com.tencent.mm.plugin.appbrand.skyline.nativeview.k0.f88904c.put(java.lang.Integer.valueOf(optInt4), invoker);
            }
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.w9.f193053a;
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putInt(dm.i4.COL_ID, optInt4);
            bundle3.putString("processName", bm5.f1.a());
            bundle3.putString("viewType", optString);
            bundle3.putString("params", jSONObject5);
            bundle3.putParcelable("surface", new android.view.Surface(bVar));
            com.tencent.mm.ipcinvoker.d0.d(str5, bundle3, com.tencent.mm.plugin.appbrand.skyline.nativeview.v.f88950d.getClass(), com.tencent.mm.plugin.appbrand.skyline.nativeview.w.f88952d);
        } else {
            synchronized (k0Var6) {
                com.tencent.mm.plugin.appbrand.skyline.nativeview.t tVar2 = (com.tencent.mm.plugin.appbrand.skyline.nativeview.t) hashMap.get(optString);
                eVar = tVar2 != null ? tVar2.f88945b : null;
            }
            sh1.g b19 = eVar != null ? eVar.b(contentView, optInt4, jSONObject5, bVar, invoker) : null;
            com.tencent.mars.xlog.Log.i("SkylineNativeViewManager", "createSkylineNativeView factory:" + eVar + " receiver:" + b19);
            if (b19 != null) {
                synchronized (k0Var6) {
                    com.tencent.mm.plugin.appbrand.skyline.nativeview.k0.f88905d.put(java.lang.Integer.valueOf(optInt4), b19);
                }
            }
        }
        kf.b bVar2 = this.f88934e.f88946g;
        if (bVar2 != null) {
            bVar2.f307161c = new com.tencent.mm.plugin.appbrand.skyline.nativeview.m0(optInt4);
        }
        com.tencent.mm.plugin.appbrand.skyline.nativeview.p0 p0Var = new com.tencent.mm.plugin.appbrand.skyline.nativeview.p0(optInt4);
        n7Var.U(p0Var);
        com.tencent.mm.plugin.appbrand.skyline.nativeview.o0 o0Var = new com.tencent.mm.plugin.appbrand.skyline.nativeview.o0(optInt4);
        n7Var.R(o0Var);
        n7Var.w(new com.tencent.mm.plugin.appbrand.skyline.nativeview.n0(optInt4, n7Var, o0Var, p0Var, this.f88934e));
        com.tencent.mm.plugin.appbrand.jsapi.l lVar3 = this.f88936g;
        if (lVar3 != null) {
            int i18 = this.f88937h;
            com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var7 = this.f88933d;
            k0Var7.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            try {
                jSONObject6.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar3.a(i18, k0Var7.u(str, jSONObject6));
        }
    }
}
