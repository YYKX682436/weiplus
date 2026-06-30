package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes12.dex */
public class x2 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f284068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 f284069b;

    public x2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f284069b = n3Var;
        this.f284068a = f9Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.r0
    public void S(long j17, long j18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (j17 == j18) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f284068a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[onSceneProgressEnd] MsgId:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var = this.f284069b;
            n3Var.f283898p--;
            if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.j(n3Var.f283891f, f9Var, false)) {
                n3Var.f283900r = true;
            }
            if (n3Var.e()) {
                boolean z17 = n3Var.f283900r;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = n3Var.f283899q;
                if (z17) {
                    n3Var2.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w2(this));
                } else {
                    n3Var2.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.v2(this));
                }
            }
        }
    }
}
