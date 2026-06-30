package vf2;

/* loaded from: classes3.dex */
public final class t extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f517892m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f517892m = new vf2.r(this);
    }

    public static final boolean Z6(vf2.t tVar) {
        boolean T7 = ((mm2.c1) tVar.m56788xbba4bfc0(mm2.c1.class)).T7();
        boolean f76 = ((mm2.e1) tVar.m56788xbba4bfc0(mm2.e1.class)).f7();
        boolean z17 = !T7 && f76;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorScreenCastUnexpectedFixController", "#isNeedBlockCamera isLiveBefore=" + T7 + " isScreenCastGameMode=" + f76 + " isNeedBlock=" + z17);
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        super.mo8997x8001c97e();
        dk2.ef efVar = dk2.ef.f314905a;
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var != null) {
            yz5.a l17 = this.f517892m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l17, "l");
            ((java.util.ArrayList) w0Var.E1).add(l17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new vf2.s(this, null), 3, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        dk2.ef efVar = dk2.ef.f314905a;
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var != null) {
            yz5.a l17 = this.f517892m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l17, "l");
            ((java.util.ArrayList) w0Var.E1).remove(l17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        if (((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorScreenCastUnexpectedFixController", "#onLiveStart isScreenCastGameMode, stopPreview now");
            dk2.ef efVar = dk2.ef.f314905a;
            tn0.w0 w0Var = dk2.ef.f314911d;
            if (w0Var != null) {
                w0Var.H0();
            }
        }
    }
}
