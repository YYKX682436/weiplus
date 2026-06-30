package un3;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5768xf3b4be45 c5768xf3b4be45 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5768xf3b4be45) abstractC20979x809547d1;
        if (c5768xf3b4be45 == null) {
            return true;
        }
        am.xl xlVar = c5768xf3b4be45.f136085g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xlVar.f89916a)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NotifyPushNewTipsEventIListener", "NotifyPushNewTipsEvent %s", xlVar.f89916a);
        rn3.l lVar = (rn3.l) rn3.m.f479493a.get(xlVar.f89916a);
        if (lVar == null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.HeaderComponent", "onCallback");
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bf) lVar).f280267a.E0();
        return true;
    }
}
