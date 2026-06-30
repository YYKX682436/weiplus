package fi2;

/* loaded from: classes10.dex */
public final class e0 implements ah2.f {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f344349a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y20 f344350b;

    /* renamed from: c, reason: collision with root package name */
    public final lj2.v0 f344351c;

    /* renamed from: d, reason: collision with root package name */
    public final lj2.x0 f344352d;

    /* renamed from: e, reason: collision with root package name */
    public final int f344353e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f344354f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f344355g;

    /* renamed from: h, reason: collision with root package name */
    public mh2.k0 f344356h;

    /* renamed from: i, reason: collision with root package name */
    public mh2.k f344357i;

    /* renamed from: j, reason: collision with root package name */
    public mh2.u1 f344358j;

    /* renamed from: k, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f344359k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f344360l;

    /* renamed from: m, reason: collision with root package name */
    public final ah2.a f344361m;

    public e0(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y20 y20Var, lj2.v0 pluginAbility, lj2.x0 service, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f344349a = context;
        this.f344350b = y20Var;
        this.f344351c = pluginAbility;
        this.f344352d = service;
        this.f344353e = i17;
        this.f344354f = "KTVFeedContentServiceCore_" + hashCode();
        this.f344355g = jz5.h.b(new fi2.c0(this));
        this.f344360l = jz5.h.b(new fi2.d0(this));
        this.f344361m = new fi2.b0(this);
    }

    @Override // ah2.f
    public p3325xe03a0797.p3326xc267989b.y0 a() {
        p3325xe03a0797.p3326xc267989b.y0 a17 = this.f344352d.a();
        return a17 == null ? p3325xe03a0797.p3326xc267989b.z0.b() : a17;
    }

    @Override // ah2.f
    public void b(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f344351c.a0().b(callback);
    }

    @Override // ah2.f
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ag agVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y20 y20Var = this.f344350b;
        if (y20Var == null || (agVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.df) y20Var).f188091a.f188736q) == null) {
            return null;
        }
        return agVar.f187823h;
    }

    @Override // ah2.f
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ag agVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y20 y20Var = this.f344350b;
        if (y20Var == null || (agVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.df) y20Var).f188091a.f188736q) == null) {
            return null;
        }
        return agVar.f187821f;
    }

    @Override // ah2.f
    public mh2.n0 f() {
        return (mh2.n0) ((jz5.n) this.f344355g).mo141623x754a37bb();
    }

    @Override // ah2.f
    public void g() {
    }

    @Override // ah2.f
    public boolean h() {
        return true;
    }

    @Override // ah2.f
    public void i() {
    }

    @Override // ah2.f
    public void j(fn2.u1 sourceScene, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceScene, "sourceScene");
    }

    @Override // ah2.f
    public boolean k() {
        return false;
    }

    @Override // ah2.f
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j l() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (((p3325xe03a0797.p3326xc267989b.a) r0).a() == true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r9 = this;
            mh2.k r0 = r9.f344357i
            if (r0 == 0) goto L7
            r0.c()
        L7:
            mh2.k0 r0 = r9.f344356h
            if (r0 == 0) goto Le
            r0.g()
        Le:
            int r0 = r9.f344353e
            r1 = 3
            if (r0 == r1) goto L14
            goto L5d
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "collectKTVOutPreviewData isActive: "
            r0.<init>(r1)
            kotlinx.coroutines.r2 r1 = r9.f344359k
            r2 = 0
            if (r1 == 0) goto L2b
            kotlinx.coroutines.a r1 = (p3325xe03a0797.p3326xc267989b.a) r1
            boolean r1 = r1.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L2c
        L2b:
            r1 = r2
        L2c:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r9.f344354f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            kotlinx.coroutines.r2 r0 = r9.f344359k
            if (r0 == 0) goto L46
            kotlinx.coroutines.a r0 = (p3325xe03a0797.p3326xc267989b.a) r0
            boolean r0 = r0.a()
            r1 = 1
            if (r0 != r1) goto L46
            goto L47
        L46:
            r1 = 0
        L47:
            if (r1 == 0) goto L4a
            goto L5d
        L4a:
            kotlinx.coroutines.y0 r3 = r9.a()
            r4 = 0
            r5 = 0
            fi2.y r6 = new fi2.y
            r6.<init>(r9, r2)
            r7 = 3
            r8 = 0
            kotlinx.coroutines.r2 r0 = p3325xe03a0797.p3326xc267989b.l.d(r3, r4, r5, r6, r7, r8)
            r9.f344359k = r0
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fi2.e0.m():void");
    }

    public final void n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 voiceRoomLayout) {
        android.view.ViewParent viewParent;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceRoomLayout, "voiceRoomLayout");
        mh2.k kVar = this.f344357i;
        android.view.ViewParent parent = kVar != null ? kVar.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f344357i);
        }
        mh2.k0 k0Var = this.f344356h;
        android.view.ViewParent parent2 = k0Var != null ? k0Var.getParent() : null;
        android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f344356h);
        }
        mh2.u1 u1Var = this.f344358j;
        if (u1Var != null) {
            android.view.View view2 = u1Var.f407825b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
            viewParent = view2.getParent();
        } else {
            viewParent = null;
        }
        android.view.ViewGroup viewGroup3 = viewParent instanceof android.view.ViewGroup ? (android.view.ViewGroup) viewParent : null;
        if (viewGroup3 != null) {
            mh2.u1 u1Var2 = this.f344358j;
            if (u1Var2 != null) {
                view = u1Var2.f407825b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            } else {
                view = null;
            }
            viewGroup3.removeView(view);
        }
        jz5.g gVar = this.f344360l;
        android.view.ViewParent parent3 = ((fg2.n0) ((jz5.n) gVar).mo141623x754a37bb()).f343693a.getParent();
        android.view.ViewGroup viewGroup4 = parent3 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent3 : null;
        if (viewGroup4 != null) {
            viewGroup4.removeView(((fg2.n0) ((jz5.n) gVar).mo141623x754a37bb()).f343693a);
        }
        lj2.v0 v0Var = this.f344351c;
        int i17 = this.f344353e;
        if (i17 != 3) {
            mh2.k kVar2 = this.f344357i;
            android.content.Context context = this.f344349a;
            if (kVar2 == null) {
                this.f344357i = new mh2.k(context, this, this.f344361m);
            }
            voiceRoomLayout.getCoverBackgroundLayout().addView(this.f344357i, new android.view.ViewGroup.LayoutParams(-1, -1));
            if (this.f344356h == null) {
                this.f344356h = new mh2.k0(context, this, v0Var, i17 == 4);
            }
            voiceRoomLayout.getSingContentLayout().addView(this.f344356h, new android.view.ViewGroup.LayoutParams(-1, -1));
        } else if (this.f344358j == null) {
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            this.f344358j = new mh2.u1(context2, new fi2.a0(this), false);
        }
        voiceRoomLayout.getSongListLayout().addView(((fg2.n0) ((jz5.n) gVar).mo141623x754a37bb()).f343693a, new android.view.ViewGroup.LayoutParams(-2, -2));
        if (v0Var.f() == lj2.w0.f400492e) {
            voiceRoomLayout.getContentScrollWrapperLayout().setVisibility(8);
        }
    }

    public final void o() {
        ((mh2.n0) ((jz5.n) this.f344355g).mo141623x754a37bb()).removeAllViews();
        mh2.k0 k0Var = this.f344356h;
        if (k0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f407919g, "reset");
            p3325xe03a0797.p3326xc267989b.r2 r2Var = k0Var.f407926q;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = k0Var.f407927r;
            if (r2Var2 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var3 = k0Var.f407928s;
            if (r2Var3 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var3, null, 1, null);
            }
            mh2.a aVar = k0Var.f407925p;
            if (aVar != null) {
                android.view.View view = aVar.f407825b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                k0Var.removeView(view);
            }
            k0Var.f407925p = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f344354f, "cancelKTVOutPreviewDataCollect job:" + this.f344359k);
        p3325xe03a0797.p3326xc267989b.r2 r2Var4 = this.f344359k;
        if (r2Var4 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var4, null, 1, null);
        }
    }
}
