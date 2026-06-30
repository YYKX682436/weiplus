package t84;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public int f497953a;

    /* renamed from: b, reason: collision with root package name */
    public int f497954b;

    /* renamed from: c, reason: collision with root package name */
    public float f497955c;

    /* renamed from: d, reason: collision with root package name */
    public float f497956d;

    /* renamed from: e, reason: collision with root package name */
    public float f497957e;

    /* renamed from: f, reason: collision with root package name */
    public float f497958f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f497959g;

    /* renamed from: i, reason: collision with root package name */
    public java.nio.FloatBuffer f497961i;

    /* renamed from: j, reason: collision with root package name */
    public java.nio.FloatBuffer f497962j;

    /* renamed from: k, reason: collision with root package name */
    public int f497963k;

    /* renamed from: l, reason: collision with root package name */
    public int f497964l;

    /* renamed from: m, reason: collision with root package name */
    public int f497965m;

    /* renamed from: n, reason: collision with root package name */
    public int f497966n;

    /* renamed from: s, reason: collision with root package name */
    public t84.h f497971s;

    /* renamed from: t, reason: collision with root package name */
    public int f497972t;

    /* renamed from: h, reason: collision with root package name */
    public int f497960h = 0;

    /* renamed from: o, reason: collision with root package name */
    public float[] f497967o = null;

    /* renamed from: p, reason: collision with root package name */
    public float[] f497968p = null;

    /* renamed from: q, reason: collision with root package name */
    public boolean f497969q = false;

    /* renamed from: r, reason: collision with root package name */
    public float f497970r = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    public float f497973u = 0.0f;

    public a(android.content.Context context) {
    }

    public final float a(float f17, float f18, float f19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRotatedX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        double d17 = f19;
        float cos = (float) ((f17 * java.lang.Math.cos(d17)) + (f18 * java.lang.Math.sin(d17)));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRotatedX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        return cos;
    }

    public final float b(float f17, float f18, float f19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRotatedY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        double d17 = f18;
        double d18 = f19;
        float cos = (float) ((d17 * java.lang.Math.cos(d18)) - (f17 * java.lang.Math.sin(d18)));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRotatedY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        return cos;
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invalidate", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        t84.h hVar = this.f497971s;
        if (hVar != null) {
            hVar.invalidate();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invalidate", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
    }

    public void d(t84.h hVar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAttach", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        this.f497971s = hVar;
        this.f497969q = true;
        this.f497966n = i17;
        android.graphics.Bitmap bitmap = this.f497959g;
        if (bitmap != null) {
            this.f497965m = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77) hVar).f(bitmap);
        }
        c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAttach", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
    }

    public void e(int i17, int i18) {
        float[] fArr;
        float[] fArr2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        this.f497953a = i17;
        this.f497954b = i18;
        float f17 = i18;
        this.f497970r = f17;
        float f18 = this.f497955c;
        float f19 = f18 / f17;
        float f27 = f18 / f17;
        float f28 = this.f497956d;
        float f29 = f28 / f17;
        float f37 = -f19;
        float f38 = -(f28 / f17);
        this.f497967o = new float[]{f37, f29, 0.0f, f37, f38, 0.0f, f27, f29, 0.0f, f27, f38, 0.0f};
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateStaticRotation", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        float radians = (float) java.lang.Math.toRadians(this.f497973u);
        float f39 = -f29;
        this.f497967o = new float[]{a(f37, f29, radians), b(f37, f29, radians), 0.0f, a(f37, f39, radians), b(f37, f39, radians), 0.0f, a(f19, f29, radians), b(f19, f29, radians), 0.0f, a(f19, f39, radians), b(f19, f39, radians), 0.0f};
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateStaticRotation", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        int i19 = this.f497960h;
        float f47 = this.f497955c;
        float f48 = this.f497956d;
        float f49 = this.f497957e;
        float f57 = this.f497958f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
        if (i19 == 0) {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
        } else if (i19 == 1) {
            float f58 = f49 * 1.0f;
            if ((f47 * 1.0f) / f48 > f58 / f57) {
                float f59 = ((f57 * 1.0f) * f47) / f49;
                float f66 = (f59 - f48) / 2.0f;
                float f67 = f66 / f59;
                float f68 = (f59 - f66) / f59;
                fArr2 = new float[]{0.0f, f67, 0.0f, f68, 1.0f, f67, 1.0f, f68};
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
            } else {
                float f69 = (f58 * f48) / f57;
                float f76 = (f69 - f47) / 2.0f;
                float f77 = f76 / f69;
                float f78 = (f69 - f76) / f69;
                fArr2 = new float[]{f77, 0.0f, f77, 1.0f, f78, 0.0f, f78, 1.0f};
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
            }
            fArr = fArr2;
        } else if (i19 == 2) {
            float f79 = f49 * 1.0f;
            if ((f47 * 1.0f) / f48 > f79 / f57) {
                float f86 = f48 / (((f57 * 1.0f) * f47) / f49);
                fArr = new float[]{0.0f, 0.0f, 0.0f, f86, 1.0f, 0.0f, 1.0f, f86};
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
            } else {
                float f87 = f47 / ((f79 * f48) / f57);
                fArr = new float[]{0.0f, 0.0f, 0.0f, 1.0f, f87, 0.0f, f87, 1.0f};
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
            }
        } else {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
        }
        this.f497968p = fArr;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initVertex", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        java.nio.FloatBuffer put = java.nio.ByteBuffer.allocateDirect(this.f497967o.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer().put(this.f497967o);
        this.f497961i = put;
        put.position(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initVertex", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initFragment", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        java.nio.FloatBuffer put2 = java.nio.ByteBuffer.allocateDirect(this.f497968p.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer().put(this.f497968p);
        this.f497962j = put2;
        put2.position(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initFragment", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
    }

    public void f(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        this.f497959g = bitmap;
        if (bitmap != null) {
            this.f497957e = bitmap.getWidth();
            this.f497958f = bitmap.getHeight();
            if (this.f497969q) {
                this.f497965m = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77) this.f497971s).f(this.f497959g);
                e(this.f497953a, this.f497954b);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
    }
}
