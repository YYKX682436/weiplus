package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3;

/* loaded from: classes14.dex */
public final class i extends gb1.d {

    /* renamed from: CTRL_INDEX */
    public static final int f34439x366c91de = 1332;

    /* renamed from: NAME */
    public static final java.lang.String f34440x24728b = "insertLiteAppView";

    @Override // gb1.d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLiteAppView", "invoke");
        B(lVar, data, i17, lVar.getF229341e());
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return data.optInt("viewId");
    }

    @Override // gb1.d
    public android.view.View K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t component, org.json.JSONObject data) {
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z37;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLiteAppView", "inflateView");
        android.content.Context f229340d = component.getF229340d();
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        double d17 = 0.75d;
        boolean z38 = true;
        if (optJSONObject != null) {
            boolean optBoolean = optJSONObject.optBoolean("isHalfScreen");
            boolean optBoolean2 = optJSONObject.optBoolean("enablePullDown", true);
            z29 = optJSONObject.optBoolean("enablePullUp", true);
            z27 = optJSONObject.optBoolean("enableFullscreenPullDown", false);
            d17 = optJSONObject.optDouble("halfScreenHeightPercent", 0.75d);
            z37 = optJSONObject.optBoolean("withMask", true);
            z28 = optJSONObject.optBoolean("autoRotate", false);
            java.lang.String optString = optJSONObject.optString("enterType", "");
            if (optString.equals(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63)) {
                z17 = true;
                z38 = optBoolean2;
                z19 = optBoolean;
                z18 = false;
            } else if (optString.equals("modal")) {
                z17 = false;
                z18 = true;
                z38 = optBoolean2;
                z19 = optBoolean;
            } else {
                z17 = false;
                z38 = optBoolean2;
                z19 = optBoolean;
                z18 = false;
            }
        } else {
            z17 = false;
            z18 = false;
            z19 = false;
            z27 = false;
            z28 = false;
            z29 = true;
            z37 = true;
        }
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        android.content.Context f229340d2 = component.getF229340d();
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var;
        iVar.getClass();
        if (z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39 c16238x79483a39 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16238x79483a39(f229340d2);
            c16238x79483a39.m65906x227743dc(d17);
            c16238x79483a39.m65903x2928282c(z38);
            c16238x79483a39.m65904x2d986ca5(z29);
            c16238x79483a39.m65902xdc1992c7(z27);
            c16238x79483a39.m65913x3e7cf754(z37);
            c16238x79483a39.m65897x39b6dec(z28);
            c16238x79483a39.m65907xb1072479(false);
            c16238x79483a39.m65905xfd38231b(z17);
            c16238x79483a39.m65910x535fbb6b(z18);
            view = c16238x79483a39;
        } else {
            view = iVar.oj(f229340d2, false, false, null);
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505(f229340d, view);
    }

    @Override // gb1.d
    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t component, int i17, android.view.View view, org.json.JSONObject data) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLiteAppView", "onInsertView");
        java.lang.String optString = data.optString("appId");
        java.lang.String optString2 = data.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
        java.lang.String optString3 = data.optString("query");
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (optJSONObject != null) {
            jSONObject.put("params", optJSONObject);
            z17 = optJSONObject.optBoolean("isTransparent");
        } else {
            z17 = false;
        }
        com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329 = (com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329.class);
        q80.d0 d0Var = new q80.d0();
        d0Var.f442182a = optString;
        d0Var.f442183b = optString2;
        d0Var.f442184c = optString3;
        d0Var.f442206y = jSONObject;
        d0Var.f442185d = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
        c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.WA_APP;
        d0Var.f442207z = c3708xc1f46f80;
        if (c3717xac6c2329 != null) {
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.h(component);
            com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var;
            iVar.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d0Var.f442182a)) {
                hVar.mo9542x2fd71e();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData openExtraData = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData();
                iVar.rk(c3717xac6c2329, iVar.mj(d0Var, openExtraData), d0Var.f442199r, d0Var.f442200s, openExtraData, hVar);
            }
        }
    }
}
