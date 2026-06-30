package ut2;

/* loaded from: classes.dex */
public final class e4 {
    public e4(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.view.View headerLine, android.view.View headerArrow, int i17, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerLine, "headerLine");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerArrow, "headerArrow");
        zl2.r4.f555483a.M2("ShoppingPanelHeadIndicatorHolder", "updatePanelHead " + f17 + ",panelPosY:" + i17);
        float intValue = f17 / ((float) ((java.lang.Number) ((jz5.n) ut2.f4.f512412e).mo141623x754a37bb()).intValue());
        float f18 = (intValue - 0.5f) * 2.0f;
        if (f18 < 0.0f) {
            f18 = 0.0f;
        }
        if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        if (intValue > 1.0f) {
            intValue = 1.0f;
        }
        float f19 = 0.0f < intValue ? intValue : 0.0f;
        android.view.ViewGroup.LayoutParams layoutParams = headerLine.getLayoutParams();
        if (layoutParams != null) {
            ut2.e4 e4Var = ut2.f4.f512411d;
            jz5.g gVar = ut2.f4.f512414g;
            layoutParams.height = (int) (((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() + (f19 * (((java.lang.Number) ((jz5.n) ut2.f4.f512413f).mo141623x754a37bb()).intValue() - ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue())));
        } else {
            layoutParams = null;
        }
        headerLine.setLayoutParams(layoutParams);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(headerArrow, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeadIndicatorHolder$Companion", "updatePanelHead", "(Landroid/view/View;Landroid/view/View;IF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        headerArrow.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(headerArrow, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeadIndicatorHolder$Companion", "updatePanelHead", "(Landroid/view/View;Landroid/view/View;IF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
