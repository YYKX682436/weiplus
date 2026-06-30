package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class gn implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f228499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f228500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co f228501c;

    public gn(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co coVar, long j17, r45.wv3 wv3Var) {
        this.f228501c = coVar;
        this.f228499a = j17;
        this.f228500b = wv3Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1
    public void a(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s1 s1Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f228499a;
        boolean z17 = s1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1;
        r45.wv3 wv3Var = this.f228500b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co coVar = this.f228501c;
        if (z17) {
            java.lang.String str = ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1) s1Var).f295520a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "downloadComplete success，file path: %s", str);
            coVar.f228350p = false;
            if (coVar.f228342e == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a.g(1, str, coVar.f228347m, true);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a.g(1, str, coVar.f228347m, coVar.f3639x46306858.isSelected());
            }
            r45.xv3 xv3Var = wv3Var.f471034g;
            if (xv3Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28153, xv3Var.f472027x, 1, 5, java.lang.Long.valueOf(currentTimeMillis));
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1) s1Var).f295518a));
        android.view.View view = coVar.f228346i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$13", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$13", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.xv3 xv3Var2 = wv3Var.f471034g;
        if (xv3Var2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28153, xv3Var2.f472027x, 2, 5, java.lang.Long.valueOf(currentTimeMillis));
        }
    }
}
