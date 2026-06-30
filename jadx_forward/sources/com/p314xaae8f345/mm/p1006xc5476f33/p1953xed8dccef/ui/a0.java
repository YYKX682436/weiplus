package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class a0 implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f234799d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f234800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.b0 f234801f;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.b0 b0Var, java.lang.String str) {
        this.f234801f = b0Var;
        this.f234799d = null;
        this.f234800e = str;
        android.widget.ImageView imageView = (android.widget.ImageView) ((android.view.LayoutInflater) b0Var.f234803d.getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cab, (android.view.ViewGroup) null);
        this.f234799d = imageView;
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o(str);
        ((x60.e) fVar).getClass();
        imageView.setImageBitmap(x51.w0.d(oVar));
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.y(this, b0Var));
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.lang.String str2 = this.f234800e;
        if (str2 != null && str.equals(str2)) {
            this.f234799d.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.z(this, bitmap));
        }
    }
}
