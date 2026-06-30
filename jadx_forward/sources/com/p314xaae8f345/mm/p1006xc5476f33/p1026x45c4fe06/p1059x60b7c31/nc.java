package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class nc extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34549x366c91de = -2;

    /* renamed from: NAME */
    private static final java.lang.String f34550x24728b = "restart";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        java.lang.String optString = jSONObject.optString("url");
        boolean optBoolean = jSONObject.optBoolean("force", false);
        if (android.text.TextUtils.isEmpty(optString)) {
            yVar.a(i17, o("fail: empty url"));
            return;
        }
        if (yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) {
            mo32091x9a3f0ba2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) yVar).t3();
        } else {
            if (!(yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7)) {
                yVar.a(i17, o("fail:internal error"));
                return;
            }
            mo32091x9a3f0ba2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) yVar).mo32091x9a3f0ba2();
        }
        int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, mo32091x9a3f0ba2.g2());
        boolean equals = "halfPage".equals(jSONObject.optString("mode", "default"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRestart", "jsapi restart: url[%s], newScene[%d] force[%b]", optString, java.lang.Integer.valueOf(optInt), java.lang.Boolean.valueOf(optBoolean));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = mo32091x9a3f0ba2.u0();
        l81.b1 b1Var = new l81.b1();
        b1Var.f398545a = u07.f128811x;
        b1Var.f398555f = optString;
        b1Var.f398549c = u07.f158814g;
        b1Var.f398551d = u07.L;
        b1Var.f398581z = equals ? 2 : 0;
        b1Var.f398565k = optInt;
        b1Var.f398567l = u07.f128809v;
        b1Var.N = optBoolean;
        java.lang.String optString2 = jSONObject.optString("privateExtraData");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
            b1Var.f398574s = c11812xa040dc98;
            c11812xa040dc98.f158855d = 10;
            c11812xa040dc98.f158858g = optString2;
        }
        if (k01.j.f384572a.b(u07.f128811x, u07.f158811d)) {
            b1Var.Y = u07.C1;
        }
        android.content.Context r07 = mo32091x9a3f0ba2.r0();
        if (equals) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l lVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l();
            lVar2.f159054a = true;
            lVar2.f159055b = (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y * 3) / 4;
            lVar2.f159065l = true;
            k91.s2 s2Var = k91.s2.f387293d;
            lVar2.f159059f = s2Var;
            lVar2.f159062i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), true, true, false, false);
            lVar2.f159060g = true;
            lVar2.f159064k = k91.t2.f387300e;
            lVar2.f159063j = true;
            lVar2.f159067n = true;
            lVar2.f159065l = true;
            lVar2.f159070q = true;
            lVar2.f159061h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CloseWhenClickEmptyAreaConfig(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ".ui.LauncherUI", s2Var);
            lVar2.f159069p = k91.y2.f387360d;
            b1Var.G = lVar2.a();
            if (r07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) r07;
                if (activityC12666xc288131a.F7() && activityC12666xc288131a.isTaskRoot()) {
                    r07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                }
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(r07, b1Var);
    }
}
