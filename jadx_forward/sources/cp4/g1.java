package cp4;

/* loaded from: classes8.dex */
public final class g1 extends android.widget.LinearLayout {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f302536J = 0;
    public final java.util.List A;
    public yz5.a B;
    public yz5.l C;
    public yz5.l D;
    public yz5.p E;
    public yz5.p F;
    public yz5.a G;
    public final java.util.List H;
    public boolean I;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f302537d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f302538e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f302539f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f302540g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f302541h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f302542i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f302543m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f302544n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f302545o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f302546p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f302547q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f302548r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f302549s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f302550t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f302551u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f302552v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f302553w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f302554x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f302555y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f302556z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f302537d = jz5.h.b(new cp4.m0(this));
        this.f302538e = jz5.h.b(new cp4.p0(this));
        this.f302539f = jz5.h.b(new cp4.n0(this));
        this.f302540g = jz5.h.b(new cp4.y0(this));
        this.f302541h = jz5.h.b(new cp4.a1(this));
        this.f302542i = jz5.h.b(new cp4.z0(this));
        this.f302543m = jz5.h.b(new cp4.o0(this));
        this.f302544n = jz5.h.b(new cp4.l0(this));
        this.f302545o = jz5.h.b(new cp4.x0(this));
        this.f302546p = jz5.h.b(new cp4.f1(this));
        this.f302547q = jz5.h.b(new cp4.e1(this));
        this.f302548r = jz5.h.b(new cp4.b1(this));
        this.f302549s = jz5.h.b(new cp4.d1(this));
        this.f302550t = jz5.h.b(new cp4.c1(this));
        this.f302551u = jz5.h.b(new cp4.r0(this));
        this.f302552v = jz5.h.b(new cp4.q0(this));
        this.f302553w = jz5.h.b(new cp4.u0(this));
        this.f302554x = jz5.h.b(new cp4.v0(this));
        this.f302555y = jz5.h.b(new cp4.s0(this));
        this.f302556z = jz5.h.b(new cp4.w0(this));
        this.A = kz5.c0.i(new cp4.k0(this, 0, context), new cp4.k0(this, 1, context));
        this.H = kz5.c0.k(0, 0);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a5s, (android.view.ViewGroup) this, true);
        setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562438f8);
        setOrientation(1);
        m122393x9cf1d94d().setVisibility(4);
        m122394x1360c5a1().setVisibility(0);
        m122387xb8e853c5().setOnClickListener(new cp4.a0(this));
        m122398x29ddda76().setOnClickListener(new cp4.b0(this));
        findViewById(com.p314xaae8f345.mm.R.id.f565076b61).setOnClickListener(new cp4.c0(this));
        findViewById(com.p314xaae8f345.mm.R.id.oio).setOnClickListener(new cp4.d0(this));
        findViewById(com.p314xaae8f345.mm.R.id.bxp).setOnClickListener(new cp4.e0(this));
        m122404x298beefb().setOnClickListener(new cp4.f0(this));
        m122392xd5bfe974().setOnClickListener(new cp4.g0(this));
        for (int i17 = 0; i17 < 2; i17++) {
            m122391x2042629e().get(i17).mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2329x20ef99e6.C18798x1f17fe0a(context, 1));
            m122391x2042629e().get(i17).mo7960x6cab2c8d((p012xc85e97e9.p103xe821e364.p104xd1075a44.f2) this.A.get(i17));
            m122391x2042629e().get(i17).i(new cp4.h0(this, i17));
        }
    }

    public static final boolean f(cp4.g1 g1Var, int i17, android.view.View view) {
        if (view == null) {
            g1Var.getClass();
            return false;
        }
        int top = (g1Var.m122391x2042629e().get(i17).getTop() + g1Var.m122391x2042629e().get(i17).getBottom()) / 2;
        return top < view.getBottom() && view.getTop() <= top;
    }

    public static final void g(cp4.g1 g1Var, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = g1Var.m122391x2042629e().get(i17).getLayoutManager();
        if (layoutManager != null) {
            layoutManager.mo7942xd1b4653f(g1Var.m122391x2042629e().get(i17), new p012xc85e97e9.p103xe821e364.p104xd1075a44.h3(), ((java.lang.Number) g1Var.H.get(i17)).intValue());
        }
    }

    /* renamed from: getCaptionPanel */
    private final android.view.ViewGroup m122386x1fea5234() {
        return (android.view.ViewGroup) ((jz5.n) this.f302544n).mo141623x754a37bb();
    }

    /* renamed from: getCaptionTab */
    private final android.view.ViewGroup m122387xb8e853c5() {
        return (android.view.ViewGroup) ((jz5.n) this.f302537d).mo141623x754a37bb();
    }

    /* renamed from: getCaptionTabIndicator */
    private final android.view.View m122388xe54af7ca() {
        return (android.view.View) ((jz5.n) this.f302539f).mo141623x754a37bb();
    }

    /* renamed from: getCaptionTabSpace */
    private final android.view.View m122389x8f444041() {
        return (android.view.View) ((jz5.n) this.f302543m).mo141623x754a37bb();
    }

    /* renamed from: getCaptionTabText */
    private final android.widget.TextView m122390xa186a292() {
        return (android.widget.TextView) ((jz5.n) this.f302538e).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCaptionViews */
    public final java.util.List<p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4> m122391x2042629e() {
        return (java.util.List) ((jz5.n) this.f302552v).mo141623x754a37bb();
    }

    /* renamed from: getClearRecordBtn */
    private final android.view.ViewGroup m122392xd5bfe974() {
        return (android.view.ViewGroup) ((jz5.n) this.f302551u).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getContentLayout */
    public final android.widget.LinearLayout m122393x9cf1d94d() {
        return (android.widget.LinearLayout) ((jz5.n) this.f302555y).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getEmptyLayout */
    public final android.widget.LinearLayout m122394x1360c5a1() {
        return (android.widget.LinearLayout) ((jz5.n) this.f302553w).mo141623x754a37bb();
    }

    /* renamed from: getEmptyTipTxt */
    private final android.widget.TextView m122395x2173ca4c() {
        return (android.widget.TextView) ((jz5.n) this.f302554x).mo141623x754a37bb();
    }

    /* renamed from: getLoadingView */
    private final android.view.View m122396xcc04d8cb() {
        return (android.view.View) ((jz5.n) this.f302556z).mo141623x754a37bb();
    }

    /* renamed from: getRecordCaptionPanel */
    private final android.view.ViewGroup m122397x2998f0a5() {
        return (android.view.ViewGroup) ((jz5.n) this.f302545o).mo141623x754a37bb();
    }

    /* renamed from: getRecordCaptionTab */
    private final android.view.ViewGroup m122398x29ddda76() {
        return (android.view.ViewGroup) ((jz5.n) this.f302540g).mo141623x754a37bb();
    }

    /* renamed from: getRecordCaptionTabIndicator */
    private final android.view.View m122399xff36839() {
        return (android.view.View) ((jz5.n) this.f302542i).mo141623x754a37bb();
    }

    /* renamed from: getRecordCaptionTabText */
    private final android.widget.TextView m122400xfa0768c3() {
        return (android.widget.TextView) ((jz5.n) this.f302541h).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRecordContentLayout */
    public final android.view.ViewGroup m122401xc91708fc() {
        return (android.view.ViewGroup) ((jz5.n) this.f302548r).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRecordEmptyLayout */
    public final android.view.ViewGroup m122402xc11c1510() {
        return (android.view.ViewGroup) ((jz5.n) this.f302550t).mo141623x754a37bb();
    }

    /* renamed from: getRecordLoadingView */
    private final android.view.View m122403x79c0283a() {
        return (android.view.View) ((jz5.n) this.f302549s).mo141623x754a37bb();
    }

    /* renamed from: getRecordTransBtn */
    private final android.widget.TextView m122404x298beefb() {
        return (android.widget.TextView) ((jz5.n) this.f302547q).mo141623x754a37bb();
    }

    /* renamed from: getTransBtn */
    private final android.widget.TextView m122405xc832700a() {
        return (android.widget.TextView) ((jz5.n) this.f302546p).mo141623x754a37bb();
    }

    public static final void h(cp4.g1 g1Var, int i17) {
        g1Var.getClass();
        if (i17 == 0) {
            android.view.View m122388xe54af7ca = g1Var.m122388xe54af7ca();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m122388xe54af7ca, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", nd1.h2.f72938x24728b, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m122388xe54af7ca.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m122388xe54af7ca, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", nd1.h2.f72938x24728b, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View m122399xff36839 = g1Var.m122399xff36839();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m122399xff36839, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", nd1.h2.f72938x24728b, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m122399xff36839.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m122399xff36839, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", nd1.h2.f72938x24728b, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g1Var.m122390xa186a292().setTextColor(g1Var.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            g1Var.m122400xfa0768c3().setTextColor(g1Var.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561083ab1));
            g1Var.m122386x1fea5234().setVisibility(0);
            g1Var.m122397x2998f0a5().setVisibility(8);
            return;
        }
        android.view.View m122388xe54af7ca2 = g1Var.m122388xe54af7ca();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(m122388xe54af7ca2, arrayList3.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", nd1.h2.f72938x24728b, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m122388xe54af7ca2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(m122388xe54af7ca2, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", nd1.h2.f72938x24728b, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View m122399xff368392 = g1Var.m122399xff36839();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(m122399xff368392, arrayList4.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", nd1.h2.f72938x24728b, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m122399xff368392.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(m122399xff368392, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", nd1.h2.f72938x24728b, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g1Var.m122390xa186a292().setTextColor(g1Var.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561083ab1));
        g1Var.m122400xfa0768c3().setTextColor(g1Var.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        g1Var.m122386x1fea5234().setVisibility(8);
        g1Var.m122397x2998f0a5().setVisibility(0);
    }

    /* renamed from: getClearTransListener */
    public final yz5.p m122406xc0093425() {
        return this.E;
    }

    /* renamed from: getDismissListener */
    public final yz5.a m122407xcb2e8328() {
        return this.G;
    }

    /* renamed from: getItemClickListener */
    public final yz5.p m122408xc01af953() {
        return this.F;
    }

    /* renamed from: getStartTransListener */
    public final yz5.l m122409xc37c7030() {
        return this.D;
    }

    /* renamed from: getVideoPauseListener */
    public final yz5.a m122410x53d8d605() {
        return this.B;
    }

    /* renamed from: getVideoSeekListener */
    public final yz5.l m122411x91d90eb1() {
        return this.C;
    }

    public final void i(int i17, java.lang.String str) {
        java.util.List list = this.A;
        ((cp4.k0) list.get(i17)).f302576f.clear();
        ((cp4.k0) list.get(i17)).m8146xced61ae5();
        if (i17 == 0) {
            android.view.View m122396xcc04d8cb = m122396xcc04d8cb();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m122396xcc04d8cb, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "clearCaption", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m122396xcc04d8cb.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m122396xcc04d8cb, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "clearCaption", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m122393x9cf1d94d().setVisibility(4);
            m122394x1360c5a1().setVisibility(0);
        } else {
            android.view.View m122403x79c0283a = m122403x79c0283a();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m122403x79c0283a, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "clearCaption", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m122403x79c0283a.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m122403x79c0283a, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "clearCaption", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m122401xc91708fc().setVisibility(4);
            m122402xc11c1510().setVisibility(0);
        }
        if (str != null) {
            m122395x2173ca4c().setText(str);
        }
        yz5.p pVar = this.E;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(m122394x1360c5a1().getVisibility() == 4 || m122402xc11c1510().getVisibility() == 4));
        }
    }

    public final void j(int i17, long j17) {
        boolean z17;
        if (this.I) {
            return;
        }
        java.util.List list = this.A;
        if (((cp4.k0) list.get(i17)).f302576f.isEmpty()) {
            return;
        }
        java.util.List list2 = this.H;
        int intValue = ((java.lang.Number) list2.get(i17)).intValue();
        if (((java.lang.Number) list2.get(i17)).intValue() >= ((cp4.k0) list.get(i17)).f302576f.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorTextCaptionView", "maybe clear captionItems");
            list2.set(i17, java.lang.Integer.valueOf(((cp4.k0) list.get(i17)).f302576f.size() - 1));
        }
        if (((r45.is) ((cp4.k0) list.get(i17)).f302576f.get(((java.lang.Number) list2.get(i17)).intValue())).f458831e > j17) {
            list2.set(i17, 0);
            z17 = true;
        } else {
            z17 = false;
        }
        while (((r45.is) ((cp4.k0) list.get(i17)).f302576f.get(((java.lang.Number) list2.get(i17)).intValue())).f458832f < j17) {
            list2.set(i17, java.lang.Integer.valueOf(((java.lang.Number) list2.get(i17)).intValue() + 1));
        }
        ((cp4.k0) list.get(i17)).f302577g = ((java.lang.Number) list2.get(i17)).intValue();
        if (z17) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = m122391x2042629e().get(i17);
            int intValue2 = ((java.lang.Number) list2.get(i17)).intValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "time2Pos", "(IJ)I", "Undefined", "scrollToPosition", "(I)V");
            c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "time2Pos", "(IJ)I", "Undefined", "scrollToPosition", "(I)V");
        }
        ((java.lang.Number) list2.get(i17)).intValue();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m122391x2042629e().get(i17).getLayoutManager();
        if (layoutManager != null) {
            layoutManager.mo7942xd1b4653f(m122391x2042629e().get(i17), new p012xc85e97e9.p103xe821e364.p104xd1075a44.h3(), ((java.lang.Number) list2.get(i17)).intValue());
            ((cp4.k0) list.get(i17)).y(layoutManager.mo7935xa188593e(intValue));
            ((cp4.k0) list.get(i17)).x(layoutManager.mo7935xa188593e(((java.lang.Number) list2.get(i17)).intValue()), null);
        }
    }

    public final void k(int i17) {
        if (i17 == 0) {
            android.view.View m122396xcc04d8cb = m122396xcc04d8cb();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m122396xcc04d8cb, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showCaption", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m122396xcc04d8cb.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m122396xcc04d8cb, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showCaption", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m122394x1360c5a1().setVisibility(4);
            m122393x9cf1d94d().setVisibility(0);
            return;
        }
        android.view.View m122403x79c0283a = m122403x79c0283a();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m122403x79c0283a, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showCaption", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m122403x79c0283a.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(m122403x79c0283a, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showCaption", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m122402xc11c1510().setVisibility(4);
        m122401xc91708fc().setVisibility(0);
    }

    public final void l(int i17) {
        if (i17 == 0) {
            android.view.View m122396xcc04d8cb = m122396xcc04d8cb();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m122396xcc04d8cb, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showLoading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m122396xcc04d8cb.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m122396xcc04d8cb, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showLoading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m122393x9cf1d94d().setVisibility(4);
            m122394x1360c5a1().setVisibility(4);
            return;
        }
        android.view.View m122403x79c0283a = m122403x79c0283a();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m122403x79c0283a, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showLoading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m122403x79c0283a.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(m122403x79c0283a, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showLoading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m122401xc91708fc().setVisibility(4);
        m122402xc11c1510().setVisibility(4);
    }

    public final void m(int i17, r45.is transResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transResult, "transResult");
        java.util.List list = this.A;
        int i18 = 0;
        for (java.lang.Object obj : ((cp4.k0) list.get(i17)).f302576f) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.is isVar = (r45.is) obj;
            if (isVar.f458834h == transResult.f458834h) {
                isVar.f458830d = transResult.f458830d;
                ((cp4.k0) list.get(i17)).m8147xed6e4d18(i18);
                return;
            }
            i18 = i19;
        }
    }

    /* renamed from: setClearTransListener */
    public final void m122412x5734b631(yz5.p pVar) {
        this.E = pVar;
    }

    /* renamed from: setDismissListener */
    public final void m122413x2051c9c(yz5.a aVar) {
        this.G = aVar;
    }

    /* renamed from: setItemClickListener */
    public final void m122414x9bb105c7(yz5.p pVar) {
        this.F = pVar;
    }

    /* renamed from: setStartTransListener */
    public final void m122415x5aa7f23c(yz5.l lVar) {
        this.D = lVar;
    }

    /* renamed from: setVideoPauseListener */
    public final void m122416xeb045811(yz5.a aVar) {
        this.B = aVar;
    }

    /* renamed from: setVideoSeekListener */
    public final void m122417x6d6f1b25(yz5.l lVar) {
        this.C = lVar;
    }
}
