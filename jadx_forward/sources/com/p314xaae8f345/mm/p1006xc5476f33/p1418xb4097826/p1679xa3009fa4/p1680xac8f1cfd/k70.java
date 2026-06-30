package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class k70 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f216461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.l70 f216462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f216463f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f216464g;

    public k70(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.l70 l70Var, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f216461d = z17;
        this.f216462e = l70Var;
        this.f216463f = s0Var;
        this.f216464g = abstractC14490x69736cb5;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        boolean z17 = this.f216461d;
        if (m75939xb282bd08 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSubtitleSettingUIC", "modifyFeedSubtitle: isClose = " + z17 + ", success");
            return;
        }
        this.f216462e.V6(this.f216463f, this.f216464g, !z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSubtitleSettingUIC", "modifyFeedSubtitle: isClose = " + z17 + ", fail");
    }
}
