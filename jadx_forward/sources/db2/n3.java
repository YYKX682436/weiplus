package db2;

/* loaded from: classes2.dex */
public final class n3 implements ay1.m {
    public final java.lang.String A;
    public final db2.b3 B;
    public final db2.m3 C;

    /* renamed from: d, reason: collision with root package name */
    public final int f309612d;

    /* renamed from: e, reason: collision with root package name */
    public final int f309613e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f309614f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.qt2 f309615g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f309616h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f309617i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f309618m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f309619n;

    /* renamed from: o, reason: collision with root package name */
    public final int f309620o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f309621p;

    /* renamed from: q, reason: collision with root package name */
    public final rn5.a f309622q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f309623r;

    /* renamed from: s, reason: collision with root package name */
    public db2.z2 f309624s;

    /* renamed from: t, reason: collision with root package name */
    public db2.d3 f309625t;

    /* renamed from: u, reason: collision with root package name */
    public db2.e3 f309626u;

    /* renamed from: v, reason: collision with root package name */
    public im5.c f309627v;

    /* renamed from: w, reason: collision with root package name */
    public im5.c f309628w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f309629x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f309630y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f309631z;

    public n3(int i17, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var, java.util.List list, boolean z17, boolean z18, boolean z19, int i19, boolean z27, r45.sx2 sx2Var, rn5.a aVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2) {
        java.lang.String m75945x2fec8307;
        this.f309612d = i17;
        this.f309613e = i18;
        this.f309614f = gVar;
        this.f309615g = qt2Var;
        this.f309616h = list;
        this.f309617i = z17;
        this.f309618m = z18;
        this.f309619n = z19;
        this.f309620o = i19;
        this.f309621p = z27;
        this.f309622q = aVar;
        this.f309623r = gVar2;
        this.f309627v = new im5.c();
        this.f309629x = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f309630y = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f309631z = jz5.h.b(db2.f3.f309503d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a, i17, i18, qt2Var, 0L, z27, 8, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderStream#");
        sb6.append(i17);
        sb6.append('#');
        sb6.append((sx2Var == null || (m75945x2fec8307 = sx2Var.m75945x2fec8307(1)) == null) ? "#" : m75945x2fec8307);
        sb6.append(i18);
        sb6.append('#');
        sb6.append(z17);
        sb6.append('@');
        sb6.append(hashCode());
        this.A = sb6.toString();
        this.B = new db2.b3();
        this.C = new db2.m3(this, qt2Var);
    }

    @Override // ay1.m
    public java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        db2.z2 z2Var = this.f309624s;
        if (z2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        this.f309626u = new db2.k3(c0Var, this, nVar);
        this.f309624s = new db2.l3(z2Var, c0Var, nVar);
        i();
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    @Override // ay1.m
    public void b() {
        this.f309630y.compareAndSet(false, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.A, "cancelTask: tabType = " + this.f309612d + ", pullType = " + this.f309613e);
    }

    @Override // ay1.m
    public void c(java.lang.Object obj) {
        db2.c3 value = (db2.c3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.A, "hitPreloadCache: tabType = " + this.f309612d + ", pullType = " + this.f309613e);
        g(value.f309455m, value.f309456n, value.f309457o, value);
    }

    public final db2.n3 e(fb2.m interceptor, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interceptor, "interceptor");
        this.f309629x.add(new fb2.n(interceptor, i17));
        return this;
    }

    public final db2.c3 f(r45.mx2 mx2Var) {
        db2.c3 c3Var = new db2.c3();
        db2.b3 b3Var = this.B;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b3Var, "<set-?>");
        c3Var.f309454i = b3Var;
        c3Var.set(4, mx2Var.m75945x2fec8307(4));
        c3Var.set(3, mx2Var.m75945x2fec8307(3));
        c3Var.m75941xfb821914(1).addAll(mx2Var.m75941xfb821914(1));
        c3Var.m75941xfb821914(12).addAll(mx2Var.m75941xfb821914(12));
        c3Var.set(5, java.lang.Integer.valueOf(mx2Var.m75939xb282bd08(5)));
        c3Var.set(6, java.lang.Integer.valueOf(mx2Var.m75939xb282bd08(6)));
        c3Var.set(7, java.lang.Integer.valueOf(mx2Var.m75939xb282bd08(7)));
        c3Var.set(9, (r45.sq2) mx2Var.m75936x14adae67(9));
        c3Var.set(11, java.lang.Integer.valueOf(mx2Var.m75939xb282bd08(11)));
        c3Var.set(8, java.lang.Integer.valueOf(mx2Var.m75939xb282bd08(8)));
        c3Var.set(25, java.lang.Integer.valueOf(mx2Var.m75939xb282bd08(25)));
        c3Var.set(14, (r45.lw0) mx2Var.m75936x14adae67(14));
        c3Var.set(10, (r45.nz0) mx2Var.m75936x14adae67(10));
        c3Var.set(13, (r45.s03) mx2Var.m75936x14adae67(13));
        c3Var.set(2, mx2Var.m75934xbce7f2f(2));
        c3Var.f309450e = mx2Var.m75941xfb821914(1).size();
        c3Var.set(15, mx2Var.m75945x2fec8307(15));
        c3Var.set(16, (r45.xu2) mx2Var.m75936x14adae67(16));
        c3Var.set(17, (r45.fx2) mx2Var.m75936x14adae67(17));
        c3Var.set(26, (r45.gx2) mx2Var.m75936x14adae67(26));
        c3Var.set(18, (r45.bx2) mx2Var.m75936x14adae67(18));
        c3Var.set(21, mx2Var.m75934xbce7f2f(21));
        c3Var.set(27, (r45.jt2) mx2Var.m75936x14adae67(27));
        c3Var.set(29, (r45.of6) mx2Var.m75936x14adae67(29));
        return c3Var;
    }

    public final void g(int i17, int i18, java.lang.String str, db2.c3 c3Var) {
        java.lang.String b17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLoadFinish tabType=");
        int i19 = this.f309612d;
        sb6.append(i19);
        sb6.append(" pullType:");
        int i27 = this.f309613e;
        sb6.append(i27);
        sb6.append(" lastBuffer=");
        if (c3Var.m75934xbce7f2f(2) == null) {
            b17 = "null";
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = c3Var.m75934xbce7f2f(2);
            b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75934xbce7f2f != null ? m75934xbce7f2f.f273689a : null);
        }
        sb6.append(b17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.A;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        pf5.u uVar = pf5.u.f435469a;
        rn5.a aVar = this.f309622q;
        if (aVar != null) {
            ey2.l lVar = (ey2.l) uVar.e(c61.l7.class).a(ey2.l.class);
            lVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCgiEndVM", "store ext info=" + aVar + '!');
            java.util.HashSet hashSet = lVar.f338954e;
            if (hashSet == null) {
                hashSet = new java.util.HashSet();
            }
            lVar.f338954e = hashSet;
            hashSet.add(aVar);
        }
        db2.d3 d3Var = this.f309625t;
        if (d3Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
            throw null;
        }
        d3Var.mo11124xa374d858();
        yr2.a aVar2 = yr2.a.f546192a;
        r45.sq2 sq2Var = (r45.sq2) c3Var.m75936x14adae67(9);
        java.util.LinkedList m75941xfb821914 = c3Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        aVar2.b(sq2Var, m75941xfb821914, 3901);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f309629x;
        java.util.List F0 = kz5.n0.F0(concurrentLinkedQueue, new db2.h3());
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(F0, 10));
        java.util.Iterator it = F0.iterator();
        while (it.hasNext()) {
            arrayList.add((fb2.m) ((fb2.n) it.next()).f342381a);
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            fb2.m mVar = (fb2.m) it6.next();
            if (mVar.a(c3Var, i19, i27)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "[onLoadFinish] Interceptor is interrupted by " + mVar);
                break;
            }
        }
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.w(i19, this.f309615g);
        }
        c3Var.f309455m = i17;
        c3Var.f309457o = str;
        db2.d3 d3Var2 = this.f309625t;
        if (d3Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
            throw null;
        }
        if (!d3Var2.mo11122x83d23815(i17, i18, c3Var)) {
            db2.z2 z2Var = this.f309624s;
            if (z2Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
                throw null;
            }
            java.util.List F02 = kz5.n0.F0(concurrentLinkedQueue, new db2.g3());
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(F02, 10));
            java.util.Iterator it7 = F02.iterator();
            while (it7.hasNext()) {
                arrayList2.add((fb2.m) ((fb2.n) it7.next()).f342381a);
            }
            z2Var.mo11127x7a59302d(i17, i18, str, c3Var, kz5.n0.S0(arrayList2));
            return;
        }
        if (!this.f309621p && (i27 == 0 || i27 == 1 || i27 == 4)) {
            bs2.n1 R6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class)).R6(i19);
            if (i17 == 0 && i18 == 0) {
                db2.c3 f17 = f(c3Var);
                if (R6 != null) {
                    bs2.h0 h0Var = bs2.h0.f105386p;
                    int i28 = this.f309613e;
                    bs2.f0 f0Var = new bs2.f0();
                    f0Var.f105369a = f17.d().m75942xfb822ef2(12);
                    f0Var.f105370b = f17.d().m75939xb282bd08(3);
                    R6.t(f17, h0Var, i28, f0Var, 0L);
                }
            } else if (R6 != null) {
                R6.x(false, bs2.h0.f105386p);
            }
        }
        db2.e3 e3Var = this.f309626u;
        if (e3Var != null) {
            ((db2.k3) e3Var).a(i17, i18, str, c3Var);
        }
    }

    @Override // ay1.m
    /* renamed from: getKey */
    public java.lang.Object mo8871xb5884f29() {
        int i17 = this.f309613e;
        if (i17 == 0 || i17 == 1 || i17 == 4) {
            i17 = 0;
        } else if (i17 == 3 || i17 == 5 || i17 == 6 || i17 == 7 || i17 == 8 || i17 == 17 || i17 == 9 || i17 == 20) {
            i17 = 3;
        }
        return "Finder.FinderStream.tabType" + this.f309612d + ",pullType" + i17;
    }

    public final void h() {
        db2.d3 d3Var = this.f309625t;
        if (d3Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
            throw null;
        }
        d3Var.mo11123x6b44d7c0(this.B);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
        int i17 = this.f309612d;
        v1Var.p(i17, true, null, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0.f206975a.d(i17, true, this.f309619n, 1);
        pq5.g l17 = this.C.l();
        im5.c cVar = this.f309628w;
        if (cVar != null) {
            l17.f(cVar);
        }
    }

    public final void i() {
        db2.c3 w17;
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("run: tabType = ");
        int i17 = this.f309612d;
        sb6.append(i17);
        sb6.append(", pullType = ");
        int i18 = this.f309613e;
        sb6.append(i18);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.A;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.o(v1Var, this.f309612d, true, null, false, 0L, false, 60, null);
        db2.d3 d3Var = this.f309625t;
        jz5.f0 f0Var = null;
        if (d3Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
            throw null;
        }
        boolean mo11121xd9b295f5 = d3Var.mo11121xd9b295f5();
        db2.b3 b3Var = this.B;
        b3Var.f309441d = mo11121xd9b295f5;
        b3Var.f309443f = android.os.SystemClock.elapsedRealtime();
        if (b3Var.f309441d) {
            v1Var.n(i17, true);
            new db2.a3(this, null, this.f309614f).l().f(this.f309627v);
            return;
        }
        bs2.n1 R6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class)).R6(i17);
        int i19 = this.f309613e;
        boolean z18 = (i19 == 1 || i19 == 0) ? false : true;
        if (this.f309617i || z18) {
            if (z18) {
                if (R6 != null ? R6.e(true, "CgiFinderStream") : false) {
                    bs2.g.a(bs2.g.f105374a, 0, 0, 3, 2, false, 0, false, 115, null);
                }
            }
            h();
            return;
        }
        if (this.f309620o == 1 && i17 == 4) {
            h();
            return;
        }
        if (R6 != null && (w17 = bs2.n1.w(R6, i19, false, new db2.i3(this), 2, null)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209330l0).mo141623x754a37bb()).r()).booleanValue()) {
                pm0.v.X(new db2.j3(this));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[run] use preload cache. tabType=" + i17 + " pullType=" + i18);
            java.util.LinkedList m75941xfb821914 = w17.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) kz5.n0.Z(m75941xfb821914);
            if (c19792x256d2725 != null) {
                z17 = hc2.o0.j(c19792x256d2725) == 2;
            } else {
                z17 = false;
            }
            v1Var.r(this.f309612d, w17.m75934xbce7f2f(21), w17.f309458p, w17.f309459q, z17, false);
            g(0, 0, null, w17);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            h();
        }
    }

    public /* synthetic */ n3(int i17, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var, java.util.List list, boolean z17, boolean z18, boolean z19, int i19, boolean z27, r45.sx2 sx2Var, rn5.a aVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, i18, gVar, qt2Var, (i27 & 16) != 0 ? null : list, (i27 & 32) != 0 ? false : z17, (i27 & 64) != 0 ? false : z18, (i27 & 128) != 0 ? false : z19, (i27 & 256) != 0 ? 0 : i19, (i27 & 512) != 0 ? false : z27, (i27 & 1024) != 0 ? null : sx2Var, (i27 & 2048) != 0 ? null : aVar, (i27 & 4096) != 0 ? null : gVar2);
    }
}
