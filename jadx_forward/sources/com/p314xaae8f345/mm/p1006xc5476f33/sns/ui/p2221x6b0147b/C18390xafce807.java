package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b;

/* renamed from: com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView */
/* loaded from: classes4.dex */
public class C18390xafce807 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d {

    /* renamed from: t2, reason: collision with root package name */
    public static final /* synthetic */ int f252171t2 = 0;

    /* renamed from: k2, reason: collision with root package name */
    public xd4.d0 f252172k2;

    /* renamed from: l2, reason: collision with root package name */
    public xd4.j0 f252173l2;

    /* renamed from: m2, reason: collision with root package name */
    public java.lang.String f252174m2;

    /* renamed from: n2, reason: collision with root package name */
    public long f252175n2;

    /* renamed from: o2, reason: collision with root package name */
    public android.view.View f252176o2;

    /* renamed from: p2, reason: collision with root package name */
    public volatile boolean f252177p2;

    /* renamed from: q2, reason: collision with root package name */
    public boolean f252178q2;

    /* renamed from: r2, reason: collision with root package name */
    public volatile boolean f252179r2;

    /* renamed from: s2, reason: collision with root package name */
    public xd4.e0 f252180s2;

    public C18390xafce807(android.content.Context context, boolean z17) {
        super(context, z17);
        this.f252172k2 = xd4.d0.AVAILABLE;
        this.f252175n2 = 0L;
        this.f252177p2 = false;
        this.f252178q2 = false;
        this.f252179r2 = false;
        this.f252180s2 = null;
        e0();
    }

    private void e0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        this.f252176o2 = findViewById(com.p314xaae8f345.mm.R.id.f569100p13);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d
    public void B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        c0(this.f252174m2);
        this.f252174m2 = "";
        super.B();
        this.f252177p2 = false;
        this.f252179r2 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%d on destroy succ", java.lang.Integer.valueOf(hashCode()));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d
    public void C() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        d0();
        super.C();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d
    public void F() {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.B;
        if (f4Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 c18696xc5bcd349 = (com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349) f4Var;
            try {
                bitmap = c18696xc5bcd349.getBitmap(c18696xc5bcd349.getWidth() / 2, c18696xc5bcd349.getHeight() / 2);
            } catch (java.lang.OutOfMemoryError unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.SnsOnlineVideoView", "OOM occurs, ignore bitmap");
                bitmap = null;
            }
            if (bitmap != null) {
                this.F.setImageBitmap(bitmap);
            }
        }
        super.F();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d
    public void K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        super.K();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%s resumePlay, setState PLAYING", java.lang.Integer.valueOf(hashCode()));
        this.f252172k2 = xd4.d0.PLAYING;
        this.f252175n2 = java.lang.System.currentTimeMillis();
        d0();
        U(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public void b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doUICallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        try {
            xd4.e0 e0Var = this.f252180s2;
            if (e0Var != null) {
                e0Var.a(this.f252174m2);
                this.f252180s2 = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Sns.SnsOnlineVideoView", e17, "doUICallback", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUICallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public final void c0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doUICallbackAsync", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        if (this.f252180s2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            post(new xd4.c0(this, str));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUICallbackAsync", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public void d0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hidePlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        android.view.View view = this.f252176o2;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/video/SnsTimelineVideoView", "hidePlayBtn", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/video/SnsTimelineVideoView", "hidePlayBtn", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%s refreshPlayBtn gone", java.lang.Integer.valueOf(hashCode()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hidePlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public boolean f0() {
        boolean z17;
        ph3.o oVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPause", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.B;
        if (f4Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) {
            ph3.k kVar = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) f4Var).f272983m;
            z17 = (kVar == null || (oVar = kVar.f435961f) == null || oVar.f435980j != 4) ? false : true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPause", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
            return z17;
        }
        if (f4Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349) {
            z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349) f4Var).f256139u == 6;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPause", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
            return z17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.SnsOnlineVideoView", "videoview not VideoPlayerTextureView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPause", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        return false;
    }

    public void g0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroyAsync", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%d onDestroyAsync", java.lang.Integer.valueOf(hashCode()));
        c0(this.f252174m2);
        this.f252174m2 = "";
        this.f252177p2 = true;
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
        ((ku5.t0) ku5.t0.f394148d).g(new xd4.b0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroyAsync", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    /* renamed from: getInnerVideoView */
    public android.view.View m71200xab066d00() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInnerVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        java.lang.Object obj = this.B;
        if (!(obj instanceof android.view.View)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInnerVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
            return null;
        }
        android.view.View view = (android.view.View) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInnerVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        return view;
    }

    public void h0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroyWithoutCallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        this.f252174m2 = "";
        super.B();
        this.f252177p2 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%d onDestroyWithoutCallback succ", java.lang.Integer.valueOf(hashCode()));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroyWithoutCallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public void i0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        F();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%s pausePlay, setState ATTACHING", java.lang.Integer.valueOf(hashCode()));
        this.f252172k2 = xd4.d0.ATTACHING;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showPlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
            android.view.View view = this.f252176o2;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/video/SnsTimelineVideoView", "showPlayBtn", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/video/SnsTimelineVideoView", "showPlayBtn", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%s refreshPlayBtn visible", java.lang.Integer.valueOf(hashCode()));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showPlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        }
        t();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public void j0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlayWithoutChangePlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        i0(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%s pausePlayWithoutChangePlayBtn, setState ATTACHING", java.lang.Integer.valueOf(hashCode()));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlayWithoutChangePlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%s onDetachedFromWindow, setState AVAILABLE, %s", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f252178q2));
        this.f252172k2 = xd4.d0.AVAILABLE;
        if (this.f252178q2) {
            this.f252178q2 = false;
        } else {
            g0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    /* renamed from: setUICallback */
    public void m71201x30fe4db(xd4.e0 e0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUICallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsOnlineVideoView", "%s videoview setUICallback", java.lang.Integer.valueOf(hashCode()));
        this.f252180s2 = e0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUICallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public C18390xafce807(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f252172k2 = xd4.d0.AVAILABLE;
        this.f252175n2 = 0L;
        this.f252177p2 = false;
        this.f252178q2 = false;
        this.f252179r2 = false;
        this.f252180s2 = null;
        e0();
    }

    public C18390xafce807(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f252172k2 = xd4.d0.AVAILABLE;
        this.f252175n2 = 0L;
        this.f252177p2 = false;
        this.f252178q2 = false;
        this.f252179r2 = false;
        this.f252180s2 = null;
        e0();
    }

    public C18390xafce807(android.content.Context context) {
        super(context, (android.util.AttributeSet) null);
        this.f252172k2 = xd4.d0.AVAILABLE;
        this.f252175n2 = 0L;
        this.f252177p2 = false;
        this.f252178q2 = false;
        this.f252179r2 = false;
        this.f252180s2 = null;
        e0();
    }
}
