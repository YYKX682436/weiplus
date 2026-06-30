package com.tencent.mm.plugin.appbrand.share.widget;

/* loaded from: classes15.dex */
public class WxaShareMessagePage extends android.widget.LinearLayout implements l01.u, androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f88851d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f88852e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f88853f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.ThreeDotsLoadingView f88854g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f88855h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f88856i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f88857m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f88858n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f88859o;

    /* renamed from: p, reason: collision with root package name */
    public k01.s0 f88860p;

    /* renamed from: q, reason: collision with root package name */
    public k01.t0 f88861q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f88862r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f88863s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f88864t;

    public WxaShareMessagePage(android.content.Context context) {
        super(context);
        e(context);
    }

    @Override // l01.u
    public void b() {
        this.f88854g.setVisibility(4);
        this.f88854g.f();
        this.f88852e.setImageBitmap(null);
        this.f88853f.setVisibility(0);
        k01.s0 s0Var = this.f88860p;
        if (s0Var != null) {
            s0Var.a(1);
        }
    }

    @Override // l01.u
    public void d() {
    }

    public final void e(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.d_u, this);
        this.f88862r = inflate.findViewById(com.tencent.mm.R.id.gdr);
        this.f88852e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.cl7);
        this.f88853f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.dhg);
        this.f88851d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        this.f88864t = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f487556oz4);
        this.f88854g = (com.tencent.mm.ui.widget.ThreeDotsLoadingView) inflate.findViewById(com.tencent.mm.R.id.imn);
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bnp, (android.view.ViewGroup) inflate, false);
        this.f88858n = (android.widget.ImageView) inflate2.findViewById(com.tencent.mm.R.id.mt8);
        this.f88859o = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.mt9);
        this.f88855h = (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.oe9);
        this.f88856i = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.he_);
        this.f88857m = (com.tencent.mm.ui.widget.MMSwitchBtn) inflate.findViewById(com.tencent.mm.R.id.oe8);
        ((android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.cg7)).addView(inflate2);
        setGravity(17);
        this.f88856i.setOnClickListener(new jj1.a(this));
        setTag(com.tencent.mm.R.id.a0m, java.lang.Boolean.FALSE);
        this.f88857m.setSwitchListener(new jj1.b(this));
    }

    public android.widget.ImageView getCoverImageView() {
        return this.f88852e;
    }

    public android.widget.ImageView getErrorImageView() {
        return this.f88853f;
    }

    public com.tencent.mm.ui.widget.ThreeDotsLoadingView getLoadingView() {
        return this.f88854g;
    }

    public android.widget.ImageView getVideoIcon() {
        return this.f88864t;
    }

    public int getWidgetHeight() {
        return ik1.w.c(180);
    }

    public int getWidgetWidth() {
        return ik1.w.c(224);
    }

    @Override // l01.i0
    public java.lang.String key() {
        return ik1.i0.a(this);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public void onActivityDestroyed() {
        this.f88854g.f();
        l01.d0.f314761a.e(this);
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        this.f88854g.setVisibility(4);
        this.f88854g.f();
        if (bitmap == null || bitmap.isRecycled()) {
            this.f88852e.setImageBitmap(null);
            this.f88853f.setVisibility(0);
        } else {
            this.f88852e.setImageBitmap(bitmap);
            this.f88853f.setVisibility(4);
        }
        k01.s0 s0Var = this.f88860p;
        if (s0Var != null) {
            s0Var.a(0);
        }
    }

    public void setImageData(android.graphics.Bitmap bitmap) {
        l01.r rVar;
        this.f88852e.setVisibility(0);
        this.f88854g.setVisibility(4);
        this.f88853f.setVisibility(4);
        if (bitmap == null || bitmap.isRecycled()) {
            this.f88852e.setImageBitmap(null);
            return;
        }
        if (this.f88863s) {
            this.f88852e.setImageBitmap(bitmap);
            return;
        }
        ij1.j jVar = (ij1.j) ((k01.u0) i95.n0.c(k01.u0.class));
        jVar.getClass();
        java.lang.String format = java.lang.String.format("%d-%d-dp", 112, 90);
        java.lang.ref.SoftReference softReference = (java.lang.ref.SoftReference) ((java.util.concurrent.ConcurrentHashMap) jVar.f291679e).get(format);
        if (softReference == null || (rVar = (l01.r) softReference.get()) == null) {
            synchronized (jVar) {
                java.lang.ref.SoftReference softReference2 = (java.lang.ref.SoftReference) ((java.util.concurrent.ConcurrentHashMap) jVar.f291679e).get(format);
                if (softReference2 == null || (rVar = (l01.r) softReference2.get()) == null) {
                    hj1.b bVar = new hj1.b(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 112), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 90));
                    ((java.util.concurrent.ConcurrentHashMap) jVar.f291679e).put(format, new java.lang.ref.SoftReference(bVar));
                    rVar = bVar;
                }
            }
        }
        this.f88852e.setImageBitmap(rVar.c(bitmap));
    }

    public void setImageUrl(java.lang.String str) {
        this.f88854g.setVisibility(0);
        this.f88854g.e();
        this.f88853f.setVisibility(4);
        this.f88852e.setVisibility(0);
        if (!this.f88863s) {
            l01.d0.f314761a.n(this, str, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Bi(112, 90));
            return;
        }
        l01.d0.f314761a.n(this, str, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Di(112, 90, k01.r0.DECODE_TYPE_ORIGIN));
    }

    public void setOnLoadImageResult(k01.s0 s0Var) {
        this.f88860p = s0Var;
    }

    public void setTitle(java.lang.String str) {
        this.f88851d.setText(str);
    }

    public WxaShareMessagePage(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public WxaShareMessagePage(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        e(context);
    }
}
