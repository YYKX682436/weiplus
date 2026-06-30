package yr2;

/* loaded from: classes10.dex */
public final class k {
    public static final yr2.g X = new yr2.g(null);
    public static boolean Y;
    public int A;
    public boolean B;
    public int I;
    public int K;
    public int L;
    public float M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int V;

    /* renamed from: j, reason: collision with root package name */
    public int f546226j;

    /* renamed from: k, reason: collision with root package name */
    public long f546227k;

    /* renamed from: l, reason: collision with root package name */
    public long f546228l;

    /* renamed from: m, reason: collision with root package name */
    public long f546229m;

    /* renamed from: t, reason: collision with root package name */
    public boolean f546236t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f546237u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f546238v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f546240x;

    /* renamed from: y, reason: collision with root package name */
    public int f546241y;

    /* renamed from: z, reason: collision with root package name */
    public int f546242z;

    /* renamed from: a, reason: collision with root package name */
    public final yr2.o f546217a = new yr2.o();

    /* renamed from: b, reason: collision with root package name */
    public int f546218b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f546219c = 4;

    /* renamed from: d, reason: collision with root package name */
    public int f546220d = a06.d.b(30.000002f);

    /* renamed from: e, reason: collision with root package name */
    public long f546221e = 2097152;

    /* renamed from: f, reason: collision with root package name */
    public int f546222f = 1;

    /* renamed from: g, reason: collision with root package name */
    public int f546223g = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f546224h = 4;

    /* renamed from: i, reason: collision with root package name */
    public int f546225i = a06.d.b(0.0f);

    /* renamed from: n, reason: collision with root package name */
    public int f546230n = 1;

    /* renamed from: o, reason: collision with root package name */
    public int f546231o = 2;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f546232p = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f546233q = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: r, reason: collision with root package name */
    public final kk.l f546234r = new kk.l(300);

    /* renamed from: s, reason: collision with root package name */
    public final boolean f546235s = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.X2();

    /* renamed from: w, reason: collision with root package name */
    public boolean f546239w = true;
    public int C = -1;
    public int D = 10000;
    public java.lang.String E = "";
    public int F = -1;
    public int G = -1;
    public int H = -1;

    /* renamed from: J, reason: collision with root package name */
    public final int f546216J = ((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.X).mo141623x754a37bb()).intValue();
    public final java.util.concurrent.CopyOnWriteArrayList T = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.concurrent.CopyOnWriteArrayList U = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.concurrent.ConcurrentHashMap W = new java.util.concurrent.ConcurrentHashMap();

    static {
        ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
        Y = d11.s.Di(4);
    }

    public final jz5.o a(java.lang.String str, long j17, java.util.LinkedList linkedList, java.lang.String str2) {
        java.lang.Object obj;
        java.lang.String str3;
        java.lang.Object obj2;
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.vf2 vf2Var = (r45.vf2) obj;
            if (r26.i0.p(vf2Var.m75945x2fec8307(3), str, true) && ((long) vf2Var.m75939xb282bd08(2)) < j17) {
                break;
            }
        }
        r45.vf2 vf2Var2 = (r45.vf2) obj;
        if (vf2Var2 == null) {
            java.util.ListIterator listIterator = linkedList.listIterator(linkedList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator.previous();
                if (r26.i0.p(((r45.vf2) obj2).m75945x2fec8307(3), str, true)) {
                    break;
                }
            }
            vf2Var2 = (r45.vf2) obj2;
            if (vf2Var2 == null) {
                vf2Var2 = null;
            }
            str3 = "step#2";
        } else {
            str3 = "step#1";
        }
        java.lang.String str4 = str2 + '.' + str3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("findSpecInternal ");
        sb6.append(str2);
        sb6.append(" reqFormat");
        sb6.append(str);
        sb6.append(" maxBitRate:");
        sb6.append(j17);
        sb6.append(" output:");
        sb6.append(vf2Var2 != null ? yr2.l.c(vf2Var2) : null);
        sb6.append(" step:");
        sb6.append(str4);
        sb6.append(" input:");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            arrayList.add(yr2.l.c((r45.vf2) it6.next()));
        }
        sb6.append(arrayList);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaPreloadModel", sb6.toString());
        if (vf2Var2 == null) {
            return null;
        }
        return new jz5.o(vf2Var2, str4 + '+', java.lang.Long.valueOf(this.f546227k));
    }

    public final mn2.g4 b(long j17, r45.mb4 media) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        jz5.o c17 = c(j17, media, false, 0);
        r45.vf2 vf2Var = (r45.vf2) c17.f384374d;
        yr2.g gVar = X;
        java.lang.String m75945x2fec8307 = vf2Var.m75945x2fec8307(3);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        mn2.g4 g4Var = new mn2.g4(media, gVar.c(vf2Var.m75945x2fec8307(0)), vf2Var.m75945x2fec8307(0), gVar.b(m75945x2fec8307), vf2Var.m75939xb282bd08(4), null, vf2Var.m75933x41a8a7f2(20), vf2Var, 32, null);
        this.f546234r.put(g4Var.n(), c17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[findTargetMedia] feedId=");
        sb6.append(pm0.v.u(j17));
        sb6.append(" stage=");
        sb6.append((java.lang.String) c17.f384375e);
        sb6.append(" target");
        sb6.append(yr2.l.c(vf2Var));
        sb6.append(" sdrSpec=");
        java.util.LinkedList<r45.vf2> m75941xfb821914 = media.m75941xfb821914(15);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getSpec(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (r45.vf2 vf2Var2 : m75941xfb821914) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(vf2Var2);
            arrayList.add(yr2.l.c(vf2Var2));
        }
        sb6.append(arrayList);
        sb6.append(" hdrSpec=");
        java.util.LinkedList<r45.vf2> m75941xfb8219142 = media.m75941xfb821914(44);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getHdr_spec(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
        for (r45.vf2 vf2Var3 : m75941xfb8219142) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(vf2Var3);
            arrayList2.add(yr2.l.c(vf2Var3));
        }
        sb6.append(arrayList2);
        sb6.append(" hlsSpec=");
        java.util.LinkedList<r45.jb1> m75941xfb8219143 = media.m75941xfb821914(43);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getHls_spec(...)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(m75941xfb8219143, 10));
        for (r45.jb1 jb1Var : m75941xfb8219143) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jb1Var);
            arrayList3.add("Spec[" + jb1Var.m75945x2fec8307(3) + ' ' + jb1Var.m75945x2fec8307(0) + ' ' + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(jb1Var.m75939xb282bd08(1)) + ']');
        }
        sb6.append(arrayList3);
        sb6.append(" maxBitRate:");
        sb6.append(this.f546227k);
        sb6.append(" isOverseasUser:");
        sb6.append(yr2.g.a(gVar));
        sb6.append(" Cost=");
        sb6.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaPreloadModel", sb6.toString());
        return g4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x027a, code lost:
    
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209303j9).mo141623x754a37bb()).r()).intValue() == r11) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02d1, code lost:
    
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209303j9).mo141623x754a37bb()).r()).intValue() == r11) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0238, code lost:
    
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209303j9).mo141623x754a37bb()).r()).intValue() == 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:216:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0a5c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0aa3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0aa8  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0a6e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.o c(long r43, r45.mb4 r45, boolean r46, int r47) {
        /*
            Method dump skipped, instructions count: 2765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yr2.k.c(long, r45.mb4, boolean, int):jz5.o");
    }

    public final int d() {
        return this.O;
    }

    public final int e() {
        return this.P;
    }

    public final int f() {
        return this.Q;
    }

    public final kk.l g() {
        return this.f546234r;
    }

    public final int h() {
        return this.K;
    }

    public final long i() {
        return this.f546227k;
    }

    public final long j() {
        return this.f546221e;
    }

    public final int k() {
        return this.f546220d;
    }

    public final int l() {
        return this.f546222f;
    }

    public final int m() {
        return this.f546241y;
    }

    public final int n() {
        return this.f546219c;
    }

    public final int o() {
        return this.f546224h;
    }

    public final int p() {
        return this.f546223g;
    }

    public final int q() {
        return this.f546218b;
    }

    public final int r(long j17) {
        int ceil;
        if (this.f546220d <= 0) {
            this.f546220d = a06.d.b(30.000002f);
        }
        if (j17 <= 0) {
            ceil = this.f546220d;
        } else {
            ceil = this.C > 0 ? (int) java.lang.Math.ceil((r0 * 100.0f) / ((float) j17)) : j17 < 60000 ? 100 : this.f546220d;
        }
        return java.lang.Math.min(100, ceil);
    }

    public final int s() {
        return this.f546225i;
    }

    public final int t() {
        return this.f546226j;
    }

    public final java.util.LinkedList u(java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Md).mo141623x754a37bb()).r()).intValue() == 0) {
            return new java.util.LinkedList();
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.vf2().mo11468x92b714fd(((r45.jb1) it.next()).mo14344x5f01b1f6());
            r45.vf2 vf2Var = mo11468x92b714fd instanceof r45.vf2 ? (r45.vf2) mo11468x92b714fd : null;
            if (vf2Var != null) {
                vf2Var.set(20, java.lang.Boolean.TRUE);
                linkedList2.add(vf2Var);
            }
        }
        return linkedList2;
    }

    public final boolean v() {
        return this.f546235s;
    }

    public final boolean w() {
        return this.f546240x;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0268 A[LOOP:0: B:21:0x0262->B:23:0x0268, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List x(ek4.b r48, long r49, r45.mb4 r51, int r52) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yr2.k.x(ek4.b, long, r45.mb4, int):java.util.List");
    }

    public final void y(r45.sq2 info, java.util.HashMap feedSet) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedSet, "feedSet");
        this.f546228l = info.m75942xfb822ef2(0);
        r45.rq2 rq2Var = (r45.rq2) info.m75936x14adae67(1);
        if (rq2Var != null) {
            this.f546218b = rq2Var.m75939xb282bd08(0);
            this.f546219c = rq2Var.m75939xb282bd08(1);
            this.f546220d = a06.d.b(rq2Var.m75938x746dc8a6(3) * 100.0f);
            this.f546227k = rq2Var.m75939xb282bd08(2);
            this.f546221e = rq2Var.m75939xb282bd08(4);
            int m75939xb282bd08 = rq2Var.m75939xb282bd08(5);
            if (1 >= m75939xb282bd08) {
                m75939xb282bd08 = 1;
            }
            this.f546222f = m75939xb282bd08;
            int m75939xb282bd082 = rq2Var.m75939xb282bd08(6);
            this.f546223g = 1 < m75939xb282bd082 ? m75939xb282bd082 : 1;
            this.f546224h = rq2Var.m75939xb282bd08(7);
            this.f546225i = a06.d.b(rq2Var.m75938x746dc8a6(8) * 100.0f);
            this.f546226j = rq2Var.m75939xb282bd08(9);
            this.f546229m = rq2Var.m75939xb282bd08(10);
            this.f546230n = rq2Var.m75939xb282bd08(11);
            this.f546231o = rq2Var.m75939xb282bd08(12);
            this.f546241y = rq2Var.m75939xb282bd08(13);
            this.f546242z = rq2Var.m75939xb282bd08(14);
            this.A = rq2Var.m75939xb282bd08(15);
            this.B = rq2Var.m75933x41a8a7f2(16);
            this.C = rq2Var.m75939xb282bd08(18);
            this.F = rq2Var.m75939xb282bd08(19);
            this.G = rq2Var.m75939xb282bd08(20);
            this.H = rq2Var.m75939xb282bd08(21);
            this.I = rq2Var.m75939xb282bd08(22);
            rq2Var.m75939xb282bd08(23);
            this.K = rq2Var.m75939xb282bd08(24);
            this.L = rq2Var.m75939xb282bd08(25);
            this.M = (float) rq2Var.m75937x160e9ec7(29);
            this.N = rq2Var.m75933x41a8a7f2(40);
            this.O = rq2Var.m75939xb282bd08(43);
            this.P = rq2Var.m75939xb282bd08(44);
            this.Q = rq2Var.m75939xb282bd08(45);
            this.R = rq2Var.m75939xb282bd08(33);
            this.S = rq2Var.m75939xb282bd08(49);
            rq2Var.m75939xb282bd08(50);
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.T;
            copyOnWriteArrayList.clear();
            java.util.LinkedList m75941xfb821914 = rq2Var.m75941xfb821914(51);
            if (m75941xfb821914 != null) {
                copyOnWriteArrayList.addAll(m75941xfb821914);
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = this.U;
            copyOnWriteArrayList2.clear();
            java.util.LinkedList m75941xfb8219142 = rq2Var.m75941xfb821914(52);
            if (m75941xfb8219142 != null) {
                copyOnWriteArrayList2.addAll(m75941xfb8219142);
            }
            this.V = rq2Var.m75939xb282bd08(53);
            java.util.LinkedList<r45.tq2> m75941xfb8219143 = info.m75941xfb821914(2);
            if (m75941xfb8219143 != null) {
                for (r45.tq2 tq2Var : m75941xfb8219143) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) feedSet.get(java.lang.Long.valueOf(tq2Var.m75942xfb822ef2(0)));
                    if (c19792x256d2725 != null && (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null) {
                        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e : m76962x74cd162e) {
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f546232p;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19788xd7cfd73e);
                            java.lang.String m75945x2fec8307 = bu2.z.i(c19788xd7cfd73e).m75945x2fec8307(9);
                            if (m75945x2fec8307 == null) {
                                m75945x2fec8307 = "";
                            }
                            concurrentHashMap.put(m75945x2fec8307, tq2Var);
                        }
                    }
                }
            }
            yr2.o oVar = this.f546217a;
            oVar.getClass();
            oVar.f546246a = android.os.SystemClock.uptimeMillis();
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TP_PLAYER_LOCAL_SERVER_BUFFER_SIZE_LONG_SYNC, java.lang.Long.valueOf(this.F));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TP_PLAYER_LOCAL_SERVER_SEND_SOCKET_BUFFER_SIZE_LONG_SYNC, java.lang.Long.valueOf(this.G));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TP_PLAYER_FFMPEG_TCP_RECV_SOCKET_BUFFER_SIZE_LONG_SYNC, java.lang.Long.valueOf(this.H));
        pm0.v.X(new yr2.j(this));
        java.util.LinkedList linkedList = new java.util.LinkedList(info.m75941xfb821914(2));
        info.m75941xfb821914(2).clear();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_LAST_PRELOAD_INFO_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(info.mo14344x5f01b1f6()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaPreloadModel", "[storePreloadInfo] buffer size=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(r0.length));
        info.m75941xfb821914(2).addAll(linkedList);
    }
}
