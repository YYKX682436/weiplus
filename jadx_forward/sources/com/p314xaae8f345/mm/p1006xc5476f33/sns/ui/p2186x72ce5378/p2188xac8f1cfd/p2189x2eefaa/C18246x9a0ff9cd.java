package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa;

/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC */
/* loaded from: classes4.dex */
public final class C18246x9a0ff9cd extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j {

    /* renamed from: r, reason: collision with root package name */
    public static final lc4.d f250294r = new lc4.d(null);

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.ArrayList f250295s = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.ArrayList f250296t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.ArrayList f250297u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public static boolean f250298v;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f250299d;

    /* renamed from: e, reason: collision with root package name */
    public final lc4.d0 f250300e;

    /* renamed from: f, reason: collision with root package name */
    public final lc4.a f250301f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2196x7446db4a.C18265x3a18a48f f250302g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f250303h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f250304i;

    /* renamed from: m, reason: collision with root package name */
    public long f250305m;

    /* renamed from: n, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f250306n;

    /* renamed from: o, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f250307o;

    /* renamed from: p, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f250308p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18247x424d2892 f250309q;

    static {
        java.lang.String str = gm0.j1.u().h() + "SnsMicroMsg.db";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DataUIC", "origin path:" + str + " size:" + com.p314xaae8f345.mm.vfs.w6.k(str));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
        Fj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDb", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDb", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        jm0.i iVar = jm0.k.f381802h;
        ((zc4.h) iVar.a(zc4.h.class)).f381806g = Fj.f247527d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DataUIC", "init db finish result:" + jz5.f0.f384359a);
        ((zc4.g) ((zc4.h) iVar.a(zc4.h.class)).P6(zc4.g.class)).Q6(com.p314xaae8f345.mm.app.a0.f134821d, lc4.c.f399484d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$commentUpdateListener$1] */
    public C18246x9a0ff9cd(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f250299d = jz5.h.b(new lc4.k(this, activity));
        this.f250300e = new lc4.d0(S6());
        this.f250301f = new lc4.a();
        this.f250302g = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2196x7446db4a.C18265x3a18a48f(activity);
        this.f250303h = jz5.h.b(lc4.z.f399537d);
        this.f250304i = jz5.h.b(new lc4.t(this));
        this.f250305m = java.lang.System.currentTimeMillis();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f250309q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6053xf2312ea>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$commentUpdateListener$1
            {
                this.f39173x3fe91575 = -1499688230;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6053xf2312ea c6053xf2312ea) {
                boolean z17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$commentUpdateListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6053xf2312ea event = c6053xf2312ea;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$commentUpdateListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.String str = event.f136338g.f88996a;
                if (str == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$commentUpdateListener$1");
                    z17 = true;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DataUIC", "onSnsCommentUpdateEvent, snsId=".concat(str));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd c18246x9a0ff9cd = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.this;
                    p3325xe03a0797.p3326xc267989b.l.d(c18246x9a0ff9cd.m158345xefc66565(), null, null, new lc4.i(str, c18246x9a0ff9cd, null), 3, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$commentUpdateListener$1");
                    z17 = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$commentUpdateListener$1");
                return z17;
            }
        };
    }

    public static final /* synthetic */ java.util.ArrayList O6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getCacheList$cp", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        java.util.ArrayList arrayList = f250296t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getCacheList$cp", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return arrayList;
    }

    public static final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e P6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd c18246x9a0ff9cd) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMainUIC", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e T6 = c18246x9a0ff9cd.T6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMainUIC", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return T6;
    }

    public static final /* synthetic */ java.util.ArrayList Q6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getResumeData$cp", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        java.util.ArrayList arrayList = f250295s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getResumeData$cp", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return arrayList;
    }

    public final boolean R6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkListHasFault", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        boolean z17 = !f250296t.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkListHasFault", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return z17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe S6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLiveList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = (com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe) this.f250299d.mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLiveList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return c16718x7059cefe;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e T6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMainUIC", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e c18232x7592f55e = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e) ((jz5.n) this.f250304i).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMainUIC", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return c18232x7592f55e;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x021d A[EDGE_INSN: B:76:0x021d->B:77:0x021d BREAK  A[LOOP:3: B:65:0x01f1->B:84:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[LOOP:3: B:65:0x01f1->B:84:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(o75.c r25) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.U6(o75.c):void");
    }

    public final boolean V6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasMoreData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2196x7446db4a.C18265x3a18a48f c18265x3a18a48f = this.f250302g;
        c18265x3a18a48f.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasMoreData", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        boolean z17 = c18265x3a18a48f.f250643i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasMoreData", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasMoreData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return z17;
    }

    public final boolean W6(xc4.p pVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSelfPrivateFeed", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        java.lang.String m125483x6bf53a6c = pVar.m125483x6bf53a6c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelfName", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f250303h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelfName", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m125483x6bf53a6c, (java.lang.String) mo141623x754a37bb) && pVar.m125479x291aa6b7() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSelfPrivateFeed", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSelfPrivateFeed", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "loadMore"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            boolean r4 = r1 instanceof lc4.p
            if (r4 == 0) goto L1f
            r4 = r1
            lc4.p r4 = (lc4.p) r4
            int r5 = r4.f399513g
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1f
            int r5 = r5 - r6
            r4.f399513g = r5
            goto L24
        L1f:
            lc4.p r4 = new lc4.p
            r4.<init>(r0, r1)
        L24:
            java.lang.Object r1 = r4.f399511e
            pz5.a r5 = pz5.a.f440719d
            int r6 = r4.f399513g
            jz5.f0 r7 = jz5.f0.f384359a
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L4c
            if (r6 == r9) goto L44
            if (r6 != r8) goto L39
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            goto La6
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r4)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            throw r1
        L44:
            java.lang.Object r6 = r4.f399510d
            com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC r6 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            goto L62
        L4c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r1)
            kotlinx.coroutines.r2 r1 = r0.f250306n
            if (r1 == 0) goto L61
            r4.f399510d = r0
            r4.f399513g = r9
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.v2.d(r1, r4)
            if (r1 != r5) goto L61
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r5
        L61:
            r6 = r0
        L62:
            long r10 = r6.f250305m
            kotlinx.coroutines.r2 r1 = r6.f250307o
            r15 = 0
            if (r1 == 0) goto L80
            r12 = 0
            if (r1 == 0) goto L73
            boolean r1 = r1.A()
            if (r1 != r9) goto L73
            goto L74
        L73:
            r9 = r12
        L74:
            if (r9 == 0) goto L77
            goto L80
        L77:
            java.lang.String r1 = "MicroMsg.Improve.DataUIC"
            java.lang.String r9 = "currentJob is running,jump loadMore"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r9)
            r1 = r15
            goto L94
        L80:
            kotlinx.coroutines.p0 r1 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            r12 = 0
            lc4.s r13 = new lc4.s
            r13.<init>(r6, r10, r15)
            r14 = 2
            r9 = 0
            r10 = r6
            r11 = r1
            r1 = r15
            r15 = r9
            kotlinx.coroutines.r2 r9 = pf5.e.m158343xd39de650(r10, r11, r12, r13, r14, r15)
            r6.f250307o = r9
        L94:
            kotlinx.coroutines.r2 r6 = r6.f250307o
            if (r6 == 0) goto Laa
            r4.f399510d = r1
            r4.f399513g = r8
            java.lang.Object r1 = r6.C(r4)
            if (r1 != r5) goto La6
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r5
        La6:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r7
        Laa:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.X6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DataUIC", "onCreate");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupLiveList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        S6().f233604u.mo7806x9d92d11c(m158354x19263085(), new lc4.a0(this));
        ((ku5.t0) ku5.t0.f394148d).A("cache_delete_tag");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupLiveList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("observeDBChangeEvent", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
        }
        ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).Q6(m158354x19263085(), new lc4.u(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("observeDBChangeEvent", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        f250298v = false;
        m70933x9fdb53fc().m71026x615a777e(new lc4.v(this));
        if (!m70939xdec9c05c()) {
            m70933x9fdb53fc().a(1);
        }
        lc4.d0 d0Var = this.f250300e;
        d0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.UnreadLoader", "PRELOAD_MAX_COUNT:" + d0Var.f399489e);
        gm0.j1.n().f354821b.a(211, d0Var);
        oc4.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18250x12aff9a8.f250542s;
        if (gVar.a()) {
            d0Var.c(gVar.b().a());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f250306n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f250307o;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var3 = this.f250308p;
        if (r2Var3 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var3, null, 1, null);
        }
        java.util.ArrayList arrayList = S6().f233598o;
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (!((zc4.b) obj).n().mo133058x3172ed()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        zc4.b bVar = (zc4.b) obj;
        xc4.p n17 = bVar != null ? bVar.n() : null;
        java.util.ArrayList arrayList2 = f250295s;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        i64.u1.a(207, arrayList.size());
        f250298v = true;
        lc4.d0 d0Var = this.f250300e;
        d0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        d0Var.f399491g = -1L;
        gm0.j1.n().f354821b.q(211, d0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        int i17 = 0;
        for (java.lang.Object obj2 : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((zc4.b) obj2).n().mo133058x3172ed()) {
                i64.u1.a(29, i17);
            }
            i17 = i18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.f8 qj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.qj();
        java.lang.String m125481xf4250fd8 = n17 != null ? n17.m125481xf4250fd8() : null;
        qj6.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveUpLimitSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        qj6.f249845b = m125481xf4250fd8;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveUpLimitSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.f8 qj7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.qj();
        qj7.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pauseServerInfo", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6 Kj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Kj();
        Kj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimeFirstId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        long j17 = Kj.f245686m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeFirstId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        qj7.f249849f = j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6 Kj2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Kj();
        Kj2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimeLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        long j18 = Kj2.f245685i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        qj7.f249848e = j18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pauseServerInfo", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
    }
}
