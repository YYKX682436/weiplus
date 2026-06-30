package kc2;

/* loaded from: classes15.dex */
public final class g1 implements zy2.w7 {
    public kc2.e0 A;
    public boolean B;
    public int C;

    /* renamed from: a, reason: collision with root package name */
    public final zy2.fa f387910a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f387911b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f387912c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f387913d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f387914e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f387915f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f387916g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f387917h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f387918i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f387919j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f387920k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f387921l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f387922m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f387923n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f387924o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f387925p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f387926q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f387927r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f387928s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f387929t;

    /* renamed from: u, reason: collision with root package name */
    public int f387930u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f387931v;

    /* renamed from: w, reason: collision with root package name */
    public int f387932w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6819xdc8f711b f387933x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f387934y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f387935z;

    public g1(zy2.fa redDotManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotManager, "redDotManager");
        this.f387910a = redDotManager;
        this.f387911b = jz5.h.b(kc2.i0.f387948d);
        this.f387912c = jz5.h.b(kc2.r0.f388015d);
        jz5.g b17 = jz5.h.b(new kc2.p0(this));
        this.f387913d = b17;
        this.f387914e = jz5.h.b(kc2.y0.f388076d);
        this.f387915f = jz5.h.b(kc2.f1.f387895d);
        this.f387916g = jz5.h.b(kc2.d1.f387889d);
        this.f387917h = jz5.h.b(kc2.k0.f387979d);
        this.f387918i = jz5.h.b(kc2.m0.f387988d);
        this.f387919j = jz5.h.b(kc2.f0.f387894d);
        this.f387920k = jz5.h.b(new kc2.b1(this));
        this.f387921l = jz5.h.b(new kc2.o0(this));
        this.f387922m = jz5.h.b(new kc2.n0(this));
        this.f387923n = jz5.h.b(new kc2.t0(this));
        this.f387924o = jz5.h.b(new kc2.u0(this));
        this.f387925p = jz5.h.b(new kc2.a1(this));
        this.f387926q = jz5.h.b(new kc2.q0(this));
        this.f387927r = jz5.h.b(new kc2.j0(this));
        this.f387928s = jz5.h.b(new kc2.g0(this));
        this.f387929t = "";
        this.f387931v = "";
        com.p314xaae8f345.mm.app.w.INSTANCE.a((kc2.r) ((jz5.n) b17).mo141623x754a37bb());
        k().mo50293x3498a0(new kc2.s0(this));
    }

    public int a() {
        kc2.q f17 = f();
        kc2.g gVar = kc2.g.f387900i;
        f17.getClass();
        java.util.List list = f17.f388010h;
        int i17 = 0;
        if (!list.isEmpty() && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                if ((((kc2.g) it.next()) != gVar) && (i18 = i18 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
            i17 = i18;
        }
        if (i17 > 0) {
            return i17;
        }
        java.util.List e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5.H.e();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : e17) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y8.f187569a.a("FinderKaraInfoManager", (java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    public void b(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.b3 actionType, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        if (z17) {
            kc2.e0 e0Var = this.A;
            if (e0Var != null) {
                k().mo50300x3fa464aa(e0Var);
                java.lang.String str = e0Var.f387892e;
                this.A = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderKaraInfoManager", "immediate run watch task,key=" + str);
                q(kc2.w1.f388048f, str);
            }
            kc2.q f17 = f();
            if (f17.f388011i.compareAndSet(true, false)) {
                f17.f388004b.mo50293x3498a0(new kc2.p(f17));
            }
        }
        boolean z18 = z17 && actionType == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.b3.f186946d;
        if (z18) {
            java.lang.String valueOf = java.lang.String.valueOf(c01.id.c());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderKaraInfoManager", "findPageSessionId from " + this.f387931v + " to " + valueOf);
            this.f387931v = valueOf;
            r(0);
        }
        if (this.f387935z != z17) {
            if (z17) {
                r(this.f387932w + 1);
                k().mo50293x3498a0(new kc2.l0(this));
            } else {
                int m75939xb282bd08 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2) this.f387910a).f187510e).v().m75939xb282bd08(1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderKaraInfoManager", "exitFindTab lastClickPreferenceKey=" + this.f387929t + ",stayMinSec=" + m75939xb282bd08);
                if (kc2.g.f387896e.a(this.f387929t) != kc2.g.f387899h) {
                    c(false, this.f387929t);
                    if (this.A != null) {
                        k().mo50300x3fa464aa(this.A);
                    }
                    this.A = new kc2.e0(new java.lang.ref.WeakReference(this), this.f387929t);
                    k().mo50297x7c4d7ca2(this.A, m75939xb282bd08 * 1000);
                } else {
                    q(kc2.w1.f388048f, this.f387929t);
                }
            }
        }
        this.f387935z = z17;
        if (z18) {
            k().mo50293x3498a0(new kc2.h0(this));
        }
    }

    public final void c(boolean z17, java.lang.String str) {
        jz5.f0 f0Var;
        java.lang.Object obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderKaraInfoManager", "findTabExposeAction expose=" + z17 + " clickPreferenceKey=" + str);
        if (str.length() == 0) {
            return;
        }
        if (z17) {
            int e17 = c01.id.e();
            d().a(new kc2.a(kc2.k.f387962g, e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderKaraInfoManager", "onFindTabBack(" + java.lang.Thread.currentThread().getName() + ") selectTime=" + e17);
        }
        boolean z18 = !z17;
        java.util.Iterator it = ((java.util.LinkedList) ((jz5.n) this.f387927r).mo141623x754a37bb()).iterator();
        while (true) {
            f0Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((kc2.c0) ((zy2.v7) obj)).f387869f.contains(str)) {
                    break;
                }
            }
        }
        zy2.v7 v7Var = (zy2.v7) obj;
        if (v7Var != null) {
            if (!z18) {
                kc2.c0 c0Var = (kc2.c0) v7Var;
                c0Var.f387865b.mo50293x3498a0(new kc2.z(c0Var));
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var != null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "album_dyna_photo_ui_title")) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderKaraInfoManager", "findTabExposeAction businessManager is null!");
    }

    public final kc2.c d() {
        return (kc2.c) ((jz5.n) this.f387919j).mo141623x754a37bb();
    }

    public final int e() {
        if (ph.t.f435816k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                if (ph.t.f435816k == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                }
            }
        }
        ph.t tVar = ph.t.f435816k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
        return tVar.c().b();
    }

    public final kc2.q f() {
        return (kc2.q) ((jz5.n) this.f387928s).mo141623x754a37bb();
    }

    public final boolean g() {
        return ((java.lang.Boolean) ((jz5.n) this.f387911b).mo141623x754a37bb()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03d8  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r3v18, types: [kc2.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p689xc5a27af6.api.p690x104877e9.C10456x4ff7dd25 h() {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kc2.g1.h():com.tencent.mm.feature.api.discover.DiscoveryReddotFeatures");
    }

    public final kc2.a2 i() {
        return (kc2.a2) ((jz5.n) this.f387917h).mo141623x754a37bb();
    }

    public final kc2.a2 j() {
        return (kc2.a2) ((jz5.n) this.f387918i).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 k() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) this.f387912c.mo141623x754a37bb();
    }

    public final boolean l() {
        if (ph.t.f435816k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                if (ph.t.f435816k == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                }
            }
        }
        ph.t tVar = ph.t.f435816k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
        tVar.c().f();
        return false;
    }

    public final kc2.a2 m() {
        return (kc2.a2) ((jz5.n) this.f387914e).mo141623x754a37bb();
    }

    public final kc2.v1 n() {
        return (kc2.v1) ((jz5.n) this.f387920k).mo141623x754a37bb();
    }

    public final kc2.a2 o() {
        return (kc2.a2) ((jz5.n) this.f387916g).mo141623x754a37bb();
    }

    public final kc2.a2 p() {
        return (kc2.a2) ((jz5.n) this.f387915f).mo141623x754a37bb();
    }

    public void q(kc2.w1 source, java.lang.String clickPreferenceKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickPreferenceKey, "clickPreferenceKey");
        if (!gm0.j1.a() || this.f387933x == null) {
            return;
        }
        k().mo50293x3498a0(new kc2.z0(this, clickPreferenceKey, source));
    }

    public final void r(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderKaraInfoManager", "findPageClickCnt from " + this.f387932w + " to " + i17);
        this.f387932w = i17;
    }

    public int s() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().O(false, c01.e2.f118665p, c01.z1.r(), "weixin", "helper_entry", "filehelper");
    }
}
