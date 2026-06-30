package com.p314xaae8f345.mm.p1006xc5476f33.gif;

/* renamed from: com.tencent.mm.plugin.gif.MMAnimateView */
/* loaded from: classes12.dex */
public class C16077xb54fe366 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd {

    /* renamed from: f, reason: collision with root package name */
    public int f223655f;

    /* renamed from: g, reason: collision with root package name */
    public final int f223656g;

    /* renamed from: h, reason: collision with root package name */
    public float f223657h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f223658i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f223659m;

    public C16077xb54fe366(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: getCacheKey */
    public java.lang.String m64927x62036cf3() {
        return this.f223658i;
    }

    /* renamed from: getEmojiDensity */
    public int m64928x7ab78438() {
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e;
    }

    /* renamed from: getEmojiDensityScale */
    public float m64929x43aa77f2() {
        if (this.f223657h == 0.0f) {
            float g17 = i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) / 1.8181819f;
            this.f223657h = g17;
            if (g17 < 1.0f) {
                this.f223657h = 1.0f;
            } else if (g17 > 1.8181819f) {
                this.f223657h = 1.8181819f;
            }
        }
        return this.f223657h;
    }

    /* renamed from: getIntrinsicHeight */
    public int m64930x82433856() {
        if (getDrawable() == null) {
            return 0;
        }
        return getDrawable().getIntrinsicHeight();
    }

    /* renamed from: getIntrinsicWidth */
    public int m64931xcb3a64b7() {
        if (getDrawable() == null) {
            return 0;
        }
        return getDrawable().getIntrinsicWidth();
    }

    public void n() {
        if (fp.i.b()) {
            int i17 = this.f223655f;
            if (i17 > 0) {
                super.setImageResource(i17);
                return;
            }
            return;
        }
        int i18 = this.f223656g;
        if (i18 > 0) {
            super.setImageResource(i18);
        }
    }

    /* renamed from: pause */
    public void m64932x65825f6() {
        if (getDrawable() == null || !(getDrawable() instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.b)) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.gif.b) getDrawable()).a();
    }

    public boolean r() {
        if (getDrawable() == null || !(getDrawable() instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.b)) {
            return false;
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.gif.b) getDrawable()).isRunning();
    }

    /* renamed from: resume */
    public void m64933xc84dc82d() {
        if (getDrawable() == null || !(getDrawable() instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.b)) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.gif.b) getDrawable()).d();
    }

    public void s(com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab c16078xe0714eab) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.xa) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6.class))).getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5627xc04e4c49 c5627xc04e4c49 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5627xc04e4c49();
        c5627xc04e4c49.f135955g.f89910a = c16078xe0714eab.m64939x130a215f();
        c5627xc04e4c49.e();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd, android.view.View
    public void setBackgroundResource(int i17) {
        w(getResources(), i17, false, null);
    }

    /* renamed from: setBoundaryCheckInvalid */
    public void m64934x756aa49b(boolean z17) {
        this.f223659m = z17;
    }

    /* renamed from: setCacheKey */
    public void m64935x5cbbcdff(java.lang.String str) {
        this.f223658i = str;
    }

    /* renamed from: setDefaultBackgroundResource */
    public void m64936xb1a8493b(int i17) {
        this.f223655f = i17;
    }

    /* renamed from: setDefaultImageResource */
    public void m64937x6f817d4a(int i17) {
        this.f223655f = i17;
    }

    /* renamed from: setImageFilePath */
    public void m64938x75cc54fa(java.lang.String str) {
        v(str, true, null);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd, android.widget.ImageView
    public void setImageResource(int i17) {
        w(getResources(), i17, true, null);
    }

    public void t() {
        if (getDrawable() == null || !(getDrawable() instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.k)) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.gif.k) getDrawable()).b();
    }

    public void u(byte[] bArr, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.gif.b kVar;
        try {
            if (bArr == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GIF.MMGIFImageView", "[setMMGIFFileByteArray] bytes is null! src:%s cacheKey:%s", java.lang.Boolean.TRUE, str);
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.h(bArr)) {
                    kVar = new com.p314xaae8f345.mm.p1006xc5476f33.gif.u(bArr);
                } else {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.d(bArr)) {
                        android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bArr);
                        if (G != null) {
                            G.setDensity(m64928x7ab78438());
                            setImageBitmap(G);
                            return;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed bitmap is null. bytes %s", bArr.toString());
                            n();
                            return;
                        }
                    }
                    kVar = new com.p314xaae8f345.mm.p1006xc5476f33.gif.k(bArr, this.f223659m);
                }
                kVar.start();
            } else {
                m64935x5cbbcdff(str);
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j5 j5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j5.class);
                java.lang.String m64927x62036cf3 = m64927x62036cf3();
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.e) j5Var).getClass();
                kVar = com.p314xaae8f345.mm.p1006xc5476f33.gif.d.c().b(m64927x62036cf3, bArr);
            }
            setImageDrawable(kVar);
        } catch (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab e17) {
            s(e17);
            if (e17.m64939x130a215f() != 103) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed. %s", e17.toString());
                n();
            }
            android.graphics.Bitmap G2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bArr);
            if (G2 != null) {
                G2.setDensity(m64928x7ab78438());
                setImageBitmap(G2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed bitmap is null. bytes %s", bArr.toString());
                n();
            }
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed. %s", e18.toString());
            n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ee -> B:39:0x010a). Please report as a decompilation issue!!! */
    public final void v(java.lang.String str, boolean z17, java.lang.String str2) {
        android.graphics.drawable.Drawable kVar;
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.gif.u(com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1));
                uVar.start();
                if (z17) {
                    setImageDrawable(uVar);
                    return;
                } else {
                    setBackgroundDrawable(uVar);
                    return;
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    kVar = new com.p314xaae8f345.mm.p1006xc5476f33.gif.k(str, this.f223659m);
                } else {
                    m64935x5cbbcdff(str2);
                    com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j5 j5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j5.class);
                    java.lang.String m64927x62036cf3 = m64927x62036cf3();
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.e) j5Var).getClass();
                    kVar = com.p314xaae8f345.mm.p1006xc5476f33.gif.d.c().a(m64927x62036cf3, str);
                }
                if (z17) {
                    setImageDrawable(kVar);
                    return;
                } else {
                    setBackgroundDrawable(kVar);
                    return;
                }
            }
            try {
                android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null);
                if (J2 != null) {
                    J2.setDensity(m64928x7ab78438());
                    if (z17) {
                        setImageBitmap(J2);
                    } else {
                        setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(J2));
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failedbitmap is null. show default and delete file. path %s", str);
                    n();
                }
            } catch (java.lang.OutOfMemoryError e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GIF.MMGIFImageView", e17, "setMMGIFFilePath failed, oom happened. show default. path %s", str);
                n();
            }
        } catch (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab e18) {
            try {
                s(e18);
                str = str;
                if (e18.m64939x130a215f() == 103) {
                    try {
                        android.graphics.Bitmap J3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null);
                        if (J3 != null) {
                            J3.setDensity(m64928x7ab78438());
                            if (z17) {
                                setImageBitmap(J3);
                                str = str;
                            } else {
                                setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(J3));
                                str = str;
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failedbitmap is null. show default and delete file. path %s", str);
                            n();
                            com.p314xaae8f345.mm.vfs.w6.h(str);
                            str = str;
                        }
                    } catch (java.lang.OutOfMemoryError e19) {
                        java.lang.Object[] objArr = {str};
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GIF.MMGIFImageView", e19, "setMMGIFFilePath failed, oom happened. show default. path %s", objArr);
                        n();
                        str = objArr;
                    }
                }
            } catch (java.lang.Exception e27) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed1. %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e27));
            }
        } catch (java.io.IOException e28) {
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed3. %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e28));
            com.p314xaae8f345.mm.vfs.w6.h(str);
            n();
        } catch (java.lang.NullPointerException unused) {
            n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.tencent.mm.plugin.gif.b] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.tencent.mm.plugin.gif.MMAnimateView, androidx.appcompat.widget.AppCompatImageView] */
    public final void w(android.content.res.Resources resources, int i17, boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.gif.k kVar;
        try {
            boolean z18 = true;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                kVar = new com.p314xaae8f345.mm.p1006xc5476f33.gif.k(resources, i17, this.f223659m);
                if (kVar.f223672f == 0) {
                    z18 = false;
                }
            } else {
                m64935x5cbbcdff(str);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j5.class))).getClass();
                lt0.f fVar = (lt0.f) com.p314xaae8f345.mm.p1006xc5476f33.gif.d.c().f223662b;
                kVar = fVar.get(str) != null ? (com.p314xaae8f345.mm.p1006xc5476f33.gif.b) ((java.lang.ref.WeakReference) fVar.get(str)).get() : null;
                if (kVar == null) {
                    kVar = new com.p314xaae8f345.mm.p1006xc5476f33.gif.k(resources, i17, false);
                    fVar.put(str, new java.lang.ref.WeakReference(kVar));
                }
            }
            if (z18) {
                if (z17) {
                    setImageDrawable(kVar);
                    return;
                } else {
                    setBackgroundDrawable(kVar);
                    return;
                }
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GIF.MMGIFImageView", "setMMGIFResource failed. %s" + e17.toString());
        }
        if (z17) {
            super.setImageResource(i17);
        } else {
            super.setBackgroundResource(i17);
        }
    }

    public void x() {
        if (getDrawable() == null || !(getDrawable() instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.b)) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.gif.b) getDrawable()).start();
    }

    public void y() {
        if (getDrawable() == null || !(getDrawable() instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.b)) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.gif.b) getDrawable()).stop();
    }

    public C16077xb54fe366(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f223655f = com.p314xaae8f345.mm.R.C30861xcebc809e.f77983xe490a197;
        this.f223656g = com.p314xaae8f345.mm.R.C30861xcebc809e.f562680lw;
        this.f223657h = 0.0f;
        this.f223659m = false;
    }
}
