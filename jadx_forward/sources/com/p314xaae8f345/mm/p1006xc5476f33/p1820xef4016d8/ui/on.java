package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class on implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f228825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co f228826e;

    public on(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co coVar, r45.wv3 wv3Var) {
        this.f228826e = coVar;
        this.f228825d = wv3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        float f17;
        r45.wv3 wv3Var = this.f228825d;
        java.lang.String str = wv3Var.f471031d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co coVar = this.f228826e;
        android.view.ViewGroup.LayoutParams layoutParams = coVar.f228356v.getLayoutParams();
        android.view.ViewGroup viewGroup = coVar.f228341J;
        layoutParams.width = viewGroup.getWidth();
        layoutParams.height = viewGroup.getHeight();
        coVar.f228356v.setLayoutParams(layoutParams);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int height = iArr[1] + viewGroup.getHeight();
        int[] iArr2 = new int[2];
        android.widget.ImageView imageView = coVar.f228344g;
        imageView.getLocationOnScreen(iArr2);
        int height2 = iArr2[1] + imageView.getHeight();
        imageView.getHeight();
        float height3 = imageView.getHeight() / 1200.0f;
        r45.xv3 xv3Var = wv3Var.f471034g;
        if ((xv3Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472027x) || xv3Var.D != 2) ? false : true) {
            f17 = 40.0f;
        } else {
            r45.xv3 xv3Var2 = wv3Var.f471034g;
            f17 = (xv3Var2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var2.f472027x) || xv3Var2.D != 1) ? false : true ? 42.0f : 41.0f;
        }
        int i17 = (int) (height3 * f17);
        gb3.j jVar = (gb3.j) i95.n0.c(gb3.j.class);
        int width = coVar.f228343f.getWidth();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2) jVar).getClass();
        float f18 = width * 1.6399f;
        int round = java.lang.Math.round(f18);
        int round2 = java.lang.Math.round(f18 * 1.2608f);
        android.view.View view = coVar.f228357w;
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.width = round;
        layoutParams2.height = round2;
        layoutParams2.bottomMargin = (height - height2) + i17;
        view.setLayoutParams(layoutParams2);
    }
}
