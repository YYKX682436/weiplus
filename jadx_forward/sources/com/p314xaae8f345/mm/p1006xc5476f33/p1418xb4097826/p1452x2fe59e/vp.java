package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class vp implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr f192453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f192454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f192455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f192456g;

    public vp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var) {
        this.f192453d = krVar;
        this.f192454e = z17;
        this.f192455f = abstractC14490x69736cb5;
        this.f192456g = s0Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        boolean z17 = this.f192454e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar = this.f192453d;
        if (m75939xb282bd08 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(krVar.f188776t, "modifyFeedBullet: isClose = " + z17 + ", success");
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.up(z17, this.f192455f, krVar, this.f192456g));
            db5.t7.m123882x26a183b(krVar.f188763d, z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572895cv3 : com.p314xaae8f345.mm.R.C30867xcad56011.cwe, 0).show();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(krVar.f188776t, "modifyFeedBullet: isClose = " + z17 + ", resultCode = " + ret.m75939xb282bd08(1));
        db5.t7.m123882x26a183b(krVar.f188763d, z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572894cv2 : com.p314xaae8f345.mm.R.C30867xcad56011.cwd, 0).show();
    }
}
