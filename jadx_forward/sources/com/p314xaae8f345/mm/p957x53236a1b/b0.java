package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes9.dex */
public class b0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152821d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f152822e;

    public b0(boolean z17) {
        android.net.NetworkInfo networkInfo;
        com.p314xaae8f345.mm.p957x53236a1b.a0 a0Var = new com.p314xaae8f345.mm.p957x53236a1b.a0();
        this.f152822e = a0Var;
        o45.ch chVar = (o45.ch) a0Var.mo47979x2d63726f();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!r75.d.f474794h) {
            networkInfo = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40058x63929c60(context);
        } else if (r75.d.f474789c == null) {
            networkInfo = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40058x63929c60(context);
            r75.d.f474789c = networkInfo;
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetWorkCache", "getActiveNetworkInfoFromCache");
            networkInfo = r75.d.f474789c;
        }
        int i17 = 0;
        if (networkInfo != null) {
            try {
                int subtype = networkInfo.getSubtype();
                if (networkInfo.getType() != 1) {
                    if (subtype == 13 || subtype == 15 || subtype == 14) {
                        i17 = 4;
                    } else if (subtype == 3 || subtype == 4 || subtype == 5 || subtype == 6 || subtype == 12) {
                        i17 = 3;
                    } else if (subtype == 1 || subtype == 2) {
                        i17 = 2;
                    }
                }
            } catch (java.lang.Exception e17) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BgFgBase", "getNetType: %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
            i17 = 1;
        }
        chVar.f424445a = i17;
        chVar.f424446b = z17 ? 1 : 2;
    }

    public static void H(boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(gm0.j1.a());
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBgFg", "summerbgfg setBgFgForMuteRoom isFg[%s], accHasReady[%s] stack[%s]", valueOf, valueOf2, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (gm0.j1.a()) {
            if (c01.d9.e() == null || c01.d9.e().f152297d == null || c01.d9.e().f152297d.G() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBgFg", "summerbgfg setBgFgForMuteRoom push not rready");
                return;
            }
            c01.d9.e().f152297d.G().I0(z17);
            if (z17) {
                c01.d9.e().g(new com.p314xaae8f345.mm.p957x53236a1b.b0(true));
                return;
            }
            int i17 = x51.o1.f533574J;
            if (i17 == -1) {
                i17 = 0;
                try {
                    i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("MuteRoomDisable"), 0);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneBgFg", e17, "", new java.lang.Object[0]);
                }
            }
            boolean z19 = z65.c.f551988a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBgFg", "somr DynamicConfig checkBit:%d TestMuteRoomEnable:%d muteRoomDisable:%d fg:%b", 1, java.lang.Integer.valueOf(x51.o1.f533574J), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z19));
            c01.d9.e().g(new com.p314xaae8f345.mm.p957x53236a1b.b0((1 & i17) == 0 ? z19 : true));
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152821d = u0Var;
        return mo9409x10f9447a(sVar, this.f152822e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        int i27 = ((o45.dh) v0Var.mo13821x7f35c2d1()).f424453a.f458575d;
        this.f152821d.mo815x76e0bfae(i18, i19, str, this);
    }
}
