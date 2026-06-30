package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44;

/* renamed from: com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar */
/* loaded from: classes3.dex */
public class C19229x611ccebb extends com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.z0 {
    public static final /* synthetic */ int D = 0;
    public int A;
    public int B;
    public int C;

    /* renamed from: y, reason: collision with root package name */
    public float f263242y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f263243z;

    public C19229x611ccebb(android.content.Context context) {
        super(context);
        this.f263243z = false;
        this.A = -1;
        this.B = -1;
        this.C = -1;
    }

    /* renamed from: getBarPointPaddingLeft */
    private int m74118x94c02f05() {
        if (this.B == -1) {
            this.B = this.f244008h.getPaddingLeft();
        }
        return this.B;
    }

    /* renamed from: getBarPointPaddingRight */
    private int m74119x39c12de() {
        if (this.C == -1) {
            this.C = this.f244008h.getPaddingRight();
        }
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurProgressBarLen */
    public int m74120xd56b4f39() {
        return this.f244006f.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurTimeByProgressBar */
    public int m74121xec4e9a18() {
        return (int) (((m74120xd56b4f39() * 1.0d) / mo69278x11ddf3f8()) * this.f244012o);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10, m34.d
    public void a(int i17) {
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = this.f244012o;
        if (i17 >= i18) {
            i17 = i18;
        }
        if (this.f244013p != i17) {
            this.f244013p = i17;
            m();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    /* renamed from: getBarLen */
    public int mo69278x11ddf3f8() {
        return this.f244007g.getWidth();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    /* renamed from: getBarPointWidth */
    public int mo69279x5853ad3() {
        if (this.A == -1) {
            this.A = this.f244008h.getWidth();
        }
        return this.A;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    /* renamed from: getLayoutId */
    public int mo61294x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d3n;
    }

    /* renamed from: getPlayBtn */
    public android.widget.ImageView m74122x20617a52() {
        return this.f244009i;
    }

    /* renamed from: getPlaytimeTv */
    public android.widget.TextView m74123x8451ea59() {
        return this.f244010m;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    public void j() {
        android.view.View inflate = android.view.View.inflate(getContext(), mo61294x2ee31f5b(), this);
        this.f244005e = inflate;
        this.f244006f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kxj);
        this.f244007g = (android.widget.ImageView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.kxi);
        this.f244008h = (android.widget.ImageView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.kxm);
        this.f244009i = (android.widget.ImageView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.kwj);
        this.f244010m = (android.widget.TextView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.kwl);
        this.f244011n = (android.widget.TextView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.kxa);
        this.f244008h.setOnTouchListener(new bw4.d(this));
        this.f244008h.addOnLayoutChangeListener(new bw4.e(this));
        this.f244007g.addOnLayoutChangeListener(new bw4.f(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    public void m() {
        int mo69278x11ddf3f8;
        if (this.f244012o == 0 || this.f244016s || this.f244008h == null || mo69278x11ddf3f8() == 0) {
            return;
        }
        if (this.f244013p == this.f244012o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "test");
        }
        this.f244010m.setText(k(this.f244013p / 60) + ":" + k(this.f244013p % 60));
        int i17 = this.f244013p;
        if (i17 <= 0) {
            mo69278x11ddf3f8 = 0;
        } else {
            int i18 = this.f244012o;
            mo69278x11ddf3f8 = i17 >= i18 ? mo69278x11ddf3f8() : (int) (((i17 * 1.0d) / i18) * mo69278x11ddf3f8());
        }
        v(mo69278x11ddf3f8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10, m34.d
    /* renamed from: setIsPlay */
    public void mo61296x11f3be80(boolean z17) {
        this.f263243z = z17;
        super.mo61296x11f3be80(z17);
    }

    /* renamed from: setPlayBtnOnClickListener */
    public void m74124x325c7617(android.view.View.OnClickListener onClickListener) {
        android.widget.ImageView imageView = this.f244009i;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10, m34.d, com.p314xaae8f345.mm.p2470x93e71c27.ui.z0
    /* renamed from: setVideoTotalTime */
    public void mo61298xa7077af8(int i17) {
        this.f244012o = i17;
        this.f244013p = 0;
        this.f244011n.setText(k(this.f244012o / 60) + ":" + k(this.f244012o % 60));
        m();
    }

    public void v(int i17) {
        if (i17 > mo69278x11ddf3f8()) {
            i17 = mo69278x11ddf3f8();
        } else if (i17 < 0) {
            i17 = 0;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f244008h.getLayoutParams();
        layoutParams.leftMargin = (((android.widget.FrameLayout.LayoutParams) this.f244007g.getLayoutParams()).leftMargin + (i17 > mo69278x11ddf3f8() ? mo69278x11ddf3f8() : i17)) - (mo69279x5853ad3() >>> 1);
        this.f244008h.setLayoutParams(layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.f244006f.getLayoutParams();
        layoutParams2.width = i17;
        this.f244006f.setLayoutParams(layoutParams2);
        this.f244008h.requestLayout();
        this.f244006f.requestLayout();
    }

    public C19229x611ccebb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f263243z = false;
        this.A = -1;
        this.B = -1;
        this.C = -1;
    }

    public C19229x611ccebb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f263243z = false;
        this.A = -1;
        this.B = -1;
        this.C = -1;
    }
}
