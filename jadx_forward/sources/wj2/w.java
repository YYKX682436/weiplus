package wj2;

/* loaded from: classes10.dex */
public abstract class w extends lj2.j implements db5.t4, lj2.u0 {
    public final android.os.Handler A;
    public java.lang.Runnable B;
    public int C;
    public int D;
    public int E;
    public final jz5.g F;
    public final java.util.HashMap G;
    public android.view.View H;
    public boolean I;

    /* renamed from: i, reason: collision with root package name */
    public final lj2.v0 f528252i;

    /* renamed from: m, reason: collision with root package name */
    public final lj2.x0 f528253m;

    /* renamed from: n, reason: collision with root package name */
    public final int f528254n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f528255o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f528256p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f528257q;

    /* renamed from: r, reason: collision with root package name */
    public int f528258r;

    /* renamed from: s, reason: collision with root package name */
    public final wj2.k0 f528259s;

    /* renamed from: t, reason: collision with root package name */
    public final long f528260t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f528261u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.MotionEvent f528262v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.MotionEvent f528263w;

    /* renamed from: x, reason: collision with root package name */
    public int f528264x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f528265y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Runnable f528266z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service, int i17) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f528252i = pluginAbility;
        this.f528253m = service;
        this.f528254n = i17;
        this.f528258r = 1;
        this.f528260t = 300L;
        this.f528266z = new wj2.r(this);
        this.A = new android.os.Handler(android.os.Looper.getMainLooper());
        this.C = 3;
        this.F = jz5.h.b(new wj2.i(this));
        this.G = new java.util.HashMap();
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14042xca648648) {
            wj2.k0 k0Var = new wj2.k0();
            this.f528259s = k0Var;
            k0Var.b(this);
        }
    }

    public static void Q(wj2.w wVar, android.view.View view, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTouchDelegateGroup");
        }
        if ((i18 & 2) != 0) {
            i17 = -1;
        }
        wVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (i17 < 0) {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view2 = wVar.H;
        if (view2 != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i19 = iArr[0];
            int i27 = iArr[1];
            int[] iArr2 = new int[2];
            view2.getLocationOnScreen(iArr2);
            int i28 = iArr2[0];
            int i29 = iArr2[1];
            int i37 = i19 - i28;
            rect.left = i37;
            rect.top = i27 - i29;
            rect.right = i37 + view.getWidth();
            rect.bottom = rect.top + view.getHeight();
        }
        if (rect.width() == 0 || rect.height() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(wVar.m145853xb5886c64(), "setTouchDelegateGroup rect is empty");
            return;
        }
        int i38 = -i17;
        rect.inset(i38, i38);
        long hashCode = view.hashCode();
        java.util.HashMap hashMap = wVar.G;
        com.p314xaae8f345.mm.ui.yj yjVar = (com.p314xaae8f345.mm.ui.yj) hashMap.get(java.lang.Long.valueOf(hashCode));
        com.p314xaae8f345.mm.ui.xj m174006x3edd5b12 = wVar.m174006x3edd5b12();
        java.util.ArrayList arrayList = m174006x3edd5b12.f294099a;
        if (arrayList != null) {
            arrayList.remove(yjVar);
            if (m174006x3edd5b12.f294099a.isEmpty()) {
                m174006x3edd5b12.f294099a = null;
            }
        }
        com.p314xaae8f345.mm.ui.yj yjVar2 = new com.p314xaae8f345.mm.ui.yj(rect, view);
        hashMap.put(java.lang.Long.valueOf(hashCode), yjVar2);
        wVar.m174006x3edd5b12().a(yjVar2);
    }

    public static /* synthetic */ void U(wj2.w wVar, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showOptionBottomSheet");
        }
        if ((i18 & 1) != 0) {
            i17 = 1;
        }
        wVar.T(i17);
    }

    /* renamed from: getMTouchDelegateGroup */
    private final com.p314xaae8f345.mm.ui.xj m174006x3edd5b12() {
        return (com.p314xaae8f345.mm.ui.xj) ((jz5.n) this.F).mo141623x754a37bb();
    }

    public static final void v(wj2.w wVar) {
        android.view.MotionEvent motionEvent = wVar.f528262v;
        if (motionEvent != null) {
            super.dispatchTouchEvent(motionEvent);
        }
        android.view.MotionEvent motionEvent2 = wVar.f528263w;
        if (motionEvent2 != null) {
            super.dispatchTouchEvent(motionEvent2);
        }
    }

    public static final void w(wj2.w wVar) {
        wVar.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        km2.q m145849x949ba2a5 = wVar.m145849x949ba2a5();
        bundle.putString("PARAM_FINDER_LIVE_MIC_ID", m145849x949ba2a5 != null ? m145849x949ba2a5.f390708f : null);
        qo0.c q17 = wVar.f528252i.q();
        if (q17 != null) {
            q17.mo46557x60d69242(qo0.b.M3, bundle);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r3 != null ? r3.f390703a : null) && r0.a0().H()) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A() {
        /*
            r7 = this;
            ae2.in r0 = ae2.in.f85221a
            jz5.g r0 = ae2.in.X2
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            lb2.j r0 = (lb2.j) r0
            java.lang.Object r0 = r0.r()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != 0) goto L1a
            return r1
        L1a:
            lj2.v0 r0 = r7.f528252i
            lj2.t0 r2 = r0.a0()
            boolean r3 = r2.c()
            r4 = 0
            if (r3 == 0) goto L2f
            boolean r2 = r2.Q()
            if (r2 == 0) goto L2f
            r2 = r1
            goto L30
        L2f:
            r2 = r4
        L30:
            java.lang.String r3 = r7.m145853xb5886c64()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "isEnableMicMemberPanelClick enableMicPanelOpen: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r5)
            if (r2 != 0) goto L8d
            lj2.t0 r2 = r0.a0()
            java.lang.String r2 = r2.p()
            km2.q r3 = r7.m145849x949ba2a5()
            r5 = 0
            if (r3 == 0) goto L59
            java.lang.String r3 = r3.f390703a
            goto L5a
        L59:
            r3 = r5
        L5a:
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r3)
            if (r2 != 0) goto L85
            lj2.t0 r2 = r0.a0()
            java.lang.String r2 = r2.p()
            km2.q r3 = r7.m145849x949ba2a5()
            if (r3 == 0) goto L70
            java.lang.String r5 = r3.f390703a
        L70:
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r5)
            if (r2 == 0) goto L82
            lj2.t0 r0 = r0.a0()
            boolean r0 = r0.H()
            if (r0 == 0) goto L82
            r0 = r1
            goto L83
        L82:
            r0 = r4
        L83:
            if (r0 == 0) goto L8c
        L85:
            boolean r0 = r7.G()
            if (r0 == 0) goto L8c
            goto L8d
        L8c:
            r1 = r4
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.w.A():boolean");
    }

    public final boolean B() {
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        return pm0.v.z(m145849x949ba2a5 != null ? m145849x949ba2a5.f390724v : 0, 16);
    }

    public boolean C() {
        return this instanceof sj2.l;
    }

    public final boolean D() {
        kn0.p pVar;
        tn0.w0 h17 = this.f528252i.h();
        return (h17 == null || (pVar = h17.D) == null || !pVar.f391122i) ? false : true;
    }

    public final boolean E() {
        lj2.v0 v0Var = this.f528252i;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v0Var.a0().p(), v0Var.a0().s());
    }

    public final boolean F() {
        return (E() || this.f528252i.a0().H()) ? false : true;
    }

    public final boolean G() {
        java.lang.String s17 = this.f528252i.a0().s();
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s17, m145849x949ba2a5 != null ? m145849x949ba2a5.f390703a : null);
    }

    public final void H() {
        pf5.u uVar = pf5.u.f435469a;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (((pl2.x) uVar.b(context).a(pl2.x.class)).f438216f) {
            android.content.Context context2 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            ((pl2.x) uVar.b(context2).a(pl2.x.class)).f438220m.f438211h = 3;
            android.content.Context context3 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            pl2.s sVar = ((pl2.x) uVar.b(context3).a(pl2.x.class)).f438217g;
            if (sVar != null) {
                pl2.s.e(sVar, 0L, null, 3, null);
                return;
            }
            return;
        }
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        if (m145849x949ba2a5 == null || !A()) {
            return;
        }
        if (F()) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f408759e3;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 2);
            jSONObject.put("element", 1);
            ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
        this.f528253m.X(m145849x949ba2a5);
    }

    public void I(boolean z17) {
    }

    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J() {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.w.J():void");
    }

    public void K() {
        lj2.v0 v0Var = this.f528252i;
        v0Var.a0().N(!v0Var.a0().F());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_MUTE_MIC", v0Var.a0().F());
        qo0.c q17 = v0Var.q();
        if (q17 != null) {
            q17.mo46557x60d69242(qo0.b.f446934p4, bundle);
        }
        if (v0Var.a0().F()) {
            db5.t7.i(getContext(), getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572993d52), com.p314xaae8f345.mm.R.raw.f79803x14181d5f);
            ml2.n4 n4Var = ml2.n4.f409287u;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 18");
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
        } else {
            db5.t7.i(getContext(), getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4e), com.p314xaae8f345.mm.R.raw.f79805xc851170e);
            ml2.n4 n4Var2 = ml2.n4.f409290x;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 21");
            i95.m c18 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.r0.ik((ml2.r0) c18, n4Var2, null, 0, 6, null);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f528256p;
        if (k0Var != null) {
            k0Var.u();
        }
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        if (m145849x949ba2a5 != null) {
            f(m145849x949ba2a5.f390716n, m145849x949ba2a5.f390724v, false);
        }
    }

    public final void L() {
        if (zl2.r4.f555483a.w1()) {
            P();
        } else if (B() && G()) {
            db5.t7.i(getContext(), getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dvk), com.p314xaae8f345.mm.R.raw.f79803x14181d5f);
        }
    }

    public final void M() {
        this.D++;
        if (this.B != null) {
            return;
        }
        wj2.s sVar = new wj2.s(this);
        this.B = sVar;
        this.A.post(sVar);
    }

    public final void N(android.view.MotionEvent motionEvent) {
        int i17 = no0.i.f420260a;
        int i18 = no0.i.f420260a;
        android.os.Bundle bundle = new android.os.Bundle();
        int i19 = i18 / 2;
        bundle.putInt("PARAM_LIVE_LIKE_CONFETTI_X", ((int) motionEvent.getRawX()) - i19);
        bundle.putInt("PARAM_LIVE_LIKE_CONFETTI_Y", ((int) motionEvent.getRawY()) - i19);
        qo0.c q17 = this.f528252i.q();
        if (q17 != null) {
            q17.mo46557x60d69242(qo0.b.A3, bundle);
        }
    }

    public final void O() {
        android.view.MotionEvent motionEvent = this.f528262v;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.f528262v = null;
        android.view.MotionEvent motionEvent2 = this.f528263w;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f528263w = null;
    }

    public void P() {
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        if (m145849x949ba2a5 != null) {
            km2.q m145849x949ba2a52 = m145849x949ba2a5();
            int i17 = m145849x949ba2a52 != null ? m145849x949ba2a52.f390724v : 0;
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            m145849x949ba2a5.f390724v = i17 & (-17);
        }
        db5.t7.i(getContext(), getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4e), com.p314xaae8f345.mm.R.raw.f79805xc851170e);
        ml2.q2 q2Var = ml2.q2.f409367u;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "report21054 op: 22 ");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var, "", -1, -1);
    }

    public void R() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        if (r2.a0().g().size() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0105, code lost:
    
        if ((r1 == null || r26.n0.N(r1)) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0114, code lost:
    
        if ((r1 != null || r26.n0.N(r1)) != false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0098  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S(android.widget.TextView r27) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.w.S(android.widget.TextView):void");
    }

    public void T(int i17) {
        lj2.v0 v0Var = this.f528252i;
        if (v0Var.k0()) {
            df2.t2 t2Var = (df2.t2) v0Var.o(df2.t2.class);
            if (t2Var != null) {
                t2Var.a7(true);
                return;
            }
            return;
        }
        boolean z17 = false;
        if (this.f528256p == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(getContext(), 0, true);
            k0Var.U1 = true;
            k0Var.V1 = true;
            this.f528256p = k0Var;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.f528256p;
        if (k0Var2 != null) {
            k0Var2.f293405n = new wj2.g(this);
        }
        if (k0Var2 != null) {
            k0Var2.f293414s = this;
        }
        int I = v0Var.a0().I();
        int k17 = v0Var.a0().k();
        if (I == 2 && k17 == 8) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = this.f528256p;
            if (k0Var3 != null) {
                k0Var3.f293407o = new wj2.h(this);
            }
            if (k0Var3 != null) {
                k0Var3.f293417v = this;
            }
        }
        this.f528258r = i17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var4 = this.f528256p;
        if (k0Var4 != null) {
            k0Var4.v();
        }
        ml2.n4 n4Var = i17 == 1 ? ml2.n4.f409293y : ml2.n4.f409286t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: " + n4Var.f409297d);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
    }

    public final void V(android.widget.TextView giftCountText, android.widget.ImageView giftIcon) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftCountText, "giftCountText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftIcon, "giftIcon");
        lj2.t0 a07 = this.f528252i.a0();
        dk2.u4 K = a07 != null ? a07.K() : null;
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        if (K == null || m145849x949ba2a5 == null) {
            return;
        }
        zl2.r4.f555483a.b3(giftCountText);
        km2.k d17 = K.d(m145849x949ba2a5);
        long j17 = d17 != null ? d17.f390655i : 0L;
        if (j17 > 0) {
            giftCountText.setText("x" + j17);
        } else {
            giftCountText.setText("0");
        }
        giftCountText.setVisibility(0);
        ce2.i e17 = dk2.u7.f315714a.e(K.f315695i);
        if (e17 != null) {
            giftIcon.setVisibility(0);
            ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(e17.f67819x7194d06c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f))).c(giftIcon);
        }
    }

    public final void W(android.widget.TextView textView) {
        lj2.t0 a07 = this.f528252i.a0();
        jz5.f0 f0Var = null;
        dk2.u4 K = a07 != null ? a07.K() : null;
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        if (K != null && m145849x949ba2a5 != null) {
            km2.k d17 = K.d(m145849x949ba2a5);
            long j17 = d17 != null ? d17.f390655i : 0L;
            if (textView != null) {
                textView.setText(zl2.r4.S(zl2.r4.f555483a, j17, 0, 2, null));
            }
            if (textView != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverBaseWidget", "showPkMicBattleValueText", "(Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverBaseWidget", "showPkMicBattleValueText", "(Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var != null || textView == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverBaseWidget", "showPkMicBattleValueText", "(Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverBaseWidget", "showPkMicBattleValueText", "(Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        if (((r1 == null || (r1 = r1.f390722t) == null) ? false : r1.booleanValue()) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X() {
        /*
            r10 = this;
            pf5.u r0 = pf5.u.f435469a
            android.content.Context r1 = r10.getContext()
            java.lang.String r2 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            pf5.v r1 = r0.b(r1)
            java.lang.Class<pl2.x> r3 = pl2.x.class
            androidx.lifecycle.c1 r1 = r1.a(r3)
            pl2.x r1 = (pl2.x) r1
            boolean r1 = r1.f438216f
            if (r1 == 0) goto L50
            android.content.Context r1 = r10.getContext()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            pf5.v r1 = r0.b(r1)
            androidx.lifecycle.c1 r1 = r1.a(r3)
            pl2.x r1 = (pl2.x) r1
            pl2.s r4 = r1.f438217g
            if (r4 == 0) goto L38
            r5 = 0
            r7 = 0
            r8 = 3
            r9 = 0
            pl2.s.e(r4, r5, r7, r8, r9)
        L38:
            android.content.Context r1 = r10.getContext()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            pf5.v r0 = r0.b(r1)
            androidx.lifecycle.c1 r0 = r0.a(r3)
            pl2.x r0 = (pl2.x) r0
            pl2.w r0 = r0.f438220m
            r1 = 3
            r0.f438211h = r1
            goto Ld8
        L50:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            km2.q r1 = r10.m145849x949ba2a5()
            r2 = 0
            if (r1 == 0) goto L65
            r45.xn1 r1 = r1.f390720r
            if (r1 == 0) goto L65
            byte[] r1 = r1.mo14344x5f01b1f6()
            goto L66
        L65:
            r1 = r2
        L66:
            java.lang.String r3 = "PARAM_MEMBERS_PROFILE_CONTACT"
            r0.putByteArray(r3, r1)
            java.lang.String r1 = "PARAM_MEMBERS_PROFILE_NEED_NOTIFY_CLOSE"
            r3 = 0
            r0.putBoolean(r1, r3)
            java.lang.String r1 = "PARAM_MEMBERS_PROFILE_SOURCE_TYPE"
            int r4 = r10.mo143569xa7893c8()
            r0.putInt(r1, r4)
            km2.q r1 = r10.m145849x949ba2a5()
            if (r1 == 0) goto L82
            java.lang.String r2 = r1.f390705c
        L82:
            java.lang.String r1 = "PARAM_MEMBERS_PROFILE_USERNAME"
            r0.putString(r1, r2)
            km2.q r1 = r10.m145849x949ba2a5()
            if (r1 == 0) goto L91
            java.lang.String r1 = r1.f390703a
            if (r1 != 0) goto L93
        L91:
            java.lang.String r1 = ""
        L93:
            java.lang.String r2 = "PARAM_MEMBERS_PROFILE_USER_MIC_ID"
            r0.putString(r2, r1)
            km2.q r1 = r10.m145849x949ba2a5()
            if (r1 == 0) goto La1
            boolean r1 = r1.f390710h
            goto La2
        La1:
            r1 = r3
        La2:
            java.lang.String r2 = "PARAM_MEMBERS_PROFILE_REPLAY_GIFT"
            r0.putBoolean(r2, r1)
            km2.q r1 = r10.m145849x949ba2a5()
            if (r1 == 0) goto Lb0
            boolean r1 = r1.f390710h
            goto Lb1
        Lb0:
            r1 = r3
        Lb1:
            if (r1 != 0) goto Lc5
            km2.q r1 = r10.m145849x949ba2a5()
            if (r1 == 0) goto Lc2
            java.lang.Boolean r1 = r1.f390722t
            if (r1 == 0) goto Lc2
            boolean r1 = r1.booleanValue()
            goto Lc3
        Lc2:
            r1 = r3
        Lc3:
            if (r1 == 0) goto Lc6
        Lc5:
            r3 = 1
        Lc6:
            java.lang.String r1 = "PARAM_MEMBERS_PROFILE_IS_OTHER_ROOM_USER"
            r0.putBoolean(r1, r3)
            lj2.v0 r1 = r10.f528252i
            qo0.c r1 = r1.q()
            if (r1 == 0) goto Ld8
            qo0.b r2 = qo0.b.f446909l1
            r1.mo46557x60d69242(r2, r0)
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.w.X():void");
    }

    public final void Y() {
        java.lang.Object obj;
        boolean i17 = this.f528252i.a0().i();
        boolean z17 = m145849x949ba2a5() != null;
        boolean u17 = this.f528252i.a0().u();
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        boolean b17 = m145849x949ba2a5 != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m145849x949ba2a5.f390722t, java.lang.Boolean.TRUE) : false;
        boolean G = G();
        boolean y17 = y();
        java.util.List g17 = this.f528252i.a0().g();
        synchronized (g17) {
            java.util.Iterator it = g17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                java.lang.String str = ((km2.q) obj).f390703a;
                km2.q m145849x949ba2a52 = m145849x949ba2a5();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, m145849x949ba2a52 != null ? m145849x949ba2a52.f390703a : null)) {
                    break;
                }
            }
        }
        boolean z18 = obj != null;
        boolean z19 = this.f528252i.f() == lj2.w0.f400491d;
        int O = this.f528252i.a0().O();
        boolean z27 = O == 0 || O == 1;
        pm2.a m145851x309290b1 = m145851x309290b1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m145851x309290b1, "<this>");
        boolean z28 = m145851x309290b1 == pm2.a.f438395r || m145851x309290b1 == pm2.a.f438396s || m145851x309290b1 == pm2.a.f438397t || m145851x309290b1 == pm2.a.f438398u;
        boolean z29 = m145851x309290b1() == pm2.a.f438388h;
        boolean z37 = m145851x309290b1() == pm2.a.f438391n || m145851x309290b1() == pm2.a.f438392o || m145851x309290b1() == pm2.a.f438393p;
        this.f528261u = i17 && z17 && u17 && z19 && z27 && !b17 && !G && !z28 && !z29 && !z18;
        boolean z38 = i17 && z17 && u17 && z19 && z27 && y17 && !b17 && !z28 && !z29 && !z37 && !z18;
        boolean z39 = z38 && !G;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "updateLike,enableLikeMicAudience:" + i17 + " hasBindLinkMicUser: " + z17 + ", isLikeEnable: " + u17 + ", isLiveRoom: " + z19 + ", isLiveOrCharge: " + z27 + ", isOtherRoomUser: " + b17 + ", isSelfMicUser: " + G + ", isAudience: " + y17 + " shouldHandleDoubleClick: " + this.f528261u + ", shouldShowLikeContainer: " + z38 + ", shouldLikeContainerHandleTouch: " + z39 + ", isFocus: " + z29 + ", isPkMode: " + z37 + ", isOtherRoomAnchor: " + z18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14330xf9b5e578 c14330xf9b5e578 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14330xf9b5e578) findViewById(com.p314xaae8f345.mm.R.id.tka);
        if (c14330xf9b5e578 == null) {
            return;
        }
        if (!z38) {
            c14330xf9b5e578.setVisibility(8);
            c14330xf9b5e578.C();
            this.I = false;
            return;
        }
        c14330xf9b5e578.setVisibility(0);
        wj2.t tVar = new wj2.t(this);
        wj2.u uVar = new wj2.u(this);
        wj2.v vVar = new wj2.v(this);
        km2.q m145849x949ba2a53 = m145849x949ba2a5();
        java.lang.String str2 = m145849x949ba2a53 != null ? m145849x949ba2a53.f390708f : null;
        qo0.c q17 = this.f528252i.q();
        boolean B = this.f528252i.a0().B();
        java.lang.String A = this.f528252i.a0().A();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.y5 y5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.y5(tVar, uVar, vVar, str2, q17, z39, B, A);
        c14330xf9b5e578.C();
        c14330xf9b5e578.f197528w = tVar;
        c14330xf9b5e578.f197529x = uVar;
        c14330xf9b5e578.f197530y = vVar;
        c14330xf9b5e578.f197531z = str2;
        c14330xf9b5e578.A = q17;
        c14330xf9b5e578.C = z39;
        c14330xf9b5e578.D = B;
        c14330xf9b5e578.E = A;
        java.lang.String str3 = "FinderLiveLikeContainer:" + c14330xf9b5e578.f197531z;
        c14330xf9b5e578.f197527v = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "bindData: " + y5Var);
        boolean z47 = c14330xf9b5e578.C;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c14330xf9b5e578.B;
        if (z47) {
            c14330xf9b5e578.setBackground(c14330xf9b5e578.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a6z, null));
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.m82040x7541828(c14330xf9b5e578.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz, null));
            }
        } else {
            c14330xf9b5e578.setBackground(null);
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.m82040x7541828(c14330xf9b5e578.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.agl, null));
            }
        }
        c14330xf9b5e578.H = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v5(c14330xf9b5e578);
        c14330xf9b5e578.f197526J = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.w5(c14330xf9b5e578);
        android.view.ViewTreeObserver viewTreeObserver = c14330xf9b5e578.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(c14330xf9b5e578.f197526J);
        }
        c14330xf9b5e578.B();
        if (this.I) {
            return;
        }
        this.I = true;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 1);
        jSONObject.put("element", 1);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        if (F()) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.f408756d3, jSONObject2, 0L, null, null, null, null, null, 252, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.y6((zy2.zb) c18, ml2.z4.E2, jSONObject2, null, 4, null);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        super.addView(view);
        android.view.View view2 = this.H;
        if (view2 != null) {
            view2.setTouchDelegate(null);
        }
        this.H = view;
        if (view == null) {
            return;
        }
        view.setTouchDelegate(m174006x3edd5b12());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        wj2.k0 k0Var = this.f528259s;
        if (k0Var != null && k0Var.a(motionEvent)) {
            return true;
        }
        m145853xb5886c64();
        java.util.Objects.toString(motionEvent);
        if (!this.f528261u) {
            return super.dispatchTouchEvent(motionEvent);
        }
        jz5.f0 f0Var = null;
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        java.lang.Runnable runnable = this.f528266z;
        android.os.Handler handler = this.A;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f528265y = false;
            O();
            this.f528262v = android.view.MotionEvent.obtain(motionEvent);
            this.f528264x++;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, this.f528260t);
            if (this.f528264x >= 2) {
                android.content.Context context = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                if (!((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class)).f438216f) {
                    if (y()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14330xf9b5e578 c14330xf9b5e578 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14330xf9b5e578) findViewById(com.p314xaae8f345.mm.R.id.tka);
                        if (c14330xf9b5e578 != null) {
                            wj2.l lVar = new wj2.l(this, motionEvent);
                            java.lang.Runnable runnable2 = c14330xf9b5e578.I;
                            android.os.Handler handler2 = c14330xf9b5e578.G;
                            if (runnable2 != null) {
                                handler2.removeCallbacks(runnable2);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.x5 x5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.x5(c14330xf9b5e578, lVar);
                            c14330xf9b5e578.I = x5Var;
                            handler2.postDelayed(x5Var, 20L);
                            f0Var = jz5.f0.f384359a;
                        }
                        if (f0Var == null) {
                            this.E++;
                            M();
                            N(motionEvent);
                        }
                    } else {
                        df2.bh bhVar = (df2.bh) this.f528252i.o(df2.bh.class);
                        if (bhVar != null) {
                            bhVar.Z6((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        }
                    }
                }
            }
        } else if (valueOf != null && valueOf.intValue() == 1) {
            if (this.f528265y) {
                super.dispatchTouchEvent(motionEvent);
            } else {
                this.f528263w = android.view.MotionEvent.obtain(motionEvent);
            }
        } else if (valueOf != null && valueOf.intValue() == 3) {
            handler.removeCallbacks(runnable);
            this.f528264x = 0;
            this.f528265y = false;
            O();
            super.dispatchTouchEvent(motionEvent);
        } else if (this.f528265y) {
            super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public void f(boolean z17, int i17, boolean z18) {
        java.lang.String str;
        lj2.v0 v0Var = this.f528252i;
        if (z18 && G() && !zl2.r4.f555483a.w1()) {
            km2.q m145849x949ba2a5 = m145849x949ba2a5();
            if ((m145849x949ba2a5 == null || m145849x949ba2a5.f390710h) ? false : true) {
                boolean B = B();
                android.os.Bundle bundle = new android.os.Bundle();
                if (!B && !v0Var.a0().F()) {
                    r0 = false;
                }
                bundle.putBoolean("PARAM_FINDER_LIVE_IS_MUTE_MIC", r0);
                bundle.putBoolean("PARAM_FINDER_LIVE_IS_NEED_SET_MUTE_MIC", false);
                qo0.c q17 = v0Var.q();
                if (q17 != null) {
                    q17.mo46557x60d69242(qo0.b.f446934p4, bundle);
                }
                if (B) {
                    db5.t7.i(getContext(), getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dvk), com.p314xaae8f345.mm.R.raw.f79803x14181d5f);
                } else {
                    db5.t7.i(getContext(), getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwy), com.p314xaae8f345.mm.R.raw.f79805xc851170e);
                }
                r45.t12 t12Var = new r45.t12();
                t12Var.set(3, 10001);
                t12Var.set(2, B ? getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dvk) : getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwy));
                v0Var.a0().L(new dk2.mf(t12Var));
                return;
            }
        }
        if (z18) {
            km2.q m145849x949ba2a52 = m145849x949ba2a5();
            if (!(m145849x949ba2a52 != null && m145849x949ba2a52.f390710h) || zl2.r4.f555483a.w1()) {
                return;
            }
            boolean B2 = B();
            qo0.c q18 = v0Var.q();
            if (q18 != null) {
                qo0.b bVar = qo0.b.f446870c5;
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putBoolean("PARAM_FINDER_LIVE_PK_ANCHOR_IS_MUTE", B2);
                km2.q m145849x949ba2a53 = m145849x949ba2a5();
                if (m145849x949ba2a53 == null || (str = m145849x949ba2a53.f390705c) == null) {
                    str = "";
                }
                bundle2.putString("PARAM_FINDER_LIVE_MIC_USER_NAME", str);
                q18.mo46557x60d69242(bVar, bundle2);
            }
            if (B2) {
                db5.t7.i(getContext(), getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4n), com.p314xaae8f345.mm.R.raw.f79803x14181d5f);
            }
        }
    }

    /* renamed from: getAnchorAudioModeLayout */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124425xd504a5f8() {
        return null;
    }

    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    /* renamed from: getBattleResultWidget */
    public /* bridge */ /* synthetic */ ai2.a mo124427x4f7d778f() {
        return null;
    }

    /* renamed from: getBattleTipsWidget */
    public /* bridge */ /* synthetic */ qi2.s1 mo124428x3f645dea() {
        return null;
    }

    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    /* renamed from: getCurBindLinkMicUser */
    public km2.q m174007xdd2aa071() {
        return m145849x949ba2a5();
    }

    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    /* renamed from: getGiftRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124433x9681e6d() {
        return null;
    }

    /* renamed from: getLotteryBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124434x83df3d46() {
        return null;
    }

    /* renamed from: getLuckyMoneyRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124447xe76ca375() {
        return null;
    }

    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    /* renamed from: getMicType */
    public final java.lang.Integer m174008x7c9c69eb() {
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        if (m145849x949ba2a5 != null) {
            return java.lang.Integer.valueOf(m145849x949ba2a5.f390707e);
        }
        return null;
    }

    /* renamed from: getPluginAbility */
    public final lj2.v0 m174009x3a33aac1() {
        return this.f528252i;
    }

    /* renamed from: getProfileSourceType */
    public int mo143569xa7893c8() {
        if (zl2.r4.f555483a.x1()) {
            return ((m145851x309290b1() == pm2.a.f438390m || m145851x309290b1() == pm2.a.f438394q || m145851x309290b1() == pm2.a.f438391n) && this.f528252i.a0().w()) ? 9 : 3;
        }
        return 3;
    }

    /* renamed from: getService */
    public final lj2.x0 m174010xb411027f() {
        return this.f528253m;
    }

    @Override // lj2.j
    /* renamed from: getTagText */
    public java.lang.String mo124440xe17957b1() {
        xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
        return m145850xf6df7a5e != null ? this.f528252i.a0().G(m145850xf6df7a5e.f536054b.f536086e) : "";
    }

    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    /* renamed from: getWidgetType */
    public final int m174011xdbf15394() {
        return this.f528254n;
    }

    @Override // lj2.j
    public void l(pm2.a widgetMode, xh2.a data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widgetMode, "widgetMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.l(widgetMode, data);
        x();
        R();
        Y();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        java.lang.Runnable runnable = this.B;
        android.os.Handler handler = this.A;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
            this.B = null;
        }
        handler.removeCallbacks(this.f528266z);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0160  */
    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo888x34063ac(android.view.MenuItem r22, int r23) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.w.mo888x34063ac(android.view.MenuItem, int):void");
    }

    /* renamed from: setTouchDelegate */
    public final void m174012xaf0594a2(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        view.post(new wj2.q(this, view));
    }

    public void x() {
    }

    public final boolean y() {
        java.lang.Object obj;
        java.util.List l17 = this.f528252i.a0().l();
        synchronized (l17) {
            java.util.Iterator it = l17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                java.lang.String str = ((km2.q) next).f390703a;
                km2.q m145849x949ba2a5 = m145849x949ba2a5();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, m145849x949ba2a5 != null ? m145849x949ba2a5.f390703a : null)) {
                    obj = next;
                    break;
                }
            }
        }
        return obj != null;
    }

    public boolean z() {
        return !(this instanceof qh2.i);
    }
}
