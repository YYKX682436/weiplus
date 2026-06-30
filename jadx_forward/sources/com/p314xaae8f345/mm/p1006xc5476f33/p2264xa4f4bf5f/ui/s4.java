package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes3.dex */
public final class s4 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f255812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f255813c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f255814d;

    public s4(int i17, int i18, float f17, int i19) {
        this.f255811a = i17;
        this.f255812b = i18;
        this.f255813c = f17;
        this.f255814d = i19;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            float f17 = this.f255813c;
            view.setScaleX((((this.f255811a / view.getWidth()) - 1.0f) * f17) + 1.0f);
            view.setScaleY((((this.f255812b / view.getHeight()) - 1.0f) * f17) + 1.0f);
            if (f17 > 0.8d) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(1 - ((f17 - 0.8f) / 0.2f)));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$handleExitAnimStyleCard$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$handleExitAnimStyleCard$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$handleExitAnimStyleCard$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$handleExitAnimStyleCard$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f255814d);
    }
}
