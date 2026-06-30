package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class hm implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f103596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.im f103598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f103599g;

    public hm(android.widget.TextView textView, android.view.View view, com.tencent.mm.plugin.finder.convert.im imVar, android.widget.TextView textView2) {
        this.f103596d = textView;
        this.f103597e = view;
        this.f103598f = imVar;
        this.f103599g = textView2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int i17;
        android.widget.TextView textView = this.f103596d;
        textView.getViewTreeObserver().removeOnPreDrawListener(this);
        int[] iArr = new int[2];
        textView.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        this.f103599g.getLocationInWindow(iArr2);
        android.view.View view = this.f103597e;
        if (view.getVisibility() == 0) {
            int width = view.getWidth();
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int i18 = width + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i17 = i18 + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
        } else {
            i17 = 0;
        }
        textView.setMaxWidth(((iArr2[0] - iArr[0]) - i17) - view.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv));
        this.f103598f.getClass();
        com.tencent.mars.xlog.Log.i("FinderLivePurchaseListConvert", "adjustNickNameWidth maxWidth:" + textView.getMaxWidth() + ",nicknamePos:" + iArr[0] + '-' + iArr[1] + ", tipsPos:" + iArr2[0] + '-' + iArr2[1] + ",authIconWidth:" + i17);
        if (textView.getMaxWidth() <= 0) {
            textView.setMaxWidth(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479718db));
        }
        return true;
    }
}
