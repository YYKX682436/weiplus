package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar */
/* loaded from: classes15.dex */
public class C12273x1a8cfd10 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public oe1.i1 f165160d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f165161e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f165162f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f165163g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f165164h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f165165i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f165166m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f165167n;

    /* renamed from: o, reason: collision with root package name */
    public int f165168o;

    /* renamed from: p, reason: collision with root package name */
    public int f165169p;

    /* renamed from: q, reason: collision with root package name */
    public int f165170q;

    /* renamed from: r, reason: collision with root package name */
    public int f165171r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f165172s;

    /* renamed from: t, reason: collision with root package name */
    public float f165173t;

    /* renamed from: u, reason: collision with root package name */
    public int f165174u;

    /* renamed from: v, reason: collision with root package name */
    public int f165175v;

    /* renamed from: w, reason: collision with root package name */
    public int f165176w;

    /* renamed from: x, reason: collision with root package name */
    public int f165177x;

    public C12273x1a8cfd10(android.content.Context context) {
        super(context);
        this.f165160d = null;
        this.f165161e = null;
        this.f165163g = null;
        this.f165164h = null;
        this.f165165i = null;
        this.f165168o = 0;
        this.f165169p = 0;
        this.f165170q = 0;
        this.f165171r = 0;
        this.f165172s = false;
        this.f165173t = 0.0f;
        this.f165174u = -1;
        this.f165175v = -1;
        this.f165176w = -1;
        this.f165177x = -1;
        o();
    }

    /* renamed from: getBarLen */
    public int m51409x11ddf3f8() {
        if (this.f165170q <= 0) {
            this.f165170q = this.f165163g.getWidth();
        }
        return this.f165170q;
    }

    /* renamed from: getBarPointWidth */
    public int mo51410x5853ad3() {
        if (this.f165171r <= 0) {
            this.f165171r = this.f165164h.getWidth();
        }
        return this.f165171r;
    }

    /* renamed from: getCurrentTimeByBarPoint */
    public int m51411xfcd54d84() {
        return java.lang.Math.max(0, (int) (((((((android.widget.FrameLayout.LayoutParams) this.f165164h.getLayoutParams()).leftMargin - (((android.widget.FrameLayout.LayoutParams) this.f165163g.getLayoutParams()).leftMargin - this.f165164h.getPaddingLeft())) + (((mo51410x5853ad3() - this.f165164h.getPaddingLeft()) - this.f165164h.getPaddingRight()) / 2)) * 1.0d) / m51409x11ddf3f8()) * this.f165168o));
    }

    /* renamed from: getLayoutId */
    public int mo51412x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569645hh;
    }

    /* renamed from: getVideoTotalTime */
    public int m51413xdf1112ec() {
        return this.f165168o;
    }

    /* renamed from: getmPosition */
    public int m51414xd98b9220() {
        return this.f165169p;
    }

    public void o() {
        android.view.View inflate = android.view.View.inflate(getContext(), mo51412x2ee31f5b(), this);
        this.f165161e = inflate;
        this.f165162f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kxj);
        this.f165163g = (android.widget.ImageView) this.f165161e.findViewById(com.p314xaae8f345.mm.R.id.kxi);
        this.f165164h = (android.widget.ImageView) this.f165161e.findViewById(com.p314xaae8f345.mm.R.id.kxm);
        this.f165165i = (android.widget.ImageView) this.f165161e.findViewById(com.p314xaae8f345.mm.R.id.kwj);
        this.f165166m = (android.widget.TextView) this.f165161e.findViewById(com.p314xaae8f345.mm.R.id.kwl);
        this.f165167n = (android.widget.TextView) this.f165161e.findViewById(com.p314xaae8f345.mm.R.id.kxa);
        this.f165164h.setOnTouchListener(new df1.a(this));
        this.f165164h.post(new df1.b(this));
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f165162f.getLayoutParams();
        layoutParams.width = 0;
        this.f165162f.setLayoutParams(layoutParams);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.f165170q = 0;
        if (i17 != this.f165174u || i18 != this.f165175v || i19 != this.f165176w || i27 != this.f165177x) {
            q();
        }
        this.f165174u = i17;
        this.f165175v = i18;
        this.f165176w = i19;
        this.f165177x = i27;
    }

    public java.lang.String p(int i17) {
        if (i17 < 10) {
            return "0" + i17;
        }
        return i17 + "";
    }

    public void q() {
        if (this.f165168o == 0 || this.f165172s || this.f165164h == null || m51409x11ddf3f8() == 0) {
            return;
        }
        int mo51410x5853ad3 = ((mo51410x5853ad3() - this.f165164h.getPaddingLeft()) - this.f165164h.getPaddingRight()) / 2;
        this.f165166m.setText(p(this.f165169p / 60) + ":" + p(this.f165169p % 60));
        int paddingLeft = ((android.widget.FrameLayout.LayoutParams) this.f165163g.getLayoutParams()).leftMargin - this.f165164h.getPaddingLeft();
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f165164h.getLayoutParams();
        layoutParams.leftMargin = (((int) (((((double) this.f165169p) * 1.0d) / ((double) this.f165168o)) * ((double) m51409x11ddf3f8()))) + paddingLeft) - mo51410x5853ad3;
        this.f165164h.setLayoutParams(layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.f165162f.getLayoutParams();
        layoutParams2.width = (int) (((this.f165169p * 1.0d) / this.f165168o) * m51409x11ddf3f8());
        this.f165162f.setLayoutParams(layoutParams2);
    }

    public void r() {
        this.f165167n.setText(p(this.f165168o / 60) + ":" + p(this.f165168o % 60));
        q();
    }

    /* renamed from: setIplaySeekCallback */
    public void m51415xbdcdae58(oe1.i1 i1Var) {
        this.f165160d = i1Var;
    }

    /* renamed from: setIsPlay */
    public void mo51416x11f3be80(boolean z17) {
        if (z17) {
            this.f165165i.setImageResource(com.p314xaae8f345.mm.R.raw.f80597x98b04fb0);
        } else {
            this.f165165i.setImageResource(com.p314xaae8f345.mm.R.raw.f80598x945d4014);
        }
    }

    /* renamed from: setOnPlayButtonClickListener */
    public void mo51417xb892d55(android.view.View.OnClickListener onClickListener) {
        this.f165165i.setOnClickListener(onClickListener);
    }

    /* renamed from: setVideoTotalTime */
    public void mo51418xa7077af8(int i17) {
        this.f165168o = i17;
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            post(new df1.c(this));
        } else {
            r();
        }
    }

    public C12273x1a8cfd10(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f165160d = null;
        this.f165161e = null;
        this.f165163g = null;
        this.f165164h = null;
        this.f165165i = null;
        this.f165168o = 0;
        this.f165169p = 0;
        this.f165170q = 0;
        this.f165171r = 0;
        this.f165172s = false;
        this.f165173t = 0.0f;
        this.f165174u = -1;
        this.f165175v = -1;
        this.f165176w = -1;
        this.f165177x = -1;
        o();
    }

    public C12273x1a8cfd10(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f165160d = null;
        this.f165161e = null;
        this.f165163g = null;
        this.f165164h = null;
        this.f165165i = null;
        this.f165168o = 0;
        this.f165169p = 0;
        this.f165170q = 0;
        this.f165171r = 0;
        this.f165172s = false;
        this.f165173t = 0.0f;
        this.f165174u = -1;
        this.f165175v = -1;
        this.f165176w = -1;
        this.f165177x = -1;
        o();
    }
}
