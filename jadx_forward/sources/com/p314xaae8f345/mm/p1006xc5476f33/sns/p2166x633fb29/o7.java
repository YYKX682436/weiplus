package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class o7 implements p94.r0 {

    /* renamed from: h, reason: collision with root package name */
    public static int f246087h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f246088i;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f246089a = "";

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r2 f246090b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f246091c = false;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f246092d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f246093e;

    /* renamed from: f, reason: collision with root package name */
    public wa4.x f246094f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y3 f246095g;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().h());
        sb6.append("rangeCache.data");
        f246088i = sb6.toString();
    }

    public o7() {
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f246093e = hashSet;
        hashSet.add(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p7(this));
        this.f246094f = new wa4.x();
        this.f246095g = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.u7(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("restoreRangeCache", "com.tencent.mm.plugin.sns.model.UploadManager");
        java.lang.String str = f246088i;
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1);
        if (N == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("restoreRangeCache", "com.tencent.mm.plugin.sns.model.UploadManager");
            return;
        }
        try {
            this.f246094f = (wa4.x) new wa4.x().mo11468x92b714fd(N);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UploadManager", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.vfs.w6.h(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("restoreRangeCache", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x095b, code lost:
    
        r6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g6.f245743a;
        r6 = java.lang.String.valueOf(r20);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEmotionSafeStrategyInfoListOnPost", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, "key");
        r9 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g6.f245745c;
        r10 = (java.util.LinkedHashMap) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0979, code lost:
    
        if (r10.get(r6) != null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x097b, code lost:
    
        r9.put(r6, new java.util.ArrayList());
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0983, code lost:
    
        r6 = r10.get(r6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEmotionSafeStrategyInfoListOnPost", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        r4 = new java.util.LinkedList((java.util.List) r6);
        r3.V = r4;
        r4.size();
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0a71 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0bfe  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0433 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o7 r47, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r48) {
        /*
            Method dump skipped, instructions count: 3156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o7.a(com.tencent.mm.plugin.sns.model.o7, com.tencent.mm.plugin.sns.storage.SnsInfo):boolean");
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v7 v7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        ((java.util.HashSet) this.f246093e).add(v7Var);
        int i17 = f246087h + 1;
        f246087h = i17;
        if (i17 > 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        }
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        r45.kj4 kj4Var;
        java.util.LinkedList linkedList;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cancelPost", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cancelPost", "com.tencent.mm.plugin.sns.model.UploadManager");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "cancel snsinfo " + c17933xe8d1b226.m70363x51f8f990());
        try {
            kj4Var = (r45.kj4) new r45.kj4().mo11468x92b714fd(c17933xe8d1b226.m70364x267b657d());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "error to parser postinfo in canPost " + c17933xe8d1b226.m70363x51f8f990());
            m(c17933xe8d1b226, 2, "mediaPostInfo parser error " + e17.getMessage());
            kj4Var = null;
        }
        if (kj4Var != null && (linkedList = kj4Var.f460278h) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.ec4 ec4Var = (r45.ec4) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i4 xj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj();
                int i18 = ec4Var.f454799d;
                synchronized (xj6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSceneHashCodeByUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    if (((java.util.HashMap) xj6.f245837g).containsKey(java.lang.Integer.valueOf(i18))) {
                        i17 = ((java.lang.Integer) ((java.util.HashMap) xj6.f245837g).get(java.lang.Integer.valueOf(i18))).intValue();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSceneHashCodeByUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSceneHashCodeByUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                        i17 = -1;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i4 xj7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj();
                int i19 = ec4Var.f454799d;
                synchronized (xj7) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeReleationUploadScene", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    ((java.util.HashMap) xj7.f245837g).remove(java.lang.Integer.valueOf(i19));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeReleationUploadScene", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "cancel upload %d", java.lang.Integer.valueOf(i17));
                if (c17933xe8d1b226.f68895x2262335f != 15 && i17 >= 0) {
                    gm0.j1.i();
                    gm0.j1.n().f354821b.c(i17);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().A(ec4Var.f454799d);
                }
            }
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().q(c17933xe8d1b226.f38324x142bbdc6) && this.f246090b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "cancel post");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r2 r2Var = this.f246090b;
            r2Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDel", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
            r2Var.f246163m = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDel", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
            gm0.j1.i();
            gm0.j1.n().f354821b.d(this.f246090b);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().z(c17933xe8d1b226.f38324x142bbdc6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i110 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(c17933xe8d1b226.f38324x142bbdc6);
        if (i110 != null && i110.f68891x29d1292e != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().c(i110.f68891x29d1292e);
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(i110.f68891x29d1292e, 1));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().L0(c17933xe8d1b226.f38324x142bbdc6);
        if (c17933xe8d1b226.m70373x5384133c() == 21) {
            ha4.h.a().d();
        }
        c17933xe8d1b226.m70363x51f8f990();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6084xfdf602e4 c6084xfdf602e4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6084xfdf602e4();
        c6084xfdf602e4.f136362g.f88809a = c17933xe8d1b226.f38324x142bbdc6;
        c6084xfdf602e4.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cancelPost", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkPostInUI", "com.tencent.mm.plugin.sns.model.UploadManager");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPostInUI: stack=");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q7(this), 1000L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkPostInUI", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public int e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
            return 1;
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
            return 2;
        }
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
            return 3;
        }
        if (i17 == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
            return 4;
        }
        if (i17 == 76 || i17 == 92) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
            return 5;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
        return -1;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x7 f(java.lang.String str, int i17, boolean z17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "uploading depend localMediaId can not get the media doUploadSight");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x7 x7Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x7.STATE_ERROR;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
            return x7Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().n1(i17);
        try {
            r45.mj4 mj4Var = (r45.mj4) new r45.mj4().mo11468x92b714fd(n17.h());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "state " + mj4Var.f462103n + " doUploadSight, serverErr:" + mj4Var.f462108s);
            if (ca4.z0.G0(mj4Var)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x7 x7Var2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x7.STATE_ERROR;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
                return x7Var2;
            }
            if (com.p314xaae8f345.mm.vfs.w6.k(mj4Var.f462109t) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "path not fileexist  " + mj4Var.f462109t);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x7 x7Var3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x7.STATE_ERROR;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
                return x7Var3;
            }
            if (com.p314xaae8f345.mm.vfs.w6.k(mj4Var.f462110u) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "thumbpath not fileexist  " + mj4Var.f462110u);
                java.lang.String[] split = mj4Var.f462110u.split("/");
                java.lang.String str2 = je4.c.f380850a.a() + split[split.length - 1];
                long k17 = com.p314xaae8f345.mm.vfs.w6.k(str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "fixPath:" + str2 + " size:" + k17);
                if (k17 <= 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x7 x7Var4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x7.STATE_ERROR;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
                    return x7Var4;
                }
                mj4Var.f462110u = str2;
            }
            if (ca4.z0.H0(mj4Var)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x7 x7Var5 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x7.STATE_OK;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
                return x7Var5;
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().e(i17)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().Y2(i17, n17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3 z3Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z3(str, i17, n17, mj4Var.f462109t, mj4Var.f462110u, this.f246095g);
                java.lang.String str3 = mj4Var.f462113x;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                java.lang.String str4 = z3Var.f246329a;
                java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str4);
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.f246336h);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y3 y3Var = z3Var.f246333e;
                if (K0 || z3Var.f246336h.equals(p17)) {
                    r45.vh4 vh4Var = z3Var.f246337i.B;
                    if (vh4Var == null) {
                        vh4Var = new r45.vh4();
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && vh4Var.f469774n) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCdnUpload", "from skip compress, set local capture to true, appId:%s", str3);
                        vh4Var.f469768e = true;
                        vh4Var.f469775o = str3;
                        if (!((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj() && t21.u2.b(str4)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightCdnUpload", "checkUpload: from skip compress share h265 video, but user do not allow to export h265");
                            vh4Var.f469774n = false;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCdnUpload", "check upload %s %d %s %s", str4, java.lang.Integer.valueOf(vh4Var.f469769f), java.lang.Boolean.valueOf(vh4Var.f469768e), str3);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str4, true);
                    if (d17 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCdnUpload", "mediaInfo: %s", d17);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                            i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("OpenSdkVideoTime").o(str3, d11.s.fj().nj().f152728h);
                        } else if (vh4Var.f469776p) {
                            i18 = d11.s.fj().qj().f152728h;
                        } else {
                            i18 = (vh4Var.f469768e ? d11.s.fj().pj() : d11.s.fj().nj()).f152728h;
                        }
                        long j17 = i18;
                        if (j17 <= 0) {
                            j17 = 10;
                        }
                        long j18 = (j17 * 1000) + 3000;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCdnUpload", "maxVideoLen: %s", java.lang.Long.valueOf(j18));
                        int i19 = d17.f243915a;
                        if (i19 >= j18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCdnUpload", "checkUpload isNotSafeSightVideo videoDuration: %s ", java.lang.Integer.valueOf(i19));
                            z3Var.h(-2);
                            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.u7) y3Var).a(false, z3Var);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                        }
                    }
                    if (!vh4Var.f469768e) {
                        z3Var.f(vh4Var, str3);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                    } else if (vh4Var.f469769f >= 3) {
                        z3Var.g();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCdnUpload", "try need remux %d %s", 1, str4);
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6089x3a706b50 c6089x3a706b50 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6089x3a706b50();
                        c6089x3a706b50.f273897d = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.u3(z3Var, c6089x3a706b50, vh4Var, str3);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v3 v3Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v3(z3Var);
                        am.qw qwVar = c6089x3a706b50.f136367g;
                        qwVar.f89285d = v3Var;
                        qwVar.f89282a = str4;
                        qwVar.f89283b = vh4Var;
                        qwVar.f89284c = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.w3(z3Var, vh4Var);
                        c6089x3a706b50.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Sj());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCdnUpload", "checkUpload isNotSafeSightVideo old srcmd5 %s newmd5 %s ", z3Var.f246336h, p17);
                    z3Var.h(-2);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.u7) y3Var).a(false, z3Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x7 x7Var6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x7.STATE_FALSE;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
            return x7Var6;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "parse uploadInfo error doUploadSight");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x7 x7Var7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x7.STATE_ERROR;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
            return x7Var7;
        }
    }

    public wa4.x g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRangeCache", "com.tencent.mm.plugin.sns.model.UploadManager");
        wa4.x xVar = this.f246094f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRangeCache", "com.tencent.mm.plugin.sns.model.UploadManager");
        return xVar;
    }

    public java.util.LinkedList h() {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRecentUploadUrl", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (this.f246092d == null) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("SnsMMKV").getString("SnsMMKVUploadUrl", "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                this.f246092d = new java.util.LinkedList();
            } else {
                java.lang.String[] split = string.split(" ");
                if (split == null || split.length == 0) {
                    linkedList = null;
                } else {
                    linkedList = new java.util.LinkedList();
                    for (int i17 = 1; i17 < split.length; i17 += 2) {
                        linkedList.add(new android.util.Pair(split[i17 - 1], split[i17]));
                    }
                }
                this.f246092d = linkedList;
                if (linkedList == null) {
                    this.f246092d = new java.util.LinkedList();
                }
            }
        }
        java.util.LinkedList linkedList2 = this.f246092d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecentUploadUrl", "com.tencent.mm.plugin.sns.model.UploadManager");
        return linkedList2;
    }

    public final java.lang.String i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelfName", "com.tencent.mm.plugin.sns.model.UploadManager");
        java.lang.String str = this.f246089a;
        if (str == null || str.equals("")) {
            gm0.j1.i();
            this.f246089a = (java.lang.String) gm0.j1.u().c().l(2, null);
        }
        java.lang.String str2 = this.f246089a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelfName", "com.tencent.mm.plugin.sns.model.UploadManager");
        return str2;
    }

    public final void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyChangedBg", "com.tencent.mm.plugin.sns.model.UploadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 L0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Bj().L0(i());
        java.util.Iterator it = ((java.util.HashSet) this.f246093e).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v7 v7Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v7) it.next();
            if (v7Var != null) {
                v7Var.mo70053xb249ac15(L0);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyChangedBg", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public void k(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyEventUI", "com.tencent.mm.plugin.sns.model.UploadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s7(this, i17, z17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyEventUI", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public void l(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processError", "com.tencent.mm.plugin.sns.model.UploadManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "localId " + c17933xe8d1b226.m70363x51f8f990() + "processError " + i18 + " errMsg: " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(22L, 129L, 1L, true);
        if (i18 == 7) {
            try {
                r45.kj4 m70365xa8f45ee4 = c17933xe8d1b226.m70365xa8f45ee4();
                if (m70365xa8f45ee4 != null) {
                    m70365xa8f45ee4.f460286s = 7;
                    c17933xe8d1b226.m70455x99ecb2f1(m70365xa8f45ee4.mo14344x5f01b1f6());
                }
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "parse uploadInfo error");
            }
        } else if (i17 != 0) {
            try {
                int i19 = ((r45.mj4) new r45.mj4().mo11468x92b714fd(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().n1(i17).h())).f462108s;
                r45.kj4 m70365xa8f45ee42 = c17933xe8d1b226.m70365xa8f45ee4();
                if (m70365xa8f45ee42 != null) {
                    m70365xa8f45ee42.f460286s = i19;
                    c17933xe8d1b226.m70455x99ecb2f1(m70365xa8f45ee42.mo14344x5f01b1f6());
                }
            } catch (java.lang.Exception unused2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "parse uploadInfo error");
            }
        } else {
            c17933xe8d1b226.m70365xa8f45ee4();
        }
        c17933xe8d1b226.m70447x2f60ddab();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().w3(c17933xe8d1b226.f38324x142bbdc6, c17933xe8d1b226);
        if (i18 != 7) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6084xfdf602e4 c6084xfdf602e4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6084xfdf602e4();
            c6084xfdf602e4.f136362g.f88809a = c17933xe8d1b226.f38324x142bbdc6;
            c6084xfdf602e4.e();
        }
        switch (i18) {
            case 1:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "upload find timeLine is null delete this item");
                break;
            case 2:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "parser protobuf error");
                break;
            case 3:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "local id is not in db");
                break;
            case 4:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "arg is error");
                break;
            case 5:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "pullTimeLineXml  error");
                break;
            case 6:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "errtle  error");
                break;
            case 7:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "ERR_BACKGROUND_VIDEO_REMUX_FAIED");
                break;
        }
        k(c17933xe8d1b226.f38324x142bbdc6, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processError", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public void m(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processError", "com.tencent.mm.plugin.sns.model.UploadManager");
        l(c17933xe8d1b226, 0, i17, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processError", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public void n(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.v7 v7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        ((java.util.HashSet) this.f246093e).remove(v7Var);
        int i17 = f246087h - 1;
        f246087h = i17;
        if (i17 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        }
    }

    public final void o(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceFile", "com.tencent.mm.plugin.sns.model.UploadManager");
        com.p314xaae8f345.mm.vfs.w6.h(str2);
        com.p314xaae8f345.mm.vfs.w6.c(str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceFile", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public boolean p(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsBg", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (i() != null && !i().equals("")) {
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.J(jj4Var);
            java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), i());
            java.lang.String str2 = d17 + i() + "bg_";
            if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                com.p314xaae8f345.mm.vfs.w6.u(d17);
                com.p314xaae8f345.mm.vfs.w6.h(str2);
                com.p314xaae8f345.mm.vfs.w6.h(d17 + i() + "tbg_");
                com.p314xaae8f345.mm.vfs.w6.c(str, str2);
            } else {
                com.p314xaae8f345.mm.vfs.w6.h(str2);
                com.p314xaae8f345.mm.vfs.w6.h(d17 + i() + "tbg_");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "bg file is not exist! wait to down it");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Bj().P0(i(), d17 + i() + "bg_", "", 0.0f);
            oi0.e.f427124d.a(str, 0.0f);
        }
        j();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 y7Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7(7, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addMedia", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        jj4Var.f459404t = 1;
        y7Var.f246314f.f39014x86965dde.f451373h.add(jj4Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addMedia", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        y7Var.F(2);
        int i17 = y7Var.i();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.W = i17;
        boolean z17 = i17 > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsBg", "com.tencent.mm.plugin.sns.model.UploadManager");
        return z17;
    }

    public void q(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e first;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsCoverByFinder", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (i() != null && !i().equals("")) {
            java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), i());
            com.p314xaae8f345.mm.vfs.w6.u(d17);
            com.p314xaae8f345.mm.vfs.w6.h(d17 + i() + "bg_");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a2 Bj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Bj();
            java.lang.String userName = i();
            Bj.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCoverFinderInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverStorage", "updateCoverFinderInfo :".concat(userName));
            if ((finderObject != null ? finderObject.m76802x2dd01666() : null) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCoverFinderInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 L0 = Bj.L0(userName);
                Bj.z0(L0);
                ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.z1(L0.f67724x6586435, L0.f67723x63c0190, L0.f67722x5a2f915));
                L0.f67724x6586435 = "";
                L0.f67723x63c0190 = "";
                L0.f67722x5a2f915 = "";
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = finderObject.m76802x2dd01666();
                java.lang.Integer valueOf = m76802x2dd01666 != null ? java.lang.Integer.valueOf(m76802x2dd01666.m76964x7f025288()) : null;
                if (valueOf != null && valueOf.intValue() == 2) {
                    L0.f67730x2262335f = 4;
                } else if (valueOf != null && valueOf.intValue() == 4) {
                    L0.f67730x2262335f = 3;
                } else {
                    L0.f67730x2262335f = 0;
                }
                try {
                    L0.f67728x547edbe = false;
                    L0.f67718x54cb1d2a = java.lang.System.currentTimeMillis();
                    L0.f67719x27cd822a = finderObject.mo14344x5f01b1f6();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = finderObject.m76802x2dd01666();
                    if (m76802x2dd016662 != null && (m76962x74cd162e = m76802x2dd016662.m76962x74cd162e()) != null && (first = m76962x74cd162e.getFirst()) != null) {
                        L0.f67729x7b284d5e = first.m76623xd93f812f() + first.m76624x4c9b7dca();
                    }
                } catch (java.io.IOException unused) {
                }
                Bj.W0(L0, false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCoverFinderInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            }
            oi0.e.f427124d.d(finderObject);
        }
        j();
        java.lang.String userName2 = i();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("uploadFinderVideoCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName2, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        ((ku5.t0) ku5.t0.f394148d).a(new oa4.b(finderObject, userName2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uploadFinderVideoCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsCoverByFinder", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public void r(java.util.ArrayList arrayList, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsCoverByPhoto", "com.tencent.mm.plugin.sns.model.UploadManager");
        java.util.Iterator it = arrayList.iterator();
        java.lang.String str = "";
        java.lang.String str2 = str;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa c16506x8e746ffa = (com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa) it.next();
            og3.a aVar = c16506x8e746ffa.f230142d;
            og3.a aVar2 = og3.a.f426689e;
            java.lang.String str3 = c16506x8e746ffa.f230143e;
            if (aVar == aVar2) {
                str = str3;
            }
            if (aVar == og3.a.f426690f) {
                str2 = str3;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "coverPath:%s thumbPath:%s", str, str2);
        if (i() != null && !i().equals("")) {
            java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), i());
            com.p314xaae8f345.mm.vfs.w6.u(d17);
            com.p314xaae8f345.mm.vfs.w6.h(d17 + i() + "bg_");
            java.lang.String i17 = i();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getThumbPath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
            java.lang.String d18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), i17);
            com.p314xaae8f345.mm.vfs.w6.u(d18);
            java.lang.String str4 = d18 + i17 + "thumb_bg_";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getThumbPath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
            java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.c(i());
            o(str, c17);
            o(str2, str4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Bj().P0(i(), str4, c17, f17);
            oi0.e.f427124d.a(c17, f17);
        }
        j();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("uploadSnsImageCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 y7Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7(7, null);
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            y7Var.a(str2, "");
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            y7Var.a(str, "");
        }
        y7Var.F(1);
        int i18 = (int) (f17 * 10000);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsCoverOffset", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        y7Var.f246314f.f39036xb9f30e92 = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadPackHelper", "setSnsCoverOffset:%d", java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsCoverOffset", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        int i19 = y7Var.i();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.W = i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLocalId", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        ba4.b.f100233c = i19;
        ba4.b.f100232b = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLocalId", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverUploadHelper", "uploadSnsImageCover source:" + str + "  thumb:" + str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uploadSnsImageCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsCoverByPhoto", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 s(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
        java.lang.String str4 = c11286x34a5504.f33121x993583fc;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject iMediaObject = c11286x34a5504.f33122xe4128443;
        int mo14189x368f3a = iMediaObject.mo14189x368f3a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (mo14189x368f3a != 76) {
            if (mo14189x368f3a != 130) {
                if (mo14189x368f3a == 92) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                    i17 = 47;
                } else if (mo14189x368f3a != 93) {
                    switch (mo14189x368f3a) {
                        case 1:
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                            i17 = 2;
                            break;
                        case 2:
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                            i17 = 1;
                            break;
                        case 3:
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                            i17 = 4;
                            break;
                        case 4:
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                            i17 = 5;
                            break;
                        case 5:
                        case 6:
                            break;
                        case 7:
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                            i17 = 3;
                            break;
                        default:
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                            i17 = -1;
                            break;
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                    i17 = 48;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
            i17 = 3;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
            i17 = 42;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 y7Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7(i17, null);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        y7Var.J(str2 == null ? "" : str2);
        y7Var.I(str3 == null ? "" : str3);
        y7Var.N(5);
        if (i17 == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
            return null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            y7Var.t(str);
        }
        java.lang.String str5 = c11286x34a5504.f33130x6942258;
        if (str5 == null) {
            str5 = "";
        }
        y7Var.C(str5);
        java.lang.String str6 = c11286x34a5504.f33121x993583fc;
        if (str6 == null) {
            str6 = "";
        }
        y7Var.B(str6);
        int mo14189x368f3a2 = iMediaObject.mo14189x368f3a();
        if (mo14189x368f3a2 != 130) {
            switch (mo14189x368f3a2) {
                case 1:
                    y7Var.B("");
                    y7Var.t(((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11296xa95b008d) iMediaObject).f33229x36452d);
                    break;
                case 2:
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9 c11283x90d63ed9 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9) iMediaObject;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(c11283x90d63ed9.f33104xcba0e7a5)) {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11283x90d63ed9.f33105xcba65c20)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "share img but no res is exist!");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                            return null;
                        }
                        if (!y7Var.a(c11283x90d63ed9.f33105xcba65c20, "")) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                            return null;
                        }
                    } else if (!y7Var.c(c11283x90d63ed9.f33104xcba0e7a5, "", "")) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                        return null;
                    }
                    break;
                case 3:
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423 c11288x597a4423 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423) iMediaObject;
                    java.lang.String str7 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11288x597a4423.f33185x324c710a) ? c11288x597a4423.f33185x324c710a : c11288x597a4423.f33184xc6370d0b;
                    java.lang.String str8 = str7 == null ? "" : str7;
                    java.lang.String str9 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11288x597a4423.f33182xc58aab80) ? c11288x597a4423.f33182xc58aab80 : c11288x597a4423.f33185x324c710a;
                    java.lang.String str10 = str9 == null ? "" : str9;
                    y7Var.C("");
                    y7Var.B("");
                    int e17 = e(3);
                    if (e17 == -1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                        return null;
                    }
                    java.lang.String str11 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11288x597a4423.f33183xead55f01) ? c11288x597a4423.f33183xead55f01 : c11288x597a4423.f33184xc6370d0b;
                    java.lang.String str12 = str11 == null ? "" : str11;
                    byte[] bArr = c11286x34a5504.f33128x4f3b3aa0;
                    java.lang.String str13 = c11286x34a5504.f33130x6942258;
                    java.lang.String str14 = str13 == null ? "" : str13;
                    java.lang.String str15 = c11286x34a5504.f33121x993583fc;
                    if (!y7Var.e(bArr, str8, str12, str10, e17, str14, str15 == null ? "" : str15, c11288x597a4423.f33186x239f8b5, c11288x597a4423.f33187x1478a44a, "")) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                        return null;
                    }
                    break;
                case 4:
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11298x4d56d1f9 c11298x4d56d1f9 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11298x4d56d1f9) iMediaObject;
                    y7Var.C("");
                    y7Var.B("");
                    int e18 = e(4);
                    if (e18 == -1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                        return null;
                    }
                    java.lang.String str16 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11298x4d56d1f9.f33238x44a0a2f4) ? c11298x4d56d1f9.f33238x44a0a2f4 : c11298x4d56d1f9.f33237x3accbfe1;
                    java.lang.String str17 = str16 == null ? "" : str16;
                    byte[] bArr2 = c11286x34a5504.f33128x4f3b3aa0;
                    java.lang.String str18 = c11298x4d56d1f9.f33237x3accbfe1;
                    java.lang.String str19 = c11298x4d56d1f9.f33238x44a0a2f4;
                    java.lang.String str20 = c11286x34a5504.f33130x6942258;
                    java.lang.String str21 = str20 == null ? "" : str20;
                    java.lang.String str22 = c11286x34a5504.f33121x993583fc;
                    if (!y7Var.e(bArr2, str17, str18, str19, e18, str21, str22 == null ? "" : str22, "", "", "")) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                        return null;
                    }
                    break;
                case 5:
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1 c11300x89dbd7a1 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1) iMediaObject;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(c11286x34a5504.f33128x4f3b3aa0)) {
                        byte[] bArr3 = c11286x34a5504.f33128x4f3b3aa0;
                        java.lang.String str23 = c11286x34a5504.f33121x993583fc;
                        if (str23 == null) {
                            str23 = "";
                        }
                        java.lang.String str24 = c11286x34a5504.f33130x6942258;
                        y7Var.c(bArr3, str23, str24 != null ? str24 : "");
                    }
                    y7Var.B(c11300x89dbd7a1.f33249xa1713a8c);
                    y7Var.D(c11300x89dbd7a1.f33249xa1713a8c);
                    java.lang.String str25 = c11300x89dbd7a1.f33249xa1713a8c;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContentUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                    y7Var.f246314f.f39014x86965dde.f451372g = str25;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContentUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                    y7Var.s(c11300x89dbd7a1.f33245xc682a690);
                    break;
                case 6:
                    break;
                case 7:
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699 c11272xd6622699 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699) iMediaObject;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11272xd6622699.f33063xd426afc1) && c11272xd6622699.f33063xd426afc1.startsWith("http")) {
                        y7Var.C(c11272xd6622699.f33063xd426afc1);
                        y7Var.B(c11272xd6622699.f33063xd426afc1);
                        break;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "appdata is not support!");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                        return null;
                    }
                    break;
                default:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "none type not support!");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                    return null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
            return y7Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "file is not support!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
        return null;
    }
}
