package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class to implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f192118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14119xff3e467 f192119e;

    public to(java.lang.Boolean bool, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14119xff3e467 activityC14119xff3e467) {
        this.f192118d = bool;
        this.f192119e = activityC14119xff3e467;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.xo4 req = (r45.xo4) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchNotRecClick isChecked:");
        java.lang.Boolean bool = this.f192118d;
        sb6.append(bool);
        sb6.append(" onModifyResult: ret = ");
        sb6.append(ret.m75939xb282bd08(1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OccupyFinderUI31", sb6.toString());
        if (ret.m75939xb282bd08(1) != 0) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.so(this.f192119e, bool));
        }
    }
}
