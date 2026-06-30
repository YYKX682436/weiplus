package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f222780a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f222781b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f222782c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f222783d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f222784e;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.d1 d1Var, android.view.View view) {
        this.f222784e = view;
        this.f222780a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.avt);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.avq);
        this.f222781b = imageView;
        this.f222782c = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.m49);
        this.f222783d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.avs);
        if (d1Var.f222788e.f222688h == null) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            android.content.Context context = d1Var.f222787d;
            layoutParams.width = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561370gm);
            layoutParams.height = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561370gm);
            imageView.setLayoutParams(layoutParams);
        }
    }
}
