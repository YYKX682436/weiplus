package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

/* loaded from: classes7.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34689x366c91de = 560;

    /* renamed from: NAME */
    private static final java.lang.String f34690x24728b = "openBizProfile";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, org.json.JSONObject data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString(dm.i4.f66875xa013b0d5);
        int optInt = data.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 122);
        java.lang.String optString2 = data.optString("profileReportInfo");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            env.a(i17, o("fail:invalid data"));
            return;
        }
        if (!((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ui() && com.p314xaae8f345.mm.p2621x8fb0427b.z3.F3(optString)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.b.a(env.mo50352x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.n7b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOpenBizProfile", "openOfficialAccountChat fail, is photo account");
            env.a(i17, o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.C12217xd42a4cc6 c12217xd42a4cc6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.C12217xd42a4cc6();
        c12217xd42a4cc6.d(optString);
        c12217xd42a4cc6.c(optInt);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.d(env, i17, this, optString2, optInt, optString);
        android.content.Context mo50352x76847179 = env.mo50352x76847179();
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(mo50352x76847179, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12217xd42a4cc6, dVar, null);
    }
}
