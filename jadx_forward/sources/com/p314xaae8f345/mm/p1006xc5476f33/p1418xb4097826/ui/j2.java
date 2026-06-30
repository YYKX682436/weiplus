package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class j2 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 f210910d;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var) {
        this.f210910d = m2Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSettingPrivacyUI", "modNotRecommendInfo, ret " + ret.m75939xb282bd08(1));
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var = this.f210910d;
        if (m75939xb282bd08 != 0) {
            android.app.Activity activity = m2Var.f211027a;
            db5.t7.m123883x26a183b(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9b), 0).show();
        } else {
            if (req.m75939xb282bd08(15) == 1 || req.m75939xb282bd08(15) == 4) {
                g92.b bVar = g92.b.f351302e;
                m92.b j37 = g92.a.j3(bVar, m2Var.f211030d, false, 2, null);
                int i17 = j37 != null ? j37.f68698x26b1b2e8 : 0;
                m92.c cVar = new m92.c(m2Var.f211030d);
                cVar.f68698x26b1b2e8 = i17 | 1024;
                cVar.u0().set(38, (r45.pk2) req.m75936x14adae67(25));
                bVar.C(cVar, m92.j.f406530o);
            } else {
                g92.b bVar2 = g92.b.f351302e;
                m92.b j38 = g92.a.j3(bVar2, m2Var.f211030d, false, 2, null);
                int i18 = j38 != null ? j38.f68698x26b1b2e8 : 0;
                m92.c cVar2 = new m92.c(m2Var.f211030d);
                cVar2.f68698x26b1b2e8 = i18 & (-1025);
                cVar2.u0().set(38, (r45.pk2) req.m75936x14adae67(25));
                bVar2.C(cVar2, m92.j.f406530o);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m2Var.f211028b).h("settings_recommend_info");
            if (h17 != null) {
                r45.pk2 pk2Var = (r45.pk2) req.m75936x14adae67(25);
                h17.H(m2Var.a(java.lang.Integer.valueOf(pk2Var != null ? pk2Var.m75939xb282bd08(0) : 0)));
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m2Var.f211028b).notifyDataSetChanged();
        }
        az2.f fVar = m2Var.f211031e;
        if (fVar != null) {
            fVar.b();
        }
    }
}
