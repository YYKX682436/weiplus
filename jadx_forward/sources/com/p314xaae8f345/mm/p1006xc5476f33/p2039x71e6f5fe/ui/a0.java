package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes5.dex */
public class a0 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f241029d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f241030e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f241031f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final int f241032g;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17298xea2f7277 activityC17298xea2f7277, android.content.Context context) {
        this.f241029d = context;
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
        this.f241032g = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560766tl);
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        android.widget.ImageView a17;
        if (bitmap == null || bitmap.isRecycled() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (a17 = a(str)) == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.z(this, a17, bitmap));
    }

    public final android.widget.ImageView a(java.lang.String str) {
        java.util.Map map = this.f241031f;
        if (((java.util.HashMap) map).containsKey(str)) {
            return (android.widget.ImageView) ((java.util.HashMap) map).get(str);
        }
        android.widget.ImageView imageView = new android.widget.ImageView(this.f241029d);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        ((java.util.HashMap) map).put(str, imageView);
        return imageView;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        viewGroup.removeView((android.widget.ImageView) obj);
        java.lang.String str = (java.lang.String) this.f241030e.get(i17);
        java.util.HashMap hashMap = (java.util.HashMap) this.f241031f;
        if (hashMap.containsKey(str)) {
            hashMap.remove(str);
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f241030e.size();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup viewGroup, int i17) {
        java.lang.String str = (java.lang.String) this.f241030e.get(i17);
        android.widget.ImageView a17 = a(str);
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        e04.s3 s3Var = new e04.s3(str);
        ((x60.e) fVar).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(s3Var);
        if (d17 == null || d17.isRecycled()) {
            a17.setImageBitmap(null);
            a17.setBackgroundColor(this.f241032g);
        } else {
            a17.setImageBitmap(d17);
            a17.setBackgroundColor(0);
        }
        try {
            viewGroup.addView(a17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProductFurtherInfoUI", "Add view failed: " + e17.getMessage());
        }
        return a17;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }
}
