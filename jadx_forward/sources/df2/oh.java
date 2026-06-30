package df2;

/* loaded from: classes3.dex */
public final class oh extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f312500m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312500m = "Finder.LiveFloatMsgDanmakuController";
    }

    public final void Z6(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        boolean R6 = ((mm2.j2) m56788xbba4bfc0(mm2.j2.class)).R6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312500m, "tryGetFloatMsgConfig: source=" + source + ", enablePostFloatMsg=" + R6);
        if (R6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new df2.nh(this, null), 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312500m, "onLiveActivate!");
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312500m, "onLiveDeactivate!");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        boolean z17 = pm0.v.z(hc1Var != null ? (int) hc1Var.m75942xfb822ef2(42) : 0, 16);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312500m, "onLiveStart enableGetConfigImmediate:" + z17 + '!');
        if (z17) {
            Z6("onLiveStart");
        }
    }
}
