package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class se implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104548e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104549f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.df f104550g;

    public se(in5.s0 s0Var, android.view.View view, android.view.View view2, com.tencent.mm.plugin.finder.convert.df dfVar) {
        this.f104547d = s0Var;
        this.f104548e = view;
        this.f104549f = view2;
        this.f104550g = dfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mx2.n b17;
        int[] iArr = new int[2];
        in5.s0 holder = this.f104547d;
        holder.itemView.getLocationInWindow(iArr);
        android.view.View view = this.f104548e;
        view.getLocationInWindow(r2);
        int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.view.View view2 = this.f104549f;
        android.view.ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams2).topMargin = ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin + (view.getHeight() / 2);
        view2.requestLayout();
        this.f104550g.s(holder);
        mx2.p pVar = mx2.p.f332511a;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f484869fs3);
        if (p17 == null) {
            return;
        }
        com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner = p17 instanceof com.tencent.mm.plugin.finder.view.image.FinderImageBanner ? (com.tencent.mm.plugin.finder.view.image.FinderImageBanner) p17 : null;
        com.tencent.mm.plugin.finder.view.FinderHorizontalViewPager mediaView = finderImageBanner != null ? finderImageBanner.getMediaView() : null;
        if (!(mediaView instanceof androidx.recyclerview.widget.RecyclerView)) {
            mediaView = null;
        }
        if (mediaView == null || (b17 = pVar.b(holder)) == null) {
            return;
        }
        int childCount = mediaView.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.KeyEvent.Callback findViewById = mediaView.getChildAt(i17).findViewById(com.tencent.mm.R.id.tbn);
            mx2.o oVar = findViewById instanceof mx2.o ? (mx2.o) findViewById : null;
            if (oVar != null) {
                pVar.a(oVar, b17);
            }
        }
    }
}
