package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f;

/* loaded from: classes7.dex */
public final class v extends nh1.a {
    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.r(null);
    }

    public v() {
        super(32);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 pageView = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.d(pageView) || str == null || !ti1.c.a(pageView.mo32091x9a3f0ba2())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegateGameLive", "gameLive is not permitted according to the configuration from back");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(pageView.mo32091x9a3f0ba2().S2(false).qe("gameLive"), false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegateGameLive", "gameLive is not permitted due to the develop_config");
            return;
        }
        ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).getClass();
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433702e, null, 0, null, 14, null), p60.q.class, null);
        java.lang.Boolean Bi = ((p60.u) ((p60.x) i95.n0.c(p60.x.class))).Bi(str, pageView.mo32091x9a3f0ba2().u0().f158814g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegateGameLive", "show the gameLive menu, isLiving:" + Bi + ", 1 is finish 0 is start");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        h63.v0 v0Var = (h63.v0) ((h63.r1) i95.n0.c(h63.r1.class));
        v0Var.f360825n = 5;
        v0Var.f360826o = currentTimeMillis;
        ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).Bi(1);
        if (g4Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Bi);
            g4Var.n(this.f418617a, context.getString(Bi.booleanValue() ? com.p314xaae8f345.mm.R.C30867xcad56011.f572168a25 : com.p314xaae8f345.mm.R.C30867xcad56011.a28), com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79165x9ee30c19, i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560629pv)), i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560629pv));
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 pageView = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).Bi(2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(pageView.mo48798x74292566(), pageView.X1(), 49, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1, 0);
        if (str == null) {
            return;
        }
        java.lang.Boolean Bi = ((p60.u) ((p60.x) i95.n0.c(p60.x.class))).Bi(str, pageView.mo32091x9a3f0ba2().u0().f158814g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Bi);
        if (Bi.booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegateGameLive", "click the gameLive menu, isLiving:" + Bi + ", 1 is exitGameLive 0 is send event");
            h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
            java.lang.String mo48798x74292566 = pageView.mo48798x74292566();
            int i17 = pageView.mo32091x9a3f0ba2().u0().f158814g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.t[] tVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.t.f167522d;
            ((h63.v0) r1Var).Ai(mo48798x74292566, i17, context, 1, null);
            return;
        }
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE.T) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegateGameLive", "is voip talking");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            u1Var.g(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.a0x));
            u1Var.l(null);
            u1Var.a(true);
            u1Var.q(false);
            return;
        }
        if (!(tb1.b.f498422a.a().length == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegateGameLive", "is using camera");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            u1Var2.g(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.a0w));
            u1Var2.l(null);
            u1Var2.a(true);
            u1Var2.q(false);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.s();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u[] uVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u.f167525d;
        sVar.t(kz5.b1.e(new jz5.l("event", 4)));
        sVar.v(pageView.mo32091x9a3f0ba2().C0(), pageView.mo50260x9f1221c2());
        sVar.m();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(str, pageView.X1(), 49, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1, 0);
    }
}
