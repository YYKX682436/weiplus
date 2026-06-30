package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui;

/* renamed from: com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar */
/* loaded from: classes3.dex */
public class C17688x1a8cfd10 extends android.widget.RelativeLayout implements m34.d {

    /* renamed from: d, reason: collision with root package name */
    public m34.e f244004d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f244005e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f244006f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f244007g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f244008h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f244009i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f244010m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f244011n;

    /* renamed from: o, reason: collision with root package name */
    public int f244012o;

    /* renamed from: p, reason: collision with root package name */
    public int f244013p;

    /* renamed from: q, reason: collision with root package name */
    public int f244014q;

    /* renamed from: r, reason: collision with root package name */
    public int f244015r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f244016s;

    /* renamed from: t, reason: collision with root package name */
    public float f244017t;

    /* renamed from: u, reason: collision with root package name */
    public int f244018u;

    /* renamed from: v, reason: collision with root package name */
    public int f244019v;

    /* renamed from: w, reason: collision with root package name */
    public int f244020w;

    /* renamed from: x, reason: collision with root package name */
    public int f244021x;

    public C17688x1a8cfd10(android.content.Context context) {
        super(context);
        this.f244004d = null;
        this.f244005e = null;
        this.f244007g = null;
        this.f244008h = null;
        this.f244009i = null;
        this.f244012o = 0;
        this.f244013p = 0;
        this.f244014q = 0;
        this.f244015r = 0;
        this.f244016s = false;
        this.f244017t = 0.0f;
        this.f244018u = -1;
        this.f244019v = -1;
        this.f244020w = -1;
        this.f244021x = -1;
        j();
    }

    public void a(int i17) {
        this.f244013p = i17;
        m();
    }

    public void c(int i17) {
        a(i17);
    }

    public void e(boolean z17) {
        mo61296x11f3be80(z17);
    }

    @Override // m34.d
    public void g() {
        this.f244014q = 0;
    }

    /* renamed from: getBarLen */
    public int mo69278x11ddf3f8() {
        if (this.f244014q <= 0) {
            this.f244014q = this.f244007g.getWidth();
        }
        return this.f244014q;
    }

    /* renamed from: getBarPointWidth */
    public int mo69279x5853ad3() {
        if (this.f244015r <= 0) {
            this.f244015r = this.f244008h.getWidth();
        }
        return this.f244015r;
    }

    /* renamed from: getCurrentTimeByBarPoint */
    public int m69280xfcd54d84() {
        return java.lang.Math.max(0, (int) (((((((android.widget.FrameLayout.LayoutParams) this.f244008h.getLayoutParams()).leftMargin - (((android.widget.FrameLayout.LayoutParams) this.f244007g.getLayoutParams()).leftMargin - this.f244008h.getPaddingLeft())) + (((mo69279x5853ad3() - this.f244008h.getPaddingLeft()) - this.f244008h.getPaddingRight()) / 2)) * 1.0d) / mo69278x11ddf3f8()) * this.f244012o));
    }

    /* renamed from: getLayoutId */
    public int mo61294x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d3m;
    }

    @Override // m34.d
    /* renamed from: getVideoTotalTime */
    public int mo69281xdf1112ec() {
        return this.f244012o;
    }

    /* renamed from: getmPosition */
    public int m69282xd98b9220() {
        return this.f244013p;
    }

    public void j() {
        android.view.View inflate = android.view.View.inflate(getContext(), mo61294x2ee31f5b(), this);
        this.f244005e = inflate;
        this.f244006f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kxj);
        this.f244007g = (android.widget.ImageView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.kxi);
        this.f244008h = (android.widget.ImageView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.kxm);
        this.f244009i = (android.widget.ImageView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.kwj);
        this.f244010m = (android.widget.TextView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.kwl);
        this.f244011n = (android.widget.TextView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.kxa);
        this.f244008h.setOnTouchListener(new m34.a(this));
        this.f244008h.post(new m34.b(this));
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f244006f.getLayoutParams();
        layoutParams.width = 0;
        this.f244006f.setLayoutParams(layoutParams);
    }

    public java.lang.String k(int i17) {
        if (i17 < 10) {
            return "0" + i17;
        }
        return i17 + "";
    }

    public void m() {
        if (this.f244012o == 0 || this.f244016s || this.f244008h == null || mo69278x11ddf3f8() == 0) {
            return;
        }
        int mo69279x5853ad3 = ((mo69279x5853ad3() - this.f244008h.getPaddingLeft()) - this.f244008h.getPaddingRight()) / 2;
        this.f244010m.setText(k(this.f244013p / 60) + ":" + k(this.f244013p % 60));
        int paddingLeft = ((android.widget.FrameLayout.LayoutParams) this.f244007g.getLayoutParams()).leftMargin - this.f244008h.getPaddingLeft();
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f244008h.getLayoutParams();
        layoutParams.leftMargin = (((int) (((((double) this.f244013p) * 1.0d) / ((double) this.f244012o)) * ((double) mo69278x11ddf3f8()))) + paddingLeft) - mo69279x5853ad3;
        this.f244008h.setLayoutParams(layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.f244006f.getLayoutParams();
        layoutParams2.width = (int) (((this.f244013p * 1.0d) / this.f244012o) * mo69278x11ddf3f8());
        this.f244006f.setLayoutParams(layoutParams2);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.f244014q = 0;
        if (i17 != this.f244018u || i18 != this.f244019v || i19 != this.f244020w || i27 != this.f244021x) {
            m();
        }
        this.f244018u = i17;
        this.f244019v = i18;
        this.f244020w = i19;
        this.f244021x = i27;
    }

    public void q() {
        this.f244011n.setText(k(this.f244012o / 60) + ":" + k(this.f244012o % 60));
        m();
    }

    @Override // m34.d
    /* renamed from: setIplaySeekCallback */
    public void mo69283xbdcdae58(m34.e eVar) {
        this.f244004d = eVar;
    }

    /* renamed from: setIsPlay */
    public void mo61296x11f3be80(boolean z17) {
        if (z17) {
            this.f244009i.setImageResource(com.p314xaae8f345.mm.R.raw.f80597x98b04fb0);
        } else {
            this.f244009i.setImageResource(com.p314xaae8f345.mm.R.raw.f80598x945d4014);
        }
    }

    @Override // m34.d
    /* renamed from: setOnPlayButtonClickListener */
    public void mo69284xb892d55(android.view.View.OnClickListener onClickListener) {
        this.f244009i.setOnClickListener(onClickListener);
    }

    /* renamed from: setVideoTotalTime */
    public void mo61298xa7077af8(int i17) {
        this.f244012o = i17;
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            post(new m34.c(this));
        } else {
            q();
        }
    }

    public C17688x1a8cfd10(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f244004d = null;
        this.f244005e = null;
        this.f244007g = null;
        this.f244008h = null;
        this.f244009i = null;
        this.f244012o = 0;
        this.f244013p = 0;
        this.f244014q = 0;
        this.f244015r = 0;
        this.f244016s = false;
        this.f244017t = 0.0f;
        this.f244018u = -1;
        this.f244019v = -1;
        this.f244020w = -1;
        this.f244021x = -1;
        j();
    }

    public C17688x1a8cfd10(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f244004d = null;
        this.f244005e = null;
        this.f244007g = null;
        this.f244008h = null;
        this.f244009i = null;
        this.f244012o = 0;
        this.f244013p = 0;
        this.f244014q = 0;
        this.f244015r = 0;
        this.f244016s = false;
        this.f244017t = 0.0f;
        this.f244018u = -1;
        this.f244019v = -1;
        this.f244020w = -1;
        this.f244021x = -1;
        j();
    }
}
