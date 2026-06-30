package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4;

/* renamed from: com.tencent.mm.plugin.game.media.GameVideoTagContainer */
/* loaded from: classes3.dex */
public class C15914x3a348830 extends android.widget.LinearLayout {
    public C15914x3a348830(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    /* renamed from: setData */
    public void m64617x76491f2c(java.util.LinkedList<p33.c0> linkedList) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        while (getChildCount() < linkedList.size()) {
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams.height = com.p314xaae8f345.mm.ui.zk.a(getContext(), 14);
            layoutParams.rightMargin = com.p314xaae8f345.mm.ui.zk.a(getContext(), 4);
            imageView.setLayoutParams(layoutParams);
            addView(imageView);
        }
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            android.view.View childAt = getChildAt(i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GameVideoTagContainer", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(childAt, "com/tencent/mm/plugin/game/media/GameVideoTagContainer", "setData", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        for (int i18 = 0; i18 < linkedList.size(); i18++) {
            p33.c0 c0Var = linkedList.get(i18);
            android.widget.ImageView imageView2 = (android.widget.ImageView) getChildAt(i18);
            ((android.widget.LinearLayout.LayoutParams) imageView2.getLayoutParams()).width = com.p314xaae8f345.mm.ui.zk.a(getContext(), c0Var.f433058f);
            n11.a.b().g(c0Var.f433057e, imageView2);
            imageView2.setVisibility(0);
        }
    }

    public C15914x3a348830(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
