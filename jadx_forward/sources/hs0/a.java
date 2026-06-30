package hs0;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f366080a;

    /* renamed from: b, reason: collision with root package name */
    public final gp.c f366081b;

    /* renamed from: c, reason: collision with root package name */
    public final int f366082c;

    /* renamed from: d, reason: collision with root package name */
    public final int f366083d;

    /* renamed from: e, reason: collision with root package name */
    public final android.media.MediaFormat f366084e;

    /* renamed from: f, reason: collision with root package name */
    public final android.media.MediaFormat f366085f;

    /* renamed from: g, reason: collision with root package name */
    public final int f366086g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f366087h;

    /* renamed from: i, reason: collision with root package name */
    public int f366088i;

    /* renamed from: j, reason: collision with root package name */
    public long f366089j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f366090k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f366091l;

    public a(java.lang.String filePath) {
        int integer;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        this.f366080a = filePath;
        gp.c cVar = new gp.c();
        this.f366081b = cVar;
        this.f366082c = -1;
        this.f366083d = -1;
        try {
            cVar.k(filePath);
            int d17 = cVar.d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaExtractorWrapper", "trackCount :" + d17 + " filePath :" + filePath);
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            android.util.SparseArray sparseArray2 = new android.util.SparseArray();
            for (int i17 = 0; i17 < d17; i17++) {
                android.media.MediaFormat e17 = this.f366081b.e(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getTrackFormat(...)");
                java.lang.String string = e17.getString("mime");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                if (r26.n0.B(string, "video", false)) {
                    sparseArray.put(i17, e17);
                } else if (r26.n0.B(string, "audio", false)) {
                    sparseArray2.put(i17, e17);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaExtractorWrapper", "video track count:" + sparseArray.size() + ", audio track count:" + sparseArray2.size());
            if (sparseArray2.size() > 0) {
                int keyAt = sparseArray2.keyAt(0);
                this.f366083d = keyAt;
                this.f366085f = (android.media.MediaFormat) sparseArray2.get(keyAt);
            }
            if (sparseArray.size() > 0) {
                int size = sparseArray.size();
                int i18 = Integer.MAX_VALUE;
                for (int i19 = 0; i19 < size; i19++) {
                    int keyAt2 = sparseArray.keyAt(i19);
                    android.media.MediaFormat mediaFormat = (android.media.MediaFormat) sparseArray.get(keyAt2);
                    if (mediaFormat.containsKey("frame-rate") && (integer = mediaFormat.getInteger("frame-rate")) < i18) {
                        this.f366082c = keyAt2;
                        this.f366084e = mediaFormat;
                        i18 = integer;
                    }
                }
                if (this.f366082c < 0) {
                    int keyAt3 = sparseArray.keyAt(0);
                    this.f366082c = keyAt3;
                    this.f366084e = (android.media.MediaFormat) sparseArray.get(keyAt3);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaExtractorWrapper", "audio track index:" + this.f366083d + ", format:" + this.f366085f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaExtractorWrapper", "video track index: " + this.f366082c + ", format:" + this.f366084e);
            int i27 = this.f366082c;
            if (i27 >= 0) {
                this.f366081b.i(i27);
                this.f366087h = true;
            }
            gp.d dVar = new gp.d();
            dVar.setDataSource(this.f366080a);
            this.f366086g = java.lang.Integer.parseInt(dVar.extractMetadata(20));
            dVar.release();
            m134052x9616526c();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaExtractorWrapper", e18, "", new java.lang.Object[0]);
            this.f366090k = true;
        }
    }

    public static boolean c(hs0.a aVar, java.nio.ByteBuffer byteBuffer, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        gp.c cVar = aVar.f366081b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byteBuffer, "byteBuffer");
        try {
            if (aVar.f366091l) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaExtractorWrapper", "readNextSampleData already release");
                return false;
            }
            aVar.f366088i = cVar.f(byteBuffer, i17);
            aVar.f366089j = cVar.b();
            cVar.a();
            return cVar.c() == (aVar.f366087h ? aVar.f366082c : aVar.f366083d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaExtractorWrapper", e17, "readNextSampleData", new java.lang.Object[0]);
            return false;
        }
    }

    public final long a() {
        try {
            return this.f366089j;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaExtractorWrapper", e17, "getSampleTime error", new java.lang.Object[0]);
            return -1L;
        }
    }

    public final java.lang.String b() {
        android.media.MediaFormat mediaFormat = this.f366084e;
        if (mediaFormat != null) {
            return mediaFormat.getString("mime");
        }
        return null;
    }

    public final void d() {
        this.f366081b.g();
        this.f366091l = true;
    }

    public final void e(long j17) {
        if (this.f366091l) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaExtractorWrapper", "seek error, mediaExtractor already release!");
        } else {
            this.f366081b.h(j17, 0);
        }
    }

    public final void f() {
        try {
            int i17 = this.f366082c;
            gp.c cVar = this.f366081b;
            if (i17 >= 0) {
                cVar.f355695a.unselectTrack(i17);
            }
            int i18 = this.f366083d;
            if (i18 >= 0) {
                this.f366087h = false;
                cVar.i(i18);
                this.f366088i = 0;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaExtractorWrapper", e17, "selectAudio error", new java.lang.Object[0]);
        }
    }

    public final void g() {
        try {
            int i17 = this.f366083d;
            gp.c cVar = this.f366081b;
            if (i17 >= 0) {
                cVar.f355695a.unselectTrack(i17);
            }
            int i18 = this.f366082c;
            if (i18 >= 0) {
                this.f366087h = true;
                cVar.i(i18);
                this.f366088i = 0;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaExtractorWrapper", e17, "selectVideo error", new java.lang.Object[0]);
        }
    }

    /* renamed from: toString */
    public java.lang.String m134052x9616526c() {
        return "MediaExtractorWrapper(filePath='" + this.f366080a + "', mediaExtractor=" + this.f366081b + ", videoTrackIndex=" + this.f366082c + ", audioTrackIndex=" + this.f366083d + ", videoTrackFormat=" + this.f366084e + ", audioTrackForamt=" + this.f366085f + ", videoBitrate=" + this.f366086g + ", selectVideo=" + this.f366087h + ", sampleSize=" + this.f366088i + ", hasError=" + this.f366090k + ", isRelease=" + this.f366091l + ')';
    }
}
