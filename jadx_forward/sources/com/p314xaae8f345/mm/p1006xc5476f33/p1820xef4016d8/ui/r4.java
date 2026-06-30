package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes5.dex */
public class r4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.s4 f228899d;

    public r4(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.s4 s4Var) {
        this.f228899d = s4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.s4 s4Var = this.f228899d;
        android.view.View view = s4Var.f228942m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$14$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$14$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        s4Var.f228942m.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.q4(this), 100L);
    }
}
