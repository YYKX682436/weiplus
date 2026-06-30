package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class mg extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements he2.b {
    public final jz5.g A;
    public boolean B;
    public boolean C;
    public final bm2.o1 D;
    public final jz5.g E;
    public final jz5.g F;
    public boolean G;
    public boolean H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public int f195035J;
    public int K;
    public boolean L;
    public android.view.View M;
    public volatile boolean N;
    public final jz5.g P;
    public float Q;
    public final jz5.g R;
    public int S;
    public int T;
    public p3325xe03a0797.p3326xc267989b.r2 U;
    public final jz5.g V;
    public android.graphics.Rect W;
    public jz5.l X;
    public final jz5.g Y;
    public final jz5.g Z;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f195036p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.ViewGroup f195037q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.ViewGroup f195038r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f195039s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f195040t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f195041u;

    /* renamed from: v, reason: collision with root package name */
    public final bm2.h1 f195042v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14364x8eb8469 f195043w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.ViewGroup f195044x;

    /* renamed from: y, reason: collision with root package name */
    public dk2.zf f195045y;

    /* renamed from: z, reason: collision with root package name */
    public final dk2.v4 f195046z;

    /* renamed from: p0, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.me f195028p0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.me(null);

    /* renamed from: x0, reason: collision with root package name */
    public static final java.util.List f195030x0 = kz5.c0.i(1, 20002, 20035, 1000066, 20112, 20124, 20128);

    /* renamed from: y0, reason: collision with root package name */
    public static final java.util.List f195032y0 = kz5.c0.i(1, 20002, 20035, 1000066, 20124, 20128);

    /* renamed from: l1, reason: collision with root package name */
    public static final java.util.List f195027l1 = kz5.c0.i(1, 20002, 20035, 1000066, 20124, 20128, 20112);

    /* renamed from: p1, reason: collision with root package name */
    public static final float f195029p1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);

    /* renamed from: x1, reason: collision with root package name */
    public static final int f195031x1 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561186br);

    /* renamed from: y1, reason: collision with root package name */
    public static final int f195033y1 = 1;

    /* renamed from: z1, reason: collision with root package name */
    public static final int f195034z1 = 2;
    public static final int A1 = 3;
    public static final java.util.Set B1 = kz5.z.D0(new java.lang.Integer[]{java.lang.Integer.valueOf(be1.r0.f4232x366c91de), 158, 161});
    public static final java.util.Set C1 = kz5.z.D0(new java.lang.Integer[]{165, 166, 154, 155, 156});
    public static final float D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(android.view.ViewGroup root, qo0.c statusMonitor, android.view.ViewGroup viewGroup) {
        super(root, statusMonitor, null);
        double d17;
        double d18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195036p = statusMonitor;
        this.f195037q = viewGroup;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.i8o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById;
        this.f195038r = viewGroup2;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.i8p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f195039s = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.i8j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f195040t = findViewById3;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.uag);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f195041u = findViewById4;
        this.f195042v = new bm2.h1(findViewById4);
        android.view.View findViewById5 = root.findViewById(com.p314xaae8f345.mm.R.id.f566133ev2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14364x8eb8469 c14364x8eb8469 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14364x8eb8469) findViewById5;
        this.f195043w = c14364x8eb8469;
        android.view.ViewParent parent = root.getParent();
        android.view.ViewGroup viewGroup3 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        this.f195044x = viewGroup3 != null ? (android.view.ViewGroup) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.rdu) : null;
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f195046z = new dk2.v4(context, S0());
        this.A = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.we(root, this));
        this.C = true;
        bm2.o1 o1Var = new bm2.o1(((we2.s) P0(we2.s.class)).f526788g);
        this.D = o1Var;
        this.E = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qe(root, this));
        this.F = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bf(root, this));
        this.H = true;
        this.L = true;
        jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cg.f193682d);
        this.N = true;
        this.P = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.af(this));
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (!r4Var.w1() || ((mm2.f6) P0(mm2.f6.class)).N6() || ((on2.z2) P0(on2.z2.class)).f428629q || ((mm2.o4) P0(mm2.o4.class)).k7()) {
            d18 = 0.25d;
        } else {
            d18 = 0.29d;
        }
        this.K = (int) (d17 * d18);
        if (x0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.me meVar = f195028p0;
            android.content.Context context2 = root.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            int a17 = meVar.a(context2);
            root.getLayoutParams().width = a17;
            C1().getLayoutParams().width = a17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "init comment width = " + a17);
            int i17 = (int) (((double) com.p314xaae8f345.mm.ui.bl.b(root.getContext()).y) * 0.3d);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14364x8eb8469.f197653n;
            c14364x8eb8469.b(i17, true);
            ((we2.s) S0().a(we2.s.class)).f526790i = a17;
        } else {
            int i19 = (int) (this.K + f195029p1);
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14364x8eb8469.f197653n;
            c14364x8eb8469.b(i19, true);
            android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(root.getContext());
            if (b17.x >= (b17.y / 3) * 2) {
                android.view.ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                layoutParams.width = b17.x / 2;
                root.setLayoutParams(layoutParams);
            } else {
                we2.s sVar = (we2.s) S0().a(we2.s.class);
                int i28 = b17.x;
                android.view.ViewGroup.LayoutParams layoutParams2 = root.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                int marginStart = i28 - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart();
                android.view.ViewGroup.LayoutParams layoutParams3 = root.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                sVar.f526790i = marginStart - ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
            }
        }
        this.f195035J = c14364x8eb8469.getF197657g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "commentListWidth : " + ((we2.s) S0().a(we2.s.class)).f526790i);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14339x748bebd7 C12 = C1();
        android.content.Context context3 = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        C12.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1547x31c90fad.C14423xb0a0cdaf(context3));
        C1().mo7960x6cab2c8d(o1Var);
        ym5.a1.h(C1(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ee(this));
        o1Var.f103714n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fe(this);
        o1Var.f103715o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ge(this);
        o1Var.f103716p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.he(this);
        C1().i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ie(this));
        if (!(((java.lang.Number) ae2.in.f85279f7.r()).intValue() == 1) || r4Var.w1() || x0()) {
            viewGroup2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ke(this));
        } else {
            viewGroup2.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.je(this));
        }
        r4Var.e(this, true);
        c14364x8eb8469.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le(this));
        c14364x8eb8469.setOnTouchListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ce.f193673d);
        this.R = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vf(root));
        this.V = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pe.f195393d);
        this.Y = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xe.f196609d);
        this.Z = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ye.f196722d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static void U1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar, java.util.List msgList, boolean z17, boolean z18, java.lang.Boolean bool, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        ?? r57 = z18;
        if ((i17 & 4) != 0) {
            r57 = 0;
        }
        if ((i17 & 8) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        mgVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        mgVar.f446856d.getVisibility();
        mgVar.f446856d.getAlpha();
        mgVar.f446856d.isShown();
        mgVar.C1().getVisibility();
        mgVar.C1().isShown();
        if (!z17) {
            android.os.Message mo50288x733c63a2 = mgVar.E1().mo50288x733c63a2();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(msgList);
            mo50288x733c63a2.obj = arrayList;
            mo50288x733c63a2.arg1 = r57;
            int i18 = f195034z1;
            mo50288x733c63a2.what = i18;
            mgVar.E1().mo50303x856b99f0(i18);
            mgVar.E1().mo50308x2936bf5f(mo50288x733c63a2);
            return;
        }
        if (!msgList.isEmpty()) {
            mgVar.w1();
        }
        if (mgVar.N) {
            if (!mgVar.C1().isShown()) {
                mgVar.N = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "updateMessages return ,isMsgListViewVisible is not real.correct it");
                return;
            }
        } else {
            if (!mgVar.C1().isShown()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "updateMessages return ,RecyclerView is invisible");
                return;
            }
            mgVar.N = true;
        }
        android.os.Message mo50288x733c63a22 = mgVar.E1().mo50288x733c63a2();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.addAll(msgList);
        mo50288x733c63a22.obj = arrayList2;
        mo50288x733c63a22.arg1 = r57;
        mo50288x733c63a22.arg2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE) ? 1 : 0;
        int i19 = f195033y1;
        mo50288x733c63a22.what = i19;
        mgVar.E1().mo50303x856b99f0(i19);
        mgVar.E1().mo50308x2936bf5f(mo50288x733c63a22);
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar) {
        java.util.List C0;
        java.lang.Object obj;
        mgVar.M1(true);
        mgVar.f195038r.setVisibility(8);
        if (!((mm2.x4) mgVar.P0(mm2.x4.class)).f411073u) {
            y1(mgVar, null, 0, 3, null);
            return;
        }
        int i17 = ((mm2.x4) mgVar.P0(mm2.x4.class)).f411069q;
        int size = ((mm2.x4) mgVar.P0(mm2.x4.class)).f411061f.size() - 1;
        java.util.List list = ((mm2.x4) mgVar.P0(mm2.x4.class)).f411061f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-msgList>(...)");
        e06.k kVar = new e06.k(i17, size);
        synchronized (list) {
            C0 = kz5.n0.C0(list, kVar);
        }
        synchronized (C0) {
            java.util.Iterator it = C0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                dk2.zf zfVar = (dk2.zf) obj;
                zl2.r4 r4Var = zl2.r4.f555483a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zfVar);
                if (r4Var.x(zfVar)) {
                    break;
                }
            }
        }
        dk2.zf zfVar2 = (dk2.zf) obj;
        if (zfVar2 != null) {
            int indexOf = ((mm2.x4) mgVar.P0(mm2.x4.class)).f411061f.indexOf(zfVar2);
            if (indexOf != -1) {
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0 r0Var = (ml2.r0) c17;
                java.lang.String a17 = zfVar2.a();
                if (a17 == null) {
                    a17 = "";
                }
                r0Var.Gk(a17, 0, "");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14339x748bebd7 C12 = mgVar.C1();
                if (indexOf < 0) {
                    indexOf = 0;
                }
                int mo1894x7e414b06 = mgVar.D.mo1894x7e414b06() - 1;
                if (indexOf > mo1894x7e414b06) {
                    indexOf = mo1894x7e414b06;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(indexOf));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(C12, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "onNewTipsClick", "()V", "Undefined", "scrollToPosition", "(I)V");
                C12.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(C12, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "onNewTipsClick", "()V", "Undefined", "scrollToPosition", "(I)V");
            } else {
                y1(mgVar, null, 0, 3, null);
            }
        }
        ((mm2.x4) mgVar.P0(mm2.x4.class)).f411073u = false;
    }

    public static final void u1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar, dk2.zf zfVar) {
        java.lang.String sb6;
        android.view.View view = mgVar.f195041u;
        if (view.isShown()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "#showStickTopTitleMsg execute. stickTopWelcomeTitleLayout.width=" + view.getWidth());
        android.view.View view2 = mgVar.f195041u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "showStickTopTitleMsg", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "showStickTopTitleMsg", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        bm2.h1 h1Var = mgVar.f195042v;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = h1Var.f103460e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405 c14315xbe4ed405 = c22624x85d69039 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405) c22624x85d69039 : null;
        if (c14315xbe4ed405 != null) {
            c14315xbe4ed405.m57316x64c31e10(null);
        }
        h1Var.f3639x46306858.setOnClickListener(null);
        int mo124533xfb85f7b0 = zfVar.mo124533xfb85f7b0();
        if (mo124533xfb85f7b0 == 10001) {
            fk2.y2 y2Var = new fk2.y2(((we2.s) mgVar.S0().a(we2.s.class)).f526788g.d());
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            fk2.f3.s(y2Var, zfVar, context, mgVar.f195042v, zfVar.j(), null, 16, null);
        } else if (mo124533xfb85f7b0 == 20036 || mo124533xfb85f7b0 == 100000) {
            if (zfVar.x().length() > 0) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4h));
                sb7.append(' ');
                java.lang.String j17 = zfVar.j();
                sb7.append(r26.n0.u0(j17 != null ? j17 : "").toString());
                sb7.append('\n');
                sb7.append(r26.n0.u0(zfVar.x()).toString());
                sb6 = sb7.toString();
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4h));
                sb8.append(' ');
                java.lang.String j18 = zfVar.j();
                sb8.append(j18 != null ? j18 : "");
                sb6 = sb8.toString();
            }
            java.lang.String str = sb6;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = h1Var.f103460e;
            c22624x85d690392.setPadding(0, 0, 0, 0);
            android.view.ViewGroup.LayoutParams layoutParams = c22624x85d690392.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(15, -1);
                }
                c22624x85d690392.setLayoutParams(layoutParams);
            }
            fk2.h hVar = fk2.k.f344946m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c22624x85d690392, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView");
            hVar.a(str, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405) c22624x85d690392, mgVar.C1().getWidth(), 14, true, mgVar.f195042v);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405) c22624x85d690392).m57316x64c31e10(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xf(mgVar, zfVar));
            h1Var.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yf(mgVar, zfVar));
        }
        if (zfVar.mo124533xfb85f7b0() == 100000 || zfVar.mo124533xfb85f7b0() == 20036) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f408814y2;
            cl0.g gVar = new cl0.g();
            gVar.o("type", 1);
            ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }

    public static final void v1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar, dk2.zf zfVar) {
        try {
            ((mm2.x4) mgVar.P0(mm2.x4.class)).O6(zfVar);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = mgVar.C1().getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int w17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w();
            java.util.List list = ((mm2.x4) mgVar.P0(mm2.x4.class)).f411061f;
            int min = java.lang.Math.min(w17, list.size());
            list.add(min, zfVar);
            java.util.List list2 = ((mm2.x4) mgVar.P0(mm2.x4.class)).f411061f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-msgList>(...)");
            U1(mgVar, list2, false, false, null, 14, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "#onTextClick click, insert to " + w17);
            mgVar.G1();
            p3325xe03a0797.p3326xc267989b.r2 r2Var = mgVar.U;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            mgVar.C1().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zf(mgVar, min));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveCommentPlugin", e17.toString());
        }
        if (zfVar.mo124533xfb85f7b0() == 100000 || zfVar.mo124533xfb85f7b0() == 20036) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f408814y2;
            cl0.g gVar = new cl0.g();
            gVar.o("type", 2);
            ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }

    public static /* synthetic */ void y1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar, java.lang.Boolean bool, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        if ((i18 & 2) != 0) {
            i17 = -1;
        }
        mgVar.x1(bool, i17);
    }

    public final cn2.p0 A1() {
        return (cn2.p0) ((jz5.n) this.E).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string != null ? string : "", "PORTRAIT_ACTION_GOTO_PROFILE_COMMENT")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pf pfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pf(this, bundle, obj, j17);
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(pfVar, j17);
        }
    }

    public final int B1() {
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad.class);
        if (adVar == null) {
            return 0;
        }
        if (!(adVar.w0() == 0)) {
            adVar = null;
        }
        if (adVar == null || (viewGroup = adVar.f446856d) == null) {
            return 0;
        }
        return viewGroup.getHeight();
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserMap, "micUserMap");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "onAudienceMicUserChanged commentAdapter micEnable true");
        fk2.x xVar = fk2.g0.f344923m;
        fk2.g0.f344925o = true;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14339x748bebd7 C1() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14339x748bebd7) this.A.mo141623x754a37bb();
    }

    public final int D1() {
        return ((java.lang.Number) ((jz5.n) this.Y).mo141623x754a37bb()).intValue();
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 E1() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) this.P.mo141623x754a37bb();
    }

    public final int F1() {
        return ((java.lang.Number) ((jz5.n) this.R).mo141623x754a37bb()).intValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    public final void G1() {
        android.view.View view = this.f195041u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "hideStickTopTitleMsg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "hideStickTopTitleMsg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final boolean H1() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = C1().getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).x() == this.D.mo1894x7e414b06() - 1;
    }

    public final void I1(java.util.List bulletCommentList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bulletCommentList, "bulletCommentList");
        A1().f(bulletCommentList, true);
    }

    public final void J1() {
        C1().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mf(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        ((mm2.e1) S0().a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        android.view.ViewGroup viewGroup = this.f446856d;
        viewGroup.getAlpha();
        if (((mm2.j2) P0(mm2.j2.class)).O6(x0())) {
            super.K0(8);
            this.f194860i = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "danmaku intercept visible:" + i17);
            return;
        }
        if (i17 == 0 && w0() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "[commentHeightChange] commentPlugin visible change");
            viewGroup.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wf(this), 100L);
        }
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.M5).mo141623x754a37bb()).r()).booleanValue()) {
            i17 = 8;
        }
        super.K0(i17);
    }

    public final void K1() {
        if (this.I > 0) {
            mm2.x4 x4Var = (mm2.x4) P0(mm2.x4.class);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = C1().getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            x4Var.f411071s = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).x() == this.D.mo1894x7e414b06() - 1;
            mm2.x4 x4Var2 = (mm2.x4) P0(mm2.x4.class);
            long j17 = ((mm2.x4) P0(mm2.x4.class)).f411072t;
            long j18 = this.I;
            if (j17 < j18) {
                j17 = j18;
            }
            x4Var2.f411072t = j17;
        }
    }

    public void L1() {
        bm2.o1 o1Var = this.D;
        try {
            o1Var.f103713m.clear();
            o1Var.m8146xced61ae5();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "[reset] err = " + e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            if (((mm2.c1) P0(mm2.c1.class)).f410435w) {
                if ((bundle != null && bundle.getBoolean("PARAM_FINDER_LIVE_START_BY_MINI_WINDOW")) || x0()) {
                    java.util.List list = ((mm2.x4) P0(mm2.x4.class)).f411061f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-msgList>(...)");
                    V1(list);
                }
            }
            java.lang.System.currentTimeMillis();
            return;
        }
        if (ordinal == 21) {
            K1();
            return;
        }
        if (ordinal == 33) {
            this.f195038r.setVisibility(8);
            C1().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.of(this), 100L);
            M1(true);
            return;
        }
        if (ordinal == 41) {
            this.L = !(bundle != null ? bundle.getBoolean("PARAM_IS_ENTERING_COMMENT") : false);
            return;
        }
        if (ordinal != 120) {
            if (ordinal == 191) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "FINDER_LIVE_MODE_SWITCH isAudioMode:" + (bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false) + ", isShareMode:" + (bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false) : false) + ", isLinkMic: " + (((mm2.o4) P0(mm2.o4.class)).Z6().size() > 0));
                return;
            }
            switch (ordinal) {
                case 128:
                case 129:
                    if (bundle != null) {
                        java.lang.String string = bundle.getString("PARAM_FINDER_LIVE_COMMENT");
                        if (string == null) {
                            string = "";
                        }
                        java.util.List list2 = ((mm2.x4) P0(mm2.x4.class)).f411061f;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-msgList>(...)");
                        kz5.h0.B(list2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag(string));
                        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bg(this));
                        return;
                    }
                    return;
                case 130:
                    if (bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR") : false) {
                        K1();
                        return;
                    }
                    java.util.List list3 = ((mm2.x4) P0(mm2.x4.class)).f411061f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list3, "<get-msgList>(...)");
                    V1(list3);
                    return;
                default:
                    return;
            }
        }
        int i17 = bundle != null ? bundle.getInt("PARAM_FINDER_LIVE_COMMENT_MOVE_DISTANCE") : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "comment move distance:" + i17 + ",has change:" + this.G);
        boolean z17 = this.G;
        if ((z17 || i17 <= 0) && (!z17 || i17 >= 0)) {
            return;
        }
        this.G = !z17;
        android.view.ViewGroup viewGroup = this.f446856d;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i18 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin += i17;
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i19 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[adjustCommentLayout] bottomMargin: ");
        sb6.append(i18);
        sb6.append(" -> ");
        sb6.append(i19);
        sb6.append(", distance=");
        sb6.append(i17);
        sb6.append(", caller=\n");
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTrace, "getStackTrace(...)");
        sb6.append(kz5.n0.g0(kz5.z.s0(stackTrace, 8), "\n", null, null, 0, null, null, 62, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", sb6.toString());
        viewGroup.requestLayout();
    }

    public final void M1(boolean z17) {
        if (this.C != z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderLiveComment] forceReachLast: ");
            sb6.append(this.C);
            sb6.append(" -> ");
            sb6.append(z17);
            sb6.append(", from: ");
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTrace, "getStackTrace(...)");
            java.lang.StackTraceElement stackTraceElement = (java.lang.StackTraceElement) kz5.z.U(stackTrace, 4);
            java.lang.String methodName = stackTraceElement != null ? stackTraceElement.getMethodName() : null;
            if (methodName == null) {
                methodName = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
            }
            sb6.append(methodName);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", sb6.toString());
        }
        this.C = z17;
    }

    public final void N1(long j17) {
        android.view.ViewGroup viewGroup = this.f195038r;
        if (j17 <= 0 || !((mm2.c1) P0(mm2.c1.class)).f410435w) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        boolean z17 = ((mm2.x4) P0(mm2.x4.class)).f411073u;
        android.view.ViewGroup viewGroup2 = this.f446856d;
        android.widget.TextView textView = this.f195039s;
        if (z17) {
            java.lang.String string = viewGroup2.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_j);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            textView.setText(format);
            return;
        }
        java.lang.String valueOf = j17 <= 99 ? java.lang.String.valueOf(j17) : "99+";
        java.lang.String string2 = viewGroup2.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{valueOf}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        textView.setText(format2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        android.content.Context context = this.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        im2.n nVar = (im2.n) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(im2.n.class);
        long m75942xfb822ef2 = ((mm2.e1) S0().a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        java.util.List list = ((mm2.x4) P0(mm2.x4.class)).f411061f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-msgList>(...)");
        nVar.getClass();
        if (nVar.f373983e && m75942xfb822ef2 == nVar.f373982d && (!list.isEmpty())) {
            java.util.List list2 = bg2.a.f101441c;
            list2.clear();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                dk2.zf zfVar = (dk2.zf) obj;
                if ((zfVar.m() == 0 && kz5.z.F(bg2.a.f101442d, zfVar.mo124533xfb85f7b0())) ? false : true) {
                    arrayList.add(obj);
                }
            }
            list2.addAll(arrayList);
            bg2.a.f101440b = m75942xfb822ef2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CommentDataTransfer", "passToFeed liveId:" + pm0.v.u(m75942xfb822ef2) + ", cache size:" + list2.size());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.f214314a.a();
        K1();
        this.L = true;
        this.N = true;
        A1().c(4);
        dk2.t5 N6 = ((we2.s) S0().a(we2.s.class)).N6();
        N6.f315636b = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        N6.f315637c = -1;
        N6.f315638d = Long.MIN_VALUE;
        N6.f315639e = false;
        N6.f315640f = true;
        N6.f315643i = null;
        N6.f315642h = null;
        ((cn2.y0) ((jz5.n) this.F).mo141623x754a37bb()).d();
        this.W = null;
        this.X = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.U;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        G1();
    }

    public final void P1(boolean z17) {
        if (!z17) {
            java.util.List list = ((mm2.x4) P0(mm2.x4.class)).f411061f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-msgList>(...)");
            U1(this, list, false, false, null, 14, null);
            N1(0L);
            if (((mm2.c1) P0(mm2.c1.class)).f410334f2 != 2) {
                cn2.p0 A12 = A1();
                java.util.List list2 = ((mm2.x4) P0(mm2.x4.class)).f411062g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-bulletCommetList>(...)");
                A12.f(list2, true);
                return;
            }
            return;
        }
        A1().f125131i.clear();
        A1().c(1);
        this.f195038r.setVisibility(8);
        M1(true);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.U;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        int[] msgType = (int[]) ((jz5.n) this.V).mo141623x754a37bb();
        bm2.o1 o1Var = this.D;
        o1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgType, "msgType");
        pm0.v.b0(o1Var.f103713m, new bm2.n1(msgType));
        o1Var.m8146xced61ae5();
    }

    public final void Q1(java.util.List list, java.lang.Boolean bool, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc ocVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.f214314a;
        boolean z18 = !ocVar.b() && this.C;
        boolean H1 = H1();
        long j17 = ((mm2.c1) P0(mm2.c1.class)).f410308a2 - this.I;
        int R1 = R1(list, z17);
        if (R1 > 0 && (this.C != H1 || !z18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "[FinderLiveComment] newComment: reachLast=" + z18 + ", forceReachLast=" + this.C + ", realReachLast=" + H1 + ", isFlowWindowShowing=" + ocVar.b());
        }
        if (this.D.mo1894x7e414b06() > 0) {
            if (z18) {
                C1().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gg(this, bool, R1));
            } else if (j17 > 0) {
                N1(j17);
            }
        }
    }

    public final int R1(java.util.List list, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = -1;
        if (z17 && !C1().isShown()) {
            this.N = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "[updateComments] RecyclerView is invisible, return");
            return f0Var.f391649d;
        }
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            int size = list.size();
            pm0.v.G(list, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hg.f194340d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "updateComments  before size:" + size + " afterSize:" + list.size());
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jg(this, list), false).a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ig(this, list, f0Var));
        return f0Var.f391649d;
    }

    public final void T1(java.util.List list, boolean z17, boolean z18, java.lang.Boolean bool) {
        android.view.ViewGroup viewGroup;
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ken_comment", "updateMessageInrtetnal else，" + this);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.c1) P0(mm2.c1.class)).G3, java.lang.Boolean.FALSE) && z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (kz5.z.F((int[]) ((jz5.n) this.V).mo141623x754a37bb(), ((dk2.zf) obj).mo124533xfb85f7b0())) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
            Q1(arrayList, bool, z17);
        } else {
            Q1(list, bool, z17);
        }
        if (this.f195045y != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "try update bottom sticky, but has one showing");
        } else {
            java.util.List list2 = ((mm2.x4) P0(mm2.x4.class)).f411067o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-stickBottomMsgList>(...)");
            dk2.zf zfVar = (dk2.zf) kz5.h0.C(list2);
            if (zfVar != null && (viewGroup = this.f195044x) != null) {
                this.f195045y = zfVar;
                android.view.ViewGroup viewGroup2 = this.f446856d;
                android.view.View inflate = android.view.View.inflate(viewGroup2.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.apg, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
                bm2.h1 h1Var = new bm2.h1(inflate);
                we2.p pVar = ((we2.s) P0(we2.s.class)).f526788g;
                android.content.Context context = viewGroup2.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pVar.a(context, h1Var, zfVar, -1, new java.util.ArrayList());
                inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eg(pVar, zfVar));
                viewGroup.removeAllViews();
                viewGroup.addView(inflate);
                int z19 = zfVar.z();
                int i17 = z19 != 1 ? z19 != 2 ? z19 != 999 ? 0 : 3 : 1 : 2;
                df2.nw nwVar = df2.xw.f313341w;
                jz5.l[] lVarArr = new jz5.l[2];
                java.lang.String f17 = zfVar.f();
                if (f17 == null) {
                    f17 = "";
                }
                lVarArr[0] = new jz5.l("msg_id", f17);
                lVarArr[1] = new jz5.l("reply_type", java.lang.String.valueOf(i17));
                nwVar.a(4, kz5.c1.k(lVarArr));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fg(this, viewGroup, zfVar, null), 3, null);
            }
        }
        if (!z18 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.c1) P0(mm2.c1.class)).G3, java.lang.Boolean.TRUE) && ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 2) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(((mm2.x4) P0(mm2.x4.class)).f411063h, "<get-bulletListFromJoinLive>(...)");
            if (!r0.isEmpty()) {
                cn2.p0 A12 = A1();
                java.util.List list3 = ((mm2.x4) P0(mm2.x4.class)).f411063h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list3, "<get-bulletListFromJoinLive>(...)");
                A12.f(list3, true);
                ((mm2.x4) P0(mm2.x4.class)).f411063h.clear();
            }
            cn2.p0 A13 = A1();
            java.util.List list4 = ((mm2.x4) P0(mm2.x4.class)).f411062g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list4, "<get-bulletCommetList>(...)");
            A13.f(list4, true);
        }
        if (z17 && (!list.isEmpty())) {
            w1();
        }
    }

    public final void V1(java.util.List list) {
        if (!(list == null || list.isEmpty()) && ((mm2.x4) P0(mm2.x4.class)).f411069q != -1) {
            C1().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lg(list, this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "[updateMessagesOnViewAttach] curVisiableFirstPosition:" + ((mm2.x4) P0(mm2.x4.class)).f411070r);
    }

    @Override // he2.b
    public android.view.View W() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787;
        android.view.ViewGroup viewGroup = this.f446856d;
        android.view.ViewGroup viewGroup2 = this.f195037q;
        if (viewGroup2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "getCommentRootView rootParent null");
            return viewGroup;
        }
        if (this.M != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "getCommentRootView viewPagerRootView not null");
            android.view.View view = this.M;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.View");
            return view;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "getCommentRootView getPortraitRootView");
        if (viewGroup2 == null || (c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.thw)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.LiveCommentPlugin", "cannot find comment bottom area");
        } else {
            android.view.ViewParent parent = viewGroup.getParent();
            android.view.ViewGroup viewGroup3 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(viewGroup);
            }
            android.view.ViewParent parent2 = c1073x7e08a787.getParent();
            android.view.ViewGroup viewGroup4 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup4 != null) {
                viewGroup4.removeView(c1073x7e08a787);
            }
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c14177xbed2eba0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.box.p1477xa324943e.C14177xbed2eba0(context);
            c14177xbed2eba0.addView(c1073x7e08a787, new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, -2));
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
            cVar.d(c14177xbed2eba0);
            cVar.e(c1073x7e08a787.getId(), 1, 0, 1);
            cVar.e(c1073x7e08a787.getId(), 2, 0, 2);
            cVar.e(c1073x7e08a787.getId(), 4, 0, 4);
            cVar.b(c14177xbed2eba0);
            c14177xbed2eba0.m7179xd020a803(null);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, -2);
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16);
            c14177xbed2eba0.addView(viewGroup, layoutParams);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar2 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
            cVar2.d(c14177xbed2eba0);
            cVar2.e(viewGroup.getId(), 1, 0, 1);
            cVar2.e(viewGroup.getId(), 2, 0, 2);
            cVar2.e(viewGroup.getId(), 4, c1073x7e08a787.getId(), 3);
            cVar2.b(c14177xbed2eba0);
            c14177xbed2eba0.m7179xd020a803(null);
            viewGroup = c14177xbed2eba0;
        }
        this.M = viewGroup;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        return viewGroup;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void g1(android.content.res.Configuration configuration) {
        if (x0()) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f446856d;
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext());
        if (b17.x >= (b17.y / 3) * 2) {
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = b17.x / 2;
            viewGroup.setLayoutParams(layoutParams);
            return;
        }
        we2.s sVar = (we2.s) S0().a(we2.s.class);
        int i17 = b17.x;
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int marginStart = i17 - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart();
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        sVar.f526790i = marginStart - ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void i1(android.os.Bundle bundle) {
        C1().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nf(this));
    }

    @Override // he2.b
    public void j(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return x0() || this.L;
    }

    @Override // he2.b
    public void w(int i17) {
        if (x0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14364x8eb8469 c14364x8eb8469 = this.f195043w;
            if (i17 == -2) {
                c14364x8eb8469.b(i17, false);
            } else {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14364x8eb8469.f197653n;
                c14364x8eb8469.b(0, true);
            }
        }
    }

    public final void w1() {
        java.lang.Boolean bool = ((mm2.c1) P0(mm2.c1.class)).G3;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (this.H != booleanValue) {
                java.lang.System.currentTimeMillis();
                this.H = booleanValue;
                if (booleanValue) {
                    P1(false);
                    y1(this, java.lang.Boolean.TRUE, 0, 2, null);
                    C1().setVisibility(0);
                } else {
                    P1(true);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "enableLiveRoomComment:" + booleanValue);
            }
        }
    }

    public final void x1(java.lang.Boolean bool, int i17) {
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE);
        bm2.o1 o1Var = this.D;
        if (b17) {
            if (1 <= i17 && i17 < 30) {
                int mo1894x7e414b06 = o1Var.mo1894x7e414b06() - 1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14339x748bebd7 C12 = C1();
                if (mo1894x7e414b06 < 0) {
                    mo1894x7e414b06 = 0;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(mo1894x7e414b06));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(C12, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                C12.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(C12, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                this.I = ((mm2.c1) P0(mm2.c1.class)).f410308a2;
            }
        }
        if (i17 >= 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14339x748bebd7 C13 = C1();
            int mo1894x7e414b062 = o1Var.mo1894x7e414b06() - 1;
            if (mo1894x7e414b062 < 0) {
                mo1894x7e414b062 = 0;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(mo1894x7e414b062));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(C13, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "scrollToPosition", "(I)V");
            C13.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(C13, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "scrollToPosition", "(I)V");
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14339x748bebd7 C14 = C1();
            int mo1894x7e414b063 = o1Var.mo1894x7e414b06() - 1;
            if (mo1894x7e414b063 < 0) {
                mo1894x7e414b063 = 0;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(java.lang.Integer.valueOf(mo1894x7e414b063));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(C14, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "scrollToPosition", "(I)V");
            C14.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(C14, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin", "commentScrollToEnd", "(Ljava/lang/Boolean;I)V", "Undefined", "scrollToPosition", "(I)V");
        }
        this.I = ((mm2.c1) P0(mm2.c1.class)).f410308a2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        super.z0();
        ((we2.s) S0().a(we2.s.class)).N6().f315643i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oe(new java.lang.ref.SoftReference(this));
        ((we2.s) S0().a(we2.s.class)).N6().f315642h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ne(new java.lang.ref.SoftReference(this));
        ((mm2.e1) S0().a(mm2.e1.class)).f410519p.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cf(this));
        ((mm2.x4) S0().a(mm2.x4.class)).f411078z.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ef(this));
        ((je2.h) P0(je2.h.class)).f380766f.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ff(this));
        df2.a9 a9Var = (df2.a9) U0(df2.a9.class);
        if (a9Var != null && (c14227x4262fb44 = a9Var.A) != null) {
            c14227x4262fb44.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hf(this));
        }
        ((mm2.x4) S0().a(mm2.x4.class)).B.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.Cif(this));
        ((mm2.c1) S0().a(mm2.c1.class)).C3.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jf(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lf(this, null), 3, null);
    }

    public final int z1() {
        android.view.ViewGroup viewGroup = this.f195037q;
        android.view.View findViewById = viewGroup != null ? viewGroup.findViewById(com.p314xaae8f345.mm.R.id.eqz) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60.class);
        if (r60Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var2 = r60Var.w0() == 0 ? r60Var : null;
            if (r60Var2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var = r60Var2.f195633u;
                if (ep0Var == null) {
                    ep0Var = r60Var2.f195634v;
                }
                if (ep0Var == null) {
                    return 0;
                }
                android.view.View findViewById2 = ep0Var.mo56902xfb86a31b().findViewById(ep0Var.p0());
                return findViewById2 != null ? findViewById2.getHeight() : (int) ep0Var.mo56902xfb86a31b().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561186br);
            }
        }
        if (findViewById != null) {
            return findViewById.getHeight();
        }
        return 0;
    }
}
