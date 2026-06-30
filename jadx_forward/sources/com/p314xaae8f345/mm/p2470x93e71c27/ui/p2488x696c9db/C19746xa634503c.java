package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoSightCenterView */
/* loaded from: classes15.dex */
public class C19746xa634503c extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7 {
    public volatile boolean W;

    /* renamed from: p0, reason: collision with root package name */
    public android.media.MediaMetadataRetriever f272997p0;

    /* renamed from: x0, reason: collision with root package name */
    public int f272998x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f272999y0;

    public C19746xa634503c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.W = false;
        this.f272998x0 = 0;
        this.f272999y0 = false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    public void b(double d17) {
        mo69308x9c2553a6();
        if (!this.f272999y0 || mo69308x9c2553a6() <= 0.0d) {
            return;
        }
        super.b(d17 / 1000.0d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a
    public void e(int i17, int i18) {
        super.e(i17, i18);
        if (getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
            layoutParams.addRule(13);
            setLayoutParams(layoutParams);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getCurrentPosition */
    public int mo69307x9746038c() {
        return this.f272998x0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getDuration */
    public int mo69286x51e8b0a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoSightCenterView", "getDuration");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.S)) {
            try {
                if (this.f272997p0 == null) {
                    gp.d dVar = new gp.d();
                    this.f272997p0 = dVar;
                    dVar.setDataSource(this.S);
                }
                int intValue = java.lang.Integer.valueOf(this.f272997p0.extractMetadata(9)).intValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoSightCenterView", "getDuration: %s", java.lang.Integer.valueOf(intValue));
                return intValue;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoSightCenterView", "getDuration error: %s", e17.getMessage());
            }
        }
        return super.mo69286x51e8b0a();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getLastProgresstime */
    public double mo69308x9c2553a6() {
        return super.mo69308x9c2553a6();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: isPlaying */
    public boolean mo69311xc00617a4() {
        return this.f272999y0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: pause */
    public void mo69313x65825f6() {
        super.mo69313x65825f6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a
    /* renamed from: setDrawableWidth */
    public void mo69274xd5e29286(int i17) {
        super.mo69274xd5e29286(i17);
        if (getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
            layoutParams.addRule(13);
            setLayoutParams(layoutParams);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setPlayProgressCallback */
    public void mo69323xc2339c68(boolean z17) {
        if (z17) {
            m69297x8a3eafb7(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s7(this));
        } else {
            m69297x8a3eafb7(null);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: start */
    public boolean mo69330x68ac462() {
        this.f272999y0 = true;
        return super.mo69330x68ac462();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: stop */
    public void mo69303x360802() {
        p();
        this.f272998x0 = 0;
        this.f272999y0 = false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7
    public void t() {
        java.lang.String str = wo.v1.f529366m.D;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (str.equals("other")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoSightCenterView", "init::use other player");
        } else {
            q(true);
        }
        m69296xa4560c71(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r7(this));
    }

    public C19746xa634503c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = false;
        this.f272998x0 = 0;
        this.f272999y0 = false;
    }
}
