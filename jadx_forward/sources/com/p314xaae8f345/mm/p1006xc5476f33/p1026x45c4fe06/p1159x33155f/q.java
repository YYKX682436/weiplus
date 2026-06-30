package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f;

/* loaded from: classes7.dex */
public final class q extends nh1.a {
    public q() {
        super(36);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 pageView = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        if (!k01.j.f384572a.b(null, str) || g4Var == null) {
            return;
        }
        g4Var.g(this.f418617a, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571558df0), com.p314xaae8f345.mm.R.raw.f78467xfe4a2ada);
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 pageView = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        if (k01.j.f384572a.b(null, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MenuDelegateGameIntroduction", "MenuDelegateGameIntroduction perform click, send event");
            le1.a aVar = new le1.a();
            aVar.t(kz5.b1.e(new jz5.l("event", 36)));
            aVar.v(pageView.mo32091x9a3f0ba2().C0(), pageView.mo50260x9f1221c2());
            aVar.m();
        }
    }
}
