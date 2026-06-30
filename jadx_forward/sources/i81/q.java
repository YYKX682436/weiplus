package i81;

/* loaded from: classes7.dex */
public class q extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f371138d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f371139e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f371140f;

    /* renamed from: g, reason: collision with root package name */
    public i81.b f371141g;

    /* renamed from: h, reason: collision with root package name */
    public i81.p f371142h;

    public q(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        super(context);
        this.f371138d = c11510xdd90c2f2;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f371139e = frameLayout;
        addView(frameLayout, new android.view.ViewGroup.LayoutParams(-1, -1));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        this.f371140f = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, new android.view.ViewGroup.LayoutParams(-1, -2));
        if (linearLayout.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            xi1.f mo51615x8408480b = c11510xdd90c2f2.mo48803xee5260a9().mo51615x8408480b();
            int i17 = mo51615x8408480b == null ? 0 : mo51615x8408480b.f536235a;
            ((android.view.ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).topMargin = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeAdViewContainer[AppBrandSplashAd]", "fakeActionBarLayout topMargin=%d", java.lang.Integer.valueOf(i17));
        }
    }

    public final void a(boolean z17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.yc ycVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12762x8fe39d2d m147349x6d6c1ef1;
        int i17;
        int i18;
        int i19;
        mi1.v vVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeAdViewContainer[AppBrandSplashAd]", "hideOnMainThread, animation:%s, source:%s", java.lang.Boolean.valueOf(z17), str);
        if (!z17) {
            i81.p pVar = this.f371142h;
            if (pVar != null) {
                pVar.a(str);
            }
            setVisibility(8);
            return;
        }
        if (ycVar != null) {
            i17 = (int) ycVar.f171886a;
            i19 = (int) ycVar.f171887b;
            i18 = ((int) ycVar.f171888c) / 2;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f371138d;
            if (c11510xdd90c2f2 == null || (vVar = c11510xdd90c2f2.f156354z) == null) {
                i81.b bVar = this.f371141g;
                m147349x6d6c1ef1 = bVar != null ? bVar.f371056f.m147349x6d6c1ef1() : null;
            } else {
                m147349x6d6c1ef1 = vVar.d();
            }
            i17 = 0;
            if (m147349x6d6c1ef1 != null) {
                int width = m147349x6d6c1ef1.getWidth();
                int height = m147349x6d6c1ef1.getHeight();
                int[] iArr = new int[2];
                m147349x6d6c1ef1.getLocationInWindow(iArr);
                i17 = iArr[0] + (width / 2);
                int i27 = height / 2;
                i19 = iArr[1] + i27;
                i18 = i27;
            } else {
                i18 = 0;
                i19 = 0;
            }
        }
        if (i17 <= 0 || i19 <= 0 || !isAttachedToWindow()) {
            i81.p pVar2 = this.f371142h;
            if (pVar2 != null) {
                pVar2.a(str);
            }
            setVisibility(8);
            return;
        }
        i81.m mVar = new i81.m(this, str);
        android.animation.Animator createCircularReveal = android.view.ViewAnimationUtils.createCircularReveal(this, i17, i19, (float) java.lang.Math.hypot(i17, i19), i18);
        createCircularReveal.addListener(new i81.o(this, mVar));
        createCircularReveal.setDuration(300L).setInterpolator(new android.view.animation.DecelerateInterpolator());
        createCircularReveal.start();
    }

    public void b() {
        android.widget.LinearLayout linearLayout = this.f371140f;
        linearLayout.removeAllViews();
        i81.b bVar = new i81.b(getContext(), this.f371138d);
        this.f371141g = bVar;
        linearLayout.addView(bVar.mo2206x5ca2d9f1());
        this.f371141g.f371054d.m2222xad580900(true);
        this.f371141g.f371054d.m(false);
        al1.b bVar2 = this.f371141g.f371054d;
        bVar2.f87271o.setVisibility(8);
        bVar2.requestLayout();
        this.f371141g.a(false, al1.h0.PageConfig);
        this.f371141g.f371054d.mo134899x67f06213(0);
    }

    /* renamed from: getContentContainer */
    public android.view.ViewGroup m134913xda5977e() {
        return this.f371139e;
    }

    /* renamed from: getFakeActionBar */
    public i81.b m134914xcfb7c672() {
        return this.f371141g;
    }

    /* renamed from: getRuntime */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 m134915x9a3f0ba2() {
        return this.f371138d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeAdViewContainer[AppBrandSplashAd]", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        i81.p pVar = this.f371142h;
        if (pVar != null) {
            pVar.mo48845x3f5eee52();
        }
    }

    /* renamed from: setActionBarFullscreenMode */
    public void m134916x65c88099(boolean z17) {
        i81.b bVar = this.f371141g;
        if (bVar != null) {
            bVar.f371054d.m2222xad580900(z17);
        }
    }

    /* renamed from: setBackButtonClickListener */
    public void m134917x1ae0b121(android.view.View.OnClickListener onClickListener) {
        i81.b bVar = this.f371141g;
        if (bVar != null) {
            bVar.mo2215x1ae0b121(onClickListener);
        }
    }

    /* renamed from: setBarTopMargin */
    public void m134918x1b5b3612(int i17) {
        if (this.f371141g != null) {
            ((android.view.ViewGroup.MarginLayoutParams) this.f371140f.getLayoutParams()).topMargin = i17;
        }
    }

    /* renamed from: setCloseButtonClickListener */
    public void m134919x262881b4(android.view.View.OnClickListener onClickListener) {
        i81.b bVar = this.f371141g;
        if (bVar != null) {
            bVar.mo2218x262881b4(onClickListener);
        }
    }

    /* renamed from: setForegroundStyle */
    public void m134920xf5e6816c(boolean z17) {
        i81.b bVar = this.f371141g;
        if (bVar != null) {
            bVar.f371054d.m2221xf5e6816c(z17);
        }
    }

    /* renamed from: setOnHideListener */
    public void m134921x9d906497(i81.p pVar) {
        this.f371142h = pVar;
    }

    /* renamed from: setOptionButtonClickListener */
    public void m134922x9b5ddf53(android.view.View.OnClickListener onClickListener) {
        i81.b bVar = this.f371141g;
        if (bVar != null) {
            bVar.f371054d.m2230x9b5ddf53(onClickListener);
        }
    }

    /* renamed from: setTitle */
    public void m134923x53bfe316(java.lang.String str) {
        i81.b bVar = this.f371141g;
        if (bVar != null) {
            bVar.mo2224x4c2b09dd(str);
        }
    }
}
