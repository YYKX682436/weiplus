package t84;

/* loaded from: classes4.dex */
public class c extends t84.a {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public boolean H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public float f497974J;
    public float K;
    public final float[] L;

    /* renamed from: v, reason: collision with root package name */
    public float f497975v;

    /* renamed from: w, reason: collision with root package name */
    public float f497976w;

    /* renamed from: x, reason: collision with root package name */
    public float f497977x;

    /* renamed from: y, reason: collision with root package name */
    public float f497978y;

    /* renamed from: z, reason: collision with root package name */
    public float f497979z;

    public c(android.content.Context context) {
        super(context);
        this.f497975v = 0.0f;
        this.f497976w = 0.0f;
        this.f497977x = 0.0f;
        this.f497978y = 0.0f;
        this.f497979z = 1.0f;
        this.A = 1.0f;
        this.B = 0.0f;
        this.C = 0.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        this.G = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.f497974J = 0.0f;
        this.K = 1.0f;
        this.L = new float[16];
    }

    public void g(android.graphics.Rect rect) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGlobalVisibleRect", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        t84.h hVar = this.f497971s;
        android.graphics.Rect mo69587x67e8cd1d = hVar != null ? hVar.mo69587x67e8cd1d() : null;
        if (mo69587x67e8cd1d == null) {
            mo69587x67e8cd1d = new android.graphics.Rect();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        float f17 = this.I;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTranslationX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        float f18 = this.f497975v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTranslationX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        rect.left = ((int) (f17 + f18)) + mo69587x67e8cd1d.left;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        float f19 = this.f497974J;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTranslationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        float f27 = this.f497976w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTranslationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        int i17 = ((int) (f19 + f27)) + mo69587x67e8cd1d.top;
        rect.top = i17;
        rect.right = (int) (rect.left + this.f497955c);
        rect.bottom = (int) (i17 + this.f497956d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGlobalVisibleRect", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
    }

    public final float h(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNormalizedDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        float f18 = this.f497970r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        float f19 = f17 / (f18 * 0.5f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNormalizedDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        return f19;
    }

    public void i(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("layout", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        this.I = i17;
        this.f497974J = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSize", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        this.f497955c = i19 - i17;
        this.f497956d = i27 - i18;
        c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSize", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layout", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r5 > 1.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(float r5) {
        /*
            r4 = this;
            java.lang.String r0 = "setAlpha"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            r2 = 0
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 >= 0) goto Lf
        Ld:
            r5 = r2
            goto L16
        Lf:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 <= 0) goto L16
            goto Ld
        L16:
            r4.K = r5
            r4.c()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t84.c.j(float):void");
    }

    public void k(t84.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        this.I = ((android.widget.FrameLayout.LayoutParams) bVar).leftMargin;
        this.f497974J = ((android.widget.FrameLayout.LayoutParams) bVar).topMargin;
        int i17 = ((android.widget.FrameLayout.LayoutParams) bVar).width;
        int i18 = ((android.widget.FrameLayout.LayoutParams) bVar).height;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSize", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        this.f497955c = i17;
        this.f497956d = i18;
        c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSize", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
    }

    public void l(float f17) {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStaticRotation", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        this.f497973u = f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestLayout", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAttached", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        boolean z17 = this.f497969q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAttached", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        if (z17 && (i17 = this.f497953a) != 0 && (i18 = this.f497954b) != 0) {
            e(i17, i18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestLayout", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStaticRotation", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
    }
}
