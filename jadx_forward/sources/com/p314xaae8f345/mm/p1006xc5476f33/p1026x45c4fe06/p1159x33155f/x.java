package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f;

/* loaded from: classes7.dex */
public final class x extends nh1.a {
    public x() {
        super(33);
    }

    @Override // nh1.a
    public boolean b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, db5.g4 g4Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 pageView = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegate_GameRewards", " attachTo ");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.d(pageView) && str != null) {
            if (ti1.c.b(pageView.mo32091x9a3f0ba2()) != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(pageView.mo32091x9a3f0ba2().S2(false).qe("gameComponent"), false)) {
                    boolean c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.l1.c(u0Var, "key_show_red_dot", false);
                    if (c17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.l1.d(u0Var, "key_show_red_dot", false);
                    }
                    java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.miq);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    android.view.MenuItem l17 = g4Var != null ? g4Var.l(this.f418617a, string, com.p314xaae8f345.mm.R.C30861xcebc809e.d5b, false) : null;
                    if (c17 && (l17 instanceof db5.h4)) {
                        ((db5.h4) l17).f309897e = true;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(pageView.mo48798x74292566(), pageView.X1(), 67, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1, 0);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegate_GameRewards", "gameRewards is not permitted due to the develop_config");
                }
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegate_GameRewards", "gameRewards is permitted isGameAppOnly or notAble");
        return true;
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 pageView = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(pageView.mo48798x74292566(), pageView.X1(), 65, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2 = pageView.mo32091x9a3f0ba2();
        if (mo32091x9a3f0ba2 == null || (C0 = mo32091x9a3f0ba2.C0()) == null) {
            return;
        }
        byte[] b17 = ti1.c.b(pageView.mo32091x9a3f0ba2());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.w();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (b17 != null) {
            if (!(b17.length == 0)) {
                r45.l63 l63Var = new r45.l63();
                l63Var.mo11468x92b714fd(b17);
                str2 = l63Var.f460702d;
                hashMap.put("bizData", str2);
                wVar.t(hashMap);
                wVar.u(C0);
                wVar.m();
            }
        }
        str2 = null;
        hashMap.put("bizData", str2);
        wVar.t(hashMap);
        wVar.u(C0);
        wVar.m();
    }
}
