package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f226789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f2 f226790f;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f2 f2Var, java.lang.String str, long j17) {
        this.f226790f = f2Var;
        this.f226788d = str;
        this.f226789e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.xv3 xv3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f2 f2Var = this.f226790f;
        android.view.View view = f2Var.f226802c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$22$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$22$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a.f(f2Var.f226803d, this.f226788d, f2Var.f226804e);
        r45.wv3 wv3Var = f2Var.f226805f;
        if (wv3Var == null || (xv3Var = wv3Var.f471034g) == null) {
            return;
        }
        int i17 = f2Var.f226803d;
        long j17 = this.f226789e;
        if (i17 == 11) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28153, xv3Var.G, 1, 8, java.lang.Long.valueOf(j17));
        } else if (i17 == 10) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28153, xv3Var.F, 1, 7, java.lang.Long.valueOf(j17));
        }
    }
}
