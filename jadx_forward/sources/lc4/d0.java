package lc4;

/* loaded from: classes4.dex */
public final class d0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe f399488d;

    /* renamed from: e, reason: collision with root package name */
    public final int f399489e;

    /* renamed from: f, reason: collision with root package name */
    public int f399490f;

    /* renamed from: g, reason: collision with root package name */
    public long f399491g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f399492h;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe liveList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveList, "liveList");
        this.f399488d = liveList;
        this.f399489e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_unread_jump_preload_max_count_android, 3);
        this.f399491g = -1L;
        this.f399492h = new java.util.ArrayList();
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doNetPreload", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.UnreadLoader", "preload retryCount:" + this.f399490f + " snsid:" + ca4.z0.t0(this.f399491g));
        gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h3(this.f399491g, 0L, 2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doNetPreload", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
    }

    public final java.util.ArrayList b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUnreadList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        java.util.ArrayList arrayList = this.f399492h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUnreadList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.ArrayList r8) {
        /*
            r7 = this;
            java.lang.String r0 = "preload"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.String r0 = "feedList"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.util.ArrayList r0 = r7.f399492h
            r0.clear()
            java.util.Iterator r0 = r8.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class<zc4.h> r2 = zc4.h.class
            byte[] r3 = jm0.k.f381803i
            monitor-enter(r3)
            gm0.m r4 = gm0.j1.b()     // Catch: java.lang.Throwable -> L79
            r4.c()     // Catch: java.lang.Throwable -> L79
            java.lang.Class<jm0.k> r4 = jm0.k.class
            boolean r4 = r4.isAssignableFrom(r2)     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L71
            androidx.lifecycle.j1 r4 = new androidx.lifecycle.j1     // Catch: java.lang.Throwable -> L79
            gm0.m r5 = gm0.j1.b()     // Catch: java.lang.Throwable -> L79
            gm0.b r5 = r5.f354778h     // Catch: java.lang.Throwable -> L79
            jm0.h r6 = new jm0.h     // Catch: java.lang.Throwable -> L79
            r6.<init>()     // Catch: java.lang.Throwable -> L79
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L79
            androidx.lifecycle.c1 r2 = r4.a(r2)     // Catch: java.lang.Throwable -> L79
            monitor-exit(r3)
            zc4.h r2 = (zc4.h) r2
            java.lang.Class<zc4.g> r3 = zc4.g.class
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r2 = r2.P6(r3)
            zc4.g r2 = (zc4.g) r2
            long r3 = ca4.z0.F0(r1)
            xc4.p r1 = r2.Y6(r3)
            if (r1 != 0) goto L65
            java.util.ArrayList r0 = r7.f399492h
            r0.clear()
            goto L7c
        L65:
            java.util.ArrayList r2 = r7.f399492h
            zc4.b r3 = new zc4.b
            r4 = 1
            r3.<init>(r1, r4)
            r2.add(r3)
            goto L16
        L71:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = "getLiveDB modelClass must extends BaseMvvmDB"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L79
            throw r8     // Catch: java.lang.Throwable -> L79
        L79:
            r8 = move-exception
            monitor-exit(r3)
            throw r8
        L7c:
            java.lang.Object r8 = kz5.n0.X(r8)
            java.lang.String r8 = (java.lang.String) r8
            long r0 = ca4.z0.F0(r8)
            r2 = 1
            long r0 = r0 + r2
            r7.f399491g = r0
            r7.a()
            java.lang.String r8 = "preload"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lc4.d0.c(java.util.ArrayList):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h3 h3Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h3) m1Var;
            h3Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isForUnreadPreload", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
            boolean z17 = h3Var.f245766t == 2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isForUnreadPreload", "com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
            if (z17) {
                r45.ua6 I = h3Var.I();
                int size = I.f468703f.size();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.UnreadLoader", "errType:" + i17 + ", errCode:" + i18 + " size:" + size);
                java.util.LinkedList ObjectList = I.f468703f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ObjectList, "ObjectList");
                if (!ObjectList.isEmpty()) {
                    ((ku5.t0) ku5.t0.f394148d).a(new lc4.c0(this, size, I));
                } else {
                    int i19 = this.f399490f;
                    if (i19 > this.f399489e) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.UnreadLoader", "drop preload unread fault, too many times!!");
                    } else {
                        this.f399490f = i19 + 1;
                        a();
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
    }
}
