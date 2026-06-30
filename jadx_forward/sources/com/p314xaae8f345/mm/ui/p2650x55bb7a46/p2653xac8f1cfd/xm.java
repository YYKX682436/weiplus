package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.k2.class)
/* loaded from: classes9.dex */
public class xm extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.k2 {

    /* renamed from: q, reason: collision with root package name */
    public static long f281779q = -1;

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.HashMap f281780r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.HashMap f281781s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.LinkedHashMap f281782t = new java.util.LinkedHashMap();

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.HashMap f281783u = new java.util.HashMap();

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.ArrayList f281784v = new java.util.ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public static final java.util.HashMap f281785w = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f281786e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f281787f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f281788g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f281789h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f281790i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f281791m;

    /* renamed from: n, reason: collision with root package name */
    public long f281792n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f281793o;

    /* renamed from: p, reason: collision with root package name */
    public int f281794p;

    public xm() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f281786e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5874xa80bd9bc>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.TransformComponent$1
            {
                this.f39173x3fe91575 = 2127530956;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5874xa80bd9bc c5874xa80bd9bc) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5874xa80bd9bc c5874xa80bd9bc2 = c5874xa80bd9bc;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wm wmVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wm) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm.f281785w.get(java.lang.Long.valueOf(c5874xa80bd9bc2.f136182g.f89270a));
                if (wmVar == null) {
                    return false;
                }
                java.lang.Long valueOf = java.lang.Long.valueOf(c5874xa80bd9bc2.f136182g.f89270a);
                int i17 = wmVar.f281717b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "RecallVoiceTransTextActEvent %s %s", valueOf, java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm.this.u0(wmVar.f281716a, i17);
                return false;
            }
        };
        this.f281787f = false;
        this.f281788g = false;
        this.f281789h = false;
        this.f281790i = new java.util.ArrayList();
        this.f281791m = false;
        this.f281793o = null;
        this.f281794p = -1;
    }

    public void A0(int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        if (i17 == 2) {
            this.f281789h = true;
            return;
        }
        if (this.f281791m) {
            long j17 = this.f281792n;
            synchronized (this) {
                android.util.Pair pair = (android.util.Pair) f281782t.get(java.lang.Long.valueOf(j17));
                f9Var = pair == null ? null : (com.p314xaae8f345.mm.p2621x8fb0427b.f9) pair.first;
            }
            p0(f9Var, true, -1, i17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        java.util.LinkedHashMap linkedHashMap;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "clear VoiceTransTextAct");
        synchronized (this) {
            linkedHashMap = f281782t;
            linkedHashMap.clear();
        }
        f281781s.clear();
        linkedHashMap.clear();
        f281783u.clear();
        if (this.f281791m) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5 c5402xfd96e0b5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5();
            c5402xfd96e0b5.f135746g.f89712c = 3;
            c5402xfd96e0b5.e();
            this.f281791m = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        this.f281786e.mo48814x2efc64();
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        android.view.View view2;
        int top;
        if (i17 < this.f281794p) {
            this.f281788g = false;
        }
        this.f281794p = i17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view;
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20072xae3e6ad0()) != 0 && (view2 = this.f281793o) != null && (top = view2.getTop()) > 0 && top - i27 <= 0) {
            c1163xf1deaba4.f1();
            c1163xf1deaba4.scrollBy(0, top);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "onScroll top:%s dy:%s", java.lang.Integer.valueOf(top), java.lang.Integer.valueOf(i27));
        }
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (i17 == 1) {
            this.f281793o = null;
        }
    }

    public final void m0(int i17) {
        if (this.f281787f) {
            java.util.List list = this.f281790i;
            if (((java.util.ArrayList) list).size() > 0) {
                java.lang.String l17 = ((java.lang.Long) ((java.util.ArrayList) list).get(0)).toString();
                for (int i18 = 1; i18 < ((java.util.ArrayList) list).size(); i18++) {
                    l17 = l17 + ":" + ((java.util.ArrayList) list).get(i18);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16128, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(((java.util.ArrayList) list).size()), java.lang.Integer.valueOf(!this.f281788g ? 1 : 0), 0, l17);
                this.f281787f = false;
                ((java.util.ArrayList) list).clear();
            }
        }
    }

    public synchronized void n0(long j17, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar) {
        f281780r.put(java.lang.Long.valueOf(j17), str);
        f281781s.put(java.lang.Long.valueOf(j17), ioVar);
        if (ioVar == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.Transformed) {
            f281783u.put(java.lang.Long.valueOf(j17), java.lang.Boolean.TRUE);
        }
    }

    public boolean o0(long j17) {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20072xae3e6ad0()) == 0 || j17 == f281779q;
    }

    public void p0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, int i17, int i18) {
        android.widget.RelativeLayout relativeLayout;
        if (f9Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f27 = pt0.f0.f2(f9Var.Q0(), f9Var.m124847x74d37ac6());
        if (f27 != null && f27.W2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TransformComponent", "go VoiceTransTextAct  msg is revoke");
            return;
        }
        if (f9Var.a2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "go VoiceTransTextAct unsetflag MsgId:%s,isVoiceTransforming:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Boolean.valueOf(this.f281791m));
            f9Var.l1(f9Var.F & (-65));
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            synchronized (this) {
                f281783u.put(java.lang.Long.valueOf(m124847x74d37ac6), java.lang.Boolean.FALSE);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.m124847x74d37ac6(), f9Var, true);
            r0();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6226xe566e8f2 c6226xe566e8f2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6226xe566e8f2();
            c6226xe566e8f2.f136473g.f89487a = f9Var.m124847x74d37ac6();
            c6226xe566e8f2.f136473g.f89492f = true;
            c6226xe566e8f2.e();
            return;
        }
        int i19 = 3;
        if (q0(f9Var.m124847x74d37ac6()) && z17) {
            if (t0(f9Var.m124847x74d37ac6()) == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.PreTransform) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "go VoiceTransTextAct unsetflag removeCache");
                v0(f9Var.m124847x74d37ac6());
                w0(f9Var.m124847x74d37ac6());
                x0(5, f9Var);
            } else if (this.f281791m) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5 c5402xfd96e0b5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5();
                c5402xfd96e0b5.f135746g.f89712c = 3;
                c5402xfd96e0b5.e();
                v0(f9Var.m124847x74d37ac6());
                w0(f9Var.m124847x74d37ac6());
                f9Var.l1(f9Var.F & (-65));
                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
                this.f281791m = false;
                u0(f9Var, -1);
            }
            r0();
            if (z17) {
                m0(i18);
                return;
            }
            return;
        }
        java.lang.String Ai = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var);
        com.p314xaae8f345.mm.p2621x8fb0427b.kb y07 = w21.p0.Ai().y0(Ai);
        if (y07 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y07.f68624xad49e234)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "VoiceTransformText has TransContent MsgId:%s, clientMsgId: %s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), f9Var.z0());
            f9Var.l1(f9Var.F | 64);
            n0(f9Var.m124847x74d37ac6(), y07.f68624xad49e234, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.Transformed);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
            this.f281787f = false;
            y0(i17);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6226xe566e8f2 c6226xe566e8f22 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6226xe566e8f2();
            c6226xe566e8f22.f136473g.f89487a = f9Var.m124847x74d37ac6();
            c6226xe566e8f22.f136473g.f89488b = f9Var.Q0();
            am.t00 t00Var = c6226xe566e8f22.f136473g;
            t00Var.f89489c = y07.f68624xad49e234;
            t00Var.f89490d = f9Var.mo78012x3fdd41df();
            c6226xe566e8f22.f136473g.f89491e = f9Var.A0();
            c6226xe566e8f22.e();
            return;
        }
        int n17 = c01.d9.e().n();
        if (n17 != 4 && n17 != 6) {
            yb5.d dVar = this.f280113d;
            db5.e1.i(dVar != null ? dVar.g() : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.b6b, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            x0(2, f9Var);
            this.f281787f = false;
            return;
        }
        if (this.f281791m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "go VoiceTransformText insert transformQueue");
            long m124847x74d37ac62 = f9Var.m124847x74d37ac6();
            synchronized (this) {
                f281782t.put(java.lang.Long.valueOf(m124847x74d37ac62), new android.util.Pair(f9Var, java.lang.Integer.valueOf(i17)));
            }
            n0(f9Var.m124847x74d37ac6(), "", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.PreTransform);
            r0();
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5 c5402xfd96e0b52 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5();
            c5402xfd96e0b52.f135746g.f89712c = 1;
            c5402xfd96e0b52.e();
            sb5.q2 q2Var = (sb5.q2) this.f280113d.f542241c.a(sb5.q2.class);
            long m124847x74d37ac63 = f9Var.m124847x74d37ac6();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) q2Var;
            roVar.f281407q.set(true);
            if (roVar.f281411u == m124847x74d37ac63) {
                android.view.View O0 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) roVar.f280113d.f542241c.a(sb5.z.class))).O0(roVar.f281411u);
                if (O0 != null && (relativeLayout = (android.widget.RelativeLayout) O0.findViewById(com.p314xaae8f345.mm.R.id.blv)) != null) {
                    roVar.f281411u = -1L;
                    relativeLayout.setVisibility(8);
                }
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5 c5402xfd96e0b53 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5();
            c5402xfd96e0b53.f135746g.f89711b = java.lang.String.valueOf(f9Var.m124847x74d37ac6());
            c5402xfd96e0b53.f135746g.f89716g = f9Var.Q0();
            am.v8 v8Var = c5402xfd96e0b53.f135746g;
            v8Var.f89710a = Ai;
            v8Var.f89713d = 1;
            v8Var.f89712c = 0;
            if (c01.e2.G(this.f280113d.x())) {
                boolean z18 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class))).f280287s;
                if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class))).f280286r) {
                    i19 = z18 ? 5 : 4;
                } else if (!r01.z.h(this.f280113d.x())) {
                    rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
                    java.lang.String x17 = this.f280113d.x();
                    ((qv.o) u2Var).getClass();
                    i19 = r01.z.j(x17) ? 0 : r01.z.n(this.f280113d.x()) ? 6 : 7;
                }
            } else {
                i19 = this.f280113d.C() ? 2 : 1;
            }
            v8Var.f89715f = i19;
            c5402xfd96e0b53.f135746g.f89714e = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.tm(this, c5402xfd96e0b53, i17, f9Var);
            if (34 == f9Var.mo78013xfb85f7b0()) {
                f281784v.add(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            }
            n0(java.lang.Long.valueOf(c5402xfd96e0b53.f135746g.f89711b).longValue(), "", com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.Transforming);
            long m124847x74d37ac64 = f9Var.m124847x74d37ac6();
            synchronized (this) {
                f281782t.put(java.lang.Long.valueOf(m124847x74d37ac64), new android.util.Pair(f9Var, java.lang.Integer.valueOf(i17)));
            }
            this.f281791m = true;
            this.f281792n = f9Var.m124847x74d37ac6();
            r0();
            y0(i17);
            if (c5402xfd96e0b53.e()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "go VoiceTransTextAct publish ExtTranslateVoiceEvent");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "go VoiceTransTextAct publish ExtTranslateVoiceEvent fail");
                yb5.d dVar2 = this.f280113d;
                java.lang.String string = (dVar2 != null ? dVar2.g() : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6a);
                yb5.d dVar3 = this.f280113d;
                if (dVar3 != null && dVar3.g() != null) {
                    yb5.d dVar4 = this.f280113d;
                    db5.t7.g(dVar4 != null ? dVar4.g() : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string);
                }
                w0(java.lang.Long.valueOf(c5402xfd96e0b53.f135746g.f89711b).longValue());
                v0(java.lang.Long.valueOf(c5402xfd96e0b53.f135746g.f89711b).longValue());
                this.f281791m = false;
                u0(f9Var, i17);
            }
        }
        if (z17) {
            this.f281788g = true;
        }
    }

    public synchronized boolean q0(long j17) {
        java.util.LinkedHashMap linkedHashMap;
        linkedHashMap = f281782t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "isInMsgTransformQueue[%s]:%s", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(linkedHashMap.containsKey(java.lang.Long.valueOf(j17))));
        return linkedHashMap.containsKey(java.lang.Long.valueOf(j17));
    }

    public final void r0() {
        yb5.d dVar = this.f280113d;
        if (dVar != null) {
            dVar.J();
        }
    }

    public java.lang.String s0(long j17, java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p2621x8fb0427b.kb y07;
        synchronized (this) {
            str2 = (java.lang.String) f281780r.get(java.lang.Long.valueOf(j17));
        }
        return (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || (y07 = w21.p0.Ai().y0(str)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y07.f68624xad49e234)) ? str2 : y07.f68624xad49e234;
    }

    public synchronized com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io t0(long j17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar;
        ioVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io) f281781s.get(java.lang.Long.valueOf(j17));
        if (ioVar == null) {
            ioVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.NoTransform;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "queryMsgTransformStatus[%s]:%s", java.lang.Long.valueOf(j17), ioVar.name());
        return ioVar;
    }

    public final synchronized void u0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        yb5.d dVar = this.f280113d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 q17 = dVar != null ? dVar.q() : null;
        if (q17 != null) {
            q17.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vm(this, i17, f9Var));
        }
    }

    public final synchronized void v0(long j17) {
        f281782t.remove(java.lang.Long.valueOf(j17));
    }

    public final synchronized void w0(long j17) {
        f281780r.remove(java.lang.Long.valueOf(j17));
        f281781s.remove(java.lang.Long.valueOf(j17));
    }

    public final void x0(int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5406xef2778d5 c5406xef2778d5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5406xef2778d5();
        am.c9 c9Var = c5406xef2778d5.f135753g;
        c9Var.getClass();
        c9Var.f87872a = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var);
        c9Var.f87873b = i17;
        c5406xef2778d5.e();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "[onChattingPause]");
        A0(3);
    }

    public final void y0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransformComponent", "scrollTo isAutoScroll:%s, pos:%s", java.lang.Boolean.valueOf(this.f281788g), java.lang.Integer.valueOf(i17));
        if (i17 != -1) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.um(this, i17), 200L);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        this.f281786e.mo48813x58998cd();
    }
}
