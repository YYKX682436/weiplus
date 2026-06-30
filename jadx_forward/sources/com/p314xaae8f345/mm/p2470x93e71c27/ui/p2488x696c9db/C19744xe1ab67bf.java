package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar */
/* loaded from: classes3.dex */
public class C19744xe1ab67bf extends com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.z0 {
    public static final /* synthetic */ int D = 0;
    public int A;
    public int B;
    public int C;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f f272978y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f272979z;

    public C19744xe1ab67bf(android.content.Context context) {
        super(context);
        this.f272978y = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        this.f272979z = false;
        this.A = -1;
        this.B = -1;
        this.C = -1;
    }

    /* renamed from: getBarPointPaddingLeft */
    private int m75822x94c02f05() {
        if (this.B == -1) {
            this.B = this.f244008h.getPaddingLeft();
        }
        return this.B;
    }

    /* renamed from: getBarPointPaddingRight */
    private int m75823x39c12de() {
        if (this.C == -1) {
            this.C = this.f244008h.getPaddingRight();
        }
        return this.C;
    }

    public static int s(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf c19744xe1ab67bf, int i17, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f) {
        int m75822x94c02f05 = ((android.widget.FrameLayout.LayoutParams) c19744xe1ab67bf.f244007g.getLayoutParams()).leftMargin - c19744xe1ab67bf.m75822x94c02f05();
        int i18 = i17 - m75822x94c02f05;
        int i19 = c19744xe1ab67bf.f244012o;
        int mo69278x11ddf3f8 = (int) (((i18 * 1.0d) / c19744xe1ab67bf.mo69278x11ddf3f8()) * i19);
        c19767x257d7f.f38864x6ac9171 = mo69278x11ddf3f8;
        if (mo69278x11ddf3f8 <= 0) {
            c19767x257d7f.f38864x6ac9171 = 0;
            if (i18 > m75822x94c02f05) {
                m75822x94c02f05 = i18;
            }
            return m75822x94c02f05;
        }
        if (mo69278x11ddf3f8 < i19) {
            return i18;
        }
        c19767x257d7f.f38864x6ac9171 = i19;
        return c19744xe1ab67bf.mo69278x11ddf3f8() - (((c19744xe1ab67bf.mo69279x5853ad3() - c19744xe1ab67bf.m75822x94c02f05()) - c19744xe1ab67bf.m75823x39c12de()) / 2);
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
    public android.widget.ImageView m75824x20617a52() {
        return this.f244009i;
    }

    /* renamed from: getPlaytimeTv */
    public android.widget.TextView m75825x8451ea59() {
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
        this.f244008h.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n7(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    public void m() {
        if (this.f244012o == 0 || this.f244016s || this.f244008h == null || mo69278x11ddf3f8() == 0) {
            return;
        }
        mo61297xf1a3e670(this.f244013p);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f244008h.getLayoutParams();
        int mo69278x11ddf3f8 = mo69278x11ddf3f8();
        layoutParams.leftMargin = u(this.f244013p, mo69278x11ddf3f8);
        this.f244008h.setLayoutParams(layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.f244006f.getLayoutParams();
        layoutParams2.width = (int) (((this.f244013p * 1.0d) / this.f244012o) * mo69278x11ddf3f8);
        this.f244006f.setLayoutParams(layoutParams2);
        requestLayout();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10, m34.d
    /* renamed from: setIsPlay */
    public void mo61296x11f3be80(boolean z17) {
        this.f272979z = z17;
        super.mo61296x11f3be80(z17);
    }

    /* renamed from: setPlayBtnOnClickListener */
    public void m75826x325c7617(android.view.View.OnClickListener onClickListener) {
        android.widget.ImageView imageView = this.f244009i;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: setPlayTimeText */
    public void mo61297xf1a3e670(int i17) {
        this.f244010m.setText(k(i17 / 60) + ":" + k(i17 % 60));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10, m34.d, com.p314xaae8f345.mm.p2470x93e71c27.ui.z0
    /* renamed from: setVideoTotalTime */
    public void mo61298xa7077af8(int i17) {
        this.f244012o = i17;
        this.f244013p = 0;
        this.f244011n.setText(k(this.f244012o / 60) + ":" + k(this.f244012o % 60));
        m();
    }

    public int u(int i17, int i18) {
        if (i17 <= 0) {
            return 0;
        }
        int i19 = this.f244012o;
        return i17 >= i19 ? i18 - (((mo69279x5853ad3() - m75822x94c02f05()) - m75823x39c12de()) / 2) : (int) (((i17 * 1.0d) / i19) * i18);
    }

    public C19744xe1ab67bf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f272978y = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        this.f272979z = false;
        this.A = -1;
        this.B = -1;
        this.C = -1;
    }

    public C19744xe1ab67bf(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f272978y = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        this.f272979z = false;
        this.A = -1;
        this.B = -1;
        this.C = -1;
    }
}
