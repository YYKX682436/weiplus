package gt;

/* loaded from: classes7.dex */
public class q5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public q5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5958x288a9f89 c5958x288a9f89 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5958x288a9f89) abstractC20979x809547d1;
        am.ns nsVar = c5958x288a9f89.f136257g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticOnSaveLocationForAppBrandReportEvent", "event.data.appId:%s, event.data.username:%s", nsVar.f88984a, nsVar.f88985b);
        am.ns nsVar2 = c5958x288a9f89.f136257g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nsVar2.f88984a) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nsVar2.f88985b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticOnSaveLocationForAppBrandReportEvent", "getAppIdByUsername get appId again");
            nsVar2.f88984a = k91.k4.e(nsVar2.f88985b);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nsVar2.f88984a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticOnSaveLocationForAppBrandReportEvent", "appId is null, delay to report location");
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50297x7c4d7ca2(new gt.p5(this, c5958x288a9f89), 5000L);
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167032a.a(c5958x288a9f89);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.b.b(nsVar2.f88984a);
        return true;
    }
}
