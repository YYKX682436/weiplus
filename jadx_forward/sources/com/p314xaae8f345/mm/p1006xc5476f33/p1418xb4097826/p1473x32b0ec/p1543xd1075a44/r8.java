package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class r8 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f201123a;

    /* renamed from: b, reason: collision with root package name */
    public final qo0.c f201124b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f201125c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f201126d;

    /* renamed from: e, reason: collision with root package name */
    public final int f201127e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8 f201128f;

    /* renamed from: g, reason: collision with root package name */
    public yi2.o0 f201129g;

    /* renamed from: h, reason: collision with root package name */
    public yi2.o0 f201130h;

    /* renamed from: i, reason: collision with root package name */
    public final yi2.o0 f201131i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q8 f201132j;

    /* renamed from: k, reason: collision with root package name */
    public final xi2.g f201133k;

    /* renamed from: l, reason: collision with root package name */
    public xi2.g f201134l;

    /* renamed from: m, reason: collision with root package name */
    public final lj2.d f201135m;

    /* renamed from: n, reason: collision with root package name */
    public ai2.a f201136n;

    /* renamed from: o, reason: collision with root package name */
    public int f201137o;

    public r8(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f201123a = root;
        this.f201124b = statusMonitor;
        this.f201125c = basePlugin;
        this.f201126d = "FinderLiveBattleManager";
        this.f201127e = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o8 o8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o8(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8 p8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8(this);
        this.f201128f = p8Var;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.ep9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f201131i = new yi2.f((android.view.ViewGroup) findViewById, p8Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q8 q8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q8(this);
        this.f201132j = q8Var;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.eou);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f201133k = new xi2.d((com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById2, q8Var);
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.eop);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f201135m = new lj2.d((android.view.ViewGroup) findViewById3, o8Var);
        this.f201137o = 0;
    }

    public final yi2.o0 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f201125c;
        xh2.b bVar = ((mm2.y2) lVar.P0(mm2.y2.class)).f411098r;
        java.lang.Integer valueOf = bVar != null ? java.lang.Integer.valueOf(bVar.f536058d) : null;
        dk2.u4 u4Var = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
        java.lang.Integer valueOf2 = u4Var != null ? java.lang.Integer.valueOf(u4Var.f315693g) : null;
        boolean g76 = ((mm2.e1) lVar.P0(mm2.e1.class)).g7();
        yi2.o0 o0Var = this.f201131i;
        if ((g76 && valueOf2 != null && valueOf2.intValue() == 1) || (valueOf != null && valueOf.intValue() == 4)) {
            ((yi2.p) o0Var).mo177186xcd1079b0(8);
            yi2.o0 g17 = g();
            if (g17 != null) {
                g17.mo177186xcd1079b0(8);
            }
            yi2.o0 f17 = f();
            return f17 == null ? o0Var : f17;
        }
        if ((((mm2.e1) lVar.P0(mm2.e1.class)).g7() && valueOf2 != null && valueOf2.intValue() == 2) || ((valueOf != null && valueOf.intValue() == 5) || (valueOf != null && valueOf.intValue() == 6))) {
            ((yi2.p) o0Var).mo177186xcd1079b0(8);
            yi2.o0 f18 = f();
            if (f18 != null) {
                f18.mo177186xcd1079b0(8);
            }
            yi2.o0 g18 = g();
            return g18 == null ? o0Var : g18;
        }
        yi2.o0 g19 = g();
        if (g19 != null) {
            g19.mo177186xcd1079b0(8);
        }
        yi2.o0 f19 = f();
        if (f19 != null) {
            f19.mo177186xcd1079b0(8);
        }
        return o0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2 != null ? r2.h() : null, r0) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ai2.a b() {
        /*
            r3 = this;
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r3.f201125c
            java.lang.Class<zi2.w> r1 = zi2.w.class
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r0.X0(r1)
            zi2.w r0 = (zi2.w) r0
            r1 = 0
            if (r0 == 0) goto L16
            fi2.m r0 = r0.x1()
            android.view.View r0 = r0.s()
            goto L17
        L16:
            r0 = r1
        L17:
            ai2.a r2 = r3.f201136n
            if (r2 == 0) goto L27
            if (r2 == 0) goto L21
            android.view.View r1 = r2.h()
        L21:
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r0)
            if (r1 != 0) goto L30
        L27:
            if (r0 == 0) goto L30
            lj2.b r1 = new lj2.b
            r1.<init>(r0)
            r3.f201136n = r1
        L30:
            ai2.a r0 = r3.f201136n
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r8.b():ai2.a");
    }

    public final xi2.g c() {
        xi2.g e17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f201125c;
        dk2.u4 u4Var = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
        boolean z17 = false;
        boolean z18 = u4Var != null && u4Var.k();
        xi2.g gVar = this.f201133k;
        if (!z18) {
            dk2.u4 u4Var2 = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
            if (u4Var2 != null && u4Var2.g()) {
                z17 = true;
            }
            if (!z17) {
                return (((mm2.o4) lVar.P0(mm2.o4.class)).f410857s.size() <= 1 || (e17 = e()) == null) ? gVar : e17;
            }
        }
        xi2.g e18 = e();
        return e18 == null ? gVar : e18;
    }

    public final java.util.ArrayList d() {
        ai2.a mo124427x4f7d778f;
        zi2.w wVar = (zi2.w) this.f201125c.X0(zi2.w.class);
        if (wVar == null) {
            return null;
        }
        fi2.a aVar = (fi2.a) wVar.x1();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.ViewGroup p17 = aVar.p();
        if (p17 == null) {
            return arrayList;
        }
        int childCount = p17.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.KeyEvent.Callback childAt = p17.getChildAt(i17);
            if ((childAt instanceof lj2.u0) && (mo124427x4f7d778f = ((lj2.u0) childAt).mo124427x4f7d778f()) != null) {
                arrayList.add(mo124427x4f7d778f);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2 != null ? r2.a() : null, r0) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xi2.g e() {
        /*
            r3 = this;
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r3.f201125c
            java.lang.Class<zi2.w> r1 = zi2.w.class
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r0.X0(r1)
            zi2.w r0 = (zi2.w) r0
            r1 = 0
            if (r0 == 0) goto L16
            fi2.m r0 = r0.x1()
            android.widget.ImageView r0 = r0.o()
            goto L17
        L16:
            r0 = r1
        L17:
            xi2.g r2 = r3.f201134l
            if (r2 == 0) goto L29
            if (r2 == 0) goto L22
            android.view.View r2 = r2.a()
            goto L23
        L22:
            r2 = r1
        L23:
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r0)
            if (r2 != 0) goto L38
        L29:
            if (r0 != 0) goto L2c
            goto L2d
        L2c:
            r1 = r0
        L2d:
            if (r1 == 0) goto L38
            xi2.k r0 = new xi2.k
            com.tencent.mm.plugin.finder.live.widget.q8 r2 = r3.f201132j
            r0.<init>(r1, r2)
            r3.f201134l = r0
        L38:
            xi2.g r0 = r3.f201134l
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r8.e():xi2.g");
    }

    public final yi2.o0 f() {
        zi2.w wVar = (zi2.w) this.f201125c.X0(zi2.w.class);
        android.view.View j17 = wVar != null ? wVar.x1().j() : null;
        yi2.o0 o0Var = this.f201129g;
        if (o0Var != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o0Var != null ? o0Var.f() : null, j17)) {
                return this.f201129g;
            }
        }
        if (j17 == null) {
            return null;
        }
        yi2.l0 l0Var = new yi2.l0(j17, this.f201128f);
        this.f201129g = l0Var;
        return l0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2 != null ? r2.f() : null, r0) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yi2.o0 g() {
        /*
            r3 = this;
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r3.f201125c
            java.lang.Class<zi2.w> r1 = zi2.w.class
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r0.X0(r1)
            zi2.w r0 = (zi2.w) r0
            r1 = 0
            if (r0 == 0) goto L16
            fi2.m r0 = r0.x1()
            android.view.View r0 = r0.v()
            goto L17
        L16:
            r0 = r1
        L17:
            yi2.o0 r2 = r3.f201130h
            if (r2 == 0) goto L27
            if (r2 == 0) goto L21
            android.view.View r1 = r2.f()
        L21:
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r0)
            if (r1 != 0) goto L32
        L27:
            if (r0 == 0) goto L32
            yi2.n0 r1 = new yi2.n0
            com.tencent.mm.plugin.finder.live.widget.p8 r2 = r3.f201128f
            r1.<init>(r0, r2)
            r3.f201130h = r1
        L32:
            yi2.o0 r0 = r3.f201130h
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r8.g():yi2.o0");
    }

    public final void h() {
        this.f201137o = 0;
        j();
        i();
        yi2.o0 f17 = f();
        if (f17 != null) {
            f17.mo177185x6761d4f();
        }
        yi2.o0 g17 = g();
        if (g17 != null) {
            g17.mo177185x6761d4f();
        }
        ((yi2.p) this.f201131i).mo177185x6761d4f();
        qo0.b bVar = qo0.b.W3;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_BATTLE_BAT_IS_SHOW", false);
        this.f201124b.mo46557x60d69242(bVar, bundle);
    }

    public final void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f201126d, "resetBattleEndWidget");
        lj2.d dVar = this.f201135m;
        if (dVar != null) {
            dVar.mo2073x6761d4f();
        }
        java.util.ArrayList<ai2.a> d17 = d();
        if (d17 != null) {
            for (ai2.a aVar : d17) {
                if (aVar != null) {
                    aVar.mo2073x6761d4f();
                }
            }
        }
        ai2.a b17 = b();
        if (b17 != null) {
            b17.mo2073x6761d4f();
        }
    }

    public final void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f201126d, "resetBattleStartWidget");
        ((xi2.d) this.f201133k).mo140756x6761d4f();
        xi2.g e17 = e();
        if (e17 != null) {
            e17.mo140756x6761d4f();
        }
    }

    public final void k(int i17) {
        xh2.b bVar = ((mm2.y2) this.f201125c.P0(mm2.y2.class)).f411098r;
        boolean z17 = bVar != null && bVar.f536058d == 4;
        yi2.o0 o0Var = this.f201131i;
        if (!z17) {
            if (o0Var != null) {
                ((yi2.p) o0Var).mo177186xcd1079b0(i17);
            }
        } else {
            yi2.o0 f17 = f();
            if (f17 != null) {
                f17.mo177186xcd1079b0(0);
            }
            if (o0Var != null) {
                ((yi2.p) o0Var).mo177186xcd1079b0(8);
            }
        }
    }

    public final void l() {
        dk2.u4 u4Var = ((mm2.o4) this.f201125c.P0(mm2.o4.class)).Z;
        java.lang.Integer valueOf = u4Var != null ? java.lang.Integer.valueOf(u4Var.f315691e) : null;
        if (valueOf != null && valueOf.intValue() == 6) {
            i();
            j();
        }
        a().d();
    }
}
