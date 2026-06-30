package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes3.dex */
public class p3 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f223241d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f223242e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View[] f223243f;

    public p3(android.content.Context context, java.lang.String[] strArr) {
        this.f223242e = new java.lang.String[0];
        this.f223241d = context;
        if (strArr != null) {
            this.f223242e = strArr;
        }
        this.f223243f = new android.view.View[this.f223242e.length];
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        viewGroup.removeView((android.view.View) obj);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f223242e.length;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup viewGroup, int i17) {
        android.view.View[] viewArr = this.f223243f;
        android.view.View view = viewArr[i17];
        if (view == null) {
            view = android.view.View.inflate(this.f223241d, com.p314xaae8f345.mm.R.C30864xbddafb2a.bdl, null);
            viewArr[i17] = view;
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.glc);
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.gle);
            progressBar.setVisibility(0);
            n11.a b17 = n11.a.b();
            java.lang.String str = this.f223242e[i17];
            o11.f fVar = new o11.f();
            fVar.f423612c = true;
            b17.i(str, imageView, fVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.n3(this, progressBar));
        }
        viewGroup.addView(view);
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.o3(this));
        return view;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }
}
