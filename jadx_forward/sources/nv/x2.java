package nv;

/* loaded from: classes11.dex */
public class x2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public x2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5713xf4e10b78 c5713xf4e10b78 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5713xf4e10b78) abstractC20979x809547d1;
        if (c5713xf4e10b78 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCore", "receive MsgSynchronizeABTestEvent.");
            com.p314xaae8f345.mm.p2621x8fb0427b.c z07 = com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.Ai().z0("100224");
            if (z07.m77959x7b953cf2()) {
                java.util.Map t07 = z07.t0();
                vi3.b.f519087a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) t07.get("SyncOpen"), 0);
                vi3.b.f519088b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) t07.get("WindowsVersion"), 1644429312);
                vi3.b.f519089c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) t07.get("MacVersion"), 302122240);
                vi3.b.f519090d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) t07.get("MsgSyncSessionCount"), 50);
                vi3.b.f519091e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) t07.get("MsgSyncMsgCount"), 20);
                vi3.b.f519092f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) t07.get("MsgSyncSessionListCount"), 100);
                vi3.b.f519093g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) t07.get("MsgSyncTimeLimit"), 3);
                vi3.b.f519094h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) t07.get("MsgSyncAfterSleepSwitch"), 1);
                vi3.b.f519095i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) t07.get("MsgSyncGetMoreSwitch"), 1);
                vi3.b.f519096j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) t07.get("MsgSyncGetMoreMaxMsgCount"), 1000);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSynchronizeConstants", "initMsgSynchronizeAbtest, SYNC_CLOSE:%d, WINDOWS_VERSION:%d, MAC_VERSION:%d, SESSION_COUNT:%d, MSG_COUNT%d, MSG_LIST_COUNT:%d, TIME_LIMIT:%d, AFTER_SLEEP_SWITCH:%d, GET_MORE_SWITCH:%d, GET_MORE_MAX_MSG_COUNT:%d", java.lang.Integer.valueOf(vi3.b.f519087a), java.lang.Integer.valueOf(vi3.b.f519088b), java.lang.Integer.valueOf(vi3.b.f519089c), java.lang.Integer.valueOf(vi3.b.f519090d), java.lang.Integer.valueOf(vi3.b.f519091e), java.lang.Integer.valueOf(vi3.b.f519092f), java.lang.Integer.valueOf(vi3.b.f519093g), java.lang.Integer.valueOf(vi3.b.f519094h), java.lang.Integer.valueOf(vi3.b.f519095i), java.lang.Integer.valueOf(vi3.b.f519096j));
            int i17 = vi3.b.f519087a;
            am.yj yjVar = c5713xf4e10b78.f136034g;
            yjVar.f89998a = i17;
            yjVar.f89999b = vi3.b.f519088b;
            yjVar.f90000c = vi3.b.f519089c;
        }
        return false;
    }
}
