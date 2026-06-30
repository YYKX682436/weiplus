package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class d2 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 f226750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f226751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f226752c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f226753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f226754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f226755f;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var, com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0, boolean z17, long j17, android.view.View view, r45.wv3 wv3Var, java.util.HashSet hashSet) {
        this.f226750a = c10389xffc30b0;
        this.f226751b = z17;
        this.f226752c = j17;
        this.f226753d = view;
        this.f226754e = wv3Var;
        this.f226755f = hashSet;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1
    public void a(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s1 s1Var) {
        boolean z17 = s1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1;
        r45.wv3 wv3Var = this.f226754e;
        com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0 = this.f226750a;
        if (z17) {
            java.lang.String str = ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1) s1Var).f295520a;
            int intValue = ((java.lang.Integer) c10389xffc30b0.getTag(com.p314xaae8f345.mm.R.id.qur)).intValue();
            boolean z18 = this.f226751b;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(intValue);
            long j17 = this.f226752c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[setBubbleAtmospherePagView] downloadComplete success，file path: %s, needPlay：%s，status: %s，id:%s", str, valueOf, valueOf2, java.lang.Long.valueOf(j17));
            if (intValue == 1) {
                if (z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a.f(9, str, c10389xffc30b0);
                    android.view.View view = this.f226753d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$21", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$21", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    r45.xv3 xv3Var = wv3Var.f471034g;
                    if (xv3Var != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28153, xv3Var.E, 1, 6);
                    }
                } else if (!this.f226755f.contains(java.lang.Long.valueOf(j17))) {
                    c10389xffc30b0.n();
                    c10389xffc30b0.m82581x764e93a7(str);
                    c10389xffc30b0.m82582x3ae760af(0.0d);
                    android.view.View view2 = this.f226753d;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$21", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$21", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[setBubbleAtmospherePagView] downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1) s1Var).f295518a));
            android.view.View view3 = this.f226753d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$21", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$21", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r45.xv3 xv3Var2 = wv3Var.f471034g;
            if (xv3Var2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28153, xv3Var2.E, 2, 6);
            }
        }
        c10389xffc30b0.setTag(com.p314xaae8f345.mm.R.id.qur, 0);
    }
}
