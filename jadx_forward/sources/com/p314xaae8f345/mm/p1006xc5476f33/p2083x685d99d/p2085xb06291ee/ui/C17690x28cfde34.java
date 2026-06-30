package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui;

/* renamed from: com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar */
/* loaded from: classes15.dex */
public class C17690x28cfde34 extends android.widget.RelativeLayout implements m34.d {

    /* renamed from: d, reason: collision with root package name */
    public m34.e f244023d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f244024e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f244025f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f244026g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f244027h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f244028i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f244029m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f244030n;

    /* renamed from: o, reason: collision with root package name */
    public int f244031o;

    /* renamed from: p, reason: collision with root package name */
    public int f244032p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f244033q;

    /* renamed from: r, reason: collision with root package name */
    public float f244034r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f244035s;

    /* renamed from: t, reason: collision with root package name */
    public int f244036t;

    /* renamed from: u, reason: collision with root package name */
    public int f244037u;

    /* renamed from: v, reason: collision with root package name */
    public int f244038v;

    /* renamed from: w, reason: collision with root package name */
    public int f244039w;

    public C17690x28cfde34(android.content.Context context) {
        super(context);
        this.f244023d = null;
        this.f244024e = null;
        this.f244026g = null;
        this.f244027h = null;
        this.f244028i = null;
        this.f244031o = 0;
        this.f244032p = 0;
        this.f244033q = false;
        this.f244034r = 0.0f;
        this.f244035s = false;
        this.f244036t = -1;
        this.f244037u = -1;
        this.f244038v = -1;
        this.f244039w = -1;
        e();
    }

    public static int b(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17690x28cfde34 c17690x28cfde34, int i17) {
        int width = ((c17690x28cfde34.f244027h.getWidth() - c17690x28cfde34.f244027h.getPaddingLeft()) - c17690x28cfde34.f244027h.getPaddingRight()) / 2;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c17690x28cfde34.f244026g.getLayoutParams();
        if (i17 < (layoutParams.leftMargin - c17690x28cfde34.f244027h.getPaddingLeft()) - width) {
            i17 = layoutParams.leftMargin - c17690x28cfde34.f244027h.getPaddingLeft();
        } else if (i17 > c17690x28cfde34.m69304x11ddf3f8()) {
            i17 = c17690x28cfde34.m69304x11ddf3f8();
        }
        return i17 - width;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getBarLen */
    public int m69304x11ddf3f8() {
        return this.f244026g.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentTimeByBarPoint */
    public int m69305xfcd54d84() {
        int paddingLeft = (int) ((((((android.widget.FrameLayout.LayoutParams) this.f244027h.getLayoutParams()).leftMargin - (((android.widget.FrameLayout.LayoutParams) this.f244026g.getLayoutParams()).leftMargin - this.f244027h.getPaddingLeft())) * 1.0d) / m69304x11ddf3f8()) * this.f244031o);
        if (paddingLeft < 0) {
            return 0;
        }
        return paddingLeft;
    }

    @Override // m34.d
    public void a(int i17) {
        this.f244032p = i17;
        h();
    }

    public final void e() {
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cq6, this);
        this.f244024e = inflate;
        this.f244025f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kxj);
        this.f244026g = (android.widget.ImageView) this.f244024e.findViewById(com.p314xaae8f345.mm.R.id.kxi);
        this.f244027h = (android.widget.ImageView) this.f244024e.findViewById(com.p314xaae8f345.mm.R.id.kxm);
        this.f244028i = (android.widget.ImageView) this.f244024e.findViewById(com.p314xaae8f345.mm.R.id.kwj);
        this.f244029m = (android.widget.TextView) this.f244024e.findViewById(com.p314xaae8f345.mm.R.id.kwl);
        this.f244030n = (android.widget.TextView) this.f244024e.findViewById(com.p314xaae8f345.mm.R.id.kxa);
        this.f244027h.setOnTouchListener(new m34.o(this));
    }

    public java.lang.String f(int i17) {
        if (i17 < 10) {
            return "0" + i17;
        }
        return i17 + "";
    }

    @Override // m34.d
    public void g() {
    }

    /* renamed from: getIsPlay */
    public boolean m69306x1ebe8a74() {
        return this.f244035s;
    }

    @Override // m34.d
    /* renamed from: getVideoTotalTime */
    public int mo69281xdf1112ec() {
        return this.f244031o;
    }

    public void h() {
        if (this.f244031o == 0 || this.f244033q || this.f244027h == null || m69304x11ddf3f8() == 0) {
            return;
        }
        int width = ((this.f244027h.getWidth() - this.f244027h.getPaddingLeft()) - this.f244027h.getPaddingRight()) / 2;
        this.f244029m.setText(f(this.f244032p / 60) + ":" + f(this.f244032p % 60));
        int paddingLeft = ((android.widget.FrameLayout.LayoutParams) this.f244026g.getLayoutParams()).leftMargin - this.f244027h.getPaddingLeft();
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f244027h.getLayoutParams();
        layoutParams.leftMargin = (((int) (((((double) this.f244032p) * 1.0d) / ((double) this.f244031o)) * ((double) m69304x11ddf3f8()))) + paddingLeft) - width;
        this.f244027h.setLayoutParams(layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.f244025f.getLayoutParams();
        layoutParams2.width = (int) (((this.f244032p * 1.0d) / this.f244031o) * m69304x11ddf3f8());
        this.f244025f.setLayoutParams(layoutParams2);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (i17 != this.f244036t || i18 != this.f244037u || i19 != this.f244038v || i27 != this.f244039w) {
            h();
        }
        this.f244036t = i17;
        this.f244037u = i18;
        this.f244038v = i19;
        this.f244039w = i27;
    }

    @Override // m34.d
    /* renamed from: setIplaySeekCallback */
    public void mo69283xbdcdae58(m34.e eVar) {
        this.f244023d = eVar;
    }

    @Override // m34.d
    /* renamed from: setIsPlay */
    public void mo61296x11f3be80(boolean z17) {
        this.f244035s = z17;
        if (z17) {
            this.f244028i.setImageResource(com.p314xaae8f345.mm.R.raw.f80597x98b04fb0);
        } else {
            this.f244028i.setImageResource(com.p314xaae8f345.mm.R.raw.f80598x945d4014);
        }
    }

    @Override // m34.d
    /* renamed from: setOnPlayButtonClickListener */
    public void mo69284xb892d55(android.view.View.OnClickListener onClickListener) {
        this.f244028i.setOnClickListener(onClickListener);
    }

    @Override // m34.d, com.p314xaae8f345.mm.p2470x93e71c27.ui.z0
    /* renamed from: setVideoTotalTime */
    public void mo61298xa7077af8(int i17) {
        if (this.f244027h.isShown() && this.f244027h.getWidth() == 0) {
            post(new m34.p(this, i17));
            return;
        }
        this.f244031o = i17;
        this.f244032p = 0;
        this.f244030n.setText(f(this.f244031o / 60) + ":" + f(this.f244031o % 60));
        h();
    }

    public C17690x28cfde34(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f244023d = null;
        this.f244024e = null;
        this.f244026g = null;
        this.f244027h = null;
        this.f244028i = null;
        this.f244031o = 0;
        this.f244032p = 0;
        this.f244033q = false;
        this.f244034r = 0.0f;
        this.f244035s = false;
        this.f244036t = -1;
        this.f244037u = -1;
        this.f244038v = -1;
        this.f244039w = -1;
        e();
    }

    public C17690x28cfde34(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f244023d = null;
        this.f244024e = null;
        this.f244026g = null;
        this.f244027h = null;
        this.f244028i = null;
        this.f244031o = 0;
        this.f244032p = 0;
        this.f244033q = false;
        this.f244034r = 0.0f;
        this.f244035s = false;
        this.f244036t = -1;
        this.f244037u = -1;
        this.f244038v = -1;
        this.f244039w = -1;
        e();
    }
}
