package com.tencent.mm.modelsimple;

/* loaded from: classes9.dex */
public class b0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71288d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f71289e;

    public b0(boolean z17) {
        android.net.NetworkInfo networkInfo;
        com.tencent.mm.modelsimple.a0 a0Var = new com.tencent.mm.modelsimple.a0();
        this.f71289e = a0Var;
        o45.ch chVar = (o45.ch) a0Var.getReqObj();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393261h) {
            networkInfo = com.tencent.mars.comm.NetStatusUtil.getActiveNetworkInfo(context);
        } else if (r75.d.f393256c == null) {
            networkInfo = com.tencent.mars.comm.NetStatusUtil.getActiveNetworkInfo(context);
            r75.d.f393256c = networkInfo;
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            com.tencent.mars.xlog.Log.i("NetWorkCache", "getActiveNetworkInfoFromCache");
            networkInfo = r75.d.f393256c;
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
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.BgFgBase", "getNetType: %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
            i17 = 1;
        }
        chVar.f342912a = i17;
        chVar.f342913b = z17 ? 1 : 2;
    }

    public static void H(boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(gm0.j1.a());
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBgFg", "summerbgfg setBgFgForMuteRoom isFg[%s], accHasReady[%s] stack[%s]", valueOf, valueOf2, new com.tencent.mm.sdk.platformtools.z3());
        if (gm0.j1.a()) {
            if (c01.d9.e() == null || c01.d9.e().f70764d == null || c01.d9.e().f70764d.G() == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBgFg", "summerbgfg setBgFgForMuteRoom push not rready");
                return;
            }
            c01.d9.e().f70764d.G().I0(z17);
            if (z17) {
                c01.d9.e().g(new com.tencent.mm.modelsimple.b0(true));
                return;
            }
            int i17 = x51.o1.f452041J;
            if (i17 == -1) {
                i17 = 0;
                try {
                    i17 = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("MuteRoomDisable"), 0);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneBgFg", e17, "", new java.lang.Object[0]);
                }
            }
            boolean z19 = z65.c.f470455a;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBgFg", "somr DynamicConfig checkBit:%d TestMuteRoomEnable:%d muteRoomDisable:%d fg:%b", 1, java.lang.Integer.valueOf(x51.o1.f452041J), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z19));
            c01.d9.e().g(new com.tencent.mm.modelsimple.b0((1 & i17) == 0 ? z19 : true));
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71288d = u0Var;
        return dispatch(sVar, this.f71289e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 0;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        int i27 = ((o45.dh) v0Var.getRespObj()).f342920a.f377042d;
        this.f71288d.onSceneEnd(i18, i19, str, this);
    }
}
