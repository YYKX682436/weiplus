package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class a9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.h9 f86401d;

    public a9(com.tencent.mm.plugin.appbrand.page.h9 h9Var) {
        this.f86401d = h9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.h9 h9Var = this.f86401d;
        android.view.ViewGroup.LayoutParams layoutParams = h9Var.f86680e.f352887m.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
        android.view.ViewGroup.LayoutParams layoutParams2 = h9Var.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = -com.tencent.mm.plugin.appbrand.page.y8.c(com.tencent.mm.plugin.appbrand.page.h9.f86673f);
        h9Var.requestLayout();
    }
}
