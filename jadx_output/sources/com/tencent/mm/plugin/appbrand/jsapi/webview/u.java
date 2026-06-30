package com.tencent.mm.plugin.appbrand.jsapi.webview;

/* loaded from: classes7.dex */
public class u extends gb1.d {
    public static final int CTRL_INDEX = 298;
    public static final java.lang.String NAME = "insertHTMLWebView";

    public static void P(com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar) {
        try {
            com.tencent.mm.plugin.appbrand.page.fb a27 = ((of1.w1) oVar).m533getPageView().a2();
            if (a27 != null) {
                a27.getWrapperView().setFocusable(false);
                a27.getWrapperView().setFocusableInTouchMode(false);
                a27.getContentView().setFocusable(false);
                a27.getContentView().setFocusableInTouchMode(false);
                if (a27.getWrapperView() instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) a27.getWrapperView()).setDescendantFocusability(393216);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        try {
            of1.w1 w1Var = (of1.w1) oVar;
            android.view.View view = w1Var.getWebView().getView();
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            w1Var.getAndroidView().requestFocus();
        } catch (java.lang.Throwable unused2) {
        }
    }

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("htmlId");
    }

    @Override // gb1.d
    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList;
        int color;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) tVar;
        if (n7Var.s3() != null) {
            return null;
        }
        if (!com.tencent.xweb.a3.j()) {
            sh0.e eVar = (sh0.e) i95.n0.c(sh0.e.class);
            com.tencent.xweb.f1 f1Var = com.tencent.xweb.WebView.f220189m;
            com.tencent.xweb.f1 f1Var2 = com.tencent.xweb.f1.WV_KIND_PINUS;
            ((th0.a0) eVar).getClass();
            com.tencent.mm.xwebutil.y0.b(f1Var2, null);
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("bizDomainList");
        if (optJSONArray != null) {
            arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                java.lang.String optString = optJSONArray.optString(i17);
                if (!android.text.TextUtils.isEmpty(optString)) {
                    arrayList.add(optString);
                }
            }
        } else {
            arrayList = null;
        }
        n7Var.T0(new com.tencent.mm.plugin.appbrand.jsapi.webview.w(this, n7Var, jSONObject.optBoolean("enableCustomNavigationForLandscape", false)));
        android.content.Context context = n7Var.getContext();
        com.tencent.mm.plugin.appbrand.o6 rt6 = n7Var.getRuntime();
        int i18 = of1.w1.H;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rt6, "rt");
        final of1.w1 w1Var = new of1.w1(com.tencent.mm.plugin.appbrand.ui.z6.b(context), rt6, n7Var, null);
        w1Var.setAndroidViewId(com.tencent.mm.R.id.f483180yt);
        if (jSONObject.has("backgroundColor")) {
            color = ik1.w.l(jSONObject.getString("backgroundColor"));
            w1Var.setBackgroundColor(color);
            w1Var.setAudioMuted(jSONObject.optBoolean("muted", false));
            w1Var.setBizDomainList(arrayList);
            n7Var.E(new com.tencent.mm.plugin.appbrand.jsapi.webview.u$$a(w1Var));
            n7Var.U(new com.tencent.mm.plugin.appbrand.jsapi.x() { // from class: com.tencent.mm.plugin.appbrand.jsapi.webview.u$$b
                @Override // com.tencent.mm.plugin.appbrand.jsapi.x
                public final void b() {
                    com.tencent.mm.plugin.appbrand.jsapi.webview.u.P(com.tencent.mm.plugin.appbrand.jsapi.webview.o.this);
                }
            });
            return w1Var.getAndroidView();
        }
        color = n7Var instanceof pa1.o ? 0 : n7Var.getRuntime().m0().g() ? b3.l.getColor(n7Var.getContext(), com.tencent.mm.R.color.f478512u) : -1;
        w1Var.setBackgroundColor(color);
        w1Var.setAudioMuted(jSONObject.optBoolean("muted", false));
        w1Var.setBizDomainList(arrayList);
        n7Var.E(new com.tencent.mm.plugin.appbrand.jsapi.webview.u$$a(w1Var));
        n7Var.U(new com.tencent.mm.plugin.appbrand.jsapi.x() { // from class: com.tencent.mm.plugin.appbrand.jsapi.webview.u$$b
            @Override // com.tencent.mm.plugin.appbrand.jsapi.x
            public final void b() {
                com.tencent.mm.plugin.appbrand.jsapi.webview.u.P(com.tencent.mm.plugin.appbrand.jsapi.webview.o.this);
            }
        });
        return w1Var.getAndroidView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gb1.d
    public void N(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) tVar;
        ((of1.w1) ((com.tencent.mm.plugin.appbrand.jsapi.webview.o) view)).setCoverViewId(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiInsertHTMLWebView", "onInsertView appId[%s] viewId[%d] viewHash[%d]", n7Var.getAppId(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(view.hashCode()));
        if (!com.tencent.mm.pluginsdk.model.g4.b()) {
            com.tencent.mm.ipcinvoker.i0.a(com.tencent.mm.sdk.platformtools.w9.f193055c);
        }
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = (com.tencent.mm.plugin.appbrand.jsapi.webview.o) view;
        P(oVar);
        boolean z17 = true;
        if (jSONObject.has("adjustResizeOnKeyboardStateChanged")) {
            ((of1.w1) oVar).setAdjustResizeOnKeyboardStateChanged(jSONObject.optBoolean("adjustResizeOnKeyboardStateChanged", true));
        }
        if (n7Var instanceof pa1.o) {
            com.tencent.mm.plugin.appbrand.jsapi.webview.l controller = ((of1.w1) oVar).getController();
            java.lang.String optString = jSONObject.optString("src");
            of1.v0 v0Var = (of1.v0) controller;
            v0Var.getClass();
            if (optString != null && optString.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                v0Var.f345028g2.b(optString);
            }
        }
        n7Var.P(new com.tencent.mm.plugin.appbrand.page.qa(n7Var, oVar));
    }
}
