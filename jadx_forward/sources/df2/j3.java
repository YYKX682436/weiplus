package df2;

/* loaded from: classes3.dex */
public final class j3 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f311981m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311981m = "FinderLiveRecommendProductController";
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        dk2.ef efVar = dk2.ef.f314905a;
        dk2.ef.f314925k.f(41);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).a8()) {
            dk2.tb tbVar = dk2.ef.f314925k;
            tbVar.f(41);
            tbVar.e(41, new r45.sc2(), new df2.i3(this, r45.tc2.class), false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311981m, "startPolling liveStarted:" + ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).a8());
        }
    }
}
