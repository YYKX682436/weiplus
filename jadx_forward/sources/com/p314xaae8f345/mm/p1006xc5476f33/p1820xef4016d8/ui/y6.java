package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class y6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.z6 f229254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.a7 f229255e;

    public y6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.a7 a7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.z6 z6Var) {
        this.f229255e = a7Var;
        this.f229254d = z6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.z6 z6Var = this.f229254d;
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) z6Var.f229298a.getLayoutParams();
        layoutParams.rightMargin = z6Var.f229300c.getWidth() + com.p314xaae8f345.mm.ui.zk.a(this.f229255e.f228228f, 4);
        z6Var.f229298a.setLayoutParams(layoutParams);
    }
}
