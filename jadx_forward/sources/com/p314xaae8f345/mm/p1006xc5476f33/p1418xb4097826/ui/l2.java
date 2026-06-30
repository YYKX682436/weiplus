package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class l2 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 f210985d;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var) {
        this.f210985d = m2Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var = this.f210985d;
        az2.f fVar = m2Var.f211031e;
        if (fVar != null) {
            fVar.b();
        }
        if (ret.m75939xb282bd08(1) != 0) {
            android.app.Activity activity = m2Var.f211027a;
            db5.t7.m123883x26a183b(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9b), 0).show();
        } else {
            g92.b bVar = g92.b.f351302e;
            m92.b j37 = g92.a.j3(bVar, m2Var.f211030d, false, 2, null);
            int i17 = j37 != null ? j37.f68698x26b1b2e8 : 0;
            int i18 = req.m75939xb282bd08(15) == 1 ? i17 | 1024 : i17 & (-1025);
            m92.c cVar = new m92.c(m2Var.f211030d);
            cVar.f68698x26b1b2e8 = i18;
            bVar.C(cVar, m92.j.f406530o);
        }
        az2.f fVar2 = m2Var.f211031e;
        if (fVar2 != null) {
            fVar2.b();
        }
    }
}
