package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class am implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.em f187845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f187846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f187847f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f187848g;

    public am(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.em emVar, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var) {
        this.f187845d = emVar;
        this.f187846e = z17;
        this.f187847f = abstractC14490x69736cb5;
        this.f187848g = s0Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        boolean z17 = this.f187846e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.em emVar = this.f187845d;
        if (m75939xb282bd08 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(emVar.f188102s, "modifyFeedBullet: isClose = " + z17 + ", success");
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zl(z17, this.f187847f, emVar, this.f187848g));
            db5.t7.m123882x26a183b(emVar.f187954d, z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572895cv3 : com.p314xaae8f345.mm.R.C30867xcad56011.cwe, 0).show();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(emVar.f188102s, "modifyFeedBullet: isClose = " + z17 + ", resultCode = " + ret.m75939xb282bd08(1));
        db5.t7.m123882x26a183b(emVar.f187954d, z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572894cv2 : com.p314xaae8f345.mm.R.C30867xcad56011.cwd, 0).show();
    }
}
