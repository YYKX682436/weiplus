package com.tencent.mm.booter;

/* loaded from: classes9.dex */
public class l2 implements com.tencent.mm.sdk.platformtools.a4 {
    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        try {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.m1((java.lang.Boolean) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_IS_IN_SHAKEUI_BOOLEAN, null), false));
            java.util.List<java.lang.String> e17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().e();
            if (e17 != null) {
                for (java.lang.String str : e17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PostTaskStartRangeForIBeacon", "op=false,isInShakeUI:" + valueOf + ",iBeacon = %s", str);
                    com.tencent.mm.autogen.events.ExDeviceIBeaconRangingEvent exDeviceIBeaconRangingEvent = new com.tencent.mm.autogen.events.ExDeviceIBeaconRangingEvent();
                    am.d6 d6Var = exDeviceIBeaconRangingEvent.f54143g;
                    d6Var.f6434a = str;
                    d6Var.f6435b = false;
                    if (!valueOf.booleanValue()) {
                        exDeviceIBeaconRangingEvent.e();
                    }
                }
                r45.wx3 wx3Var = new r45.wx3();
                wx3Var.f389553d = com.tencent.mm.booter.m2.f63437b;
                wx3Var.f389554e = com.tencent.mm.booter.m2.f63438c;
                long k17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_SHOP_ID_LONG, null), 0L);
                java.util.Map map = com.tencent.mm.booter.m2.f63440e;
                if (((java.util.concurrent.ConcurrentHashMap) map).size() > 0 && !com.tencent.mm.booter.m2.f63442g.booleanValue()) {
                    java.util.List list = com.tencent.mm.booter.m2.f63441f;
                    if (((java.util.concurrent.CopyOnWriteArrayList) list).size() > 0) {
                        com.tencent.mm.booter.m2.f63442g = java.lang.Boolean.TRUE;
                        w11.i0 i0Var = new w11.i0(list, k17, wx3Var);
                        ((java.util.concurrent.CopyOnWriteArrayList) list).size();
                        list.toString();
                        c01.d9.e().a(1708, new com.tencent.mm.booter.k2(this, i0Var));
                        c01.d9.e().g(i0Var);
                        ((java.util.concurrent.ConcurrentHashMap) map).clear();
                        ((java.util.concurrent.CopyOnWriteArrayList) com.tencent.mm.booter.m2.f63441f).clear();
                        com.tencent.mm.booter.m2.f63445j.dead();
                    }
                }
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, "");
                ((java.util.concurrent.ConcurrentHashMap) map).clear();
                ((java.util.concurrent.CopyOnWriteArrayList) com.tencent.mm.booter.m2.f63441f).clear();
                com.tencent.mm.booter.m2.f63445j.dead();
            }
            return false;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PostTaskStartRangeForIBeacon", e18.getMessage());
            return false;
        }
    }
}
