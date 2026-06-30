package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B%\b\u0016\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\f¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderHorizontalLongVideoPlayerSeekBar;", "Lcom/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar;", "", "getLayoutId", "_len", "Ljz5/f0;", "setVideoTotalTime", "playTime", "setPlayTimeText", "", "isPlay", "setIsPlay", "", "getVideoTotalTimeMs", "time", "setVideoTotalTimeMs", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar */
/* loaded from: classes2.dex */
public class C15179x385a9ce5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 {
    public long V;
    public long W;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.View f212102l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.View f212103p0;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View f212104x0;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.View f212105y0;

    public C15179x385a9ce5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10, m34.d
    public void a(int i17) {
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = this.f244012o;
        if (i17 > i18) {
            i17 = i18;
        }
        this.f244013p = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    /* renamed from: getLayoutId */
    public int mo61294x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e7q;
    }

    /* renamed from: getVideoTotalTimeMs, reason: from getter */
    public final long getV() {
        return this.V;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    public void j() {
        super.j();
        this.f212103p0 = this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.kxm);
        this.f212104x0 = this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.kxi);
        this.f212105y0 = this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.kxk);
        this.f212102l1 = this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.kxj);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    public void m() {
        int mo69279x5853ad3;
        if (this.V == 0 || this.f244016s || this.f244008h == null || mo69278x11ddf3f8() == 0) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f244008h.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        int mo69278x11ddf3f8 = mo69278x11ddf3f8();
        long j17 = this.W;
        if (j17 <= 0) {
            mo69279x5853ad3 = 0;
        } else {
            long j18 = this.V;
            mo69279x5853ad3 = j17 >= j18 ? mo69278x11ddf3f8 - (((mo69279x5853ad3() - this.f244008h.getPaddingLeft()) - this.f244008h.getPaddingRight()) / 2) : (int) (((j17 * 1.0d) / j18) * mo69278x11ddf3f8);
        }
        layoutParams2.leftMargin = mo69279x5853ad3;
        this.f244008h.setLayoutParams(layoutParams2);
        android.view.ViewGroup.LayoutParams layoutParams3 = this.f244006f.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.width = (int) (((this.W * 1.0d) / this.V) * mo69278x11ddf3f8);
        this.f244006f.setLayoutParams(layoutParams4);
        requestLayout();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10, m34.d
    /* renamed from: setIsPlay */
    public void mo61296x11f3be80(boolean z17) {
        if (this.f272979z == z17) {
            return;
        }
        this.f272979z = z17;
        cw2.e4 playStatusListener = getPlayStatusListener();
        if (playStatusListener != null) {
            playStatusListener.e(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf
    /* renamed from: setPlayTimeText */
    public void mo61297xf1a3e670(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10, m34.d, com.p314xaae8f345.mm.p2470x93e71c27.ui.z0
    /* renamed from: setVideoTotalTime */
    public void mo61298xa7077af8(int i17) {
        this.f244012o = i17;
        this.f244013p = 0;
    }

    /* renamed from: setVideoTotalTimeMs */
    public final void m61299x314a6be(long j17) {
        this.V = j17;
        this.W = 0L;
        m();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21
    public void x(long j17) {
        cw2.e4 playStatusListener = getPlayStatusListener();
        if (playStatusListener != null) {
            playStatusListener.c(j17);
        }
        y(j17);
    }

    public final void y(long j17) {
        if (j17 < 0) {
            j17 = 0;
        }
        long j18 = this.V;
        if (j17 > j18) {
            j17 = j18;
        }
        if (this.W != j17) {
            this.W = j17;
            m();
        }
    }

    public C15179x385a9ce5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
