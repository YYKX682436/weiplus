package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.owners.k0 f52753d;

    public j0(com.tencent.matrix.lifecycle.owners.k0 k0Var) {
        this.f52753d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        oj.j.c(this.f52753d.f52755d.f52760e, "run check task", new java.lang.Object[0]);
        if (!this.f52753d.f52755d.a()) {
            this.f52753d.f52755d.f52759d = 0;
            return;
        }
        com.tencent.matrix.lifecycle.owners.l0 l0Var = this.f52753d.f52755d;
        if (l0Var.f52762g != -1) {
            int i17 = l0Var.f52759d;
            l0Var.f52759d = i17 + 1;
            com.tencent.matrix.lifecycle.owners.l0 l0Var2 = this.f52753d.f52755d;
            if (i17 >= l0Var2.f52762g) {
                oj.j.c(l0Var2.f52760e, "paused polling check", new java.lang.Object[0]);
                return;
            }
        }
        long a17 = this.f52753d.f52755d.c().a();
        oj.j.c(this.f52753d.f52755d.f52760e, "need recheck: next " + a17, new java.lang.Object[0]);
        this.f52753d.f52755d.d().postDelayed(this, a17);
    }
}
