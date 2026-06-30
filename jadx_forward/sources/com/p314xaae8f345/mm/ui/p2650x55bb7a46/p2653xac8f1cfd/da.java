package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.o0.class)
/* loaded from: classes9.dex */
public class da extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f280465e = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21660x10aa7a44(this, com.p314xaae8f345.mm.app.a0.f134821d);

    /* renamed from: f, reason: collision with root package name */
    public a85.b f280466f;

    public static com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 m0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var.C2()) {
            return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).M(f9Var);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.y4 y4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.y4(f9Var.j());
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null) {
            v17 = new ot0.q();
            v17.f430231q = y4Var.f277889d;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430231q) || v17.f430231q.equals("-1")) {
            return null;
        }
        return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(v17.f430231q);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.EmojiComponent", "[onChattingEnterAnimEnd]");
        this.f280465e.mo48813x58998cd();
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z9(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.EmojiComponent", "[onComponentUnInstall]");
        this.f280465e.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.EmojiComponent", "[onChattingExitAnimStart]");
        this.f280465e.mo48814x2efc64();
    }

    @Override // yn.d
    public void R(android.content.res.Configuration configuration) {
        a85.b bVar = this.f280466f;
        if (bVar == null || !bVar.isShowing()) {
            return;
        }
        this.f280466f.dismiss();
        this.f280466f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n0(android.view.MenuItem r26, yb5.d r27, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r28) {
        /*
            Method dump skipped, instructions count: 1502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.da.n0(android.view.MenuItem, yb5.d, com.tencent.mm.storage.f9):boolean");
    }

    public boolean o0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.EmojiComponent", "[resendEmoji] %d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        if (f9Var.C2()) {
            if (c01.d9.b().E()) {
                if (!this.f280113d.x().equals("medianote")) {
                    ((e21.z0) c01.d9.b().w()).c(new e21.n(f9Var.Q0(), f9Var.I0()));
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ic.c(f9Var);
            } else {
                db5.t7.k(this.f280113d.g(), this.f280113d.f542250l.m78646xc2a54588());
            }
            return true;
        }
        if (!f9Var.m2()) {
            return false;
        }
        if (!this.f280113d.x().equals("medianote")) {
            ((e21.z0) c01.d9.b().w()).c(new e21.n(f9Var.Q0(), f9Var.I0()));
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ic.a(f9Var);
        this.f280113d.L(true);
        return true;
    }
}
