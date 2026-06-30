package tj1;

/* loaded from: classes7.dex */
public final class z extends nh1.a {

    /* renamed from: b, reason: collision with root package name */
    public final nh1.c f501256b;

    public z(nh1.c cVar) {
        super(37);
        this.f501256b = cVar;
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, db5.g4 menu, java.lang.String str) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b pageView = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0 p07 = pageView.mo32091x9a3f0ba2().p0(tj1.a.class, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p07);
        tj1.k kVar = ((tj1.a) p07).f501222d;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_action_note", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(context));
        int ordinal = kVar.ordinal();
        nh1.c cVar = this.f501256b;
        if (ordinal == 0) {
            menu.g(37, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m4p), com.p314xaae8f345.mm.R.raw.f78489xa4e92878);
            if (cVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.a) cVar).a(context, pageView, menu, str, bundle);
                return;
            }
            return;
        }
        if (ordinal != 1) {
            return;
        }
        menu.g(37, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lyb), com.p314xaae8f345.mm.R.raw.f78440x99850f5f);
        if (cVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.a) cVar).a(context, pageView, menu, str, bundle);
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b pageView = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_action_note", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(context));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0 p07 = pageView.mo32091x9a3f0ba2().p0(tj1.a.class, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p07);
        tj1.k kVar = ((tj1.a) p07).f501222d;
        if (kVar == tj1.k.f501232g) {
            tj1.o oVar = new tj1.o();
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y v37 = pageView.v3();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v37, "getService(...)");
            oVar.x(v37, 1);
            bundle.putInt("key_override_action", 70);
        } else if (kVar == tj1.k.f501231f) {
            tj1.f fVar = tj1.f.f501226a;
            ze.n mo32091x9a3f0ba2 = pageView.mo32091x9a3f0ba2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo32091x9a3f0ba2, "getRuntime(...)");
            fVar.a(mo32091x9a3f0ba2);
        }
        if (this.f501256b != null) {
            int i17 = bundle.getInt("key_override_action", 0);
            java.lang.String mo48798x74292566 = pageView.mo48798x74292566();
            java.lang.String X1 = pageView.X1();
            if (i17 <= 0) {
                i17 = 69;
            }
            int i18 = i17;
            java.lang.String string = bundle.getString("key_action_note", "");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(mo48798x74292566, X1, i18, string == null ? "" : string, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1, 0);
        }
    }
}
