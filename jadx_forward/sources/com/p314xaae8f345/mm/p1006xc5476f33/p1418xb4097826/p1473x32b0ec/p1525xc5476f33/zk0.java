package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public final class zk0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk0 {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f196886t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk0(android.view.ViewGroup rootContainer, qo0.c statusMonitor) {
        super(rootContainer, statusMonitor);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootContainer, "rootContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196886t = "FinderLiveVisitorSingSongNewPanelPlugin";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk0
    public te2.kc t1() {
        android.content.Context context = this.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new te2.m9(context, S0(), this.f194858g, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk0
    public te2.lc u1(android.view.View root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return new te2.t9(root, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, S0(), this.f196741p);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk0
    public java.lang.String v1() {
        return this.f196886t;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk0
    public boolean w1() {
        return ((mm2.m6) S0().a(mm2.m6.class)).f410781p;
    }
}
