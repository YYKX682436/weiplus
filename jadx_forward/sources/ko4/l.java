package ko4;

/* loaded from: classes14.dex */
public final class l implements com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.HandlerThread f391613a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f391614b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 f391615c;

    /* renamed from: d, reason: collision with root package name */
    public int f391616d;

    /* renamed from: e, reason: collision with root package name */
    public int f391617e;

    /* renamed from: f, reason: collision with root package name */
    public int f391618f;

    /* renamed from: g, reason: collision with root package name */
    public int f391619g;

    /* renamed from: h, reason: collision with root package name */
    public int f391620h;

    /* renamed from: i, reason: collision with root package name */
    public ko4.c f391621i;

    /* renamed from: j, reason: collision with root package name */
    public ko4.c f391622j;

    /* renamed from: k, reason: collision with root package name */
    public ko4.d f391623k;

    /* renamed from: l, reason: collision with root package name */
    public long f391624l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f391625m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f391626n;

    static {
        mq1.w0.wi();
        fp.d0.n("mediaplus");
    }

    public l() {
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("video_soft_gl", -4);
        this.f391613a = a17;
        this.f391621i = new ko4.c(3, 0, "in");
        this.f391622j = new ko4.c(3, 0, "out");
        this.f391625m = new java.lang.Object();
        a17.start();
        this.f391614b = new android.os.Handler(a17.getLooper());
    }

    public final void a(final yz5.a r17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "r");
        this.f391614b.post(new java.lang.Runnable(r17) { // from class: ko4.k

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f391612d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "function");
                this.f391612d = r17;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f391612d.mo152xb9724478();
            }
        });
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: bindSurfaceTexture */
    public void mo96247x49c4954b(android.graphics.SurfaceTexture surfaceTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        surfaceTexture.setDefaultBufferSize(this.f391616d, this.f391617e);
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: configure */
    public void mo96248xd00d62e6(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
        if (mediaFormat == null || surface == null) {
            xm5.b.b("VideoSoftDecoder", "format:" + mediaFormat + ", surface:" + surface, new java.lang.Object[0]);
            return;
        }
        this.f391616d = mediaFormat.getInteger("width");
        this.f391617e = mediaFormat.getInteger("height");
        this.f391618f = rs0.o.a(mediaFormat, "rotation-degrees", 0);
        this.f391619g = rs0.o.a(mediaFormat, "max-input-size", 0);
        xm5.b.c("VideoSoftDecoder", "configure [" + this.f391616d + ", " + this.f391617e + "], " + this.f391618f + ", " + this.f391619g + ", " + this.f391620h, new java.lang.Object[0]);
        if (this.f391619g <= 0) {
            this.f391619g = this.f391616d * this.f391617e;
        }
        this.f391621i = new ko4.c(3, this.f391619g, "in");
        this.f391622j = new ko4.c(5, this.f391620h, "out");
        a(new ko4.f(this, surface));
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: createInputSurface */
    public android.view.Surface mo96249x4310109f() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: dequeueInputBuffer */
    public int mo96250x9a572d5a(long j17) {
        int b17 = this.f391621i.b(j17);
        if (b17 >= 0) {
            return b17;
        }
        return -1;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: dequeueOutputBuffer */
    public int mo96251x436dd5f1(android.media.MediaCodec.BufferInfo info, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        int a17 = this.f391622j.a(j17);
        if (a17 < 0) {
            return -1;
        }
        android.media.MediaCodec.BufferInfo bufferInfo = this.f391622j.c(a17).f391570a;
        info.presentationTimeUs = bufferInfo.presentationTimeUs;
        info.size = bufferInfo.size;
        return a17;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: flush */
    public void mo96252x5d03b04() {
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: getInputBuffer */
    public java.nio.ByteBuffer mo96253xaa9f9f74(int i17) {
        return this.f391621i.c(i17).f391571b;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: getInputFormat */
    public android.media.MediaFormat mo96254xb124032b() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: getOutputBuffer */
    public java.nio.ByteBuffer mo96255x3c33a717(int i17) {
        return this.f391622j.c(i17).f391571b;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: getOutputFormat */
    public android.media.MediaFormat mo96256x42b80ace() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: isSoft */
    public boolean mo96257xb9a8d074() {
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: queueInputBuffer */
    public void mo96258xfe5642d9(int i17, int i18, int i19, long j17, int i27) {
        android.media.MediaCodec.BufferInfo bufferInfo = this.f391621i.c(i17).f391570a;
        bufferInfo.presentationTimeUs = j17;
        bufferInfo.size = i19;
        ko4.c cVar = this.f391621i;
        java.util.concurrent.locks.ReentrantLock reentrantLock = cVar.f391575d;
        reentrantLock.lock();
        try {
            cVar.f391579h++;
            cVar.f391576e.signalAll();
            reentrantLock.unlock();
            a(new ko4.g(this, i19));
        } catch (java.lang.Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: release */
    public void mo96259x41012807() {
        this.f391614b.post(new ko4.h(this));
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: releaseOutputBuffer */
    public void mo96260xab26be48(int i17, boolean z17) {
        if (!z17) {
            a(new ko4.j(this));
            return;
        }
        a(new ko4.i(this, i17));
        synchronized (this.f391625m) {
            this.f391625m.wait(5000L);
        }
        if (this.f391626n) {
            this.f391626n = false;
            throw new java.lang.RuntimeException("render error");
        }
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: reset */
    public void mo96261x6761d4f() {
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: setDataSource */
    public void mo96262x683d6267(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        long m46882x630f29e = com.p314xaae8f345.mm.p871x7fa16b7e.C10909x8b10b9c6.m46882x630f29e(path);
        this.f391624l = m46882x630f29e;
        int m46878x56a857ca = com.p314xaae8f345.mm.p871x7fa16b7e.C10909x8b10b9c6.m46878x56a857ca(m46882x630f29e);
        this.f391620h = com.p314xaae8f345.mm.p871x7fa16b7e.C10909x8b10b9c6.m46881xefb17c6a(this.f391624l);
        xm5.b.c("VideoSoftDecoder", "init " + this.f391624l + ' ' + this.f391620h + ' ' + m46878x56a857ca, new java.lang.Object[0]);
        if (m46878x56a857ca != 0) {
            throw new com.p314xaae8f345.tav.p2947x2eaf9f.C25681xf4008f4b(new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-201, null, ""));
        }
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: signalEndOfInputStream */
    public void mo96263x4cb1f740() {
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: start */
    public void mo96264x68ac462() {
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: stop */
    public void mo96265x360802() {
    }
}
