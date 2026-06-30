package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class a2 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 f213145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f213146e;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g2 g2Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        this.f213145d = g2Var;
        this.f213146e = c19786x6a1e2862;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initFirstPage$1$2$clickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        xc2.y2 y2Var = xc2.y2.f534876a;
        android.content.Context context = this.f213145d.f213663b;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info = this.f213146e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info, "$info");
        xc2.y2.i(y2Var, context, new xc2.p0(info), 0, null, 12, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initFirstPage$1$2$clickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }
}
