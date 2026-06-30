package wq;

/* loaded from: classes10.dex */
public final class h implements wq.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f530019a;

    /* renamed from: b, reason: collision with root package name */
    public long f530020b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f530021c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f530022d;

    /* renamed from: e, reason: collision with root package name */
    public int f530023e;

    /* renamed from: f, reason: collision with root package name */
    public int f530024f;

    /* renamed from: g, reason: collision with root package name */
    public final wq.c f530025g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Bitmap f530026h;

    public h(byte[] bytes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bytes, "bytes");
        this.f530019a = "MicroMsg.GIF.MMWXGFDecoder";
        int[] iArr = new int[4];
        this.f530021c = iArr;
        this.f530022d = new int[4];
        this.f530023e = -1;
        long m64978xe871e070 = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64978xe871e070();
        this.f530020b = m64978xe871e070;
        if (m64978xe871e070 == 0 || m64978xe871e070 == -901) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMWXGFDecoder", "Cpan init wxam decoder failed. gifHandle:%d", java.lang.Long.valueOf(m64978xe871e070));
            if (this.f530020b == -901) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(711L, 5L, 1L, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(711L, 4L, 1L, false);
            throw new com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab(201);
        }
        int m64969x79127872 = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64969x79127872(m64978xe871e070, bytes, bytes.length);
        if (m64969x79127872 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMWXGFDecoder", "Cpan WXGF decode buffer header failed. result:%d", java.lang.Integer.valueOf(m64969x79127872));
            if (m64969x79127872 == -904) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(711L, 8L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(711L, 3L, 1L, false);
            }
            throw new com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab(m64969x79127872);
        }
        int m64975xf44a514 = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64975xf44a514(this.f530020b, bytes, bytes.length, iArr);
        if (m64975xf44a514 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMWXGFDecoder", "Cpan WXGF get option failed. result:%d", java.lang.Integer.valueOf(m64975xf44a514));
            if (m64975xf44a514 == -903) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(711L, 7L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(711L, 3L, 1L, false);
            }
            throw new com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab(m64975xf44a514);
        }
        int i17 = iArr[1];
        int i18 = iArr[2];
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/emoji/decode/MMWXGFDecoder", "<init>", "([B)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/emoji/decode/MMWXGFDecoder", "<init>", "([B)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        this.f530026h = createBitmap;
        this.f530025g = new wq.c(iArr[0]);
    }

    @Override // wq.d
    public int a() {
        if (this.f530021c[0] == 1) {
            return Integer.MAX_VALUE;
        }
        return this.f530024f;
    }

    @Override // wq.d
    public int b() {
        return this.f530021c[2];
    }

    @Override // wq.d
    public void c() {
        int m64968x5ea842e8 = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64968x5ea842e8(this.f530020b, null, 0, this.f530026h, this.f530022d);
        java.lang.String str = this.f530019a;
        if (m64968x5ea842e8 == -909) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "nativeDecodeBufferFrame failed. frame is null.");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(401L, 11L, 1L, false);
        } else if (m64968x5ea842e8 == -904) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "nativeDecodeBufferFrame failed. func is null.");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(401L, 8L, 1L, false);
        } else if (m64968x5ea842e8 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "nativeDecodeBufferFrame failed.");
        }
        int i17 = this.f530023e + 1;
        this.f530023e = i17;
        int[] iArr = this.f530021c;
        if ((i17 >= iArr[0] - 1 || m64968x5ea842e8 == 1) && com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64989xa5576e92(this.f530020b) == -905) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(711L, 9L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "Cpan Rewind buffer failed.");
        }
        this.f530023e %= iArr[0];
        int i18 = this.f530022d[0];
        if (i18 <= 0) {
            i18 = 100;
        }
        this.f530024f = i18;
    }

    @Override // wq.d
    public int d() {
        return this.f530021c[0];
    }

    @Override // wq.d
    /* renamed from: destroy */
    public void mo174305x5cd39ffa() {
        long j17 = this.f530020b;
        this.f530020b = 0L;
        if (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64990x92410e20(j17) == -906) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(401L, 10L, 1L, false);
        }
    }

    @Override // wq.d
    public int e() {
        return this.f530021c[1];
    }

    @Override // wq.d
    /* renamed from: getFrame */
    public android.graphics.Bitmap mo174306x74704fb7() {
        return this.f530026h;
    }

    @Override // wq.d
    /* renamed from: seekTo */
    public void mo174307xc9fc1b13(long j17) {
        if (this.f530024f <= 0) {
            c();
        }
        int i17 = (int) j17;
        wq.c cVar = this.f530025g;
        int a17 = cVar.a(i17);
        int[] iArr = this.f530021c;
        int i18 = iArr[0];
        for (int i19 = 0; i19 < i18 && a17 < 0; i19++) {
            c();
            cVar.b(this.f530023e, this.f530024f);
            a17 = cVar.a(i17);
        }
        int i27 = a17 - this.f530023e;
        int i28 = iArr[0];
        int i29 = (i27 + i28) % i28;
        a();
        int i37 = iArr[0];
        boolean z17 = cVar.f530007c;
        for (int i38 = 0; i38 < i29; i38++) {
            c();
        }
    }
}
