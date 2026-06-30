package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class hm implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f185129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.im f185131f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f185132g;

    public hm(android.widget.TextView textView, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.im imVar, android.widget.TextView textView2) {
        this.f185129d = textView;
        this.f185130e = view;
        this.f185131f = imVar;
        this.f185132g = textView2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int i17;
        android.widget.TextView textView = this.f185129d;
        textView.getViewTreeObserver().removeOnPreDrawListener(this);
        int[] iArr = new int[2];
        textView.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        this.f185132g.getLocationInWindow(iArr2);
        android.view.View view = this.f185130e;
        if (view.getVisibility() == 0) {
            int width = view.getWidth();
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int i18 = width + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i17 = i18 + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
        } else {
            i17 = 0;
        }
        textView.setMaxWidth(((iArr2[0] - iArr[0]) - i17) - view.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        this.f185131f.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePurchaseListConvert", "adjustNickNameWidth maxWidth:" + textView.getMaxWidth() + ",nicknamePos:" + iArr[0] + '-' + iArr[1] + ", tipsPos:" + iArr2[0] + '-' + iArr2[1] + ",authIconWidth:" + i17);
        if (textView.getMaxWidth() <= 0) {
            textView.setMaxWidth(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db));
        }
        return true;
    }
}
