package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class t70 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q70 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u70 f217523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f217524f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t70(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u70 u70Var, int i17) {
        super(u70Var, i17);
        this.f217523e = u70Var;
        this.f217524f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTabPreloadUIC", "startPreload: start tabType = " + this.f217206d);
        this.f217523e.f217638e.remove(java.lang.Integer.valueOf(this.f217206d));
        pf5.u uVar = pf5.u.f435469a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 c14614xb913e379 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class);
        int i17 = this.f217524f;
        if (i17 != 39) {
            bs2.n1 R6 = c14614xb913e379.R6(i17);
            if (R6 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[performInsidePreload] tabType=");
                int i18 = R6.f105440a;
                sb6.append(i18);
                sb6.append(", cache.resp is null = ");
                bs2.b0 b0Var = R6.f105458s;
                sb6.append(b0Var.f105339b == null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(R6.f105442c, sb6.toString());
                if (b0Var.f105339b == null && ((ey2.t0) ((jz5.n) R6.f105441b.f204078g).mo141623x754a37bb()).R6(i18)) {
                    bs2.n1.r(R6, bs2.h0.f105385o, null, new bs2.u0(R6), 2, null);
                    return;
                }
                return;
            }
            return;
        }
        bs2.w wVar = c14614xb913e379.f204077f;
        if (wVar != null) {
            bs2.h0 h0Var = bs2.h0.f105385o;
            bs2.u uVar2 = bs2.u.f105485d;
            ey2.h1 h1Var = (ey2.h1) ((xy2.k) uVar.e(zy2.b6.class).c(xy2.k.class));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (!(((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209232fd).mo141623x754a37bb()).r()).booleanValue() && h1Var.O6())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.NativeDramaTabPreloadWorker", "preload: native drama disabled, source=" + h0Var);
                uVar2.mo146xb9724478(bs2.i0.f105394e);
                return;
            }
            if (!wVar.f105496a.V6(h0Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.NativeDramaTabPreloadWorker", "preload: core disabled, source=" + h0Var);
                uVar2.mo146xb9724478(bs2.i0.f105394e);
                return;
            }
            wVar.f105498c.lock();
            try {
                if (wVar.b() != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.NativeDramaTabPreloadWorker", "preload: cache still valid, source=" + h0Var);
                    uVar2.mo146xb9724478(bs2.i0.f105394e);
                } else {
                    if (!wVar.f105502g) {
                        wVar.f105502g = true;
                        wVar.f105503h = false;
                        if (wVar.a("nextPreload")) {
                            bs2.g.a(bs2.g.f105374a, 0, 0, 3, 2, false, 0, false, 115, null);
                        }
                        r45.qt2 qt2Var = new r45.qt2();
                        qt2Var.set(5, 397);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NativeDramaTabPreloadWorker", "preload: start cgi, source=" + h0Var);
                        db2.o4 o4Var = new db2.o4(qt2Var, null);
                        wVar.f105499d = o4Var;
                        wVar.f105498c.unlock();
                        o4Var.l().K(new bs2.v(wVar, uVar2, h0Var, o4Var));
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.NativeDramaTabPreloadWorker", "preload: already loading, source=" + h0Var);
                    uVar2.mo146xb9724478(bs2.i0.f105393d);
                }
            } finally {
                wVar.f105498c.unlock();
            }
        }
    }
}
