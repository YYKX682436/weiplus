package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 f289402d;

    public m5(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var) {
        this.f289402d = o5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = this.f289402d;
        yf5.n m17 = o5Var.m("message_fold");
        if (m17 != null) {
            if (m17.f543463q.getTop() > o5Var.f289469s || m17.f543463q.getTop() <= o5Var.f289468r) {
                o5Var.w(false);
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            o5Var.w(true);
        }
    }
}
