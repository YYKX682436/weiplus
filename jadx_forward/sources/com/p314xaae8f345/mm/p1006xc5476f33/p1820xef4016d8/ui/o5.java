package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class o5 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i5 f228791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 f228792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f228793c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f228794d;

    public o5(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.t5 t5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i5 i5Var, com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0, r45.wv3 wv3Var, android.view.View view) {
        this.f228791a = i5Var;
        this.f228792b = c10389xffc30b0;
        this.f228793c = wv3Var;
        this.f228794d = view;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1
    public void a(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s1 s1Var) {
        boolean z17 = s1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1;
        r45.wv3 wv3Var = this.f228793c;
        if (z17) {
            java.lang.String str = ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1) s1Var).f295520a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "downloadComplete success，file path: %s", str);
            this.f228791a.f228549e = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a.f(1, str, this.f228792b);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28153, wv3Var.f471034g.f472027x, 1, 6);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1) s1Var).f295518a));
        android.view.View view = this.f228794d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$5", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$5", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28153, wv3Var.f471034g.f472027x, 2, 6);
    }
}
