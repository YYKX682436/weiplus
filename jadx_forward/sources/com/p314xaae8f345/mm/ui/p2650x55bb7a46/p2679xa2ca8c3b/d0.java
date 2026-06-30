package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 f285287d;

    public d0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
        this.f285287d = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var = this.f285287d;
        java.lang.Object tag = g0Var.f39501x4004bbf3.getTag(com.p314xaae8f345.mm.R.id.bpk);
        if (tag != null && !((java.lang.Boolean) tag).booleanValue()) {
            g0Var.f39501x4004bbf3.setVisibility(8);
        } else {
            g0Var.f39501x4004bbf3.setVisibility(0);
            g0Var.f39501x4004bbf3.setTag(com.p314xaae8f345.mm.R.id.bpk, java.lang.Boolean.TRUE);
        }
    }
}
