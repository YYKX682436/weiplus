package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class c2 extends com.tencent.mm.network.j0 implements com.tencent.mm.network.o0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.g1 f71973d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mars.comm.MMWakerLock f71974e;

    /* renamed from: f, reason: collision with root package name */
    public int f71975f = 0;

    public c2(com.tencent.mm.network.g1 g1Var, com.tencent.mars.comm.MMWakerLock mMWakerLock) {
        this.f71973d = g1Var;
        this.f71974e = mMWakerLock;
    }

    @Override // com.tencent.mm.network.o0
    public void j4(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.z0 z0Var, byte[] bArr, int i27, int i28) {
        com.tencent.mm.network.g1 g1Var = this.f71973d;
        if (i27 == 252 || i27 == 701) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "summerauth IOnAutoAuth onGYNetEnd manual auth");
            if (i28 != 0 || i18 != 0) {
                jx3.f.INSTANCE.idkeyStat(148L, -102 == i19 ? 30L : 29L, 1L, false);
            } else if (z0Var.Zc() == 2) {
                jx3.f.INSTANCE.idkeyStat(148L, 28L, 1L, false);
                int i29 = this.f71975f + 1;
                this.f71975f = i29;
                if (i29 > 1) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "summerauth manualLoginDecodeFailedTry beyond 1 no more try!");
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    g1Var.T(i18, i19, "auth_decode_failed_".concat(str == null ? "" : str));
                } else {
                    z0Var.Bg(this, 0, 0);
                }
            } else {
                this.f71975f = 0;
                z0Var.G2(this, i18, i19, str);
                int uin = z0Var.getRespObj().getUin();
                if (uin != 0) {
                    ((com.tencent.mm.plugin.zero.s0) i95.n0.c(com.tencent.mm.plugin.zero.s0.class)).a(uin);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "newUin invalid");
                }
            }
        }
        if (i28 == 0 && i18 == 0) {
            z0Var.G2(this, i18, i19, str);
            int uin2 = z0Var.getRespObj().getUin();
            if (uin2 != 0) {
                ((com.tencent.mm.plugin.zero.s0) i95.n0.c(com.tencent.mm.plugin.zero.s0.class)).a(uin2);
                return;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "newUin invalid");
                return;
            }
        }
        if (-102 == i19) {
            g1Var.f71997r = i17;
            z0Var.Re(g1Var.f71993n, g1Var.f71995p, 0, 0);
            return;
        }
        if (-301 == i19) {
            z0Var.G2(this, i18, i19, str);
        } else if (-105 == i19) {
            z0Var.G2(this, i18, i19, str);
        } else if (-17 == i19) {
            z0Var.G2(this, i18, i19, str);
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        g1Var.T(i18, i19, "autoauth_errmsg_".concat(str != null ? str : ""));
    }

    @Override // com.tencent.mm.network.k0
    public void ri(com.tencent.mm.network.z0 z0Var, int i17, int i18, java.lang.String str) {
        this.f71974e.lock(com.tencent.mm.network.g1.M(), "MMAutoAuth.IOnAutoAuth.onAutoAuth");
        new com.tencent.mm.network.b2(this, 1000L, null, z0Var, i17, i18, str).a(this.f71973d.f71999t);
    }
}
