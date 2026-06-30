package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class zg implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f211636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15066x6f77678c f211637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f211638f;

    public zg(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15066x6f77678c activityC15066x6f77678c, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe) {
        this.f211636d = z17;
        this.f211637e = activityC15066x6f77678c;
        this.f211638f = c21541x1c1b08fe;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ki2 req = (r45.ki2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchQQMusic isChecked:");
        boolean z17 = this.f211636d;
        sb6.append(z17);
        sb6.append(" onModifyResult: ret = ");
        sb6.append(ret.m75939xb282bd08(1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSettingInfoUI", sb6.toString());
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15066x6f77678c activityC15066x6f77678c = this.f211637e;
        if (m75939xb282bd08 != 0) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.yg(this.f211638f, z17, activityC15066x6f77678c));
            return;
        }
        r45.nc4 nc4Var = activityC15066x6f77678c.f210257f;
        if (nc4Var != null) {
            if (req.m75939xb282bd08(0) == 1) {
                nc4Var.set(31, java.lang.Integer.valueOf(nc4Var.m75939xb282bd08(31) | 1));
            } else {
                nc4Var.set(31, java.lang.Integer.valueOf(nc4Var.m75939xb282bd08(31) & (-2)));
            }
        }
    }
}
