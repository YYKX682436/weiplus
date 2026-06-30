package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class i2 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 f210879d;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var) {
        this.f210879d = m2Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSettingPrivacyUI", "modInteractCallback, ret " + ret.m75939xb282bd08(1));
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var = this.f210879d;
        if (m75939xb282bd08 != 0) {
            android.app.Activity activity = m2Var.f211027a;
            db5.t7.m123883x26a183b(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9b), 0).show();
        } else {
            g92.b bVar = g92.b.f351302e;
            m92.c cVar = new m92.c(m2Var.f211030d);
            if (req.m75939xb282bd08(27) != 0) {
                cVar.u0().set(48, java.lang.Integer.valueOf(req.m75939xb282bd08(27)));
            } else if (req.m75939xb282bd08(28) != 0) {
                cVar.u0().set(49, java.lang.Integer.valueOf(req.m75939xb282bd08(28)));
            } else {
                cVar.u0().set(40, java.lang.Integer.valueOf(req.m75939xb282bd08(23)));
            }
            bVar.C(cVar, m92.j.f406530o);
            m2Var.b();
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m2Var.f211028b).notifyDataSetChanged();
        }
        az2.f fVar = m2Var.f211031e;
        if (fVar != null) {
            fVar.b();
        }
    }
}
