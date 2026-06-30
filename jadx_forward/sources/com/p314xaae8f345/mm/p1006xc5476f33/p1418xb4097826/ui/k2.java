package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class k2 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 f210943d;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var) {
        this.f210943d = m2Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSettingPrivacyUI", "modShowFinderAtWxProfile, ret " + ret.m75939xb282bd08(1));
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var = this.f210943d;
        if (m75939xb282bd08 != 0) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m2Var.f211028b).h("settings_show_my_finder");
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = h17 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17 : null;
            if (c21541x1c1b08fe == null) {
                return;
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.app.Activity context = m2Var.f211027a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            m92.b j37 = g92.a.j3(g92.b.f351302e, xy2.c.e(context), false, 2, null);
            c21541x1c1b08fe.O(((j37 != null ? j37.f68698x26b1b2e8 : 0) & 262144) != 0);
            db5.t7.m123883x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9b), 0).show();
        }
        az2.f fVar = m2Var.f211031e;
        if (fVar != null) {
            fVar.b();
        }
    }
}
