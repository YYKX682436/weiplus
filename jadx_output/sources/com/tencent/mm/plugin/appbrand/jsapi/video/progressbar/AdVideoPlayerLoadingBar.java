package com.tencent.mm.plugin.appbrand.jsapi.video.progressbar;

/* loaded from: classes15.dex */
public class AdVideoPlayerLoadingBar extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public oe1.i1 f83627d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f83628e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f83629f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f83630g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f83631h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f83632i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f83633m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f83634n;

    /* renamed from: o, reason: collision with root package name */
    public int f83635o;

    /* renamed from: p, reason: collision with root package name */
    public int f83636p;

    /* renamed from: q, reason: collision with root package name */
    public int f83637q;

    /* renamed from: r, reason: collision with root package name */
    public int f83638r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f83639s;

    /* renamed from: t, reason: collision with root package name */
    public float f83640t;

    /* renamed from: u, reason: collision with root package name */
    public int f83641u;

    /* renamed from: v, reason: collision with root package name */
    public int f83642v;

    /* renamed from: w, reason: collision with root package name */
    public int f83643w;

    /* renamed from: x, reason: collision with root package name */
    public int f83644x;

    public AdVideoPlayerLoadingBar(android.content.Context context) {
        super(context);
        this.f83627d = null;
        this.f83628e = null;
        this.f83630g = null;
        this.f83631h = null;
        this.f83632i = null;
        this.f83635o = 0;
        this.f83636p = 0;
        this.f83637q = 0;
        this.f83638r = 0;
        this.f83639s = false;
        this.f83640t = 0.0f;
        this.f83641u = -1;
        this.f83642v = -1;
        this.f83643w = -1;
        this.f83644x = -1;
        o();
    }

    public int getBarLen() {
        if (this.f83637q <= 0) {
            this.f83637q = this.f83630g.getWidth();
        }
        return this.f83637q;
    }

    public int getBarPointWidth() {
        if (this.f83638r <= 0) {
            this.f83638r = this.f83631h.getWidth();
        }
        return this.f83638r;
    }

    public int getCurrentTimeByBarPoint() {
        return java.lang.Math.max(0, (int) (((((((android.widget.FrameLayout.LayoutParams) this.f83631h.getLayoutParams()).leftMargin - (((android.widget.FrameLayout.LayoutParams) this.f83630g.getLayoutParams()).leftMargin - this.f83631h.getPaddingLeft())) + (((getBarPointWidth() - this.f83631h.getPaddingLeft()) - this.f83631h.getPaddingRight()) / 2)) * 1.0d) / getBarLen()) * this.f83635o));
    }

    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488112hh;
    }

    public int getVideoTotalTime() {
        return this.f83635o;
    }

    public int getmPosition() {
        return this.f83636p;
    }

    public void o() {
        android.view.View inflate = android.view.View.inflate(getContext(), getLayoutId(), this);
        this.f83628e = inflate;
        this.f83629f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.kxj);
        this.f83630g = (android.widget.ImageView) this.f83628e.findViewById(com.tencent.mm.R.id.kxi);
        this.f83631h = (android.widget.ImageView) this.f83628e.findViewById(com.tencent.mm.R.id.kxm);
        this.f83632i = (android.widget.ImageView) this.f83628e.findViewById(com.tencent.mm.R.id.kwj);
        this.f83633m = (android.widget.TextView) this.f83628e.findViewById(com.tencent.mm.R.id.kwl);
        this.f83634n = (android.widget.TextView) this.f83628e.findViewById(com.tencent.mm.R.id.kxa);
        this.f83631h.setOnTouchListener(new df1.a(this));
        this.f83631h.post(new df1.b(this));
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f83629f.getLayoutParams();
        layoutParams.width = 0;
        this.f83629f.setLayoutParams(layoutParams);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.f83637q = 0;
        if (i17 != this.f83641u || i18 != this.f83642v || i19 != this.f83643w || i27 != this.f83644x) {
            q();
        }
        this.f83641u = i17;
        this.f83642v = i18;
        this.f83643w = i19;
        this.f83644x = i27;
    }

    public java.lang.String p(int i17) {
        if (i17 < 10) {
            return "0" + i17;
        }
        return i17 + "";
    }

    public void q() {
        if (this.f83635o == 0 || this.f83639s || this.f83631h == null || getBarLen() == 0) {
            return;
        }
        int barPointWidth = ((getBarPointWidth() - this.f83631h.getPaddingLeft()) - this.f83631h.getPaddingRight()) / 2;
        this.f83633m.setText(p(this.f83636p / 60) + ":" + p(this.f83636p % 60));
        int paddingLeft = ((android.widget.FrameLayout.LayoutParams) this.f83630g.getLayoutParams()).leftMargin - this.f83631h.getPaddingLeft();
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f83631h.getLayoutParams();
        layoutParams.leftMargin = (((int) (((((double) this.f83636p) * 1.0d) / ((double) this.f83635o)) * ((double) getBarLen()))) + paddingLeft) - barPointWidth;
        this.f83631h.setLayoutParams(layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.f83629f.getLayoutParams();
        layoutParams2.width = (int) (((this.f83636p * 1.0d) / this.f83635o) * getBarLen());
        this.f83629f.setLayoutParams(layoutParams2);
    }

    public void r() {
        this.f83634n.setText(p(this.f83635o / 60) + ":" + p(this.f83635o % 60));
        q();
    }

    public void setIplaySeekCallback(oe1.i1 i1Var) {
        this.f83627d = i1Var;
    }

    public void setIsPlay(boolean z17) {
        if (z17) {
            this.f83632i.setImageResource(com.tencent.mm.R.raw.media_player_pause_btn);
        } else {
            this.f83632i.setImageResource(com.tencent.mm.R.raw.media_player_play_btn);
        }
    }

    public void setOnPlayButtonClickListener(android.view.View.OnClickListener onClickListener) {
        this.f83632i.setOnClickListener(onClickListener);
    }

    public void setVideoTotalTime(int i17) {
        this.f83635o = i17;
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            post(new df1.c(this));
        } else {
            r();
        }
    }

    public AdVideoPlayerLoadingBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83627d = null;
        this.f83628e = null;
        this.f83630g = null;
        this.f83631h = null;
        this.f83632i = null;
        this.f83635o = 0;
        this.f83636p = 0;
        this.f83637q = 0;
        this.f83638r = 0;
        this.f83639s = false;
        this.f83640t = 0.0f;
        this.f83641u = -1;
        this.f83642v = -1;
        this.f83643w = -1;
        this.f83644x = -1;
        o();
    }

    public AdVideoPlayerLoadingBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f83627d = null;
        this.f83628e = null;
        this.f83630g = null;
        this.f83631h = null;
        this.f83632i = null;
        this.f83635o = 0;
        this.f83636p = 0;
        this.f83637q = 0;
        this.f83638r = 0;
        this.f83639s = false;
        this.f83640t = 0.0f;
        this.f83641u = -1;
        this.f83642v = -1;
        this.f83643w = -1;
        this.f83644x = -1;
        o();
    }
}
