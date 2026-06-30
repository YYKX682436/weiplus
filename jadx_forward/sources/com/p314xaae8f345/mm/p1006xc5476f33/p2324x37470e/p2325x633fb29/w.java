package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes14.dex */
public final class w implements com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24 {
    public volatile int A;
    public final java.nio.ByteBuffer B;
    public final java.util.LinkedList C;
    public final com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 D;
    public long E;
    public long F;

    /* renamed from: a, reason: collision with root package name */
    public final t21.d2 f257285a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 f257286b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 f257287c;

    /* renamed from: d, reason: collision with root package name */
    public int f257288d;

    /* renamed from: e, reason: collision with root package name */
    public int f257289e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f257290f;

    /* renamed from: g, reason: collision with root package name */
    public android.media.MediaFormat f257291g;

    /* renamed from: h, reason: collision with root package name */
    public volatile long f257292h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f257293i;

    /* renamed from: j, reason: collision with root package name */
    public android.media.ImageReader f257294j;

    /* renamed from: k, reason: collision with root package name */
    public android.media.ImageReader f257295k;

    /* renamed from: l, reason: collision with root package name */
    public android.os.Handler f257296l;

    /* renamed from: m, reason: collision with root package name */
    public final android.os.HandlerThread f257297m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f257298n;

    /* renamed from: o, reason: collision with root package name */
    public os0.g f257299o;

    /* renamed from: p, reason: collision with root package name */
    public rs0.h f257300p;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.ConditionVariable f257301q;

    /* renamed from: r, reason: collision with root package name */
    public int f257302r;

    /* renamed from: s, reason: collision with root package name */
    public int f257303s;

    /* renamed from: t, reason: collision with root package name */
    public java.nio.ByteBuffer f257304t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h f257305u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f257306v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Object f257307w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.Semaphore f257308x;

    /* renamed from: y, reason: collision with root package name */
    public volatile int f257309y;

    /* renamed from: z, reason: collision with root package name */
    public volatile int f257310z;

    public w(t21.d2 d2Var) {
        this.f257285a = d2Var;
        int i17 = pu5.i.f440006b;
        this.f257297m = pu5.f.a("finder_soft_encode_rgb2yuv_thread", -4);
        this.f257301q = new android.os.ConditionVariable();
        this.f257307w = new java.lang.Object();
        this.f257308x = new java.util.concurrent.Semaphore(1);
        this.B = java.nio.ByteBuffer.allocate(1);
        this.C = new java.util.LinkedList();
        this.D = new com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1();
        this.F = -1L;
    }

    public final void a() {
        if (this.f257305u == null) {
            com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 interfaceC25803x5eabc422 = this.f257287c;
            if (interfaceC25803x5eabc422 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.C18788x9408116c) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC25803x5eabc422, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.TAVKitMuxer.SightVideoJNIMediaMuxer");
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.C18788x9408116c) interfaceC25803x5eabc422).getSightEncode() != null) {
                    com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 interfaceC25803x5eabc4222 = this.f257287c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC25803x5eabc4222, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.TAVKitMuxer.SightVideoJNIMediaMuxer");
                    this.f257305u = ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.C18788x9408116c) interfaceC25803x5eabc4222).getSightEncode();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set bufId:");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar = this.f257305u;
                    sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.f243948a) : null);
                    this.D.i("MicroMsg.CompositionSoftwareEncoder", sb6.toString(), new java.lang.Object[0]);
                }
            }
        }
    }

    public final void b(java.nio.ByteBuffer byteBuffer, long j17) {
        byteBuffer.position(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar = this.f257305u;
        if (hVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69265xc600030f(hVar.f243948a, byteBuffer, this.f257288d, this.f257289e);
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 interfaceC25803x5eabc422 = this.f257287c;
        if (interfaceC25803x5eabc422 != null) {
            int videoId = interfaceC25803x5eabc422.getVideoId();
            java.nio.ByteBuffer byteBuffer2 = this.B;
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            bufferInfo.presentationTimeUs = this.f257292h;
            interfaceC25803x5eabc422.mo72400xe78c1db3(videoId, byteBuffer2, bufferInfo);
        }
        this.D.m97814x5d2a96d("MicroMsg.CompositionSoftwareEncoder", "writeSampleData timestamp:" + j17 + ", diff:" + (j17 - this.E));
        this.E = j17;
        this.A = this.A + 1;
    }

    public final void c() {
        android.os.Handler handler;
        synchronized (this.f257307w) {
            this.D.i("MicroMsg.CompositionSoftwareEncoder", "finishEncode, imageReader:" + this.f257294j + ", isInputEndOfStream:" + this.f257293i, new java.lang.Object[0]);
            this.f257306v = true;
            android.media.ImageReader imageReader = this.f257294j;
            if (imageReader != null) {
                imageReader.close();
            }
            android.media.ImageReader imageReader2 = this.f257295k;
            if (imageReader2 != null) {
                imageReader2.close();
            }
            rs0.h hVar = this.f257300p;
            if (hVar != null && (handler = this.f257296l) != null) {
                handler.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.s(this, hVar));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar2 = this.f257305u;
            if (hVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69168xb71d47de(hVar2.f243948a);
            }
            this.f257305u = null;
            this.f257297m.quitSafely();
            this.f257296l = null;
            this.f257295k = null;
            this.f257300p = null;
            this.f257294j = null;
            this.D.i("MicroMsg.CompositionSoftwareEncoder", "finishEncode, encodeYuvCount:" + this.A + ", writeYuvCount:" + this.f257310z + ", renderYuvCount:" + this.f257309y, new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: createInputSurface */
    public android.view.Surface mo72496x4310109f() {
        android.media.ImageReader imageReader = this.f257294j;
        android.view.Surface surface = imageReader != null ? imageReader.getSurface() : null;
        this.D.i("MicroMsg.CompositionSoftwareEncoder", "createInputSurface: " + surface, new java.lang.Object[0]);
        return surface;
    }

    public final void d() {
        this.f257293i = true;
        this.f257292h = -1L;
        this.D.i("MicroMsg.CompositionSoftwareEncoder", "onInputEndOfStream, renderYuvCount:" + this.f257309y + ", writeYuvCount:" + this.f257310z + ", writeRGBCount:0, rgbAvailableCount:0", new java.lang.Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        if ((!r10.C.isEmpty()) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        r11 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.r) r10.C.removeFirst();
        b(r11.f257249a, r11.f257250b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
    
        if ((!r10.C.isEmpty()) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
    
        r11 = r10.f257304t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        if (r11 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
    
        b(r11, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        r10.D.m97814x5d2a96d("MicroMsg.CompositionSoftwareEncoder", "end processImageYUVBufferToWriteYUVData, cost:" + (android.os.SystemClock.elapsedRealtime() - r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c2, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(int r11, int r12, android.media.Image.Plane r13, long r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w.e(int, int, android.media.Image$Plane, long):boolean");
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: flush */
    public void mo72497x5d03b04() {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: getEncodeFormat */
    public android.media.MediaFormat mo72498x16f04c23() {
        android.media.MediaFormat mediaFormat = this.f257291g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mediaFormat);
        return mediaFormat;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: getEncodePresentationTimeUs */
    public long mo72499xaafb0031() {
        return this.f257292h;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: getEncodeSize */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 mo72500xd0e54f2d() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = this.f257290f;
        if (c25732x76648a85 != null) {
            return c25732x76648a85;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 CGSizeZero = com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85.f47831x448c32cd;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CGSizeZero, "CGSizeZero");
        return CGSizeZero;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: isEncodeToEndOfStream */
    public boolean mo72501xa79748b7() {
        return this.f257293i;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: isNeedVideoOutputTexture */
    public boolean mo72502x5836851f() {
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: prepare */
    public boolean mo72503xed060d07(com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036, android.media.MediaFormat mediaFormat) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73 c25800x8b670e73;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1 = this.D;
        if (c25679xbb204036 != null && (c25800x8b670e73 = c25679xbb204036.f47466xc231f8f2) != null) {
            c25799x4a77fd1.m97816x78bda44(c25800x8b670e73);
        }
        c25799x4a77fd1.i("MicroMsg.CompositionSoftwareEncoder", "prepare, outputConfig:" + c25679xbb204036 + ", videoFormat:" + mediaFormat, new java.lang.Object[0]);
        if (c25679xbb204036 == null) {
            return false;
        }
        this.f257288d = c25679xbb204036.m96741xa83ce40f();
        this.f257289e = c25679xbb204036.m96739x4590a3fe();
        c25679xbb204036.m96747x21f69ea8();
        c25679xbb204036.m96745x52061508();
        this.f257290f = new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(this.f257288d, this.f257289e);
        this.f257291g = mediaFormat;
        this.f257294j = android.media.ImageReader.newInstance(this.f257288d, this.f257289e, 1, 1);
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: processVideoTexture */
    public void mo72504x7423ac2f(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sampleTime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sampleTime, "sampleTime");
        if (!this.f257298n) {
            this.D.e("MicroMsg.CompositionSoftwareEncoder", "processVideoTexture imageReader not init now");
            throw new java.lang.Exception("ImageReader not init");
        }
        this.f257308x.acquire();
        this.f257292h = sampleTime.m97232x31040141();
        this.D.m97814x5d2a96d("MicroMsg.CompositionSoftwareEncoder", "processVideoTexture sampleTime:" + this.f257292h + ", diff:" + (this.f257292h - this.F));
        this.F = this.f257292h;
        if (c25745xc3945049 == null) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1 = this.D;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("muxer stared ");
            com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 interfaceC25803x5eabc422 = this.f257287c;
            sb6.append(interfaceC25803x5eabc422 != null ? java.lang.Boolean.valueOf(interfaceC25803x5eabc422.getIsStarted()) : null);
            sb6.append("; texture:");
            sb6.append(c25745xc3945049);
            c25799x4a77fd1.w("MicroMsg.CompositionSoftwareEncoder", sb6.toString());
            return;
        }
        this.D.m97814x5d2a96d("MicroMsg.CompositionSoftwareEncoder", "input sample buffer render texture:" + c25745xc3945049 + ", sampleTime:" + sampleTime.m97232x31040141());
        os0.g gVar = this.f257299o;
        if (gVar != null) {
            gVar.U = c25745xc3945049.f47890xc35d0376;
        }
        if (gVar != null) {
            gVar.w(c25745xc3945049.f47894x6be2dc6, c25745xc3945049.f47883xb7389127);
        }
        if (this.f257300p == null) {
            this.D.m97814x5d2a96d("MicroMsg.CompositionSoftwareEncoder", "processVideoTexture not init rgb2yuvEGLEnvironment, sampleTime:" + this.f257292h);
            return;
        }
        long j17 = this.f257292h;
        android.os.Handler handler = this.f257296l;
        if (handler != null) {
            handler.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.v(this, j17));
        }
        if (this.f257306v) {
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.D.m97814x5d2a96d("MicroMsg.CompositionSoftwareEncoder", "wait output yuv data cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: release */
    public void mo72505x41012807() {
        this.D.i("MicroMsg.CompositionSoftwareEncoder", "release", new java.lang.Object[0]);
        c();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: reset */
    public void mo72506x6761d4f() {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: setMediaMuxer */
    public void mo72507x8f07f4fb(com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 interfaceC25803x5eabc422) {
        this.f257287c = interfaceC25803x5eabc422;
        this.D.i("MicroMsg.CompositionSoftwareEncoder", "setMediaMuxer: " + interfaceC25803x5eabc422, new java.lang.Object[0]);
        if (interfaceC25803x5eabc422 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.C18788x9408116c) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.C18788x9408116c c18788x9408116c = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.C18788x9408116c) interfaceC25803x5eabc422;
            c18788x9408116c.m72373x625e0db6(true);
            c18788x9408116c.m72393x6786bfd0(this);
            c18788x9408116c.m72374xeecfa9d3(this.f257285a);
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: setVideoSampleRenderContext */
    public void mo72508xd49e03b6(com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719) {
        this.f257286b = c25779x3338e719;
        if (c25779x3338e719 == null || this.f257300p != null) {
            return;
        }
        int i17 = this.f257288d;
        int i18 = this.f257289e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i19 = i17 / 4;
        this.f257302r = i19;
        int i27 = (i18 * 3) / 2;
        this.f257303s = i27;
        android.media.ImageReader newInstance = android.media.ImageReader.newInstance(i19, i27, 1, 1);
        this.f257295k = newInstance;
        if (newInstance != null) {
            android.os.HandlerThread handlerThread = this.f257297m;
            handlerThread.start();
            android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
            this.f257296l = handler;
            newInstance.setOnImageAvailableListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.t(this), handler);
            android.os.Handler handler2 = this.f257296l;
            if (handler2 != null) {
                handler2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u(newInstance, this));
            }
        }
        this.f257301q.block(1000L);
        this.D.i("MicroMsg.CompositionSoftwareEncoder", "initRgb2YuvImageReader, yuv size:[" + this.f257302r + 'x' + this.f257303s + "], cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime), new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: signalEndOfInputStream */
    public void mo72509x4cb1f740() {
        this.D.i("MicroMsg.CompositionSoftwareEncoder", "signalEndOfInputStream", new java.lang.Object[0]);
        d();
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: start */
    public boolean mo72510x68ac462() {
        this.D.i("MicroMsg.CompositionSoftwareEncoder", "start", new java.lang.Object[0]);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: stop */
    public void mo72511x360802() {
        this.D.i("MicroMsg.CompositionSoftwareEncoder", "stop", new java.lang.Object[0]);
        c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if ((r1 != null && r1.getIsStarted()) != false) goto L20;
     */
    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24
    /* renamed from: writeVideoSample */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo72512x3f75eca6(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 r8, boolean r9) {
        /*
            r7 = this;
            com.tencent.tav.decoder.muxer.IMediaMuxer r0 = r7.f257287c
            r1 = -1
            if (r0 == 0) goto La
            int r0 = r0.getVideoId()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 1
            if (r0 != r1) goto Lf
            return r2
        Lf:
            r0 = 0
            if (r8 == 0) goto L22
            com.tencent.tav.decoder.muxer.IMediaMuxer r1 = r7.f257287c
            if (r1 == 0) goto L1e
            boolean r1 = r1.getIsStarted()
            if (r1 != r2) goto L1e
            r1 = r2
            goto L1f
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L22
            goto L23
        L22:
            r2 = r0
        L23:
            java.lang.String r1 = "MicroMsg.CompositionSoftwareEncoder"
            if (r8 == 0) goto L4f
            com.tencent.tav.decoder.logger.WXLogger r3 = r7.D
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "writeVideoSample sampleTimeUs:"
            r4.<init>(r5)
            com.tencent.tav.coremedia.CMTime r5 = r8.m97195xfb85bb43()
            long r5 = r5.m97232x31040141()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.m97814x5d2a96d(r1, r4)
            rs0.h r3 = r7.f257300p
            if (r3 == 0) goto L4f
            boolean r3 = r7.f257293i
            if (r3 == 0) goto L4f
            r3 = -1
            r7.f257292h = r3
        L4f:
            if (r9 == 0) goto L6a
            com.tencent.tav.decoder.logger.WXLogger r9 = r7.D
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "writeVideoSample endOfStream, sampleBuffer:"
            r3.<init>(r4)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r9.i(r1, r8, r0)
            r7.d()
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w.mo72512x3f75eca6(com.tencent.tav.coremedia.CMSampleBuffer, boolean):boolean");
    }
}
