package js0;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f382992a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f382993b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f382994c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f382995d;

    /* renamed from: e, reason: collision with root package name */
    public final nl.d f382996e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f382997f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f382998g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f382999h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f383000i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f383001j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f383002k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f383003l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f383004m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f383005n;

    /* renamed from: o, reason: collision with root package name */
    public int f383006o;

    /* renamed from: p, reason: collision with root package name */
    public int f383007p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f383008q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f383009r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f383010s;

    /* renamed from: t, reason: collision with root package name */
    public int f383011t;

    public c(int i17, int i18, boolean z17, boolean z18, yz5.a frameMix, yz5.p frameMixEnd) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameMix, "frameMix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameMixEnd, "frameMixEnd");
        this.f382992a = z17;
        this.f382993b = z18;
        this.f382994c = frameMix;
        this.f382995d = frameMixEnd;
        nl.d dVar = new nl.d();
        this.f382996e = dVar;
        this.f382997f = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f382998g = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f382999h = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f383003l = "MicroMsg.AudioMixCodec";
        this.f383004m = new java.lang.Object();
        this.f383005n = new java.lang.Object();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioMixCodec", "init AudioMixCodec, sampleRate:" + i17 + ", channels:" + i18 + ", mixBackground:" + z17 + ", mixMusic:" + z18);
        int i19 = i18 * 2048;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), 2};
        int i27 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioSyncMixController", "init, outSample:%d, outChannel:%d, outBitDepth:%d", objArr);
        dVar.f419671a = i17;
        dVar.f419672b = i18;
        dVar.f419673c = 2;
        dVar.f419674d = i19;
        if (i19 <= 0) {
            dVar.f419674d = ((((i17 * i18) * 16) * 20) / 8) / 1000;
        }
        this.f383010s = new js0.a(this);
    }

    public static final void a(js0.c cVar) {
        boolean z17;
        java.util.List pcmDataList = cVar.f382999h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pcmDataList, "pcmDataList");
        synchronized (pcmDataList) {
            cVar.f382999h.clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f383003l, "getAudioData, background:" + cVar.f382997f.size() + ", music:" + cVar.f382998g.size());
            if (cVar.f382992a && cVar.f382997f.size() > 0) {
                hl.e eVar = (hl.e) cVar.f382997f.get(0);
                byte[] pcmData = eVar.f363571f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pcmData, "pcmData");
                int length = pcmData.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        z17 = false;
                        break;
                    }
                    if (pcmData[i17] != 0) {
                        z17 = true;
                        break;
                    }
                    i17++;
                }
                if ((!z17) && (!cVar.f382992a || cVar.f382993b)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f383003l, "getAudioData background data zero");
                    cVar.f382997f.remove(eVar);
                }
                cVar.f382999h.add(eVar);
                cVar.f382997f.remove(eVar);
            }
            if (cVar.f382993b && cVar.f382998g.size() > 0) {
                hl.e eVar2 = (hl.e) cVar.f382998g.get(0);
                cVar.f382999h.add(eVar2);
                cVar.f382998g.remove(eVar2);
            }
            java.lang.String str = cVar.f383003l;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("get audio data num ");
            int i18 = cVar.f383011t;
            cVar.f383011t = i18 + 1;
            sb6.append(i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        }
    }

    public static final void b(js0.c cVar) {
        java.util.List pcmDataList = cVar.f382999h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pcmDataList, "pcmDataList");
        synchronized (pcmDataList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f383003l, "the mix thread running mix " + cVar.f383011t + " pcmDataListSize: " + cVar.f382999h.size() + ", mixBackground:" + cVar.f382992a + ", mixMusic:" + cVar.f382993b);
            if (cVar.f382999h.size() > 0) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(cVar.f382999h);
                byte[] a17 = cVar.f382996e.a(arrayList);
                if (a17 != null) {
                    boolean z18 = cVar.f382993b;
                    long j17 = 0;
                    if (z18) {
                        java.util.List<hl.e> pcmDataList2 = cVar.f382999h;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pcmDataList2, "pcmDataList");
                        synchronized (pcmDataList2) {
                            for (hl.e eVar : pcmDataList2) {
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.f363566a, "music")) {
                                    j17 = eVar.f363570e;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f383003l, "get pts from music: " + j17);
                                }
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f383003l, "mix finish pcm frame size: " + a17.length + ", pts:" + j17 + ", cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                        cVar.f382995d.mo149xb9724478(a17, java.lang.Long.valueOf(j17));
                    } else {
                        if (cVar.f382992a && !z18) {
                            java.util.List<hl.e> pcmDataList3 = cVar.f382999h;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pcmDataList3, "pcmDataList");
                            synchronized (pcmDataList3) {
                                for (hl.e eVar2 : pcmDataList3) {
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar2.f363566a, "background")) {
                                        j17 = eVar2.f363570e;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f383003l, "get pts from background: " + j17);
                                    }
                                }
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f383003l, "mix finish pcm frame size: " + a17.length + ", pts:" + j17 + ", cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                        cVar.f382995d.mo149xb9724478(a17, java.lang.Long.valueOf(j17));
                    }
                }
            }
        }
    }

    public final boolean c(byte[] pcmData, java.lang.String audioId, long j17, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcmData, "pcmData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioId, "audioId");
        synchronized (this.f383004m) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f383003l, "pcmData len:" + pcmData.length + ", audioId:" + audioId + ", sampleRate:" + i17 + ", channelCount:" + i18 + ", pts:" + j17);
                hl.e eVar = new hl.e();
                eVar.f363566a = audioId;
                eVar.f363571f = pcmData;
                eVar.f363567b = i17;
                eVar.f363568c = i18;
                eVar.f363570e = j17;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(audioId, "background")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f383003l, "input the background data num = " + this.f382997f.size());
                    this.f382997f.add(eVar);
                    java.lang.String str = this.f383003l;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("input background data:");
                    int i19 = this.f383006o;
                    this.f383006o = i19 + 1;
                    sb6.append(i19);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(audioId, "music")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f383003l, "input the music data num = " + this.f382998g.size());
                    this.f382998g.add(eVar);
                    java.lang.String str2 = this.f383003l;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("input music data:");
                    int i27 = this.f383007p;
                    this.f383007p = i27 + 1;
                    sb7.append(i27);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
                }
                boolean z17 = this.f382993b;
                try {
                    if (z17 && this.f382992a) {
                        if (this.f382998g.size() >= 1 && this.f382997f.size() >= 1) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f383003l, "notify mix");
                            this.f383004m.notifyAll();
                        }
                    } else if ((z17 || this.f382992a) && (this.f382998g.size() >= 1 || this.f382997f.size() >= 1)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f383003l, "notify mix");
                        this.f383004m.notifyAll();
                    }
                } catch (java.lang.Exception unused) {
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f383003l, e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxPcmFrameMixFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 24L, 1L);
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r4.f383008q != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        if (r4.f383009r != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "inputEnd, audioId:"
            java.lang.String r1 = "audioId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r1)
            java.lang.Object r1 = r4.f383004m
            monitor-enter(r1)
            java.lang.String r2 = r4.f383003l     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L79
            r3.append(r5)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = ", mixBackground:"
            r3.append(r0)     // Catch: java.lang.Throwable -> L79
            boolean r0 = r4.f382992a     // Catch: java.lang.Throwable -> L79
            r3.append(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = ", mixMusic:"
            r3.append(r0)     // Catch: java.lang.Throwable -> L79
            boolean r0 = r4.f382993b     // Catch: java.lang.Throwable -> L79
            r3.append(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L79
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = "background"
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r0)     // Catch: java.lang.Throwable -> L79
            r2 = 1
            if (r0 == 0) goto L3a
            r4.f383008q = r2     // Catch: java.lang.Throwable -> L79
        L3a:
            java.lang.String r0 = "music"
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r0)     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L44
            r4.f383009r = r2     // Catch: java.lang.Throwable -> L79
        L44:
            boolean r5 = r4.f382992a     // Catch: java.lang.Throwable -> L79
            r0 = 0
            if (r5 == 0) goto L56
            boolean r3 = r4.f382993b     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L56
            boolean r5 = r4.f383009r     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L67
            boolean r5 = r4.f383008q     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L67
            goto L5c
        L56:
            if (r5 == 0) goto L5e
            boolean r5 = r4.f383008q     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L5e
        L5c:
            r0 = r2
            goto L67
        L5e:
            boolean r5 = r4.f382993b     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L67
            boolean r5 = r4.f383009r     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L67
            goto L5c
        L67:
            if (r0 == 0) goto L77
            r4.f383002k = r2     // Catch: java.lang.Exception -> L77 java.lang.Throwable -> L79
            java.lang.String r5 = r4.f383003l     // Catch: java.lang.Exception -> L77 java.lang.Throwable -> L79
            java.lang.String r0 = "notify mix"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r0)     // Catch: java.lang.Exception -> L77 java.lang.Throwable -> L79
            java.lang.Object r5 = r4.f383004m     // Catch: java.lang.Exception -> L77 java.lang.Throwable -> L79
            r5.notifyAll()     // Catch: java.lang.Exception -> L77 java.lang.Throwable -> L79
        L77:
            monitor-exit(r1)
            return
        L79:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: js0.c.d(java.lang.String):void");
    }
}
