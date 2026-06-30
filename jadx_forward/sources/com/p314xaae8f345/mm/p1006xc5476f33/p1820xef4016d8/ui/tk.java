package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes.dex */
public final class tk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.vk f229000d;

    public tk(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.vk vkVar) {
        this.f229000d = vkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f229000d.f229093n;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationDefaultUIC$initUIC$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationDefaultUIC$initUIC$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
