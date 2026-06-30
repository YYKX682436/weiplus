package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes9.dex */
public final class w8 implements sb5.v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f289756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuChattingUIFragment f289757b;

    public w8(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuChattingUIFragment openImKefuChattingUIFragment) {
        this.f289757b = openImKefuChattingUIFragment;
    }

    @Override // sb5.v
    public void a(boolean z17) {
        if (this.f289756a) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuChattingUIFragment openImKefuChattingUIFragment = this.f289757b;
        ab5.i0 i0Var = openImKefuChattingUIFragment.P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i0Var);
        db5.d5 d5Var = i0Var.f84486f;
        if (d5Var != null) {
            d5Var.dismiss();
        }
        ab5.i0 i0Var2 = openImKefuChattingUIFragment.P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i0Var2);
        gm0.j1.e().j(new ab5.g0(i0Var2));
        this.f289756a = true;
    }
}
