package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes13.dex */
public final class a3 extends com.p314xaae8f345.mm.p971x6de15a2e.g0 {

    /* renamed from: e, reason: collision with root package name */
    public int f153496e = 4;

    /* renamed from: f, reason: collision with root package name */
    public int f153497f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.RemoteCallbackList f153498g = new android.os.RemoteCallbackList();

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f153499h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p971x6de15a2e.z2(this), false);

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.h0
    public int Wh() {
        int i17 = 0 > com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(0L) ? 5 : this.f153496e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkEvent", "getNowStatus = %d", java.lang.Integer.valueOf(i17));
        return i17;
    }

    public void d(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkEvent", "networkChange : %d", java.lang.Integer.valueOf(i17));
        int i18 = this.f153496e;
        boolean z17 = false;
        if (i17 != i18) {
            if (3 == i17) {
                if (i18 == 2) {
                    this.f153496e = i17;
                    z17 = true;
                }
            } else if (2 != i17) {
                if (4 == i17) {
                    this.f153497f = 0;
                    this.f153496e = 4;
                } else {
                    if (android.os.Build.VERSION.SDK_INT >= 26 && i17 == -1) {
                        this.f153496e = 0;
                    }
                    this.f153496e = i17;
                }
                z17 = true;
            } else if (i18 != 0 && i18 != 1) {
                int i19 = this.f153497f + 1;
                this.f153497f = i19;
                if (i19 >= 1) {
                    this.f153496e = 2;
                    z17 = true;
                }
                this.f153496e = i17;
                z17 = true;
            }
        }
        if (z17) {
            int i27 = this.f153496e;
            if (i27 == 0 || i27 == 4 || i27 == 6) {
                this.f153499h.c(1000L, 1000L);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.h0
    public boolean q5(com.p314xaae8f345.mm.p971x6de15a2e.s0 s0Var) {
        try {
            this.f153498g.register(s0Var);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetworkEvent", "addListener %s", e17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetworkEvent", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return true;
        }
    }
}
