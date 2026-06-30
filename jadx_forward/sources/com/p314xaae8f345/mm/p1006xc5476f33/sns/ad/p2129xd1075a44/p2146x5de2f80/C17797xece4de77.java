package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer */
/* loaded from: classes4.dex */
public class C17797xece4de77 extends android.opengl.GLSurfaceView implements t84.h {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f245109p = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f245110d;

    /* renamed from: e, reason: collision with root package name */
    public int f245111e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f245112f;

    /* renamed from: g, reason: collision with root package name */
    public int f245113g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f245114h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f245115i;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f245116m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f245117n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f245118o;

    public C17797xece4de77(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f245112f = false;
        this.f245114h = new java.util.HashMap();
        this.f245115i = new java.util.ArrayList();
        this.f245116m = new float[16];
        this.f245117n = new float[16];
        this.f245118o = new float[16];
        setEGLContextClientVersion(2);
        setZOrderOnTop(true);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(1);
        setRenderer(new t84.g(this, context));
        setRenderMode(0);
    }

    public static /* synthetic */ java.util.ArrayList a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77 c17797xece4de77) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        java.util.ArrayList arrayList = c17797xece4de77.f245115i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return arrayList;
    }

    public static /* synthetic */ int b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77 c17797xece4de77) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        int i17 = c17797xece4de77.f245110d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return i17;
    }

    public static /* synthetic */ int c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77 c17797xece4de77) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        int i17 = c17797xece4de77.f245111e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return i17;
    }

    public void d(t84.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addView", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        queueEvent(new t84.d(this, aVar));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addView", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
    }

    public t84.a e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChildAt", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        if (i17 < 0 || i17 >= m69586x3d79f549()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildAt", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            return null;
        }
        t84.a aVar = (t84.a) this.f245115i.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildAt", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return aVar;
    }

    public int f(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTextureId", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        if (bitmap != null) {
            int hashCode = bitmap.hashCode();
            java.util.HashMap hashMap = this.f245114h;
            r2 = hashMap.containsKey(java.lang.Integer.valueOf(hashCode)) ? ((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(hashCode))).intValue() : -1;
            if (r2 <= 0 && (r2 = t84.i.b(bitmap)) > 0) {
                hashMap.put(java.lang.Integer.valueOf(hashCode), java.lang.Integer.valueOf(r2));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextureId", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return r2;
    }

    public void g(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
    }

    /* renamed from: getChildCount */
    public int m69586x3d79f549() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChildCount", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        int size = this.f245115i.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildCount", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return size;
    }

    @Override // t84.h
    /* renamed from: getGlobalVisibleRect */
    public android.graphics.Rect mo69587x67e8cd1d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGlobalVisibleRect", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        android.graphics.Rect rect = new android.graphics.Rect();
        getGlobalVisibleRect(rect);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGlobalVisibleRect", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return rect;
    }

    @Override // android.view.View, t84.h
    public void invalidate() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invalidate", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        requestRender();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invalidate", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
    }
}
