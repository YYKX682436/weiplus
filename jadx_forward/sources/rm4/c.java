package rm4;

/* loaded from: classes10.dex */
public class c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static rm4.c f478974q;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f478975d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f478976e;

    /* renamed from: f, reason: collision with root package name */
    public long f478977f;

    /* renamed from: g, reason: collision with root package name */
    public long f478978g;

    /* renamed from: h, reason: collision with root package name */
    public sm4.c f478979h;

    /* renamed from: i, reason: collision with root package name */
    public sm4.c f478980i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f478981m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f478982n;

    /* renamed from: o, reason: collision with root package name */
    public rm4.a f478983o;

    /* renamed from: p, reason: collision with root package name */
    public rm4.b f478984p;

    public c() {
        this.f478977f = 1L;
        this.f478978g = 1L;
        java.lang.String a17 = a("blacklist");
        if (com.p314xaae8f345.mm.vfs.w6.j(a17)) {
            try {
                this.f478975d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(com.p314xaae8f345.mm.vfs.w6.M(a17), ",");
                long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_BLACK_LIST_VERSION_LONG, 1L);
                this.f478977f = t17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "black version %d", java.lang.Long.valueOf(t17));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryBlackListMgr", e17, "read black cache file", new java.lang.Object[0]);
            }
        }
        if (this.f478975d == null) {
            this.f478975d = new java.util.ArrayList();
        }
        java.lang.String a18 = a("unlikelist");
        if (com.p314xaae8f345.mm.vfs.w6.j(a18)) {
            try {
                this.f478975d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(com.p314xaae8f345.mm.vfs.w6.M(a18), ",");
                long t18 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_UNLIKE_LIST_VERSION_LONG, 1L);
                this.f478978g = t18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "unlike version %d", java.lang.Long.valueOf(t18));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryBlackListMgr", e18, "read unlike cache file", new java.lang.Object[0]);
            }
        }
        if (this.f478976e == null) {
            this.f478976e = new java.util.ArrayList();
        }
        gm0.j1.d().a(2748, this);
    }

    public static final java.lang.String a(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().d() + "topstory/");
        sb6.append(str);
        return sb6.toString();
    }

    public static rm4.c b() {
        if (f478974q == null) {
            f478974q = new rm4.c();
        }
        return f478974q;
    }

    public void c() {
        com.p314xaae8f345.mm.vfs.w6.R(a("blacklist"), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f478975d, ",").getBytes());
    }

    public void d() {
        com.p314xaae8f345.mm.vfs.w6.R(a("unlikelist"), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f478976e, ",").getBytes());
    }

    public void e(long j17, int i17) {
        if (this.f478979h != null) {
            gm0.j1.d().d(this.f478979h);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "request black version %d offset %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        this.f478979h = new sm4.c(1, j17, i17);
        gm0.j1.n().f354821b.g(this.f478979h);
    }

    public void f(long j17, int i17) {
        if (this.f478980i != null) {
            gm0.j1.d().d(this.f478980i);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "request unlike version %d offset %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        this.f478980i = new sm4.c(3, j17, i17);
        gm0.j1.n().f354821b.g(this.f478980i);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.equals(this.f478979h)) {
            if (i17 == 0 && i18 == 0) {
                r45.jd3 jd3Var = (r45.jd3) this.f478979h.f491464e.f152244b.f152233a;
                int i19 = jd3Var.f459255g;
                if (i19 != 1) {
                    if (i19 == 2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "no need to update black list");
                        return;
                    } else {
                        if (i19 != 3) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "invalid black update flag %d", java.lang.Integer.valueOf(i19));
                            return;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "resync black list");
                        this.f478981m = null;
                        e(this.f478977f, 0);
                        return;
                    }
                }
                if (this.f478981m == null) {
                    this.f478981m = new java.util.ArrayList();
                }
                java.util.LinkedList linkedList = jd3Var.f459252d;
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.fn fnVar = (r45.fn) it.next();
                    ((java.util.ArrayList) this.f478981m).add(fnVar.f455992d);
                }
                if (jd3Var.f459253e == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "sync black size %d version %d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Long.valueOf(jd3Var.f459256h));
                    e(jd3Var.f459256h, jd3Var.f459257i);
                    return;
                }
                this.f478975d = this.f478981m;
                this.f478981m = null;
                long j17 = jd3Var.f459256h;
                this.f478977f = j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "update black version %d total item %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f478975d.size()));
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_BLACK_LIST_VERSION_LONG, java.lang.Long.valueOf(this.f478977f));
                c();
                rm4.a aVar = this.f478983o;
                if (aVar != null) {
                    int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18742xd11d8404.f256423p;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18742xd11d8404 activityC18742xd11d8404 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.g1) aVar).f256509a;
                    activityC18742xd11d8404.X6();
                    activityC18742xd11d8404.Y6();
                    return;
                }
                return;
            }
            return;
        }
        if (m1Var.equals(this.f478980i) && i17 == 0 && i18 == 0) {
            r45.jd3 jd3Var2 = (r45.jd3) this.f478980i.f491464e.f152244b.f152233a;
            int i28 = jd3Var2.f459255g;
            if (i28 != 1) {
                if (i28 == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "no need to update unlike list");
                    return;
                } else {
                    if (i28 != 3) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "invalid unlike update flag %d", java.lang.Integer.valueOf(i28));
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "resync unlike list");
                    this.f478982n = null;
                    f(this.f478978g, 0);
                    return;
                }
            }
            if (this.f478982n == null) {
                this.f478982n = new java.util.ArrayList();
            }
            java.util.LinkedList linkedList2 = jd3Var2.f459252d;
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                r45.fn fnVar2 = (r45.fn) it6.next();
                ((java.util.ArrayList) this.f478982n).add(fnVar2.f455992d);
            }
            if (jd3Var2.f459253e == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "sync unlike size %d version", java.lang.Integer.valueOf(linkedList2.size()), java.lang.Long.valueOf(jd3Var2.f459256h));
                f(jd3Var2.f459256h, jd3Var2.f459257i);
                return;
            }
            this.f478976e = this.f478982n;
            this.f478982n = null;
            long j18 = jd3Var2.f459256h;
            this.f478978g = j18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "update unlike version %d total item %d", java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f478976e.size()));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_UNLIKE_LIST_VERSION_LONG, java.lang.Long.valueOf(this.f478978g));
            d();
            rm4.b bVar = this.f478984p;
            if (bVar != null) {
                int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18742xd11d8404.f256423p;
                com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18742xd11d8404 activityC18742xd11d84042 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.h1) bVar).f256513a;
                activityC18742xd11d84042.X6();
                activityC18742xd11d84042.Y6();
            }
        }
    }
}
