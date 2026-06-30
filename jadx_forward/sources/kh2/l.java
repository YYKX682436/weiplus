package kh2;

/* loaded from: classes10.dex */
public final class l implements jh2.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f389537a = "KTVSongTMEScoreCore_" + hashCode();

    /* renamed from: b, reason: collision with root package name */
    public jh2.a f389538b;

    /* renamed from: c, reason: collision with root package name */
    public lh2.a f389539c;

    /* renamed from: d, reason: collision with root package name */
    public lh2.a f389540d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f389541e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f389542f;

    /* renamed from: g, reason: collision with root package name */
    public my5.a f389543g;

    /* renamed from: h, reason: collision with root package name */
    public long f389544h;

    /* renamed from: i, reason: collision with root package name */
    public long f389545i;

    /* renamed from: j, reason: collision with root package name */
    public long f389546j;

    /* renamed from: k, reason: collision with root package name */
    public long f389547k;

    /* renamed from: l, reason: collision with root package name */
    public om2.u f389548l;

    /* renamed from: m, reason: collision with root package name */
    public long f389549m;

    /* renamed from: n, reason: collision with root package name */
    public long f389550n;

    /* renamed from: o, reason: collision with root package name */
    public long f389551o;

    /* renamed from: p, reason: collision with root package name */
    public int f389552p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f389553q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f389554r;

    public l() {
        kh2.h hVar = new kh2.h(this);
        oy5.e eVar = com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65793x233c02ec;
        eVar.getClass();
        com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.log = null;
        eVar.getClass();
        com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.log = hVar;
        this.f389553q = jz5.h.b(kh2.e.f389530d);
        this.f389554r = jz5.h.b(new kh2.g(this));
    }

    @Override // jh2.c
    public void a(om2.u songData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songData, "songData");
        this.f389548l = songData;
        om2.p pVar = songData.f427917b;
        this.f389549m = pVar.f427904e * 1000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389537a, "init songDuraion: " + this.f389549m);
        this.f389543g = pVar.f427901b.f427924c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("origin_");
        java.lang.String str = songData.f427916a;
        sb6.append(str);
        sb6.append(".pcm");
        this.f389539c = new lh2.a(sb6.toString());
        this.f389540d = new lh2.a("score_" + str + ".pcm");
    }

    @Override // jh2.c
    public void b(long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389537a, "updateValidTimeRange: " + j17 + '-' + j18);
        if (j17 < 0 || j18 <= 0 || j17 > j18) {
            return;
        }
        this.f389550n = j17;
        this.f389551o = j18;
    }

    @Override // jh2.c
    public void c(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389537a, "updateCustomVoiceEndTime: " + j17);
        if (j17 <= 0) {
            return;
        }
        this.f389546j = j17;
        k();
    }

    @Override // jh2.c
    public void d(double d17) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389537a, "setReduceRatio: " + d17);
        oy5.h hVar = (oy5.h) i();
        hVar.getClass();
        com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65793x233c02ec.getClass();
        z17 = com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65794x141089db;
        if (z17) {
            hVar.f431647c.m122313xa9c59483(d17);
        }
    }

    @Override // jh2.c
    public void e(jh2.a aVar) {
        this.f389538b = aVar;
    }

    @Override // jh2.c
    public void f(yz5.l lVar) {
        boolean z17;
        android.os.Handler handler;
        om2.u uVar = this.f389548l;
        if (uVar != null) {
            h(uVar, null, "getNote");
        }
        oy5.c i17 = i();
        kh2.d dVar = new kh2.d(lVar, this);
        final oy5.h hVar = (oy5.h) i17;
        hVar.getClass();
        hVar.f431653i = dVar;
        com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65793x233c02ec.getClass();
        z17 = com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65794x141089db;
        if (z17 && (handler = hVar.f431650f) != null) {
            handler.post(new java.lang.Runnable() { // from class: oy5.h$$e
                @Override // java.lang.Runnable
                public final void run() {
                    oy5.h this$0 = oy5.h.this;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                    com.tme.p3259xc83515e4.p3262x153e1c29.C28066x6213ba45[] m122303xe5b6a6e8 = this$0.f431647c.m122303xe5b6a6e8();
                    com.tme.p3259xc83515e4.p3262x153e1c29.InterfaceC28056xada7ee40 interfaceC28056xada7ee40 = this$0.f431653i;
                    if (interfaceC28056xada7ee40 != null) {
                        interfaceC28056xada7ee40.mo122181x69dc6972(m122303xe5b6a6e8);
                    }
                }
            });
        }
    }

    @Override // jh2.c
    public void g(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame audioFrame, long j17, boolean z17) {
        byte[] copyOf;
        boolean z18;
        android.os.Handler handler;
        boolean z19;
        int i17;
        boolean z27;
        boolean z28;
        android.os.Handler handler2;
        android.os.Handler handler3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioFrame, "audioFrame");
        if (!this.f389542f) {
            om2.u uVar = this.f389548l;
            my5.a aVar = this.f389543g;
            if (uVar != null && aVar != null) {
                this.f389545i = 0L;
                this.f389547k = 0L;
                java.util.ArrayList mSentences = aVar.f414385a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mSentences, "mSentences");
                my5.c cVar = (my5.c) kz5.n0.k0(mSentences);
                if (cVar != null) {
                    this.f389545i = cVar.f414391b + cVar.f414392c + 200;
                    k();
                }
                oy5.b bVar = (oy5.b) ((jz5.n) this.f389553q).mo141623x754a37bb();
                final int i18 = audioFrame.f57043x88751aa;
                final int i19 = audioFrame.f57040x2c0b7d03;
                final oy5.g gVar = (oy5.g) bVar;
                gVar.getClass();
                com.tme.p3259xc83515e4.p3262x153e1c29.C28067x2b2da9c0.f65775x233c02ec.getClass();
                z19 = com.tme.p3259xc83515e4.p3262x153e1c29.C28067x2b2da9c0.f65776x141089db;
                if (z19) {
                    android.os.HandlerThread handlerThread = gVar.f431629b;
                    if (handlerThread == null) {
                        handlerThread = new android.os.HandlerThread(gVar.f431631d);
                    }
                    gVar.f431633f = handlerThread;
                    handlerThread.start();
                    gVar.f431632e = new android.os.Handler(handlerThread.getLooper());
                    final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                    android.os.Handler handler4 = gVar.f431632e;
                    if (handler4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pitchHandler");
                        throw null;
                    }
                    handler4.post(new java.lang.Runnable() { // from class: oy5.g$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            oy5.g this$0 = oy5.g.this;
                            int i27 = i18;
                            int i28 = i19;
                            java.util.concurrent.CountDownLatch countDownLatch2 = countDownLatch;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(countDownLatch2, "$countDownLatch");
                            this$0.f431634g = this$0.f431630c.m122264x316510(i27, i28, false);
                            countDownLatch2.countDown();
                        }
                    });
                    countDownLatch.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                    if (gVar.f431634g < 0) {
                        gVar.a();
                    }
                    yz5.l lVar = gVar.f431628a;
                    if (lVar != null) {
                        lVar.mo146xb9724478(kz5.c1.k(new jz5.l(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, java.lang.String.valueOf(gVar.f431634g)), new jz5.l("type", ya.b.f77498x4b14672)));
                    }
                    i17 = gVar.f431634g;
                } else {
                    i17 = -1000;
                }
                int h17 = h(uVar, audioFrame, "sing");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389537a, "init pitchRes res = " + i17 + " initScoreResult: " + h17);
                oy5.c i27 = i();
                kh2.a aVar2 = new kh2.a(this, uVar);
                final oy5.h hVar = (oy5.h) i27;
                hVar.getClass();
                hVar.f431652h = aVar2;
                com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65793x233c02ec.getClass();
                z27 = com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65794x141089db;
                if (z27 && (handler3 = hVar.f431650f) != null) {
                    handler3.post(new java.lang.Runnable() { // from class: oy5.h$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            oy5.h this$0 = oy5.h.this;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                            this$0.f431647c.m122314xdc76a39e(new oy5.j(this$0));
                        }
                    });
                }
                oy5.c i28 = i();
                kh2.b bVar2 = new kh2.b(this, uVar);
                final oy5.h hVar2 = (oy5.h) i28;
                hVar2.getClass();
                hVar2.f431654j = bVar2;
                z28 = com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65794x141089db;
                if (z28 && (handler2 = hVar2.f431650f) != null) {
                    handler2.post(new java.lang.Runnable() { // from class: oy5.h$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            oy5.h this$0 = oy5.h.this;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                            this$0.f431647c.m122309x67792852(new oy5.i(this$0));
                        }
                    });
                }
                jh2.a aVar3 = this.f389538b;
                if (aVar3 != null) {
                    aVar3.R0(uVar.f427916a, aVar.f414385a.size());
                }
                if (h17 == 0 && i17 == 0) {
                    this.f389542f = true;
                    jh2.a aVar4 = this.f389538b;
                    if (aVar4 != null) {
                        aVar4.e4(uVar.f427916a);
                    }
                } else {
                    this.f389542f = false;
                    jh2.a aVar5 = this.f389538b;
                    if (aVar5 != null) {
                        aVar5.e6(uVar.f427916a, new jh2.d(jh2.e.f381345d, h17, "scoreRes = " + h17 + " , pitchRes = " + i17, audioFrame.f57043x88751aa, audioFrame.f57040x2c0b7d03));
                    }
                }
            }
        }
        if (this.f389542f) {
            byte[] data = audioFrame.f57041x2eefaa;
            if (z17) {
                copyOf = new byte[data.length];
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data, "data");
                copyOf = java.util.Arrays.copyOf(data, data.length);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
            }
            final byte[] bArr = copyOf;
            lh2.a aVar6 = this.f389539c;
            if (aVar6 != null) {
                aVar6.b(bArr, bArr.length);
            }
            oy5.b bVar3 = (oy5.b) ((jz5.n) this.f389553q).mo141623x754a37bb();
            final int length = bArr.length;
            final float f17 = (float) j17;
            final kh2.k kVar = new kh2.k(this);
            final oy5.g gVar2 = (oy5.g) bVar3;
            gVar2.getClass();
            com.tme.p3259xc83515e4.p3262x153e1c29.C28067x2b2da9c0.f65775x233c02ec.getClass();
            z18 = com.tme.p3259xc83515e4.p3262x153e1c29.C28067x2b2da9c0.f65776x141089db;
            if (z18 && (handler = gVar2.f431632e) != null) {
                handler.post(new java.lang.Runnable() { // from class: oy5.g$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        oy5.g this$0 = oy5.g.this;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                        byte[] buffer = bArr;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "$buffer");
                        yz5.r callback = kVar;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "$callback");
                        com.tme.p3259xc83515e4.p3262x153e1c29.C28067x2b2da9c0 c28067x2b2da9c0 = this$0.f431630c;
                        int i29 = length;
                        float f18 = f17;
                        c28067x2b2da9c0.m122265xed8d1e6f(buffer, i29, f18);
                        callback.C(buffer, java.lang.Integer.valueOf(i29), java.lang.Float.valueOf(f18), c28067x2b2da9c0.m122263xdac67eef());
                    }
                });
            }
            long j18 = this.f389544h;
            if (1 <= j18 && j18 < j17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389537a, "notifyVoiceEnd voiceEndTime: " + this.f389544h + " songTimeStamp: " + j17 + " isFrameInit: " + this.f389542f);
                this.f389544h = 0L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389537a, "notifyVoiceEnd");
                pm0.v.X(new kh2.j(this));
            }
            long j19 = this.f389547k;
            if (1 <= j19 && j19 < j17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389537a, "notifyFinishSing voiceEndTime: " + this.f389544h + " songFinishTime: " + this.f389547k + " songTimeStamp: " + j17 + " isFrameInit: " + this.f389542f);
                this.f389547k = 0L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389537a, "notifyFinishSing");
                pm0.v.X(new kh2.i(this));
            }
        }
    }

    public final int h(om2.u uVar, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame, java.lang.String str) {
        boolean z17;
        int i17;
        boolean z18;
        boolean z19;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        int[] a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2;
        byte[] bArr;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3;
        oy5.c i18 = i();
        final com.tme.p3259xc83515e4.p3262x153e1c29.C28069xf6529e40 c28069xf6529e40 = new com.tme.p3259xc83515e4.p3262x153e1c29.C28069xf6529e40(tRTCAudioFrame != null ? tRTCAudioFrame.f57043x88751aa : 48000, tRTCAudioFrame != null ? tRTCAudioFrame.f57040x2c0b7d03 : 2, 2);
        final com.tme.p3259xc83515e4.p3262x153e1c29.C28070xb683a587 c28070xb683a587 = new com.tme.p3259xc83515e4.p3262x153e1c29.C28070xb683a587(true, true, false);
        om2.w wVar = uVar.f427917b.f427903d;
        byte[] bArr2 = (wVar == null || (gVar3 = wVar.f427920c) == null) ? null : gVar3.f273689a;
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        my5.a aVar = this.f389543g;
        int[] a18 = aVar != null ? aVar.a() : null;
        if (a18 == null) {
            a18 = new int[0];
        }
        final com.tme.p3259xc83515e4.p3262x153e1c29.C28068xa1f8a054 c28068xa1f8a054 = new com.tme.p3259xc83515e4.p3262x153e1c29.C28068xa1f8a054(bArr2, a18, null, null);
        final oy5.h hVar = (oy5.h) i18;
        hVar.getClass();
        com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65793x233c02ec.getClass();
        z17 = com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65794x141089db;
        if (z17) {
            android.os.HandlerThread handlerThread = hVar.f431646b;
            if (handlerThread == null) {
                handlerThread = new android.os.HandlerThread(hVar.f431648d);
            }
            hVar.f431649e = handlerThread;
            handlerThread.start();
            hVar.f431650f = new android.os.Handler(handlerThread.getLooper());
            hVar.f431651g = 0;
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            android.os.Handler handler = hVar.f431650f;
            if (handler == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scoreHandler");
                throw null;
            }
            handler.post(new java.lang.Runnable() { // from class: oy5.h$$b
                @Override // java.lang.Runnable
                public final void run() {
                    oy5.h this$0 = oy5.h.this;
                    com.tme.p3259xc83515e4.p3262x153e1c29.C28069xf6529e40 info = c28069xf6529e40;
                    com.tme.p3259xc83515e4.p3262x153e1c29.C28070xb683a587 option = c28070xb683a587;
                    com.tme.p3259xc83515e4.p3262x153e1c29.C28068xa1f8a054 config = c28068xa1f8a054;
                    java.util.concurrent.CountDownLatch countDownLatch2 = countDownLatch;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "$info");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "$option");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "$config");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(countDownLatch2, "$countDownLatch");
                    this$0.f431651g = this$0.f431647c.m122306x316510(info, option, config);
                    countDownLatch2.countDown();
                }
            });
            countDownLatch.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            if (hVar.f431651g < 0) {
                android.os.Handler handler2 = hVar.f431650f;
                if (handler2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scoreHandler");
                    throw null;
                }
                handler2.post(new oy5.RunnableC29953x2fd27e(hVar));
                android.os.HandlerThread handlerThread2 = hVar.f431649e;
                if (handlerThread2 != null) {
                    handlerThread2.quit();
                }
            }
            yz5.l lVar = hVar.f431645a;
            if (lVar != null) {
                lVar.mo146xb9724478(kz5.b1.e(new jz5.l(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, java.lang.String.valueOf(hVar.f431651g))));
            }
            i17 = hVar.f431651g;
        } else {
            i17 = -1000;
        }
        int i19 = i17;
        this.f389541e = true;
        java.lang.String str2 = this.f389537a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init iScore res = ");
        sb6.append(i19);
        sb6.append(" noteSize: ");
        om2.w wVar2 = uVar.f427917b.f427903d;
        sb6.append((wVar2 == null || (gVar2 = wVar2.f427920c) == null || (bArr = gVar2.f273689a) == null) ? null : java.lang.Integer.valueOf(bArr.length));
        sb6.append(" lyricSize: ");
        my5.a aVar2 = this.f389543g;
        sb6.append((aVar2 == null || (a17 = aVar2.a()) == null) ? null : java.lang.Integer.valueOf(a17.length));
        sb6.append(" sampleRate: ");
        sb6.append(tRTCAudioFrame != null ? java.lang.Integer.valueOf(tRTCAudioFrame.f57043x88751aa) : null);
        sb6.append(" channel: ");
        sb6.append(tRTCAudioFrame != null ? java.lang.Integer.valueOf(tRTCAudioFrame.f57043x88751aa) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        if (i19 != 0) {
            om2.w wVar3 = uVar.f427917b.f427903d;
            byte[] bArr3 = (wVar3 == null || (gVar = wVar3.f427920c) == null) ? null : gVar.f273689a;
            if (bArr3 == null) {
                bArr3 = new byte[0];
            }
            int length = bArr3.length;
            int i27 = 0;
            while (true) {
                if (i27 >= length) {
                    z18 = true;
                    break;
                }
                if (bArr3[i27] != 0) {
                    z18 = false;
                    break;
                }
                i27++;
            }
            my5.a aVar3 = this.f389543g;
            int[] a19 = aVar3 != null ? aVar3.a() : null;
            if (a19 == null) {
                a19 = new int[0];
            }
            int length2 = a19.length;
            int i28 = 0;
            while (true) {
                if (i28 >= length2) {
                    z19 = true;
                    break;
                }
                if (a19[i28] != 0) {
                    z19 = false;
                    break;
                }
                i28++;
            }
            pm0.z.b(xy2.b.f539688b, "tmeScoreInitError", false, null, null, false, false, new kh2.c(i19, z18, z19, uVar, tRTCAudioFrame, str), 60, null);
        }
        return i19;
    }

    public final oy5.c i() {
        return (oy5.c) this.f389554r.mo141623x754a37bb();
    }

    @Override // jh2.c
    public void j() {
        java.io.OutputStream outputStream;
        java.io.OutputStream outputStream2;
        if (this.f389542f) {
            ((oy5.g) ((oy5.b) ((jz5.n) this.f389553q).mo141623x754a37bb())).a();
        }
        if (this.f389541e) {
            oy5.h hVar = (oy5.h) i();
            android.os.Handler handler = hVar.f431650f;
            if (handler == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scoreHandler");
                throw null;
            }
            handler.post(new oy5.RunnableC29953x2fd27e(hVar));
            android.os.HandlerThread handlerThread = hVar.f431649e;
            if (handlerThread != null) {
                handlerThread.quit();
            }
        }
        this.f389542f = false;
        this.f389538b = null;
        this.f389544h = 0L;
        this.f389546j = 0L;
        this.f389545i = 0L;
        this.f389550n = 0L;
        this.f389551o = 0L;
        this.f389552p = 0;
        lh2.a aVar = this.f389539c;
        if (aVar != null && (outputStream2 = aVar.f400193b) != null) {
            outputStream2.close();
        }
        lh2.a aVar2 = this.f389540d;
        if (aVar2 != null && (outputStream = aVar2.f400193b) != null) {
            outputStream.close();
        }
        com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65793x233c02ec.getClass();
        com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.log = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389537a, "unInit");
    }

    public final void k() {
        long max;
        long j17;
        long j18 = this.f389546j;
        if (j18 > 0) {
            long j19 = this.f389545i;
            if (j19 > 0) {
                j18 = java.lang.Math.min(j18, j19);
                this.f389544h = j18;
                max = java.lang.Math.max(j18, 0L);
                this.f389544h = max;
                j17 = this.f389549m;
                if (j17 > 0 || 6000 + max <= j17) {
                    j17 = max + p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d;
                }
                this.f389547k = j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389537a, "voiceEndTime: " + this.f389544h + " customVoiceEndTime: " + this.f389546j + " lastSentenceEndTime: " + this.f389545i + " singFinishTime: " + this.f389547k + " songDuraion: " + this.f389549m);
            }
        }
        long j27 = this.f389545i;
        if (j27 > 0) {
            j18 = j27;
        }
        this.f389544h = j18;
        max = java.lang.Math.max(j18, 0L);
        this.f389544h = max;
        j17 = this.f389549m;
        if (j17 > 0) {
        }
        j17 = max + p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d;
        this.f389547k = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f389537a, "voiceEndTime: " + this.f389544h + " customVoiceEndTime: " + this.f389546j + " lastSentenceEndTime: " + this.f389545i + " singFinishTime: " + this.f389547k + " songDuraion: " + this.f389549m);
    }

    @Override // jh2.c
    /* renamed from: setKeyShift */
    public void mo140935x93c29fe5(int i17) {
        boolean z17;
        oy5.h hVar = (oy5.h) i();
        hVar.getClass();
        com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65793x233c02ec.getClass();
        z17 = com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65794x141089db;
        if (z17) {
            hVar.f431647c.m122310x93c29fe5(i17);
        }
    }
}
