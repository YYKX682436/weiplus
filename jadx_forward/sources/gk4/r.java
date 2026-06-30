package gk4;

/* loaded from: classes10.dex */
public final class r {
    public static final long C;
    public static final java.lang.String D;
    public static final long E;
    public long A;
    public final jk4.e B;

    /* renamed from: a, reason: collision with root package name */
    public gk4.u f354129a;

    /* renamed from: b, reason: collision with root package name */
    public pk4.u f354130b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f354131c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f354132d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f354133e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f354134f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f354135g = "MicroMsg.MultiMediaEffectController@" + hashCode();

    /* renamed from: h, reason: collision with root package name */
    public final um5.i0 f354136h;

    /* renamed from: i, reason: collision with root package name */
    public int f354137i;

    /* renamed from: j, reason: collision with root package name */
    public int f354138j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f354139k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f354140l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f354141m;

    /* renamed from: n, reason: collision with root package name */
    public gk4.t f354142n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f354143o;

    /* renamed from: p, reason: collision with root package name */
    public volatile gk4.e f354144p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f354145q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f354146r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f354147s;

    /* renamed from: t, reason: collision with root package name */
    public wu5.c f354148t;

    /* renamed from: u, reason: collision with root package name */
    public long f354149u;

    /* renamed from: v, reason: collision with root package name */
    public volatile long f354150v;

    /* renamed from: w, reason: collision with root package name */
    public volatile long f354151w;

    /* renamed from: x, reason: collision with root package name */
    public volatile long f354152x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.SurfaceTexture f354153y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f354154z;

    static {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.m97812xedc5400c(new p05.f2());
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.m97811x534d5c42(2);
        xm5.b.f536931a = new p05.g2();
        C = 500L;
        D = "pag/overlap.pag";
        E = 33L;
    }

    public r() {
        um5.i0 i0Var = new um5.i0();
        this.f354136h = i0Var;
        this.f354139k = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f354140l = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f354141m = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f354143o = new java.util.ArrayList();
        this.f354144p = gk4.e.f354075d;
        this.f354149u = -1L;
        this.f354150v = -1L;
        this.f354151w = -1L;
        this.f354152x = -1L;
        this.B = new jk4.e();
        i0Var.j(0, 0);
        i0Var.d();
        i0Var.f510741q = new gk4.d(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007f A[LOOP:0: B:6:0x0010->B:40:0x007f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int a(gk4.r r7, hk4.a r8) {
        /*
            gk4.t r7 = r7.f354142n
            if (r7 == 0) goto L82
            java.util.ArrayList r7 = r7.f354163a
            if (r7 != 0) goto La
            goto L82
        La:
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
            r1 = r0
        L10:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r7.next()
            gk4.s r2 = (gk4.s) r2
            dk4.a r3 = r2.f354162h
            r4 = 0
            if (r3 == 0) goto L24
            java.lang.String r3 = r3.f316015s
            goto L25
        L24:
            r3 = r4
        L25:
            gk4.s r5 = r8.f363462h
            if (r5 == 0) goto L30
            dk4.a r5 = r5.f354162h
            if (r5 == 0) goto L30
            java.lang.String r5 = r5.f316015s
            goto L31
        L30:
            r5 = r4
        L31:
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r5)
            if (r3 == 0) goto L7b
            dk4.a r3 = r2.f354162h
            if (r3 == 0) goto L42
            long r5 = r3.f316010n
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            goto L43
        L42:
            r3 = r4
        L43:
            gk4.s r5 = r8.f363462h
            if (r5 == 0) goto L52
            dk4.a r5 = r5.f354162h
            if (r5 == 0) goto L52
            long r5 = r5.f316010n
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto L53
        L52:
            r5 = r4
        L53:
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r5)
            if (r3 == 0) goto L7b
            dk4.a r2 = r2.f354162h
            if (r2 == 0) goto L64
            long r2 = r2.f316011o
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L65
        L64:
            r2 = r4
        L65:
            gk4.s r3 = r8.f363462h
            if (r3 == 0) goto L73
            dk4.a r3 = r3.f354162h
            if (r3 == 0) goto L73
            long r3 = r3.f316011o
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
        L73:
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r4)
            if (r2 == 0) goto L7b
            r2 = 1
            goto L7c
        L7b:
            r2 = r0
        L7c:
            if (r2 == 0) goto L7f
            goto L83
        L7f:
            int r1 = r1 + 1
            goto L10
        L82:
            r1 = -1
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gk4.r.a(gk4.r, hk4.a):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hk4.a b(gk4.s sVar, boolean z17) {
        dk4.a aVar = sVar.f354162h;
        hk4.n nVar = null;
        if (aVar == null) {
            return null;
        }
        int ordinal = sVar.f354155a.ordinal();
        java.lang.String str = this.f354135g;
        if (ordinal == 1) {
            hk4.n nVar2 = new hk4.n();
            nVar2.m(this.f354137i, this.f354138j);
            java.lang.String str2 = nVar2.f363489k;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "setMediaInfo:" + aVar);
            nVar2.f363491m = aVar;
            java.lang.String path = aVar.f316016t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "path");
            java.lang.String url = aVar.f316017u;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "url");
            java.lang.String str3 = aVar.f316000d;
            java.lang.String str4 = aVar.f315999c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "setImagePath:" + path + ", url:" + url);
            nVar2.f363492n = path;
            nVar2.f363493o = url;
            nVar2.f363494p = str3;
            nVar2.f363495q = str4;
            nVar = nVar2;
        } else if (ordinal != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "unknown track type!");
        } else {
            hk4.x xVar = new hk4.x();
            int i17 = this.f354137i;
            int i18 = this.f354138j;
            xVar.f363455a = i17;
            xVar.f363456b = i18;
            java.lang.String str5 = xVar.f363518k;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "setMediaInfo:" + aVar);
            kk4.v vVar = xVar.f363519l;
            vVar.B(aVar);
            xVar.f363525r = aVar.f316003g;
            if (aVar instanceof jk4.f) {
                float f17 = ((jk4.f) aVar).f381688y;
                if (f17 > 0.0f) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "setPlayRate:" + f17);
                    kk4.c cVar = vVar.f390110b;
                    if (cVar != null) {
                        cVar.mo100967xd079f5a(f17);
                    }
                }
            }
            xVar.j(aVar.f316008l);
            nVar = xVar;
        }
        if (nVar != null) {
            nVar.f363462h = sVar;
            long j17 = sVar.f354158d;
            if (j17 >= 0) {
                long j18 = sVar.f354159e;
                if (j18 > 0) {
                    nVar.l(j17, j18);
                }
            }
            long j19 = sVar.f354156b;
            long j27 = sVar.f354157c;
            nVar.f363457c = j19;
            nVar.f363458d = j27;
            nVar.j(aVar.f316008l);
            nVar.k(this.f354146r);
            if (z17) {
                nVar.f();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setupPlayer:" + nVar);
            nVar.f363459e = new gk4.l(this);
            nVar.f363460f = new gk4.m(this);
            nVar.f363461g = gk4.n.f354124d;
        }
        return nVar;
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354135g, "pause, current status:" + this.f354144p + ", playingPlayers.size:" + this.f354139k.size());
        if (this.f354139k.isEmpty()) {
            return;
        }
        ((hk4.a) this.f354139k.getFirst()).e();
        this.f354144p = gk4.e.f354077f;
        gk4.u uVar = this.f354129a;
        if (uVar != null) {
            uVar.mo67293xb01dfb57();
        }
        m();
    }

    public final void d(int i17) {
        java.lang.Object obj;
        dk4.a aVar;
        gk4.t tVar = this.f354142n;
        if (tVar == null) {
            return;
        }
        java.util.ArrayList arrayList = tVar.f354163a;
        if (i17 >= arrayList.size()) {
            return;
        }
        java.lang.Object obj2 = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
        gk4.s sVar = (gk4.s) obj2;
        dk4.a aVar2 = sVar.f354162h;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f354141m;
        java.util.Iterator it = concurrentLinkedDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            gk4.s sVar2 = ((hk4.a) obj).f363462h;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((sVar2 == null || (aVar = sVar2.f354162h) == null) ? null : aVar.f316015s, aVar2 != null ? aVar2.f316015s : null)) {
                break;
            }
        }
        hk4.a aVar3 = (hk4.a) obj;
        boolean z17 = true;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque2 = this.f354140l;
        if (aVar3 != null) {
            concurrentLinkedDeque.remove(aVar3);
            concurrentLinkedDeque2.add(aVar3);
        } else {
            hk4.a b17 = b(sVar, true);
            if (b17 == null) {
                return;
            }
            concurrentLinkedDeque2.add(b17);
            z17 = false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadMedia, pendingPlayers.size:");
        sb6.append(concurrentLinkedDeque2.size());
        sb6.append(", nextMediaIndex:");
        sb6.append(i17);
        sb6.append(", mediaId:");
        sb6.append(aVar2 != null ? aVar2.f316015s : null);
        sb6.append(", fromFreePlayer:");
        sb6.append(z17);
        sb6.append(", freePlayers.size:");
        sb6.append(concurrentLinkedDeque.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354135g, sb6.toString());
    }

    public final synchronized void e() {
        for (hk4.a aVar : this.f354139k) {
            aVar.o();
            aVar.g();
            this.f354136h.k(aVar.f363463i);
        }
        java.util.Iterator it = this.f354141m.iterator();
        while (it.hasNext()) {
            ((hk4.a) it.next()).g();
        }
        java.util.Iterator it6 = this.f354140l.iterator();
        while (it6.hasNext()) {
            ((hk4.a) it6.next()).g();
        }
        this.f354139k.clear();
        this.f354140l.clear();
        this.f354141m.clear();
    }

    public final void f(long j17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.lang.String str = this.f354135g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seekTo:");
        sb6.append(j17);
        sb6.append(", renderPts:");
        sb6.append(this.f354145q);
        sb6.append(", playingPlayers.size:");
        sb6.append(this.f354139k.size());
        sb6.append(", status:");
        sb6.append(this.f354144p);
        sb6.append(", trackList.size:");
        gk4.t tVar = this.f354142n;
        java.lang.Object obj = null;
        sb6.append((tVar == null || (arrayList2 = tVar.f354163a) == null) ? null : java.lang.Integer.valueOf(arrayList2.size()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(str, sb6.toString(), new java.lang.Object[0]);
        gk4.t tVar2 = this.f354142n;
        if (tVar2 == null || (arrayList = tVar2.f354163a) == null) {
            return;
        }
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            java.lang.Object previous = listIterator.previous();
            gk4.s sVar = (gk4.s) previous;
            if (j17 <= sVar.f354157c && sVar.f354156b <= j17) {
                obj = previous;
                break;
            }
        }
        gk4.s sVar2 = (gk4.s) obj;
        if (sVar2 == null) {
            return;
        }
        long j18 = (j17 - sVar2.f354156b) + sVar2.f354158d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354135g, "found seek target track:" + sVar2 + ", trackSeekTime:" + j18 + ", trackStartTimeMs:" + sVar2.f354158d);
        this.f354152x = j17;
        g(sVar2, j18);
    }

    public final void g(gk4.s sVar, long j17) {
        m();
        hk4.a aVar = (hk4.a) kz5.n0.Y(this.f354139k);
        this.f354144p = gk4.e.f354079h;
        if (aVar == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f363462h, sVar)) {
            e();
            hk4.a b17 = b(sVar, true);
            if (b17 == null) {
                return;
            }
            b17.n();
            dk4.a aVar2 = sVar.f354162h;
            if ((aVar2 == null || aVar2.f316009m) ? false : true) {
                b17.i(j17, null);
            }
            this.f354139k.add(b17);
            java.lang.String str = this.f354135g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seekTo create new player, trackSeekTime:");
            sb6.append(j17);
            sb6.append(", playingPlayers.size:");
            sb6.append(this.f354139k.size());
            sb6.append(", defaultVideo:");
            dk4.a aVar3 = sVar.f354162h;
            sb6.append(aVar3 != null ? java.lang.Boolean.valueOf(aVar3.f316009m) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            return;
        }
        java.lang.String str2 = this.f354135g;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("seekTo locate to first playing player, trackSeekTime:");
        sb7.append(j17);
        sb7.append(", isStarted:");
        sb7.append(aVar.c());
        sb7.append(", isPlaying:");
        sb7.append(aVar.a());
        sb7.append(", defaultVideo:");
        dk4.a aVar4 = sVar.f354162h;
        sb7.append(aVar4 != null ? java.lang.Boolean.valueOf(aVar4.f316009m) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
        dk4.a aVar5 = sVar.f354162h;
        if ((aVar5 == null || aVar5.f316009m) ? false : true) {
            aVar.i(j17, new gk4.j(this, j17, aVar));
        } else {
            this.f354144p = gk4.e.f354076e;
            l();
        }
        if (aVar.c()) {
            return;
        }
        this.f354144p = gk4.e.f354076e;
        if (aVar.b()) {
            aVar.h();
        } else {
            aVar.n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.util.List r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gk4.r.h(java.util.List, boolean):void");
    }

    public final void i(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354135g, "setSize:[" + i17 + ',' + i18 + ']');
        this.f354136h.j(i17, i18);
        this.f354137i = i17;
        this.f354138j = i18;
        java.util.Iterator it = this.f354139k.iterator();
        while (it.hasNext()) {
            ((hk4.a) it.next()).m(i17, i18);
        }
        java.util.Iterator it6 = this.f354140l.iterator();
        while (it6.hasNext()) {
            ((hk4.a) it6.next()).m(i17, i18);
        }
    }

    public final void j(gk4.s sVar, gk4.s sVar2) {
        um5.i0 i0Var = this.f354136h;
        com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc = i0Var.f510726b;
        rm5.n nVar = sVar.f354161g;
        if (nVar.a()) {
            if (nVar.f479063b == null) {
                boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(nVar.f479062a);
                uq5.k kVar = uq5.k.PAGTransitionEffect;
                if (j17) {
                    nVar.f479063b = c22979xbb268bc.i(kVar, nVar.f479062a);
                } else {
                    com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc2 = i0Var.f510726b;
                    android.content.res.AssetManager assets = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
                    nVar.f479063b = c22979xbb268bc2.h(kVar, assets, D);
                }
            }
            long j18 = sVar.f354157c;
            long j19 = sVar2.f354161g.f479064c + j18;
            if (j18 > 0 && j19 > 0) {
                uq5.y yVar = nVar.f479063b;
                if (yVar != null) {
                    yVar.b(j18, j19);
                }
                c22979xbb268bc.c(nVar.f479063b);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set track transition time range:[");
            sb6.append(j18);
            sb6.append(',');
            sb6.append(j19);
            sb6.append("], effect:");
            uq5.y yVar2 = nVar.f479063b;
            sb6.append(yVar2 != null ? java.lang.Long.valueOf(yVar2.f511800a) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354135g, sb6.toString());
        }
    }

    public final void k() {
        gk4.u uVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354135g, "start, current status:" + this.f354144p + ", playingPlayers.size:" + this.f354139k.size() + ", pendingPlayers.size:" + this.f354140l.size());
        if (this.f354143o.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f354135g, "start ignore not set mediaList");
            return;
        }
        gk4.e eVar = this.f354144p;
        gk4.e eVar2 = gk4.e.f354076e;
        if (eVar != eVar2) {
            boolean z17 = !this.f354139k.isEmpty();
            if (this.f354139k.isEmpty()) {
                this.f354145q = 0L;
                if (this.f354140l.isEmpty()) {
                    d(0);
                }
                this.f354139k.add((hk4.a) this.f354140l.removeFirst());
            }
            if (this.f354139k.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f354135g, "start error playingPlayers is empty");
            }
            this.f354144p = eVar2;
            ((hk4.a) kz5.n0.W(this.f354139k)).n();
            if (z17 && (uVar = this.f354129a) != null) {
                uVar.mo67294x57429eec();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354135g, "start finished, playingPlayers.size:" + this.f354139k.size());
            if (this.f354150v > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354135g, "start finished seekTo playRange start:" + this.f354150v);
                f(this.f354150v);
            }
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.A = android.os.SystemClock.elapsedRealtime();
            this.f354154z = false;
        }
        jk4.e eVar3 = this.B;
        eVar3.getClass();
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        eVar3.f381684b = android.os.SystemClock.elapsedRealtime();
    }

    public final synchronized void l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354135g, "startProgressUpdate " + this.f354144p);
        if (this.f354148t != null) {
            return;
        }
        gk4.o oVar = new gk4.o(this);
        if (this.f354144p == gk4.e.f354077f) {
            oVar.run();
        } else {
            this.f354148t = ((ku5.t0) ku5.t0.f394148d).d(oVar, 0L, E);
        }
        this.f354149u = -1L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354135g, "do startProgressUpdate");
    }

    public final void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354135g, "stopProgressUpdate");
        wu5.c cVar = this.f354148t;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f354148t = null;
    }
}
