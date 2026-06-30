package r35;

/* loaded from: classes15.dex */
public class m0 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final int f450713a;

    /* renamed from: b, reason: collision with root package name */
    public final int f450714b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f450715c;

    /* renamed from: d, reason: collision with root package name */
    public r35.q3 f450716d;

    /* renamed from: e, reason: collision with root package name */
    public final int f450717e;

    /* renamed from: f, reason: collision with root package name */
    public int f450718f;

    /* renamed from: g, reason: collision with root package name */
    public long f450719g;

    /* renamed from: h, reason: collision with root package name */
    public long f450720h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f450721i;

    public m0(int i17, int i18, float[] fArr, r35.q3 q3Var) {
        this.f450717e = 0;
        this.f450718f = 0;
        this.f450719g = 0L;
        this.f450720h = 0L;
        this.f450717e = 0;
        this.f450713a = i17;
        this.f450714b = i18;
        this.f450716d = q3Var;
        this.f450715c = fArr;
    }

    @Override // p11.h
    public void a(java.lang.String url, android.view.View view) {
        r35.q3 q3Var = this.f450716d;
        if (q3Var != null) {
            q3Var.mo58429xb05099c3();
        }
        r35.y yVar = r35.y.f450859a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (qk.c.f() && qk.c.g(url)) {
            this.f450718f = 1;
        } else {
            if (m11.n1.g() && qk.c.h(url)) {
                this.f450718f = 2;
            } else {
                this.f450718f = 0;
            }
        }
        this.f450719g = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(86L, 0L, 1L, false);
    }

    @Override // p11.h
    public void b(java.lang.String url, android.view.View view, q11.b bVar) {
        java.lang.String str = bVar.f441068e;
        android.graphics.Bitmap bitmap = bVar.f441067d;
        boolean z17 = false;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f450716d = null;
            android.graphics.Bitmap bitmap2 = bVar.f441067d;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                this.f450720h = java.lang.System.currentTimeMillis();
                if (r35.y.f450859a.a(this.f450717e) && bVar.f441065b == 2) {
                    r35.x xVar = r35.x.f450853a;
                    xVar.d(this.f450718f, false, this.f450720h - this.f450719g);
                    xVar.c(this.f450718f, false);
                }
            }
        } else {
            r35.k0 k0Var = new r35.k0(this, bVar);
            if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
                k0Var.run();
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f450721i;
                if (n3Var != null) {
                    n3Var.mo50293x3498a0(k0Var);
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(k0Var);
                }
            }
        }
        if (bVar.f441065b != 2) {
            return;
        }
        r35.y yVar = r35.y.f450859a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (m11.n1.g()) {
            java.lang.String str2 = bVar.f441068e;
            if ((!(str2 == null || str2.length() == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "image/webp")) && qk.c.h(url)) {
                z17 = true;
            }
        }
        int i17 = bVar.f441064a;
        if (i17 == 0) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(86L, 13L, 1L, false);
            }
        } else {
            if (i17 != 1) {
                if (i17 == 3 && z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(86L, 14L, 1L, false);
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(86L, 2L, 1L, false);
            if (z17) {
                g0Var.mo68477x336bdfd8(86L, 15L, 1L, false);
            }
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap;
        int i17 = this.f450714b;
        int i18 = this.f450713a;
        float[] fArr = this.f450715c;
        if (fArr == null) {
            return null;
        }
        if (bVar == null || (bitmap = bVar.f441067d) == null || bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingBizImageDownloadListener", "onProcessBitmap bitmap is null");
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingBizImageDownloadListener", "onProcessBitmap url is null");
            return null;
        }
        try {
            android.graphics.Bitmap k07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(bVar.f441067d, i18, i17, true);
            android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(k07, i18, i17, true);
            if (createScaledBitmap != k07 && k07 != null && !k07.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingBizImageDownloadListener", "bitmap recycle %s", k07.toString());
                k07.recycle();
            }
            android.graphics.Bitmap u07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.u0(createScaledBitmap, true, fArr, true);
            if (createScaledBitmap != null && !createScaledBitmap.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingBizImageDownloadListener", "bitmap recycle %s", createScaledBitmap.toString());
                createScaledBitmap.recycle();
            }
            r35.q3 q3Var = this.f450716d;
            if (q3Var instanceof r35.r3) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x0) ((r35.r3) q3Var)).a(u07);
            }
            return u07;
        } catch (java.lang.OutOfMemoryError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingBizImageDownloadListener", "onProcessBitmap OutOfMemoryError %s", e17.getMessage());
            return null;
        }
    }

    public m0(int i17, int i18, int i19, float[] fArr, r35.q3 q3Var) {
        this.f450717e = 0;
        this.f450718f = 0;
        this.f450719g = 0L;
        this.f450720h = 0L;
        this.f450717e = i17;
        this.f450713a = i18;
        this.f450714b = i19;
        this.f450716d = q3Var;
        this.f450715c = fArr;
    }

    public m0(int i17, int i18, int i19, boolean z17, boolean z18, float f17, r35.q3 q3Var) {
        this(i17, i18, i19, z17, z18, f17, q3Var, null, false, false);
    }

    public m0(int i17, int i18, int i19, boolean z17, boolean z18, float f17, r35.q3 q3Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, boolean z19, boolean z27) {
        this.f450717e = 0;
        this.f450718f = 0;
        this.f450719g = 0L;
        this.f450720h = 0L;
        this.f450717e = i17;
        this.f450713a = i18;
        this.f450714b = i19;
        this.f450716d = q3Var;
        this.f450721i = n3Var;
        if (z17 || z18) {
            if (this.f450715c == null) {
                this.f450715c = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
            }
            if (z17) {
                float[] fArr = this.f450715c;
                fArr[1] = f17;
                fArr[0] = f17;
            }
            if (z18) {
                float[] fArr2 = this.f450715c;
                fArr2[3] = f17;
                fArr2[2] = f17;
            }
        }
        if (z19 || z27) {
            if (this.f450715c == null) {
                this.f450715c = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
            }
            float[] fArr3 = this.f450715c;
            fArr3[3] = 0.0f;
            fArr3[2] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[0] = 0.0f;
            if (z19) {
                fArr3[0] = f17;
            }
            if (z27) {
                fArr3[1] = f17;
            }
        }
        if (z17 || z18 || z19 || z27) {
            return;
        }
        this.f450715c = null;
    }
}
