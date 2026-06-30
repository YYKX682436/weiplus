package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 f214977d;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 g2Var) {
        this.f214977d = g2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 g2Var = this.f214977d;
        long m75942xfb822ef2 = g2Var.f213668g.m75942xfb822ef2(1);
        android.content.Context context = g2Var.f213663b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String format = java.lang.String.format("https://mp.weixin.qq.com/promotion/res/htmledition/mobile/html/feedback.html?aid=%s&source=1022", java.util.Arrays.copyOf(new java.lang.Object[]{pm0.v.u(m75942xfb822ef2)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        g2Var.f213670i = 4;
        g2Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
