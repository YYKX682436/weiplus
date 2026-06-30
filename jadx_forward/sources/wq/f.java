package wq;

/* loaded from: classes13.dex */
public final class f implements wq.d {

    /* renamed from: a, reason: collision with root package name */
    public int f530010a;

    /* renamed from: b, reason: collision with root package name */
    public long f530011b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f530012c;

    /* renamed from: d, reason: collision with root package name */
    public int f530013d;

    /* renamed from: e, reason: collision with root package name */
    public int f530014e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Bitmap f530015f;

    /* renamed from: g, reason: collision with root package name */
    public final wq.c f530016g;

    public f(byte[] bytes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bytes, "bytes");
        int[] iArr = new int[6];
        this.f530012c = iArr;
        this.f530013d = -1;
        this.f530010a = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45876x19318276(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45875xb66b7230(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45874xa37c7d95(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45884x685edb79(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45885xa37cc06b() ? android.os.Process.myTid() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45886x1e9e8ece(), 602, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45873x11cbdb29(), "MicroMsg.GIF.MMGIFDecoder");
        this.f530011b = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16079xa5480b01.m64953x4671af0(bytes, iArr);
        int i17 = iArr[0];
        if (i17 > 1024 || iArr[1] > 1024) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMGIFDecoder", "emoji width or height over size. Width:%d Height:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[1]));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(401L, 2L, 1L, false);
        }
        int i18 = iArr[0];
        int i19 = iArr[1];
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/emoji/decode/MMGIFDecoder", "<init>", "([B)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/emoji/decode/MMGIFDecoder", "<init>", "([B)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        this.f530015f = createBitmap;
        this.f530016g = new wq.c(iArr[2]);
    }

    @Override // wq.d
    public int a() {
        int[] iArr = this.f530012c;
        if (iArr[2] == 1) {
            return Integer.MAX_VALUE;
        }
        return iArr[4];
    }

    @Override // wq.d
    public int b() {
        return this.f530012c[1];
    }

    @Override // wq.d
    public void c() {
        long j17 = this.f530011b;
        android.graphics.Bitmap bitmap = this.f530015f;
        int[] iArr = this.f530012c;
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16079xa5480b01.m64941xdf314918(j17, bitmap, iArr);
        this.f530013d = iArr[5];
        this.f530014e = iArr[4];
    }

    @Override // wq.d
    public int d() {
        return this.f530012c[2];
    }

    @Override // wq.d
    /* renamed from: destroy */
    public void mo174305x5cd39ffa() {
        if (this.f530010a != 0) {
            com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46128x89c4face(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45876x19318276() || com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45880xd6d7f83d(), this.f530010a);
            this.f530010a = 0;
        }
        long j17 = this.f530011b;
        this.f530011b = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16079xa5480b01.m64957x408b7293(j17);
    }

    @Override // wq.d
    public int e() {
        return this.f530012c[0];
    }

    @Override // wq.d
    /* renamed from: getFrame */
    public android.graphics.Bitmap mo174306x74704fb7() {
        return this.f530015f;
    }

    @Override // wq.d
    /* renamed from: seekTo */
    public void mo174307xc9fc1b13(long j17) {
        if (this.f530014e <= 0) {
            c();
        }
        int i17 = (int) j17;
        wq.c cVar = this.f530016g;
        int a17 = cVar.a(i17);
        int[] iArr = this.f530012c;
        int i18 = iArr[2];
        for (int i19 = 0; i19 < i18 && a17 < 0; i19++) {
            c();
            cVar.b(this.f530013d, this.f530014e);
            a17 = cVar.a(i17);
        }
        int i27 = a17 - this.f530013d;
        int i28 = iArr[2];
        int i29 = (i27 + i28) % i28;
        a();
        int i37 = iArr[2];
        boolean z17 = cVar.f530007c;
        for (int i38 = 0; i38 < i29; i38++) {
            c();
        }
    }

    public f(java.io.InputStream stream) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stream, "stream");
        int[] iArr = new int[6];
        this.f530012c = iArr;
        this.f530013d = -1;
        this.f530010a = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45876x19318276(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45875xb66b7230(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45874xa37c7d95(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45884x685edb79(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45885xa37cc06b() ? android.os.Process.myTid() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45886x1e9e8ece(), 602, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45873x11cbdb29(), "MicroMsg.GIF.MMGIFDecoder");
        this.f530011b = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16079xa5480b01.m64956xdbc00c10(stream, iArr);
        int i17 = iArr[0];
        if (i17 > 1024 || iArr[1] > 1024) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMGIFDecoder", "emoji width or height over size. Width:%d Height:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[1]));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(401L, 2L, 1L, false);
        }
        int i18 = iArr[0];
        int i19 = iArr[1];
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/emoji/decode/MMGIFDecoder", "<init>", "(Ljava/io/InputStream;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/emoji/decode/MMGIFDecoder", "<init>", "(Ljava/io/InputStream;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        this.f530015f = createBitmap;
        this.f530016g = new wq.c(iArr[2]);
    }
}
