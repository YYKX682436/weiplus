package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class lc implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f228666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 f228667b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f228668c;

    public lc(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13, r45.wv3 wv3Var) {
        this.f228666a = j17;
        this.f228667b = activityC16373x8a110f13;
        this.f228668c = wv3Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1
    public void a(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s1 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f228666a;
        boolean z17 = result instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1;
        r45.wv3 wv3Var = this.f228668c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = this.f228667b;
        if (z17) {
            java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227774x2;
            java.lang.String str = ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1) result).f295520a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "downloadComplete success，file path: %s", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a.h(3, str, activityC16373x8a110f13.C);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[4];
            r45.xv3 xv3Var = wv3Var.f471034g;
            objArr[0] = xv3Var != null ? xv3Var.f472025v : null;
            objArr[1] = 1;
            objArr[2] = 4;
            objArr[3] = java.lang.Long.valueOf(currentTimeMillis);
            g0Var.d(28153, objArr);
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1 q1Var = result instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1 ? (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1) result : null;
        java.lang.Integer valueOf = q1Var != null ? java.lang.Integer.valueOf(q1Var.f295518a) : null;
        java.lang.ref.WeakReference weakReference2 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227774x2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "downloadComplete failed，errorCode: %s", valueOf);
        android.view.View view = activityC16373x8a110f13.B;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$renderEnvelopDynamic$3", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$renderEnvelopDynamic$3", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr2 = new java.lang.Object[4];
        r45.xv3 xv3Var2 = wv3Var.f471034g;
        objArr2[0] = xv3Var2 != null ? xv3Var2.f472025v : null;
        objArr2[1] = 2;
        objArr2[2] = 4;
        objArr2[3] = java.lang.Long.valueOf(currentTimeMillis);
        g0Var2.d(28153, objArr2);
    }
}
