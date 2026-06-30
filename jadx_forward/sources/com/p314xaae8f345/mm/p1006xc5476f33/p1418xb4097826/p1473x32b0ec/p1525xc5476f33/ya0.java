package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public final class ya0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bb0 f196710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bb0 bb0Var) {
        super(0);
        this.f196710d = bb0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kn0.p pVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bb0 bb0Var = this.f196710d;
        bb0Var.f446856d.animate().alpha(0.0f).setDuration(200L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xa0(bb0Var)).start();
        bb0Var.f193534t.d();
        android.os.Bundle bundle = new android.os.Bundle();
        boolean z17 = false;
        bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
        dk2.ef efVar = dk2.ef.f314905a;
        in0.q e17 = efVar.e();
        if (e17 != null && (pVar = e17.D) != null) {
            z17 = pVar.f391122i;
        }
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", z17);
        bb0Var.f193530p.mo46557x60d69242(qo0.b.f446899i4, bundle);
        in0.q e18 = efVar.e();
        if (e18 != null) {
            e18.L0();
        }
        return jz5.f0.f384359a;
    }
}
