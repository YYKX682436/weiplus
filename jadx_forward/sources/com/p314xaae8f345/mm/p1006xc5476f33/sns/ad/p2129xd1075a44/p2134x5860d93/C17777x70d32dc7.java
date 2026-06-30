package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer */
/* loaded from: classes4.dex */
public class C17777x70d32dc7 extends android.widget.FrameLayout implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f244846p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f244847d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f244848e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f244849f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f244850g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f244851h;

    /* renamed from: i, reason: collision with root package name */
    public long f244852i;

    /* renamed from: m, reason: collision with root package name */
    public final ym5.v1 f244853m;

    /* renamed from: n, reason: collision with root package name */
    public final ym5.w1 f244854n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f244855o;

    public C17777x70d32dc7(android.content.Context context) {
        this(context, null);
    }

    public static /* synthetic */ android.widget.ImageView a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7 c17777x70d32dc7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        android.widget.ImageView imageView = c17777x70d32dc7.f244848e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        return imageView;
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetPAGViewStatus", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPAGFrameContainer", "resetPAGViewStatus exp is " + th6);
        }
        if (this.f244849f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPAGFrameContainer", "resetPAGViewStatus, mIsReset is true so return");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetPAGViewStatus", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            return;
        }
        android.widget.ImageView imageView = this.f244848e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f244847d;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.f244847d;
            if (c22789xd23e9a9b2 != null) {
                c22789xd23e9a9b2.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.h(this));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPAGFrameContainer", "stop");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopListenPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = this.f244847d;
            if (c22789xd23e9a9b3 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopListenPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            } else {
                try {
                    if (this.f244850g) {
                        this.f244850g = false;
                        c22789xd23e9a9b3.i(this.f244854n);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPAGFrameContainer", "stopListenPagView");
                    }
                } catch (java.lang.Throwable unused) {
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopListenPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b4 = this.f244847d;
            if (c22789xd23e9a9b4 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            } else {
                try {
                    if (this.f244851h) {
                        this.f244851h = false;
                        c22789xd23e9a9b4.j(this.f244853m);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPAGFrameContainer", "stopListenFlushListener");
                    }
                } catch (java.lang.Throwable unused2) {
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            }
            this.f244849f = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPAGFrameContainer", "resetPAGViewStatus");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetPAGViewStatus", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        if (this.f244847d != null) {
            m69528x3ae760af(0.0d);
            this.f244847d.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startListenPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f244847d;
            if (c22789xd23e9a9b == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startListenPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            } else {
                try {
                    if (!this.f244850g) {
                        this.f244850g = true;
                        c22789xd23e9a9b.a(this.f244854n);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPAGFrameContainer", "startListenPagView");
                    }
                } catch (java.lang.Throwable unused) {
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startListenPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            }
            this.f244847d.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.f(this));
            this.f244849f = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPAGFrameContainer", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        b();
        m69527x30f2d575(false);
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPAGFrameContainer", "onDetachedFromWindow");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
    /* renamed from: onPause */
    public void m69526xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPAGFrameContainer", "onPause");
            b();
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        super.onStartTemporaryDetach();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    /* renamed from: setEventListenerEnabled */
    public void m69527x30f2d575(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEventListenerEnabled", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPAGFrameContainer", "setEventListenerEnabled: " + z17);
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f244855o;
        try {
            if (z17) {
                abstractC20980x9b9ad01d.mo48813x58998cd();
            } else {
                abstractC20980x9b9ad01d.mo48814x2efc64();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPAGFrameContainer", "setEventListenerEnabled, exp is" + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEventListenerEnabled", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    /* renamed from: setProgress */
    public void m69528x3ae760af(double d17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setProgress", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f244847d;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.m82582x3ae760af(d17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setProgress", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    /* renamed from: setSnsId */
    public void m69529x53b40971(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsId", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        this.f244852i = j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsId", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    public C17777x70d32dc7(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17777x70d32dc7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f244849f = false;
        this.f244853m = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.d(this);
        this.f244854n = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.e(this);
        this.f244855o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6036x9735b563>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer.6
            {
                this.f39173x3fe91575 = 783234387;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6036x9735b563 c6036x9735b563) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$6");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$6");
                am.av avVar = c6036x9735b563.f136325g;
                int i18 = avVar.f87722a;
                long j17 = avVar.f87723b;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("snsAdInteractionEvent callback, visibility is ");
                sb6.append(i18);
                sb6.append(", snsId is ");
                sb6.append(ca4.z0.t0(j17));
                sb6.append(", curSnsId is ");
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7.f244846p;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7 c17777x70d32dc7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.C17777x70d32dc7.this;
                long j18 = c17777x70d32dc7.f244852i;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                sb6.append(ca4.z0.t0(j18));
                sb6.append(", adPAGFrameContainer hashCode is ");
                sb6.append(c17777x70d32dc7.hashCode());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPAGFrameContainer", sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                long j19 = c17777x70d32dc7.f244852i;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                if (j19 != j17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$6");
                } else {
                    c17777x70d32dc7.setVisibility(i18);
                    if (i18 == 8) {
                        c17777x70d32dc7.m69527x30f2d575(false);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$6");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$6");
                return false;
            }
        };
        if (context instanceof p012xc85e97e9.p093xedfae76a.y) {
            ((p012xc85e97e9.p093xedfae76a.y) context).mo273xed6858b4().a(this);
        }
    }
}
