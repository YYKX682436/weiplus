package wt3;

/* loaded from: classes5.dex */
public final class e1 extends wt3.n0 {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f530941i;

    /* renamed from: j, reason: collision with root package name */
    public final long f530942j;

    /* renamed from: k, reason: collision with root package name */
    public final long f530943k;

    /* renamed from: l, reason: collision with root package name */
    public final int f530944l;

    /* renamed from: m, reason: collision with root package name */
    public final int f530945m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.l f530946n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.i f530947o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j f530948p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(java.lang.String videoPath, long j17, long j18, int i17, int i18, yz5.l lVar, wt3.q classifier) {
        super(classifier);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classifier, "classifier");
        this.f530941i = videoPath;
        this.f530942j = j17;
        this.f530943k = j18;
        this.f530944l = i17;
        this.f530945m = i18;
        this.f530946n = lVar;
    }

    @Override // wt3.n0
    public android.graphics.Bitmap d(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoFrameFeatureExtractor", "nextBitmap:" + this.f530987d[i17]);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j jVar = this.f530948p;
        android.graphics.Bitmap mo66867xb2c2d837 = jVar != null ? jVar.mo66867xb2c2d837(this.f530987d[i17]) : null;
        if (mo66867xb2c2d837 != null) {
            return mo66867xb2c2d837;
        }
        int i18 = this.f530985b;
        int i19 = this.f530986c;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/model/audio/VideoFrameFeatureExtractor", "nextBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/recordvideo/model/audio/VideoFrameFeatureExtractor", "nextBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    @Override // wt3.n0
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.i iVar = this.f530947o;
        if (iVar != null) {
            iVar.c(this.f530948p);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.i iVar2 = this.f530947o;
        if (iVar2 != null) {
            iVar2.b();
        }
    }

    @Override // wt3.n0
    public void f() {
        java.lang.String str;
        java.lang.String str2 = this.f530941i;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str2, true);
        int i17 = d17 != null ? d17.f243915a : 0;
        if (i17 <= 0) {
            try {
                gp.d dVar = new gp.d();
                dVar.setDataSource(str2);
                i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(9), 0);
            } catch (java.lang.Exception unused) {
            }
        }
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoFrameFeatureExtractor", "get video duration error! file exit: " + com.p314xaae8f345.mm.vfs.w6.j(str2));
        }
        this.f530947o = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.i(3, new wt3.d1(this));
        long j17 = this.f530942j;
        if (j17 < 0) {
            j17 = 0;
        }
        long j18 = this.f530943k;
        if (j18 < 0) {
            j18 = i17;
        }
        long j19 = j18 - j17;
        if (j19 > 0) {
            long j27 = 100;
            str = "MicroMsg.VideoFrameFeatureExtractor";
            this.f530987d = new int[]{(int) (j17 + j27), (int) (j19 / 2), (int) (j18 - j27)};
        } else {
            str = "MicroMsg.VideoFrameFeatureExtractor";
            if (i17 > 300) {
                this.f530987d = new int[]{100, i17 / 2, i17 - 100};
            }
        }
        st3.v vVar = st3.v.f494138d;
        long j28 = this.f530944l == 10 ? j18 : i17;
        yz5.l lVar = this.f530946n;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Long.valueOf(j28));
        }
        java.lang.String str3 = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "videoDuration:" + i17 + ", start:" + j17 + ", end:" + j18);
        try {
            int i18 = this.f530985b;
            int i19 = this.f530986c;
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i19));
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/model/audio/VideoFrameFeatureExtractor", "onPrepareImageData", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/recordvideo/model/audio/VideoFrameFeatureExtractor", "onPrepareImageData", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.i iVar = this.f530947o;
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j a17 = iVar != null ? iVar.a() : null;
            this.f530948p = a17;
            if (a17 != null) {
                a17.mo66872x71b25cc3(createBitmap);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str3, e17, "processImageData error", new java.lang.Object[0]);
        }
    }
}
