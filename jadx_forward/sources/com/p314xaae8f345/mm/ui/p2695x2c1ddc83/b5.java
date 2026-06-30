package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class b5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 f289010d;

    public b5(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var) {
        this.f289010d = o5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yf5.m c17;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = this.f289010d;
        if (o5Var.B) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FolderHelper", "performAllExpand, animation not executed, reset state");
            o5Var.B = false;
            if (o5Var.K.getAndSet(false)) {
                yf5.j0 j0Var = o5Var.f289457d;
                if (j0Var != null && (c17 = ((yf5.w0) j0Var).c()) != null) {
                    c17.b();
                }
                o5Var.f289472v = false;
            }
        }
    }
}
