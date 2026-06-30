package he0;

/* loaded from: classes4.dex */
public class v4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public v4() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.OmitAllResendSnsListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5782x369224b5 c5782x369224b5 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5782x369224b5) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.OmitAllResendSnsListener");
        if (gm0.j1.a()) {
            java.util.ArrayList arrayList = c5782x369224b5.f136093g.f88219a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
            Fj.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("omitResendSns", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2 aj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.aj();
            long F = aj6.F(-1L);
            try {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) it.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i17 = Fj.i1((int) c16564xb55e1d5.f231013d);
                    if (i17 != null) {
                        i17.m70454x25082041();
                        Fj.w3((int) c16564xb55e1d5.f231013d, i17);
                    }
                }
                aj6.w(java.lang.Long.valueOf(F));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("omitResendSns", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.OmitAllResendSnsListener");
            } catch (java.lang.Throwable th6) {
                aj6.w(java.lang.Long.valueOf(F));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("omitResendSns", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                throw th6;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OmitAllResendSnsListener", "OmitAllResendSnsEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.OmitAllResendSnsListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.OmitAllResendSnsListener");
        return false;
    }
}
