package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class i1 implements p94.k0 {

    /* renamed from: x, reason: collision with root package name */
    public static int f245784x;

    /* renamed from: c, reason: collision with root package name */
    public final jt0.i f245787c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w5 f245788d;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f245791g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f245792h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f245793i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f245794j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0 f245795k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f245796l;

    /* renamed from: m, reason: collision with root package name */
    public long f245797m;

    /* renamed from: n, reason: collision with root package name */
    public long f245798n;

    /* renamed from: o, reason: collision with root package name */
    public int f245799o;

    /* renamed from: p, reason: collision with root package name */
    public int f245800p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f245801q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f245802r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f245803s;

    /* renamed from: t, reason: collision with root package name */
    public int f245804t;

    /* renamed from: u, reason: collision with root package name */
    public int f245805u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f245806v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Set f245807w;

    /* renamed from: a, reason: collision with root package name */
    public long f245785a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f245786b = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f245789e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f245790f = new java.util.concurrent.ConcurrentHashMap();

    public i1() {
        new java.util.concurrent.ConcurrentHashMap();
        this.f245791g = new java.util.LinkedList();
        this.f245792h = false;
        this.f245793i = new java.util.concurrent.CopyOnWriteArraySet();
        this.f245794j = new java.util.HashMap();
        this.f245796l = true;
        this.f245797m = 0L;
        this.f245798n = 0L;
        this.f245799o = 0;
        this.f245800p = 0;
        this.f245801q = new java.util.HashMap();
        this.f245802r = new java.util.HashMap();
        this.f245803s = new java.util.HashMap();
        this.f245804t = 0;
        this.f245805u = 0;
        this.f245806v = new java.util.HashMap();
        this.f245807w = new java.util.HashSet();
        jt0.i.f383134j.put(com.p314xaae8f345.mm.p872xbfc2bd01.r.class, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p1(this));
        int largeMemoryClass = ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getLargeMemoryClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "BitmapPool %dMB", java.lang.Integer.valueOf(largeMemoryClass));
        this.f245787c = new jt0.i(largeMemoryClass > 256 ? 62914560 : 31457280, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q1(this), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetSnsBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f245788d = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w5(4, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r1(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetSnsBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w5 a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 i1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w5 w5Var = i1Var.f245788d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return w5Var;
    }

    public static /* synthetic */ void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 i1Var, java.lang.Object obj, java.lang.String str, boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1000", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        i1Var.t0(obj, str, z17, i17, i18, i19, i27);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1000", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 r23, int r24, r45.jj4 r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.c(com.tencent.mm.plugin.sns.model.i1, int, r45.jj4, boolean):boolean");
    }

    public static /* synthetic */ java.util.LinkedList d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 i1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.LinkedList linkedList = i1Var.f245791g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return linkedList;
    }

    public static java.lang.String l(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExistSnsDirectPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.lang.String u17 = u(jj4Var);
        if (com.p314xaae8f345.mm.vfs.w6.j(u17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExistSnsDirectPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return u17;
        }
        java.lang.String q17 = q(jj4Var);
        if (com.p314xaae8f345.mm.vfs.w6.j(q17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExistSnsDirectPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return q17;
        }
        java.lang.String r17 = r(jj4Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExistSnsDirectPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return r17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.j(r6) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String q(r45.jj4 r6) {
        /*
            java.lang.String r0 = "getSnsDirectHdPath"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            if (r6 != 0) goto Le
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            r6 = 0
            return r6
        Le:
            java.lang.String r2 = r6.f459388d
            java.lang.String r3 = "pre_temp_sns_pic"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ni()
            r2.append(r3)
            java.lang.String r6 = r6.f459388d
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            goto Lb4
        L30:
            java.lang.String r2 = r6.f459388d
            java.lang.String r3 = "Locall_path"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L83
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di()
            java.lang.String r4 = r6.f459388d
            java.lang.String r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(r3, r4)
            r2.append(r3)
            java.lang.String r3 = ca4.z0.W(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r3 = com.p314xaae8f345.mm.vfs.w6.j(r2)
            if (r3 != 0) goto L81
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di()
            java.lang.String r5 = r6.f459388d
            java.lang.String r4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(r4, r5)
            r3.append(r4)
            java.lang.String r6 = ca4.z0.U(r6)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            boolean r3 = com.p314xaae8f345.mm.vfs.w6.j(r6)
            if (r3 == 0) goto L81
            goto Lb4
        L81:
            r6 = r2
            goto Lb4
        L83:
            java.lang.String r2 = r6.f459388d
            java.lang.String r3 = "pre_temp_extend_pic"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L97
            java.lang.String r6 = r6.f459388d
            r2 = 19
            java.lang.String r6 = r6.substring(r2)
            goto Lb4
        L97:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di()
            java.lang.String r4 = r6.f459388d
            java.lang.String r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(r3, r4)
            r2.append(r3)
            java.lang.String r6 = ca4.z0.N(r6)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
        Lb4:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.q(r45.jj4):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.j(r8) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String r(r45.jj4 r8) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.r(r45.jj4):java.lang.String");
    }

    public static java.lang.String t(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsDirectThumbPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.U(jj4Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsDirectThumbPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.j(r6) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String u(r45.jj4 r6) {
        /*
            java.lang.String r0 = "getSnsDirectUhdPath"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            if (r6 != 0) goto Le
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            r6 = 0
            return r6
        Le:
            java.lang.String r2 = r6.f459388d
            java.lang.String r3 = "pre_temp_sns_pic"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ni()
            r2.append(r3)
            java.lang.String r6 = r6.f459388d
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            goto Lb4
        L30:
            java.lang.String r2 = r6.f459388d
            java.lang.String r3 = "Locall_path"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L83
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di()
            java.lang.String r4 = r6.f459388d
            java.lang.String r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(r3, r4)
            r2.append(r3)
            java.lang.String r3 = ca4.z0.W(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r3 = com.p314xaae8f345.mm.vfs.w6.j(r2)
            if (r3 != 0) goto L81
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di()
            java.lang.String r5 = r6.f459388d
            java.lang.String r4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(r4, r5)
            r3.append(r4)
            java.lang.String r6 = ca4.z0.U(r6)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            boolean r3 = com.p314xaae8f345.mm.vfs.w6.j(r6)
            if (r3 == 0) goto L81
            goto Lb4
        L81:
            r6 = r2
            goto Lb4
        L83:
            java.lang.String r2 = r6.f459388d
            java.lang.String r3 = "pre_temp_extend_pic"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L97
            java.lang.String r6 = r6.f459388d
            r2 = 19
            java.lang.String r6 = r6.substring(r2)
            goto Lb4
        L97:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di()
            java.lang.String r4 = r6.f459388d
            java.lang.String r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(r3, r4)
            r2.append(r3)
            java.lang.String r6 = ca4.z0.d0(r6)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
        Lb4:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.u(r45.jj4):java.lang.String");
    }

    public boolean A(r45.jj4 jj4Var) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFileExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (jj4Var == null || (str = jj4Var.f459388d) == null || str.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFileExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.e0(jj4Var))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFileExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.U(jj4Var))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFileExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        boolean g17 = ca4.z0.g((com.p314xaae8f345.mm.p872xbfc2bd01.r) this.f245787c.get(ca4.z0.x(1, jj4Var.f459388d)));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFileExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return g17;
    }

    public boolean B(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isHidePlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.HashMap hashMap = this.f245794j;
        if (!hashMap.containsKey(jj4Var.f459388d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isHidePlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        if (((java.lang.Integer) hashMap.get(jj4Var.f459388d)).intValue() == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isHidePlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isHidePlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return false;
    }

    public boolean C(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLoadBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.HashMap hashMap = this.f245794j;
        if (!hashMap.containsKey(jj4Var.f459388d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLoadBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        if (((java.lang.Integer) hashMap.get(jj4Var.f459388d)).intValue() == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLoadBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLoadBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return false;
    }

    public boolean D(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isMediaSightExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d);
        if (com.p314xaae8f345.mm.vfs.w6.j(d17 + ca4.z0.R(jj4Var))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isMediaSightExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(d17 + ca4.z0.Y(jj4Var)) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jj4Var.f459388d) && jj4Var.f459388d.startsWith("Locall_path")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isMediaSightExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isMediaSightExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return false;
    }

    public boolean E(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.HashMap hashMap = this.f245794j;
        if (!hashMap.containsKey(jj4Var.f459388d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        if (((java.lang.Integer) hashMap.get(jj4Var.f459388d)).intValue() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return false;
    }

    public final boolean F(java.lang.String str, int i17) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseInfoXml", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "SightDownloadControl", null);
        if (d17 == null || d17.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseInfoXml", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        if (i17 == 1) {
            z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".SightDownloadControl.G3PlusAutoDownload"), 0) == 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseInfoXml", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return z17;
        }
        z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".SightDownloadControl.WifiAutoDownload"), 0) == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseInfoXml", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return z17;
    }

    public void G() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pause", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.LazyerImageLoader2", "%s download queue set pause", "[image-flow]");
        this.f245796l = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 Cj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj();
        Cj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pause", "com.tencent.mm.plugin.sns.model.DownloadManager");
        Cj.f245979i = false;
        Cj.p();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public java.lang.String H(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, r45.jj4 jj4Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, boolean z17, java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (E(jj4Var)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return "";
        }
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d);
        java.lang.String R = ca4.z0.R(jj4Var);
        if (com.p314xaae8f345.mm.vfs.w6.j(d17 + R)) {
            java.lang.String str3 = d17 + R;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return str3;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(d17 + ca4.z0.Y(jj4Var)) && (str2 = jj4Var.f459388d) != null && str2.startsWith("Locall_path")) {
            java.lang.String str4 = d17 + ca4.z0.Y(jj4Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return str4;
        }
        if (!this.f245796l) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "push sight loader " + jj4Var.f459388d + " url: " + jj4Var.f459391g);
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "do no auto download sns sight.");
        } else if (v(c17933xe8d1b226) == 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y1(this, jj4Var, s7Var, str), 0L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return "";
    }

    public boolean I(int i17, r45.jj4 jj4Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (jj4Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        boolean z17 = jj4Var.N;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "pushToImageLoaderUi snsid:%s, isRun:%s isAd:%b mediaId:%s", str, java.lang.Boolean.valueOf(this.f245796l), java.lang.Boolean.valueOf(z17), jj4Var.f459388d);
        if (this.f245796l || z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Sj().execute(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x1(this, jj4Var, i17, s7Var, str));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jj4Var.f459388d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().x(jj4Var.f459388d);
        }
        java.lang.String mediaId = jj4Var.f459388d;
        ta4.u0 u0Var = ta4.u0.f498371a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cancelImageLoadByFling", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        pm0.v.O("SnsImageLoadReporter", new ta4.z(mediaId));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cancelImageLoadByFling", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return false;
    }

    public boolean J(java.lang.String str, com.p314xaae8f345.mm.p872xbfc2bd01.r rVar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putCacheUI", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        L(i17 + "-" + str, rVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putCacheUI", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    public boolean K(java.lang.String str, java.lang.String str2) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanLoadBarState", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.HashMap hashMap = this.f245794j;
        if (hashMap.containsKey(str) && 3 == ((java.lang.Integer) hashMap.get(str)).intValue()) {
            hashMap.remove(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanLoadBarState", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.lang.String x17 = ca4.z0.x(1, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "TimeLineAdPreloadHelper, download video complete, mediaId=" + str + ", path=" + str2);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) ((java.util.concurrent.ConcurrentHashMap) this.f245790f).get(x17);
        n74.a0 a0Var = new n74.a0(str, str2, n74.y.f416980f);
        n74.h0 h0Var = n74.h0.f416896a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        java.util.Set set = n74.h0.f416900e;
        synchronized (set) {
            try {
                if (set.contains(str)) {
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) n74.h0.c(str)).k(a0Var);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        if (copyOnWriteArrayList == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2 b2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2) ((java.lang.ref.WeakReference) it.next()).get();
            if (b2Var != null && b2Var.f245621d && x17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
                if (x17.equals(b2Var.f245618a)) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.concurrent.ConcurrentHashMap) this.f245789e).get(java.lang.Integer.valueOf(b2Var.a()));
                    if (weakReference != null && (obj = weakReference.get()) != null) {
                        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "download fin set sight %s %s", str, str2);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a) obj;
                            if (aVar.mo69271x5fc924c3() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9) aVar.mo69271x5fc924c3();
                                if (g9Var == null) {
                                    aVar.d(str2, !this.f245796l, 0);
                                } else if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                                    aVar.d(str2, !this.f245796l, g9Var.f249946c);
                                    aVar.mo69275xa32537ab(g9Var.f249946c);
                                    g9Var.f249953j.setVisibility(8);
                                    g9Var.f249952i.setVisibility(8);
                                    g9Var.f249954k.setVisibility(8);
                                    f(str);
                                } else {
                                    Q(str);
                                    g9Var.f249953j.setVisibility(8);
                                    g9Var.f249952i.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.brn);
                                    g9Var.f249952i.setVisibility(0);
                                }
                            }
                        } else if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18406x5acd4424) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "SnsAdTimelineVideoView, download fin set sight %s %s", str, str2);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18406x5acd4424 c18406x5acd4424 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18406x5acd4424) obj;
                            if (c18406x5acd4424.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9) c18406x5acd4424.getTag();
                                if (g9Var2 == null) {
                                    c18406x5acd4424.m71252xab3268fe(str2);
                                    c18406x5acd4424.m71248xa59621c0(true);
                                } else if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                                    c18406x5acd4424.m71252xab3268fe(str2);
                                    c18406x5acd4424.m71248xa59621c0(true);
                                    g9Var2.f249953j.setVisibility(8);
                                    g9Var2.f249952i.setVisibility(8);
                                    g9Var2.f249954k.setVisibility(8);
                                    f(str);
                                } else {
                                    Q(str);
                                    g9Var2.f249953j.setVisibility(8);
                                    g9Var2.f249952i.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.brn);
                                    g9Var2.f249952i.setVisibility(0);
                                }
                            }
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    public boolean L(java.lang.String str, com.p314xaae8f345.mm.p872xbfc2bd01.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putThumbCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (rVar != null && str != null) {
            this.f245787c.put(str, rVar);
            n74.h0.e(str, new n74.z(str, new java.lang.ref.WeakReference(rVar), n74.y.f416980f));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putThumbCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    public final void M(java.lang.String str, r45.jj4 jj4Var, java.lang.String str2, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("recordStartLoadImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRequestTypeFromMedia", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        int i17 = jj4Var.f459389e == 6 ? 5 : 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRequestTypeFromMedia", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (z17) {
            i17 = 9;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.LazyerImageLoader2", "recordStartLoadImage:%s, cacheName:%s, fromScene:%s", jj4Var.f459388d, str2, s7Var.f276845a);
        ta4.u0.p(str, jj4Var.f459388d, i17, s7Var.f276845a, true, jj4Var.N);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordStartLoadImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void N(android.app.Activity activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeImageFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.Map map = this.f245789e;
        ((java.util.concurrent.ConcurrentHashMap) map).size();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f245793i;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2 b2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2) it.next();
            if (O(activity.getWindow().getDecorView(), b2Var.a())) {
                linkedList.add(java.lang.Integer.valueOf(b2Var.a()));
            }
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Integer) it6.next()).intValue();
            ((java.util.concurrent.ConcurrentHashMap) map).remove(java.lang.Integer.valueOf(intValue));
            java.util.Iterator it7 = copyOnWriteArraySet.iterator();
            while (true) {
                if (it7.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2 b2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2) it7.next();
                    if (b2Var2.a() == intValue) {
                        copyOnWriteArraySet.remove(b2Var2);
                        break;
                    }
                }
            }
        }
        linkedList.clear();
        java.util.Iterator it8 = copyOnWriteArraySet.iterator();
        while (it8.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2 b2Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2) it8.next();
            if (b2Var3.f245620c == activity.hashCode()) {
                linkedList.add(java.lang.Integer.valueOf(b2Var3.a()));
            }
        }
        java.util.Iterator it9 = linkedList.iterator();
        while (it9.hasNext()) {
            int intValue2 = ((java.lang.Integer) it9.next()).intValue();
            ((java.util.concurrent.ConcurrentHashMap) map).remove(java.lang.Integer.valueOf(intValue2));
            java.util.Iterator it10 = copyOnWriteArraySet.iterator();
            while (true) {
                if (it10.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2 b2Var4 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2) it10.next();
                    if (b2Var4.a() == intValue2) {
                        copyOnWriteArraySet.remove(b2Var4);
                        break;
                    }
                }
            }
        }
        this.f245788d.a();
        ((java.util.concurrent.ConcurrentHashMap) map).size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeImageFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public final boolean O(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeImageIvInParis", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (view.hashCode() == i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeImageIvInParis", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            do {
                childCount--;
                if (childCount >= 0) {
                }
            } while (!O(viewGroup.getChildAt(childCount), i17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeImageIvInParis", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeImageIvInParis", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return false;
    }

    public void P(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeImageViewFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (view instanceof android.widget.ImageView) {
            ((android.widget.ImageView) view).setImageBitmap(null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeImageViewFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else if (!(view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeImageViewFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f) view).mo69290xd44890a8(null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeImageViewFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        }
    }

    public void Q(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f245794j.put(str, 4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public final void R(java.lang.Object obj, java.lang.String str, com.p314xaae8f345.mm.p872xbfc2bd01.r rVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageDrawable", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (obj == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageDrawable", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return;
        }
        if (rVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.LazyerImageLoader2", "setImageDrawable %s %s %s", obj, str, rVar + " " + rVar.f150503d);
        }
        long j17 = 0;
        if (obj instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3) {
            final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 c22637x66bb02b3 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3) obj;
            android.graphics.drawable.Drawable m81416x4a96be14 = c22637x66bb02b3.m81416x4a96be14();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c22637x66bb02b3.m81413x489d787a()) && c22637x66bb02b3.m81413x489d787a().equals(str)) {
                j17 = c22637x66bb02b3.m81414x7a13ab3f();
            }
            if (m81416x4a96be14 != null && (m81416x4a96be14 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5)) {
                j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5) m81416x4a96be14).d();
            }
            final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5 p5Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5(str, rVar, j17);
            c22637x66bb02b3.H = p5Var.d();
            c22637x66bb02b3.I = str;
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                c22637x66bb02b3.mo46895x706225d7(p5Var);
                p5Var.invalidateSelf();
            } else {
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.model.i1$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$setImageDrawable$0", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 c22637x66bb02b32 = com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3.this;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5 p5Var2 = p5Var;
                        c22637x66bb02b32.mo46895x706225d7(p5Var2);
                        p5Var2.invalidateSelf();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$setImageDrawable$0", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                });
            }
        } else if (obj instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07) {
            final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 c22636xb1ac8c07 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07) obj;
            final mt0.a aVar = new mt0.a(str, rVar);
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                c22636xb1ac8c07.mo46895x706225d7(aVar);
                aVar.invalidateSelf();
            } else {
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.model.i1$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$setImageDrawable$1", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 c22636xb1ac8c072 = com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07.this;
                        mt0.a aVar2 = aVar;
                        c22636xb1ac8c072.mo46895x706225d7(aVar2);
                        aVar2.invalidateSelf();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$setImageDrawable$1", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                });
            }
        } else if (obj instanceof android.widget.ImageView) {
            final android.widget.ImageView imageView = (android.widget.ImageView) obj;
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5 p5Var2 = (drawable == null || !(drawable instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5)) ? new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5(str, rVar, 0L) : new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5(str, rVar, ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5) drawable).d());
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                imageView.setImageDrawable(p5Var2);
                p5Var2.invalidateSelf();
            } else {
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.model.i1$$d
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$setImageDrawable$2", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        android.widget.ImageView imageView2 = imageView;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5 p5Var3 = p5Var2;
                        imageView2.setImageDrawable(p5Var3);
                        p5Var3.invalidateSelf();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$setImageDrawable$2", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                });
            }
        } else if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "update sight thumb " + str);
            if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f) {
                final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f c17689x58a87b4f = (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f) obj;
                android.graphics.drawable.Drawable m81416x4a96be142 = c17689x58a87b4f.m81416x4a96be14();
                final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5 p5Var3 = (m81416x4a96be142 == null || !(m81416x4a96be142 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5)) ? new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5(str, rVar, 0L) : new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5(str, rVar, ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5) m81416x4a96be142).d());
                if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                    c17689x58a87b4f.mo46895x706225d7(p5Var3);
                    p5Var3.invalidateSelf();
                } else {
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.model.i1$$e
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$setImageDrawable$3", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f c17689x58a87b4f2 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f.this;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5 p5Var4 = p5Var3;
                            c17689x58a87b4f2.mo46895x706225d7(p5Var4);
                            p5Var4.invalidateSelf();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$setImageDrawable$3", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        }
                    });
                }
            }
        } else if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18406x5acd4424) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "SnsAdTimelineVideoView, setImageDrawable, key=" + str);
            final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18406x5acd4424 c18406x5acd4424 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18406x5acd4424) obj;
            android.graphics.drawable.Drawable m71244x957e1cde = c18406x5acd4424.m71244x957e1cde();
            final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5 p5Var4 = (m71244x957e1cde == null || !(m71244x957e1cde instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5)) ? new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5(str, rVar, 0L) : new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5(str, rVar, ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5) m71244x957e1cde).d());
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                c18406x5acd4424.m71250x28548352(p5Var4);
                p5Var4.invalidateSelf();
            } else {
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.model.i1$$f
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$setImageDrawable$4", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18406x5acd4424 c18406x5acd44242 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18406x5acd4424.this;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5 p5Var5 = p5Var4;
                        c18406x5acd44242.m71250x28548352(p5Var5);
                        p5Var5.invalidateSelf();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$setImageDrawable$4", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                });
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageDrawable", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void S(android.view.View view, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageViewBmp", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        u0(view, null, true, -1, i19, -1, -1, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_NONE);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (i17 != -1) {
            view.setBackgroundResource(i17);
        }
        if (i18 != -1) {
            if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3) {
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3) view).m81425x8d516947(i18);
            } else if (view instanceof android.widget.ImageView) {
                ((android.widget.ImageView) view).setImageDrawable(i65.a.i(view.getContext(), i18));
            }
        } else if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3) view).mo46895x706225d7(new android.graphics.drawable.ColorDrawable(view.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d)));
        } else if (view instanceof android.widget.ImageView) {
            ((android.widget.ImageView) view).setImageDrawable(new android.graphics.drawable.ColorDrawable(view.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageViewBmp", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public boolean T(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, r45.jj4 jj4Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 c17972xe84284f4, int i17, int i18, int i19, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, boolean z17, boolean z18, boolean z19) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImproveSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (jj4Var == null || (str = jj4Var.f459388d) == null || str.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImproveSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        java.lang.String x17 = ca4.z0.x(1, jj4Var.f459388d);
        M(c17933xe8d1b226.m70367x7525eefd(), jj4Var, x17, s7Var, false);
        s0(c17972xe84284f4, x17, true, i17, i18);
        c17972xe84284f4.setTag(null);
        com.p314xaae8f345.mm.p872xbfc2bd01.r k17 = k(x17, jj4Var.f459388d);
        if (ca4.z0.g(k17)) {
            R(c17972xe84284f4, x17, k17, false);
            ta4.u0.m(jj4Var.f459388d);
            ta4.u0.o(jj4Var.f459388d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImproveSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        if (i17 == -1) {
            c17972xe84284f4.mo69290xd44890a8(null);
        }
        if (((java.util.HashSet) this.f245807w).contains(x17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImproveSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        boolean I = I(1, jj4Var, s7Var, ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImproveSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return I;
    }

    public void U(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLoadingBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f245794j.put(jj4Var.f459388d, 3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLoadingBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void V(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f245794j.put(jj4Var.f459388d, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public boolean W(r45.jj4 jj4Var, android.view.View view, int i17, int i18, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsBigImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        boolean i07 = i0(jj4Var, view, i17, i18, s7Var, 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsBigImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return i07;
    }

    public void X(java.lang.String str, r45.jj4 jj4Var, android.view.View view, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1 z1Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        b0(jj4Var, view, i17, i18, z1Var, s7Var, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void Y(java.lang.String str, r45.jj4 jj4Var, android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1 z1Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        X(str, jj4Var, view, -1, i17, z1Var, s7Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void Z(java.lang.String str, r45.jj4 jj4Var, android.view.View view, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        b0(jj4Var, view, -1, i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_NONE, s7Var, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void a0(r45.jj4 jj4Var, android.view.View view, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1 z1Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        b0(jj4Var, view, i17, i18, z1Var, s7Var, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void b0(r45.jj4 jj4Var, android.view.View view, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1 z1Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (jj4Var == null || (str2 = jj4Var.f459388d) == null || str2.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return;
        }
        view.setDrawingCacheEnabled(false);
        java.lang.String x17 = ca4.z0.x(0, jj4Var.f459388d);
        M(str, jj4Var, x17, s7Var, false);
        v0(view, x17, true, i17, i18, z1Var);
        com.p314xaae8f345.mm.p872xbfc2bd01.r k17 = k(x17, jj4Var.f459388d);
        if (ca4.z0.g(k17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "setSnsGrid cache hit");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().x(jj4Var.f459388d);
            R(view, x17, k17, false);
            ta4.u0.m(jj4Var.f459388d);
            ta4.u0.o(jj4Var.f459388d);
            if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().A(jj4Var) && pc4.d.f434943a.k()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "[%s][id:%s][media:%s] local file not exist,re download", "[image-flow]", str, jj4Var.f459388d);
                I(0, jj4Var, s7Var, str);
            }
        } else {
            if (i17 == -1) {
                q0(view);
            }
            if (((java.util.HashSet) this.f245807w).contains(x17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "%s in hashSet ignore", x17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                return;
            }
            I(0, jj4Var, s7Var, str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void c0(r45.jj4 jj4Var, android.view.View view, int i17, int i18, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        a0(jj4Var, view, i17, i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_NONE, s7Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void d0(r45.jj4 jj4Var, android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1 z1Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        a0(jj4Var, view, -1, i17, z1Var, s7Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public boolean e(ca4.s0 s0Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDeocodeElment", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        r45.jj4 jj4Var = (r45.jj4) s0Var.b().get(0);
        int i17 = 1;
        while (true) {
            if (i17 >= s0Var.b().size()) {
                break;
            }
            r45.jj4 jj4Var2 = (r45.jj4) s0Var.b().get(i17);
            if (str != null && str.indexOf(jj4Var2.f459388d) >= 0) {
                jj4Var = jj4Var2;
                break;
            }
            i17++;
        }
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d);
        java.lang.String e07 = s0Var.a() == 0 ? ca4.z0.e0(jj4Var) : s0Var.a() == 4 ? ca4.z0.M(jj4Var) : s0Var.a() == 5 ? ca4.z0.M(jj4Var) : s0Var.a() == 3 ? ca4.z0.J(jj4Var) : s0Var.a() == 8 ? ca4.z0.d0(jj4Var) : s0Var.a() == 9 ? ca4.z0.N(jj4Var) : ca4.z0.U(jj4Var);
        if (!this.f245787c.k(ca4.z0.x(s0Var.a(), jj4Var.f459388d))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2 a2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2(this, ca4.z0.x(s0Var.a(), jj4Var.f459388d), d17 + e07, d17, jj4Var, s0Var.a());
            java.util.Set set = this.f245807w;
            if (!((java.util.HashSet) set).contains(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2.e(a2Var))) {
                ((java.util.HashSet) set).add(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2.e(a2Var));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "addDeocodeElment key:%s, media:%s", com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2.e(a2Var), jj4Var.f459388d);
                a2Var.d(new java.lang.String[0]);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDeocodeElment", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    public void e0(r45.jj4 jj4Var, android.view.View view, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        c0(jj4Var, view, -1, i17, s7Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public boolean f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanErrorState", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.HashMap hashMap = this.f245794j;
        if (hashMap.containsKey(str) && 4 == ((java.lang.Integer) hashMap.get(str)).intValue()) {
            hashMap.remove(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanErrorState", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    public void f0(r45.jj4 jj4Var, android.view.View view, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        b0(jj4Var, view, -1, i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_NONE, s7Var, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanSnsCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (this.f245787c != null) {
            ((java.util.concurrent.ConcurrentHashMap) this.f245789e).clear();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w5 w5Var = this.f245788d;
            w5Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
            ((java.util.HashMap) w5Var.f246269a).clear();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("putCount:");
            sb6.append(this.f245787c.f());
            sb6.append(";");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("missCount:");
            sb7.append(this.f245787c.a());
            sb7.append(";");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("hitCount:");
            sb8.append(this.f245787c.e());
            sb8.append(";");
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("createCount:");
            sb9.append(this.f245787c.b());
            sb9.append(";");
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("evictionCount:");
            sb10.append(this.f245787c.h());
            sb10.append(";");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "report lurcache ");
            this.f245787c.d(-1);
        }
        n74.h0 h0Var = n74.h0.f416896a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeAllThumbDownloadChannel", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        java.util.Map map = n74.h0.f416897b;
        synchronized (map) {
            try {
                ((java.util.LinkedHashMap) map).clear();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeAllThumbDownloadChannel", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeAllThumbDownloadChannel", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        this.f245788d.a();
        java.lang.System.gc();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanSnsCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void g0(java.lang.String str, java.util.List list, android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1 z1Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        h0(str, list, view, i17, z1Var, s7Var, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public boolean h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18406x5acd4424 c18406x5acd4424, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        s0(c18406x5acd4424, "", true, i17, i18);
        c18406x5acd4424.m71249xd3f79a51(null);
        c18406x5acd4424.u();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    public void h0(java.lang.String str, java.util.List list, android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1 z1Var, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, boolean z17) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (list == null || list.size() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return;
        }
        int size = list.size();
        java.util.Set set = this.f245807w;
        if (size == 1) {
            if (z17) {
                r45.jj4 jj4Var = (r45.jj4) list.get(0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1 z1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_SNSUSER;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsBlurGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                if (jj4Var == null || (str2 = jj4Var.f459388d) == null || str2.equals("")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsBlurGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                } else {
                    view.setDrawingCacheEnabled(false);
                    java.lang.String x17 = ca4.z0.x(5, jj4Var.f459388d);
                    M(str, jj4Var, x17, s7Var, false);
                    v0(view, x17, true, -1, i17, z1Var2);
                    com.p314xaae8f345.mm.p872xbfc2bd01.r k17 = k(x17, jj4Var.f459388d);
                    if (ca4.z0.g(k17)) {
                        R(view, x17, k17, false);
                        ta4.u0.m(jj4Var.f459388d);
                        ta4.u0.o(jj4Var.f459388d);
                    } else {
                        q0(view);
                        if (((java.util.HashSet) set).contains(x17)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsBlurGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        } else {
                            I(5, jj4Var, s7Var, str);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsBlurGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                }
            } else {
                Z(str, (r45.jj4) list.get(0), view, i17, s7Var);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return;
        }
        java.lang.String O = ca4.z0.O(list);
        java.lang.String x18 = ca4.z0.x(0, O);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.jj4 jj4Var2 = (r45.jj4) it.next();
            if (O.contains(jj4Var2.f459388d)) {
                M(str, jj4Var2, x18, s7Var, false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        u0(view, x18, true, -1, i17, -1, -1, z1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.mm.p872xbfc2bd01.r k18 = k(x18, O);
        if (ca4.z0.g(k18)) {
            R(view, x18, k18, false);
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                r45.jj4 jj4Var3 = (r45.jj4) it6.next();
                ta4.u0.m(jj4Var3.f459388d);
                ta4.u0.o(jj4Var3.f459388d);
            }
        } else {
            q0(view);
            if (((java.util.HashSet) set).contains(x18)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                return;
            }
            new java.lang.ref.WeakReference(view);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Sj().execute(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.u1(this, list, 0, s7Var, str));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public boolean i(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7 c19747xde723c7, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        s0(c19747xde723c7, "", true, i17, i18);
        c19747xde723c7.mo69276xd3f79a51(null);
        c19747xde723c7.d(null, false, i19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    public boolean i0(r45.jj4 jj4Var, android.view.View view, int i17, int i18, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, int i19, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (jj4Var == null || (str2 = jj4Var.f459388d) == null || str2.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        java.lang.String x17 = ca4.z0.x(i19, jj4Var.f459388d);
        M(str, jj4Var, x17, s7Var, false);
        s0(view, x17, true, i17, i18);
        com.p314xaae8f345.mm.p872xbfc2bd01.r k17 = k(x17, jj4Var.f459388d);
        boolean g17 = ca4.z0.g(k17);
        boolean z17 = jj4Var.N;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "[%s][id:%s][media:%s] setSnsImage ad:%b bmAvailable:%b cacheName:%s isRun:%b", "[image-flow]", str, jj4Var.f459388d, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(g17), x17, java.lang.Boolean.valueOf(this.f245796l));
        if (g17) {
            R(view, x17, k17, false);
            ta4.u0.m(jj4Var.f459388d);
            ta4.u0.o(jj4Var.f459388d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "[%s][id:%s][media:%s] loadHitCache", "[image-flow]", str, jj4Var.f459388d, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(g17), x17, java.lang.Boolean.valueOf(this.f245796l));
            if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().A(jj4Var) && pc4.d.f434943a.k()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "[%s][id:%s][media:%s] local file not exist,re download", "[image-flow]", str, jj4Var.f459388d);
                I(i19, jj4Var, s7Var, str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        if (i17 == -1) {
            q0(view);
            str3 = "MicroMsg.LazyerImageLoader2";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[%s][id:%s][media:%s] updateDefaultImg", "[image-flow]", str, jj4Var.f459388d, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(g17), x17, java.lang.Boolean.valueOf(this.f245796l));
        } else {
            str3 = "MicroMsg.LazyerImageLoader2";
        }
        if (((java.util.HashSet) this.f245807w).contains(x17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[%s][id:%s][media:%s] already in hashSet,ignore this", "[image-flow]", str, jj4Var.f459388d, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(g17), x17, java.lang.Boolean.valueOf(this.f245796l));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        boolean I = I(i19, jj4Var, s7Var, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return I;
    }

    public com.p314xaae8f345.mm.p872xbfc2bd01.r j(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCacheBm", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        jt0.i iVar = this.f245787c;
        if (iVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCacheBm", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        com.p314xaae8f345.mm.p872xbfc2bd01.r rVar = (com.p314xaae8f345.mm.p872xbfc2bd01.r) iVar.get(i17 + "-" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCacheBm", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return rVar;
    }

    public boolean j0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, r45.jj4 jj4Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7 c19747xde723c7, int i17, int i18, int i19, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        boolean k07 = k0(c17933xe8d1b226, jj4Var, c19747xde723c7, i17, i18, i19, s7Var, z17, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return k07;
    }

    public com.p314xaae8f345.mm.p872xbfc2bd01.r k(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCacheSns", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        jt0.i iVar = this.f245787c;
        com.p314xaae8f345.mm.p872xbfc2bd01.r rVar = (com.p314xaae8f345.mm.p872xbfc2bd01.r) iVar.get(str);
        if (rVar != null && !rVar.e()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCacheSns", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return rVar;
        }
        iVar.mo141381xc84af884(str);
        n74.h0.d(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCacheSns", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return null;
    }

    public boolean k0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, r45.jj4 jj4Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7 c19747xde723c7, int i17, int i18, int i19, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, boolean z17, boolean z18) {
        boolean z19;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (jj4Var == null || (str = jj4Var.f459388d) == null || str.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            z19 = false;
        } else {
            java.lang.String x17 = ca4.z0.x(1, jj4Var.f459388d);
            M(c17933xe8d1b226.m70367x7525eefd(), jj4Var, x17, s7Var, false);
            s0(c19747xde723c7, x17, true, i17, i18);
            java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d);
            java.lang.String U = ca4.z0.U(jj4Var);
            if (com.p314xaae8f345.mm.vfs.w6.j(d17 + U)) {
                str2 = d17;
                str3 = "";
                str4 = U;
            } else {
                ca4.s0 s0Var = new ca4.s0(jj4Var);
                s0Var.d(1);
                s0Var.e(jj4Var.f459388d);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 Cj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj();
                if (jj4Var.f459389e == 6) {
                    i27 = 5;
                    str3 = "";
                } else {
                    str3 = "";
                    i27 = 1;
                }
                str4 = U;
                str2 = d17;
                Cj.e(jj4Var, i27, s0Var, s7Var, ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
            }
            java.lang.String H = z17 ? H(c17933xe8d1b226, jj4Var, s7Var, z17, ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e)) : str3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "setsight %s sightPath %s isAd %b", x17, H, java.lang.Boolean.valueOf(z17));
            android.graphics.Bitmap bitmap = null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(H) || E(jj4Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "sightPath %s", H);
                c19747xde723c7.mo69327xab3268fe(null);
                c19747xde723c7.p();
                com.p314xaae8f345.mm.p872xbfc2bd01.r k17 = k(x17, jj4Var.f459388d);
                if (ca4.z0.g(k17)) {
                    R(c19747xde723c7, x17, k17, false);
                    ta4.u0.m(jj4Var.f459388d);
                    ta4.u0.o(jj4Var.f459388d);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    z19 = true;
                } else {
                    if (i17 == -1) {
                        c19747xde723c7.mo69275xa32537ab(0);
                        c19747xde723c7.mo69276xd3f79a51(null);
                    }
                    if (((java.util.HashSet) this.f245807w).contains(x17)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    } else {
                        I(1, jj4Var, s7Var, ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                    z19 = false;
                }
            } else {
                if (!H.equals(c19747xde723c7.mo69272x4edea88a())) {
                    if (z18) {
                        bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str2 + str4, null);
                    }
                    c19747xde723c7.mo69276xd3f79a51(bitmap);
                }
                c19747xde723c7.mo69327xab3268fe(H);
                c19747xde723c7.mo69275xa32537ab(i19);
                ta4.u0.m(jj4Var.f459388d);
                ta4.u0.o(jj4Var.f459388d);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                z19 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return z19;
    }

    public boolean l0(r45.jj4 jj4Var, android.view.View view, int i17, int i18, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        boolean i07 = i0(jj4Var, view, i17, i18, s7Var, 1, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return i07;
    }

    public final android.graphics.Bitmap m(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w5 w5Var, java.lang.String str) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFromWeakReferenceB", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        w5Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
        java.util.HashMap hashMap = (java.util.HashMap) w5Var.f246269a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v5) hashMap.get(str);
        if (v5Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
            obj = null;
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v5) hashMap.get(str)).a();
            obj = v5Var.f246253a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFromWeakReference ");
        sb6.append(str);
        sb6.append("  ");
        sb6.append(weakReference == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", sb6.toString());
        if (weakReference == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFromWeakReferenceB", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) weakReference.get();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFromWeakReferenceB", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return bitmap;
    }

    public void m0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.LazyerImageLoader2", "%s download queue set start", "[image-flow]");
        this.f245796l = true;
        o0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 Cj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj();
        Cj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.model.DownloadManager");
        Cj.f245979i = true;
        Cj.A();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public android.graphics.Bitmap n(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, java.lang.String str4, java.lang.String str5) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (!z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        r45.jj4 h17 = m21.y.h(str3, 2, str2, str2, 1, 1, "");
        ca4.z0.x(2, str3);
        if (str3.equals("")) {
            android.graphics.Bitmap o17 = ca4.z0.o(str);
            android.graphics.Bitmap bitmap = ca4.z0.f(o17) ? o17 : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return bitmap;
        }
        if (ca4.z0.f(null)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        android.graphics.Bitmap o18 = ca4.z0.o(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), str3) + ca4.z0.J(h17));
        if (!ca4.z0.f(o18)) {
            o18 = ca4.z0.o(str);
        }
        if (o18 == null && z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 Cj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj();
            Cj.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
            Cj.f(h17, 3, null, s7Var, null, str4, str5, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        }
        if (ca4.z0.f(o18)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return o18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n0(r45.jj4 r9, int r10, com.p314xaae8f345.mm.p2621x8fb0427b.s7 r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "tryGetSnsBm"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            r2 = 0
            if (r9 == 0) goto Le4
            java.lang.String r3 = r9.f459388d
            if (r3 == 0) goto Le4
            java.lang.String r4 = ""
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L19
            goto Le4
        L19:
            r3 = 3
            r4 = 1
            if (r10 != r3) goto L1f
        L1d:
            r10 = r2
            goto L2c
        L1f:
            r3 = 4
            if (r10 != r3) goto L2c
            java.lang.String r10 = r9.A1
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L2b
            goto L1d
        L2b:
            r10 = r4
        L2c:
            java.lang.String r3 = r9.f459388d
            java.lang.String r5 = "Locall_path"
            boolean r3 = r3.startsWith(r5)
            r5 = 2
            if (r3 == 0) goto L55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di()
            java.lang.String r7 = r9.f459388d
            java.lang.String r6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(r6, r7)
            r3.append(r6)
            java.lang.String r6 = ca4.z0.W(r9)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            goto Lb2
        L55:
            if (r10 != r5) goto L75
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di()
            java.lang.String r7 = r9.f459388d
            java.lang.String r6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(r6, r7)
            r3.append(r6)
            java.lang.String r6 = ca4.z0.d0(r9)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            goto Lb2
        L75:
            if (r10 != r4) goto L95
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di()
            java.lang.String r7 = r9.f459388d
            java.lang.String r6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(r6, r7)
            r3.append(r6)
            java.lang.String r6 = ca4.z0.N(r9)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            goto Lb2
        L95:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di()
            java.lang.String r7 = r9.f459388d
            java.lang.String r6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(r6, r7)
            r3.append(r6)
            java.lang.String r6 = ca4.z0.J(r9)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
        Lb2:
            boolean r3 = com.p314xaae8f345.mm.vfs.w6.j(r3)
            if (r3 != 0) goto Le0
            r3 = 0
            if (r10 != r5) goto Lc5
            com.tencent.mm.plugin.sns.model.m0 r10 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj()
            r12 = 10
            r10.d(r9, r12, r3, r11)
            goto Ldc
        Lc5:
            if (r10 != r4) goto Ld1
            com.tencent.mm.plugin.sns.model.m0 r10 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj()
            r12 = 11
            r10.d(r9, r12, r3, r11)
            goto Ldc
        Ld1:
            com.tencent.mm.plugin.sns.model.m0 r10 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj()
            if (r12 == 0) goto Ld9
            r5 = 8
        Ld9:
            r10.d(r9, r5, r3, r11)
        Ldc:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        Le0:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r4
        Le4:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.n0(r45.jj4, int, com.tencent.mm.storage.s7, boolean):boolean");
    }

    public void o(r45.jj4 jj4Var, android.view.View view, int i17, boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, boolean z18, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c2 c2Var) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsDirect", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (jj4Var == null || (str2 = jj4Var.f459388d) == null || str2.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsDirect", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return;
        }
        java.lang.String x17 = ca4.z0.x(3, jj4Var.f459388d);
        java.lang.String r17 = r(jj4Var);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().l(jj4Var.f459388d)) {
            t0(view, x17, false, -1, i17, -1, -1);
            if (c2Var != null) {
                c2Var.a(null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsDirect", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return;
        }
        android.graphics.Bitmap m17 = m(this.f245788d, x17);
        if (ca4.z0.f(m17)) {
            t0(view, x17, false, -1, i17, m17.getWidth(), m17.getHeight());
            if (c2Var != null) {
                c2Var.a(m17);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.bj().execute(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m1(this, r17, view, x17, i17, z17, jj4Var, z18, s7Var, str, c2Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsDirect", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public final boolean o0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryStart", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (this.f245792h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LazyerImageLoader2", "[%s]already start,ignore start event1", "[image-flow]");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryStart", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v1(this), 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryStart", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    public android.graphics.Bitmap p(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsDirectBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.mm.p872xbfc2bd01.r k17 = k(str, str2);
        if (ca4.z0.g(k17)) {
            k17.f150507h = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsDirectBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return k17.f150503d;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsDirectBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        com.p314xaae8f345.mm.p872xbfc2bd01.r c17 = str2.startsWith("pre_temp_extend_pic") ? com.p314xaae8f345.mm.p872xbfc2bd01.r.c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.k1(str)) : com.p314xaae8f345.mm.p872xbfc2bd01.r.c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.k1(str));
        if (!ca4.z0.g(c17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsDirectBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        L(str, c17);
        c17.f150507h = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsDirectBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return c17.f150503d;
    }

    public void p0(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unSetShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f245794j.put(jj4Var.f459388d, 2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unSetShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public final void q0(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateDefaultImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f) view).mo46895x706225d7(new android.graphics.drawable.ColorDrawable(view.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d)));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateDefaultImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else if (!(view instanceof android.widget.ImageView)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateDefaultImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else {
            ((android.widget.ImageView) view).setImageDrawable(new android.graphics.drawable.ColorDrawable(view.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d)));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateDefaultImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        }
    }

    public void r0(final java.lang.String mediaId, java.lang.String str, com.p314xaae8f345.mm.p872xbfc2bd01.r rVar) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.m0.f34090x24728b, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.lang.System.currentTimeMillis();
        if (!ca4.z0.g(rVar)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCacheSns", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            jt0.i iVar = this.f245787c;
            com.p314xaae8f345.mm.p872xbfc2bd01.r rVar2 = (com.p314xaae8f345.mm.p872xbfc2bd01.r) iVar.get(str);
            if (rVar2 == null || rVar2.e()) {
                iVar.mo141381xc84af884(str);
                n74.h0.d(str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCacheSns", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                rVar = null;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCacheSns", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                rVar = rVar2;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] ImageLoader updateImageView2 key:%s bm valid:%b", "[image-flow]", mediaId, str, java.lang.Boolean.valueOf(ca4.z0.g(rVar)));
        if (ca4.z0.g(rVar)) {
            jt0.i iVar2 = this.f245787c;
            if (iVar2 != null && rVar != null && str != null) {
                iVar2.put(str, rVar);
                n74.h0.e(str, new n74.z(str, new java.lang.ref.WeakReference(rVar), n74.y.f416980f));
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) ((java.util.concurrent.ConcurrentHashMap) this.f245790f).get(str);
            if (copyOnWriteArrayList != null) {
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                boolean z17 = false;
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2 b2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2) ((java.lang.ref.WeakReference) it.next()).get();
                    if (b2Var != null && b2Var.f245621d && str != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
                        if (str.equals(b2Var.f245618a)) {
                            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.concurrent.ConcurrentHashMap) this.f245789e).get(java.lang.Integer.valueOf(b2Var.a()));
                            if (weakReference != null && (obj = weakReference.get()) != null) {
                                if (obj instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3) {
                                    synchronized (this) {
                                        try {
                                        } finally {
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.m0.f34090x24728b, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                                        }
                                    }
                                }
                                if (ca4.z0.g(rVar)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] ImageLoader load bitmap Success!!!", "[image-flow]", mediaId);
                                    java.lang.String[] mediaIds = mediaId.split("-");
                                    ta4.u0 u0Var = ta4.u0.f498371a;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showBitmapSuccess", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaIds, "mediaIds");
                                    for (java.lang.String str2 : mediaIds) {
                                        ta4.u0.o(str2);
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBitmapSuccess", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                                    z17 = true;
                                    R(obj, str, rVar, true);
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LazyerImageLoader2", "[%s][media:%s] ImageLoader load bitmap Fail!!! for bitmap recycle", "[image-flow]", mediaId);
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (!z17) {
                    ta4.u0 u0Var2 = ta4.u0.f498371a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showBitmapFail", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
                    pm0.v.O("SnsImageLoadReporter", new ta4.n0(mediaId));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBitmapFail", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LazyerImageLoader2", "[%s][media:%s] ImageLoader updateImageView fail for View null", "[image-flow]", mediaId);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LazyerImageLoader2", "[%s][media:%s] ImageLoader load bitmap Fail!!! for not found ref", "[image-flow]", mediaId);
                ta4.u0 u0Var3 = ta4.u0.f498371a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showBitmapFail", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
                pm0.v.O("SnsImageLoadReporter", new ta4.n0(mediaId));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBitmapFail", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            }
            if (this.f245795k != null) {
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.model.i1$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.this;
                        i1Var.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$updateImageView$5", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2) i1Var.f245795k).mo855x8dbd7aaa(mediaId);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$updateImageView$5", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                });
            }
        }
    }

    public android.graphics.Bitmap s(r45.jj4 jj4Var) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (jj4Var == null || (str = jj4Var.f459388d) == null || str.equals("")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        java.lang.String x17 = ca4.z0.x(1, jj4Var.f459388d);
        com.p314xaae8f345.mm.p872xbfc2bd01.r k17 = k(x17, jj4Var.f459388d);
        if (ca4.z0.g(k17)) {
            k17.f150507h = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return k17.f150503d;
        }
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.U(jj4Var);
        if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        com.p314xaae8f345.mm.p872xbfc2bd01.r c17 = jj4Var.f459388d.startsWith("pre_temp_extend_pic") ? com.p314xaae8f345.mm.p872xbfc2bd01.r.c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.k1(str2)) : ca4.z0.n(str2);
        if (!ca4.z0.g(c17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        L(x17, c17);
        c17.f150507h = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return c17.f150503d;
    }

    public final void s0(java.lang.Object obj, java.lang.String str, boolean z17, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        u0(obj, str, z17, i17, i18, -1, -1, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_NONE);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public final void t0(java.lang.Object obj, java.lang.String str, boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        u0(obj, str, z17, i17, i18, i19, i27, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_NONE);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public final void u0(java.lang.Object obj, java.lang.String str, boolean z17, int i17, int i18, int i19, int i27, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1 z1Var) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (obj == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = "default";
        }
        int hashCode = obj.hashCode();
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f245793i;
        copyOnWriteArraySet.remove(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2(null, hashCode, 0, false));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2 b2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2(str, hashCode, i18, z17);
        copyOnWriteArraySet.add(b2Var);
        java.util.Map map = this.f245790f;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = (java.util.concurrent.CopyOnWriteArrayList) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        if (copyOnWriteArrayList2 == null) {
            copyOnWriteArrayList2 = new java.util.concurrent.CopyOnWriteArrayList();
            ((java.util.concurrent.ConcurrentHashMap) map).put(str, copyOnWriteArrayList2);
        }
        copyOnWriteArrayList2.add(new java.lang.ref.WeakReference(b2Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "[%s]updateImageViewToKey cache key:%s", "[image-flow]", str);
        android.view.View view = (android.view.View) obj;
        java.lang.String str2 = (java.lang.String) view.getTag(2130706432);
        if (str2 != null && (copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) ((java.util.concurrent.ConcurrentHashMap) map).get(str2)) != null && !copyOnWriteArrayList.isEmpty()) {
            int i28 = 0;
            while (true) {
                if (i28 >= copyOnWriteArrayList.size()) {
                    i28 = -1;
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2 b2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b2) ((java.lang.ref.WeakReference) copyOnWriteArrayList.get(i28)).get();
                if (b2Var2 != null && b2Var2.f245619b == hashCode) {
                    break;
                } else {
                    i28++;
                }
            }
            if (i28 != -1) {
                copyOnWriteArrayList.remove(i28);
            }
        }
        view.setTag(2130706432, str);
        ((java.util.concurrent.ConcurrentHashMap) this.f245789e).put(java.lang.Integer.valueOf(hashCode), new java.lang.ref.WeakReference(obj));
        if (i17 != -1) {
            if (obj instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3) {
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3) obj).m81425x8d516947(i17);
            } else if (obj instanceof android.widget.ImageView) {
                android.widget.ImageView imageView = (android.widget.ImageView) obj;
                imageView.setImageDrawable(i65.a.i(imageView.getContext(), i17));
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a) obj).d(null, !this.f245796l, 0);
            }
        }
        if ((z1Var != com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_SNSUSER || (!(obj instanceof android.widget.ImageView) && !(obj instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3))) && str != null && str.startsWith("3") && !(obj instanceof android.widget.ImageView)) {
            boolean z18 = obj instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public int v(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        int w17 = w(c17933xe8d1b226, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return w17;
    }

    public final void v0(java.lang.Object obj, java.lang.String str, boolean z17, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1 z1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        u0(obj, str, z17, i17, i18, -1, -1, z1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e3, code lost:
    
        if (((java.lang.Boolean) r3.get(java.lang.Integer.valueOf(r4))).booleanValue() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e6, code lost:
    
        r5 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0115, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "isAutoAdDownload(sight_autodownload) snsID:%d, result:%d", java.lang.Long.valueOf(r12.f68891x29d1292e), java.lang.Integer.valueOf(r5));
        r13.put(java.lang.Long.valueOf(r12.f68891x29d1292e), java.lang.Integer.valueOf(r5));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0139, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0113, code lost:
    
        if (((java.lang.Boolean) r3.get(java.lang.Integer.valueOf(r4))).booleanValue() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r7) > 60000) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int w(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r12, int[] r13) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.w(com.tencent.mm.plugin.sns.storage.SnsInfo, int[]):int");
    }

    public int x(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAutoDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        int y17 = y(c17933xe8d1b226, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAutoDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return y17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0234, code lost:
    
        if (((java.lang.Boolean) r9.get(java.lang.Integer.valueOf(r7))).booleanValue() != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0266, code lost:
    
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0264, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0262, code lost:
    
        if (((java.lang.Boolean) r9.get(java.lang.Integer.valueOf(r7))).booleanValue() != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01ad A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int y(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r23, int[] r24) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.y(com.tencent.mm.plugin.sns.storage.SnsInfo, int[]):int");
    }

    public boolean z(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.HashMap hashMap = this.f245794j;
        if (!hashMap.containsKey(jj4Var.f459388d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        if (((java.lang.Integer) hashMap.get(jj4Var.f459388d)).intValue() == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return false;
    }
}
