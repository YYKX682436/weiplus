package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar */
/* loaded from: classes15.dex */
public class C12275xe1ab67bf extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10 implements oe1.g1 {
    public int A;
    public int B;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f f165184y;

    /* renamed from: z, reason: collision with root package name */
    public int f165185z;

    public C12275xe1ab67bf(android.content.Context context) {
        super(context);
        this.f165184y = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        this.f165185z = -1;
        this.A = -1;
        this.B = -1;
    }

    /* renamed from: getBarPointPaddingLeft */
    private int m51440x94c02f05() {
        if (this.A == -1) {
            this.A = this.f165164h.getPaddingLeft();
        }
        return this.A;
    }

    /* renamed from: getBarPointPaddingRight */
    private int m51441x39c12de() {
        if (this.B == -1) {
            this.B = this.f165164h.getPaddingRight();
        }
        return this.B;
    }

    public static int s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf c12275xe1ab67bf, int i17, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f) {
        int m51440x94c02f05 = ((android.widget.FrameLayout.LayoutParams) c12275xe1ab67bf.f165163g.getLayoutParams()).leftMargin - c12275xe1ab67bf.m51440x94c02f05();
        int i18 = i17 - m51440x94c02f05;
        int i19 = c12275xe1ab67bf.f165168o;
        int m51409x11ddf3f8 = (int) (((i18 * 1.0d) / c12275xe1ab67bf.m51409x11ddf3f8()) * i19);
        c19767x257d7f.f38864x6ac9171 = m51409x11ddf3f8;
        if (m51409x11ddf3f8 <= 0) {
            c19767x257d7f.f38864x6ac9171 = 0;
            if (i18 > m51440x94c02f05) {
                m51440x94c02f05 = i18;
            }
            return m51440x94c02f05;
        }
        if (m51409x11ddf3f8 < i19) {
            return i18;
        }
        c19767x257d7f.f38864x6ac9171 = i19;
        return c12275xe1ab67bf.m51409x11ddf3f8() - (((c12275xe1ab67bf.mo51410x5853ad3() - c12275xe1ab67bf.m51440x94c02f05()) - c12275xe1ab67bf.m51441x39c12de()) / 2);
    }

    public void a(int i17) {
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = this.f165168o;
        if (i17 >= i18) {
            i17 = i18;
        }
        if (this.f165169p != i17) {
            this.f165169p = i17;
            q();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10
    /* renamed from: getBarPointWidth */
    public int mo51410x5853ad3() {
        if (this.f165185z == -1) {
            this.f165185z = this.f165164h.getWidth();
        }
        return this.f165185z;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10
    /* renamed from: getLayoutId */
    public int mo51412x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569646hi;
    }

    /* renamed from: getPlayBtn */
    public android.widget.ImageView m51442x20617a52() {
        return this.f165165i;
    }

    /* renamed from: getPlaytimeTv */
    public android.widget.TextView m51443x8451ea59() {
        return this.f165166m;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10
    public void o() {
        android.view.View inflate = android.view.View.inflate(getContext(), mo51412x2ee31f5b(), this);
        this.f165161e = inflate;
        this.f165162f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kxj);
        this.f165163g = (android.widget.ImageView) this.f165161e.findViewById(com.p314xaae8f345.mm.R.id.kxi);
        this.f165164h = (android.widget.ImageView) this.f165161e.findViewById(com.p314xaae8f345.mm.R.id.kxm);
        this.f165165i = (android.widget.ImageView) this.f165161e.findViewById(com.p314xaae8f345.mm.R.id.kwj);
        this.f165166m = (android.widget.TextView) this.f165161e.findViewById(com.p314xaae8f345.mm.R.id.kwl);
        this.f165167n = (android.widget.TextView) this.f165161e.findViewById(com.p314xaae8f345.mm.R.id.kxa);
        this.f165164h.setOnTouchListener(new df1.g(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10
    public void q() {
        if (this.f165168o == 0 || this.f165172s || this.f165164h == null || m51409x11ddf3f8() == 0) {
            return;
        }
        this.f165166m.setText(p(this.f165169p / 60) + ":" + p(this.f165169p % 60));
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f165164h.getLayoutParams();
        int m51409x11ddf3f8 = m51409x11ddf3f8();
        layoutParams.leftMargin = t(this.f165169p, m51409x11ddf3f8);
        this.f165164h.setLayoutParams(layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.f165162f.getLayoutParams();
        layoutParams2.width = (int) (((this.f165169p * 1.0d) / this.f165168o) * m51409x11ddf3f8);
        this.f165162f.setLayoutParams(layoutParams2);
        requestLayout();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10, oe1.f1
    /* renamed from: setIsPlay */
    public void mo51416x11f3be80(boolean z17) {
        super.mo51416x11f3be80(z17);
    }

    /* renamed from: setPlayBtnOnClickListener */
    public void m51444x325c7617(android.view.View.OnClickListener onClickListener) {
        android.widget.ImageView imageView = this.f165165i;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12273x1a8cfd10, oe1.g1
    /* renamed from: setVideoTotalTime */
    public void mo51418xa7077af8(int i17) {
        this.f165168o = i17;
        this.f165169p = 0;
        this.f165167n.setText(p(this.f165168o / 60) + ":" + p(this.f165168o % 60));
        q();
    }

    public int t(int i17, int i18) {
        if (i17 <= 0) {
            return 0;
        }
        int i19 = this.f165168o;
        return i17 >= i19 ? i18 - (((mo51410x5853ad3() - m51440x94c02f05()) - m51441x39c12de()) / 2) : (int) (((i17 * 1.0d) / i19) * i18);
    }

    public C12275xe1ab67bf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f165184y = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        this.f165185z = -1;
        this.A = -1;
        this.B = -1;
    }

    public C12275xe1ab67bf(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f165184y = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        this.f165185z = -1;
        this.A = -1;
        this.B = -1;
    }
}
