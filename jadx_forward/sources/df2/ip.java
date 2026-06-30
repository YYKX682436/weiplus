package df2;

/* loaded from: classes3.dex */
public final class ip extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f311951m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f311952n;

    /* renamed from: o, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f311953o;

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f311954p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Long f311955q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Long f311956r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311951m = "LivePkgGiftBubbleGuideController";
        this.f311953o = new p012xc85e97e9.p093xedfae76a.j0();
        this.f311954p = new p012xc85e97e9.p093xedfae76a.j0();
    }

    public final void Z6() {
        dk2.ef efVar = dk2.ef.f314905a;
        dk2.tb tbVar = dk2.ef.f314925k;
        tbVar.f(26);
        r45.kc2 kc2Var = new r45.kc2();
        kc2Var.set(0, this.f311952n);
        tbVar.e(26, kc2Var, new df2.hp(this, r45.lc2.class), true);
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
        dk2.ef.f314925k.f(26);
        this.f311952n = null;
        this.f311955q = null;
        this.f311956r = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        Z6();
    }
}
