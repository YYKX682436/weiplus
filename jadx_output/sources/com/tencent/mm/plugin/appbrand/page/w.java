package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class w extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f87186d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f87187e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f87188f;

    public w(android.content.Context context, ze.n nVar) {
        super(context);
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488024ep, this);
        this.f87186d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483110wu);
        this.f87187e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483112ww);
        this.f87188f = (android.widget.Button) findViewById(com.tencent.mm.R.id.f483109wt);
        this.f87187e.setText(getResources().getString(com.tencent.mm.R.string.goi, nVar.E0().f305841d));
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f87186d.getLayoutParams();
        if ((nVar.m0() == null || nVar.m0().a() == null || !nVar.m0().a().a()) ? false : true) {
            layoutParams.topMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480047mj);
            this.f87186d.setLayoutParams(layoutParams);
            requestLayout();
        }
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.f87186d.setColorFilter(new android.graphics.ColorMatrixColorFilter(colorMatrix));
        l01.d0.f314761a.b(this.f87186d, nVar.E0().f305843f, ((com.tencent.mm.plugin.appbrand.widget.h0) nVar.K1(com.tencent.mm.plugin.appbrand.widget.h0.class)).Za(), l01.q0.f314787d);
        this.f87188f.setVisibility(8);
        setBackgroundColor(-1);
    }
}
