package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class w extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f168719d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f168720e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f168721f;

    public w(android.content.Context context, ze.n nVar) {
        super(context);
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569557ep, this);
        this.f168719d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564643wu);
        this.f168720e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564645ww);
        this.f168721f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f564642wt);
        this.f168720e.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.goi, nVar.E0().f387374d));
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f168719d.getLayoutParams();
        if ((nVar.m0() == null || nVar.m0().a() == null || !nVar.m0().a().a()) ? false : true) {
            layoutParams.topMargin = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561580mj);
            this.f168719d.setLayoutParams(layoutParams);
            requestLayout();
        }
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.f168719d.setColorFilter(new android.graphics.ColorMatrixColorFilter(colorMatrix));
        l01.d0.f396294a.b(this.f168719d, nVar.E0().f387376f, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.h0) nVar.K1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.h0.class)).Za(), l01.q0.f396320d);
        this.f168721f.setVisibility(8);
        setBackgroundColor(-1);
    }
}
