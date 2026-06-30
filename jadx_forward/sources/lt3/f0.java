package lt3;

/* loaded from: classes10.dex */
public final class f0 implements ot3.g {

    /* renamed from: a, reason: collision with root package name */
    public final mt3.a f402745a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.r f402746b;

    /* renamed from: c, reason: collision with root package name */
    public long f402747c;

    /* renamed from: d, reason: collision with root package name */
    public zv3.a f402748d;

    /* renamed from: e, reason: collision with root package name */
    public zv3.g f402749e;

    /* renamed from: f, reason: collision with root package name */
    public final st3.f f402750f;

    /* renamed from: g, reason: collision with root package name */
    public int f402751g;

    /* renamed from: h, reason: collision with root package name */
    public int f402752h;

    /* renamed from: i, reason: collision with root package name */
    public int f402753i;

    /* renamed from: j, reason: collision with root package name */
    public int f402754j;

    /* renamed from: k, reason: collision with root package name */
    public int f402755k;

    /* renamed from: l, reason: collision with root package name */
    public int f402756l;

    /* renamed from: m, reason: collision with root package name */
    public int f402757m;

    /* renamed from: n, reason: collision with root package name */
    public int f402758n;

    /* renamed from: o, reason: collision with root package name */
    public int f402759o;

    /* renamed from: p, reason: collision with root package name */
    public int f402760p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8 f402761q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 f402762r;

    /* renamed from: s, reason: collision with root package name */
    public int f402763s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f402764t;

    /* renamed from: u, reason: collision with root package name */
    public final int f402765u;

    /* renamed from: v, reason: collision with root package name */
    public final int f402766v;

    /* renamed from: w, reason: collision with root package name */
    public final int f402767w;

    /* renamed from: x, reason: collision with root package name */
    public final yz5.l f402768x;

    /* renamed from: y, reason: collision with root package name */
    public final yz5.l f402769y;

    /* renamed from: z, reason: collision with root package name */
    public android.os.HandlerThread f402770z;

    public f0(mt3.a videoMixData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoMixData, "videoMixData");
        this.f402745a = videoMixData;
        this.f402747c = -1L;
        this.f402750f = videoMixData.f412822a;
        this.f402765u = 1;
        this.f402766v = 2;
        this.f402767w = 4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.VideoMixer", "create VideoMixer, " + videoMixData);
        this.f402768x = new lt3.x(this);
        this.f402769y = new lt3.y(this);
    }

    public static final java.lang.String b(lt3.f0 f0Var) {
        int i17;
        android.graphics.Bitmap createScaledBitmap;
        mt3.a aVar = f0Var.f402745a;
        java.lang.String str = aVar.f412826e;
        int i18 = aVar.f412831j;
        android.graphics.Bitmap q17 = ai3.d.q(str, 200000L);
        java.lang.String str2 = aVar.f412827f;
        if (q17 != null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.VideoMixer", "createThumb getParentAbsolutePath: " + com.p314xaae8f345.mm.vfs.w6.r(str2) + "  thumb size:" + i18);
                com.p314xaae8f345.mm.vfs.w6.f(str2);
                if (i18 > 0 && java.lang.Math.min(q17.getWidth(), q17.getHeight()) > i18) {
                    if (q17.getWidth() < q17.getHeight()) {
                        i17 = (int) (((q17.getHeight() * i18) * 1.0f) / q17.getWidth());
                    } else {
                        i18 = (int) (((q17.getWidth() * i18) * 1.0f) / q17.getHeight());
                        i17 = i18;
                    }
                    createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(q17, i18, i17, true);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScaledBitmap, "createScaledBitmap(...)");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(createScaledBitmap, 60, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
                }
                createScaledBitmap = q17;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(createScaledBitmap, 60, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
            } catch (java.io.IOException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryRemuxIDKeyStat", "markCreateThumbFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 9L, 1L);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryRemuxIDKeyStat", "markCreateThumbFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 9L, 1L);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" mixVideoPath : ");
        sb6.append(aVar.f412826e);
        sb6.append(" mixThumbPath:");
        sb6.append(str2);
        sb6.append("   thumb-bitmap is null:");
        sb6.append(q17 == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.VideoMixer", sb6.toString());
        if (q17 == null) {
            return null;
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x010f A[Catch: Exception -> 0x0215, TryCatch #2 {Exception -> 0x0215, blocks: (B:14:0x00c1, B:17:0x00cc, B:21:0x00e5, B:23:0x00ed, B:28:0x0109, B:30:0x010f, B:31:0x0111, B:51:0x0153, B:53:0x0183, B:54:0x018a), top: B:13:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(lt3.f0 r50) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lt3.f0.c(lt3.f0):void");
    }

    public static android.graphics.Bitmap d(lt3.f0 f0Var, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, float f17, float f18, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            f17 = 0.0f;
        }
        if ((i17 & 8) != 0) {
            f18 = 0.0f;
        }
        f0Var.getClass();
        new android.graphics.Canvas(bitmap2).drawBitmap(bitmap, f17, f18, (android.graphics.Paint) null);
        return bitmap2;
    }

    @Override // ot3.g
    public void a(yz5.r rVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Start mixer ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.VideoMixer", sb6.toString());
        this.f402746b = new lt3.c0(rVar, this);
        lt3.e0 e0Var = new lt3.e0(this);
        mt3.a aVar = this.f402745a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = aVar.f412822a.f494072m;
        if (c16997xb0aa383a == null || c16997xb0aa383a.f237249m) {
            e0Var.mo152xb9724478();
            return;
        }
        wt3.c1 c1Var = wt3.c1.f530920b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2 = aVar.f412822a.f494072m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16997xb0aa383a2);
        c1Var.c(c16997xb0aa383a2, new lt3.z(e0Var));
    }

    public final void e(android.graphics.Canvas canvas, android.graphics.Bitmap bitmap, android.graphics.Point point) {
        float f17;
        float f18;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = point.x;
        float f19 = 0.0f;
        if (width == i17 && height == point.y) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
            return;
        }
        int i18 = point.y;
        if (width * i18 > height * i17) {
            f18 = i18 / height;
            float f27 = (i17 - (width * f18)) * 0.5f;
            f17 = 0.0f;
            f19 = f27;
        } else {
            float f28 = i17 / width;
            f17 = (i18 - (height * f28)) * 0.5f;
            f18 = f28;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(f18, f18);
        matrix.postTranslate(f19, f17);
        canvas.drawBitmap(bitmap, matrix, null);
    }

    public final void f(android.graphics.Canvas canvas, android.graphics.Bitmap bitmap, android.graphics.Point point) {
        float f17;
        float f18;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = point.x;
        float f19 = 0.0f;
        if (width == i17 && height == point.y) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
            return;
        }
        int i18 = point.y;
        if (width * i18 > i17 * height) {
            f17 = i17 / width;
            f18 = (i18 - (height * f17)) * 0.5f;
        } else {
            float f27 = i18 / height;
            float f28 = (i17 - (width * f27)) * 0.5f;
            f17 = f27;
            f18 = 0.0f;
            f19 = f28;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(f17, f17);
        matrix.postTranslate(f19, f18);
        canvas.drawBitmap(bitmap, matrix, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x024a, code lost:
    
        if (r1.f37984xcef56b5b > 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if ((r1 != null && r1.f243901g == 2) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
    
        r1 = new java.lang.Object[2];
        r1[0] = java.lang.Integer.valueOf(r24.f402753i);
        r2 = r24.f402761q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        if (r2 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        r4 = java.lang.Integer.valueOf(r2.f243912r);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        r1[1] = r4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.VideoMixer", "ABA: No use ABA algorithm: final bitrate: [%d], takePhotosVideoBR: [%d]", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        if ((r1 != null && r1.f243900f == r24.f402767w) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g() {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lt3.f0.g():int");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1985xb098552e.C16989x37a4afe8 h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1985xb098552e.C16989x37a4afe8 c16989x37a4afe8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1985xb098552e.C16989x37a4afe8();
        c16989x37a4afe8.f237174d = this.f402751g;
        c16989x37a4afe8.f237175e = this.f402752h;
        c16989x37a4afe8.f237176f = this.f402753i;
        c16989x37a4afe8.f237177g = this.f402754j;
        c16989x37a4afe8.f237178h = this.f402755k;
        c16989x37a4afe8.f237179i = this.f402756l;
        c16989x37a4afe8.f237180m = this.f402757m;
        c16989x37a4afe8.f237181n = this.f402758n;
        return c16989x37a4afe8;
    }

    public final int i(java.lang.String path) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9;
        java.lang.Integer valueOf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        try {
            java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(path);
            if (E != null) {
                try {
                    c1098xe10e35e9 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(E);
                    vz5.b.a(E, null);
                } finally {
                }
            } else {
                c1098xe10e35e9 = null;
            }
            valueOf = c1098xe10e35e9 != null ? java.lang.Integer.valueOf(c1098xe10e35e9.m7343x245ab229(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, 1)) : null;
            if (valueOf != null && valueOf.intValue() == 6) {
                return 90;
            }
            if (valueOf.intValue() == 3) {
                return 180;
            }
        } catch (java.io.IOException unused) {
        }
        return (valueOf != null && valueOf.intValue() == 8) ? 270 : 0;
    }

    public final void j(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoParam, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoParam, "videoParam");
        if (this.f402761q == null) {
            this.f402761q = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.VideoMixer", "Scene: [%d], ABASwitch: [%d] ceilingVideoBR:[%d]", java.lang.Integer.valueOf(videoParam.G), java.lang.Integer.valueOf(videoParam.f152738u), java.lang.Integer.valueOf(videoParam.f152742y));
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8 c17684x1bb265e8 = this.f402761q;
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.f243895a = this.f402752h;
        }
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.f243896b = this.f402751g;
        }
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.f243897c = this.f402753i;
        }
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.f243898d = i18;
        }
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.f243899e = i17;
        }
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.f243900f = videoParam.G;
        }
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.f243901g = videoParam.f152738u;
        }
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.f243902h = videoParam.f152739v;
        }
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.f243903i = videoParam.f152740w;
        }
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.f243904j = videoParam.f152741x;
        }
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.f243905k = videoParam.f152742y;
        }
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.f243906l = videoParam.f152743z;
        }
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.f243908n = videoParam.B;
        }
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.f243907m = videoParam.A;
        }
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.f243909o = videoParam.C;
        }
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.f243910p = videoParam.D;
        }
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.f243911q = videoParam.E;
        }
        if (c17684x1bb265e8 == null) {
            return;
        }
        c17684x1bb265e8.f243912r = videoParam.F;
    }

    public final void k(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47) {
        this.f402751g = i17;
        this.f402752h = i18;
        this.f402753i = i19;
        this.f402754j = i27;
        this.f402755k = i28;
        this.f402756l = i29;
        this.f402757m = i37;
        this.f402758n = i38;
        this.f402759o = i39;
        this.f402760p = i47;
        if (this.f402761q == null) {
            this.f402761q = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8 c17684x1bb265e8 = this.f402761q;
        if (c17684x1bb265e8 != null) {
            c17684x1bb265e8.c();
        }
    }
}
