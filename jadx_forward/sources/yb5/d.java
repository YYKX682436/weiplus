package yb5;

/* loaded from: classes9.dex */
public final class d implements yn.f {
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 A = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f542239a = new yb5.o();

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o3 f542240b = new yb5.p();

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c f542241c = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c(this);

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.e f542242d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.e(this);

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g7 f542243e = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g7();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f542244f;

    /* renamed from: g, reason: collision with root package name */
    public final yb5.t f542245g;

    /* renamed from: h, reason: collision with root package name */
    public final yb5.k f542246h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f542247i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f542248j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f542249k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b f542250l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.fb f542251m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.gb f542252n;

    /* renamed from: o, reason: collision with root package name */
    public int f542253o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f542254p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f542255q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f542256r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f542257s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f542258t;

    /* renamed from: u, reason: collision with root package name */
    public final yb5.l f542259u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f542260v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f542261w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f542262x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f542263y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f542264z;

    public d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b, com.p314xaae8f345.mm.ui.p2650x55bb7a46.fb fbVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.gb gbVar) {
        boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C19999x68f1fd1b()) == 1;
        this.f542244f = z17;
        this.f542245g = z17 ? yb5.f.f542266a : yb5.s.f542280a;
        this.f542246h = new yb5.k(this);
        this.f542247i = false;
        this.f542254p = false;
        this.f542257s = true;
        this.f542258t = false;
        this.f542259u = new yb5.l();
        this.f542260v = true;
        this.f542261w = false;
        this.f542262x = false;
        this.f542263y = false;
        this.f542264z = new java.util.concurrent.ConcurrentLinkedQueue();
        new yb5.c(this);
        this.f542250l = abstractC21611x7536149b;
        this.f542251m = fbVar;
        this.f542252n = gbVar;
    }

    public boolean A() {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(x());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if ((r0 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3 ? ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3) r0).mo75810x40f608c() : false) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean B() {
        /*
            r4 = this;
            int r0 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19741x32830a33.f272969i
            com.tencent.mm.ui.chatting.fb r0 = r4.f542251m
            com.tencent.mm.ui.chatting.ChattingUIFragment r0 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) r0
            com.tencent.mm.pluginsdk.ui.tools.v3 r0 = r0.f279802t
            r1 = 0
            if (r0 != 0) goto Lc
            goto L3c
        Lc:
            int r2 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f7.a(r0)
            r3 = 1
            if (r2 != 0) goto L15
            r2 = r3
            goto L16
        L15:
            r2 = r1
        L16:
            if (r2 == 0) goto L23
            boolean r2 = r0 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3
            if (r2 == 0) goto L32
            r2 = r0
            com.tencent.mm.pluginsdk.ui.tools.z3 r2 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3) r2
            r2.mo75814x9b3ae298(r1)
            goto L32
        L23:
            boolean r2 = r0 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3
            if (r2 == 0) goto L2f
            r2 = r0
            com.tencent.mm.pluginsdk.ui.tools.z3 r2 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3) r2
            boolean r2 = r2.getF272970e()
            goto L30
        L2f:
            r2 = r1
        L30:
            if (r2 != 0) goto L33
        L32:
            r1 = r3
        L33:
            boolean r2 = r0 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3
            if (r2 == 0) goto L3c
            com.tencent.mm.pluginsdk.ui.tools.z3 r0 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z3) r0
            r0.getF272970e()
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yb5.d.B():boolean");
    }

    public boolean C() {
        java.lang.String x17 = x();
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(x17) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(x17);
    }

    public boolean D() {
        this.f542245g.a("isGroupChat");
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(x()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(x()) || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f542241c.a(sb5.f.class))).f280287s;
    }

    public boolean E() {
        return ((java.lang.Boolean) ((jz5.n) this.f542246h.f542272c).mo141623x754a37bb()).booleanValue();
    }

    public boolean F() {
        return !(u().k2() || com.p314xaae8f345.mm.p2621x8fb0427b.z3.y4(x()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(x())) || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f542241c.a(sb5.f.class))).f280286r;
    }

    public boolean G() {
        java.lang.String x17 = x();
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(x17) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(x17) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(x17) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.e4(x17);
    }

    public boolean H() {
        if (!this.f542250l.m78383x21a1233e("Chat_Readonly", false).booleanValue()) {
            java.lang.String x17 = x();
            if ((android.text.TextUtils.isEmpty(x17) || x17.contains(",")) ? false : true) {
                return false;
            }
        }
        return true;
    }

    public boolean I() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[isShowDialog]");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f542251m).f279803u;
        return u3Var != null && u3Var.isShowing();
    }

    public void J() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[notifyDataSetChange]");
        sb5.z zVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f542251m).f279801s;
        if (zVar == null) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).h(null);
    }

    public void K() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[scrollToLast]0");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f542251m;
        c21628xcedb13ea.getClass();
        c21628xcedb13ea.f1(false, android.os.Looper.myLooper() != android.os.Looper.getMainLooper(), true);
    }

    public void L(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[scrollToLast]1 force:%b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f542251m;
        c21628xcedb13ea.getClass();
        c21628xcedb13ea.f1(z17, android.os.Looper.myLooper() != android.os.Looper.getMainLooper(), true);
    }

    public void M(boolean z17, boolean z18, boolean z19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[scrollToLast]3 force:%b", java.lang.Boolean.valueOf(z17));
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f542251m).f1(z17, z18, z19);
    }

    public void N(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[scrollToLastImmediately]");
        M(z17, android.os.Looper.getMainLooper() != android.os.Looper.myLooper(), false);
    }

    public void O(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[scrollToPosition] position:%d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f542251m;
        yb5.d dVar = c21628xcedb13ea.f279685f;
        (dVar.f542244f ? dVar.f542240b : A).mo50300x3fa464aa(c21628xcedb13ea.f279808z);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "[scrollToPosition] scroll to pos:%d", java.lang.Integer.valueOf(i17));
        c21628xcedb13ea.B.m79872xcc101dd9().mo75774x42b5b70c(i17 + c21628xcedb13ea.f279802t.mo75761x118cb524(), 0, 0);
    }

    public void P(boolean z17) {
        ke5.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "trace setFocused, isFocused %s, isSwitchMenu %s, needUpdateUI %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f542262x), java.lang.Boolean.valueOf(this.f542261w));
        if (this.f542262x) {
            return;
        }
        this.f542260v = z17;
        if (z17 && this.f542261w) {
            this.f542261w = false;
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f542264z;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.fb fbVar = this.f542251m;
            if (fbVar != null) {
                java.util.LinkedList<hd5.n> linkedList = new java.util.LinkedList();
                java.util.Iterator it = concurrentLinkedQueue.iterator();
                hd5.n nVar = null;
                while (it.hasNext()) {
                    hd5.n nVar2 = (hd5.n) it.next();
                    if (nVar2 != nVar) {
                        linkedList.add(nVar2);
                        nVar = nVar2;
                    }
                }
                for (hd5.n nVar3 : linkedList) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[setFocused] replay action=%s", nVar3);
                    sb5.z zVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) fbVar).f279801s;
                    if (zVar != null && (f0Var = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).Z) != null) {
                        f0Var.b(nVar3, false);
                    }
                }
            }
            concurrentLinkedQueue.clear();
        }
    }

    public void Q(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[setKeepScreenOn] force:%b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 v3Var = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f542251m).f279802t;
        if (v3Var != null) {
            v3Var.m75902xb6f22792(z17);
        }
    }

    public void R(int i17) {
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f542251m).f279802t.setVisibility(i17);
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() == 2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[setListViewVisibility] visibility:");
            sb6.append(i17);
            sb6.append(" stack:");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", sb6.toString());
        }
    }

    public void S(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.String str) {
        this.f542239a.mo50302x6b17ad39(null);
        this.f542248j = z3Var;
        if (str != null && !str.isEmpty()) {
            java.lang.String d17 = z3Var.d1();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "Override session id %s %s, %s", d17, str, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            this.f542255q = str;
            return;
        }
        java.lang.String a17 = com.p314xaae8f345.mm.ui.l2.a(z3Var.d1());
        java.lang.String d18 = z3Var.d1();
        java.lang.String str2 = this.f542255q;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "Generate session id %s %s -> %s, %s", d18, str2, a17, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        this.f542255q = a17;
    }

    public void T(int i17, boolean z17, boolean z18, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[setSelection] pos:%s isSmooth:%s isIdleVisible:%s topOffset:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f542251m;
        yb5.d dVar = c21628xcedb13ea.f279685f;
        (dVar.f542244f ? dVar.f542240b : A).mo50300x3fa464aa(c21628xcedb13ea.f279808z);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "[setSelection] pos:%d isSmooth:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        c21628xcedb13ea.f279802t.f().setTag(com.p314xaae8f345.mm.R.id.bke, java.lang.Boolean.FALSE);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 v3Var = c21628xcedb13ea.f279802t;
        if (v3Var == null) {
            return;
        }
        if ((v3Var.mo75757x2ce24761() < i17 && i17 < v3Var.mo75762xe81a1f0f()) && z18) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ScrollController", "setSelection position %s smooth %s topOffset:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
        v3Var.mo75768x7ca79b52(i17, true);
        if (!z17 || com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f7.c(v3Var, i17)) {
            v3Var.mo75771x46dba6a1(i17, i18);
        } else {
            v3Var.mo75774x42b5b70c(i17, i18, 200);
        }
    }

    public void U(int i17, int i18, boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[setSelectionFromTop] pos:%s offset:%s isSmooth:%s isIdleVisible:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f542251m;
        yb5.d dVar = c21628xcedb13ea.f279685f;
        (dVar.f542244f ? dVar.f542240b : A).mo50300x3fa464aa(c21628xcedb13ea.f279808z);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "[setSelectionFromTop] pos:%d offset:%s isSmooth:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
        if (!dVar.f542254p) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f7.b(c21628xcedb13ea.f279802t, i17, i18, z17, z18);
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 v3Var = c21628xcedb13ea.f279802t;
        if (v3Var == null) {
            return;
        }
        if (v3Var.mo75757x2ce24761() < i17 && i17 < v3Var.mo75762xe81a1f0f()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ScrollController", "setSelectionFromToInnerSearch position %s smooth %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
        v3Var.mo75768x7ca79b52(i17, true);
        if (!fp.h.b(11) || com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f7.c(v3Var, i17)) {
            v3Var.mo75771x46dba6a1(i17, i18);
        } else {
            v3Var.mo75774x42b5b70c(i17, i18, 200);
        }
    }

    public void V(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "trace setSwitchMenu, isSwitchMenu %s", java.lang.Boolean.valueOf(z17));
        this.f542262x = z17;
    }

    public void W(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[showDialog]");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f542251m;
        c21628xcedb13ea.a1();
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        c21628xcedb13ea.f279803u = db5.e1.Q(context, str, str2, z17, z18, onCancelListener);
    }

    public void X(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[showOptionMenu] menuID:%d show:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        this.f542251m.m79562xb0dfae51(i17, z17);
    }

    public void Y(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[showOptionMenu] show:%s", java.lang.Boolean.valueOf(z17));
        this.f542251m.m79563xb0dfae51(z17);
    }

    public void Z(int i17, int i18, java.lang.String content, long j17) {
        yj5.a aVar;
        java.util.Iterator it = ((vb5.l) ((vb5.m) this.f542241c.a(vb5.m.class))).f516392h.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            } else {
                aVar = (yj5.a) it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.getClass(), yj5.a0.class)) {
                    break;
                }
            }
        }
        yj5.a0 a0Var = (yj5.a0) aVar;
        a0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        a0Var.f544237f = new xj5.l(i17, i18, content, c01.id.c() + j17);
        a0Var.o0();
    }

    public yn.e a(java.lang.Class cls) {
        return this.f542241c.a(cls);
    }

    public void a0(android.content.Intent intent) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f542250l;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(abstractC21611x7536149b, arrayList.toArray(), "com/tencent/mm/ui/chatting/context/ChattingContext", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        abstractC21611x7536149b.mo7585xa4df9991((android.content.Intent) arrayList.get(0));
        yj0.a.f(abstractC21611x7536149b, "com/tencent/mm/ui/chatting/context/ChattingContext", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[dismissDialog]");
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f542251m).a1();
    }

    public void b0() {
        this.f542245g.b();
    }

    public android.view.View c(int i17) {
        return this.f542250l.mo26077x4ff8c0f0(i17);
    }

    public boolean d() {
        return this.f542250l.W0();
    }

    public com.p314xaae8f345.mm.ui.ga e() {
        return this.f542250l.m78647x143f1b92();
    }

    public android.view.View f(int i17) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b) this.f542251m).C0().m75885x6a486239(i17);
    }

    public android.app.Activity g() {
        return this.f542250l.mo7438x76847179();
    }

    public ke5.f0 h() {
        return this.f542250l.B0();
    }

    public com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a i() {
        return ((sb5.f0) this.f542241c.a(sb5.f0.class)).A();
    }

    public int j() {
        return this.f542251m.mo79389x2ce24761();
    }

    public int k() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f542250l;
        int m78386x9c19e6d7 = abstractC21611x7536149b.m78386x9c19e6d7("chat_from_scene", 0);
        if (m78386x9c19e6d7 != 0) {
            return m78386x9c19e6d7;
        }
        int m78386x9c19e6d72 = abstractC21611x7536149b.m78386x9c19e6d7("specific_chat_from_scene", 0);
        if (m78386x9c19e6d72 == 7) {
            return 13;
        }
        return m78386x9c19e6d72;
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.db l() {
        if (g() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a) {
            return (com.p314xaae8f345.mm.ui.p2650x55bb7a46.db) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.q8) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a) g()).f279795s).get();
        }
        return null;
    }

    public int m() {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b) this.f542251m).C0().mo75761x118cb524();
    }

    public android.content.Intent n() {
        return this.f542250l.m78387x1e885992();
    }

    public int o() {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b) this.f542251m).C0().mo75762xe81a1f0f();
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 p() {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f542251m).f279802t;
    }

    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 q() {
        return this.f542244f ? this.f542239a : A;
    }

    public java.lang.String r() {
        java.lang.String str = this.f542256r;
        return str != null ? str : "";
    }

    public android.content.res.Resources s() {
        return this.f542250l.m78652xba8c474f();
    }

    public java.lang.String t() {
        if (this.f542249k == null) {
            this.f542249k = c01.z1.r();
            this.f542249k = com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(x()) ? com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y4(this.f542249k) : this.f542249k;
        }
        return this.f542249k;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 u() {
        this.f542245g.a("getTalker");
        return this.f542248j;
    }

    public yb5.q v() {
        return new yb5.q(x(), w(), u(), D(), A());
    }

    public java.lang.String w() {
        this.f542245g.a("getTalkerNickName");
        java.lang.String E0 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f542241c.a(sb5.f.class))).E0();
        java.lang.String P0 = u().P0();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return E0 == null ? P0 : E0;
    }

    public java.lang.String x() {
        if (u() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingContext", "getTalker returns null.");
            return "";
        }
        java.lang.String d17 = u().d1();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return d17 == null ? "" : d17;
    }

    public void y() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[hideVKB]");
        this.f542251m.mo78661x36654fab();
    }

    public void z(java.lang.Class cls, yn.e eVar) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = this.f542241c;
        if (cVar.f283495a.put(cls, eVar) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingComponentManager", "[register] %s has register", cls);
        }
        boolean z17 = eVar instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg;
        yb5.d dVar = cVar.f283496b;
        if (z17) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg) eVar).L(dVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingComponentManager", "[install] listener:%s cost:%sms", eVar.getClass().getName(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            return;
        }
        if (eVar instanceof yn.m) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            ((yn.m) eVar).n(dVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingComponentManager", "[install] outlistener:%s cost:%sms", eVar.getClass().getName(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
        }
    }
}
