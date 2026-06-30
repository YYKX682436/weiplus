package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class f2 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f226800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f226801b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f226802c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f226803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 f226804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f226805f;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var, long j17, android.view.View view, android.view.View view2, int i17, com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0, r45.wv3 wv3Var) {
        this.f226800a = j17;
        this.f226801b = view;
        this.f226802c = view2;
        this.f226803d = i17;
        this.f226804e = c10389xffc30b0;
        this.f226805f = wv3Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1
    public void a(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s1 s1Var) {
        r45.xv3 xv3Var;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f226800a;
        if (s1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1) {
            java.lang.String str = ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1) s1Var).f295520a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[renderEnvelopeCoverAtmosphereDynamic] downloadComplete success，file path: %s", str);
            this.f226801b.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e2(this, str, currentTimeMillis), 300L);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[renderEnvelopeCoverAtmosphereDynamic] downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1) s1Var).f295518a));
        android.view.View view = this.f226802c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$22", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$22", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.wv3 wv3Var = this.f226805f;
        if (wv3Var == null || (xv3Var = wv3Var.f471034g) == null) {
            return;
        }
        int i17 = this.f226803d;
        if (i17 == 11) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28153, xv3Var.G, 2, 8, java.lang.Long.valueOf(currentTimeMillis));
        } else if (i17 == 10) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28153, xv3Var.F, 2, 7, java.lang.Long.valueOf(currentTimeMillis));
        }
    }
}
