package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class i4 {

    /* renamed from: a, reason: collision with root package name */
    public wa4.j f245831a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f245832b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f245833c = "";

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f245834d = new java.util.Vector();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f245835e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f245836f = new java.util.Vector();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f245837g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h4 f245838h;

    public i4(java.lang.String str) {
        boolean z17;
        this.f245832b = str;
        synchronized (this) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fileToList", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            z17 = false;
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1);
            if (N == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fileToList", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            } else {
                try {
                    this.f245831a = (wa4.j) new wa4.j().mo11468x92b714fd(N);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fileToList", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    z17 = true;
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsAsyncQueueMgr", e17, "", new java.lang.Object[0]);
                    com.p314xaae8f345.mm.vfs.w6.h(this.f245832b);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fileToList", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                }
            }
        }
        if (!z17) {
            this.f245831a = new wa4.j();
        }
        this.f245834d.clear();
        this.f245835e.clear();
    }

    public static void i(long j17, java.util.LinkedList linkedList, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delCommentFromToSend", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        j(j17, linkedList, str, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delCommentFromToSend", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    public static boolean j(long j17, java.util.LinkedList linkedList, java.lang.String str, boolean z17) {
        wa4.m mVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delCommentFromToSend", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                mVar = null;
                break;
            }
            mVar = (wa4.m) it.next();
            if (mVar.f525793e.f460736d == j17 && (z17 || mVar.f525792d.equals(str))) {
                break;
            }
        }
        if (mVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delCommentFromToSend", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return false;
        }
        linkedList.remove(mVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delCommentFromToSend", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return true;
    }

    public static r45.e86 l(r45.l76 l76Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fromAcitonToCommentInfo", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        r45.k76 k76Var = l76Var.f460738f;
        r45.k76 k76Var2 = l76Var.f460739g;
        r45.e86 e86Var = new r45.e86();
        e86Var.f454663h = k76Var.f459998n;
        e86Var.f454664i = k76Var.f459997m;
        e86Var.f454660e = k76Var.f459993f;
        e86Var.f454661f = k76Var.f459996i;
        e86Var.f454662g = k76Var.f459995h;
        e86Var.f454659d = k76Var.f459991d;
        e86Var.f454665m = k76Var.f460000p;
        e86Var.f454670r = k76Var.f460003s;
        e86Var.f454672t = k76Var.f460005u;
        e86Var.f454667o = k76Var2.f459991d;
        e86Var.f454669q = k76Var2.f460002r;
        e86Var.f454666n = k76Var2.f459999o;
        e86Var.f454673u = k76Var.f460007w;
        e86Var.f454674v = k76Var.f460008x;
        e86Var.f454677y = k76Var.f460010z;
        e86Var.A = k76Var.B;
        e86Var.f454678z = k76Var.A;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromAcitonToCommentInfo", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return e86Var;
    }

    public static boolean n(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdCmd", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdCmd", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return false;
        }
        if (str.startsWith("_AD_TAG_")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdCmd", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdCmd", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return false;
    }

    public synchronized boolean A(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        ((java.util.Vector) this.f245836f).remove(java.lang.Integer.valueOf(i17));
        ((java.util.HashMap) this.f245837g).remove(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return true;
    }

    public void B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerUpdate", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h4 h4Var = this.f245838h;
        if (h4Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.o0 o0Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.o0) h4Var;
            o0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("update", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$4");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a.m70860x7ba6381a(o0Var.f250392a).a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$4");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerUpdate", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    public boolean a(java.lang.String str, r45.l76 l76Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        boolean b17 = b(str, l76Var, "", i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return b17;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd A[Catch: all -> 0x00cd, TryCatch #0 {, blocks: (B:3:0x0001, B:17:0x00b7, B:19:0x00bd, B:20:0x00c4, B:25:0x0039, B:26:0x00b6, B:27:0x0048, B:28:0x0050, B:29:0x0058, B:31:0x0060, B:33:0x0086, B:35:0x0096, B:36:0x00a1, B:37:0x00a9), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean b(java.lang.String r11, r45.l76 r12, java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i4.b(java.lang.String, r45.l76, java.lang.String, int):boolean");
    }

    public synchronized void c(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDelItem", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        wa4.o oVar = new wa4.o();
        oVar.f525803d = j17;
        oVar.f525804e = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        this.f245831a.f525781h.add(oVar);
        r();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDelItem", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    public synchronized boolean d(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDownLoadingId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        if (((java.util.HashMap) this.f245835e).containsKey(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadingId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return false;
        }
        ((java.util.HashMap) this.f245835e).put(str, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownLoadingId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return true;
    }

    public synchronized boolean e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        if (((java.util.Vector) this.f245836f).contains(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return false;
        }
        ((java.util.Vector) this.f245836f).add(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return true;
    }

    public final void f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkImageCmtToUpload", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        java.util.LinkedList linkedList = this.f245831a.f525778e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAsyncQueueMgr", "notifyCommentWhenImageUploaded >> localId: %s queueSize: %d", str, java.lang.Integer.valueOf(linkedList.size()));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            wa4.m mVar = (wa4.m) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAsyncQueueMgr", "notifyCommentWhenImageUploaded clientId: %s, state: %d", mVar.f525792d, java.lang.Integer.valueOf(mVar.f525796h));
            if (mVar.f525796h == 1) {
                r45.d86 d86Var = (r45.d86) mVar.f525793e.f460738f.B.getFirst();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAsyncQueueMgr", "notifyCommentWhenImageUploaded uploading >> localId: %s", str);
                if (d86Var.f453772t.equals(str)) {
                    int a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.zj().a(d86Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAsyncQueueMgr", "notifyCommentWhenImageUploaded checkState: %d", java.lang.Integer.valueOf(a17));
                    mVar.f525796h = a17;
                    if (a17 == 2) {
                        if (n(mVar.f525792d)) {
                            gm0.j1.i();
                            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i2(mVar.f525793e, mVar.f525792d, mVar.f525795g, 0));
                        } else {
                            gm0.j1.i();
                            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n2(mVar.f525793e, mVar.f525792d, mVar.f525797i));
                        }
                    } else if (a17 == 3) {
                        int b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.zj().b(d86Var);
                        int i17 = b17 != 0 ? 2 : 1;
                        if (b17 != 0) {
                            a17 = b17;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.r2.f252792a.e(mVar.f525793e, a17, i17);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().v(mVar.f525793e.f460736d, 2, mVar.f525792d);
                        k(mVar.f525793e.f460736d, 2, (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), null);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkImageCmtToUpload", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
        r();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkImageCmtToUpload", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkQueue", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        synchronized (this) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            if (!h(this.f245831a.f525777d)) {
                if (!h(this.f245831a.f525778e)) {
                    if (!h(this.f245831a.f525779f)) {
                        if (!h(this.f245831a.f525780g)) {
                            while (true) {
                                if (!this.f245831a.f525781h.isEmpty()) {
                                    wa4.o oVar = (wa4.o) this.f245831a.f525781h.getFirst();
                                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(oVar.f525804e) <= 21600) {
                                        long j17 = oVar.f525803d;
                                        gm0.j1.i();
                                        gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(j17, 1));
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                                        break;
                                    }
                                    this.f245831a.f525781h.removeFirst();
                                } else {
                                    while (true) {
                                        if (!this.f245831a.f525782i.isEmpty()) {
                                            wa4.o oVar2 = (wa4.o) this.f245831a.f525782i.getFirst();
                                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(oVar2.f525804e) <= 21600) {
                                                long j18 = oVar2.f525803d;
                                                gm0.j1.i();
                                                gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(j18, 5));
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                                                break;
                                            }
                                            this.f245831a.f525782i.removeFirst();
                                        } else {
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkQueue", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(java.util.LinkedList r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i4.h(java.util.LinkedList):boolean");
    }

    public void k(long j17, int i17, int i18, r45.wa6 wa6Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("failedComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAsyncQueueMgr", "failedComment snsId:%s, type:%s, failOpTime:%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 22) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("failedComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return;
        }
        wa4.n nVar = new wa4.n();
        nVar.f525798d = j17;
        nVar.f525799e = i18;
        nVar.f525800f = i17;
        if (wa6Var != null) {
            nVar.f525801g = wa6Var.f470549f;
            nVar.f525802h = wa6Var.f470550g;
        }
        this.f245831a.f525783m.add(nVar);
        gm0.j1.u().c().w(589825, java.lang.Boolean.TRUE);
        B();
        if (!r()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAsyncQueueMgr", "failedComment error listToFile");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("failedComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    public synchronized int m() {
        int size;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDownLoadingSize", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        size = ((java.util.HashMap) this.f245835e).size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownLoadingSize", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return size;
    }

    public synchronized boolean o(java.lang.String str) {
        boolean containsKey;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDownloading", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        containsKey = ((java.util.HashMap) this.f245835e).containsKey(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDownloading", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return containsKey;
    }

    public final boolean p(java.util.LinkedList linkedList, r45.e86 e86Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isInSnsObj", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e86Var.f454663h) && e86Var.f454674v == 0 && e86Var.f454678z == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInSnsObj", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return true;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.e86 e86Var2 = (r45.e86) it.next();
            if (e86Var.f454663h.equals(e86Var2.f454663h) && e86Var.f454674v == e86Var2.f454674v && e86Var.f454678z == e86Var2.f454678z && i17 == e86Var2.f454664i) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInSnsObj", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInSnsObj", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return false;
    }

    public synchronized boolean q(int i17) {
        boolean contains;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPosting", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        contains = ((java.util.Vector) this.f245834d).contains(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPosting", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return contains;
    }

    public final synchronized boolean r() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("listToFile", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        try {
            byte[] mo14344x5f01b1f6 = this.f245831a.mo14344x5f01b1f6();
            z17 = com.p314xaae8f345.mm.vfs.w6.S(this.f245832b, mo14344x5f01b1f6, 0, mo14344x5f01b1f6.length) == 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("listToFile", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsAsyncQueueMgr", e17, "listToFile failed: " + this.f245832b, new java.lang.Object[0]);
            com.p314xaae8f345.mm.vfs.w6.h(this.f245832b);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("listToFile", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return false;
        }
        return z17;
    }

    public synchronized com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 s(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("merge", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f245833c)) {
            this.f245833c = c01.z1.r();
        }
        if (this.f245831a.f525777d.size() == 0 && this.f245831a.f525778e.size() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("merge", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return c19806x4c372b7;
        }
        long j17 = c19806x4c372b7.Id;
        java.util.Iterator it = this.f245831a.f525777d.iterator();
        while (it.hasNext()) {
            wa4.m mVar = (wa4.m) it.next();
            r45.e86 l17 = l(mVar.f525793e);
            if (mVar.f525793e.f460736d == j17 && !p(c19806x4c372b7.f38984xe83113e0, l17, l17.f454664i)) {
                c19806x4c372b7.f38984xe83113e0.add(l17);
                c19806x4c372b7.f38982x6c24f798++;
            }
        }
        java.util.Iterator<r45.e86> it6 = c19806x4c372b7.f38984xe83113e0.iterator();
        while (it6.hasNext()) {
            r45.e86 next = it6.next();
            if (next.f454659d.equals(this.f245833c)) {
                java.util.Iterator it7 = this.f245831a.f525782i.iterator();
                boolean z17 = false;
                while (it7.hasNext()) {
                    if (((wa4.o) it7.next()).f525803d == j17) {
                        c19806x4c372b7.f38984xe83113e0.remove(next);
                        c19806x4c372b7.f38982x6c24f798--;
                        z17 = true;
                    }
                }
                if (z17) {
                    break;
                }
            }
        }
        java.util.Iterator it8 = this.f245831a.f525778e.iterator();
        while (it8.hasNext()) {
            r45.l76 l76Var = ((wa4.m) it8.next()).f525793e;
            if (l76Var.f460736d == j17) {
                r45.e86 l18 = l(l76Var);
                if (!p(c19806x4c372b7.f38963x20c46e68, l18, l18.f454664i)) {
                    c19806x4c372b7.f38963x20c46e68.add(l18);
                    c19806x4c372b7.f38962x37aaea10++;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("merge", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return c19806x4c372b7;
    }

    public synchronized boolean t(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releationUploadScene", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        ((java.util.HashMap) this.f245837g).put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releationUploadScene", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return true;
    }

    public wa4.n u(int i17) {
        wa4.n nVar;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeByOpTime", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        java.util.Iterator it = this.f245831a.f525783m.iterator();
        while (true) {
            if (!it.hasNext()) {
                nVar = null;
                break;
            }
            nVar = (wa4.n) it.next();
            if (i17 == nVar.f525799e) {
                break;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        if (nVar == null) {
            str = "null";
        } else {
            str = "snsID:" + nVar.f525798d + ", opTime:" + nVar.f525799e + ", type:" + nVar.f525800f;
        }
        objArr[1] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAsyncQueueMgr", "removeByOpTime failOpTime:%s, toDel:%s", objArr);
        if (nVar != null) {
            this.f245831a.f525783m.remove(nVar);
            if (!r()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAsyncQueueMgr", "removeByOpTime error listToFile");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeByOpTime", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return nVar;
    }

    public void v(long j17, int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246209d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanCacheObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246211f;
        if (map != null) {
            ((java.util.concurrent.ConcurrentHashMap) map).clear();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanCacheObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        synchronized (this) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeCommentImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            if (i17 == 1) {
                i(j17, this.f245831a.f525777d, str);
            } else if (i17 == 2) {
                i(j17, this.f245831a.f525778e, str);
            } else if (i17 == 3) {
                i(j17, this.f245831a.f525779f, str);
            } else if (i17 != 5) {
                if (i17 != 16) {
                    if (i17 == 7) {
                        i(j17, this.f245831a.f525777d, str);
                    } else if (i17 != 8) {
                    }
                }
                i(j17, this.f245831a.f525778e, str);
            } else {
                i(j17, this.f245831a.f525780g, str);
            }
            r();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeCommentImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    public void w(long j17) {
        wa4.o oVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeDelItem", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        synchronized (this) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeDelItemImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            java.util.Iterator it = this.f245831a.f525781h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    oVar = null;
                    break;
                } else {
                    oVar = (wa4.o) it.next();
                    if (oVar.f525803d == j17) {
                        break;
                    }
                }
            }
            if (oVar != null) {
                this.f245831a.f525781h.remove(oVar);
            }
            r();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeDelItemImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeDelItem", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    public void x(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeLikedCancel", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        y(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeLikedCancel", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    public final synchronized boolean y(long j17) {
        wa4.o oVar;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeLikedCancelImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        java.util.Iterator it = this.f245831a.f525782i.iterator();
        while (true) {
            if (!it.hasNext()) {
                oVar = null;
                break;
            }
            oVar = (wa4.o) it.next();
            if (oVar.f525803d == j17) {
                break;
            }
        }
        if (oVar != null) {
            this.f245831a.f525782i.remove(oVar);
            z17 = true;
        } else {
            z17 = false;
        }
        r();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeLikedCancelImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return z17;
    }

    public synchronized boolean z(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removePostId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        ((java.util.Vector) this.f245834d).remove(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removePostId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return true;
    }
}
