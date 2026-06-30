package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public final class kj0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk0 {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f194796t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj0(android.view.ViewGroup rootContainer, qo0.c statusMonitor) {
        super(rootContainer, statusMonitor);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootContainer, "rootContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194796t = "FinderLiveVisitorMusicSingSongListPlugin";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (status != qo0.b.f446948t2) {
            super.M0(status, bundle);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f194796t, "statusChange - OLD_SONG_LIST_SHOW (forced, bypass isAvailable)");
        K0(0);
        te2.kc kcVar = this.f196741p;
        if (kcVar != null) {
            ((te2.jc) kcVar).m();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk0
    public te2.kc t1() {
        android.content.Context context = this.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new te2.y9(context, S0(), this.f194858g, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk0
    public te2.lc u1(android.view.View root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return new te2.fa(root, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, S0(), this.f196741p);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk0
    public java.lang.String v1() {
        return this.f194796t;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk0
    public boolean w1() {
        boolean z17 = !((mm2.m6) S0().a(mm2.m6.class)).f410781p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f194796t, "isAvailable - " + z17);
        return z17;
    }
}
