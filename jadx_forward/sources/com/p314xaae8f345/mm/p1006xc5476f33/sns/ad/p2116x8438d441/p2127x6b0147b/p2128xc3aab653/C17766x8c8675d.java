package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2127x6b0147b.p2128xc3aab653;

/* renamed from: com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView */
/* loaded from: classes4.dex */
public class C17766x8c8675d extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d {

    /* renamed from: k2, reason: collision with root package name */
    public java.lang.String f244783k2;

    /* renamed from: l2, reason: collision with root package name */
    public volatile int f244784l2;

    /* renamed from: m2, reason: collision with root package name */
    public android.view.View f244785m2;

    public C17766x8c8675d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f244784l2 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        this.f244785m2 = findViewById(com.p314xaae8f345.mm.R.id.f569100p13);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d
    public void B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        hashCode();
        super.B();
        this.f244784l2 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d
    public void C() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        this.f244784l2 = 1;
        b0();
        super.C();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d
    public void K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        this.f244784l2 = 1;
        super.K();
        b0();
        U(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    public void b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hidePlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        android.view.View view = this.f244785m2;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/video/online/CardOnlineVideoView", "hidePlayBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/video/online/CardOnlineVideoView", "hidePlayBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hidePlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    /* renamed from: getMediaId */
    public java.lang.String m69504x75e04be9() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        java.lang.String str = this.f244783k2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        return str;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        super.onAttachedToWindow();
        hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        super.onDetachedFromWindow();
        hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("asyncStop", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        hashCode();
        this.f244783k2 = "";
        if (this.f244784l2 == 2 || this.f244784l2 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("asyncStop", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        } else {
            fk4.u uVar = this.f247996y1;
            if (uVar != null) {
                ((fk4.k) uVar).p();
                this.f247996y1 = null;
            }
            if (this.G != null) {
                this.G.p();
                this.G.d();
                this.G = null;
            }
            t();
            this.f244784l2 = 2;
            ((ku5.t0) ku5.t0.f394148d).g(new z74.d(this));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("asyncStop", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    /* renamed from: setMediaId */
    public void m69505xe951995d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMediaId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        this.f244783k2 = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMediaId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    public C17766x8c8675d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f244784l2 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        this.f244785m2 = findViewById(com.p314xaae8f345.mm.R.id.f569100p13);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }
}
