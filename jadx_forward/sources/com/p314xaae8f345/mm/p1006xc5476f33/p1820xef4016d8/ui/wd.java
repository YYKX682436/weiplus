package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class wd implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f229178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f229179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f229180c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f229181d;

    public wd(long j17, android.view.View view, r45.wv3 wv3Var, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f229178a = j17;
        this.f229179b = view;
        this.f229180c = wv3Var;
        this.f229181d = c22789xd23e9a9b;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1
    public void a(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s1 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f229178a;
        boolean z17 = result instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1;
        android.view.View view = this.f229179b;
        if (z17) {
            java.lang.String str = ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1) result).f295520a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "downloadComplete success，file path: %s", str);
            if (view != null) {
                view.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.vd(str, this.f229181d, this.f229180c, currentTimeMillis), 170L);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1 q1Var = result instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1 ? (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1) result : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "downloadComplete failed，errorCode: %s", q1Var != null ? java.lang.Integer.valueOf(q1Var.f295518a) : null);
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$Companion$renderEnvelopeDynamicStatic$1", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$Companion$renderEnvelopeDynamicStatic$1", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        r45.xv3 xv3Var = this.f229180c.f471034g;
        objArr[0] = xv3Var != null ? xv3Var.f472027x : null;
        objArr[1] = 2;
        objArr[2] = 2;
        objArr[3] = java.lang.Long.valueOf(currentTimeMillis);
        g0Var.d(28153, objArr);
    }
}
