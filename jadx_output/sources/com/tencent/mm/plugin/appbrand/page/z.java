package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class z extends com.tencent.mm.plugin.appbrand.page.ia {
    public static void D(android.view.View view, int i17, int i18) {
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new android.view.ViewGroup.LayoutParams(i17, i18));
            return;
        }
        view.getLayoutParams().width = i17;
        view.getLayoutParams().height = i18;
        if (view.getParent() != null) {
            view.requestLayout();
        }
    }

    public void A(android.view.ViewGroup viewGroup) {
        super.e(viewGroup, 4, 0, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 998.0f}, 0, true);
        D(viewGroup, -1, -1);
    }

    public void B(android.view.ViewGroup viewGroup) {
        super.e(viewGroup, 3, 0, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 900.0f}, 0, true);
        D(viewGroup, -1, -1);
    }

    public void C() {
        android.view.ViewGroup n17 = n(0, false, false);
        java.util.Objects.requireNonNull(n17);
        android.view.View findViewById = n17.findViewById(com.tencent.mm.R.id.f483113wx);
        if (findViewById != null) {
            r(2);
            n17.removeView(findViewById);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ia, com.tencent.mm.plugin.appbrand.jsapi.s
    public boolean c(android.view.View view, int i17, int i18, float[] fArr, int i19, boolean z17, boolean z18, boolean z19) {
        return super.c(view, i17, i18, fArr, i19, z17, z18, z19);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ia
    public boolean e(android.view.View view, int i17, int i18, float[] fArr, int i19, boolean z17) {
        return super.e(view, i17, i18, fArr, i19, z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ia
    public boolean f(android.view.View view, int i17, int i18, float[] fArr, int i19, boolean z17, boolean z18) {
        return super.f(view, i17, i18, fArr, i19, z17, z18);
    }

    public void y(mi1.h hVar) {
        super.e(hVar, 1, 0, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1000.0f}, 0, true);
        D(hVar, -1, -2);
    }

    public void z(android.view.View view, int i17) {
        android.view.ViewGroup n17 = n(0, false, false);
        java.util.Objects.requireNonNull(n17);
        android.view.View findViewById = n17.findViewById(com.tencent.mm.R.id.f483113wx);
        if (!(findViewById instanceof android.widget.RelativeLayout)) {
            findViewById = new android.widget.RelativeLayout(view.getContext());
            findViewById.setId(com.tencent.mm.R.id.f483113wx);
            super.e(findViewById, 2, 0, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 999.0f}, 0, true);
            D(findViewById, -1, -1);
        }
        android.view.View findViewById2 = findViewById.findViewById(i17);
        if (findViewById2 != null) {
            ((android.widget.RelativeLayout) findViewById).removeView(findViewById2);
        }
        ((android.widget.RelativeLayout) findViewById).addView(view);
    }
}
