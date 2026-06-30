package df2;

/* loaded from: classes3.dex */
public final class n5 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f312366m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f312367n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public final void Z6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGestureEffectAnchorEnableController", "#setEnable=" + this.f312367n);
        if (z17 != this.f312367n) {
            this.f312367n = z17;
            if (z17) {
                this.f312366m = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new df2.l5(this, null), 3, null);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new df2.m5(this, null), 3, null);
            }
        }
    }

    @Override // if2.e
    /* renamed from: onActivityResult */
    public void mo57866x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (1003 == i17 && i18 == -1) {
            Z6(df2.d6.f311477n.c(getStore().getLiveRoomData()));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        Z6(df2.d6.f311477n.c(getStore().getLiveRoomData()));
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
    }
}
