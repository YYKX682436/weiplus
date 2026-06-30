package bm2;

/* loaded from: classes3.dex */
public final class n5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {
    public java.lang.String A;
    public final java.util.ArrayList B;
    public yz5.l C;
    public int D;
    public bm2.q4 E;
    public final android.view.View F;
    public final int G;
    public android.view.ViewGroup H;
    public final int[] I;

    /* renamed from: J, reason: collision with root package name */
    public int f103673J;
    public int K;
    public boolean L;
    public yz5.a M;
    public final java.util.ArrayList N;
    public java.util.ArrayList P;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl Q;
    public java.util.List R;
    public final int S;
    public final int T;
    public int U;
    public int V;
    public java.lang.Integer W;
    public java.lang.String X;
    public final yz5.l Y;
    public final android.graphics.Rect Z;

    /* renamed from: d, reason: collision with root package name */
    public final zl2.u4 f103674d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f103675e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.res.Resources f103676f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f103677g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c f103678h;

    /* renamed from: i, reason: collision with root package name */
    public final mm2.c1 f103679i;

    /* renamed from: m, reason: collision with root package name */
    public final mm2.f5 f103680m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f103681n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f103682o;

    /* renamed from: p, reason: collision with root package name */
    public final int f103683p;

    /* renamed from: q, reason: collision with root package name */
    public final int f103684q;

    /* renamed from: r, reason: collision with root package name */
    public final int f103685r;

    /* renamed from: s, reason: collision with root package name */
    public final int f103686s;

    /* renamed from: t, reason: collision with root package name */
    public final int f103687t;

    /* renamed from: u, reason: collision with root package name */
    public final int f103688u;

    /* renamed from: v, reason: collision with root package name */
    public final int f103689v;

    /* renamed from: w, reason: collision with root package name */
    public final int f103690w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f103691x;

    /* renamed from: y, reason: collision with root package name */
    public int f103692y;

    /* renamed from: z, reason: collision with root package name */
    public long f103693z;

    public n5(zl2.u4 uiMode, android.content.Context context, android.content.res.Resources resources, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, android.view.View stickViewContainer, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c contentGroup, mm2.c1 liveCommonSlice, mm2.f5 liveOnlineMemberSlice, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l plugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiMode, "uiMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resources, "resources");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stickViewContainer, "stickViewContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentGroup, "contentGroup");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveCommonSlice, "liveCommonSlice");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveOnlineMemberSlice, "liveOnlineMemberSlice");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f103674d = uiMode;
        this.f103675e = context;
        this.f103676f = resources;
        this.f103677g = stickViewContainer;
        this.f103678h = contentGroup;
        this.f103679i = liveCommonSlice;
        this.f103680m = liveOnlineMemberSlice;
        this.f103681n = plugin;
        this.f103682o = "FinderLiveMemberLinearAdapter";
        int i17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        this.f103683p = 1;
        this.f103684q = 2;
        this.f103685r = 3;
        this.f103686s = 4;
        this.f103687t = 5;
        this.f103688u = 6;
        this.f103689v = 7;
        this.f103690w = 9;
        this.f103691x = true;
        this.A = "";
        this.B = new java.util.ArrayList();
        this.D = Integer.MAX_VALUE;
        android.view.View findViewById = stickViewContainer.findViewById(com.p314xaae8f345.mm.R.id.f9e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.F = findViewById;
        this.I = new int[2];
        this.N = new java.util.ArrayList();
        if (!E()) {
            int c17 = com.p314xaae8f345.mm.ui.bl.b(recyclerView.getContext()).y - com.p314xaae8f345.mm.ui.bl.c(recyclerView.getContext());
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            this.G = c17 - (layoutParams != null ? layoutParams.height : 0);
            findViewById.setBackgroundColor(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.agt));
            recyclerView.i(new bm2.j4(this));
            ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) contentGroup.findViewById(com.p314xaae8f345.mm.R.id.f9b)).a(new bm2.k4(this));
        }
        this.S = (int) (i17 * 0.25f);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561214ch);
        this.T = dimensionPixelOffset;
        this.U = dimensionPixelOffset;
        this.V = dimensionPixelOffset;
        this.Y = new bm2.g5(this);
        this.Z = new android.graphics.Rect();
    }

    public static final void x(bm2.n5 n5Var, bm2.m4 m4Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        n5Var.getClass();
        r45.xn1 xn1Var = m4Var.f103634a;
        java.lang.String str = null;
        n5Var.W = xn1Var != null ? java.lang.Integer.valueOf(xn1Var.m75939xb282bd08(7)) : null;
        r45.xn1 xn1Var2 = m4Var.f103634a;
        if (xn1Var2 != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) != null) {
            str = c19782x23db1cfa.m76197x6c03c64c();
        }
        n5Var.X = str;
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nw(n5Var.f103675e, true, n5Var.Y).w();
    }

    public final void B() {
        java.util.List list = this.R;
        if (list != null) {
            java.util.ArrayList arrayList = this.B;
            kz5.h0.B(arrayList, new bm2.f5(this));
            arrayList.add(0, new bm2.m4(null, this.f103690w, 0, 0, false, null, 0, new java.util.LinkedList(list), 112, null));
        }
    }

    public final boolean E() {
        if (zl2.r4.f555483a.w1()) {
            return true;
        }
        mm2.c1 c1Var = this.f103679i;
        if (c1Var.T) {
            return true;
        }
        return ((mm2.n0) c1Var.f410496d.a(mm2.n0.class)).f410806r;
    }

    public final void I(bm2.q4 q4Var, int i17, r45.xn1 xn1Var, boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        long m75942xfb822ef2 = xn1Var != null ? xn1Var.m75942xfb822ef2(15) : 0L;
        int i18 = this.f103692y + (E() ? 1 : 0);
        java.util.ArrayList arrayList = this.N;
        int size = i18 + arrayList.size() + 0;
        mm2.x0 x0Var = mm2.c1.f410306y6;
        java.lang.String str2 = this.f103682o;
        java.lang.String str3 = null;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("myself position:");
            sb6.append(i17);
            sb6.append('(');
            sb6.append(size);
            sb6.append("),rewardAmount:");
            sb6.append(m75942xfb822ef2);
            sb6.append(",badgeInfo:");
            sb6.append(x0Var.a(xn1Var != null ? xn1Var.m75941xfb821914(11) : null));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
            str = "setRankTv ";
        } else {
            zl2.r4 r4Var = zl2.r4.f555483a;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setRankTv ");
            str = "setRankTv ";
            sb7.append((xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76184x8010e5e4());
            sb7.append(",position:");
            sb7.append(i17);
            sb7.append('(');
            sb7.append(size);
            sb7.append("),rewardAmount:");
            sb7.append(m75942xfb822ef2);
            sb7.append(",badgeInfo:");
            sb7.append(x0Var.a(xn1Var != null ? xn1Var.m75941xfb821914(11) : null));
            r4Var.M2(str2, sb7.toString());
        }
        q4Var.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.e6m, java.lang.Long.valueOf(m75942xfb822ef2));
        boolean z18 = this.L;
        android.content.res.Resources resources = this.f103676f;
        android.widget.TextView textView = q4Var.f103778d;
        if (z18) {
            int size2 = (((i17 - arrayList.size()) - 0) - (E() ? 1 : 0)) + 1;
            if (size2 <= 0) {
                textView.setText("-");
            } else {
                textView.setText(java.lang.String.valueOf(size2));
            }
            q4Var.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.e6l, textView.getText());
            textView.setTextColor(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            textView.setTextSize(1, 15.0f);
            return;
        }
        if (m75942xfb822ef2 <= 0 || i17 >= size) {
            q4Var.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.e6l, "");
            textView.setTextColor(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            textView.setText("-");
            return;
        }
        int size3 = (((i17 - arrayList.size()) - 0) - (E() ? 1 : 0)) + 1;
        textView.setText(java.lang.String.valueOf(size3));
        q4Var.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.e6l, java.lang.String.valueOf(size3));
        textView.setTextColor(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        textView.setTextSize(1, 15.0f);
        if (z17) {
            return;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(str);
        if (xn1Var != null && (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) != null) {
            str3 = c19782x23db1cfa2.m76184x8010e5e4();
        }
        sb8.append(str3);
        sb8.append(",position:");
        sb8.append(i17);
        sb8.append('(');
        sb8.append(size);
        sb8.append("),rewardAmount:");
        sb8.append(m75942xfb822ef2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb8.toString());
    }

    public final void J(bm2.q4 q4Var, int i17, r45.xn1 xn1Var, boolean z17) {
        java.lang.String string;
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (!r4Var.s(this.f103679i.f410496d)) {
            q4Var.f103788q.setVisibility(8);
            return;
        }
        if (!this.L) {
            java.lang.String S = zl2.r4.S(r4Var, xn1Var != null ? xn1Var.m75942xfb822ef2(15) : 0L, 0, 2, null);
            q4Var.f103788q.setVisibility(0);
            q4Var.f103788q.setText(S);
            return;
        }
        int m75939xb282bd08 = xn1Var != null ? xn1Var.m75939xb282bd08(19) : 0;
        q4Var.f103788q.setVisibility(0);
        int i18 = m75939xb282bd08 / 60;
        int i19 = i18 / 60;
        int i27 = i18 % 60;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (i19 > 0 && i27 > 0) {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p3b, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        } else if (i19 > 0) {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p2g, java.lang.Integer.valueOf(i19));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        } else {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p3c, java.lang.Integer.valueOf(i27));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        }
        q4Var.f103788q.setText(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x044e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(bm2.q4 r37, int r38, bm2.m4 r39, java.lang.Boolean r40) {
        /*
            Method dump skipped, instructions count: 1415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.n5.K(bm2.q4, int, bm2.m4, java.lang.Boolean):void");
    }

    public final void L(bm2.m4 m4Var, android.view.ViewGroup view) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        if (!this.f103680m.N6() || gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_MEMBER_PANEL_SWITCH_ROLE_GUIDE_SHOWN_BOOLEAN_SYNC, false)) {
            return;
        }
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        r45.xn1 xn1Var = m4Var.f103634a;
        java.lang.String m76197x6c03c64c = (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76197x6c03c64c();
        r45.xn1 xn1Var2 = m4Var.f103634a;
        ml2.r0.zk(r0Var, 7, m76197x6c03c64c, xn1Var2 != null ? java.lang.Integer.valueOf(xn1Var2.m75939xb282bd08(7)) : null, null, null, 24, null);
        android.content.Context context = this.f103675e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl slVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl(context);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573032m82);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        slVar.c(string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        slVar.f201333d = view;
        android.widget.TextView textView = slVar.f201331b;
        android.content.Context context2 = textView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        textView.setHeight(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(context2, 48));
        slVar.f201341l = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kl.f200377d;
        slVar.f201340k = context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0);
        slVar.f201339j = android.graphics.Color.parseColor("#4C4C4C");
        slVar.f201342m = 45;
        slVar.b();
        this.Q = slVar;
        slVar.a(view, new int[2]);
        android.view.ViewGroup viewGroup = this.H;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        android.view.ViewGroup viewGroup2 = this.H;
        if (viewGroup2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl slVar2 = this.Q;
            viewGroup2.addView(slVar2 != null ? slVar2.getContentView() : null, -2, -2);
        }
        android.view.ViewGroup viewGroup3 = this.H;
        if (viewGroup3 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(viewGroup3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "showSwitchRoleGuide", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$FinderLiveContactInfo;Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(viewGroup3, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "showSwitchRoleGuide", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$FinderLiveContactInfo;Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.H == null) {
            return;
        }
        bm2.m5 m5Var = new bm2.m5(this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f103678h;
        c22613xe7040d9c.post(m5Var);
        c22613xe7040d9c.setOnTouchListener(new bm2.i5(this, m4Var));
    }

    public final void M(java.util.ArrayList rewardOnlineMember, java.util.List onlineMembers, r45.xn1 xn1Var, java.util.List offlineMembers, int i17, int i18, long j17, java.lang.String svrHeatStr, boolean z17) {
        boolean z18;
        boolean z19;
        boolean z27;
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rewardOnlineMember, "rewardOnlineMember");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onlineMembers, "onlineMembers");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(offlineMembers, "offlineMembers");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(svrHeatStr, "svrHeatStr");
        this.f103692y = onlineMembers.size();
        this.f103693z = j17;
        this.A = svrHeatStr;
        java.lang.String str2 = this.f103682o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "heatlimit totalHeatValue:" + j17 + ", svrHeatStr:" + svrHeatStr);
        this.f103691x = z17;
        java.util.ArrayList arrayList = this.B;
        arrayList.clear();
        this.D = Integer.MAX_VALUE;
        z();
        this.P = rewardOnlineMember;
        java.util.ArrayList arrayList2 = this.N;
        arrayList.removeAll(arrayList2);
        arrayList2.clear();
        int i19 = 0;
        if (!rewardOnlineMember.isEmpty()) {
            arrayList2.add(new bm2.m4(null, this.f103688u, 0, 0, false, null, 0, null, 240, null));
            int size = rewardOnlineMember.size();
            if (size > 3) {
                size = 3;
            }
            int i27 = 0;
            while (i27 < size) {
                java.lang.Object obj = rewardOnlineMember.get(i27);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                r45.r62 r62Var = (r45.r62) obj;
                arrayList2.add(new bm2.m4((r45.xn1) r62Var.m75936x14adae67(i19), this.f103687t, 0, 0, false, r62Var.m75941xfb821914(1), 0, null, 208, null));
                i27++;
                i19 = 0;
            }
            if (rewardOnlineMember.size() > 3) {
                arrayList2.add(new bm2.m4(null, this.f103689v, 0, 0, false, null, 0, null, 240, null));
            }
        }
        arrayList.addAll(arrayList2);
        if (!onlineMembers.isEmpty()) {
            if (E()) {
                arrayList.add(new bm2.m4(null, this.f103684q, this.f103692y, 0, false, null, 0, null, 240, null));
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            int i28 = 0;
            boolean z28 = false;
            for (java.lang.Object obj2 : onlineMembers) {
                int i29 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.xn1 xn1Var2 = (r45.xn1) obj2;
                bm2.m4 m4Var = new bm2.m4(xn1Var2, 0, 0, 0, false, null, 0, null, 240, null);
                zl2.r4 r4Var = zl2.r4.f555483a;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0);
                if (!zl2.r4.R1(r4Var, c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76197x6c03c64c() : null, (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76197x6c03c64c(), false, 4, null)) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0);
                    if (!r4Var.c2(c19782x23db1cfa3 != null ? c19782x23db1cfa3.m76197x6c03c64c() : null)) {
                        arrayList3.add(m4Var);
                        i28 = i29;
                    }
                }
                this.D = i28 + (E() ? 1 : 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "Found self item " + this.D);
                m4Var.f103637d = true;
                z28 = true;
                arrayList3.add(m4Var);
                i28 = i29;
            }
            arrayList.addAll(arrayList3);
            if (!z17 || E()) {
                z19 = false;
                z18 = true;
            } else {
                if (z28 || xn1Var == null) {
                    str = "get(...)";
                    z19 = false;
                    z18 = true;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "Add self item");
                    this.D = arrayList.size();
                    str = "get(...)";
                    z19 = false;
                    z18 = true;
                    arrayList.add(new bm2.m4(xn1Var, 0, 0, 0, true, null, 0, null, 224, null));
                }
                int i37 = this.D;
                if (i37 >= 0 && i37 < arrayList.size()) {
                    int i38 = this.D;
                    java.lang.Object obj3 = arrayList.get(i38);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, str);
                    bm2.m4 m4Var2 = (bm2.m4) obj3;
                    android.view.View view = this.F;
                    this.E = new bm2.q4(this, view);
                    view.setTag(java.lang.Boolean.TRUE);
                    bm2.q4 q4Var = this.E;
                    if (q4Var != null) {
                        this.H = q4Var.f103779e;
                        android.view.ViewGroup viewGroup = q4Var.f103780f;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewGroup, "<get-avatarLayout>(...)");
                        L(m4Var2, viewGroup);
                        boolean z29 = m4Var2.f103637d;
                        r45.xn1 xn1Var3 = m4Var2.f103634a;
                        I(q4Var, i38, xn1Var3, z29);
                        J(q4Var, i38, xn1Var3, m4Var2.f103637d);
                        K(q4Var, i38, m4Var2, java.lang.Boolean.FALSE);
                    }
                    view.setOnClickListener(new bm2.e5(this, m4Var2));
                }
            }
            z27 = z28;
        } else {
            z18 = true;
            z19 = false;
            z27 = false;
        }
        if (E()) {
            int i39 = this.f103692y;
            if (i17 > i39) {
                arrayList.add(new bm2.m4(null, this.f103686s, i39, 0, false, null, 0, null, 240, null));
            }
        } else if (this.f103673J == 0) {
            int size2 = arrayList.size();
            int i47 = this.K;
            if (size2 >= i47) {
                arrayList.add(new bm2.m4(null, this.f103686s, i47, 0, false, null, 0, null, 240, null));
            }
        }
        B();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMemberList enableGift:");
        sb6.append(z17);
        sb6.append(",onlineList size:");
        sb6.append(this.f103692y);
        sb6.append(",continueFlag：");
        sb6.append(this.f103673J);
        sb6.append(",maxMemberCount:");
        sb6.append(this.K);
        sb6.append(",selfContact is empty:");
        sb6.append(xn1Var == null ? z18 : z19);
        sb6.append(",self amount heat:");
        sb6.append(xn1Var != null ? java.lang.Integer.valueOf(xn1Var.m75939xb282bd08(3)) : null);
        sb6.append(", live_heat_value:");
        sb6.append(xn1Var != null ? java.lang.Long.valueOf(xn1Var.m75942xfb822ef2(15)) : null);
        sb6.append(", haveSelfItem:");
        sb6.append(z27);
        sb6.append(",selfItemPosition:");
        sb6.append(this.D);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.B.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((bm2.m4) this.B.get(i17)).f103635b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v63 */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r21, int r22) {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.n5.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        boolean z17 = true;
        if (i17 == 0 || i17 == this.f103683p) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.at7, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new bm2.q4(this, inflate);
        }
        if (i17 != this.f103684q && i17 != this.f103685r) {
            z17 = false;
        }
        if (z17) {
            android.view.View inflate2 = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570448at5, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
            return new bm2.p4(this, inflate2);
        }
        if (i17 == this.f103686s) {
            android.view.View inflate3 = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570447at4, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
            return new bm2.o4(this, inflate3);
        }
        if (i17 == this.f103687t) {
            android.view.View inflate4 = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.at9, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate4, "inflate(...)");
            return new bm2.b5(this, inflate4);
        }
        if (i17 == this.f103688u) {
            android.view.View inflate5 = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.at_, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate5, "inflate(...)");
            return new bm2.x4(this, inflate5);
        }
        if (i17 == this.f103689v) {
            android.view.View inflate6 = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.at8, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate6, "inflate(...)");
            return new bm2.w4(this, inflate6);
        }
        if (i17 == this.f103690w) {
            return new bm2.n4(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14325xe0883bfd(this.f103675e, null, 0, this.f103674d, 6, null));
        }
        android.view.View inflate7 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.at7, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate7, "inflate(...)");
        return new bm2.q4(this, inflate7);
    }

    public final void y() {
        android.view.ViewGroup viewGroup = this.H;
        if (viewGroup != null) {
            boolean z17 = false;
            if (viewGroup != null && viewGroup.getChildCount() == 0) {
                z17 = true;
            }
            if (z17) {
                return;
            }
            android.view.ViewGroup viewGroup2 = this.H;
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
            this.H = null;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_MEMBER_PANEL_SWITCH_ROLE_GUIDE_SHOWN_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            this.f103678h.m81304xd9ff9323(null);
        }
    }

    public final void z() {
        android.view.View view = this.f103677g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "hideStickContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "hideStickContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.F.setTag(java.lang.Boolean.FALSE);
    }
}
