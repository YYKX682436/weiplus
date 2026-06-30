package he0;

/* loaded from: classes4.dex */
public class j6 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public j6() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6130x1c2ecb67 c6130x1c2ecb67 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6130x1c2ecb67) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener");
        if (gm0.j1.a()) {
            int i17 = c6130x1c2ecb67.f136402g.f90145a;
            if (i17 != 9 && i17 == 7) {
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new he0.i6(this, c6130x1c2ecb67));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusNotifyFunctionListener", "StatusNotifyFunctionEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener");
        return false;
    }
}
