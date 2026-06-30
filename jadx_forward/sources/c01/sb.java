package c01;

/* loaded from: classes12.dex */
public class sb extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public sb() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5286xd13c3d86 c5286xd13c3d86 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5286xd13c3d86) abstractC20979x809547d1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StaticOnCoreNetworkReadyEventListener", "ILinkStreamSession from event:%b", java.lang.Boolean.valueOf(c5286xd13c3d86.f135608g.f88932d));
        am.n3 n3Var = c5286xd13c3d86.f135608g;
        if (!n3Var.f88932d) {
            return true;
        }
        c01.u7.d(n3Var.f88930b, n3Var.f88931c, n3Var.f88929a);
        return true;
    }
}
