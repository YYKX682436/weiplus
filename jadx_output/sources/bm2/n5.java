package bm2;

/* loaded from: classes3.dex */
public final class n5 extends androidx.recyclerview.widget.f2 {
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
    public int f22140J;
    public int K;
    public boolean L;
    public yz5.a M;
    public final java.util.ArrayList N;
    public java.util.ArrayList P;
    public com.tencent.mm.plugin.finder.live.widget.sl Q;
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
    public final zl2.u4 f22141d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f22142e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.res.Resources f22143f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f22144g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.LiveBottomSheetPanel f22145h;

    /* renamed from: i, reason: collision with root package name */
    public final mm2.c1 f22146i;

    /* renamed from: m, reason: collision with root package name */
    public final mm2.f5 f22147m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f22148n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f22149o;

    /* renamed from: p, reason: collision with root package name */
    public final int f22150p;

    /* renamed from: q, reason: collision with root package name */
    public final int f22151q;

    /* renamed from: r, reason: collision with root package name */
    public final int f22152r;

    /* renamed from: s, reason: collision with root package name */
    public final int f22153s;

    /* renamed from: t, reason: collision with root package name */
    public final int f22154t;

    /* renamed from: u, reason: collision with root package name */
    public final int f22155u;

    /* renamed from: v, reason: collision with root package name */
    public final int f22156v;

    /* renamed from: w, reason: collision with root package name */
    public final int f22157w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f22158x;

    /* renamed from: y, reason: collision with root package name */
    public int f22159y;

    /* renamed from: z, reason: collision with root package name */
    public long f22160z;

    public n5(zl2.u4 uiMode, android.content.Context context, android.content.res.Resources resources, androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View stickViewContainer, com.tencent.mm.ui.widget.LiveBottomSheetPanel contentGroup, mm2.c1 liveCommonSlice, mm2.f5 liveOnlineMemberSlice, com.tencent.mm.plugin.finder.live.plugin.l plugin) {
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(resources, "resources");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(stickViewContainer, "stickViewContainer");
        kotlin.jvm.internal.o.g(contentGroup, "contentGroup");
        kotlin.jvm.internal.o.g(liveCommonSlice, "liveCommonSlice");
        kotlin.jvm.internal.o.g(liveOnlineMemberSlice, "liveOnlineMemberSlice");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f22141d = uiMode;
        this.f22142e = context;
        this.f22143f = resources;
        this.f22144g = stickViewContainer;
        this.f22145h = contentGroup;
        this.f22146i = liveCommonSlice;
        this.f22147m = liveOnlineMemberSlice;
        this.f22148n = plugin;
        this.f22149o = "FinderLiveMemberLinearAdapter";
        int i17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        this.f22150p = 1;
        this.f22151q = 2;
        this.f22152r = 3;
        this.f22153s = 4;
        this.f22154t = 5;
        this.f22155u = 6;
        this.f22156v = 7;
        this.f22157w = 9;
        this.f22158x = true;
        this.A = "";
        this.B = new java.util.ArrayList();
        this.D = Integer.MAX_VALUE;
        android.view.View findViewById = stickViewContainer.findViewById(com.tencent.mm.R.id.f9e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.F = findViewById;
        this.I = new int[2];
        this.N = new java.util.ArrayList();
        if (!E()) {
            int c17 = com.tencent.mm.ui.bl.b(recyclerView.getContext()).y - com.tencent.mm.ui.bl.c(recyclerView.getContext());
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            this.G = c17 - (layoutParams != null ? layoutParams.height : 0);
            findViewById.setBackgroundColor(resources.getColor(com.tencent.mm.R.color.agt));
            recyclerView.i(new bm2.j4(this));
            ((com.google.android.material.appbar.AppBarLayout) contentGroup.findViewById(com.tencent.mm.R.id.f9b)).a(new bm2.k4(this));
        }
        this.S = (int) (i17 * 0.25f);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f479681ch);
        this.T = dimensionPixelOffset;
        this.U = dimensionPixelOffset;
        this.V = dimensionPixelOffset;
        this.Y = new bm2.g5(this);
        this.Z = new android.graphics.Rect();
    }

    public static final void x(bm2.n5 n5Var, bm2.m4 m4Var) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        n5Var.getClass();
        r45.xn1 xn1Var = m4Var.f22101a;
        java.lang.String str = null;
        n5Var.W = xn1Var != null ? java.lang.Integer.valueOf(xn1Var.getInteger(7)) : null;
        r45.xn1 xn1Var2 = m4Var.f22101a;
        if (xn1Var2 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) != null) {
            str = finderContact.getUsername();
        }
        n5Var.X = str;
        new com.tencent.mm.plugin.finder.live.widget.nw(n5Var.f22142e, true, n5Var.Y).w();
    }

    public final void B() {
        java.util.List list = this.R;
        if (list != null) {
            java.util.ArrayList arrayList = this.B;
            kz5.h0.B(arrayList, new bm2.f5(this));
            arrayList.add(0, new bm2.m4(null, this.f22157w, 0, 0, false, null, 0, new java.util.LinkedList(list), 112, null));
        }
    }

    public final boolean E() {
        if (zl2.r4.f473950a.w1()) {
            return true;
        }
        mm2.c1 c1Var = this.f22146i;
        if (c1Var.T) {
            return true;
        }
        return ((mm2.n0) c1Var.f328963d.a(mm2.n0.class)).f329273r;
    }

    public final void I(bm2.q4 q4Var, int i17, r45.xn1 xn1Var, boolean z17) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        long j17 = xn1Var != null ? xn1Var.getLong(15) : 0L;
        int i18 = this.f22159y + (E() ? 1 : 0);
        java.util.ArrayList arrayList = this.N;
        int size = i18 + arrayList.size() + 0;
        mm2.x0 x0Var = mm2.c1.f328773y6;
        java.lang.String str2 = this.f22149o;
        java.lang.String str3 = null;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("myself position:");
            sb6.append(i17);
            sb6.append('(');
            sb6.append(size);
            sb6.append("),rewardAmount:");
            sb6.append(j17);
            sb6.append(",badgeInfo:");
            sb6.append(x0Var.a(xn1Var != null ? xn1Var.getList(11) : null));
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            str = "setRankTv ";
        } else {
            zl2.r4 r4Var = zl2.r4.f473950a;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setRankTv ");
            str = "setRankTv ";
            sb7.append((xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getNickname());
            sb7.append(",position:");
            sb7.append(i17);
            sb7.append('(');
            sb7.append(size);
            sb7.append("),rewardAmount:");
            sb7.append(j17);
            sb7.append(",badgeInfo:");
            sb7.append(x0Var.a(xn1Var != null ? xn1Var.getList(11) : null));
            r4Var.M2(str2, sb7.toString());
        }
        q4Var.itemView.setTag(com.tencent.mm.R.id.e6m, java.lang.Long.valueOf(j17));
        boolean z18 = this.L;
        android.content.res.Resources resources = this.f22143f;
        android.widget.TextView textView = q4Var.f22245d;
        if (z18) {
            int size2 = (((i17 - arrayList.size()) - 0) - (E() ? 1 : 0)) + 1;
            if (size2 <= 0) {
                textView.setText("-");
            } else {
                textView.setText(java.lang.String.valueOf(size2));
            }
            q4Var.itemView.setTag(com.tencent.mm.R.id.e6l, textView.getText());
            textView.setTextColor(resources.getColor(com.tencent.mm.R.color.FG_0));
            textView.setTextSize(1, 15.0f);
            return;
        }
        if (j17 <= 0 || i17 >= size) {
            q4Var.itemView.setTag(com.tencent.mm.R.id.e6l, "");
            textView.setTextColor(resources.getColor(com.tencent.mm.R.color.FG_0));
            textView.setText("-");
            return;
        }
        int size3 = (((i17 - arrayList.size()) - 0) - (E() ? 1 : 0)) + 1;
        textView.setText(java.lang.String.valueOf(size3));
        q4Var.itemView.setTag(com.tencent.mm.R.id.e6l, java.lang.String.valueOf(size3));
        textView.setTextColor(resources.getColor(com.tencent.mm.R.color.FG_0));
        textView.setTextSize(1, 15.0f);
        if (z17) {
            return;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(str);
        if (xn1Var != null && (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null) {
            str3 = finderContact2.getNickname();
        }
        sb8.append(str3);
        sb8.append(",position:");
        sb8.append(i17);
        sb8.append('(');
        sb8.append(size);
        sb8.append("),rewardAmount:");
        sb8.append(j17);
        com.tencent.mars.xlog.Log.i(str2, sb8.toString());
    }

    public final void J(bm2.q4 q4Var, int i17, r45.xn1 xn1Var, boolean z17) {
        java.lang.String string;
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (!r4Var.s(this.f22146i.f328963d)) {
            q4Var.f22255q.setVisibility(8);
            return;
        }
        if (!this.L) {
            java.lang.String S = zl2.r4.S(r4Var, xn1Var != null ? xn1Var.getLong(15) : 0L, 0, 2, null);
            q4Var.f22255q.setVisibility(0);
            q4Var.f22255q.setText(S);
            return;
        }
        int integer = xn1Var != null ? xn1Var.getInteger(19) : 0;
        q4Var.f22255q.setVisibility(0);
        int i18 = integer / 60;
        int i19 = i18 / 60;
        int i27 = i18 % 60;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (i19 > 0 && i27 > 0) {
            string = context.getString(com.tencent.mm.R.string.p3b, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
            kotlin.jvm.internal.o.f(string, "getString(...)");
        } else if (i19 > 0) {
            string = context.getString(com.tencent.mm.R.string.p2g, java.lang.Integer.valueOf(i19));
            kotlin.jvm.internal.o.f(string, "getString(...)");
        } else {
            string = context.getString(com.tencent.mm.R.string.p3c, java.lang.Integer.valueOf(i27));
            kotlin.jvm.internal.o.f(string, "getString(...)");
        }
        q4Var.f22255q.setText(string);
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
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        if (!this.f22147m.N6() || gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_MEMBER_PANEL_SWITCH_ROLE_GUIDE_SHOWN_BOOLEAN_SYNC, false)) {
            return;
        }
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        r45.xn1 xn1Var = m4Var.f22101a;
        java.lang.String username = (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getUsername();
        r45.xn1 xn1Var2 = m4Var.f22101a;
        ml2.r0.zk(r0Var, 7, username, xn1Var2 != null ? java.lang.Integer.valueOf(xn1Var2.getInteger(7)) : null, null, null, 24, null);
        android.content.Context context = this.f22142e;
        com.tencent.mm.plugin.finder.live.widget.sl slVar = new com.tencent.mm.plugin.finder.live.widget.sl(context);
        java.lang.String string = context.getString(com.tencent.mm.R.string.f491499m82);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        slVar.c(string);
        kotlin.jvm.internal.o.g(view, "view");
        slVar.f119800d = view;
        android.widget.TextView textView = slVar.f119798b;
        android.content.Context context2 = textView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        textView.setHeight(com.tencent.mm.plugin.appbrand.ui.u5.a(context2, 48));
        slVar.f119808l = com.tencent.mm.plugin.finder.live.widget.kl.f118844d;
        slVar.f119807k = context.getColor(com.tencent.mm.R.color.f479549ab0);
        slVar.f119806j = android.graphics.Color.parseColor("#4C4C4C");
        slVar.f119809m = 45;
        slVar.b();
        this.Q = slVar;
        slVar.a(view, new int[2]);
        android.view.ViewGroup viewGroup = this.H;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        android.view.ViewGroup viewGroup2 = this.H;
        if (viewGroup2 != null) {
            com.tencent.mm.plugin.finder.live.widget.sl slVar2 = this.Q;
            viewGroup2.addView(slVar2 != null ? slVar2.getContentView() : null, -2, -2);
        }
        android.view.ViewGroup viewGroup3 = this.H;
        if (viewGroup3 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f22145h;
        liveBottomSheetPanel.post(m5Var);
        liveBottomSheetPanel.setOnTouchListener(new bm2.i5(this, m4Var));
    }

    public final void M(java.util.ArrayList rewardOnlineMember, java.util.List onlineMembers, r45.xn1 xn1Var, java.util.List offlineMembers, int i17, int i18, long j17, java.lang.String svrHeatStr, boolean z17) {
        boolean z18;
        boolean z19;
        boolean z27;
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlin.jvm.internal.o.g(rewardOnlineMember, "rewardOnlineMember");
        kotlin.jvm.internal.o.g(onlineMembers, "onlineMembers");
        kotlin.jvm.internal.o.g(offlineMembers, "offlineMembers");
        kotlin.jvm.internal.o.g(svrHeatStr, "svrHeatStr");
        this.f22159y = onlineMembers.size();
        this.f22160z = j17;
        this.A = svrHeatStr;
        java.lang.String str2 = this.f22149o;
        com.tencent.mars.xlog.Log.i(str2, "heatlimit totalHeatValue:" + j17 + ", svrHeatStr:" + svrHeatStr);
        this.f22158x = z17;
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
            arrayList2.add(new bm2.m4(null, this.f22155u, 0, 0, false, null, 0, null, 240, null));
            int size = rewardOnlineMember.size();
            if (size > 3) {
                size = 3;
            }
            int i27 = 0;
            while (i27 < size) {
                java.lang.Object obj = rewardOnlineMember.get(i27);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                r45.r62 r62Var = (r45.r62) obj;
                arrayList2.add(new bm2.m4((r45.xn1) r62Var.getCustom(i19), this.f22154t, 0, 0, false, r62Var.getList(1), 0, null, 208, null));
                i27++;
                i19 = 0;
            }
            if (rewardOnlineMember.size() > 3) {
                arrayList2.add(new bm2.m4(null, this.f22156v, 0, 0, false, null, 0, null, 240, null));
            }
        }
        arrayList.addAll(arrayList2);
        if (!onlineMembers.isEmpty()) {
            if (E()) {
                arrayList.add(new bm2.m4(null, this.f22151q, this.f22159y, 0, false, null, 0, null, 240, null));
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
                zl2.r4 r4Var = zl2.r4.f473950a;
                com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0);
                if (!zl2.r4.R1(r4Var, finderContact2 != null ? finderContact2.getUsername() : null, (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getUsername(), false, 4, null)) {
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0);
                    if (!r4Var.c2(finderContact3 != null ? finderContact3.getUsername() : null)) {
                        arrayList3.add(m4Var);
                        i28 = i29;
                    }
                }
                this.D = i28 + (E() ? 1 : 0);
                com.tencent.mars.xlog.Log.i(str2, "Found self item " + this.D);
                m4Var.f22104d = true;
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
                    com.tencent.mars.xlog.Log.i(str2, "Add self item");
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
                    kotlin.jvm.internal.o.f(obj3, str);
                    bm2.m4 m4Var2 = (bm2.m4) obj3;
                    android.view.View view = this.F;
                    this.E = new bm2.q4(this, view);
                    view.setTag(java.lang.Boolean.TRUE);
                    bm2.q4 q4Var = this.E;
                    if (q4Var != null) {
                        this.H = q4Var.f22246e;
                        android.view.ViewGroup viewGroup = q4Var.f22247f;
                        kotlin.jvm.internal.o.f(viewGroup, "<get-avatarLayout>(...)");
                        L(m4Var2, viewGroup);
                        boolean z29 = m4Var2.f22104d;
                        r45.xn1 xn1Var3 = m4Var2.f22101a;
                        I(q4Var, i38, xn1Var3, z29);
                        J(q4Var, i38, xn1Var3, m4Var2.f22104d);
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
            int i39 = this.f22159y;
            if (i17 > i39) {
                arrayList.add(new bm2.m4(null, this.f22153s, i39, 0, false, null, 0, null, 240, null));
            }
        } else if (this.f22140J == 0) {
            int size2 = arrayList.size();
            int i47 = this.K;
            if (size2 >= i47) {
                arrayList.add(new bm2.m4(null, this.f22153s, i47, 0, false, null, 0, null, 240, null));
            }
        }
        B();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMemberList enableGift:");
        sb6.append(z17);
        sb6.append(",onlineList size:");
        sb6.append(this.f22159y);
        sb6.append(",continueFlag：");
        sb6.append(this.f22140J);
        sb6.append(",maxMemberCount:");
        sb6.append(this.K);
        sb6.append(",selfContact is empty:");
        sb6.append(xn1Var == null ? z18 : z19);
        sb6.append(",self amount heat:");
        sb6.append(xn1Var != null ? java.lang.Integer.valueOf(xn1Var.getInteger(3)) : null);
        sb6.append(", live_heat_value:");
        sb6.append(xn1Var != null ? java.lang.Long.valueOf(xn1Var.getLong(15)) : null);
        sb6.append(", haveSelfItem:");
        sb6.append(z27);
        sb6.append(",selfItemPosition:");
        sb6.append(this.D);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.B.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((bm2.m4) this.B.get(i17)).f22102b;
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
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r21, int r22) {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.n5.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        boolean z17 = true;
        if (i17 == 0 || i17 == this.f22150p) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.at7, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new bm2.q4(this, inflate);
        }
        if (i17 != this.f22151q && i17 != this.f22152r) {
            z17 = false;
        }
        if (z17) {
            android.view.View inflate2 = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.f488915at5, null);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            return new bm2.p4(this, inflate2);
        }
        if (i17 == this.f22153s) {
            android.view.View inflate3 = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.f488914at4, null);
            kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
            return new bm2.o4(this, inflate3);
        }
        if (i17 == this.f22154t) {
            android.view.View inflate4 = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.at9, parent, false);
            kotlin.jvm.internal.o.f(inflate4, "inflate(...)");
            return new bm2.b5(this, inflate4);
        }
        if (i17 == this.f22155u) {
            android.view.View inflate5 = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.at_, parent, false);
            kotlin.jvm.internal.o.f(inflate5, "inflate(...)");
            return new bm2.x4(this, inflate5);
        }
        if (i17 == this.f22156v) {
            android.view.View inflate6 = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.at8, parent, false);
            kotlin.jvm.internal.o.f(inflate6, "inflate(...)");
            return new bm2.w4(this, inflate6);
        }
        if (i17 == this.f22157w) {
            return new bm2.n4(this, new com.tencent.mm.plugin.finder.live.view.FinderLiveHonorView(this.f22142e, null, 0, this.f22141d, 6, null));
        }
        android.view.View inflate7 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.at7, parent, false);
        kotlin.jvm.internal.o.f(inflate7, "inflate(...)");
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
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_MEMBER_PANEL_SWITCH_ROLE_GUIDE_SHOWN_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            this.f22145h.setInterceptTouchRect(null);
        }
    }

    public final void z() {
        android.view.View view = this.f22144g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "hideStickContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "hideStickContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.F.setTag(java.lang.Boolean.FALSE);
    }
}
