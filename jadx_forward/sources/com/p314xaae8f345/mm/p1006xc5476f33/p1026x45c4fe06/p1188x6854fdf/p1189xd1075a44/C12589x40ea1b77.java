package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1188x6854fdf.p1189xd1075a44;

/* renamed from: com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage */
/* loaded from: classes15.dex */
public class C12589x40ea1b77 extends android.widget.LinearLayout implements l01.u, p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f170384d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f170385e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f170386f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9 f170387g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f170388h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f170389i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f170390m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f170391n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f170392o;

    /* renamed from: p, reason: collision with root package name */
    public k01.s0 f170393p;

    /* renamed from: q, reason: collision with root package name */
    public k01.t0 f170394q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f170395r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f170396s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f170397t;

    public C12589x40ea1b77(android.content.Context context) {
        super(context);
        e(context);
    }

    @Override // l01.u
    public void b() {
        this.f170387g.setVisibility(4);
        this.f170387g.f();
        this.f170385e.setImageBitmap(null);
        this.f170386f.setVisibility(0);
        k01.s0 s0Var = this.f170393p;
        if (s0Var != null) {
            s0Var.a(1);
        }
    }

    @Override // l01.u
    public void d() {
    }

    public final void e(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d_u, this);
        this.f170395r = inflate.findViewById(com.p314xaae8f345.mm.R.id.gdr);
        this.f170385e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cl7);
        this.f170386f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.dhg);
        this.f170384d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        this.f170397t = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569089oz4);
        this.f170387g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9) inflate.findViewById(com.p314xaae8f345.mm.R.id.imn);
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bnp, (android.view.ViewGroup) inflate, false);
        this.f170391n = (android.widget.ImageView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.mt8);
        this.f170392o = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.mt9);
        this.f170388h = (android.widget.RelativeLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.oe9);
        this.f170389i = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.he_);
        this.f170390m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) inflate.findViewById(com.p314xaae8f345.mm.R.id.oe8);
        ((android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.cg7)).addView(inflate2);
        setGravity(17);
        this.f170389i.setOnClickListener(new jj1.a(this));
        setTag(com.p314xaae8f345.mm.R.id.a0m, java.lang.Boolean.FALSE);
        this.f170390m.m81396xb3e0a10a(new jj1.b(this));
    }

    /* renamed from: getCoverImageView */
    public android.widget.ImageView m52691x819099f() {
        return this.f170385e;
    }

    /* renamed from: getErrorImageView */
    public android.widget.ImageView m52692x4986166e() {
        return this.f170386f;
    }

    /* renamed from: getLoadingView */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9 m52693xcc04d8cb() {
        return this.f170387g;
    }

    /* renamed from: getVideoIcon */
    public android.widget.ImageView m52694x4edb80de() {
        return this.f170397t;
    }

    /* renamed from: getWidgetHeight */
    public int m52695x8f53a701() {
        return ik1.w.c(180);
    }

    /* renamed from: getWidgetWidth */
    public int m52696xa25bf4ac() {
        return ik1.w.c(224);
    }

    @Override // l01.i0
    public java.lang.String key() {
        return ik1.i0.a(this);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onActivityDestroyed */
    public void m52697xa9f48fab() {
        this.f170387g.f();
        l01.d0.f396294a.e(this);
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        this.f170387g.setVisibility(4);
        this.f170387g.f();
        if (bitmap == null || bitmap.isRecycled()) {
            this.f170385e.setImageBitmap(null);
            this.f170386f.setVisibility(0);
        } else {
            this.f170385e.setImageBitmap(bitmap);
            this.f170386f.setVisibility(4);
        }
        k01.s0 s0Var = this.f170393p;
        if (s0Var != null) {
            s0Var.a(0);
        }
    }

    /* renamed from: setImageData */
    public void m52698x27621963(android.graphics.Bitmap bitmap) {
        l01.r rVar;
        this.f170385e.setVisibility(0);
        this.f170387g.setVisibility(4);
        this.f170386f.setVisibility(4);
        if (bitmap == null || bitmap.isRecycled()) {
            this.f170385e.setImageBitmap(null);
            return;
        }
        if (this.f170396s) {
            this.f170385e.setImageBitmap(bitmap);
            return;
        }
        ij1.j jVar = (ij1.j) ((k01.u0) i95.n0.c(k01.u0.class));
        jVar.getClass();
        java.lang.String format = java.lang.String.format("%d-%d-dp", 112, 90);
        java.lang.ref.SoftReference softReference = (java.lang.ref.SoftReference) ((java.util.concurrent.ConcurrentHashMap) jVar.f373212e).get(format);
        if (softReference == null || (rVar = (l01.r) softReference.get()) == null) {
            synchronized (jVar) {
                java.lang.ref.SoftReference softReference2 = (java.lang.ref.SoftReference) ((java.util.concurrent.ConcurrentHashMap) jVar.f373212e).get(format);
                if (softReference2 == null || (rVar = (l01.r) softReference2.get()) == null) {
                    hj1.b bVar = new hj1.b(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 112), i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 90));
                    ((java.util.concurrent.ConcurrentHashMap) jVar.f373212e).put(format, new java.lang.ref.SoftReference(bVar));
                    rVar = bVar;
                }
            }
        }
        this.f170385e.setImageBitmap(rVar.c(bitmap));
    }

    /* renamed from: setImageUrl */
    public void m52699x43560096(java.lang.String str) {
        this.f170387g.setVisibility(0);
        this.f170387g.e();
        this.f170386f.setVisibility(4);
        this.f170385e.setVisibility(0);
        if (!this.f170396s) {
            l01.d0.f396294a.n(this, str, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Bi(112, 90));
            return;
        }
        l01.d0.f396294a.n(this, str, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Di(112, 90, k01.r0.DECODE_TYPE_ORIGIN));
    }

    /* renamed from: setOnLoadImageResult */
    public void m52700xf5028871(k01.s0 s0Var) {
        this.f170393p = s0Var;
    }

    /* renamed from: setTitle */
    public void m52701x53bfe316(java.lang.String str) {
        this.f170384d.setText(str);
    }

    public C12589x40ea1b77(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public C12589x40ea1b77(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        e(context);
    }
}
