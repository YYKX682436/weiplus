package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class vc implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yc f201592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f201593e;

    public vc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yc ycVar, android.view.View view) {
        this.f201592d = ycVar;
        this.f201593e = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int b17;
        int width;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yc ycVar = this.f201592d;
        ycVar.f201966b.getViewTreeObserver().removeOnPreDrawListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sc scVar = ycVar.f201965a.f201161j;
        ycVar.getClass();
        int i17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        android.view.View view = this.f201593e;
        int[] t17 = pm0.v.t(view);
        int i18 = t17[0];
        int i19 = t17[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sc scVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sc.f201282d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rc rcVar = ycVar.f201965a;
        if (scVar == scVar2) {
            b17 = view.getHeight();
        } else {
            i19 -= ycVar.f201966b.getHeight();
            b17 = i65.a.b(rcVar.f201152a, 8);
        }
        int i27 = i19 + b17;
        int width2 = i18 + (view.getWidth() / 2);
        int b18 = i65.a.b(rcVar.f201152a, 16);
        android.widget.TextView textView = ycVar.f201970f;
        if (width2 - (textView.getWidth() / 2) < b18) {
            width = b18;
        } else {
            int i28 = i17 - b18;
            width = (textView.getWidth() / 2) + width2 > i28 ? i28 - textView.getWidth() : width2 - (textView.getWidth() / 2);
        }
        android.widget.PopupWindow popupWindow = ycVar.f201967c;
        popupWindow.dismiss();
        popupWindow.showAtLocation(view, 51, width, i27);
        popupWindow.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.tc(ycVar));
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (width < b18) {
                width = b18;
            }
            marginLayoutParams.leftMargin = width;
            marginLayoutParams.rightMargin = b18;
        }
        android.widget.ImageView arrowTopView = ycVar.f201968d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrowTopView, "arrowTopView");
        ycVar.a(arrowTopView, width2);
        android.widget.ImageView arrowBottomView = ycVar.f201969e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrowBottomView, "arrowBottomView");
        ycVar.a(arrowBottomView, width2);
        android.view.View view2 = ycVar.f201966b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommonGuideWidget", "adjustWidget", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveCommonGuideWidget$Orientation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommonGuideWidget", "adjustWidget", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveCommonGuideWidget$Orientation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        rcVar.f201154c.mo152xb9724478();
        return true;
    }
}
