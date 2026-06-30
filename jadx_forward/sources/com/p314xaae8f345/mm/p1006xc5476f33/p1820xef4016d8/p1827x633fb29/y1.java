package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class y1 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 f227248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f227249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f227250c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f227251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f227252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f227253f;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var, com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0, long j17, java.util.HashSet hashSet, android.view.View view, android.widget.ImageView imageView, r45.wv3 wv3Var) {
        this.f227248a = c10389xffc30b0;
        this.f227249b = j17;
        this.f227250c = hashSet;
        this.f227251d = view;
        this.f227252e = imageView;
        this.f227253f = wv3Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1
    public void a(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s1 s1Var) {
        boolean z17 = s1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1;
        r45.wv3 wv3Var = this.f227253f;
        android.widget.ImageView imageView = this.f227252e;
        com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0 = this.f227248a;
        if (z17) {
            java.lang.String str = ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1) s1Var).f295520a;
            int intValue = ((java.lang.Integer) c10389xffc30b0.getTag(com.p314xaae8f345.mm.R.id.f567305j10)).intValue();
            long j17 = this.f227249b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "loadBubblePagView downloadComplete success，id: %s，file path: %s, status：%s，hasplay：%s", java.lang.Long.valueOf(j17), str, java.lang.Integer.valueOf(intValue), java.lang.Boolean.valueOf(this.f227250c.contains(java.lang.Long.valueOf(j17))));
            if (intValue == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a.f(0, str, c10389xffc30b0);
                android.view.View view = this.f227251d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$18", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$18", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                imageView.setVisibility(8);
                r45.xv3 xv3Var = wv3Var.f471034g;
                if (xv3Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28153, xv3Var.f472026w, 1, 1);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1) s1Var).f295518a));
            android.view.View view2 = this.f227251d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$18", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$18", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
            r45.xv3 xv3Var2 = wv3Var.f471034g;
            if (xv3Var2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28153, xv3Var2.f472026w, 2, 1);
            }
        }
        c10389xffc30b0.setTag(com.p314xaae8f345.mm.R.id.f567305j10, 0);
    }
}
