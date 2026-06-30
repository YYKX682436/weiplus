package r61;

/* loaded from: classes11.dex */
public class y extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public y() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5414x5010811f c5414x5010811f = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5414x5010811f) abstractC20979x809547d1;
        if (c5414x5010811f instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5414x5010811f) {
            c5414x5010811f.f135761h.f88669a = true;
            am.j9 j9Var = c5414x5010811f.f135760g;
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r61.q0.f(j9Var.f88549a));
            am.k9 k9Var = c5414x5010811f.f135761h;
            if (!K0) {
                k9Var.f88669a = false;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r61.q0.f(j9Var.f88550b))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageMobileFilterListenerImpl", "mobile fmessage not found by phonemd5 or fullphonemd5");
            } else {
                k9Var.f88669a = false;
            }
        }
        return false;
    }
}
