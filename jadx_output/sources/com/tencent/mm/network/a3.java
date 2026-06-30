package com.tencent.mm.network;

/* loaded from: classes13.dex */
public final class a3 extends com.tencent.mm.network.g0 {

    /* renamed from: e, reason: collision with root package name */
    public int f71963e = 4;

    /* renamed from: f, reason: collision with root package name */
    public int f71964f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.RemoteCallbackList f71965g = new android.os.RemoteCallbackList();

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f71966h = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.network.z2(this), false);

    @Override // com.tencent.mm.network.h0
    public int Wh() {
        int i17 = 0 > com.tencent.mm.sdk.platformtools.t8.H1(0L) ? 5 : this.f71963e;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkEvent", "getNowStatus = %d", java.lang.Integer.valueOf(i17));
        return i17;
    }

    public void d(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkEvent", "networkChange : %d", java.lang.Integer.valueOf(i17));
        int i18 = this.f71963e;
        boolean z17 = false;
        if (i17 != i18) {
            if (3 == i17) {
                if (i18 == 2) {
                    this.f71963e = i17;
                    z17 = true;
                }
            } else if (2 != i17) {
                if (4 == i17) {
                    this.f71964f = 0;
                    this.f71963e = 4;
                } else {
                    if (android.os.Build.VERSION.SDK_INT >= 26 && i17 == -1) {
                        this.f71963e = 0;
                    }
                    this.f71963e = i17;
                }
                z17 = true;
            } else if (i18 != 0 && i18 != 1) {
                int i19 = this.f71964f + 1;
                this.f71964f = i19;
                if (i19 >= 1) {
                    this.f71963e = 2;
                    z17 = true;
                }
                this.f71963e = i17;
                z17 = true;
            }
        }
        if (z17) {
            int i27 = this.f71963e;
            if (i27 == 0 || i27 == 4 || i27 == 6) {
                this.f71966h.c(1000L, 1000L);
            }
        }
    }

    @Override // com.tencent.mm.network.h0
    public boolean q5(com.tencent.mm.network.s0 s0Var) {
        try {
            this.f71965g.register(s0Var);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetworkEvent", "addListener %s", e17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.NetworkEvent", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return true;
        }
    }
}
