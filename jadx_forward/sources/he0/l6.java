package he0;

/* loaded from: classes4.dex */
public class l6 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public l6() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q6 q6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.TranslateMessageResultEventListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4 c6178x705b8fc4 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.TranslateMessageResultEventListener");
        if (c6178x705b8fc4 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4) {
            am.kz kzVar = c6178x705b8fc4.f136438g;
            java.lang.String str = kzVar.f88729d;
            int i17 = kzVar.f88730e;
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.f246212a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
            java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.f246213b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                    q6Var = null;
                    break;
                }
                q6Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q6) it.next();
                if (q6Var.f246152d == i17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q6Var.f246149a) && str.equals(q6Var.f246149a)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                    break;
                }
            }
            if (q6Var != null) {
                am.kz kzVar2 = c6178x705b8fc4.f136438g;
                q6Var.f246150b = kzVar2.f88728c;
                q6Var.f246151c = kzVar2.f88732g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TranslateMessageResultEventListener", "finish translate, id:%s, type: %d, success: %b", q6Var.f246149a, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)));
                int i18 = i17 != 2 ? i17 != 3 ? -1 : 2 : 1;
                if (i18 != -1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.i(str, i18, q6Var.f246150b, q6Var.f246151c);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.f246213b.remove(q6Var);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.TranslateMessageResultEventListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.TranslateMessageResultEventListener");
        return false;
    }
}
