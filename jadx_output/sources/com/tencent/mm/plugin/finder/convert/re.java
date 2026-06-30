package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class re implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner f104464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104465f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f104466g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104467h;

    public re(in5.s0 s0Var, com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner finderBaseMediaBanner, android.view.View view, android.view.ViewGroup viewGroup, android.view.View view2) {
        this.f104463d = s0Var;
        this.f104464e = finderBaseMediaBanner;
        this.f104465f = view;
        this.f104466g = viewGroup;
        this.f104467h = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        android.view.ViewGroup viewGroup = this.f104466g;
        int childCount = viewGroup.getChildCount();
        int i17 = 0;
        while (true) {
            if (i17 >= childCount) {
                view = this.f104467h;
                break;
            }
            view = viewGroup.getChildAt(i17);
            if (view.getVisibility() == 0) {
                if (!(view.getAlpha() == 0.0f)) {
                    break;
                }
            }
            i17++;
        }
        int[] iArr = new int[2];
        this.f104463d.itemView.getLocationInWindow(iArr);
        com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner finderBaseMediaBanner = this.f104464e;
        finderBaseMediaBanner.getLocationInWindow(r3);
        int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
        view.getLocationInWindow(r0);
        int[] iArr3 = {iArr3[0] - iArr[0], iArr3[1] - iArr[1]};
        android.view.View view2 = this.f104465f;
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        int i18 = layoutParams2.topMargin;
        int height = iArr2[1] + finderBaseMediaBanner.getHeight() + view2.getHeight();
        int i19 = iArr3[1];
        if (height >= i19) {
            layoutParams2.topMargin = i19 - view2.getHeight();
        } else {
            layoutParams2.topMargin = iArr2[1] + finderBaseMediaBanner.getHeight();
        }
        if (layoutParams2.topMargin != i18) {
            view2.requestLayout();
        }
    }
}
