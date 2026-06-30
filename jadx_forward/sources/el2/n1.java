package el2;

/* loaded from: classes3.dex */
public final class n1 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f335404m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f335405n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Integer[] f335406o;

    /* renamed from: p, reason: collision with root package name */
    public r45.y42 f335407p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17 f335408q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f335404m = "FinderLivePromoteFixedEntranceController";
        this.f335406o = new java.lang.Integer[]{4, 15, 18};
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17 c14226x69ca5d17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17(null, 1, null);
        c14226x69ca5d17.f193192e = new el2.k1(this);
        this.f335408q = c14226x69ca5d17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        dk2.ef efVar = dk2.ef.f314905a;
        dk2.ef.f314925k.f(25);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        dk2.tb tbVar = dk2.ef.f314925k;
        tbVar.f(25);
        boolean booleanValue = ((java.lang.Boolean) ae2.in.f85318j6.r()).booleanValue();
        java.lang.String str = this.f335404m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[startPolling] canAnchorShowEntrance=" + booleanValue);
        if (zl2.r4.f555483a.y1(getStore().getLiveRoomData()) && !booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[startPolling] anchor return");
            return;
        }
        r45.oc2 oc2Var = new r45.oc2();
        oc2Var.set(0, this.f335405n);
        tbVar.e(25, oc2Var, new el2.m1(this, r45.pc2.class), true);
    }
}
