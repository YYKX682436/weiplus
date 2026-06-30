package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class y9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f104998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104999f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f105000g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f105001h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f105002i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(in5.s0 s0Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.convert.qe qeVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, kotlin.jvm.internal.h0 h0Var2, long j17) {
        super(0);
        this.f104997d = s0Var;
        this.f104998e = h0Var;
        this.f104999f = qeVar;
        this.f105000g = baseFinderFeed;
        this.f105001h = h0Var2;
        this.f105002i = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in5.s0 s0Var = this.f104997d;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.h6i);
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) s0Var.p(com.tencent.mm.R.id.h6j);
        r45.zu0 zu0Var = (r45.zu0) this.f104998e.f310123d;
        if (zu0Var != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed item = this.f105000g;
            kotlin.jvm.internal.o.f(item, "$item");
            java.lang.String userName = item.getFeedObject().getUserName();
            com.tencent.mm.plugin.finder.convert.qe qeVar = this.f104999f;
            if (ro2.r.a(qeVar, item, 1, userName, zu0Var)) {
                android.animation.AnimatorSet animatorSet = qeVar.f104366q;
                if (!(animatorSet != null && animatorSet.isRunning())) {
                    int integer = zu0Var.getInteger(0);
                    com.tencent.mm.plugin.finder.convert.qe qeVar2 = this.f104999f;
                    in5.s0 s0Var2 = this.f104997d;
                    kotlin.jvm.internal.o.d(p17);
                    ro2.r.d(qeVar2, s0Var2, p17, mMPAGView, 1, integer, true);
                    r45.bc1 bc1Var = new r45.bc1();
                    bc1Var.set(0, 1);
                    bc1Var.set(1, java.lang.Integer.valueOf(integer));
                    bc1Var.set(2, java.lang.Long.valueOf(this.f105002i));
                    bc1Var.set(3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    this.f105001h.f310123d = bc1Var;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
