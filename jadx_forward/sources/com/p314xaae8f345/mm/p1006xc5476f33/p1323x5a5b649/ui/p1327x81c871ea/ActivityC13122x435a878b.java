package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea;

@db5.a(m123858x6ac9171 = 8192)
@gm0.a2
/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI */
/* loaded from: classes12.dex */
public class ActivityC13122x435a878b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static long X;
    public static final java.lang.String Y = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt) + "/cgi-bin/readtemplate?t=w_safe&qqpimenter=shoushen";
    public android.widget.TextView A;
    public android.view.View B;
    public android.view.View C;
    public android.view.View D;
    public android.view.View E;
    public android.view.View F;
    public android.view.View G;
    public android.view.View H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f177306J;
    public android.widget.TextView K;
    public android.widget.TextView L;
    public com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab M;
    public int P;
    public yv1.g1 Q;
    public yv1.b1 R;
    public org.json.JSONObject W;

    /* renamed from: d, reason: collision with root package name */
    public int f177307d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f177308e;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f177314n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f177315o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f177316p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f177317q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f177318r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f177319s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f177320t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f177321u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f177322v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f177323w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f177324x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f177325y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f177326z;

    /* renamed from: f, reason: collision with root package name */
    public long f177309f = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f177310g = true;

    /* renamed from: h, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicBoolean f177311h = null;

    /* renamed from: i, reason: collision with root package name */
    public long f177312i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f177313m = 0;
    public final cw1.s6 N = new cw1.s6(this, null);
    public final yv1.b0 S = new yv1.b0() { // from class: cw1.m6$$o
        @Override // yv1.b0
        public final void j4(final boolean z17, final boolean z18, final long j17, long j18) {
            final long[] jArr;
            final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b activityC13122x435a878b = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.this;
            yv1.g1 g1Var = activityC13122x435a878b.Q;
            synchronized (g1Var) {
                jArr = new long[]{g1Var.f547577c, g1Var.f547578d, g1Var.f547584j + g1Var.f547585k, g1Var.f547579e};
            }
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: cw1.m6$$t
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.Y;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b activityC13122x435a878b2 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.this;
                    if (activityC13122x435a878b2.isDestroyed()) {
                        return;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Clean cache progress: isDone: ");
                    boolean z19 = z17;
                    sb6.append(z19);
                    sb6.append(", isCancelled: ");
                    boolean z27 = z18;
                    sb6.append(z27);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanNewUI", sb6.toString());
                    activityC13122x435a878b2.f177310g = z19;
                    activityC13122x435a878b2.f177309f = j17;
                    if (z19) {
                        activityC13122x435a878b2.f177311h = new java.util.concurrent.atomic.AtomicBoolean(true);
                    } else if (z27) {
                        activityC13122x435a878b2.f177311h = new java.util.concurrent.atomic.AtomicBoolean(false);
                    }
                    cw1.s6 s6Var = activityC13122x435a878b2.N;
                    if (s6Var.f304849d >= s6Var.f304850e.length) {
                        long[] jArr2 = jArr;
                        activityC13122x435a878b2.e7(jArr2[0]);
                        activityC13122x435a878b2.Z6(jArr2[1], jArr2[2]);
                        activityC13122x435a878b2.b7(jArr2[3]);
                    }
                }
            });
        }
    };
    public java.lang.String T = "com.tencent.qqpimsecure";
    public java.lang.String U = "00B1208638DE0FCD3E920886D658DAF6";
    public java.lang.String V = "11206657";

    public static void W6(android.content.Context context, java.lang.String str, boolean z17, java.lang.String str2, java.lang.String str3, final java.lang.Runnable runnable) {
        final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 1, 0, true);
        z2Var.m(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572101yq));
        z2Var.o(2);
        z2Var.v(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        v61.C30646x56d4592 c30646x56d4592 = new v61.C30646x56d4592(z2Var);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 p3Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3() { // from class: cw1.m6$$l
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
            public final void a() {
                java.lang.String str4 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.Y;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2.this.B();
                runnable.run();
            }
        };
        z2Var.D = c30646x56d4592;
        z2Var.E = p3Var;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e2o, (android.view.ViewGroup) null);
        if (!android.text.TextUtils.isEmpty(str)) {
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ssr);
            textView.setText(str);
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.sso);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "showConfirmBottomDialog", "(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "showConfirmBottomDialog", "(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ssn);
            textView2.setVisibility(0);
            textView2.setText(str2);
            if (!android.text.TextUtils.isEmpty(str3)) {
                android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ssq);
                textView3.setVisibility(0);
                textView3.setText(str3);
            }
        }
        z2Var.j(inflate);
        z2Var.C();
    }

    public static void X6(final android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, final java.lang.Runnable runnable) {
        if (str2 == null) {
            str2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        }
        if (str3 == null) {
            str3 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bod);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(str);
        u1Var.a(true);
        u1Var.j(str2);
        u1Var.n(str3);
        u1Var.k(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
        u1Var.b(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1() { // from class: cw1.m6$$a
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
            public final void a(boolean z17, java.lang.String str4) {
                java.lang.String str5 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.Y;
                android.content.Context context2 = context;
                if (context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).mo48674x36654fab();
                }
                if (z17) {
                    runnable.run();
                }
            }
        });
        u1Var.q(true);
    }

    public final boolean T6() {
        java.lang.String str = (java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CLEANUI_QQMGRINFO_STRING, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.W = jSONObject;
            this.T = jSONObject.getString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
            this.W.get("md5");
            this.V = this.W.getString("launcherID");
            this.U = this.W.getString("signature");
            this.W.get("url");
            this.W.getLong("size");
            return true;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CleanNewUI", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public final java.lang.String U6() {
        java.lang.String str = (java.lang.String) this.C.getTag();
        if (str != null) {
            return str;
        }
        java.lang.String str2 = kk.v.a(gm0.j1.b().h()) + "+" + java.lang.System.currentTimeMillis();
        this.C.setTag(str2);
        return str2;
    }

    public final void V6(java.lang.String str, final boolean z17) {
        cw1.l6 l6Var = new cw1.l6(this, z17, this.P, new yz5.l() { // from class: cw1.m6$$j
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b activityC13122x435a878b = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.this;
                if (z17) {
                    activityC13122x435a878b.d7(activityC13122x435a878b.Q.f547582h);
                    return null;
                }
                activityC13122x435a878b.c7(activityC13122x435a878b.Q.f547580f);
                return null;
            }
        });
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        l6Var.f304642d = str;
        l6Var.f304643e = this.f177307d;
        l6Var.f304644f.i(false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = l6Var.f304644f;
        y1Var.H = false;
        y1Var.s();
        if (l6Var.f304640b) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = l6Var.f304655q;
            if (c26987xeef691ab != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                    throw new java.lang.IllegalStateException("Should not re-entrance!");
                }
                c26987xeef691ab.m108007xae7a2e7a();
            }
            l6Var.f304655q = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();
            ((ku5.t0) ku5.t0.f394148d).a(new cw1.g6(l6Var));
            return;
        }
        cw1.j6 j6Var = new cw1.j6(l6Var);
        l6Var.f304655q = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();
        j6Var.f304578c = java.lang.System.currentTimeMillis();
        ku5.u0 u0Var = ku5.t0.f394148d;
        cw1.h6 h6Var = new cw1.h6(l6Var);
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab2 = l6Var.f304655q;
        aw1.y yVar = new aw1.y(j6Var);
        ((ku5.t0) u0Var).a(new aw1.b0(yVar, true, yVar, c26987xeef691ab2, h6Var));
    }

    public final void Y6() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();
        this.M = c26987xeef691ab;
        cw1.o6 o6Var = new cw1.o6(this, 200L, 50);
        ((ku5.t0) ku5.t0.f394148d).B(o6Var);
        aw1.v.f(this.Q, new cw1.p6(this, o6Var, currentTimeMillis), c26987xeef691ab, this.f177308e);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            ((ku5.t0) ku5.t0.f394148d).a(new java.lang.Runnable() { // from class: cw1.m6$$n
                @Override // java.lang.Runnable
                public final void run() {
                    long[] jArr;
                    java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.Y;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b activityC13122x435a878b = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.this;
                    activityC13122x435a878b.getClass();
                    long nanoTime = java.lang.System.nanoTime();
                    try {
                        android.app.usage.StorageStats queryStatsForPackage = ((android.app.usage.StorageStatsManager) activityC13122x435a878b.getSystemService(android.app.usage.StorageStatsManager.class)).queryStatsForPackage(android.os.storage.StorageManager.UUID_DEFAULT, activityC13122x435a878b.getPackageName(), android.os.Process.myUserHandle());
                        jArr = new long[]{queryStatsForPackage.getAppBytes(), queryStatsForPackage.getDataBytes(), queryStatsForPackage.getCacheBytes()};
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CleanNewUI", e17, "Cannot get storage stats from system.", new java.lang.Object[0]);
                        jArr = null;
                    }
                    if (jArr == null) {
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanNewUI", "[StorageStatsManager] app: %d, data: %d, cache: %d, timeCost: %d ns", java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]), java.lang.Long.valueOf(java.lang.System.nanoTime() - nanoTime));
                }
            });
        }
    }

    public final void Z6(long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanNewUI", "updateCacheRoot: " + j17 + ", original: " + j18 + ", lastCleanDone: " + this.f177310g);
        this.N.a(1);
        android.view.View view = this.f177314n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateCacheRoot", "(JJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateCacheRoot", "(JJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        long j19 = j17 + j18;
        this.f177323w.setText(fp.n0.a(j19));
        if (j18 > 0) {
            this.f177324x.setVisibility(0);
            this.f177324x.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.n8l, fp.n0.a(j18)));
        } else {
            this.f177324x.setVisibility(8);
        }
        this.C.setEnabled(j19 > 0);
        if (this.f177310g) {
            android.view.View view2 = this.C;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateCacheRoot", "(JJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateCacheRoot", "(JJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.D;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateCacheRoot", "(JJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateCacheRoot", "(JJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = this.C;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(4);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateCacheRoot", "(JJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateCacheRoot", "(JJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.D;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateCacheRoot", "(JJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateCacheRoot", "(JJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:29|(4:31|(2:33|(2:35|(8:37|(1:55)|41|42|43|44|45|(2:47|48)(2:50|51))))(1:65)|64|(0))|66|42|43|44|45|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0254, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0255, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReportStorageDetailedTask", "build accSizeDetailedInfoJson error = " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(long r31) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.a7(long):void");
    }

    public final void b7(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanNewUI", "updateMsgRoot: " + j17);
        this.N.a(2);
        android.view.View view = this.f177315o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateMsgRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateMsgRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f177322v.setText(fp.n0.a(j17));
        android.view.View view2 = this.B;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateMsgRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateMsgRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void c7(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanNewUI", "updateOtherAccRoot: " + j17);
        this.f177313m = j17;
        if (!aw1.v.e()) {
            android.view.View view = this.H;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherAccRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherAccRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.H;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherAccRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherAccRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.I;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherAccRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherAccRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f177306J;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherAccRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherAccRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.K.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ni9, fp.n0.a(j17)));
        if (!com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20279x9b97d99f.n() && j17 <= 0) {
            this.L.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
            this.L.setEnabled(false);
        } else {
            this.L.setVisibility(0);
            this.L.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
            this.L.setEnabled(true);
        }
    }

    public final void d7(long j17) {
        yv1.g1 g1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanNewUI", "updateOtherResRoot: " + j17);
        this.f177312i = j17;
        if (aw1.v.e() && (g1Var = this.Q) != null) {
            if (yv1.h1.e(g1Var.f547582h, g1Var.f547575a)) {
                android.view.View view = this.G;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherResRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherResRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = this.G;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherResRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherResRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.View view3 = this.f177316p;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherResRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherResRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f177325y.setText(fp.n0.a(j17));
        this.E.setEnabled(com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20279x9b97d99f.n() || j17 > 0);
        android.view.View view4 = this.E;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherResRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateOtherResRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void e7(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanNewUI", "updateWeChatRoot: " + j17);
        long[] c17 = yv1.h1.c();
        this.N.a(0);
        this.f177321u.setText(fp.n0.a(j17));
        android.view.View view = this.f177319s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateWeChatRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateWeChatRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f177320t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateWeChatRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "updateWeChatRoot", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i17 = (int) (displayMetrics.density * 4.0f);
        int measuredWidth = this.f177318r.getMeasuredWidth();
        if (measuredWidth == 0) {
            measuredWidth = displayMetrics.widthPixels - ((int) (displayMetrics.density * 48.0f));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanNewUI", ">>> totalWidth: " + measuredWidth);
        android.view.ViewGroup.LayoutParams layoutParams = this.f177319s.getLayoutParams();
        long j18 = (long) measuredWidth;
        layoutParams.width = java.lang.Math.max(i17, (int) ((j18 * j17) / c17[1]));
        this.f177319s.setLayoutParams(layoutParams);
        long j19 = (c17[1] - c17[0]) - j17;
        android.view.ViewGroup.LayoutParams layoutParams2 = this.f177320t.getLayoutParams();
        layoutParams2.width = java.lang.Math.max(i17, (int) ((j18 * j19) / c17[1]));
        this.f177320t.setLayoutParams(layoutParams2);
        int i18 = (int) ((j17 * 100) / c17[1]);
        if (i18 <= 0) {
            this.A.setText(com.p314xaae8f345.mm.R.C30867xcad56011.b8c);
            return;
        }
        this.A.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8b, i18 + "%"));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570158yw;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        long j17;
        long j18;
        yv1.g1 g1Var = this.Q;
        if (i17 == 1 && i18 == -1 && intent != null) {
            long[] longArrayExtra = intent.getLongArrayExtra("tagsResult");
            if (longArrayExtra != null && longArrayExtra.length == 21) {
                synchronized (g1Var) {
                    java.lang.System.arraycopy(longArrayExtra, 0, g1Var.f547586l, 0, longArrayExtra.length);
                    long j19 = 0;
                    for (long j27 : longArrayExtra) {
                        j19 += j27;
                    }
                    long j28 = g1Var.f547578d - j19;
                    long max = java.lang.Long.max(0L, g1Var.f547577c - j28);
                    long max2 = java.lang.Long.max(0L, g1Var.f547578d - j28);
                    g1Var.f547577c = max;
                    g1Var.f547578d = max2;
                }
            }
        } else if (i17 == 2 && i18 == -1 && intent != null) {
            long longExtra = intent.getLongExtra("tds", 0L);
            if (longExtra > 0) {
                synchronized (g1Var) {
                    j17 = g1Var.f547577c - longExtra;
                    g1Var.f547577c = j17;
                    j18 = g1Var.f547579e - longExtra;
                    g1Var.f547579e = j18;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanNewUI", "Update data, total: %d, account: %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(3:(1:4)(1:46)|5|(2:7|(15:11|12|(1:14)(1:45)|15|(1:44)|21|(3:23|(1:25)|26)(1:43)|27|28|29|(1:31)(1:39)|32|(1:34)(1:38)|35|36)))|47|(1:49)|50|(1:57)(1:54)|(1:56)|12|(0)(0)|15|(1:17)|44|21|(0)(0)|27|28|29|(0)(0)|32|(0)(0)|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0645, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0646, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CleanNewUI", r0, r0.getMessage(), new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0177  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 1959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = this.M;
        if (c26987xeef691ab != null) {
            c26987xeef691ab.m108007xae7a2e7a();
            this.M = null;
        }
        this.R.aj(this.S);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        this.R.aj(this.S);
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        long j17;
        long j18;
        long j19;
        long j27;
        long j28;
        long j29;
        super.onResume();
        this.R.cj(this.P, this.S);
        cw1.s6 s6Var = this.N;
        if (s6Var.f304849d >= s6Var.f304850e.length) {
            yv1.g1 g1Var = this.Q;
            if (g1Var.f547589o == null) {
                Y6();
                return;
            }
            synchronized (g1Var) {
                j17 = g1Var.f547577c;
                j18 = g1Var.f547579e;
                j19 = g1Var.f547578d;
                j27 = g1Var.f547584j + g1Var.f547585k;
                j28 = g1Var.f547582h;
                j29 = g1Var.f547580f;
            }
            e7(j17);
            Z6(j19, j27);
            b7(j18);
            if (aw1.v.e()) {
                d7(j28);
                c7(j29);
            } else {
                if (yv1.h1.e(j28, g1Var.f547575a)) {
                    j29 += j28;
                }
                d7(j29);
            }
            a7(-1L);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanNewUI", "onStop: lastCleanDoneOrCancelled=" + this.f177311h);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f177311h;
        if (atomicBoolean == null || !atomicBoolean.get()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanNewUI", "update sLastExitTimeMs for cachingInterval cfg");
        X = java.lang.System.currentTimeMillis();
    }
}
