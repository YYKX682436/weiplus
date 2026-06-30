package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView */
/* loaded from: classes4.dex */
public class C17819x3076c6d5 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77 {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f245434J = 0;
    public boolean A;
    public int B;
    public java.lang.String C;
    public int D;
    public android.graphics.Bitmap E;
    public android.os.Handler F;
    public android.os.HandlerThread G;
    public int H;
    public e94.q I;

    /* renamed from: q, reason: collision with root package name */
    public android.content.Context f245435q;

    /* renamed from: r, reason: collision with root package name */
    public int f245436r;

    /* renamed from: s, reason: collision with root package name */
    public int f245437s;

    /* renamed from: t, reason: collision with root package name */
    public int f245438t;

    /* renamed from: u, reason: collision with root package name */
    public int f245439u;

    /* renamed from: v, reason: collision with root package name */
    public int f245440v;

    /* renamed from: w, reason: collision with root package name */
    public int f245441w;

    /* renamed from: x, reason: collision with root package name */
    public int f245442x;

    /* renamed from: y, reason: collision with root package name */
    public int f245443y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f245444z;

    public C17819x3076c6d5(android.content.Context context) {
        super(context, null);
        this.f245436r = 0;
        this.f245437s = 0;
        this.A = false;
        this.H = 0;
        j(context);
    }

    public static /* synthetic */ e94.q h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17819x3076c6d5 c17819x3076c6d5) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        e94.q qVar = c17819x3076c6d5.I;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        return qVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77
    public void g(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GLTwistRoateCardsView", "glOnSizeChanged, w=" + getWidth() + ", h=" + getHeight());
        if (getWidth() > 0 && getHeight() > 0) {
            this.f245436r = getWidth() / 2;
            this.f245437s = getHeight() + i65.a.b(this.f245435q, 40);
            i();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    public final void i() {
        int cos;
        int sin;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GLTwistRoateCardsView", "doLayout, child=" + m69586x3d79f549() + ", CARD_COUNT=12");
        if (m69586x3d79f549() != 12) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            return;
        }
        for (int i17 = 0; i17 < 12; i17++) {
            t84.c cVar = (t84.c) e(i17);
            if (this.A) {
                double d17 = i17 * 0.5235987755982988d;
                cos = (int) (this.f245438t * java.lang.Math.cos(d17));
                sin = (int) (this.f245438t * java.lang.Math.sin(d17));
                cVar.l(90 - ((i17 * com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) / 12));
            } else {
                double d18 = (-i17) * 0.5235987755982988d;
                cos = (int) (this.f245438t * java.lang.Math.cos(d18));
                sin = (int) (this.f245438t * java.lang.Math.sin(d18));
                cVar.l(((i17 * com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) / 12) + 90);
            }
            int i18 = this.f245436r + cos;
            int i19 = this.f245437s - sin;
            int i27 = this.f245440v;
            int i28 = this.f245442x;
            int i29 = (i27 + (i28 * 2)) / 2;
            int i37 = (this.f245441w + (i28 * 2)) / 2;
            cVar.i(i18 - i29, i19 - i37, i18 + i29, i19 + i37);
            float f17 = this.f245436r;
            float f18 = this.f245437s;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRotationCenter", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
            cVar.H = true;
            cVar.D = f17;
            cVar.E = f18;
            cVar.c();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRotationCenter", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    public final void j(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        this.f245435q = context;
        this.f245442x = i65.a.b(context, 14);
        this.f245443y = i65.a.b(this.f245435q, 8);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("twist_anim_thread");
        this.G = handlerThread;
        handlerThread.setPriority(10);
        this.G.start();
        this.F = new android.os.Handler(this.G.getLooper());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        this.G.quitSafely();
        this.F.removeCallbacksAndMessages(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GLTwistRoateCardsView", "onDetachedFromWindow");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    /* renamed from: setAnimCardView */
    public void m69699xd2703488(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        this.f245444z = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    /* renamed from: setOnCardAnimListener */
    public void m69700xf9c29916(e94.q qVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        this.I = qVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    public C17819x3076c6d5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f245436r = 0;
        this.f245437s = 0;
        this.A = false;
        this.H = 0;
        j(context);
    }
}
