package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f;

/* loaded from: classes.dex */
public final class j {
    public j(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.view.View panelIndicator, android.view.View headerLine, android.view.View headerArrow, float f17, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelIndicator, "panelIndicator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerLine, "headerLine");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerArrow, "headerArrow");
        if (f17 < 0.0f) {
            float min = ((java.lang.Integer.min(java.lang.Math.max(0, i17 - 44), 44) * 1.0f) / 44) * 1.0f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(min));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(headerLine, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/halfscreen/AppBrandHalfScreenPanelHeadIndicatorHolder$Companion", "updatePanelHead", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;FII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            headerLine.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(headerLine, "com/tencent/mm/plugin/appbrand/widget/halfscreen/AppBrandHalfScreenPanelHeadIndicatorHolder$Companion", "updatePanelHead", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;FII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            panelIndicator.getLayoutParams().height = (int) (i18 + (java.lang.Math.max(0, com.p314xaae8f345.mm.ui.bk.p(panelIndicator.getContext()) - i18) * (1 - min)));
            panelIndicator.requestLayout();
            return;
        }
        float intValue = f17 / ((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.k.f172714f).mo141623x754a37bb()).intValue();
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
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.k.f172713e;
            jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.k.f172716h;
            layoutParams.height = (int) (((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() + (f27 * (((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.k.f172715g).mo141623x754a37bb()).intValue() - ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue())));
        } else {
            layoutParams = null;
        }
        headerLine.setLayoutParams(layoutParams);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(headerArrow, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/halfscreen/AppBrandHalfScreenPanelHeadIndicatorHolder$Companion", "updatePanelHead", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;FII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        headerArrow.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(headerArrow, "com/tencent/mm/plugin/appbrand/widget/halfscreen/AppBrandHalfScreenPanelHeadIndicatorHolder$Companion", "updatePanelHead", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;FII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
