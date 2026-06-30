package he0;

/* loaded from: classes4.dex */
public class j5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public j5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5934xfda57620 c5934xfda57620 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5934xfda57620) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener");
        if (gm0.j1.a()) {
            am.ur urVar = c5934xfda57620.f136238g;
            java.util.ArrayList arrayList = urVar.f89661a;
            java.lang.String str = urVar.f89662b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResendSnsByUpdateXmlListener", "ResendSnsByUpdateXmlEvent, try resend sns");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new he0.i5(this, arrayList, str));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ResendSnsByUpdateXmlListener", "ResendSnsByUpdateXmlEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener");
        return false;
    }
}
