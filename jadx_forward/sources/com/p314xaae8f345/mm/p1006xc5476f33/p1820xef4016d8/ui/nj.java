package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class nj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qj f228777d;

    public nj(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qj qjVar) {
        this.f228777d = qjVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qj qjVar = this.f228777d;
        android.view.View view = qjVar.f228887e.A;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$21$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$21$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        qjVar.f228887e.f228016v.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        qjVar.f228887e.f228018x.setVisibility(4);
        qjVar.f228887e.f228021y.setVisibility(4);
    }
}
