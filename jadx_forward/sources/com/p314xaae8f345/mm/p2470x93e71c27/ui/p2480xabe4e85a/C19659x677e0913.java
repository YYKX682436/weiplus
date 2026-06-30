package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a;

/* renamed from: com.tencent.mm.pluginsdk.ui.applet.CdnImageView */
/* loaded from: classes9.dex */
public class C19659x677e0913 extends com.p314xaae8f345.mm.ui.C21405x85fc1ce0 implements mg5.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f271424d;

    /* renamed from: e, reason: collision with root package name */
    public int f271425e;

    /* renamed from: f, reason: collision with root package name */
    public int f271426f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f271427g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f271428h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f271429i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f271430m;

    /* renamed from: n, reason: collision with root package name */
    public float f271431n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f271432o;

    /* renamed from: p, reason: collision with root package name */
    public wu5.c f271433p;

    public C19659x677e0913(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913, android.graphics.Bitmap bitmap) {
        c19659x677e0913.getClass();
        if (bitmap != null) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, c19659x677e0913.m75391xda2ddad(), false);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CdnImageView", e17, "saveBitmapToLocalCache error: %s", e17.getMessage());
            }
        }
    }

    /* renamed from: getAccImagesPath */
    private java.lang.String m75390xcd058268() {
        return lp0.b.D() + "wallet_images/";
    }

    /* renamed from: getCacheFilePath */
    private java.lang.String m75391xda2ddad() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271427g)) {
            return this.f271427g;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271428h)) {
            return this.f271428h + kk.k.g(this.f271424d.getBytes());
        }
        com.p314xaae8f345.mm.vfs.w6.u(m75390xcd058268());
        return m75390xcd058268() + kk.k.g(this.f271424d.getBytes());
    }

    public void b(java.lang.String str, int i17, int i18, int i19) {
        c(str, i17, i18, i19, null);
    }

    public void c(java.lang.String str, int i17, int i18, int i19, java.lang.String str2) {
        int i27;
        android.graphics.Bitmap i07;
        int i28;
        int i29;
        android.graphics.Bitmap i08;
        this.f271424d = str;
        this.f271425e = i17;
        this.f271426f = i18;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            this.f271427g = str2;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271427g) && (i08 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(this.f271427g)) != null && i08.getWidth() > 0 && i08.getHeight() > 0) {
            setImageBitmap(i08);
            mo65185x405ec283(i08);
            return;
        }
        if (str == null || str.length() == 0) {
            setVisibility(8);
            return;
        }
        boolean z17 = false;
        if (!str.startsWith("http")) {
            if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
                setVisibility(8);
                return;
            }
            int i37 = this.f271425e;
            android.graphics.Bitmap i09 = (i37 <= 0 || (i27 = this.f271426f) <= 0) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(str) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(str, i27, i37, true);
            if (i09 == null) {
                setVisibility(8);
                return;
            }
            if (this.f271429i) {
                i09 = this.f271431n > 0.0f ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(i09, false, i09.getWidth() * this.f271431n) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(i09, false, i09.getWidth() * 0.5f);
            }
            setImageBitmap(i09);
            mo65185x405ec283(i09);
            return;
        }
        android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(str);
        if (Bi != null) {
            int i38 = this.f271425e;
            if (i38 > 0 && (i29 = this.f271426f) > 0) {
                Bi = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(Bi, i29, i38, true, false);
            }
            if (this.f271429i && Bi != null) {
                Bi = this.f271431n > 0.0f ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(Bi, false, Bi.getWidth() * this.f271431n) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(Bi, false, Bi.getWidth() * 0.5f);
            }
            setImageBitmap(Bi);
            mo65185x405ec283(Bi);
            return;
        }
        if (this.f271430m) {
            try {
                java.lang.String m75391xda2ddad = m75391xda2ddad();
                if (com.p314xaae8f345.mm.vfs.w6.j(m75391xda2ddad) && (i07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(m75391xda2ddad)) != null) {
                    int i39 = this.f271425e;
                    if (i39 > 0 && (i28 = this.f271426f) > 0) {
                        i07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(i07, i28, i39, true, false);
                    }
                    if (this.f271429i && i07 != null) {
                        i07 = this.f271431n > 0.0f ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(i07, false, i07.getWidth() * this.f271431n) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(i07, false, i07.getWidth() * 0.5f);
                    }
                    setImageBitmap(i07);
                    mo65185x405ec283(i07);
                    z17 = true;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CdnImageView", e17, "setBitmapFromLocalCache error: %s", e17.getMessage());
            }
            if (z17) {
                return;
            }
        }
        if (i19 > 0) {
            setImageResource(i19);
        } else {
            setImageBitmap(null);
        }
        this.f271433p = ((ku5.t0) ku5.t0.f394148d).q(new r35.j0(str, this.f271432o));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wu5.c cVar = this.f271433p;
        if (cVar != null) {
            cVar.cancel(false);
        }
    }

    /* renamed from: setImageBitmapCompleted */
    public void mo65185x405ec283(android.graphics.Bitmap bitmap) {
    }

    /* renamed from: setImgSavedDir */
    public void m75392xb52e7fa7(java.lang.String str) {
        if (str != null && !str.endsWith("/")) {
            str = str.concat("/");
        }
        this.f271428h = str;
    }

    /* renamed from: setImgSavedPath */
    public void m75393xf0a6cc4b(java.lang.String str) {
        this.f271427g = str;
    }

    /* renamed from: setRoundCorner */
    public void m75394x3288e7c1(boolean z17) {
        this.f271429i = z17;
    }

    /* renamed from: setRoundCornerRate */
    public void m75395x7083e041(float f17) {
        this.f271431n = f17;
    }

    /* renamed from: setUrl */
    public void m75396xca029dad(java.lang.String str) {
        b(str, 0, 0, -1);
    }

    /* renamed from: setUseSdcardCache */
    public void m75397xc185581c(boolean z17) {
        this.f271430m = z17;
    }

    public C19659x677e0913(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f271424d = null;
        this.f271430m = false;
        this.f271432o = new r35.i0(this);
    }
}
