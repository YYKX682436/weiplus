package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes5.dex */
public final class go implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jo f228502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mo f228503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f228504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f228505g;

    public go(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jo joVar, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mo moVar, android.widget.TextView textView, android.widget.ImageView imageView) {
        this.f228502d = joVar;
        this.f228503e = moVar;
        this.f228504f = textView;
        this.f228505g = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jo joVar = this.f228502d;
        if (joVar.m80379x76847179().isFinishing() || joVar.m80379x76847179().isDestroyed()) {
            return;
        }
        int[] iArr = new int[2];
        this.f228503e.getContentView().getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        android.widget.TextView textView = this.f228504f;
        textView.getLocationOnScreen(iArr2);
        android.widget.ImageView imageView = this.f228505g;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = (iArr2[0] - iArr[0]) + ((textView.getWidth() / 2) - (imageView.getMeasuredWidth() / 2));
        imageView.setLayoutParams(layoutParams2);
    }
}
