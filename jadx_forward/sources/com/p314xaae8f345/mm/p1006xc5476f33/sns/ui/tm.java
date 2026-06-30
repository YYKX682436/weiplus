package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class tm {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f252062d = {0, 0, 1, 3, 6, 9};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f252063e = {com.p314xaae8f345.mm.R.id.f564393q3};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f252064f = {com.p314xaae8f345.mm.R.id.f564393q3, com.p314xaae8f345.mm.R.id.f564394q4, com.p314xaae8f345.mm.R.id.f564395q5};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f252065g = {com.p314xaae8f345.mm.R.id.f564393q3, com.p314xaae8f345.mm.R.id.f564394q4, com.p314xaae8f345.mm.R.id.f564395q5, com.p314xaae8f345.mm.R.id.f564396q6, com.p314xaae8f345.mm.R.id.f564397q7, com.p314xaae8f345.mm.R.id.f564398q8};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f252066h = {com.p314xaae8f345.mm.R.id.f564393q3, com.p314xaae8f345.mm.R.id.f564394q4, com.p314xaae8f345.mm.R.id.f564395q5, com.p314xaae8f345.mm.R.id.f564396q6, com.p314xaae8f345.mm.R.id.f564397q7, com.p314xaae8f345.mm.R.id.f564398q8, com.p314xaae8f345.mm.R.id.f564399q9, com.p314xaae8f345.mm.R.id.q_, com.p314xaae8f345.mm.R.id.f564400qa};

    /* renamed from: i, reason: collision with root package name */
    public static double f252067i = -1.0d;

    /* renamed from: j, reason: collision with root package name */
    public static double f252068j = -1.0d;

    /* renamed from: k, reason: collision with root package name */
    public static double f252069k = -1.0d;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f252070l;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f252071a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f252072b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f252073c;

    public tm(android.content.Context context) {
        new java.util.LinkedList();
        this.f252072b = l44.a0.a();
        this.f252073c = l44.a0.b();
        this.f252071a = context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateScreenSize", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        if (context instanceof android.app.Activity) {
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            ((android.app.Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            android.graphics.Point point = new android.graphics.Point();
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.bk(point);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateScreenSize", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        f252070l = 1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_group_download, 0);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    public static android.util.Pair a(r45.lj4 lj4Var, double d17, double d18, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, boolean z17) {
        double d19;
        double d27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCalculatedWH", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        if (f252067i < 0.0d) {
            f252067i = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 160.0f);
            f252068j = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 200.0f);
            f252069k = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 44.0f);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 66.0f);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 300.0f);
        }
        if (z17 && c17933xe8d1b226 != null && c17933xe8d1b226.m70377x3172ed() && c17933xe8d1b226.m70354x74235b3e().m70158xe3d6b844()) {
            android.util.Pair k17 = m21.y.k((int) d17, (int) d18, context, false);
            d19 = ((java.lang.Integer) k17.first).intValue();
            d27 = ((java.lang.Integer) k17.second).intValue();
        } else {
            if (d17 <= 0.0d || d18 <= 0.0d) {
                d19 = f252067i;
                d27 = d19;
            } else {
                double d28 = f252068j;
                double min = java.lang.Math.min(d28 / d17, d28 / d18);
                d19 = d17 * min;
                d27 = d18 * min;
                double d29 = f252069k;
                if (d19 < d29) {
                    double d37 = (d29 * 1.0d) / d19;
                    d19 *= d37;
                    d27 *= d37;
                }
                if (d27 < d29) {
                    double d38 = (d29 * 1.0d) / d27;
                    d19 *= d38;
                    d27 *= d38;
                }
                double d39 = f252068j;
                if (d19 > d39) {
                    d19 = d39;
                }
                if (d27 > d39) {
                    d27 = d39;
                }
            }
            if (d19 < 1.0d) {
                d19 = 1.0d;
            }
            if (d27 < 1.0d) {
                d27 = 1.0d;
            }
            if (lj4Var != null) {
                float f17 = lj4Var.f461053d;
                if (f17 > 0.0f) {
                    float f18 = lj4Var.f461054e;
                    if (f18 > 0.0f) {
                        d19 = f17;
                        d27 = f18;
                    }
                }
            }
        }
        android.util.Pair pair = new android.util.Pair(java.lang.Double.valueOf(d19), java.lang.Double.valueOf(d27));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCalculatedWH", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        return pair;
    }

    public static boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("groupDownloadEnable", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0 c4446x11b6e6e0 = (com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37619x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class);
        if ((c4446x11b6e6e0 != null ? c4446x11b6e6e0.m37736x34c3112() : false) && f252070l) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("groupDownloadEnable", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMultiLineImageLineMgr", "groupDownloadDisable!!!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("groupDownloadEnable", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        return false;
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17989x79511098 c17989x79511098, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, java.lang.String str, android.view.View.OnClickListener onClickListener, android.view.View.OnLongClickListener onLongClickListener, int i17, int i18, int i19, boolean z17, boolean z18, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, boolean z19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHbImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        int[] iArr = (i18 == 2 || i18 == 10) ? f252063e : i18 == 3 ? f252064f : i18 == 4 ? f252065g : f252066h;
        java.util.LinkedList linkedList = c19807x593d1720.f39014x86965dde.f451373h;
        if (f252067i < 0.0d) {
            android.content.Context context = this.f252071a;
            f252067i = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 160.0f);
            f252068j = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 200.0f);
            f252069k = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 44.0f);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 66.0f);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 300.0f);
        }
        int size = linkedList.size();
        if (size == 0) {
            for (int i27 = 0; i27 < iArr.length; i27++) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().P(c17989x79511098.g(i27));
                c17989x79511098.g(i27).m70817xa32537ab(i19);
            }
            c17989x79511098.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHbImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return;
        }
        c17989x79511098.setVisibility(0);
        if (size != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHbImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return;
        }
        for (int i28 = 1; i28 < iArr.length; i28++) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 g17 = c17989x79511098.g(i28);
            g17.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().P(g17);
            c17989x79511098.g(i28).m70817xa32537ab(i19);
        }
        c17989x79511098.g(0).setVisibility(0);
        e((r45.jj4) linkedList.get(0), c17989x79511098.g(0), str, i17, i19, z18, s7Var, i18, z19, null, (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17973x67e3e70e) c17989x79511098.f(0));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHbImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
    }

    public void d(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17989x79511098 c17989x79511098, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, java.lang.String str, android.view.View.OnClickListener onClickListener, android.view.View.OnLongClickListener onLongClickListener, int i17, int i18, int i19, boolean z17, boolean z18, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, java.util.List list, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k0 k0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ojVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 c18146x7d99d446;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ojVar2;
        int i28;
        boolean z19;
        int i29;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 c18146x7d99d4462;
        boolean z27;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k0 k0Var2;
        java.util.LinkedList linkedList;
        android.util.SparseArray sparseArray;
        android.util.SparseArray sparseArray2;
        java.lang.String str3 = str;
        boolean z28 = z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        int[] iArr = (i18 == 2 || i18 == 10 || i18 == 13) ? f252063e : i18 == 3 ? f252064f : i18 == 4 ? f252065g : f252066h;
        java.util.LinkedList linkedList2 = c19807x593d1720.f39014x86965dde.f451373h;
        if (f252067i < 0.0d) {
            android.content.Context context = this.f252071a;
            f252067i = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 160.0f);
            f252068j = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 200.0f);
            f252069k = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 44.0f);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 66.0f);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 300.0f);
        }
        int size = linkedList2.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMultiLineImageLineMgr", "snsid:%s  size:%d", c17933xe8d1b226.m70367x7525eefd(), java.lang.Integer.valueOf(size));
        int i37 = 0;
        if (size == 0) {
            while (i37 < iArr.length) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().P(c17989x79511098.g(i37));
                c17989x79511098.g(i37).m70817xa32537ab(i19);
                i37++;
            }
            c17989x79511098.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return;
        }
        c17989x79511098.m70665xaf1ffdd2(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.nj());
        c17989x79511098.setVisibility(0);
        int i38 = 1;
        if (size == 1) {
            while (i38 < iArr.length) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 g17 = c17989x79511098.g(i38);
                android.view.View f17 = c17989x79511098.f(i38);
                if (f17 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(f17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    f17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(f17, "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                g17.setVisibility(8);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().P(g17);
                c17989x79511098.g(i38).m70817xa32537ab(i19);
                i38++;
                i37 = 0;
            }
            int i39 = i37;
            c17989x79511098.g(i39).setVisibility(i39);
            android.view.View f18 = c17989x79511098.f(i39);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(java.lang.Integer.valueOf(i39));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(f18, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(f18, "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (list == null || list.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMultiLineImageLineMgr", "[%s][id:%s][media:%s] setSingle bitmap with with out size", "[image-flow]", c17933xe8d1b226.m70367x7525eefd(), ((r45.jj4) linkedList2.get(0)).f459388d);
                e((r45.jj4) linkedList2.get(0), c17989x79511098.g(0), str, i17, i19, z18, s7Var, i18, false, c17933xe8d1b226, (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17973x67e3e70e) c17989x79511098.f(0));
            } else {
                r45.lj4 lj4Var = (r45.lj4) list.get(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMultiLineImageLineMgr", "[%s][id:%s][media:%s] setSingle bitmap with size:[%d %d],", "[image-flow]", c17933xe8d1b226.m70367x7525eefd(), ((r45.jj4) linkedList2.get(0)).f459388d, java.lang.Float.valueOf(lj4Var.f461053d), java.lang.Float.valueOf(lj4Var.f461054e));
                f((r45.jj4) linkedList2.get(0), c17989x79511098.g(0), str, i17, i19, z18, s7Var, i18, false, lj4Var, c17933xe8d1b226, (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17973x67e3e70e) c17989x79511098.f(0));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k0 k0Var3 = !b() ? new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k0(str2, size) : null;
        boolean z29 = this.f252072b;
        if (size != 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k0 k0Var4 = k0Var3;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            android.util.SparseArray sparseArray3 = new android.util.SparseArray();
            android.util.SparseArray sparseArray4 = new android.util.SparseArray();
            int length = iArr.length - 1;
            while (length >= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 g18 = c17989x79511098.g(length);
                android.view.View f19 = c17989x79511098.f(length);
                g18.m70817xa32537ab(i19);
                if (length < linkedList2.size()) {
                    g18.setVisibility(0);
                    if (f19 != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(f19, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        f19.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(f19, "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    arrayList4.add(g18);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ojVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj();
                    ojVar3.f251635a = str;
                    ojVar3.f251636b = length;
                    ojVar3.f251638d = z18;
                    ojVar3.f251637c = i19;
                    g18.setTag(ojVar3);
                    if (z17 || !b()) {
                        r45.jj4 jj4Var = (r45.jj4) linkedList2.get(ojVar3.f251636b);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k0 k0Var5 = k0Var4;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().k(jj4Var.f459388d, k0Var5);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().j(jj4Var.f459388d);
                        if (z17 && z29) {
                            k0Var = k0Var5;
                            if (!this.f252073c) {
                                ojVar = ojVar3;
                                c18146x7d99d446 = g18;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().W(jj4Var, g18, -1, i17, s7Var);
                                i27 = length;
                                ojVar2 = ojVar;
                            }
                        } else {
                            k0Var = k0Var5;
                        }
                        ojVar = ojVar3;
                        c18146x7d99d446 = g18;
                        i27 = length;
                        g(str2, jj4Var, c18146x7d99d446, i17, i19, s7Var);
                        ojVar2 = ojVar;
                    } else {
                        ojVar2 = ojVar3;
                        c18146x7d99d446 = g18;
                        i27 = length;
                        k0Var = k0Var4;
                    }
                    sparseArray3.put(ojVar2.f251636b, (r45.jj4) linkedList2.get(ojVar2.f251636b));
                    sparseArray4.put(ojVar2.f251636b, c18146x7d99d446);
                } else {
                    i27 = length;
                    k0Var = k0Var4;
                    g18.setVisibility(8);
                    if (f19 != null) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                        arrayList6.add(8);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(f19, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        f19.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(f19, "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().P(g18);
                }
                length = i27 - 1;
                k0Var4 = k0Var;
            }
            if (!z17 && b() && sparseArray3.size() > 0) {
                h(str2, sparseArray3, sparseArray4, i17, s7Var, size);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return;
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        android.util.SparseArray sparseArray5 = new android.util.SparseArray();
        android.util.SparseArray sparseArray6 = new android.util.SparseArray();
        int length2 = iArr.length - 1;
        int i47 = 3;
        while (length2 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 g19 = c17989x79511098.g(length2);
            g19.m70817xa32537ab(i19);
            android.view.View f27 = c17989x79511098.f(length2);
            android.util.SparseArray sparseArray7 = sparseArray5;
            if (length2 == 0 || length2 == 1 || length2 == 3 || length2 == 4) {
                g19.setVisibility(0);
                if (f27 != null) {
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    i28 = length2;
                    arrayList8.add(0);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(f27, arrayList8.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    f27.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(f27, "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    i28 = length2;
                }
                arrayList7.add(g19);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ojVar4 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj();
                ojVar4.f251635a = str3;
                int i48 = i47;
                i47 = i48 - 1;
                ojVar4.f251636b = i48;
                ojVar4.f251638d = z28;
                ojVar4.f251637c = i19;
                g19.setTag(ojVar4);
                if (z17 || !b()) {
                    r45.jj4 jj4Var2 = (r45.jj4) linkedList2.get(ojVar4.f251636b);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().k(jj4Var2.f459388d, k0Var3);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().j(jj4Var2.f459388d);
                    if (z17 && z29) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().W(jj4Var2, g19, -1, i17, s7Var);
                    } else {
                        z19 = z29;
                        i29 = i28;
                        android.util.SparseArray sparseArray8 = sparseArray6;
                        c18146x7d99d4462 = g19;
                        z27 = true;
                        arrayList = arrayList7;
                        k0Var2 = k0Var3;
                        linkedList = linkedList2;
                        sparseArray = sparseArray7;
                        sparseArray2 = sparseArray8;
                        g(str2, jj4Var2, c18146x7d99d4462, i17, i19, s7Var);
                        sparseArray.put(ojVar4.f251636b, (r45.jj4) linkedList.get(ojVar4.f251636b));
                        sparseArray2.put(ojVar4.f251636b, c18146x7d99d4462);
                    }
                }
                sparseArray2 = sparseArray6;
                sparseArray = sparseArray7;
                z19 = z29;
                c18146x7d99d4462 = g19;
                k0Var2 = k0Var3;
                arrayList = arrayList7;
                i29 = i28;
                z27 = true;
                linkedList = linkedList2;
                sparseArray.put(ojVar4.f251636b, (r45.jj4) linkedList.get(ojVar4.f251636b));
                sparseArray2.put(ojVar4.f251636b, c18146x7d99d4462);
            } else {
                g19.setVisibility(8);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().P(g19);
                if (f27 != null) {
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                    arrayList9.add(8);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(f27, arrayList9.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    f27.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(f27, "com/tencent/mm/plugin/sns/ui/SnsMultiLineImageLineMgr", "setImages", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;IIIZZLcom/tencent/mm/storage/FROM_SCENE;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                sparseArray2 = sparseArray6;
                sparseArray = sparseArray7;
                z19 = z29;
                i29 = length2;
                k0Var2 = k0Var3;
                arrayList = arrayList7;
                z27 = true;
                linkedList = linkedList2;
            }
            length2 = i29 - 1;
            sparseArray6 = sparseArray2;
            sparseArray5 = sparseArray;
            linkedList2 = linkedList;
            z29 = z19;
            k0Var3 = k0Var2;
            str3 = str;
            z28 = z18;
            arrayList7 = arrayList;
        }
        android.util.SparseArray sparseArray9 = sparseArray6;
        android.util.SparseArray sparseArray10 = sparseArray5;
        if (!z17 && b() && sparseArray10.size() > 0) {
            h(str2, sparseArray10, sparseArray9, i17, s7Var, size);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
    }

    public final boolean e(r45.jj4 jj4Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 c22637x66bb02b3, java.lang.String str, int i17, int i18, boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, int i19, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSingle", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        boolean f17 = f(jj4Var, c22637x66bb02b3, str, i17, i18, z17, s7Var, i19, z18, new r45.lj4(), c17933xe8d1b226, view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSingle", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        return f17;
    }

    public final boolean f(r45.jj4 jj4Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 c22637x66bb02b3, java.lang.String str, int i17, int i18, boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, int i19, boolean z18, r45.lj4 lj4Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, android.view.View view) {
        java.lang.String str2;
        boolean z19;
        java.lang.String str3;
        boolean i07;
        double d17;
        double d18;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        boolean z27;
        java.lang.String str7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSingle", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        if (c22637x66bb02b3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsMultiLineImageLineMgr", "");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSingle", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ojVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj();
        ojVar.f251635a = str;
        ojVar.f251636b = 0;
        new java.util.ArrayList().add(c22637x66bb02b3);
        ojVar.f251638d = z17;
        ojVar.f251637c = i18;
        c22637x66bb02b3.setTag(ojVar);
        java.lang.String t07 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
        if (i19 == 10 && z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
            hj6.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsBlurThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsBlurThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            if (jj4Var == null || (str7 = jj4Var.f459388d) == null || str7.equals("")) {
                str2 = "setSingle";
                str5 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2";
                str6 = "setSnsBlurThumb";
                z27 = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str5);
            } else {
                java.lang.String x17 = ca4.z0.x(4, jj4Var.f459388d);
                str6 = "setSnsBlurThumb";
                str2 = "setSingle";
                str5 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2";
                hj6.M(t07, jj4Var, x17, s7Var, false);
                hj6.s0(c22637x66bb02b3, x17, true, -1, i17);
                com.p314xaae8f345.mm.p872xbfc2bd01.r k17 = hj6.k(x17, jj4Var.f459388d);
                if (ca4.z0.g(k17)) {
                    z27 = false;
                    hj6.R(c22637x66bb02b3, x17, k17, false);
                    ta4.u0.m(jj4Var.f459388d);
                    ta4.u0.o(jj4Var.f459388d);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str5);
                } else {
                    hj6.q0(c22637x66bb02b3);
                    if (((java.util.HashSet) hj6.f245807w).contains(x17)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str5);
                    } else {
                        hj6.I(4, jj4Var, s7Var, t07);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str5);
                    }
                    z27 = false;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str5);
            z19 = z27;
            i07 = true;
        } else {
            str2 = "setSingle";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMultiLineImageLineMgr", "[%s][id:%s][media:%s] setSnsThumb start", "[image-flow]", t07, jj4Var.f459388d);
            if (c17933xe8d1b226.m70377x3172ed() && this.f252072b) {
                z19 = false;
                i07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().W(jj4Var, c22637x66bb02b3, -1, i17, s7Var);
                str3 = t07;
            } else {
                z19 = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
                hj7.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                str3 = t07;
                i07 = hj7.i0(jj4Var, c22637x66bb02b3, -1, i17, s7Var, 1, str3);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMultiLineImageLineMgr", "[%s][id:%s][media:%s] setSnsThumb finish with result:%b", "[image-flow]", str3, jj4Var.f459388d, java.lang.Boolean.valueOf(i07));
        }
        r45.lj4 lj4Var2 = jj4Var.f459398p;
        if (lj4Var2 != null) {
            d18 = lj4Var2.f461053d;
            d17 = lj4Var2.f461054e;
        } else {
            d17 = 0.0d;
            d18 = 0.0d;
        }
        android.util.Pair a17 = a(lj4Var, d18, d17, this.f252071a, c17933xe8d1b226, i19 != 2 ? z19 : true);
        double doubleValue = ((java.lang.Double) a17.first).doubleValue();
        double doubleValue2 = ((java.lang.Double) a17.second).doubleValue();
        if (view.getLayoutParams() instanceof android.widget.FrameLayout.LayoutParams) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c22637x66bb02b3.getLayoutParams();
            if (layoutParams.width == doubleValue && layoutParams.height == doubleValue2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
                return i07;
            }
            str4 = str2;
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams((int) doubleValue, (int) doubleValue2));
        } else {
            str4 = str2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        return i07;
    }

    public final void g(java.lang.String str, r45.jj4 jj4Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 c22637x66bb02b3, int i17, int i18, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsGrid", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().Z(str, jj4Var, c22637x66bb02b3, i17, s7Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGrid", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    public void h(java.lang.String str, android.util.SparseArray sparseArray, android.util.SparseArray sparseArray2, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, int i18) {
        android.util.SparseArray sparseArray3 = sparseArray;
        android.util.SparseArray sparseArray4 = sparseArray2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsMultiImg", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
        hj6.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsMultiImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "enter group img download logic!");
        if (sparseArray3 == null || sparseArray.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LazyerImageLoader2", "setSnsMultiImg check params, medias is invalid.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsMultiImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else if (sparseArray4 == null || sparseArray2.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LazyerImageLoader2", "setSnsMultiImg check params, imageViews is invalid.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsMultiImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else {
            int size = sparseArray.size();
            int size2 = sparseArray2.size();
            int i19 = size == size2 ? size : -1;
            if (-1 == i19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LazyerImageLoader2", "setSnsMultiImg check params, mediaSize(%d) != imgViewSize(%d).", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size2));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsMultiImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            } else {
                android.util.SparseArray sparseArray5 = new android.util.SparseArray();
                android.util.SparseArray sparseArray6 = new android.util.SparseArray();
                android.util.SparseArray sparseArray7 = new android.util.SparseArray();
                ?? r102 = 0;
                int i27 = 0;
                while (i27 < i19) {
                    int keyAt = sparseArray3.keyAt(i27);
                    r45.jj4 jj4Var = (r45.jj4) sparseArray3.get(keyAt);
                    android.view.View view = (android.view.View) sparseArray4.get(keyAt);
                    view.setDrawingCacheEnabled(r102);
                    java.lang.String x17 = ca4.z0.x(r102, jj4Var.f459388d);
                    int i28 = i27;
                    hj6.M(str, jj4Var, x17, s7Var, true);
                    boolean z17 = r102;
                    hj6.v0(view, x17, true, -1, i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_NONE);
                    com.p314xaae8f345.mm.p872xbfc2bd01.r k17 = hj6.k(x17, jj4Var.f459388d);
                    if (ca4.z0.g(k17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "setSnsMultiImg, cache hit.");
                        ta4.u0.m(jj4Var.f459388d);
                        ta4.u0.o(jj4Var.f459388d);
                        hj6.R(view, x17, k17, z17);
                        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().A(jj4Var) && pc4.d.f434943a.k()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "[%s][id:%s][media:%s] local file not exist,re download", "[image-flow]", str, jj4Var.f459388d);
                            sparseArray5.put(keyAt, jj4Var);
                            i27 = i28 + 1;
                            r102 = z17;
                            sparseArray3 = sparseArray;
                            sparseArray4 = sparseArray2;
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "setSnsMultiImg, cache miss.");
                        hj6.q0(view);
                        if (((java.util.HashSet) hj6.f245807w).contains(x17)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "%s in hashSet ignore", x17);
                        } else {
                            sparseArray5.put(keyAt, jj4Var);
                        }
                    }
                    i27 = i28 + 1;
                    r102 = z17;
                    sparseArray3 = sparseArray;
                    sparseArray4 = sparseArray2;
                }
                if (sparseArray5.size() != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "ok, let's download.");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Sj().execute(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s1(hj6, sparseArray5, sparseArray6, sparseArray7, str, s7Var, i18));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsMultiImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsMultiImg", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
    }
}
