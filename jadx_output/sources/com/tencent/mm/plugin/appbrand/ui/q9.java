package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class q9 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f89958a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f89959b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f89960c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f89961d;

    public q9(android.view.View.OnClickListener onClickListener, android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        this.f89958a = root;
        jz5.i iVar = jz5.i.f302831f;
        this.f89959b = jz5.h.a(iVar, new com.tencent.mm.plugin.appbrand.ui.o9(this));
        jz5.g a17 = jz5.h.a(iVar, new com.tencent.mm.plugin.appbrand.ui.p9(this));
        this.f89960c = jz5.h.a(iVar, new com.tencent.mm.plugin.appbrand.ui.n9(this));
        android.widget.Button button = (android.widget.Button) a17.getValue();
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    public final void a(xi1.o orientation) {
        kotlin.jvm.internal.o.g(orientation, "orientation");
        int ordinal = orientation.ordinal();
        jz5.g gVar = this.f89959b;
        android.view.View view = this.f89958a;
        if (ordinal == 0 || ordinal == 1) {
            android.widget.ImageView imageView = (android.widget.ImageView) gVar.getValue();
            if (imageView != null) {
                com.tencent.mm.ui.kk.f(imageView, view.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480110ai1));
            }
            com.tencent.mm.ui.kk.g(view, view.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ahz));
        } else {
            android.widget.ImageView imageView2 = (android.widget.ImageView) gVar.getValue();
            if (imageView2 != null) {
                com.tencent.mm.ui.kk.f(imageView2, view.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480111ai2));
            }
            com.tencent.mm.ui.kk.g(view, view.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480109ai0));
        }
        view.requestLayout();
    }
}
