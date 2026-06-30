package vo3;

/* loaded from: classes9.dex */
public class g0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public g0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5778x426a2e60 c5778x426a2e60 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5778x426a2e60) abstractC20979x809547d1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UpdateCardListEventIListener", "update card list: %s", java.lang.Integer.valueOf(c5778x426a2e60.f136091g.f88010a));
        am.dm dmVar = c5778x426a2e60.f136091g;
        if (dmVar.f88010a == 2 && yo3.m.i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UpdateCardListEventIListener", "unbind card, offline kinda enable, check ifneed userbindquery in kinda");
            ((h45.q) i95.n0.c(h45.q.class)).mo24756xcebbfc8c(dmVar.f88011b);
            return true;
        }
        if (yo3.m.k()) {
            gm0.j1.d().g(new wo3.p(13, null, 8, 0, ""));
        }
        return false;
    }
}
