package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.i f197073a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.i();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f197074b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f197075c;

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BlurAvatarUtil", "initMemoryTrim");
        ki.i.f389634c.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b());
        f197074b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(5);
        f197075c = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.c.f196985d);
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.i iVar, java.lang.String str) {
        iVar.getClass();
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = f197074b;
            int m77804x35e001 = r2Var.m77804x35e001();
            zl2.r4.f555483a.M2("BlurAvatarUtil", str + " cache Size:" + m77804x35e001);
            if (m77804x35e001 > 0) {
                r2Var.d(-1);
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "BlurAvatarUtil-memoryTrim");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final boolean b(java.lang.String str, java.lang.String liveCoverUrl, android.view.View view, yz5.l lVar) {
        java.lang.String str2;
        java.lang.Object obj;
        jz5.l lVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveCoverUrl, "liveCoverUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        boolean z17 = false;
        jz5.f0 f0Var = null;
        android.graphics.Bitmap bitmap = null;
        if ((liveCoverUrl.length() == 0) == true) {
            ya2.g gVar = ya2.h.f542017a;
            ya2.b2 b17 = gVar.b(str);
            str2 = b17 != null ? b17.f69321x64a734bd : null;
            if ((str2 == null || str2.length() == 0) != false) {
                ya2.b2 b18 = gVar.b(str);
                str2 = b18 != null ? b18.f69301x81118c51 : null;
            }
        } else {
            str2 = liveCoverUrl;
        }
        h0Var.f391656d = str2;
        if ((str2 == null || str2.length() == 0) == true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BlurAvatarUtil", "loadAvatarBlurBg anchorUsername:" + str + ",liveCoverUrl:" + liveCoverUrl + " and coverUrl is empty!");
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            }
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = f197074b;
        synchronized (r2Var) {
            obj = r2Var.get(h0Var.f391656d);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadAvatarBlurBg coverUrl:");
        sb6.append((java.lang.String) h0Var.f391656d);
        sb6.append(",cache bm is null:");
        sb6.append(obj == null);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BlurAvatarUtil", sb6.toString());
        jz5.l lVar3 = (jz5.l) obj;
        if (lVar3 != null) {
            if (view instanceof android.widget.ImageView) {
                ((android.widget.ImageView) view).setImageDrawable(new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), (android.graphics.Bitmap) lVar3.f384367e));
            } else {
                android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) lVar3.f384367e;
                android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                float f17 = h17.y / h17.x;
                float height = bitmap2.getHeight() / bitmap2.getWidth();
                if ((f17 == height) == true) {
                    lVar2 = new jz5.l(java.lang.Boolean.FALSE, new android.util.Size(bitmap2.getWidth(), bitmap2.getHeight()));
                } else {
                    android.util.Size size = f17 > height ? new android.util.Size((int) (bitmap2.getHeight() / f17), bitmap2.getHeight()) : new android.util.Size(bitmap2.getWidth(), (int) (bitmap2.getWidth() * f17));
                    if (size.getWidth() != 0 && size.getHeight() != 0) {
                        int abs = java.lang.Math.abs(size.getWidth() - bitmap2.getWidth());
                        jz5.g gVar2 = f197075c;
                        if (abs >= ((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue() || java.lang.Math.abs(size.getHeight() - bitmap2.getHeight()) >= ((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue()) {
                            lVar2 = new jz5.l(java.lang.Boolean.TRUE, size);
                        }
                    }
                    lVar2 = new jz5.l(java.lang.Boolean.FALSE, new android.util.Size(bitmap2.getWidth(), bitmap2.getHeight()));
                }
                if (((java.lang.Boolean) lVar2.f384366d).booleanValue()) {
                    android.graphics.Bitmap k07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0((android.graphics.Bitmap) lVar3.f384367e, ((android.util.Size) lVar2.f384367e).getWidth(), ((android.util.Size) lVar2.f384367e).getHeight(), false);
                    if (k07 != null) {
                        r2Var.put(h0Var.f391656d, new jz5.l(lVar3.f384366d, k07));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BlurAvatarUtil", "getCenterCropBitmap old:" + ((android.graphics.Bitmap) lVar3.f384367e).getWidth() + '*' + ((android.graphics.Bitmap) lVar3.f384367e).getHeight() + ",new:" + k07.getWidth() + '*' + k07.getHeight());
                        bitmap = k07;
                    }
                } else {
                    bitmap = (android.graphics.Bitmap) lVar3.f384367e;
                }
                android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
                if (bitmap == null) {
                    bitmap = (android.graphics.Bitmap) lVar3.f384367e;
                }
                view.setBackground(new android.graphics.drawable.BitmapDrawable(resources, bitmap));
            }
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
            f0Var = jz5.f0.f384359a;
            z17 = true;
        }
        if (f0Var != null) {
            return z17;
        }
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3((java.lang.String) h0Var.f391656d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        a17.f529406d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.e(view, lVar, h0Var);
        a17.f();
        return true;
    }
}
