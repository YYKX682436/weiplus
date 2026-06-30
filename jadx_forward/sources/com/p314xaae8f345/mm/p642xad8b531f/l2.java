package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes9.dex */
public class l2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        try {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1((java.lang.Boolean) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_IS_IN_SHAKEUI_BOOLEAN, null), false));
            java.util.List<java.lang.String> e17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).a().e();
            if (e17 != null) {
                for (java.lang.String str : e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PostTaskStartRangeForIBeacon", "op=false,isInShakeUI:" + valueOf + ",iBeacon = %s", str);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5350xd063a2e4 c5350xd063a2e4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5350xd063a2e4();
                    am.d6 d6Var = c5350xd063a2e4.f135676g;
                    d6Var.f87967a = str;
                    d6Var.f87968b = false;
                    if (!valueOf.booleanValue()) {
                        c5350xd063a2e4.e();
                    }
                }
                r45.wx3 wx3Var = new r45.wx3();
                wx3Var.f471086d = com.p314xaae8f345.mm.p642xad8b531f.m2.f144970b;
                wx3Var.f471087e = com.p314xaae8f345.mm.p642xad8b531f.m2.f144971c;
                long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_SHOP_ID_LONG, null), 0L);
                java.util.Map map = com.p314xaae8f345.mm.p642xad8b531f.m2.f144973e;
                if (((java.util.concurrent.ConcurrentHashMap) map).size() > 0 && !com.p314xaae8f345.mm.p642xad8b531f.m2.f144975g.booleanValue()) {
                    java.util.List list = com.p314xaae8f345.mm.p642xad8b531f.m2.f144974f;
                    if (((java.util.concurrent.CopyOnWriteArrayList) list).size() > 0) {
                        com.p314xaae8f345.mm.p642xad8b531f.m2.f144975g = java.lang.Boolean.TRUE;
                        w11.i0 i0Var = new w11.i0(list, k17, wx3Var);
                        ((java.util.concurrent.CopyOnWriteArrayList) list).size();
                        list.toString();
                        c01.d9.e().a(1708, new com.p314xaae8f345.mm.p642xad8b531f.k2(this, i0Var));
                        c01.d9.e().g(i0Var);
                        ((java.util.concurrent.ConcurrentHashMap) map).clear();
                        ((java.util.concurrent.CopyOnWriteArrayList) com.p314xaae8f345.mm.p642xad8b531f.m2.f144974f).clear();
                        com.p314xaae8f345.mm.p642xad8b531f.m2.f144978j.mo48814x2efc64();
                    }
                }
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, "");
                ((java.util.concurrent.ConcurrentHashMap) map).clear();
                ((java.util.concurrent.CopyOnWriteArrayList) com.p314xaae8f345.mm.p642xad8b531f.m2.f144974f).clear();
                com.p314xaae8f345.mm.p642xad8b531f.m2.f144978j.mo48814x2efc64();
            }
            return false;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PostTaskStartRangeForIBeacon", e18.getMessage());
            return false;
        }
    }
}
