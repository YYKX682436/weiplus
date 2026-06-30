package df2;

/* loaded from: classes10.dex */
public final class kh extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f312114m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312114m = "Finder.LiveEventController";
    }

    public final void Z6(long j17, int i17) {
        java.util.HashMap hashMap;
        java.lang.String str;
        dk2.ef efVar = dk2.ef.f314905a;
        km2.n nVar = dk2.ef.H;
        if (nVar == null || (hashMap = nVar.f390690i) == null || (str = (java.lang.String) hashMap.get(java.lang.Long.valueOf(j17))) == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5498x2068cb83 c5498x2068cb83 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5498x2068cb83();
        am.bc bcVar = c5498x2068cb83.f135830g;
        bcVar.f87767a = str;
        bcVar.f87768b = java.lang.Long.valueOf(j17);
        bcVar.f87769c = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312114m, "notifyBizLiveRefreshEvent exportId:" + str + ", liveId:" + j17 + ", liveStatus:" + i17);
        pm0.v.w(new df2.jh(c5498x2068cb83));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveEnd */
    public void mo56792x5aa1a970() {
        super.mo56792x5aa1a970();
        Z6(((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        r45.nw1 nw1Var;
        super.mo14863x39a513b7(hc1Var);
        if (hc1Var == null || (nw1Var = (r45.nw1) hc1Var.m75936x14adae67(3)) == null) {
            return;
        }
        Z6(nw1Var.m75942xfb822ef2(0), nw1Var.m75939xb282bd08(2));
    }
}
