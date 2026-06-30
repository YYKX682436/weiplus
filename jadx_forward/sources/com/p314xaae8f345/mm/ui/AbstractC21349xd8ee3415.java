package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.BasePanelKeybordLayout */
/* loaded from: classes5.dex */
public abstract class AbstractC21349xd8ee3415 extends com.p314xaae8f345.mm.ui.C21386xa8232056 {

    /* renamed from: m, reason: collision with root package name */
    public int f278139m;

    public AbstractC21349xd8ee3415(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278139m = -1;
    }

    /* renamed from: getPanelView */
    public abstract java.util.List<android.view.View> mo66217xa7118813();

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        java.util.List<android.view.View> mo66217xa7118813;
        android.view.View next;
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.View.MeasureSpec.getSize(i17);
        int size = android.view.View.MeasureSpec.getSize(i18);
        if (size >= 0) {
            int i19 = this.f278139m;
            if (i19 < 0) {
                this.f278139m = size;
            } else {
                int i27 = i19 - size;
                this.f278139m = size;
                if (i27 != 0 && (mo66217xa7118813 = mo66217xa7118813()) != null) {
                    java.util.Iterator<android.view.View> it = mo66217xa7118813.iterator();
                    while (it.hasNext() && (layoutParams = (next = it.next()).getLayoutParams()) != null) {
                        int i28 = layoutParams.height;
                        int i29 = i28 < 0 ? 0 : i28 - i27;
                        if (i29 < 0) {
                            i29 = 0;
                        }
                        int b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, true);
                        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(getContext());
                        int i37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.f274051b;
                        if (i37 > 0 && size >= i37) {
                            i29 = g17;
                        }
                        int i38 = (i29 <= 0 || i29 >= b17 || next.getVisibility() == 0) ? i29 : 0;
                        if (i38 > g17) {
                            i38 = g17;
                        }
                        if (i38 <= 0 || i38 >= g17) {
                            g17 = i38;
                        }
                        layoutParams.height = g17;
                        next.setLayoutParams(layoutParams);
                    }
                }
            }
        }
        super.onMeasure(i17, i18);
    }

    /* renamed from: setOnMeasureListener */
    public void m78371xb5627411(com.p314xaae8f345.mm.ui.u1 u1Var) {
    }

    public AbstractC21349xd8ee3415(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278139m = -1;
    }
}
