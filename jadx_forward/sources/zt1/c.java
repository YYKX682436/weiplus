package zt1;

/* loaded from: classes8.dex */
public class c extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public c() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5591x5fe952d1 c5591x5fe952d1 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5591x5fe952d1) abstractC20979x809547d1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreCard.cardGetCountListener", "deal with card notify event GetCardCountEvent");
        if (!(c5591x5fe952d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5591x5fe952d1)) {
            return false;
        }
        xt1.t0.fj().f538120y.mo50297x7c4d7ca2(new zt1.b(this, c5591x5fe952d1), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        return false;
    }
}
