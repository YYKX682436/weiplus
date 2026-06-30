package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes.dex */
public final class j {
    public j(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.view.View panelIndicator, android.view.View headerLine, android.view.View headerArrow, float f17, int i17, int i18) {
        kotlin.jvm.internal.o.g(panelIndicator, "panelIndicator");
        kotlin.jvm.internal.o.g(headerLine, "headerLine");
        kotlin.jvm.internal.o.g(headerArrow, "headerArrow");
        if (f17 < 0.0f) {
            float min = ((java.lang.Integer.min(java.lang.Math.max(0, i17 - 44), 44) * 1.0f) / 44) * 1.0f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(min));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(headerLine, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/halfscreen/AppBrandHalfScreenPanelHeadIndicatorHolder$Companion", "updatePanelHead", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;FII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            headerLine.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(headerLine, "com/tencent/mm/plugin/appbrand/widget/halfscreen/AppBrandHalfScreenPanelHeadIndicatorHolder$Companion", "updatePanelHead", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;FII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            panelIndicator.getLayoutParams().height = (int) (i18 + (java.lang.Math.max(0, com.tencent.mm.ui.bk.p(panelIndicator.getContext()) - i18) * (1 - min)));
            panelIndicator.requestLayout();
            return;
        }
        float intValue = f17 / ((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.appbrand.widget.halfscreen.k.f91181f).getValue()).intValue();
        float f18 = (intValue - 0.5f) * 2.0f;
        if (f18 < 0.0f) {
            f18 = 0.0f;
        }
        if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        float f19 = intValue <= 1.0f ? intValue : 1.0f;
        float f27 = 0.0f < f19 ? f19 : 0.0f;
        android.view.ViewGroup.LayoutParams layoutParams = headerLine.getLayoutParams();
        if (layoutParams != null) {
            com.tencent.mm.plugin.appbrand.widget.halfscreen.j jVar = com.tencent.mm.plugin.appbrand.widget.halfscreen.k.f91180e;
            jz5.g gVar = com.tencent.mm.plugin.appbrand.widget.halfscreen.k.f91183h;
            layoutParams.height = (int) (((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() + (f27 * (((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.appbrand.widget.halfscreen.k.f91182g).getValue()).intValue() - ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue())));
        } else {
            layoutParams = null;
        }
        headerLine.setLayoutParams(layoutParams);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(headerArrow, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/halfscreen/AppBrandHalfScreenPanelHeadIndicatorHolder$Companion", "updatePanelHead", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;FII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        headerArrow.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(headerArrow, "com/tencent/mm/plugin/appbrand/widget/halfscreen/AppBrandHalfScreenPanelHeadIndicatorHolder$Companion", "updatePanelHead", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;FII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
