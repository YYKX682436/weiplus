package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes11.dex */
public abstract class xk extends ql5.d {

    /* renamed from: w, reason: collision with root package name */
    public static int f253062w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static int f253063x = 1;

    /* renamed from: y, reason: collision with root package name */
    public static int f253064y = 2;

    /* renamed from: f, reason: collision with root package name */
    public final zd4.o f253068f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f253069g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f253070h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.LayoutInflater f253071i;

    /* renamed from: j, reason: collision with root package name */
    public int f253072j;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yk f253082t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.CharSequence f253083u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.CharSequence f253084v;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String f253065z = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.jbm);
    public static java.lang.String A = "";
    public static java.util.List B = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f253066d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f253067e = false;

    /* renamed from: k, reason: collision with root package name */
    public int f253073k = 0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f253074l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f253075m = false;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f253076n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f253077o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f253078p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f253079q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f253080r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public java.util.ArrayList f253081s = new java.util.ArrayList();

    public xk(android.content.Context context, zd4.o oVar) {
        new java.util.ArrayList();
        new java.util.ArrayList();
        this.f253082t = null;
        this.f253083u = "";
        this.f253084v = "";
        this.f253070h = context;
        this.f253071i = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        this.f253068f = oVar == null ? new zd4.s() : oVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initWithConfig", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_from_chatroom_enable, 1) == 1) {
            f253062w = 0;
            f253063x = 1;
            f253064y = 2;
        } else {
            f253062w = -1;
            f253063x = 0;
            f253064y = 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AnimatedExpandableListAdapter", "initWithConfig %s %s %s %s", java.lang.Integer.valueOf(f253062w), java.lang.Integer.valueOf(f253063x), java.lang.Integer.valueOf(f253064y), java.lang.Integer.valueOf(f()));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initWithConfig", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r9 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence k(java.util.ArrayList r11, boolean r12, int r13) {
        /*
            java.lang.String r0 = "packageLabelInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            r3 = 0
        Le:
            int r4 = r11.size()
            if (r3 >= r4) goto Lc8
            int r4 = r2.length()
            java.lang.Object r5 = r11.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            c93.b r6 = c93.a.a()
            b93.b r6 = (b93.b) r6
            java.lang.String r6 = r6.g(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L30
            goto Lc4
        L30:
            c93.b r7 = c93.a.a()
            b93.b r7 = (b93.b) r7
            java.util.List r7 = r7.j(r5)
            java.lang.String r8 = "MicroMsg.Sns.AnimatedExpandableListAdapter"
            if (r7 == 0) goto L44
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L6a
        L44:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r9 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.A
            boolean r9 = r5.equals(r9)
            if (r9 == 0) goto L56
            java.util.List r9 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.B
            r7.addAll(r9)
        L56:
            java.lang.String r9 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.A
            boolean r9 = r5.equals(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r6, r5}
            java.lang.String r10 = "packageLabelInfo nameList empty,new create:%b, label name:%s id:%s "
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r10, r9)
        L6a:
            int r7 = r7.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r5, r7}
            java.lang.String r7 = "packageLabelInfo label name:%s id:%s size:%d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r7, r5)
            int r5 = r11.size()
            int r5 = r5 + (-1)
            if (r3 == r5) goto L96
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.f253065z
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            goto L97
        L96:
            r5 = r6
        L97:
            java.lang.Class<le0.x> r7 = le0.x.class
            i95.m r7 = i95.n0.c(r7)
            le0.x r7 = (le0.x) r7
            android.content.Context r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            ke0.e r7 = (ke0.e) r7
            r7.getClass()
            android.text.SpannableString r5 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(r8, r5)
            r2.append(r5)
            if (r12 == 0) goto Lc4
            android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan
            android.content.Context r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            int r7 = i65.a.d(r7, r13)
            r5.<init>(r7)
            int r6 = r6.length()
            int r6 = r6 + r4
            r7 = 17
            r2.setSpan(r5, r4, r6, r7)
        Lc4:
            int r3 = r3 + 1
            goto Le
        Lc8:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.k(java.util.ArrayList, boolean, int):java.lang.CharSequence");
    }

    @Override // ql5.d
    public int c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        zd4.o oVar = this.f253068f;
        int n17 = oVar.n(i17);
        if (!oVar.o(n17, 2) && (!oVar.o(n17, 3) || this.f253069g == null)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter");
        int f17 = f();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return f17;
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearExcludeSelectedOtherUsers", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        this.f253079q.clear();
        this.f253084v = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearExcludeSelectedOtherUsers", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }

    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearIncludeSelectedOtherUsers", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        this.f253078p.clear();
        this.f253083u = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearIncludeSelectedOtherUsers", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }

    public int f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChildExtraIndexCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        if (this.f253066d) {
            int i17 = f253064y + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildExtraIndexCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
            return i17;
        }
        int i18 = f253063x + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildExtraIndexCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return i18;
    }

    public final java.util.List g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTopFive", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(335875, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopFive", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
            return null;
        }
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str.split(","));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopFive", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return P1;
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getChild(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChild", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        java.lang.Object obj = this.f253069g.get(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChild", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return obj;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChildId", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildId", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return 0L;
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getGroup(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGroup", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroup", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGroupCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroupCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return 4;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGroupId", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGroupId", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x014d, code lost:
    
        if (r13 != 6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01c3, code lost:
    
        if (r1 != 4) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c8  */
    @Override // android.widget.ExpandableListAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getGroupView(int r22, boolean r23, android.view.View r24, android.view.ViewGroup r25) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xk.getGroupView(int, boolean, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean h(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isContain", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        if (i17 == 1) {
            boolean i18 = i(this.f253076n, str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContain", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
            return i18;
        }
        boolean i19 = i(this.f253077o, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContain", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return i19;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasStableIds", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasStableIds", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return false;
    }

    public final boolean i(java.util.List list, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isContains", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((java.lang.String) it.next()).equals(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContains", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContains", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isChildSelectable", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isChildSelectable", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return true;
    }

    public java.lang.CharSequence j(java.util.ArrayList arrayList, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("packageContactName", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.jbm);
        int i18 = 0;
        while (i18 < arrayList.size()) {
            int length = spannableStringBuilder.length();
            java.lang.String str = (java.lang.String) arrayList.get(i18);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String a17 = c01.a2.a(str);
            if (lj.f.f(a17)) {
                gm0.j1.i();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                if (n17 != null && !android.text.TextUtils.isEmpty(n17.f2())) {
                    a17 = n17.g2();
                }
                i18++;
            }
            java.lang.String str2 = a17 + (i18 != arrayList.size() - 1 ? g17 : "");
            android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(i17);
            spannableStringBuilder.append((java.lang.CharSequence) str2);
            spannableStringBuilder.setSpan(foregroundColorSpan, length, a17.length() + length, 17);
            spannableStringBuilder.subSequence(length, a17.length() + length);
            i18++;
        }
        android.text.SpannableString Ri = com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().Ri(spannableStringBuilder, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("packageContactName", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return Ri;
    }

    public void l(java.util.ArrayList arrayList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setmLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        java.util.List g17 = g();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (g17 == null || arrayList == null) {
            this.f253069g = arrayList;
        } else {
            java.util.Iterator it = ((java.util.ArrayList) g17).iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (i(arrayList, str)) {
                    arrayList.remove(str);
                    arrayList2.add(str);
                }
            }
            arrayList.addAll(0, arrayList2);
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList2, ",");
            gm0.j1.i();
            gm0.j1.u().c().w(335875, c17);
            this.f253069g = arrayList;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setmLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }

    @Override // android.widget.BaseExpandableListAdapter
    public void notifyDataSetChanged() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        super.notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }
}
