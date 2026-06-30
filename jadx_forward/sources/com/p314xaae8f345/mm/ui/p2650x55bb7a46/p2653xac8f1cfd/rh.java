package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class rh extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f281389e = null;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f281390f;

    public rh() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f281390f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.MusicComponent$1
            {
                this.f39173x3fe91575 = -1155728636;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
                yb5.d dVar;
                int i17 = c5722xb16ab0f4.f136045g.f88569b;
                if ((i17 != 0 && i17 != 1 && i17 != 2 && i17 != 3 && i17 != 4 && i17 != 7) || (dVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rh.this.f280113d) == null) {
                    return false;
                }
                dVar.J();
                return false;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        this.f281390f.mo48813x58998cd();
        if (!(this.f280113d != null ? !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0.x()) : false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MusicComponent", "onChattingEnterAnimEnd not init");
            return;
        }
        qk.g9 bj6 = ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).bj();
        java.lang.String Vi = bj6 == null ? null : ((rk4.z8) bj6).Vi(0);
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Vi) || Vi.equals(this.f281389e)) && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f281389e) || this.f281389e.equals(Vi))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicComponent", "onChattingEnterAnimEnd playingMsgId: %s, last: %s", Vi, this.f281389e);
        yb5.d dVar = this.f280113d;
        if (dVar != null) {
            dVar.J();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        this.f281390f.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        this.f281390f.mo48814x2efc64();
        try {
            qk.g9 bj6 = ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).bj();
            if (bj6 != null) {
                this.f281389e = ((rk4.z8) bj6).Vi(0);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MusicComponent", e17, "getPlayingMusicId exception", new java.lang.Object[0]);
        }
    }
}
