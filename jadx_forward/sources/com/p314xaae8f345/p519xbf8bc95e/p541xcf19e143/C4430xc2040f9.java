package com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143;

/* renamed from: com.tencent.mapsdk.vector.VectorMap */
/* loaded from: classes13.dex */
public class C4430xc2040f9 extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl {
    private static final int A = 2;
    private static final int B = 3;

    /* renamed from: a, reason: collision with root package name */
    public static final int f134025a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f134026b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f134027c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f134028d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f134029e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f134030f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f134031g = 11;

    /* renamed from: h, reason: collision with root package name */
    public static final int f134032h = 15;

    /* renamed from: i, reason: collision with root package name */
    public static final int f134033i = 18;

    /* renamed from: j, reason: collision with root package name */
    public static final float f134034j = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25956x399f079e.f49214xa889cb19;

    /* renamed from: k, reason: collision with root package name */
    public static final int f134035k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f134036l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f134037m = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f134038v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static final int f134039w = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final int f134040x = 2;

    /* renamed from: y, reason: collision with root package name */
    public static final int f134041y = 3;

    /* renamed from: z, reason: collision with root package name */
    private static final int f134042z = 1;
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab F;

    /* renamed from: J, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25971x45d136f7 f134043J;
    private boolean K;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2989x21ffc6bd.C26001x61c40f36 L;
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz M;
    private float N;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f134045o;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg f134047q;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py f134050t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f134044n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f134046p = true;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa f134048r = null;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf f134049s = null;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443 C = null;
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.af D = null;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25959x166a66f E = null;
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ae G = null;
    private boolean H = false;
    private boolean I = false;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.Map<com.tencent.mapsdk.internal.qa.b, java.lang.Boolean> f134051u = new java.util.concurrent.ConcurrentHashMap();
    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df O = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df();
    private int P = 0;

    public C4430xc2040f9(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar) {
        this.f134045o = neVar;
        this.M = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz) neVar.f130532b;
    }

    private static int A() {
        return 20;
    }

    private java.lang.String B() {
        return this.f134045o.M();
    }

    private java.lang.String[] C() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        android.graphics.Rect q17 = neVar.f132041h.q();
        android.graphics.Point[] pointArr = {new android.graphics.Point(q17.centerX(), q17.centerY()), new android.graphics.Point(q17.left, q17.top), new android.graphics.Point(q17.left, q17.bottom), new android.graphics.Point(q17.right, q17.top), new android.graphics.Point(q17.right, q17.bottom)};
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i17 = 0; i17 < 5; i17++) {
            android.graphics.Point point = pointArr[i17];
            java.lang.String a17 = neVar.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(point.y, point.x));
            if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(a17)) {
                hashSet.add(a17);
            }
        }
        return (java.lang.String[]) hashSet.toArray(new java.lang.String[0]);
    }

    private android.graphics.Rect D() {
        return this.f134045o.f132041h.q();
    }

    private android.graphics.Rect E() {
        return this.f134045o.f132041h.r();
    }

    private int F() {
        return this.f134045o.f132041h.A.f133942b.f133977m;
    }

    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df G() {
        return this.f134045o.f132041h.s();
    }

    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df H() {
        return this.f134045o.f132041h.t();
    }

    private boolean I() {
        return this.f134045o.f132049p;
    }

    private static void J() {
    }

    private boolean K() {
        return this.f134045o.f132050q;
    }

    private boolean L() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = neVar.f132039f;
        return tkVar != null && ((java.lang.Integer) tkVar.a((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass163>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass163(neVar.M()), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass163) 0)).intValue() == 1;
    }

    private static boolean M() {
        return true;
    }

    private float N() {
        return this.f134045o.f132041h.A.f133942b.a();
    }

    private void O() {
        this.f134045o.f132041h.a((java.lang.Runnable) null);
    }

    private void P() {
        this.f134045o.f132041h.b((java.lang.Runnable) null);
    }

    private void Q() {
        this.f134045o.f132041h.p();
    }

    private boolean R() {
        return this.f134045o.f132041h.k();
    }

    private void S() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        adVar.o();
        adVar.j();
    }

    private void T() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        adVar.o();
        adVar.a(adVar.h(), com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25956x399f079e.f49214xa889cb19, true);
    }

    private void U() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        adVar.o();
        adVar.f130351o.e();
        adVar.a(0.0d, 0.0d);
    }

    private void V() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        adVar.o();
        adVar.f130351o.e();
        adVar.a(adVar.h(), com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25956x399f079e.f49214xa889cb19);
    }

    private void W() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar != null) {
            tkVar.c();
        }
    }

    private void X() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar != null) {
            tkVar.f();
        }
    }

    private void Y() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar != null) {
            tkVar.d();
        }
    }

    private void Z() {
        this.f134045o.f132052s.a();
    }

    private void aA() {
        this.f134044n = true;
    }

    private java.util.ArrayList<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26055x88f0336e> aB() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar == null) {
            return null;
        }
        return neVar.Q();
    }

    private java.lang.String aC() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar == null || (tkVar = neVar.f132039f) == null) {
            return null;
        }
        return (java.lang.String) tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass51(), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass51) null);
    }

    private java.lang.String aD() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar == null || (tkVar = neVar.f132039f) == null) {
            return null;
        }
        return tkVar.a();
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne aE() {
        return this.f134045o;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg aF() {
        return this.f134047q;
    }

    private void aG() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf bfVar = this.f134049s;
        if (bfVar != null) {
            bfVar.f130419d = false;
            bfVar.a();
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0 interfaceC26016x7851a8f0 = bfVar.f130420e;
            if (interfaceC26016x7851a8f0 != null) {
                interfaceC26016x7851a8f0.mo36414xc84af884();
                bfVar.f130420e = null;
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450 interfaceC25954xb7e06450 = bfVar.f130417b;
            if (interfaceC25954xb7e06450 != null) {
                interfaceC25954xb7e06450.mo99129x88fbd074();
                bfVar.f130417b = null;
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener m35940xccabb43e = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35940xccabb43e();
            if (m35940xccabb43e != null) {
                java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener>> it = bfVar.f130423h.iterator();
                while (it.hasNext()) {
                    if (it.next().get() != m35940xccabb43e) {
                        it.remove();
                    }
                }
            }
            this.f134049s = null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar = this.f134047q;
        if (bgVar != null) {
            if (bgVar.f130438b != null) {
                ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) bgVar.f130438b.e_).b(bgVar.f130447k);
                bgVar.f130438b.l();
                bgVar.f130438b = null;
            }
            if (bgVar.f130439c != null) {
                bgVar.f130439c = null;
            }
            com.tencent.mapsdk.internal.hl.a aVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b;
            if (aVar != null) {
                aVar.c();
            }
            this.f134047q = null;
        }
    }

    private void aH() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ae aeVar = this.G;
        if (aeVar != null) {
            if (aeVar.f130390a != null) {
                aeVar.f130390a = null;
            }
            this.G = null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar = this.F;
        if (abVar != null) {
            if (abVar.f130302b != null) {
                abVar.f130302b = null;
            }
            this.F = null;
        }
        if (this.E != null) {
            this.E = null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.af afVar = this.D;
        if (afVar != null) {
            if (afVar.f130391a != null) {
                afVar.f130391a = null;
            }
            this.D = null;
        }
    }

    private long aa() {
        return this.f134045o.f132041h.f130351o.c();
    }

    private void ab() {
        this.f134045o.f132041h.f130351o.a();
    }

    private void ac() {
        this.f134045o.f132041h.f130351o.b();
    }

    private java.lang.String ad() {
        return this.f134045o.m36841x9616526c();
    }

    private boolean ae() {
        return this.f134045o.f132041h.f130351o.f();
    }

    private void af() {
        this.f134045o.f132041h.f130351o.f130290e = 60;
    }

    private int ag() {
        return this.f134045o.f132041h.A.f133944d;
    }

    private android.graphics.Rect ah() {
        return this.f134045o.f132048o;
    }

    private void ai() {
        this.f134045o.f132041h.e();
    }

    private void aj() {
        this.f134045o.f132041h.f();
    }

    private void ak() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw rwVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (!neVar.f132050q || (rwVar = neVar.f132042i) == null) {
            return;
        }
        rwVar.a();
    }

    private void al() {
        this.f134045o.K();
    }

    private int am() {
        return this.P;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf an() {
        return this.f134049s;
    }

    private java.lang.String[] ao() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar != null) {
            return (java.lang.String[]) tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass166(), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass166) null);
        }
        return null;
    }

    private java.lang.String ap() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar != null) {
            return (java.lang.String) tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass169(), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass169) null);
        }
        return null;
    }

    private android.graphics.Rect aq() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar != null) {
            return (android.graphics.Rect) tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass168(), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass168) null);
        }
        return null;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v ar() {
        return this.f134045o.f132041h.g();
    }

    private void as() {
        this.f134045o.f132041h.j();
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nd at() {
        return this.f134045o.f132044k;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v au() {
        return this.f134045o.f132053t;
    }

    private boolean av() {
        return this.f134045o.H.f132686f.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aw() {
        if (this.f134049s == null) {
            this.f134049s = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf(this.f134045o, this.F);
        }
        if (this.C == null) {
            this.C = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443.m99779x3136c9db().m99787x59bc66e();
        }
    }

    private boolean ax() {
        return this.f134046p;
    }

    private java.lang.String ay() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar != null) {
            return neVar.G();
        }
        return null;
    }

    private boolean az() {
        return this.f134044n;
    }

    private static boolean d(int i17, int i18) {
        return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26022x384048dd.f49450x9b60171d.contains(i18, i17);
    }

    private void f(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar) {
        this.f134045o.f132043j.b(ezVar);
        this.f134045o.f132055v = true;
    }

    private void g(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar != null) {
            tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass113(i17));
        }
    }

    private void i(int i17) {
        this.f134045o.f132041h.f130351o.a(i17);
    }

    private void j(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar == null) {
            return;
        }
        if (i17 != 0) {
            if (i17 == 1) {
                neVar.a(false, false);
                int i18 = (mo37459x85ddbf2b() != 11 ? 18 : 17) - 1;
                if (this.P == 2) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
                    adVar.a(i18, (java.lang.Runnable) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad.AnonymousClass4());
                } else {
                    int s17 = s();
                    if (s17 > i18) {
                        i18 = s17;
                    }
                    a(this.O, i18);
                }
            } else if (i17 == 2) {
                int i19 = mo37459x85ddbf2b() != 11 ? 18 : 17;
                int s18 = s();
                if (s18 > i19) {
                    i19 = s18;
                }
                if (this.O.m35331xbc3301f3() != 0) {
                    this.f134045o.f132041h.a(this.O.m35331xbc3301f3(), this.O.m35332x962aa94a(), 2);
                }
                float f17 = this.N;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar2 = this.f134045o.f132041h;
                adVar2.a(i19, (java.lang.Runnable) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad.AnonymousClass5(f17));
                new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: com.tencent.mapsdk.vector.VectorMap.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9.this.f134045o.a(true, false);
                    }
                }, 1000L);
            } else if (i17 == 3) {
                neVar.a(false, true);
            }
        } else {
            neVar.a(false, false);
        }
        this.P = i17;
    }

    private static int k(int i17) {
        if (i17 < 3) {
            i17 = 3;
        }
        if (i17 > 22) {
            return 22;
        }
        return i17;
    }

    private void l(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar == null || 0 == tkVar.f133194e) {
            return;
        }
        tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass179(i17));
    }

    @java.lang.Deprecated
    private void m(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = neVar.f132039f;
        if (tkVar != null) {
            tkVar.f(i17);
            neVar.f132055v = true;
        }
    }

    @java.lang.Deprecated
    private void n(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar != null) {
            tkVar.g(i17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: addAoiLayer */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436 mo36535xc99d1bd7(java.lang.String str, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26007x97be4188 c26007x97be4188, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436.OnAoiLayerLoadListener onAoiLayerLoadListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar;
        super.mo36535xc99d1bd7(str, c26007x97be4188, onAoiLayerLoadListener);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw pwVar = null;
        if (!this.H && (pyVar = this.f134050t) != null) {
            java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw> it = pyVar.f132374a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw next = it.next();
                if (next.mo36409x5db1b11() != null && next.mo36409x5db1b11().equals(str)) {
                    pwVar = next;
                    break;
                }
            }
            if (pwVar == null) {
                pwVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw(pyVar, str, c26007x97be4188, pyVar);
                pyVar.f132374a.add(pwVar);
                if (onAoiLayerLoadListener != null) {
                    pyVar.f132377d.put(str, onAoiLayerLoadListener);
                }
            }
            pwVar.a(c26007x97be4188);
            o();
        }
        return pwVar;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: addArc */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.Arc mo36536xab35b9f1(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26008x51f2a00c c26008x51f2a00c) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        if (this.H || (neVar = this.f134045o) == null || c26008x51f2a00c == null) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bh bhVar = neVar.f132030J;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pl plVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pl(c26008x51f2a00c, bhVar.f130487i);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ar arVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ar(plVar);
        bhVar.f130479a.put(plVar.mo36409x5db1b11(), arVar);
        bhVar.f130482d.add(arVar);
        bhVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev) plVar);
        return arVar;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: addCircle */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0 mo36537xe42464d1(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e c26017xfbda878e) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        if (this.H || c26017xfbda878e == null || (neVar = this.f134045o) == null) {
            return null;
        }
        return neVar.f132030J.a(c26017xfbda878e);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: addCustomLayer */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26018xf8628040 mo36538xb9ff08ff(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26019xdcd7d63e c26019xdcd7d63e) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36538xb9ff08ff(c26019xdcd7d63e);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return null;
        }
        return aiVar.a(c26019xdcd7d63e);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: addGroundOverlay */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26023x33b6bca9 mo36539x5411a8(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 c26024x5ce381b5) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        super.mo36539x5411a8(c26024x5ce381b5);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26023x33b6bca9 interfaceC26023x33b6bca9 = null;
        if (!this.H && (neVar = this.f134045o) != null && c26024x5ce381b5 != null) {
            if (neVar.f132039f != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar = neVar.f130533c;
                if (hgVar != null) {
                    hgVar.o().f131225a++;
                }
                interfaceC26023x33b6bca9 = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26023x33b6bca9) neVar.f132043j.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bi) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nv(neVar.f132039f.A(), c26024x5ce381b5));
            }
            o();
        }
        return interfaceC26023x33b6bca9;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: addMarker */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a mo36540xf4c43c3b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        if (this.H || (neVar = this.f134045o) == null || c26064xea4764e4 == null) {
            return null;
        }
        return neVar.f132030J.a(c26064xea4764e4);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: addOnMapLoadedCallback */
    public void mo36541x2adaad66(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapLoadedCallback onMapLoadedCallback) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36541x2adaad66(onMapLoadedCallback);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.a(onMapLoadedCallback);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: addPolygon */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26076x4b86ed1a mo36542x5a0bad59(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 c26077xede22024) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        if (this.H || (neVar = this.f134045o) == null || c26077xede22024 == null) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bh bhVar = neVar.f132030J;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pq pqVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pq(bhVar.f130487i, c26077xede22024);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aw awVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aw(pqVar);
        bhVar.f130479a.put(pqVar.mo36409x5db1b11(), awVar);
        bhVar.f130484f.add(awVar);
        bhVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev) pqVar);
        return awVar;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: addPolyline */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0 mo36543xe76c2d81(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e c26079x1291dc9e) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        if (this.H || (neVar = this.f134045o) == null || c26079x1291dc9e == null) {
            return null;
        }
        return neVar.f132030J.a(c26079x1291dc9e);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: addTencentMapGestureListener */
    public void mo36544x726dd2a5(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426 interfaceC26085x16ab0426) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36544x726dd2a5(interfaceC26085x16ab0426);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.a(interfaceC26085x16ab0426);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: addTileOverlay */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26088xb80c71a2 mo36545x79a8fa61(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36545x79a8fa61(c26089x9c7ff29c);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return null;
        }
        return aiVar.a(c26089x9c7ff29c);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: addVectorHeatOverlay */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26096xab512edd mo36546x8f2dec5c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01 c26097x63c1ed01) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        super.mo36546x8f2dec5c(c26097x63c1ed01);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26096xab512edd interfaceC26096xab512edd = null;
        if (!this.H && (neVar = this.f134045o) != null) {
            if (neVar.f132039f != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar = neVar.f130533c;
                if (hgVar != null) {
                    hgVar.h().a();
                }
                interfaceC26096xab512edd = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26096xab512edd) neVar.f132043j.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bi) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl(c26097x63c1ed01));
            }
            o();
        }
        return interfaceC26096xab512edd;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: addVectorOverlay */
    public <L extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d> L mo36547xe98f1e6c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e interfaceC26099x413a767e) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        super.mo36547xe98f1e6c(interfaceC26099x413a767e);
        if (this.H || (neVar = this.f134045o) == null) {
            return null;
        }
        L l17 = (L) neVar.a(interfaceC26099x413a767e);
        o();
        return l17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: addVisualLayer */
    public com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1 mo36548xd51c1690(com.p314xaae8f345.map.sdk.p497x5a73344.vis.C4274xbcec938d c4274xbcec938d) {
        super.mo36548xd51c1690(c4274xbcec938d);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee eeVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee) mo36559x16607177(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee.class);
        if (eeVar != null) {
            return eeVar.a(c4274xbcec938d);
        }
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: animateCamera */
    public void mo36549x59b77566(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25950xd5528c6e c25950xd5528c6e) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        super.mo36549x59b77566(c25950xd5528c6e);
        if (this.H || (abVar = this.F) == null || abVar.b()) {
            return;
        }
        this.F.a(c25950xd5528c6e, 500L, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback) null);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: calculateMapOverLook */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e mo37449xac0983c9(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b, android.graphics.RectF rectF, float f17, float f18, int i17, int i18, int i19, int i27) {
        if (this.H || c26042xcb530b7b == null || rectF == null) {
            return null;
        }
        android.graphics.RectF rectF2 = new android.graphics.RectF();
        rectF2.left = (float) c26042xcb530b7b.m99546x528f5764();
        rectF2.top = (float) c26042xcb530b7b.m99542x2487201c();
        rectF2.right = (float) c26042xcb530b7b.m99545x528719b2();
        rectF2.bottom = (float) c26042xcb530b7b.m99543x24cda0e4();
        rectF.set(rectF.left + i17, rectF.top + i18, rectF.right - i19, rectF.bottom - i27);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar.f133194e == 0) {
            return null;
        }
        return tkVar.f133193d.m36168x384d0863(tkVar.f133194e, rectF2, rectF, f17, f18);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: calculateZoomToSpanLevel */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e mo36552x27428c06(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26030xc162a7c7> list, java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list2, int i17, int i18, int i19, int i27) {
        java.util.ArrayList arrayList;
        super.mo36552x27428c06(list, list2, i17, i18, i19, i27);
        if (this.H || this.F == null) {
            return null;
        }
        int abs = java.lang.Math.abs(i17);
        int abs2 = java.lang.Math.abs(i18);
        int abs3 = java.lang.Math.abs(i19);
        int abs4 = java.lang.Math.abs(i27);
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26030xc162a7c7 interfaceC26030xc162a7c7 : list) {
                if (interfaceC26030xc162a7c7 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez) {
                    arrayList2.add((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez) interfaceC26030xc162a7c7);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = this.F.f130302b;
        if (aiVar == null) {
            return null;
        }
        return aiVar.a(arrayList, list2, abs, abs2, abs3, abs4);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: clear */
    public void mo36553x5a5b64d() {
        super.mo36553x5a5b64d();
        mo36554x9a95e257();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: clearAllOverlays */
    public void mo36554x9a95e257() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar;
        super.mo36554x9a95e257();
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.m();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: clearCache */
    public void mo36555xd2bef135() {
        super.mo36555xd2bef135();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(mo37455x2de760a9().mo36630x76847179(), (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).c());
    }

    /* renamed from: clearRouteNameSegments */
    public void mo36990xdf959967() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar.f132059z == null) {
            neVar.f132059z = new com.tencent.mapsdk.internal.ne.d();
        }
        com.tencent.mapsdk.internal.ne.d dVar = neVar.f132059z;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne.this.f132039f.w();
        dVar.f132071a = null;
        dVar.f132072b = null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl
    public final void e() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: enableAutoMaxSkew */
    public void mo36556x2de8765c(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        super.mo36556x2de8765c(z17);
        if (this.H || (neVar = this.f134045o) == null) {
            return;
        }
        neVar.f132053t.f133959s = z17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: enableMultipleInfowindow */
    public void mo36557x51865b31(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36557x51865b31(z17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.f(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: executeVisualLayerCommand */
    public java.lang.String mo36558xae93d06f(com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1 interfaceC4273x137f8dd1, java.lang.String str) {
        super.mo36558xae93d06f(interfaceC4273x137f8dd1, str);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee eeVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee) mo36559x16607177(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee.class);
        if (eeVar != null) {
            return eeVar.a(interfaceC4273x137f8dd1, str);
        }
        return null;
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.p498xb96a1653.InterfaceC4262x9875e7fc
    /* renamed from: getActivedIndoorBuilding */
    public java.lang.String mo35477x92ce7e2f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 u17;
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null || (u17 = aiVar.u()) == null) {
            return null;
        }
        if (u17.m99467xf1b25d0() != null && c26041x873d1d26 != null) {
            c26041x873d1d26.f49501xaa2bac6c = u17.m99467xf1b25d0().f49501xaa2bac6c;
            c26041x873d1d26.f49502x83009af = u17.m99467xf1b25d0().f49502x83009af;
        }
        return u17.m99468x266119d5();
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.p498xb96a1653.InterfaceC4262x9875e7fc
    /* renamed from: getActivedIndoorFloorNames */
    public java.lang.String[] mo35478xd840e357() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return null;
        }
        return aiVar.s();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getBounderPoints */
    public java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> mo37450x698cf7b8(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.av avVar;
        if (interfaceC26059x88f1805a == null || (neVar = this.f134045o) == null || (avVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.av) neVar.f132030J.a(interfaceC26059x88f1805a.mo36409x5db1b11(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.av.class)) == null) {
            return null;
        }
        return avVar.f130397b.e();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getCameraPosition */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e mo37451xd2ef9864() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        if (this.H || (abVar = this.F) == null) {
            return null;
        }
        return abVar.a();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getCityName */
    public java.lang.String mo37452x271d180c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        if (this.H || (abVar = this.F) == null) {
            return "";
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = abVar.f130302b;
        if (aiVar == null) {
            return null;
        }
        return aiVar.a(c26041x873d1d26);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getDebugError */
    public java.lang.String mo37453x7f21ff6b() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return null;
        }
        return aiVar.z();
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.p498xb96a1653.InterfaceC4262x9875e7fc
    /* renamed from: getIndoorFloorId */
    public int mo35479xb62264be() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return -1;
        }
        return aiVar.r();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getLanguage */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 mo37454x1bacd0ce() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar.f132058y == null) {
            neVar.f132058y = new com.tencent.mapsdk.internal.ne.c();
        }
        com.tencent.mapsdk.internal.ne.c cVar = neVar.f132058y;
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne.this.f132039f == null) {
            return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778.zh;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne.this.f132039f;
        return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778.m99498x37d04a(tkVar.f133193d.m36209xf5380437(tkVar.f133194e));
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getMapContext */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 mo37455x2de760a9() {
        return this.f134045o;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getMapHeight */
    public int mo37456x223a1eed() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar = this.M;
        if (tzVar == null || tzVar.mo36070x17867021() == null || (buVar = this.M.mo36070x17867021().get()) == null) {
            return 0;
        }
        return buVar.mo36661x223a1eed();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getMapPadding */
    public android.graphics.Rect mo37457xc520670b() {
        return this.f134045o.f132041h.b();
    }

    /* renamed from: getMapPro */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2989x21ffc6bd.C26001x61c40f36 m37458x24a26aa7() {
        return this.L;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getMapStyle */
    public int mo37459x85ddbf2b() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        if (this.H || (abVar = this.F) == null) {
            return 0;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = abVar.f130302b;
        if (aiVar == null) {
            return -1;
        }
        return aiVar.f();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getMapType */
    public int mo37460x6facd680() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return 1000;
        }
        return aiVar.A();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getMapWidth */
    public int mo37461x8610cf40() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar = this.M;
        if (tzVar == null || tzVar.mo36070x17867021() == null || (buVar = this.M.mo36070x17867021().get()) == null) {
            return 0;
        }
        return buVar.mo36662x8610cf40();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getMaxZoomLevel */
    public float mo37462x6d8ed0e3() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        if (this.H || (abVar = this.F) == null) {
            return 0.0f;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = abVar.f130302b;
        if (aiVar == null) {
            return -1.0f;
        }
        return aiVar.b();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getMinZoomLevel */
    public float mo37463x89d5fbb5() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        if (this.H || (abVar = this.F) == null) {
            return 0.0f;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = abVar.f130302b;
        if (aiVar == null) {
            return -1.0f;
        }
        return aiVar.c();
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.p499x88ed4161.InterfaceC4263x78d07aaa
    /* renamed from: getMyLocation */
    public android.location.Location mo35487x7b085d77() {
        if (this.H) {
            return null;
        }
        aw();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf bfVar = this.f134049s;
        if (bfVar.f130425j == null) {
            return null;
        }
        return new android.location.Location(bfVar.f130425j);
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.p499x88ed4161.InterfaceC4263x78d07aaa
    /* renamed from: getMyLocationConfig */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443 mo35488xc8389799() {
        aw();
        return this.C;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getScreenMarkers */
    public java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a> mo37465x41bf75b7() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an> it = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr) this.f134045o.f130532b).ai().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getUiSettings */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25971x45d136f7 mo37466xbd4012cd() {
        if (this.H) {
            return null;
        }
        if (this.f134043J == null) {
            this.f134043J = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ty(this.G);
        }
        return this.f134043J;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getVersion */
    public java.lang.String mo37467x52c258a2() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        return (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) ? "" : aiVar.o();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getVisualSettings */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25972xaba233a3 mo37468xd5f33479() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        if (this.H || (neVar = this.f134045o) == null) {
            return null;
        }
        return neVar.f132047n;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: getZoomToSpanLevel */
    public float mo37469x6e76a216(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        if (this.H || (abVar = this.F) == null) {
            return 0.0f;
        }
        if (c26041x873d1d26 == null || c26041x873d1d262 == null || (aiVar = abVar.f130302b) == null) {
            return -1.0f;
        }
        return aiVar.a(c26041x873d1d26, c26041x873d1d262);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl
    public final int h() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar == null) {
            return -1;
        }
        return neVar.K;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: isBlockRouteEnabled */
    public boolean mo37470x772d95db() {
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: isDestroyed */
    public boolean mo37471xbca8d80f() {
        return this.H;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: isHandDrawMapEnable */
    public boolean mo37472xfdb0a8e2() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return false;
        }
        return aiVar.w();
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.p499x88ed4161.InterfaceC4263x78d07aaa
    /* renamed from: isMyLocationEnabled */
    public boolean mo35489xe6336676() {
        if (this.H) {
            return false;
        }
        aw();
        return this.C.m99785xe6336676();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: isSateLiteEnable */
    public boolean mo37473x7a62ea3a() {
        return mo37460x6facd680() == 1011;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: isTrafficEnabled */
    public boolean mo37474xc7a3c24e() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return false;
        }
        return aiVar.h();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: loadKMLFile */
    public void mo36560x855ff420(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36560x855ff420(str);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.a(str);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: moveCamera */
    public void mo36561x85700a56(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25950xd5528c6e c25950xd5528c6e) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        super.mo36561x85700a56(c25950xd5528c6e);
        if (this.H || (abVar = this.F) == null || abVar.b()) {
            return;
        }
        this.F.a(c25950xd5528c6e);
    }

    public final void o() {
        this.f134045o.f132055v = true;
    }

    public final int p() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar = this.M;
        if (tzVar == null) {
            return 3;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7.MapUserSetting d17 = tzVar.d();
        int m99262xeb30146b = d17.m99262xeb30146b() != -1 ? d17.m99262xeb30146b() : d17.m99260x55bce096();
        if (m99262xeb30146b != -1) {
            return m99262xeb30146b;
        }
        return 3;
    }

    public final int q() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar = this.M;
        if (tzVar == null) {
            return 20;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7.MapUserSetting d17 = tzVar.d();
        int m99261x7e91e4fd = d17.m99261x7e91e4fd() != -1 ? d17.m99261x7e91e4fd() : d17.m99259xe91eb128();
        return m99261x7e91e4fd != -1 ? m99261x7e91e4fd : this.M.C() ? 19 : 20;
    }

    public final com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df r() {
        return this.f134045o.f132041h.A.f133953m;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: removeOnMapLoadedCallback */
    public void mo36562x31cbe4a3(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapLoadedCallback onMapLoadedCallback) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36562x31cbe4a3(onMapLoadedCallback);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.b(onMapLoadedCallback);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: removeTencentMapGestureListener */
    public void mo36563xd235e822(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426 interfaceC26085x16ab0426) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36563xd235e822(interfaceC26085x16ab0426);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.b(interfaceC26085x16ab0426);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.map.sdk.p497x5a73344.p498xb96a1653.InterfaceC4262x9875e7fc
    /* renamed from: resetIndoorCellInfo */
    public void mo35480x4a444bd2() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar;
        super.mo35480x4a444bd2();
        if (this.H || this.F == null || (tkVar = this.f134045o.f132039f) == null) {
            return;
        }
        tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass104());
    }

    public final int s() {
        return this.f134045o.f132041h.A.f133942b.f133977m;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setBaseMapEnabled */
    public void mo36564xddf384f8(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        super.mo36564xddf384f8(z17);
        if (this.H || (neVar = this.f134045o) == null) {
            return;
        }
        neVar.k(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setBuilding3dEffectEnable */
    public void mo36566x9a0dfe5b(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        super.mo36566x9a0dfe5b(z17);
        if (this.H || (neVar = this.f134045o) == null) {
            return;
        }
        neVar.c(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setBuildingBlackList */
    public void mo36567xa9c008a7(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b> list) {
        super.mo36567xa9c008a7(list);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar != null) {
            tkVar.a(list);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setBuildingEnable */
    public void mo36568xcbce8259(boolean z17) {
        super.mo36568xcbce8259(z17);
        mo36566x9a0dfe5b(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setCameraCenterProportion */
    public void mo36569x8a3a3716(float f17, float f18) {
        super.mo36569x8a3a3716(f17, f18);
        mo36570x8a3a3716(f17, f18, true);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setCustomRender */
    public void mo36571xabce2de9(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25953x1e5df487 interfaceC25953x1e5df487) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        super.mo36571xabce2de9(interfaceC25953x1e5df487);
        if (this.H || (neVar = this.f134045o) == null) {
            return;
        }
        neVar.F = interfaceC25953x1e5df487;
        neVar.f132055v = true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setDrawPillarWith2DStyle */
    public void mo36572xefd95d49(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        super.mo36572xefd95d49(z17);
        if (this.H || (neVar = this.f134045o) == null) {
            return;
        }
        neVar.c(!z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setForeignLanguage */
    public void mo36573xcbaccf8a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 enumC26040xa3acf778) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        super.mo36573xcbaccf8a(enumC26040xa3acf778);
        if (this.H || (abVar = this.F) == null) {
            return;
        }
        abVar.a(enumC26040xa3acf778);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setHandDrawMapEnable */
    public void mo36574x994c50aa(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36574x994c50aa(z17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.e(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.map.sdk.p497x5a73344.p498xb96a1653.InterfaceC4262x9875e7fc
    /* renamed from: setIndoorCellInfo */
    public void mo35481x26d68da5(java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4250x348f24c3> list) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar;
        super.mo35481x26d68da5(list);
        if (this.H || this.F == null || (tkVar = this.f134045o.f132039f) == null) {
            return;
        }
        tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass103(list));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.map.sdk.p497x5a73344.p498xb96a1653.InterfaceC4262x9875e7fc
    /* renamed from: setIndoorEnabled */
    public void mo35482x16b0fc2c(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo35482x16b0fc2c(z17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.c(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.map.sdk.p497x5a73344.p498xb96a1653.InterfaceC4262x9875e7fc
    /* renamed from: setIndoorFloor */
    public void mo35483x255ed3b7(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo35483x255ed3b7(i17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.c(i17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.map.sdk.p497x5a73344.p498xb96a1653.InterfaceC4262x9875e7fc
    /* renamed from: setIndoorMaskColor */
    public void mo35485x4f658e02(int i17) {
        super.mo35485x4f658e02(i17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (0 != tkVar.f133194e) {
            tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass171(i17));
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setInfoWindowAdapter */
    public void mo36575x3d10faef(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.InfoWindowAdapter infoWindowAdapter) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar;
        super.mo36575x3d10faef(infoWindowAdapter);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.f133813az = new java.lang.ref.WeakReference<>(infoWindowAdapter);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setLanguage */
    public void mo36576x166531da(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 enumC26040xa3acf778) {
        super.mo36576x166531da(enumC26040xa3acf778);
        if (this.H || this.F == null || !"bmw".equals(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133114c)) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar.f132058y == null) {
            neVar.f132058y = new com.tencent.mapsdk.internal.ne.c();
        }
        com.tencent.mapsdk.internal.ne.c cVar = neVar.f132058y;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne.this.f132039f;
        if (tkVar != null) {
            int m99499xe443bd28 = enumC26040xa3acf778.m99499xe443bd28();
            if (tkVar.f133194e != 0) {
                tkVar.f133193d.m36276xeff06543(tkVar.f133194e, m99499xe443bd28);
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne.this.f132055v = true;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne.this.f132055v = true;
            cVar.a(enumC26040xa3acf778);
        }
        this.F.a(enumC26040xa3acf778);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setLocationCompassHidden */
    public void mo36577xd9013465(boolean z17) {
        super.mo36577xd9013465(z17);
        this.f134045o.f(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setLocationNavigationGravityLineHidden */
    public void mo36578x3c705741(boolean z17) {
        super.mo36578x3c705741(z17);
        this.f134045o.g(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.map.sdk.p497x5a73344.p499x88ed4161.InterfaceC4263x78d07aaa
    /* renamed from: setLocationSource */
    public void mo35490xaa27cd32(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450 interfaceC25954xb7e06450) {
        super.mo35490xaa27cd32(interfaceC25954xb7e06450);
        if (this.H) {
            return;
        }
        aw();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443 m99787x59bc66e = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443.m99780x3136c9db(this.C).m99788xaa27cd32(interfaceC25954xb7e06450).m99787x59bc66e();
        this.C = m99787x59bc66e;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf bfVar = this.f134049s;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450 m99781xe2316526 = m99787x59bc66e.m99781xe2316526();
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131758z, "setLocationSource " + m99781xe2316526 + " enable " + bfVar.f130418c);
        if (m99781xe2316526 != null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450 interfaceC25954xb7e064502 = bfVar.f130417b;
            if (interfaceC25954xb7e064502 != null) {
                interfaceC25954xb7e064502.mo99129x88fbd074();
            }
            bfVar.f130417b = m99781xe2316526;
            m99781xe2316526.mo99128x9d4bd4f3(bfVar.f130432q);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener m35940xccabb43e = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35940xccabb43e();
            if (m35940xccabb43e != null) {
                bfVar.f130423h.add(new java.lang.ref.WeakReference<>(m35940xccabb43e));
            }
            if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.m99118x9cf0d20b().m99124x52b8616a()) {
                bfVar.f130419d = true;
                bfVar.f130433r.postDelayed(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf.AnonymousClass2(), 1000L);
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setMapCenterAndScale */
    public void mo36579x7e06ad62(float f17, float f18, float f19) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        super.mo36579x7e06ad62(f17, f18, f19);
        if (this.H || (bgVar = this.f134047q) == null || (neVar = (trVar = bgVar.f130438b).f133806as) == null) {
            return;
        }
        float f27 = neVar.f132041h.A.f133942b.f133976l;
        float c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.c(f19);
        boolean z17 = ((double) java.lang.Math.abs(f27 - c17)) > 1.0E-4d;
        trVar.f133808au = 0;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.AnonymousClass1((f18 - trVar.f133807at) / 10.0f, f17, f18, f19, z17, c17));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setMapFontSize */
    public void mo36580x5d0548aa(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26053x5033364c enumC26053x5033364c) {
        if (this.H || this.F == null || enumC26053x5033364c == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        int m99618x754a37bb = enumC26053x5033364c.m99618x754a37bb();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = neVar.f132039f;
        tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass65(m99618x754a37bb));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setMapFrameRate */
    public void mo36581xc0973b73(float f17) {
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> weakReference;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar;
        super.mo36581xc0973b73(f17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar = this.M;
        if (tzVar == null || (weakReference = tzVar.f130548c) == null || (buVar = weakReference.get()) == null) {
            return;
        }
        buVar.a(f17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setMapStyle */
    public void mo36582x80962037(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36582x80962037(i17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.a(i17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setMapType */
    public void mo36583xe31e23f4(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36583xe31e23f4(i17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.f(i17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setMaxZoomLevel */
    public void mo36584xa3d7cbef(int i17) {
        super.mo36584xa3d7cbef(i17);
        if (this.H || this.F == null || i17 < mo37463x89d5fbb5()) {
            return;
        }
        int k17 = k(i17);
        int i18 = this.M.f133806as.f132053t.f133942b.f133977m;
        if (i18 > k17) {
            this.F.a(i18);
            this.M.d().m99265xf8e51409(k17);
        } else {
            this.F.a(k17);
            this.M.d().m99263xa3d7cbef(k17);
            this.M.d().m99265xf8e51409(k17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setMinZoomLevel */
    public void mo36585xc01ef6c1(int i17) {
        super.mo36585xc01ef6c1(i17);
        if (this.H || this.F == null || i17 > mo37462x6d8ed0e3()) {
            return;
        }
        int k17 = k(i17);
        int i18 = this.M.f133806as.f132053t.f133942b.f133977m;
        if (i18 < k17) {
            this.F.b(i18);
            this.M.d().m99266x65834377(k17);
        } else {
            this.F.b(k17);
            this.M.d().m99264xc01ef6c1(k17);
            this.M.d().m99266x65834377(k17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.map.sdk.p497x5a73344.p499x88ed4161.InterfaceC4263x78d07aaa
    /* renamed from: setMyLocationClickListener */
    public void mo35491xdaa17799(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationClickListener onMyLocationClickListener) {
        super.mo35491xdaa17799(onMyLocationClickListener);
        if (this.H) {
            return;
        }
        aw();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443 m99787x59bc66e = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443.m99780x3136c9db(this.C).m99790xdaa17799(onMyLocationClickListener).m99787x59bc66e();
        this.C = m99787x59bc66e;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf bfVar = this.f134049s;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationClickListener m99783xc4719225 = m99787x59bc66e.m99783xc4719225();
        if (m99783xc4719225 != null) {
            bfVar.f130422g = new java.lang.ref.WeakReference<>(m99783xc4719225);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.map.sdk.p497x5a73344.p499x88ed4161.InterfaceC4263x78d07aaa
    /* renamed from: setMyLocationConfig */
    public void mo35492x6c352ca5(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443 c26071xee247443) {
        aw();
        if (c26071xee247443 != null) {
            this.C = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443.m99780x3136c9db(c26071xee247443).m99787x59bc66e();
        }
        mo35493x81cf0e3e(this.C.m99785xe6336676());
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450 interfaceC25954xb7e06450 = this.f134049s.f130417b;
        if (interfaceC25954xb7e06450 == null || interfaceC25954xb7e06450 != this.C.m99781xe2316526()) {
            mo35490xaa27cd32(this.C.m99781xe2316526());
        }
        mo35494xe3593bee(this.C.m99784xac82a27a());
        mo35491xdaa17799(this.C.m99783xc4719225());
        mo35495x43c8cf66(this.C.m99782xb1e59db());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.map.sdk.p497x5a73344.p499x88ed4161.InterfaceC4263x78d07aaa
    /* renamed from: setMyLocationEnabled */
    public void mo35493x81cf0e3e(boolean z17) {
        super.mo35493x81cf0e3e(z17);
        if (this.H) {
            return;
        }
        aw();
        if (!z17) {
            this.f134049s.a();
            this.C = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443.m99780x3136c9db(this.C).m99791x81cf0e3e(false).m99787x59bc66e();
            return;
        }
        if (this.f134049s.f130418c) {
            return;
        }
        this.C = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443.m99780x3136c9db(this.C).m99791x81cf0e3e(true).m99787x59bc66e();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf bfVar = this.f134049s;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131758z, "enableMyLocation : " + bfVar.f130418c);
        if (bfVar.f130418c) {
            return;
        }
        bfVar.f130418c = true;
        bfVar.f130428m.e(false);
        bfVar.f130428m.f(false);
        bfVar.f130428m.g(false);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0 interfaceC26016x7851a8f0 = bfVar.f130420e;
        if (interfaceC26016x7851a8f0 != null) {
            interfaceC26016x7851a8f0.mo36427xcd1079b0(true);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7, com.p314xaae8f345.map.sdk.p497x5a73344.p499x88ed4161.InterfaceC4263x78d07aaa
    /* renamed from: setMyLocationStyle */
    public void mo35494xe3593bee(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26072x8cb38890 c26072x8cb38890) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99583xb33869df;
        android.graphics.Bitmap m99320x12501425;
        super.mo35494xe3593bee(c26072x8cb38890);
        aw();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443 m99787x59bc66e = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443.m99780x3136c9db(this.C).m99792xe3593bee(c26072x8cb38890).m99787x59bc66e();
        this.C = m99787x59bc66e;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf bfVar = this.f134049s;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26072x8cb38890 m99784xac82a27a = m99787x59bc66e.m99784xac82a27a();
        if (m99784xac82a27a != null) {
            bfVar.f130424i = m99784xac82a27a;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0 interfaceC26016x7851a8f0 = bfVar.f130420e;
            if (interfaceC26016x7851a8f0 != null) {
                interfaceC26016x7851a8f0.mo36403x17b1755e(m99784xac82a27a.m99799xbb5db4ea());
                bfVar.f130420e.mo36392xe1d3a649(m99784xac82a27a.m99806x4b6e32d5());
                bfVar.f130420e.mo36393xe2eaa4ac(m99784xac82a27a.m99807x4c853138());
                int m99797xd4cdb75e = m99784xac82a27a.m99797xd4cdb75e();
                if (m99797xd4cdb75e != -1) {
                    bfVar.f130420e.mo35536x534d5c42(m99797xd4cdb75e);
                }
                bfVar.f130420e.mo36429x2cb3cb7a(m99784xac82a27a.m99798xdb3ed3de());
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131758z, "mMyLocationId: " + bfVar.f130429n + ", mIcon " + bfVar.f130426k + ", enableShowMyLocation: " + bfVar.f130418c);
            if (!bfVar.f130418c || bfVar.f130426k == null) {
                return;
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99802xdc417a90 = m99784xac82a27a.m99802xdc417a90();
            if (m99802xdc417a90 == null) {
                m99802xdc417a90 = bfVar.b();
            }
            android.graphics.Bitmap m99320x125014252 = m99802xdc417a90.m99320x12501425(bfVar.f130428m.mo36630x76847179());
            if (m99320x125014252 != null && !m99320x125014252.isRecycled()) {
                java.lang.String mo36721xbe9ba820 = m99802xdc417a90.m99321x981c205a().mo36721xbe9ba820();
                if (!bfVar.f130426k.m99321x981c205a().mo36721xbe9ba820().equals(mo36721xbe9ba820)) {
                    bfVar.f130426k = m99784xac82a27a.m99802xdc417a90() == null ? bfVar.b() : m99784xac82a27a.m99802xdc417a90();
                    bfVar.f130429n = bfVar.f130428m.a(mo36721xbe9ba820, m99784xac82a27a.m99795xa62d00a(), m99784xac82a27a.m99796xa62d00b());
                }
            }
            int m99803xac19204d = m99784xac82a27a.m99803xac19204d();
            if (m99803xac19204d != -1) {
                bfVar.f130428m.b(m99803xac19204d);
            }
            bfVar.f130428m.c(m99784xac82a27a.m99805xed6088cf());
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26049xf556c77d m99800x1525e167 = m99784xac82a27a.m99800x1525e167();
            if (m99800x1525e167 != null && m99800x1525e167.m99583xb33869df() != null && (m99320x12501425 = (m99583xb33869df = m99800x1525e167.m99583xb33869df()).m99320x12501425(bfVar.f130428m.mo36630x76847179())) != null && !m99320x12501425.isRecycled()) {
                java.lang.String mo36721xbe9ba8202 = m99583xb33869df.m99321x981c205a().mo36721xbe9ba820();
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e = bfVar.f130427l;
                if (!(c26010x4177761e != null ? c26010x4177761e.m99321x981c205a().mo36721xbe9ba820() : "").equals(mo36721xbe9ba8202)) {
                    bfVar.f130427l = m99583xb33869df;
                    bfVar.f130428m.c(mo36721xbe9ba8202);
                }
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e[] m99582x1a6b975b = m99800x1525e167.m99582x1a6b975b();
                if (m99582x1a6b975b != null && m99582x1a6b975b.length == 4) {
                    java.lang.String[] strArr = new java.lang.String[m99582x1a6b975b.length];
                    for (int i17 = 0; i17 < m99582x1a6b975b.length; i17++) {
                        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e2 = m99582x1a6b975b[i17];
                        if (c26010x4177761e2 != null) {
                            c26010x4177761e2.m99320x12501425(bfVar.f130428m.mo36630x76847179());
                            strArr[i17] = m99582x1a6b975b[i17].m99321x981c205a().mo36721xbe9ba820();
                        } else {
                            strArr[i17] = "";
                        }
                    }
                    bfVar.f130428m.a(mo36721xbe9ba8202, strArr[0], strArr[1], strArr[2], strArr[3]);
                }
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26050x731307b9 m99801xcc918023 = m99784xac82a27a.m99801xcc918023();
            if (m99801xcc918023 != null) {
                bfVar.f130428m.a(m99801xcc918023.m99588x755bd410(), m99801xcc918023.m99586x7444d5ad(), m99801xcc918023.m99587x849c8ad8());
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOnCameraChangeListener */
    public void mo36586xee69e68a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnCameraChangeListener onCameraChangeListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36586xee69e68a(onCameraChangeListener);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.a(onCameraChangeListener);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOnCompassClickedListener */
    public void mo36587xce88e9ca(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnCompassClickedListener onCompassClickedListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36587xce88e9ca(onCompassClickedListener);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.a(onCompassClickedListener);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.map.sdk.p497x5a73344.p498xb96a1653.InterfaceC4262x9875e7fc
    /* renamed from: setOnIndoorStateChangeListener */
    public void mo35486x18419741(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo35486x18419741(onIndoorStateChangeListener);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.a(onIndoorStateChangeListener);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOnInfoWindowClickListener */
    public void mo36588xdfba4d9d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnInfoWindowClickListener onInfoWindowClickListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar;
        super.mo36588xdfba4d9d(onInfoWindowClickListener);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.a(onInfoWindowClickListener);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOnMapClickListener */
    public void mo36589xc6f39e61(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapClickListener onMapClickListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36589xc6f39e61(onMapClickListener);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.a(onMapClickListener);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOnMapFrameFinished */
    public void mo36590xb260c904(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapFrameFinishCallback onMapFrameFinishCallback) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar;
        super.mo36590xb260c904(onMapFrameFinishCallback);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.a(onMapFrameFinishCallback);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOnMapLongClickListener */
    public void mo36592xb229e6c5(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapLongClickListener onMapLongClickListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36592xb229e6c5(onMapLongClickListener);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.a(onMapLongClickListener);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOnMapPoiClickListener */
    public void mo36593x15447a0d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapPoiClickListener onMapPoiClickListener) {
        super.mo36593x15447a0d(onMapPoiClickListener);
        if (this.H || this.F == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar = this.f134050t;
        if (pyVar != null) {
            pyVar.f132376c = onMapPoiClickListener;
        }
        this.M.a(onMapPoiClickListener);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOnMarkerClickListener */
    public void mo36594xef348ca1(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerClickListener onMarkerClickListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar;
        super.mo36594xef348ca1(onMarkerClickListener);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.a(onMarkerClickListener);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOnMarkerCollisionStatusListener */
    public void mo36595x1c31ce9d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerCollisionStatusListener onMarkerCollisionStatusListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar;
        super.mo36595x1c31ce9d(onMarkerCollisionStatusListener);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.a(onMarkerCollisionStatusListener);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOnMarkerDragListener */
    public void mo36596xdfbddf23(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerDragListener onMarkerDragListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar;
        super.mo36596xdfbddf23(onMarkerDragListener);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.a(onMarkerDragListener);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.map.sdk.p497x5a73344.p499x88ed4161.InterfaceC4263x78d07aaa
    /* renamed from: setOnMyLocationChangeListener */
    public void mo35495x43c8cf66(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationChangeListener onMyLocationChangeListener) {
        super.mo35495x43c8cf66(onMyLocationChangeListener);
        if (this.H) {
            return;
        }
        aw();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443 m99787x59bc66e = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26071xee247443.m99780x3136c9db(this.C).m99789xbaeb22e7(onMyLocationChangeListener).m99787x59bc66e();
        this.C = m99787x59bc66e;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf bfVar = this.f134049s;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationChangeListener m99782xb1e59db = m99787x59bc66e.m99782xb1e59db();
        if (m99782xb1e59db != null) {
            bfVar.f130421f = new java.lang.ref.WeakReference<>(m99782xb1e59db);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOnPolygonClickListener */
    public void mo36597x3e523ec3(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnPolygonClickListener onPolygonClickListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar;
        super.mo36597x3e523ec3(onPolygonClickListener);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.a(onPolygonClickListener);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOnPolylineClickListener */
    public void mo36598xb25dad1b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnPolylineClickListener onPolylineClickListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar;
        super.mo36598xb25dad1b(onPolylineClickListener);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.a(onPolylineClickListener);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOnScaleViewChangedListener */
    public void mo36599xdbdbf37a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnScaleViewChangedListener onScaleViewChangedListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36599xdbdbf37a(onScaleViewChangedListener);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.a(onScaleViewChangedListener);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOnTapMapViewInfoWindowHidden */
    public void mo36600x54cd7967(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36600x54cd7967(z17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.g(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOnTrafficEventClickListener */
    public void mo36601xb11c3fde(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnTrafficEventClickListener onTrafficEventClickListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36601xb11c3fde(onTrafficEventClickListener);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.a(onTrafficEventClickListener);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOnVectorOverlayClickListener */
    public void mo36602x55c97490(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnVectorOverlayClickListener onVectorOverlayClickListener) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar;
        super.mo36602x55c97490(onVectorOverlayClickListener);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.f133806as.L = onVectorOverlayClickListener;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOverSeaEnable */
    public void mo36603x63144afc(boolean z17) {
        super.mo36603x63144afc(z17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar = this.M;
        if (tzVar != null) {
            tzVar.m(z17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setOverSeaTileProvider */
    public void mo36604x41e79578(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.AbstractC26074xe626c11a abstractC26074xe626c11a) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar;
        super.mo36604x41e79578(abstractC26074xe626c11a);
        if (this.H || (neVar = this.f134045o) == null || (azVar = neVar.f132045l) == null) {
            return;
        }
        azVar.a(abstractC26074xe626c11a);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setPadding */
    public void mo36605x812ec54f(int i17, int i18, int i19, int i27) {
        super.mo36605x812ec54f(i17, i18, i19, i27);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar = this.f134047q;
        if (bgVar != null) {
            bgVar.a(i17, i18, i19, i27, false);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setPointToCenter */
    public void mo36607xb5bc0b1e(int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey mo37464x78d58245;
        super.mo36607xb5bc0b1e(i17, i18);
        if (this.H || this.F == null || (mo37464x78d58245 = mo37464x78d58245()) == null) {
            return;
        }
        this.F.a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25951xd3dd04bc.m99100xcf810ec6(mo37464x78d58245.mo37072x7ce5ca8b(new android.graphics.Point(i17, i18))));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setPoisEnabled */
    public void mo36608xfda2cdd6(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36608xfda2cdd6(z17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.i(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setRestrictBounds */
    public void mo36609x8591d593(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26080x7bc7b63 enumC26080x7bc7b63) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        super.mo36609x8591d593(c26042xcb530b7b, enumC26080x7bc7b63);
        if (this.H || (abVar = this.F) == null) {
            return;
        }
        int ordinal = enumC26080x7bc7b63 == null ? 0 : enumC26080x7bc7b63.ordinal();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = abVar.f130302b;
        if (aiVar != null) {
            aiVar.a(c26042xcb530b7b, ordinal);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setSatelliteEnabled */
    public void mo36610x8e5d8e08(boolean z17) {
        super.mo36610x8e5d8e08(z17);
        if (z17) {
            mo36583xe31e23f4(1011);
        } else {
            mo36583xe31e23f4(1000);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setSceneByTag */
    public void mo36611x96d1bc99(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar;
        super.mo36611x96d1bc99(str);
        if (this.H || (neVar = this.f134045o) == null || (hgVar = neVar.f130533c) == null) {
            return;
        }
        hgVar.f131277a = str;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setTencentMapGestureListener */
    public void mo36612xb8069a04(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426 interfaceC26085x16ab0426) {
        super.mo36612xb8069a04(interfaceC26085x16ab0426);
        mo36544x726dd2a5(interfaceC26085x16ab0426);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setTrafficEnabled */
    public void mo36613xd7866f86(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36613xd7866f86(z17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.a(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setTrafficMode */
    public void mo36614xeb7437e(int i17, int i18) {
        super.mo36614xeb7437e(i17, i18);
        if (this.H || this.F == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        tkVar.b(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass2(i17, i18));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: showBuilding */
    public void mo36615x77f204d1(boolean z17) {
        super.mo36615x77f204d1(z17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar != null) {
            tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass45(z17));
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: snapshot */
    public void mo36618x10fad5c4(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.SnapshotReadyCallback snapshotReadyCallback, android.graphics.Bitmap.Config config, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36618x10fad5c4(snapshotReadyCallback, config, i17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar = this.F;
        if (abVar == null || (aiVar = abVar.f130302b) == null || snapshotReadyCallback == null) {
            return;
        }
        abVar.f130303c = snapshotReadyCallback;
        android.os.Handler handler = abVar.f130304d;
        if (aiVar != null) {
            aiVar.a(handler, config, i17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: stopAnimation */
    public void mo36619xcac315a2() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36619xcac315a2();
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.d();
    }

    public final float t() {
        return this.f134045o.f132041h.A.f133942b.f133976l;
    }

    public final void u() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.w wVar = this.f134045o.f132051r;
        if (wVar == null) {
            return;
        }
        wVar.c();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: updateVectorOverlay */
    public void mo36620xea2fdf44(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d interfaceC26098x1cf1c96d, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e interfaceC26099x413a767e) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        super.mo36620xea2fdf44(interfaceC26098x1cf1c96d, interfaceC26099x413a767e);
        if (this.H || (neVar = this.f134045o) == null) {
            return;
        }
        if (neVar.f132039f != null) {
            if (interfaceC26099x413a767e instanceof com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nk nkVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nk) neVar.f132043j.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nk.class, ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nk) interfaceC26098x1cf1c96d).b());
                if (nkVar != null) {
                    nkVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nk) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl((com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f) interfaceC26099x413a767e));
                } else {
                    neVar.a(interfaceC26099x413a767e);
                }
            } else if (interfaceC26099x413a767e instanceof com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c.C4296xde694d2e) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nw nwVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nw) neVar.f132043j.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nw.class, ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nw) interfaceC26098x1cf1c96d).b());
                if (nwVar != null) {
                    nwVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nw) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ny((com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c.C4296xde694d2e) interfaceC26099x413a767e));
                } else {
                    neVar.a(interfaceC26099x413a767e);
                }
            } else if (interfaceC26099x413a767e instanceof com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od.C4298x4900643b) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nn nnVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nn) neVar.f132043j.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nn.class, ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nn) interfaceC26098x1cf1c96d).b());
                if (nnVar != null) {
                    nnVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nn) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.np((com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od.C4298x4900643b) interfaceC26099x413a767e));
                } else {
                    neVar.a(interfaceC26099x413a767e);
                }
            } else if (interfaceC26099x413a767e instanceof com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4302x40bb7fab) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.of ofVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.of) neVar.f132043j.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.of.class, ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.of) interfaceC26098x1cf1c96d).b());
                if (ofVar != null) {
                    ofVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.of) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oh(neVar.f132039f.A(), (com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4302x40bb7fab) interfaceC26099x413a767e));
                } else {
                    neVar.a(interfaceC26099x413a767e);
                }
            } else if (interfaceC26099x413a767e instanceof com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4300xcbfccc51) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.of ofVar2 = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.of) neVar.f132043j.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.of.class, ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.of) interfaceC26098x1cf1c96d).b());
                if (ofVar2 != null) {
                    ofVar2.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.of) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oh(neVar.f132039f.A(), (com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4300xcbfccc51) interfaceC26099x413a767e));
                } else {
                    neVar.a(interfaceC26099x413a767e);
                }
            } else if (interfaceC26099x413a767e instanceof com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d.C4306xecda4b9b) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oi oiVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oi) neVar.f132043j.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oi.class, ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oi) interfaceC26098x1cf1c96d).b());
                if (oiVar != null) {
                    oiVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oi) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ok((com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d.C4306xecda4b9b) interfaceC26099x413a767e));
                } else {
                    neVar.a(interfaceC26099x413a767e);
                }
            } else if (interfaceC26099x413a767e instanceof com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns nsVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) neVar.f132043j.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns.class, ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) interfaceC26098x1cf1c96d).b());
                if (nsVar != null) {
                    nsVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ns) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr((com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d) interfaceC26099x413a767e));
                } else {
                    neVar.a(interfaceC26099x413a767e);
                }
            }
        }
        o();
    }

    public final float v() {
        return this.f134045o.f132041h.h();
    }

    public final float w() {
        return this.f134045o.f132041h.i();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey mo37464x78d58245() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        return (this.H || (neVar = this.f134045o) == null) ? new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.x() : neVar.f132046m;
    }

    public final void y() {
        this.f134045o.f132041h.f130351o.e();
    }

    public final java.lang.String z() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar != null) {
            return neVar.H();
        }
        return null;
    }

    private static boolean b(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eq.f130910a.contains(c4247x704e24df.m35332x962aa94a(), c4247x704e24df.m35331xbc3301f3());
    }

    private java.lang.String c(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        return this.f134045o.a(c4247x704e24df);
    }

    private synchronized void e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar) {
        this.f134045o.f132043j.a(ezVar);
        this.f134045o.f132055v = true;
    }

    private void k(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar == null || (adVar = neVar.f132041h) == null) {
            return;
        }
        adVar.L = z17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl
    public final void a(android.os.Bundle bundle) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar;
        super.a(bundle);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.a().a(this.f134045o.mo36630x76847179());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bj.a().a(this.f134045o.O());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg(this.f134045o, this.M.mo36070x17867021(), this.f134045o.f130531a);
        this.f134047q = bgVar;
        this.D = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.af(bgVar);
        this.F = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab(this.f134047q);
        this.L = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2989x21ffc6bd.C26001x61c40f36(this.f134047q, this.D);
        this.f134050t = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py(this.f134045o);
        this.G = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ae(this.f134047q.f130440d);
        com.tencent.mapsdk.internal.bk.a aVar = new com.tencent.mapsdk.internal.bk.a() { // from class: com.tencent.mapsdk.vector.VectorMap.1
            @Override // com.tencent.mapsdk.internal.bk.a
            public final void a() {
                com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9.this.aw();
                if (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9.this.C.m99785xe6336676()) {
                    com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9.this.mo35493x81cf0e3e(true);
                }
                android.location.Location mo35487x7b085d77 = com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9.this.mo35487x7b085d77();
                if (mo35487x7b085d77 != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9.this.mo36549x59b77566(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25951xd3dd04bc.m99100xcf810ec6(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(mo35487x7b085d77.getLatitude(), mo35487x7b085d77.getLongitude())));
                }
            }
        };
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk bkVar = this.f134047q.f130440d;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl slVar = bkVar.f130511c;
        if (slVar != null) {
            slVar.f132988d = aVar;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar2 = this.f134045o;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bi biVar = neVar2.f132043j;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7 = neVar2.f130531a;
        if (c25966x7e4576a7 != null && c25966x7e4576a7.m99197xd6193b42() != null && (sjVar = bkVar.f130512d) != null) {
            java.util.List<com.tencent.mapsdk.internal.sj.c> list = sjVar.f132950r;
            if (list != null && biVar != null) {
                list.add(biVar);
            }
            int m99199x350ebba4 = c25966x7e4576a7.m99199x350ebba4();
            int m99198x52f9bf09 = c25966x7e4576a7.m99198x52f9bf09();
            android.view.ViewGroup ac6 = bkVar.f130510b.ac();
            if (ac6 != null) {
                ac6.measure(android.view.View.MeasureSpec.makeMeasureSpec(m99199x350ebba4, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(m99198x52f9bf09, 1073741824));
            }
            bkVar.b(m99199x350ebba4, m99198x52f9bf09);
        }
        if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.m99118x9cf0d20b().m99124x52b8616a()) {
            mo35490xaa27cd32(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.m99118x9cf0d20b().m99122xe2316526());
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.m99118x9cf0d20b().m99125x8630b4cb();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa qaVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa(this.f134047q);
        this.f134048r = qaVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar3 = this.f134045o;
        qaVar.f132388a.a((com.tencent.mapsdk.internal.qa.a) neVar3.f132043j, neVar3.f130531a);
        java.util.Iterator<com.tencent.mapsdk.internal.qa.b> it = this.f134051u.keySet().iterator();
        while (it.hasNext()) {
            this.f134048r.a(it.next());
        }
        this.f134051u.clear();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa qaVar2 = this.f134048r;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.Y, qaVar2.b());
        java.util.Iterator<android.os.AsyncTask> it6 = qaVar2.f132389b.iterator();
        while (it6.hasNext()) {
            it6.next().execute(new java.lang.Object[0]);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = qaVar2.f132390d;
        if (trVar != null && (neVar = trVar.f133806as) != null && (hgVar = neVar.f130533c) != null) {
            hgVar.s().a();
        }
        mo36541x2adaad66(this.f134045o.f130531a.m99211xd8b36891());
        this.K = true;
    }

    private void c(boolean z17) {
        if (z17) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = neVar.f132039f;
            if (tkVar != null) {
                tkVar.l();
                neVar.f132049p = true;
                return;
            }
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar2 = this.f134045o;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar2 = neVar2.f132039f;
        if (tkVar2 != null) {
            tkVar2.m();
            neVar2.f132049p = false;
        }
    }

    private synchronized void d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar) {
        this.f134045o.f132043j.a(ezVar);
        this.f134045o.f132055v = true;
    }

    private void h(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        adVar.a(i17, (java.lang.Runnable) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad.AnonymousClass4());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setCameraCenterProportion */
    public void mo36570x8a3a3716(float f17, float f18, boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.mo36570x8a3a3716(f17, f18, z17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f130302b) == null) {
            return;
        }
        aiVar.a(f17, f18, z17);
    }

    private void b(int i17) {
        this.f134045o.f132041h.a(i17);
    }

    private java.lang.String g(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar != null) {
            return (java.lang.String) tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass170(c4247x704e24df), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass170) null);
        }
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: animateCamera */
    public void mo36551x59b77566(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25950xd5528c6e c25950xd5528c6e, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        super.mo36551x59b77566(c25950xd5528c6e, cancelableCallback);
        if (this.H || (abVar = this.F) == null || abVar.b()) {
            return;
        }
        this.F.a(c25950xd5528c6e, 500L, cancelableCallback);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: setPadding */
    public void mo36606x812ec54f(int i17, int i18, int i19, int i27, boolean z17) {
        super.mo36606x812ec54f(i17, i18, i19, i27, z17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar = this.f134047q;
        if (bgVar != null) {
            bgVar.a(i17, i18, i19, i27, z17);
        }
    }

    private void i(int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar != null) {
            tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass29(i17, i18));
        }
    }

    private void l(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar == null || (adVar = neVar.f132041h) == null) {
            return;
        }
        adVar.M = z17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.map.sdk.p497x5a73344.p498xb96a1653.InterfaceC4262x9875e7fc
    /* renamed from: setIndoorFloor */
    public void mo35484x255ed3b7(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        super.mo35484x255ed3b7(str, str2);
        if (this.H || (abVar = this.F) == null || android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        abVar.f130302b.a(str, str2);
    }

    private void f(int i17) {
        this.f134045o.a(i17);
    }

    private void b(float f17, float f18) {
        this.f134045o.f132041h.b(f17, f18, true);
    }

    private void f(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        a(c4247x704e24df, s());
    }

    private void g(boolean z17) {
        this.f134045o.f132039f.g(z17);
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qr h(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (c4247x704e24df == null) {
            c4247x704e24df = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df();
        }
        return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qr) tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass167(c4247x704e24df), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass167) null);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: animateCamera */
    public void mo36550x59b77566(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25950xd5528c6e c25950xd5528c6e, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        super.mo36550x59b77566(c25950xd5528c6e, j17, cancelableCallback);
        if (this.H || (abVar = this.F) == null || abVar.b()) {
            return;
        }
        this.F.a(c25950xd5528c6e, j17, cancelableCallback);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: snapshot */
    public void mo36617x10fad5c4(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.SnapshotReadyCallback snapshotReadyCallback, android.graphics.Bitmap.Config config) {
        super.mo36617x10fad5c4(snapshotReadyCallback, config);
        mo36618x10fad5c4(snapshotReadyCallback, config, 0);
    }

    private void e(int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar != null) {
            if (i18 < 0) {
                i18 = 0;
            }
            if (i18 > 255) {
                i18 = 255;
            }
            int i19 = 255 - i18;
            if (i19 == 0) {
                i19 = 1;
            }
            tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass112(i17, i19));
        }
    }

    private void f(int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar != null) {
            neVar.E = i17;
            neVar.D = i18;
        }
    }

    private void i(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        adVar.G = z17;
        adVar.f130362z.i().b(adVar.G);
    }

    private void d(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        this.f134045o.f132041h.a(c4247x704e24df.m35331xbc3301f3(), c4247x704e24df.m35332x962aa94a(), 1);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7
    /* renamed from: snapshot */
    public void mo36616x10fad5c4(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.SnapshotReadyCallback snapshotReadyCallback) {
        super.mo36616x10fad5c4(snapshotReadyCallback);
        mo36617x10fad5c4(snapshotReadyCallback, android.graphics.Bitmap.Config.ARGB_8888);
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar) {
        this.f134045o.f132043j.a(ezVar);
        this.f134045o.f132055v = true;
    }

    @java.lang.Deprecated
    private void g(int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar != null) {
            tkVar.b(i17, i18);
        }
    }

    private void c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar) {
        this.f134045o.f132043j.a(ezVar);
        this.f134045o.f132055v = true;
    }

    private void e(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (0 != tkVar.f133194e) {
            tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass180(z17));
        }
    }

    private void f(boolean z17) {
        this.f134045o.e(z17);
    }

    private void h(boolean z17) {
        this.f134045o.H.f132686f.j(z17);
    }

    private int f(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar == null || (tkVar = neVar.f132039f) == null) {
            return -1;
        }
        return ((java.lang.Integer) tkVar.a((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass50>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass50(str), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass50) (-1))).intValue();
    }

    private boolean i(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        boolean z17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        if (c4247x704e24df == null) {
            return true;
        }
        android.graphics.Rect r17 = adVar.r();
        boolean contains = r17 != null ? r17.contains(c4247x704e24df.m35332x962aa94a(), c4247x704e24df.m35331xbc3301f3()) : false;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17 = adVar.B.a(adVar.A.f133953m);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a18 = adVar.B.a(c4247x704e24df);
        if (adVar.C != null) {
            double abs = java.lang.Math.abs(a17.f131000a - a18.f131000a);
            double abs2 = java.lang.Math.abs(a17.f131001b - a18.f131001b);
            if (abs > adVar.C.width() || abs2 > adVar.C.height()) {
                z17 = false;
                return contains && !z17;
            }
        }
        z17 = true;
        if (contains) {
        }
    }

    private void d(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar != null) {
            tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass174(i17));
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl
    public final void g() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar;
        super.g();
        if (this.H) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar = this.F;
        if (abVar != null && (aiVar = abVar.f130302b) != null) {
            aiVar.m();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa qaVar = this.f134048r;
        if (qaVar != null) {
            qaVar.a();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar = this.f134050t;
        if (pyVar != null) {
            pyVar.f132376c = null;
            pyVar.f132374a.clear();
            pyVar.f132377d.clear();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.a();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ae aeVar = this.G;
        if (aeVar != null) {
            if (aeVar.f130390a != null) {
                aeVar.f130390a = null;
            }
            this.G = null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar2 = this.F;
        if (abVar2 != null) {
            if (abVar2.f130302b != null) {
                abVar2.f130302b = null;
            }
            this.F = null;
        }
        if (this.E != null) {
            this.E = null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.af afVar = this.D;
        if (afVar != null) {
            if (afVar.f130391a != null) {
                afVar.f130391a = null;
            }
            this.D = null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf bfVar = this.f134049s;
        if (bfVar != null) {
            bfVar.f130419d = false;
            bfVar.a();
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0 interfaceC26016x7851a8f0 = bfVar.f130420e;
            if (interfaceC26016x7851a8f0 != null) {
                interfaceC26016x7851a8f0.mo36414xc84af884();
                bfVar.f130420e = null;
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450 interfaceC25954xb7e06450 = bfVar.f130417b;
            if (interfaceC25954xb7e06450 != null) {
                interfaceC25954xb7e06450.mo99129x88fbd074();
                bfVar.f130417b = null;
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener m35940xccabb43e = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35940xccabb43e();
            if (m35940xccabb43e != null) {
                java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26051xb5982329.LocationRegionChangedListener>> it = bfVar.f130423h.iterator();
                while (it.hasNext()) {
                    if (it.next().get() != m35940xccabb43e) {
                        it.remove();
                    }
                }
            }
            this.f134049s = null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar = this.f134047q;
        if (bgVar != null) {
            if (bgVar.f130438b != null) {
                ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) bgVar.f130438b.e_).b(bgVar.f130447k);
                bgVar.f130438b.l();
                bgVar.f130438b = null;
            }
            if (bgVar.f130439c != null) {
                bgVar.f130439c = null;
            }
            com.tencent.mapsdk.internal.hl.a aVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b;
            if (aVar != null) {
                aVar.c();
            }
            this.f134047q = null;
        }
        this.f134051u.clear();
        this.H = true;
    }

    private void h(int i17, int i18) {
        this.f134045o.a(i17, i18);
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fj fjVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        synchronized (adVar.f130353q) {
            adVar.f130353q.remove(fjVar);
        }
    }

    private void e(java.lang.String str) {
        this.f134045o.b(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        r4 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.a(r3.mo36409x5db1b11(), r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean h(float r11, float r12) {
        /*
            r10 = this;
            com.tencent.mapsdk.engine.jni.models.TappedElement r11 = r10.a(r11, r12)
            r12 = 0
            if (r11 == 0) goto L74
            com.tencent.mapsdk.internal.py r0 = r10.f134050t
            if (r0 == 0) goto L74
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r1 = r0.f132376c
            if (r1 == 0) goto L74
            int r1 = r11.f17376x368f3a
            r2 = 4
            if (r1 != r2) goto L74
            long r1 = r11.f17369xb9bf0b8e
            java.util.List<com.tencent.mapsdk.internal.pw> r11 = r0.f132374a
            java.util.Iterator r11 = r11.iterator()
        L1c:
            boolean r3 = r11.hasNext()
            r4 = 0
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r11.next()
            com.tencent.mapsdk.internal.pw r3 = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw) r3
            com.tencent.mapsdk.internal.px r5 = r3.f132324b
            if (r5 == 0) goto L61
            com.tencent.mapsdk.internal.px$d r5 = r5.f132343a
            if (r5 == 0) goto L61
            java.util.List<com.tencent.mapsdk.internal.px$d> r5 = r5.f132361j
            if (r5 == 0) goto L61
            java.util.Iterator r5 = r5.iterator()
        L39:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L61
            java.lang.Object r6 = r5.next()
            com.tencent.mapsdk.internal.px$d r6 = (com.tencent.mapsdk.internal.px.d) r6
            com.tencent.mapsdk.internal.py r7 = r3.f132323a
            com.tencent.mapsdk.internal.ne r7 = r7.f132375b
            com.tencent.mapsdk.internal.bi r7 = r7.f132043j
            int r8 = r6.f132352a
            java.lang.Class<com.tencent.mapsdk.internal.oc> r9 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc.class
            com.tencent.mapsdk.internal.ng r7 = r7.a(r9, r8)
            com.tencent.mapsdk.internal.oc r7 = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc) r7
            if (r7 == 0) goto L39
            int r7 = r7.a()
            long r7 = (long) r7
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 != 0) goto L39
            r4 = r6
        L61:
            if (r4 == 0) goto L1c
            java.lang.String r11 = r3.mo36409x5db1b11()
            com.tencent.tencentmap.mapsdk.maps.model.SubPoi r4 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.a(r11, r4)
        L6b:
            if (r4 == 0) goto L74
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r11 = r0.f132376c
            r11.mo99162x82f09148(r4)
            r11 = 1
            return r11
        L74:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9.h(float, float):boolean");
    }

    private void c(int i17) {
        this.f134045o.f132041h.a(i17);
    }

    private void d(float f17) {
        this.N = f17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar != null) {
            neVar.a(f17);
            if (this.P != 2 || ae()) {
                return;
            }
            b(this.N);
        }
    }

    private void e(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        boolean contains;
        if (c4247x704e24df == null) {
            contains = false;
        } else {
            int m35331xbc3301f3 = c4247x704e24df.m35331xbc3301f3();
            contains = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26022x384048dd.f49450x9b60171d.contains(c4247x704e24df.m35332x962aa94a(), m35331xbc3301f3);
        }
        if (contains) {
            this.f134045o.f132041h.a(c4247x704e24df, (java.lang.Runnable) null);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl
    public final void f() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar;
        if (this.H || this.F == null || (pyVar = this.f134050t) == null) {
            return;
        }
        this.M.b(pyVar);
    }

    private void c(android.graphics.Rect rect, android.graphics.Rect rect2) {
        this.f134045o.f132041h.c(rect, rect2);
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fe feVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        synchronized (adVar.f130354r) {
            adVar.f130354r.remove(feVar);
        }
    }

    private boolean f(float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bi biVar = this.f134045o.f132043j;
        com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4389x448e86b0 a17 = biVar.f130494a.i().a(f17, f18);
        if (a17 == null || a17.f17376x368f3a != 3) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fa faVar = biVar.f130497d;
        if (faVar == null) {
            return true;
        }
        faVar.o_();
        return true;
    }

    private void d(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar == null || tkVar.f133194e == 0) {
            return;
        }
        tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass173(z17));
    }

    private void c(float f17, float f18) {
        this.f134045o.f132041h.a(f17, f18, true);
    }

    private static float e(int i17) {
        return com.tencent.mapsdk.internal.v.b.a(i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d9, code lost:
    
        r5 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.a(r4.mo36409x5db1b11(), r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean e(float r12, float r13) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9.e(float, float):boolean");
    }

    private void d(float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = neVar.f132041h;
            adVar.E = f17;
            adVar.F = f18;
        }
    }

    public final void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fq fqVar) {
        this.f134045o.f132041h.b(fqVar);
    }

    public final void c(float f17) {
        this.f134045o.f132041h.a(f17);
    }

    private void j(boolean z17) {
        this.f134046p = z17;
        this.f134045o.j(z17);
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fg fgVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        if (adVar.f130355s != null) {
            synchronized (adVar.f130356t) {
                adVar.f130355s.remove(fgVar);
            }
        }
    }

    private void c(float f17, float f18, boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        adVar.N = true;
        adVar.a(f17, f18, z17);
    }

    private void d(java.lang.String str) {
        this.f134045o.a(str);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl
    public final void d() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        if (this.H || (abVar = this.F) == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = abVar.f130302b;
        if (aiVar != null) {
            aiVar.n();
        }
        this.I = true;
    }

    private void c(double d17) {
        this.f134045o.f132041h.a((float) d17);
    }

    public final void b(float f17) {
        this.f134045o.f132041h.b(f17);
    }

    public final void c(int i17, int i18) {
        this.f134045o.b(i17, i18);
    }

    private void c(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar == null || 0 == tkVar.f133194e) {
            return;
        }
        tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass156(str));
    }

    public final void b(boolean z17) {
        this.f134045o.a(z17);
    }

    private boolean b(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oq oqVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.w wVar = this.f134045o.f132051r;
        if (wVar == null || (oqVar = wVar.f133988b) == null) {
            return false;
        }
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.w.a(new java.io.File(oqVar.e()), str, bArr, wVar.f133991e);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl
    public final void c() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ab abVar;
        if (this.H || (abVar = this.F) == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai aiVar = abVar.f130302b;
        if (aiVar != null) {
            aiVar.j();
        }
        this.I = false;
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fk fkVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        synchronized (adVar.f130360x) {
            adVar.f130360x.remove(fkVar);
        }
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fo foVar) {
        this.f134045o.f132041h.b(foVar);
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fm fmVar) {
        this.f134045o.f132041h.b(fmVar);
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fl flVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        synchronized (adVar.f130357u) {
            adVar.f130357u.remove(flVar);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl
    public final boolean a() {
        return (!this.K || this.I || this.H) ? false : true;
    }

    private static boolean a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        if (c4247x704e24df == null) {
            return false;
        }
        int m35331xbc3301f3 = c4247x704e24df.m35331xbc3301f3();
        return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26022x384048dd.f49450x9b60171d.contains(c4247x704e24df.m35332x962aa94a(), m35331xbc3301f3);
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oq oqVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar != null) {
            neVar.a(oqVar);
        }
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ph phVar) {
        this.f134045o.f132041h.b(phVar);
    }

    private void a(float f17, float f18, boolean z17) {
        this.f134045o.f132041h.b(f17, f18, z17);
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fr frVar) {
        this.f134045o.f132041h.b(frVar);
    }

    private boolean a(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar == null) {
            return false;
        }
        return ((java.lang.Boolean) tkVar.a((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass117>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass117(str), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass117) java.lang.Boolean.FALSE)).booleanValue();
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rt rtVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw rwVar = this.f134045o.f132042i;
        if (rwVar != null) {
            rwVar.f132820b.post(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.AnonymousClass6(rtVar));
        }
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar) {
        this.f134045o.f132043j.a(ezVar);
        this.f134045o.f132055v = true;
    }

    private void b(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8 c4257x25d9a8e8) {
        this.f134045o.b(c4257x25d9a8e8);
    }

    private boolean g(float f17, float f18) {
        java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationClickListener> weakReference;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMyLocationClickListener onMyLocationClickListener;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bf bfVar = this.f134049s;
        boolean z17 = false;
        if (bfVar != null) {
            com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4389x448e86b0 a17 = bfVar.f130428m.f132043j.f130494a.i().a(f17, f18);
            if (a17 != null && a17.f17376x368f3a == 6) {
                z17 = true;
            }
            if (z17 && (weakReference = bfVar.f130422g) != null && (onMyLocationClickListener = weakReference.get()) != null) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26();
                android.location.Location location = bfVar.f130425j;
                if (location != null) {
                    c26041x873d1d26.m99513xeff5e924(location.getAltitude());
                    c26041x873d1d26.m99516x63f13b6d(bfVar.f130425j.getLongitude());
                    c26041x873d1d26.m99514x20be4aee(bfVar.f130425j.getLatitude());
                }
                return onMyLocationClickListener.m99169x74934b47(c26041x873d1d26);
            }
        }
        return z17;
    }

    private void b(android.graphics.Rect rect, android.graphics.Rect rect2) {
        this.f134045o.f132041h.b(rect, rect2);
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fj fjVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        if (fjVar != null) {
            synchronized (adVar.f130353q) {
                if (!adVar.f130353q.contains(fjVar)) {
                    adVar.f130353q.add(fjVar);
                }
            }
        }
    }

    private void b(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, java.lang.Runnable runnable) {
        this.f134045o.f132041h.a(c4247x704e24df, runnable);
    }

    private void b(float f17, float f18, boolean z17) {
        this.f134045o.f132041h.a(f17, f18, z17);
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fe feVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        if (feVar != null) {
            synchronized (adVar.f130354r) {
                if (!adVar.f130354r.contains(feVar)) {
                    adVar.f130354r.add(feVar);
                }
            }
        }
    }

    private void b(android.graphics.Rect rect) {
        this.f134045o.f132041h.b(rect);
    }

    private void b(double d17) {
        this.f134045o.f132041h.a((360.0d - d17) % 360.0d, r1.i(), true);
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fq fqVar) {
        this.f134045o.f132041h.a(fqVar);
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb fbVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar == null || (azVar = neVar.f132045l) == null) {
            return;
        }
        azVar.b(fbVar);
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fg fgVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        if (fgVar != null) {
            if (adVar.f130355s == null) {
                adVar.f130355s = new java.util.ArrayList();
            }
            synchronized (adVar.f130356t) {
                if (!adVar.f130355s.contains(fgVar)) {
                    adVar.f130355s.add(fgVar);
                }
            }
        }
    }

    private void b(java.lang.String str) {
        this.f134045o.f132039f.b(str);
    }

    public final void b(int i17, int i18) {
        this.f134045o.f132041h.a(i17, i18);
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ba baVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        if (adVar.f130358v != null) {
            synchronized (adVar.f130359w) {
                adVar.f130358v.remove(baVar);
            }
        }
    }

    public final void a(int i17, int i18) {
        this.f134045o.f132041h.a(i17, i18, 1);
    }

    public final void a(float f17) {
        this.f134045o.f132041h.a(f17);
    }

    private void b(int i17, float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar != null) {
            tkVar.a(i17, f17);
        }
    }

    public final void a(double d17) {
        this.f134045o.f132041h.c(d17);
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fi fiVar) {
        this.f134045o.b(fiVar);
    }

    private boolean a(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oq oqVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.w wVar = this.f134045o.f132051r;
        if (wVar == null || (oqVar = wVar.f133988b) == null) {
            return false;
        }
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.w.a(new java.io.File(oqVar.c()), str, bArr, wVar.f133990d);
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oz ozVar) {
        this.f134045o.b(ozVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl
    public final void b() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar;
        if (this.H || this.F == null || (pyVar = this.f134050t) == null) {
            return;
        }
        this.M.a(pyVar);
    }

    private void b(com.tencent.mapsdk.internal.qa.b bVar) {
        if (bVar == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa qaVar = this.f134048r;
        if (qaVar != null) {
            qaVar.b(bVar);
        } else {
            this.f134051u.remove(bVar);
        }
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fk fkVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        if (fkVar != null) {
            synchronized (adVar.f130360x) {
                if (!adVar.f130360x.contains(fkVar)) {
                    adVar.f130360x.add(fkVar);
                }
            }
        }
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fo foVar) {
        this.f134045o.f132041h.a(foVar);
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fm fmVar) {
        this.f134045o.f132041h.a(fmVar);
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fl flVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        if (flVar != null) {
            synchronized (adVar.f130357u) {
                if (!adVar.f130357u.contains(flVar)) {
                    adVar.f130357u.add(flVar);
                }
            }
        }
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fr frVar) {
        this.f134045o.f132041h.a(frVar);
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ph phVar) {
        this.f134045o.f132041h.a(phVar);
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fa faVar) {
        this.f134045o.f132043j.f130497d = faVar;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar, int i17, int i18, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fp fpVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        android.graphics.Rect mo36416x7436dfc8 = ezVar.mo36416x7436dfc8(neVar.f132046m);
        if (mo36416x7436dfc8 == null || i17 <= 0 || i18 <= 0 || fpVar == null) {
            return;
        }
        neVar.f132052s.a(ezVar, mo36416x7436dfc8, fpVar, i17, i18);
    }

    private void a(android.graphics.Rect rect, int i17, int i18, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fp fpVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (rect == null) {
            rect = neVar.f132041h.q();
        }
        android.graphics.Rect rect2 = rect;
        if (rect2 == null || i17 <= 0 || i18 <= 0 || fpVar == null) {
            return;
        }
        neVar.f132052s.a(null, rect2, fpVar, i17, i18);
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw a(int i17, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        if (i17 == 0) {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it) adVar, 0, 1);
        }
        if (i17 == 1) {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it) adVar, (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ik(), new java.lang.Object[]{obj, obj2});
        }
        if (i17 == 2) {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg.a(adVar, 3, java.lang.Math.log10(((java.lang.Number) obj).doubleValue()) / java.lang.Math.log10(2.0d), java.lang.Math.log10(((java.lang.Number) obj2).doubleValue()) / java.lang.Math.log10(2.0d));
        }
        if (i17 == 3) {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg.a(adVar, 2, adVar.h(), (((java.lang.Number) obj2).doubleValue() - ((java.lang.Number) obj).doubleValue()) + adVar.h());
        }
        if (i17 != 4) {
            return null;
        }
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg.a(adVar, 4, adVar.i(), (((java.lang.Number) obj2).doubleValue() - ((java.lang.Number) obj).doubleValue()) + adVar.i());
    }

    private double a(android.graphics.Rect rect, android.graphics.Rect rect2) {
        android.graphics.Rect rect3 = new android.graphics.Rect(this.f134045o.f132041h.f130362z.j());
        if (rect2 != null) {
            rect3.left += rect2.left;
            rect3.right -= rect2.right;
            rect3.top += rect2.top;
            rect3.bottom -= rect2.bottom;
        }
        return r0.a(rect, rect3);
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rt rtVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw rwVar = this.f134045o.f132042i;
        if (rwVar != null) {
            rwVar.f132820b.post(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw.AnonymousClass5(rtVar));
        }
    }

    private int a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8 c4257x25d9a8e8) {
        return this.f134045o.a(c4257x25d9a8e8);
    }

    private int a(int i17, int i18, int i19, int i27, int i28, float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar.f132039f == null) {
            return -1;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        if (i17 > 255) {
            i17 = 255;
        }
        if (i18 < 0) {
            i18 = 0;
        }
        if (i18 > 255) {
            i18 = 255;
        }
        if (i19 < 0) {
            i19 = 0;
        }
        if (i19 > 255) {
            i19 = 255;
        }
        if (i27 < 0) {
            i27 = 0;
        }
        if (i27 > 255) {
            i27 = 255;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4255x734771a5 c4255x734771a5 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4255x734771a5();
        c4255x734771a5.f16570x5a72f63 = new int[]{i17, i18, i19, 255 - i27};
        android.graphics.Rect rect = neVar.f132048o;
        if (rect != null) {
            c4255x734771a5.f16573x6be2dc6 = rect.width();
            c4255x734771a5.f16571xb7389127 = neVar.f132048o.height();
        }
        c4255x734771a5.f16574xd4677478 = f17;
        c4255x734771a5.f16572x61fd551 = i28;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = neVar.f132039f;
        return ((java.lang.Integer) tkVar.a((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass111>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass111(c4255x734771a5), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass111) 0)).intValue();
    }

    private void a(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26056xa47d77b8> list, java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list2) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar.f132059z == null) {
            neVar.f132059z = new com.tencent.mapsdk.internal.ne.d();
        }
        com.tencent.mapsdk.internal.ne.d dVar = neVar.f132059z;
        dVar.f132071a = list;
        dVar.f132072b = list2;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne.this.f132039f.a(list, list2);
    }

    private java.util.List<java.lang.Integer> a(android.graphics.Rect rect, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        return (java.util.List) tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass34(rect, i17), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass34) null);
    }

    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4237x4663f48a a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4236xe186be0d c4236xe186be0d) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        return (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4237x4663f48a) tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass33(c4236xe186be0d), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass33) null);
    }

    private void a(int i17, float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        adVar.a(i17, (java.lang.Runnable) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad.AnonymousClass5(f17));
    }

    private void a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, java.lang.Runnable runnable) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        if (c4247x704e24df != null) {
            adVar.a(c4247x704e24df, adVar.A.f133942b.f133977m, runnable);
        }
    }

    private void a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, int i17) {
        this.f134045o.f132041h.a(c4247x704e24df, i17, (java.lang.Runnable) null);
    }

    private void a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, int i17, java.lang.Runnable runnable) {
        this.f134045o.f132041h.a(c4247x704e24df, i17, runnable);
    }

    private void a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, float f17, java.lang.Runnable runnable) {
        int i17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        if (c4247x704e24df != null) {
            adVar.f130351o.e();
            double d17 = adVar.A.f133942b.f133976l;
            double d18 = f17;
            double d19 = d18 / d17;
            if (d19 > 1.0d) {
                i17 = (int) (d19 / 0.5d);
            } else {
                if (d19 >= 1.0d) {
                    adVar.b(c4247x704e24df, runnable);
                    return;
                }
                i17 = d19 != 1.0d ? (int) (0.5d / d19) : 0;
            }
            int max = java.lang.Math.max(60, java.lang.Math.min(120, (i17 >> 1) << 1));
            double log10 = java.lang.Math.log10(d17) / java.lang.Math.log10(2.0d);
            double log102 = java.lang.Math.log10(d18) / java.lang.Math.log10(2.0d);
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = adVar.A.f133953m;
            int i18 = 0;
            while (i18 < max) {
                long j17 = max;
                int i19 = i18 + 1;
                long j18 = i19;
                double d27 = log10;
                double d28 = log102;
                double pow = java.lang.Math.pow(2.0d, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mo.a(log10, log102, j17, j18));
                double a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mo.a(c4247x704e24df2.m35331xbc3301f3(), c4247x704e24df.m35331xbc3301f3(), j17, j18);
                double a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mo.a(c4247x704e24df2.m35332x962aa94a(), c4247x704e24df.m35332x962aa94a(), j17, j18);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("debug location anim zoomOut:" + a17 + "," + a18);
                adVar.b(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm(120, new double[]{pow, a17, a18}));
                log10 = d27;
                log102 = d28;
                i18 = i19;
            }
            if (runnable != null) {
                adVar.b(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm(runnable));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r2 > r11) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df r11, android.graphics.Rect r12) {
        /*
            r10 = this;
            com.tencent.mapsdk.internal.ne r0 = r10.f134045o
            com.tencent.mapsdk.internal.ad r0 = r0.f132041h
            com.tencent.mapsdk.internal.ey r1 = r0.B
            com.tencent.mapsdk.internal.fu r11 = r1.a(r11)
            double r2 = r11.f131000a
            int r2 = (int) r2
            double r3 = r11.f131001b
            int r3 = (int) r3
            boolean r2 = r12.contains(r2, r3)
            if (r2 != 0) goto L5c
            double r2 = r11.f131000a
            int r4 = r12.left
            double r5 = (double) r4
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r6 = 0
            if (r5 >= 0) goto L24
        L21:
            double r4 = (double) r4
            double r4 = r4 - r2
            goto L2d
        L24:
            int r4 = r12.right
            double r8 = (double) r4
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 <= 0) goto L2c
            goto L21
        L2c:
            r4 = r6
        L2d:
            double r2 = r11.f131001b
            int r11 = r12.top
            double r8 = (double) r11
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 >= 0) goto L3a
        L36:
            double r11 = (double) r11
            double r6 = r11 - r2
            goto L42
        L3a:
            int r11 = r12.bottom
            double r8 = (double) r11
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L42
            goto L36
        L42:
            com.tencent.mapsdk.internal.v r11 = r0.A
            com.tencent.map.lib.models.GeoPoint r11 = r11.f133953m
            com.tencent.mapsdk.internal.fu r11 = r1.a(r11)
            double r2 = r11.f131000a
            double r2 = r2 - r4
            r11.f131000a = r2
            double r2 = r11.f131001b
            double r2 = r2 - r6
            r11.f131001b = r2
            com.tencent.map.lib.models.GeoPoint r11 = r1.a(r11)
            r12 = 0
            r0.a(r11, r12)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9.a(com.tencent.map.lib.models.GeoPoint, android.graphics.Rect):void");
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm jmVar) {
        this.f134045o.f132041h.b(jmVar);
    }

    private void a(android.graphics.Rect rect) {
        this.f134045o.f132041h.a(rect);
    }

    private int a(int i17, int i18, int i19, int i27, boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        adVar.H = i17;
        adVar.I = i18;
        adVar.f130347J = i19;
        adVar.K = i27;
        android.graphics.Rect rect = adVar.C;
        if (rect != null && rect.width() > 0 && adVar.C.height() > 0) {
            if (i17 + i19 > adVar.C.width() || i18 + i27 > adVar.C.height()) {
                return -1;
            }
            android.graphics.PointF a17 = adVar.a();
            adVar.a(a17.x, a17.y, z17);
            return 0;
        }
        adVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad.AnonymousClass1(z17));
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar = adVar.f130362z;
        if (!(bdVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne)) {
            return -2;
        }
        android.content.Context mo36630x76847179 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) bdVar).mo36630x76847179();
        return (i17 + i19 > com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.b(mo36630x76847179) || i18 + i27 > com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.c(mo36630x76847179)) ? -1 : 0;
    }

    private void a(double d17, double d18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aa aaVar = this.f134045o.f132041h.f130351o;
        synchronized (aaVar.f130288c) {
            while (!aaVar.f130287b.isEmpty()) {
                java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm> arrayList = aaVar.f130287b;
                if (arrayList.get(arrayList.size() - 1).f131573z != 3) {
                    break;
                }
                java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm> arrayList2 = aaVar.f130287b;
                double[] dArr = arrayList2.remove(arrayList2.size() - 1).A;
                d17 += dArr[0];
                d18 += dArr[1];
            }
            aaVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm(3, new double[]{d17, d18}));
        }
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qm qmVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f134045o.f132041h;
        if (adVar.f130352p == null) {
            adVar.f130352p = adVar.f130361y.N();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qj qjVar = adVar.f130352p;
        qjVar.f132490b = qmVar;
        boolean a17 = qmVar.a();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar = qjVar.f132492d;
        if (azVar != null) {
            if (a17) {
                azVar.b(qjVar);
            } else {
                azVar.a(qjVar);
            }
        }
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb fbVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar == null || (azVar = neVar.f132045l) == null) {
            return;
        }
        azVar.a(fbVar);
    }

    private void a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, float f17, float f18, boolean z17) {
        this.N = f17;
        this.O.m35334xea574fff(c4247x704e24df.m35331xbc3301f3());
        this.O.m35335x2c901cbe(c4247x704e24df.m35332x962aa94a());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar != null) {
            neVar.a(this.O, this.N, f18, z17);
            int i17 = this.P;
            if (i17 == 1 || i17 == 2) {
                a(this.O, s());
            }
            if (this.P != 2 || ae()) {
                return;
            }
            b(this.N);
        }
    }

    private void a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, android.graphics.RectF rectF, boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        android.graphics.Rect rect;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar2 = this.f134045o;
        if (neVar2 != null) {
            if (rectF != null && (rect = neVar2.C) != null) {
                rectF.left -= rect.left;
                rectF.top -= rect.top;
                rectF.right -= rect.right;
                rectF.bottom -= rect.bottom;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = neVar2.f132039f;
            if (tkVar != null) {
                int i17 = neVar2.E;
                int i18 = neVar2.D;
                if (0 == tkVar.f133194e || (neVar = tkVar.f133199j) == null) {
                    return;
                }
                neVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass6(rectF, c4247x704e24df, i17, i18, z17));
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl
    public final void a(int i17) {
        super.a(i17);
        if (this.H || this.f134045o == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131739g, "setIndoorConfigType:".concat(java.lang.String.valueOf(i17)));
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass162(i17));
    }

    private void a(float f17, float f18, float f19, float f27) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (0 != tkVar.f133194e) {
            tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass172(f17, f18, f19, f27));
        }
    }

    public final void a(java.lang.String[] strArr) {
        this.f134045o.a(strArr);
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ox oxVar) {
        this.f134045o.a(oxVar);
    }

    private void a(com.tencent.mapsdk.internal.ad.a aVar) {
        this.f134045o.f132041h.D = aVar;
    }

    private void a(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar == null || (tkVar = neVar.f132039f) == null) {
            return;
        }
        tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass27(i18, i17, i19, i27));
    }

    private void a(double d17, double d18, double d19, double d27, double d28) {
        this.f134045o.f132041h.a(d17, d18, d19, d27, d28, false, null);
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ba baVar) {
        this.f134045o.f132041h.a(baVar);
    }

    @java.lang.Deprecated
    private void a(int i17, int i18, int i19) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134045o.f132039f;
        if (tkVar != null) {
            tkVar.a(i17, i18, i19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df r18, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iv r19) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9.a(com.tencent.map.lib.models.GeoPoint, com.tencent.mapsdk.internal.iv):void");
    }

    private float a(double d17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (c4247x704e24df != null && neVar.f132053t != null && (eyVar = neVar.f132046m) != null) {
            double mo36717xffa0db93 = eyVar.mo36717xffa0db93(c4247x704e24df.m35331xbc3301f3() / 1000000.0d);
            if (mo36717xffa0db93 != 0.0d) {
                return (float) (d17 / mo36717xffa0db93);
            }
        }
        return 0.0f;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fi fiVar) {
        this.f134045o.a(fiVar);
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oz ozVar) {
        this.f134045o.a(ozVar);
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4389x448e86b0 a(float f17, float f18) {
        return this.f134045o.b(f17, f18);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bl
    public final void a(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar;
        if (this.H || (bgVar = this.f134047q) == null || (buVar = bgVar.f130437a.get()) == null) {
            return;
        }
        buVar.mo36665xe5e6c0e2(z17);
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pb pbVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar == null) {
            return;
        }
        neVar.G = pbVar;
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f134045o;
        if (neVar == null) {
            return;
        }
        neVar.a(c26042xcb530b7b, i17);
    }

    public final void a(com.tencent.mapsdk.internal.qa.b bVar) {
        if (bVar == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa qaVar = this.f134048r;
        if (qaVar != null) {
            qaVar.a(bVar);
        } else {
            this.f134051u.put(bVar, java.lang.Boolean.TRUE);
        }
    }
}
