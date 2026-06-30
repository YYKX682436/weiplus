package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class yd implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f229267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f229268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f229269c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f229270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f229271e;

    public yd(long j17, android.view.View view, android.view.View view2, r45.wv3 wv3Var, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f229267a = j17;
        this.f229268b = view;
        this.f229269c = view2;
        this.f229270d = wv3Var;
        this.f229271e = c22789xd23e9a9b;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1
    public void a(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s1 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f229267a;
        if (result instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1) {
            java.lang.String str = ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1) result).f295520a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "downloadComplete success，file path: %s", str);
            android.view.View view = this.f229268b;
            if (view != null) {
                view.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.xd(str, this.f229271e, this.f229270d, currentTimeMillis), 150L);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1 q1Var = result instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1 ? (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1) result : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "downloadComplete failed，errorCode: %s", q1Var != null ? java.lang.Integer.valueOf(q1Var.f295518a) : null);
        android.view.View view2 = this.f229269c;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$Companion$renderEnvelopeDynamicStatic$2", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$Companion$renderEnvelopeDynamicStatic$2", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        r45.xv3 xv3Var = this.f229270d.f471034g;
        objArr[0] = xv3Var != null ? xv3Var.f472027x : null;
        objArr[1] = 2;
        objArr[2] = 2;
        objArr[3] = java.lang.Long.valueOf(currentTimeMillis);
        g0Var.d(28153, objArr);
    }
}
