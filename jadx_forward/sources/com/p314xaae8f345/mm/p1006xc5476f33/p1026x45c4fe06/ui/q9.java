package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class q9 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f171491a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f171492b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f171493c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f171494d;

    public q9(android.view.View.OnClickListener onClickListener, android.view.View root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f171491a = root;
        jz5.i iVar = jz5.i.f384364f;
        this.f171492b = jz5.h.a(iVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.o9(this));
        jz5.g a17 = jz5.h.a(iVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p9(this));
        this.f171493c = jz5.h.a(iVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.n9(this));
        android.widget.Button button = (android.widget.Button) a17.mo141623x754a37bb();
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    public final void a(xi1.o orientation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orientation, "orientation");
        int ordinal = orientation.ordinal();
        jz5.g gVar = this.f171492b;
        android.view.View view = this.f171491a;
        if (ordinal == 0 || ordinal == 1) {
            android.widget.ImageView imageView = (android.widget.ImageView) gVar.mo141623x754a37bb();
            if (imageView != null) {
                com.p314xaae8f345.mm.ui.kk.f(imageView, view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561643ai1));
            }
            com.p314xaae8f345.mm.ui.kk.g(view, view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ahz));
        } else {
            android.widget.ImageView imageView2 = (android.widget.ImageView) gVar.mo141623x754a37bb();
            if (imageView2 != null) {
                com.p314xaae8f345.mm.ui.kk.f(imageView2, view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561644ai2));
            }
            com.p314xaae8f345.mm.ui.kk.g(view, view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561642ai0));
        }
        view.requestLayout();
    }
}
