package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 f230885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f230886e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 c16548x9f1d7908, int i17) {
        this.f230885d = c16548x9f1d7908;
        this.f230886e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 c16548x9f1d7908 = this.f230885d;
        android.view.View view = c16548x9f1d7908.f230681d;
        android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) (view != null ? view.getBackground() : null);
        if (gradientDrawable != null) {
            android.view.View view2 = c16548x9f1d7908.f230681d;
            gradientDrawable.setColor(i65.a.d(view2 != null ? view2.getContext() : null, this.f230886e));
        }
    }
}
