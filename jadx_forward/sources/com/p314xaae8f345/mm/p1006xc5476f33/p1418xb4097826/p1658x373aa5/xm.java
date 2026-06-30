package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes14.dex */
public final class xm {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f214873a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.TextureView f214874b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f214875c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f214876d;

    /* renamed from: e, reason: collision with root package name */
    public gp.c f214877e;

    /* renamed from: f, reason: collision with root package name */
    public gp.c f214878f;

    /* renamed from: g, reason: collision with root package name */
    public android.media.MediaCodec f214879g;

    /* renamed from: h, reason: collision with root package name */
    public android.media.MediaFormat f214880h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f214881i;

    /* renamed from: j, reason: collision with root package name */
    public android.os.HandlerThread f214882j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f214883k;

    /* renamed from: l, reason: collision with root package name */
    public long f214884l;

    /* renamed from: m, reason: collision with root package name */
    public long f214885m;

    /* renamed from: n, reason: collision with root package name */
    public long f214886n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f214887o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f214888p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.a f214889q;

    public xm(java.lang.String path, android.view.TextureView textureView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureView, "textureView");
        this.f214873a = path;
        this.f214874b = textureView;
        this.f214875c = "Finder.FinderVideoFrameSeeker";
        this.f214876d = new java.lang.Object();
        this.f214884l = -1L;
        this.f214885m = -1L;
        this.f214886n = -1L;
    }

    public final gp.c a() {
        gp.c cVar = this.f214877e;
        if (cVar != null) {
            return cVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("extractor");
        throw null;
    }

    public final gp.c b() {
        gp.c cVar = this.f214878f;
        if (cVar != null) {
            return cVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameFlagExtractor");
        throw null;
    }

    public final java.lang.String c() {
        java.lang.String str = this.f214881i;
        if (str != null) {
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mime");
        throw null;
    }

    public final void d() {
        android.media.MediaCodec mediaCodec = this.f214879g;
        if (mediaCodec != null) {
            mediaCodec.stop();
        }
        android.media.MediaCodec mediaCodec2 = this.f214879g;
        if (mediaCodec2 != null) {
            mediaCodec2.release();
        }
        this.f214879g = null;
        this.f214888p = false;
        synchronized (this.f214876d) {
            this.f214876d.notify();
        }
    }

    public final void e(yz5.a onTextureReady, yz5.a onTextureDestroy, yz5.l onSeekFrame) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onTextureReady, "onTextureReady");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onTextureDestroy, "onTextureDestroy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSeekFrame, "onSeekFrame");
        java.lang.String str = "FinderVideoFrameSeeker_renderThread" + hashCode();
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a(str, -2);
        this.f214882j = a17;
        a17.start();
        android.os.HandlerThread handlerThread = this.f214882j;
        if (handlerThread == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ht");
            throw null;
        }
        this.f214883k = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(handlerThread.getLooper());
        this.f214877e = new gp.c();
        this.f214878f = new gp.c();
        java.lang.String str2 = this.f214873a;
        java.io.RandomAccessFile B = com.p314xaae8f345.mm.vfs.w6.B(str2, false);
        java.io.FileDescriptor fd6 = B.getFD();
        if (wo.v1.f529357d.f529303a == 1) {
            a().j(fd6, 0L, com.p314xaae8f345.mm.vfs.w6.k(str2));
            b().j(fd6, 0L, com.p314xaae8f345.mm.vfs.w6.k(str2));
        } else {
            a().f355695a.setDataSource(fd6);
            b().f355695a.setDataSource(fd6);
        }
        B.close();
        int d17 = a().d();
        int i18 = 0;
        while (true) {
            if (i18 >= d17) {
                break;
            }
            android.media.MediaFormat e17 = a().e(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getTrackFormat(...)");
            this.f214880h = e17;
            java.lang.String string = e17.getString("mime");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            this.f214881i = string;
            if (r26.i0.y(c(), "video/", false)) {
                a().i(i18);
                b().i(i18);
                break;
            }
            i18++;
        }
        this.f214889q = onTextureDestroy;
        this.f214874b.setSurfaceTextureListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.wm(this, onSeekFrame, onTextureReady));
    }
}
