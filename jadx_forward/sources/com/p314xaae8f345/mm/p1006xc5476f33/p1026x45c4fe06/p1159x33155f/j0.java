package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f;

/* loaded from: classes7.dex */
public class j0 extends nh1.a {
    public j0() {
        super(11);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var).mo32091x9a3f0ba2().l2().f169323f != 1023) {
            g4Var.h(this.f418617a, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571812qj), com.p314xaae8f345.mm.R.raw.f78518x2a52a528, 0);
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = n7Var.mo32091x9a3f0ba2().u0();
        java.lang.String str2 = u07.f128811x;
        if (context == null || android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegate_SendToDesktop", "performItemClick failed, context or username is null or nil.");
            return;
        }
        if (!n7Var.mo50262x39e05d35() || n7Var.mo32091x9a3f0ba2().L0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegate_SendToDesktop", "performItemClick failed, pageView destroyed");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195) n7Var.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.t9 t9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.t9(u07.f128812x0, c11813xf952a195.Z, u07.f158812e, c11813xf952a195.f387375e, str2);
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.m48889xc55ddd52().getBoolean("key_sendtodesktop_no_more_show_permission_notify_dialog", false);
        ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.g0 g0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.g0(this);
        ((zd0.e) hVar).getClass();
        android.util.Pair j17 = xp1.d.j(context, str, z17, true, g0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15782, j17.second, 0, str);
        int i17 = c11813xf952a195.f387385r.f156932d;
        int intValue = ((java.lang.Integer) j17.first).intValue();
        int intValue2 = ((java.lang.Integer) j17.second).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u9.f(context, t9Var, i17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.h0(this, new java.util.concurrent.atomic.AtomicBoolean(false), context, t9Var, i17, intValue, intValue2, z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(str, n7Var.X1(), 14, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1, 0);
    }
}
