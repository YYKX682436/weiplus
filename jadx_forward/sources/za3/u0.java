package za3;

/* loaded from: classes15.dex */
public class u0 implements p21.d, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f552557d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.Button f552558e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.RunnableC16292x2e41dc6f f552559f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f552560g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f552562i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f552563m;

    /* renamed from: v, reason: collision with root package name */
    public final p21.c f552572v;

    /* renamed from: w, reason: collision with root package name */
    public za3.t0 f552573w;

    /* renamed from: h, reason: collision with root package name */
    public boolean f552561h = true;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f552564n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public boolean f552565o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f552566p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final long f552567q = 500;

    /* renamed from: r, reason: collision with root package name */
    public long f552568r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f552569s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new za3.l0(this), false);

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f552570t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new za3.m0(this), false);

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f552571u = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new za3.n0(this), false);

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f552574x = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new za3.p0(this), true);

    public u0(android.app.Activity activity, android.widget.Button button, com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16291x2f212556 c16291x2f212556) {
        this.f552557d = activity;
        this.f552558e = button;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) activity.findViewById(com.p314xaae8f345.mm.R.id.p89);
        this.f552560g = relativeLayout;
        relativeLayout.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.RunnableC16292x2e41dc6f runnableC16292x2e41dc6f = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.RunnableC16292x2e41dc6f) this.f552560g.findViewById(com.p314xaae8f345.mm.R.id.p8_);
        this.f552559f = runnableC16292x2e41dc6f;
        runnableC16292x2e41dc6f.m65953x103d029d(button);
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.RunnableC16292x2e41dc6f runnableC16292x2e41dc6f2 = this.f552559f;
        if (runnableC16292x2e41dc6f2.f226213n == null) {
            runnableC16292x2e41dc6f2.f226213n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("VolumeMeter_handler");
        }
        ((dh4.l) ((fa0.r) i95.n0.c(fa0.r.class))).getClass();
        dh4.f0 Di = dh4.l.Di();
        this.f552572v = Di;
        if (Di == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TalkMgr", "cannot get talkroom server");
        }
    }

    @Override // p21.d
    public void J0(int i17, int i18, java.lang.String str) {
    }

    @Override // p21.d
    public void J1(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.TalkMgr", "onInitFailed %s", str);
        va3.j0.Ri().b(3);
        this.f552557d.finish();
    }

    @Override // p21.d
    public void N4(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkMgr", "onSeizeMicFailed");
        if (i17 == 340) {
            if (this.f552566p != 3) {
                return;
            } else {
                this.f552566p = 4;
            }
        } else if (this.f552566p != 1) {
            return;
        } else {
            this.f552566p = 2;
        }
        a();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r5 r5Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r5(null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.d6 d6Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.f274057a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.e(context, com.p314xaae8f345.mm.R.C30867xcad56011.f574853jq4, com.p314xaae8f345.mm.sdk.p2603x2137b148.x5.f274618e, -1, false, r5Var);
    }

    @Override // p21.d
    public void P2(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkMgr", "add %s,  del %s", str, str2);
    }

    @Override // p21.d
    public void P3() {
    }

    @Override // p21.d
    public void R() {
    }

    @Override // p21.d
    public void T0(java.lang.String str) {
    }

    @Override // p21.d
    public void T1() {
        a();
    }

    @Override // p21.d
    public void U2() {
        a();
    }

    public final void a() {
        za3.t0 t0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725 c16298xbb1f6725;
        com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128 c16319x94a0c128;
        za3.t0 t0Var2;
        if (this.f552561h) {
            return;
        }
        ((dh4.l) ((fa0.r) i95.n0.c(fa0.r.class))).getClass();
        if (dh4.l.Di().f314064z && (t0Var2 = this.f552573w) != null) {
            ((za3.g0) t0Var2).a(null);
            ((za3.g0) this.f552573w).b();
        }
        int i17 = this.f552566p;
        if (i17 == 0) {
            java.lang.String str = this.f552562i;
            if (this.f552573w != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    ((za3.g0) this.f552573w).a(null);
                    return;
                } else {
                    ((za3.g0) this.f552573w).a(this.f552562i);
                    return;
                }
            }
            return;
        }
        if (i17 == 1) {
            za3.t0 t0Var3 = this.f552573w;
            if (t0Var3 != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = ((za3.g0) t0Var3).f552447c.f552474l;
                n3Var.mo50303x856b99f0(8);
                android.os.Message obtain = android.os.Message.obtain();
                obtain.what = 8;
                n3Var.mo50309x6d91b823(obtain);
                return;
            }
            return;
        }
        if (i17 == 2) {
            java.lang.String str2 = this.f552562i;
            if (this.f552573w == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            za3.t0 t0Var4 = this.f552573w;
            java.lang.String str3 = this.f552562i;
            za3.i0 i0Var = ((za3.g0) t0Var4).f552447c;
            i0Var.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                return;
            }
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c01.a2.e(str3))) {
                return;
            }
            i0Var.f552472j = true;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = i0Var.f552474l;
            n3Var2.mo50303x856b99f0(7);
            android.os.Message obtain2 = android.os.Message.obtain();
            obtain2.what = 7;
            n3Var2.mo50309x6d91b823(obtain2);
            return;
        }
        if ((i17 == 3 || i17 == 5) && (t0Var = this.f552573w) != null) {
            za3.g0 g0Var = (za3.g0) t0Var;
            g0Var.f552450f = true;
            java.lang.String r17 = c01.z1.r();
            g0Var.f552446b.c();
            g0Var.f552446b.a(r17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var3 = g0Var.f552447c.f552474l;
            n3Var3.mo50303x856b99f0(6);
            n3Var3.mo50303x856b99f0(5);
            android.os.Message obtain3 = android.os.Message.obtain();
            obtain3.what = 6;
            n3Var3.mo50309x6d91b823(obtain3);
            java.lang.Object mo1006x62748683 = g0Var.f552451g.mo1006x62748683(r17);
            if ((mo1006x62748683 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725) && (c16319x94a0c128 = (c16298xbb1f6725 = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725) mo1006x62748683).f226254p) != null) {
                c16319x94a0c128.m66003x5ed0f0ff(c16298xbb1f6725.f226246e);
                c16319x94a0c128.m66003x5ed0f0ff(c16298xbb1f6725.f226247f);
            }
            g0Var.f552449e = r17;
        }
    }

    public final void b() {
        if (this.f552566p != 5) {
            return;
        }
        this.f552569s.d();
        a();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.jpy, new za3.o0(this));
        this.f552570t.c(1000L, 1000L);
    }

    public void c() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0 c6154xe47ae2d0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0();
        c6154xe47ae2d0.f136416g.f89117b = true;
        c6154xe47ae2d0.e();
        ((xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi()).v();
    }

    public void d() {
        this.f552563m = this.f552557d.getIntent().getStringExtra("map_talker_name");
        ((dh4.f0) this.f552572v).a(this);
        java.lang.String str = this.f552563m;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
            java.util.List m17 = c01.v1.m(str);
            if (m17 == null) {
                c01.n8.a().c(str, 28);
            } else {
                this.f552564n = m17;
            }
        } else {
            ((java.util.LinkedList) this.f552564n).clear();
            ((java.util.LinkedList) this.f552564n).add(str);
            ((java.util.LinkedList) this.f552564n).add(c01.z1.r());
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new za3.q0(this, str));
        this.f552558e.setOnTouchListener(new za3.s0(this));
    }

    @Override // p21.d
    public void m3() {
        if (this.f552566p != 1) {
            return;
        }
        this.f552566p = 5;
        long j17 = this.f552568r;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        long j18 = this.f552567q;
        if (elapsedRealtime >= j18) {
            b();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkMgr", "onSeizeMicSuccess waiting to execute");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f552569s;
        long elapsedRealtime2 = j18 - (android.os.SystemClock.elapsedRealtime() - this.f552568r);
        b4Var.c(elapsedRealtime2, elapsedRealtime2);
    }

    @Override // p21.d
    public void n1() {
        this.f552561h = false;
        this.f552558e.setEnabled(true);
        a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }

    @Override // p21.d
    public void q5(java.lang.String str) {
        this.f552562i = str;
        a();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f552574x;
        if (K0) {
            b4Var.d();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f574850jq1);
            b4Var.c(100L, 100L);
        }
    }
}
