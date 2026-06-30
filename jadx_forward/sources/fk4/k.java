package fk4;

/* loaded from: classes12.dex */
public final class k implements fk4.u {

    /* renamed from: z, reason: collision with root package name */
    public static final boolean f345145z = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_c2c_video_cdn_diff_enable, true);

    /* renamed from: a, reason: collision with root package name */
    public final fk4.p f345146a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f345147b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f345148c;

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.q f345149d;

    /* renamed from: e, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.q f345150e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f345151f;

    /* renamed from: g, reason: collision with root package name */
    public int f345152g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f345153h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f345154i;

    /* renamed from: j, reason: collision with root package name */
    public float f345155j;

    /* renamed from: k, reason: collision with root package name */
    public final d61.k f345156k;

    /* renamed from: l, reason: collision with root package name */
    public fk4.t f345157l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f345158m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f345159n;

    /* renamed from: o, reason: collision with root package name */
    public long f345160o;

    /* renamed from: p, reason: collision with root package name */
    public final long[] f345161p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Long f345162q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f345163r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f345164s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Long f345165t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f345166u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.q f345167v;

    /* renamed from: w, reason: collision with root package name */
    public final long f345168w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f345169x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2279x798ad335.C18684x5167e453 f345170y;

    /* JADX WARN: Type inference failed for: r0v14, types: [com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$videoEventListener$1] */
    public k(fk4.p task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        this.f345146a = task;
        this.f345147b = "MicroMsg.CdnVideoResourceDownloader@" + hashCode();
        this.f345148c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f345156k = new d61.k();
        this.f345158m = new java.util.HashSet();
        this.f345159n = new java.lang.Object();
        this.f345161p = new long[2];
        this.f345163r = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f345164s = new java.util.concurrent.CopyOnWriteArraySet();
        this.f345166u = task.k();
        java.lang.Long c17 = task.c();
        this.f345168w = c17 != null ? c17.longValue() : 0L;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f345170y = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2>(a0Var) { // from class: com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$videoEventListener$1
            {
                this.f39173x3fe91575 = -2133747774;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2 c5814x771f4db2) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2 event = c5814x771f4db2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.String str = event.f136121g.f88379c;
                if (str != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, fk4.k.this.f())) {
                    int i17 = event.f136121g.f88378b;
                    if (i17 == 0 || i17 == -21006) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fk4.k.this.f345147b, "onEvent: opcode=" + event.f136121g.f88377a + ", mediaId=" + event.f136121g.f88379c + ", length=" + event.f136121g.f88381e);
                        am.hn hnVar = event.f136121g;
                        switch (hnVar.f88377a) {
                            case 1:
                                com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo();
                                am.hn hnVar2 = event.f136121g;
                                videoInfo.f18114x9330627b = hnVar2.f88384h;
                                videoInfo.f18112xd87e3d8c = hnVar2.f88386j;
                                videoInfo.f18115x27b47052 = hnVar2.f88385i;
                                videoInfo.f18116x4f713740 = hnVar2.f88388l;
                                videoInfo.f18113x4486869b = hnVar2.f88387k;
                                fk4.k.this.j(hnVar2.f88380d, hnVar2.f88381e, videoInfo);
                                break;
                            case 2:
                                fk4.k kVar = fk4.k.this;
                                long j17 = hnVar.f88380d;
                                long j18 = hnVar.f88381e;
                                kVar.getClass();
                                try {
                                    kVar.f345160o = kVar.f345156k.d((int) j17, (int) j18) * 1000;
                                } catch (java.lang.Exception e17) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(kVar.f345147b, "Unable to parse video time: " + e17.getMessage());
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f345147b, "onDataAvailable: offset=" + j17 + ", length=" + j18 + ", videoTime=" + kVar.f345160o + ", mediaId=" + kVar.f());
                                kVar.f345163r.set(false);
                                if (kVar.f345154i && kVar.f345155j < 100.0f) {
                                    kVar.m();
                                }
                                fk4.t tVar = kVar.f345157l;
                                if (tVar != null) {
                                    tVar.b(kVar.f345146a.c(), j17, j18, kVar.f345146a.g());
                                    break;
                                }
                                break;
                            case 3:
                                fk4.k.this.f345165t = java.lang.Long.valueOf(hnVar.f88380d + hnVar.f88381e);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fk4.k.this.f345147b, "cdn download to end, cdn length = " + fk4.k.this.f345165t + ",continueDownload = " + fk4.k.this.f345154i + ",current download percent is " + fk4.k.this.f345155j);
                                fk4.k.this.f345163r.set(false);
                                break;
                            case 4:
                                long k17 = com.p314xaae8f345.mm.vfs.w6.k(fk4.k.this.n());
                                if (k17 <= 0) {
                                    k17 = event.f136121g.f88381e;
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fk4.k.this.f345147b, "download finish, xml length = " + fk4.k.this.f345146a.mo79594x23255ddc() + ", actual size = " + k17);
                                fk4.k.a(fk4.k.this, event.f136121g.f88378b, k17);
                                break;
                            case 5:
                                fk4.k.this.k(hnVar.f88380d, hnVar.f88381e);
                                break;
                            case 6:
                                fk4.k kVar2 = fk4.k.this;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar2.f345147b, "onDuplicateFileFound, mediaId=" + kVar2.f());
                                p3325xe03a0797.p3326xc267989b.q qVar = kVar2.f345149d;
                                if (qVar != null) {
                                    ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
                                }
                                kVar2.f345149d = null;
                                p3325xe03a0797.p3326xc267989b.q qVar2 = kVar2.f345150e;
                                if (qVar2 != null) {
                                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                                    ((p3325xe03a0797.p3326xc267989b.r) qVar2).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
                                }
                                kVar2.f345150e = null;
                                fk4.p pVar = kVar2.f345146a;
                                pVar.a();
                                java.util.Iterator it = kVar2.f345164s.iterator();
                                while (it.hasNext()) {
                                    ((ok4.a) it.next()).j();
                                }
                                fk4.t tVar2 = kVar2.f345157l;
                                if (tVar2 != null) {
                                    tVar2.c(pVar.c(), 0, pVar.g());
                                    break;
                                }
                                break;
                            case 7:
                                java.util.Iterator it6 = fk4.k.this.f345164s.iterator();
                                while (it6.hasNext()) {
                                    ((ok4.a) it6.next()).w(event.f136121g.f88382f);
                                }
                                fk4.k kVar3 = fk4.k.this;
                                fk4.t tVar3 = kVar3.f345157l;
                                if (tVar3 != null) {
                                    tVar3.g(kVar3.f345146a.c(), fk4.k.this.f345146a.g());
                                    break;
                                }
                                break;
                            default:
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(fk4.k.this.f345147b, "unknown event opcode " + event.f136121g.f88377a + ", mediaId=" + fk4.k.this.f());
                                break;
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(fk4.k.this.f345147b, "stream download online video error. retCode: " + event.f136121g.f88378b + ", mediaId=" + fk4.k.this.f());
                        fk4.k kVar4 = fk4.k.this;
                        am.hn hnVar3 = event.f136121g;
                        fk4.k.a(kVar4, hnVar3.f88378b, (long) hnVar3.f88381e);
                    }
                }
                return false;
            }
        };
    }

    public static final void a(fk4.k kVar, int i17, long j17) {
        java.lang.Throwable rVar;
        t21.v2 h17;
        java.lang.String str;
        java.lang.String str2;
        java.util.Map d17;
        java.lang.String str3 = kVar.f345147b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinish: ret=");
        sb6.append(i17);
        sb6.append(", mediaId=");
        sb6.append(kVar.f());
        sb6.append(", file length=");
        sb6.append(j17);
        sb6.append(",onVideoDownloadEnd call is ");
        sb6.append(kVar.f345167v != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
        kVar.f345151f = true;
        kVar.f345152g = i17;
        kVar.f345163r.set(false);
        kVar.f345146a.a();
        if (i17 == 0) {
            kVar.e();
        }
        yz5.q qVar = kVar.f345167v;
        if (qVar != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(kVar.f345168w);
            java.lang.String e17 = kVar.f345146a.e();
            if (e17 == null) {
                e17 = "";
            }
            qVar.mo147xb9724478(valueOf, e17, java.lang.Boolean.valueOf(i17 == 0));
        }
        kVar.f345167v = null;
        if (i17 == 0) {
            java.lang.Long l17 = kVar.f345162q;
            if (l17 == null || j17 != l17.longValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f345147b, "onFinish, svrLength != completeLength, svrLength = " + kVar.f345162q + " completeLength = " + j17 + ", fix svrLength");
                kVar.f345162q = java.lang.Long.valueOf(j17);
            }
            if (!kVar.f345153h) {
                java.util.Iterator it = kVar.f345164s.iterator();
                while (it.hasNext()) {
                    ((ok4.a) it.next()).m();
                }
                p3325xe03a0797.p3326xc267989b.q qVar2 = kVar.f345149d;
                if (qVar2 != null) {
                    ((p3325xe03a0797.p3326xc267989b.r) qVar2).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
                }
                kVar.f345149d = null;
            }
            p3325xe03a0797.p3326xc267989b.q qVar3 = kVar.f345150e;
            if (qVar3 != null) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                ((p3325xe03a0797.p3326xc267989b.r) qVar3).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(i17 == 0)));
            }
            kVar.f345150e = null;
            java.util.Iterator it6 = kVar.f345164s.iterator();
            while (it6.hasNext()) {
                ((ok4.a) it6.next()).c();
            }
            java.lang.String e18 = kVar.f345146a.e();
            if (e18 != null) {
                if (r26.i0.n(e18, ya.b.f77495x8b74a326, false)) {
                    h17 = t21.d3.h(r26.n0.q0(e18, ya.b.f77495x8b74a326, e18));
                    str = ".msg.videomsg.$cdnrawvideourl";
                    str2 = ".msg.videomsg.$cdnrawvideoaeskey";
                } else {
                    h17 = t21.d3.h(e18);
                    str = ".msg.videomsg.$cdnvideourl";
                    str2 = ".msg.videomsg.$aeskey";
                }
                java.lang.String g17 = h17 != null ? h17.g() : null;
                if (g17 != null && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "msg", null)) != null) {
                    t21.w2 Ui = t21.o2.Ui();
                    i95.m c17 = i95.n0.c(tg3.u0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    Ui.B(tg3.u0.e8((tg3.u0) c17, null, bm5.f0.f104104s, e18, false, 8, null), (java.lang.String) d17.get(str), (java.lang.String) d17.get(str2));
                }
            }
        } else {
            if (i17 == -5103087 || i17 == -5103059) {
                rVar = new fk4.r(i17);
            } else if (i17 == -10012 || i17 == -10011) {
                rVar = new fk4.s(i17);
            } else {
                rVar = new fk4.q(i17, "Unable to download file: code=" + i17);
            }
            if (!kVar.f345153h) {
                p3325xe03a0797.p3326xc267989b.q qVar4 = kVar.f345149d;
                if (qVar4 != null) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    ((p3325xe03a0797.p3326xc267989b.r) qVar4).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(rVar)));
                }
                kVar.f345149d = null;
            }
            p3325xe03a0797.p3326xc267989b.q qVar5 = kVar.f345150e;
            if (qVar5 != null) {
                p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                ((p3325xe03a0797.p3326xc267989b.r) qVar5).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(rVar)));
            }
            kVar.f345150e = null;
            java.util.Iterator it7 = kVar.f345164s.iterator();
            while (it7.hasNext()) {
                ((ok4.a) it7.next()).n(i17);
            }
            kVar.f345146a.mo79597x360802();
            fk4.t tVar = kVar.f345157l;
            if (tVar != null) {
                tVar.d(kVar.f345146a.c(), kVar.f345146a.g());
            }
        }
        fk4.t tVar2 = kVar.f345157l;
        if (tVar2 != null) {
            tVar2.c(kVar.f345146a.c(), i17, kVar.f345146a.g());
        }
    }

    public void b(ok4.a reporter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reporter, "reporter");
        this.f345164s.add(reporter);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof fk4.e
            if (r0 == 0) goto L13
            r0 = r5
            fk4.e r0 = (fk4.e) r0
            int r1 = r0.f345134g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f345134g = r1
            goto L18
        L13:
            fk4.e r0 = new fk4.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f345132e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f345134g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f345131d
            fk4.k r0 = (fk4.k) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            goto L67
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            boolean r5 = r4.f345151f
            if (r5 == 0) goto L45
            int r5 = r4.f345152g
            if (r5 != 0) goto L3f
            goto L40
        L3f:
            r3 = 0
        L40:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L45:
            r0.f345131d = r4
            r0.f345134g = r3
            kotlinx.coroutines.r r5 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r5.<init>(r0, r3)
            r5.k()
            r4.f345150e = r5
            fk4.f r0 = new fk4.f
            r0.<init>(r4)
            r5.m(r0)
            java.lang.Object r5 = r5.j()
            if (r5 != r1) goto L66
            return r1
        L66:
            r0 = r4
        L67:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r1 = 0
            r0.f345150e = r1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fk4.k.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof fk4.g
            if (r0 == 0) goto L13
            r0 = r6
            fk4.g r0 = (fk4.g) r0
            int r1 = r0.f345139g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f345139g = r1
            goto L18
        L13:
            fk4.g r0 = new fk4.g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f345137e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f345139g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r0 = r0.f345136d
            fk4.k r0 = (fk4.k) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L5e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            boolean r6 = r5.f345153h
            if (r6 == 0) goto L3c
            return r3
        L3c:
            r0.f345136d = r5
            r0.f345139g = r4
            kotlinx.coroutines.r r6 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r6.<init>(r0, r4)
            r6.k()
            r5.f345149d = r6
            fk4.h r0 = new fk4.h
            r0.<init>(r5)
            r6.m(r0)
            java.lang.Object r6 = r6.j()
            if (r6 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
        L5e:
            com.tencent.mars.cdn.CdnManager$VideoInfo r6 = (com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo) r6
            r0.f345149d = r3
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fk4.k.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e() {
        fk4.p pVar = this.f345146a;
        if (t21.u2.b(pVar.j())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345147b, "download finish and is hevc need complete " + pVar.e() + " , mediaId=" + f());
            if (t21.d3.I(pVar.e())) {
                java.util.Iterator it = this.f345164s.iterator();
                while (it.hasNext()) {
                    ((ok4.a) it.next()).u();
                }
            }
        }
    }

    public java.lang.String f() {
        return this.f345146a.i();
    }

    public long g() {
        java.lang.Long l17 = this.f345162q;
        return l17 != null ? l17.longValue() : this.f345146a.mo79594x23255ddc();
    }

    public boolean h() {
        this.f345146a.a();
        return (this.f345151f && this.f345152g == 0) || this.f345146a.mo79595xa89067bc();
    }

    public boolean i() {
        return this.f345169x && !h() && this.f345146a.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.j(r14) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r9.f345156k.a(r14, r10) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        r2 = r9.f345157l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        r2.e(r9.f345146a.c(), r10, r12, r9.f345146a.g());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        r10 = r9.f345164s.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        if (r10.hasNext() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        ((ok4.a) r10.next()).o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        r10 = r9.f345164s.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        if (r10.hasNext() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b7, code lost:
    
        ((ok4.a) r10.next()).r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
    
        t21.o2.Di().p(f(), 0, -1, 0);
        t21.d3.J(r9.f345146a.e(), 15);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void j(long r10, long r12, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo r14) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fk4.k.j(long, long, com.tencent.mars.cdn.CdnManager$VideoInfo):void");
    }

    public final void k(long j17, long j18) {
        java.lang.Long valueOf;
        boolean z17 = f345145z;
        fk4.p pVar = this.f345146a;
        if (z17) {
            valueOf = java.lang.Long.valueOf((java.lang.Math.abs(pVar.mo79594x23255ddc() - j18) > 16 || pVar.mo79594x23255ddc() >= j18) ? j18 : pVar.mo79594x23255ddc());
        } else {
            valueOf = java.lang.Long.valueOf((pVar.mo79594x23255ddc() <= 0 || pVar.mo79594x23255ddc() == j18) ? j18 : pVar.mo79594x23255ddc());
        }
        this.f345162q = valueOf;
        this.f345155j = (((float) j17) * 100.0f) / ((float) j18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345147b, pVar.i() + " onProgress: " + j17 + " / " + j18 + " (" + this.f345155j + "%)");
        fk4.t tVar = this.f345157l;
        if (tVar != null) {
            tVar.a(pVar.c(), j17, j18, pVar.g());
        }
        java.util.Iterator it = this.f345164s.iterator();
        while (it.hasNext()) {
            ((ok4.a) it.next()).d(j17);
        }
    }

    public final void l() {
        if (!this.f345169x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f345147b, "downloader hasn't been started, ignore call");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345147b, "pause downloader[" + this.f345168w + "] [" + f() + "]()");
        java.util.Iterator it = this.f345164s.iterator();
        while (it.hasNext()) {
            ((ok4.a) it.next()).p();
        }
        java.lang.String f17 = f();
        if (f17 == null || f17.length() == 0) {
            return;
        }
        if (this.f345151f) {
            e();
        }
        if (this.f345155j >= this.f345146a.d() && !this.f345151f) {
            this.f345146a.l();
            java.util.Iterator it6 = this.f345164s.iterator();
            while (it6.hasNext()) {
                ((ok4.a) it6.next()).k();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345147b, "start complete video, downloaded (" + this.f345155j + ") more than config (" + this.f345146a.d() + ").");
        }
        this.f345146a.mo79597x360802();
    }

    public void m() {
        if (this.f345154i) {
            this.f345163r.set(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345147b, "request all mediaId=" + f() + ",continueDownload is " + this.f345154i + ",current flag is " + this.f345163r.get());
        synchronized (this.f345159n) {
            this.f345158m.add("0_-1");
        }
        this.f345148c.mo50293x3498a0(new fk4.j(this));
    }

    public java.lang.String n() {
        return this.f345146a.j();
    }

    public boolean o() {
        java.lang.String str = "start(), mediaId=" + f();
        java.lang.String str2 = this.f345147b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        fk4.p pVar = this.f345146a;
        if (!pVar.mo79596x68ac462()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "task is not started successfully");
            return false;
        }
        this.f345169x = true;
        mo48813x58998cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "Start download online video " + f() + '-' + pVar.e());
        java.util.Iterator it = this.f345164s.iterator();
        while (it.hasNext()) {
            ((ok4.a) it.next()).b();
        }
        fk4.o b17 = pVar.b();
        if (b17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "task is already in progress");
            long j17 = b17.f345184d;
            if (j17 > 0) {
                j(b17.f345183c, j17, null);
            }
            long j18 = b17.f345182b;
            if (j18 > 0) {
                k(b17.f345181a, j18);
            }
        }
        return true;
    }

    public void p() {
        if (!this.f345169x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f345147b, "downloader hasn't been started, ignore call");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345147b, "stop downloader[" + this.f345168w + "] [" + f() + "]()");
        java.util.Iterator it = this.f345164s.iterator();
        while (it.hasNext()) {
            ((ok4.a) it.next()).p();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345147b, "reset(), mediaId=" + f());
        synchronized (this.f345159n) {
            this.f345158m.clear();
        }
        if (com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.f273903d.b(this.f345170y)) {
            mo48814x2efc64();
        }
        this.f345148c.mo50302x6b17ad39(null);
        yz5.q qVar = this.f345167v;
        if (qVar != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f345168w);
            java.lang.String e17 = this.f345146a.e();
            if (e17 == null) {
                e17 = "";
            }
            qVar.mo147xb9724478(valueOf, e17, java.lang.Boolean.FALSE);
        }
        this.f345167v = null;
        this.f345163r.set(false);
        p3325xe03a0797.p3326xc267989b.q qVar2 = this.f345149d;
        if (qVar2 != null) {
            p3325xe03a0797.p3326xc267989b.p.a(qVar2, null, 1, null);
        }
        this.f345149d = null;
        p3325xe03a0797.p3326xc267989b.q qVar3 = this.f345150e;
        if (qVar3 != null) {
            p3325xe03a0797.p3326xc267989b.p.a(qVar3, null, 1, null);
        }
        this.f345150e = null;
        this.f345154i = false;
        java.lang.String f17 = f();
        if (f17 == null || f17.length() == 0) {
            return;
        }
        if (this.f345151f) {
            e();
        }
        if (this.f345155j >= this.f345146a.d() && !this.f345151f) {
            this.f345146a.l();
            java.util.Iterator it6 = this.f345164s.iterator();
            while (it6.hasNext()) {
                ((ok4.a) it6.next()).k();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345147b, "start complete video, downloaded (" + this.f345155j + ") more than config (" + this.f345146a.d() + ").");
        }
        this.f345146a.mo79597x360802();
    }

    /* renamed from: toString */
    public java.lang.String m129641x9616526c() {
        return "CdnVideoResourceDownloader: mediaId=" + f() + ", savedPath=" + n() + ", moovReady=" + this.f345153h + ", finished=" + this.f345151f + ", totalLength=" + g() + ", started=" + this.f345169x + ", hashCode=" + hashCode();
    }
}
