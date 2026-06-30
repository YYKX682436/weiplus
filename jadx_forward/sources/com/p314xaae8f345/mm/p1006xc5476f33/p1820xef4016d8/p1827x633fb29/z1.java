package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class z1 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 f227261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f227262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f227263c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f227264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f227265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f227266f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f227267g;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var, com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0, boolean z17, long j17, android.view.View view, android.widget.ImageView imageView, r45.wv3 wv3Var, java.util.HashSet hashSet) {
        this.f227261a = c10389xffc30b0;
        this.f227262b = z17;
        this.f227263c = j17;
        this.f227264d = view;
        this.f227265e = imageView;
        this.f227266f = wv3Var;
        this.f227267g = hashSet;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1
    public void a(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s1 s1Var) {
        boolean z17 = s1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1;
        android.widget.ImageView imageView = this.f227265e;
        com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0 = this.f227261a;
        if (z17) {
            java.lang.String str = ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1) s1Var).f295520a;
            int intValue = ((java.lang.Integer) c10389xffc30b0.getTag(com.p314xaae8f345.mm.R.id.j0z)).intValue();
            boolean z18 = this.f227262b;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(intValue);
            long j17 = this.f227263c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "setBubblePagView downloadComplete success，file path: %s, needPlay：%s，status: %s，id:%s", str, valueOf, valueOf2, java.lang.Long.valueOf(j17));
            if (intValue == 1) {
                if (z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a.f(0, str, c10389xffc30b0);
                    android.view.View view = this.f227264d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$19", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$19", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    imageView.setVisibility(8);
                    r45.xv3 xv3Var = this.f227266f.f471034g;
                    if (xv3Var != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28153, xv3Var.f472026w, 1, 1);
                    }
                } else if (!this.f227267g.contains(java.lang.Long.valueOf(j17))) {
                    c10389xffc30b0.n();
                    c10389xffc30b0.m82581x764e93a7(str);
                    c10389xffc30b0.m82582x3ae760af(0.0d);
                    android.view.View view2 = this.f227264d;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$19", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$19", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    imageView.setVisibility(8);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1) s1Var).f295518a));
            android.view.View view3 = this.f227264d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$19", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$19", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
        }
        c10389xffc30b0.setTag(com.p314xaae8f345.mm.R.id.j0z, 0);
    }
}
