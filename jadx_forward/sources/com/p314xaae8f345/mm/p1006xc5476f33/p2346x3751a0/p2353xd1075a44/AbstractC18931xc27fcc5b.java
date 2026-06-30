package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44;

/* renamed from: com.tencent.mm.plugin.voip.widget.BaseSmallView */
/* loaded from: classes14.dex */
public abstract class AbstractC18931xc27fcc5b extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.WindowManager f258621d;

    /* renamed from: e, reason: collision with root package name */
    public int f258622e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f258623f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f258624g;

    public AbstractC18931xc27fcc5b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        new android.graphics.PointF();
        new android.graphics.Point();
        new android.graphics.Point();
        new android.graphics.Point();
        this.f258622e = -1;
        this.f258624g = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.b(this);
        this.f258621d = (android.view.WindowManager) context.getSystemService("window");
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        new android.graphics.Point(this.f258621d.getDefaultDisplay().getWidth(), this.f258621d.getDefaultDisplay().getHeight());
    }

    public void c(boolean z17) {
        ((ku5.t0) ku5.t0.f394148d).A("resumeIcon");
        ((ku5.t0) ku5.t0.f394148d).l(this.f258624g, 2000L, "resumeIcon");
    }

    public boolean d() {
        ((ku5.t0) ku5.t0.f394148d).A("resumeIcon");
        return true;
    }

    public void e(int i17) {
    }

    public void f() {
    }

    public void g() {
        ((ku5.t0) ku5.t0.f394148d).A("resumeIcon");
        ((ku5.t0) ku5.t0.f394148d).l(this.f258624g, 2000L, "resumeIcon");
    }

    @java.lang.Deprecated
    /* renamed from: getBeautyData */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 mo72879x47a48e3c() {
        return null;
    }

    @java.lang.Deprecated
    /* renamed from: getSpatioTemporalFilterData */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 mo72880x5f32c090() {
        return null;
    }

    public void h(int i17, int i18) {
    }

    public void i(boolean z17) {
    }

    public void j() {
        this.f258621d = null;
    }

    public void k(java.lang.String str) {
    }

    public void l(java.lang.String str) {
    }

    @Override // android.view.View
    public void onAnimationEnd() {
    }

    @java.lang.Deprecated
    /* renamed from: setCaptureView */
    public void mo72881x79f31d49(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2350xae79c325.p2351x34a233.C18926x6d210aeb c18926x6d210aeb) {
    }

    /* renamed from: setConnectSec */
    public void mo72913xee293109(long j17) {
    }

    @java.lang.Deprecated
    /* renamed from: setHWDecMode */
    public void m72914xa42d8294(int i17) {
    }

    @java.lang.Deprecated
    /* renamed from: setSpatiotemporalDenosing */
    public void m72915x43bc6c4b(int i17) {
    }

    /* renamed from: setStatus */
    public void mo72916x231a26f4(int i17) {
    }

    /* renamed from: setVoicePlayDevice */
    public void mo72882xbbf730ba(int i17) {
        ((ku5.t0) ku5.t0.f394148d).A("resumeIcon");
        ((ku5.t0) ku5.t0.f394148d).l(this.f258624g, 2000L, "resumeIcon");
    }

    @java.lang.Deprecated
    /* renamed from: setVoipBeauty */
    public void m72917x365d9c3e(int i17) {
    }

    /* renamed from: setVoipUIListener */
    public void mo72918x41815e0a(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.BaseSmallView", "hwViewSmall setVoipUIListener, before initHWView");
        this.f258623f = new java.lang.ref.WeakReference(gVar);
    }
}
