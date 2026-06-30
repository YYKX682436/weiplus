package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class m7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f228700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5 f228701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f228702f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228703g;

    public m7(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5 h5Var, android.widget.TextView textView, java.lang.String str) {
        this.f228700d = activityC16371xf216ae6d;
        this.f228701e = h5Var;
        this.f228702f = textView;
        this.f228703g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f228700d;
        java.util.Set set = activityC16371xf216ae6d.f227752r2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5 h5Var = this.f228701e;
        ((java.util.HashSet) set).remove(h5Var != null ? h5Var.f226852n : null);
        android.widget.TextView textView = this.f228702f;
        if ((textView != null ? textView.getTag() : null) != null) {
            java.lang.Object tag = textView.getTag();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f228703g, tag instanceof java.lang.String ? (java.lang.String) tag : null)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(activityC16371xf216ae6d.mo55332x76847179(), textView, h5Var != null ? h5Var.f226845d : null);
            }
        }
    }
}
