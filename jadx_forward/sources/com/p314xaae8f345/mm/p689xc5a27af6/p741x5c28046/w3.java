package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes.dex */
public final class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f148054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vd0 f148055e;

    public w3(android.content.Context context, int i17, int i18, r45.vd0 vd0Var) {
        this.f148054d = context;
        this.f148055e = vd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f148054d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.u3(1001, 1000);
        k0Var.f293414s = new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.v3(1001, this.f148055e, context, 1000);
        k0Var.v();
    }
}
