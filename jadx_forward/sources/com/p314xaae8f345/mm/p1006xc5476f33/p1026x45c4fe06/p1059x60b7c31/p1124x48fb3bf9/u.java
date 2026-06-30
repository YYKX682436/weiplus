package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9;

/* loaded from: classes7.dex */
public class u extends gb1.d {

    /* renamed from: CTRL_INDEX */
    public static final int f34998x366c91de = 298;

    /* renamed from: NAME */
    public static final java.lang.String f34999x24728b = "insertHTMLWebView";

    public static void P(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb a27 = ((of1.w1) oVar).m151232xaf156f4a().a2();
            if (a27 != null) {
                a27.mo14669x50cdf8a2().setFocusable(false);
                a27.mo14669x50cdf8a2().setFocusableInTouchMode(false);
                a27.mo14662xc2a54588().setFocusable(false);
                a27.mo14662xc2a54588().setFocusableInTouchMode(false);
                if (a27.mo14669x50cdf8a2() instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) a27.mo14669x50cdf8a2()).setDescendantFocusability(393216);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        try {
            of1.w1 w1Var = (of1.w1) oVar;
            android.view.View mo120158xfb86a31b = w1Var.mo51534x86b9ebe3().mo120158xfb86a31b();
            mo120158xfb86a31b.setFocusable(true);
            mo120158xfb86a31b.setFocusableInTouchMode(true);
            mo120158xfb86a31b.setFocusable(true);
            mo120158xfb86a31b.setFocusableInTouchMode(true);
            w1Var.mo51532x11b85c7e().requestFocus();
        } catch (java.lang.Throwable unused2) {
        }
    }

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("htmlId");
    }

    @Override // gb1.d
    public android.view.View K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList;
        int m9702x7444d5ad;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) tVar;
        if (n7Var.s3() != null) {
            return null;
        }
        if (!com.p314xaae8f345.p3210x3857dc.a3.j()) {
            sh0.e eVar = (sh0.e) i95.n0.c(sh0.e.class);
            com.p314xaae8f345.p3210x3857dc.f1 f1Var = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301722m;
            com.p314xaae8f345.p3210x3857dc.f1 f1Var2 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS;
            ((th0.a0) eVar).getClass();
            com.p314xaae8f345.mm.p2829xfa87f9de.y0.b(f1Var2, null);
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
        n7Var.T0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.w(this, n7Var, jSONObject.optBoolean("enableCustomNavigationForLandscape", false)));
        android.content.Context context = n7Var.mo50352x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 rt6 = n7Var.mo32091x9a3f0ba2();
        int i18 = of1.w1.H;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        final of1.w1 w1Var = new of1.w1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6.b(context), rt6, n7Var, null);
        w1Var.mo51536x17e9a4ad(com.p314xaae8f345.mm.R.id.f564713yt);
        if (jSONObject.has("backgroundColor")) {
            m9702x7444d5ad = ik1.w.l(jSONObject.getString("backgroundColor"));
            w1Var.setBackgroundColor(m9702x7444d5ad);
            w1Var.mo51537x77c16137(jSONObject.optBoolean("muted", false));
            w1Var.mo51538xe7e277b3(arrayList);
            n7Var.E(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.C12292x35bb4c(w1Var));
            n7Var.U(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x() { // from class: com.tencent.mm.plugin.appbrand.jsapi.webview.u$$b
                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x
                public final void b() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.u.P(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o.this);
                }
            });
            return w1Var.mo51532x11b85c7e();
        }
        m9702x7444d5ad = n7Var instanceof pa1.o ? 0 : n7Var.mo32091x9a3f0ba2().m0().g() ? b3.l.m9702x7444d5ad(n7Var.mo50352x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u) : -1;
        w1Var.setBackgroundColor(m9702x7444d5ad);
        w1Var.mo51537x77c16137(jSONObject.optBoolean("muted", false));
        w1Var.mo51538xe7e277b3(arrayList);
        n7Var.E(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.C12292x35bb4c(w1Var));
        n7Var.U(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x() { // from class: com.tencent.mm.plugin.appbrand.jsapi.webview.u$$b
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x
            public final void b() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.u.P(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o.this);
            }
        });
        return w1Var.mo51532x11b85c7e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gb1.d
    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) tVar;
        ((of1.w1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o) view)).m151236x6b254375(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiInsertHTMLWebView", "onInsertView appId[%s] viewId[%d] viewHash[%d]", n7Var.mo48798x74292566(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(view.hashCode()));
        if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b()) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.i0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o) view;
        P(oVar);
        boolean z17 = true;
        if (jSONObject.has("adjustResizeOnKeyboardStateChanged")) {
            ((of1.w1) oVar).m151235xadcefbee(jSONObject.optBoolean("adjustResizeOnKeyboardStateChanged", true));
        }
        if (n7Var instanceof pa1.o) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.l m151222x143f1b92 = ((of1.w1) oVar).m151222x143f1b92();
            java.lang.String optString = jSONObject.optString("src");
            of1.v0 v0Var = (of1.v0) m151222x143f1b92;
            v0Var.getClass();
            if (optString != null && optString.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                v0Var.f426561g2.b(optString);
            }
        }
        n7Var.P(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.qa(n7Var, oVar));
    }
}
