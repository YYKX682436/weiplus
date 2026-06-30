package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420;

/* loaded from: classes12.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.k0 f134286d;

    public j0(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.k0 k0Var) {
        this.f134286d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        oj.j.c(this.f134286d.f134288d.f134293e, "run check task", new java.lang.Object[0]);
        if (!this.f134286d.f134288d.a()) {
            this.f134286d.f134288d.f134292d = 0;
            return;
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.l0 l0Var = this.f134286d.f134288d;
        if (l0Var.f134295g != -1) {
            int i17 = l0Var.f134292d;
            l0Var.f134292d = i17 + 1;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.l0 l0Var2 = this.f134286d.f134288d;
            if (i17 >= l0Var2.f134295g) {
                oj.j.c(l0Var2.f134293e, "paused polling check", new java.lang.Object[0]);
                return;
            }
        }
        long a17 = this.f134286d.f134288d.c().a();
        oj.j.c(this.f134286d.f134288d.f134293e, "need recheck: next " + a17, new java.lang.Object[0]);
        this.f134286d.f134288d.d().postDelayed(this, a17);
    }
}
