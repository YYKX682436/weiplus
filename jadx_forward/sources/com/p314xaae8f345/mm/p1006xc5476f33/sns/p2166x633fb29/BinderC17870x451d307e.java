package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy */
/* loaded from: classes4.dex */
public class BinderC17870x451d307e extends k55.b {

    /* renamed from: r, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e f245566r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f245567s = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f245568f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f245569g;

    /* renamed from: h, reason: collision with root package name */
    public final k55.k f245570h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.FollowUserEventListener f245571i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f245572m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f245573n;

    /* renamed from: o, reason: collision with root package name */
    public za4.f f245574o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f245575p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f245576q;

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener */
    /* loaded from: classes10.dex */
    public class BulletCommentEventListener extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5794x6d517e8f> {

        /* renamed from: d, reason: collision with root package name */
        public final long f245577d;

        /* renamed from: e, reason: collision with root package name */
        public long f245578e;

        /* renamed from: f, reason: collision with root package name */
        public final long f245579f;

        /* renamed from: g, reason: collision with root package name */
        public final java.lang.String f245580g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f245581h;

        /* renamed from: i, reason: collision with root package name */
        public final java.lang.Runnable f245582i;

        public BulletCommentEventListener(long j17, long j18, java.lang.String str, int i17) {
            super(com.p314xaae8f345.mm.app.a0.f134821d);
            this.f245581h = false;
            this.f245582i = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p(this);
            this.f245577d = j17;
            this.f245578e = j18;
            this.f245579f = i17;
            this.f245580g = str;
            this.f39173x3fe91575 = 343169663;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: alive */
        public synchronized void mo48813x58998cd() {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("alive", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
            super.mo48813x58998cd();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy.BulletCommentEvent", "BulletEventListener alive, info=" + this);
            ((ku5.t0) ku5.t0.f394148d).E(this.f245582i, this.f245579f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("alive", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5794x6d517e8f c5794x6d517e8f) {
            java.lang.String str;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5794x6d517e8f c5794x6d517e8f2 = c5794x6d517e8f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
            boolean z17 = false;
            if (c5794x6d517e8f2 != null) {
                am.pm pmVar = c5794x6d517e8f2.f136103g;
                long j17 = pmVar.f89167d;
                java.lang.String str2 = pmVar.f89166c;
                int i17 = pmVar.f89164a;
                int i18 = pmVar.f89165b;
                if (i17 != 100) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPagesProxy.BulletCommentEvent", "eventType!=100, eventType=" + i17);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
                } else {
                    boolean z18 = i18 == 1;
                    hashCode();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.this.hashCode();
                    if (this.f245578e == j17 && (str = this.f245580g) != null && str.equals(str2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPagesProxy.BulletCommentEvent", "receive bullet event, make BulletEventListener dead, info=" + this);
                        try {
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy.BulletCommentEvent", "BulletEventListener dead exp=" + e17);
                        }
                        if (this.f245581h) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy.BulletCommentEvent", "receive bullet event, dead before");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
                            z17 = true;
                        } else {
                            this.f245581h = true;
                            mo48814x2efc64();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.this.m142013x77b46a52("onBulletCommentEvent", java.lang.Long.valueOf(this.f245577d), java.lang.Long.valueOf(j17), str2, java.lang.Boolean.valueOf(z18));
                            this.f245578e = -1L;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
                            z17 = true;
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
                return z17;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
            return z17;
        }

        /* renamed from: toString */
        public java.lang.String m70014x9616526c() {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
            java.lang.String str = "{callbackId=" + this.f245577d + ", finderFeedId=" + this.f245578e + ", delayBeforeDead=" + this.f245579f + ", comment=" + this.f245580g + ", listener.hash=" + hashCode() + "}";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
            return str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$FollowUserEventListener */
    /* loaded from: classes4.dex */
    public class FollowUserEventListener extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be> {

        /* renamed from: d, reason: collision with root package name */
        public final long f245584d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f245585e;

        public FollowUserEventListener(long j17, java.lang.String str) {
            super(com.p314xaae8f345.mm.app.a0.f134821d);
            this.f245584d = j17;
            this.f245585e = str;
            this.f39173x3fe91575 = 398763182;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be) {
            am.zd zdVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$FollowUserEventListener");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be2 = c5560x6f070be;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e binderC17870x451d307e = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.this;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$FollowUserEventListener");
            if (c5560x6f070be2 == null || (zdVar = c5560x6f070be2.f135879g) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPagesProxy", "FollowUserEventListener, event.data==null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "FollowUserEventListener, result=" + zdVar.f90086c + ", opType=" + zdVar.f90085b + ", opScene=" + zdVar.f90087d + ", finderUserName=" + zdVar.f90084a);
                if (zdVar.f90085b == 1 && zdVar.f90087d == 102 && this.f245585e.equals(zdVar.f90084a)) {
                    java.lang.String str = "";
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("followType", 2);
                        jSONObject.put("followRet", zdVar.f90086c);
                        str = jSONObject.toString();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e binderC17870x451d307e2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.f245566r;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.FollowUserEventListener followUserEventListener = binderC17870x451d307e.f245571i;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                        if (followUserEventListener != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.FollowUserEventListener followUserEventListener2 = binderC17870x451d307e.f245571i;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                            followUserEventListener2.mo48814x2efc64();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                            binderC17870x451d307e.f245571i = null;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "FollowUserEventListener, exp is " + th6.toString());
                    }
                    binderC17870x451d307e.m142013x77b46a52("onGetBtnAdFinderContact", java.lang.Long.valueOf(this.f245584d), str);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPagesProxy", "FollowUserEventListener, event from other");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$FollowUserEventListener");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$FollowUserEventListener");
            return true;
        }
    }

    public BinderC17870x451d307e(k55.k kVar) {
        super(kVar);
        this.f245568f = new java.util.HashMap();
        this.f245569g = new java.util.HashMap();
        this.f245572m = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c(this);
        this.f245573n = new java.util.concurrent.ConcurrentHashMap();
        this.f245574o = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.e(this);
        this.f245575p = new java.util.HashMap();
        this.f245576q = new java.util.HashMap();
        this.f245570h = kVar;
    }

    public static /* synthetic */ java.util.Map e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e binderC17870x451d307e) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.Map map = binderC17870x451d307e.f245569g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return map;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.u0 g(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e binderC17870x451d307e) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = binderC17870x451d307e.f245572m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return u0Var;
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e m69779x9cf0d20b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInstance", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (f245566r == null) {
            k55.k kVar = new k55.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            f245566r = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e(kVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e binderC17870x451d307e = f245566r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInstance", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return binderC17870x451d307e;
    }

    /* renamed from: addAdFinderContract */
    public void m69780xf035211c(s34.y yVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addAdFinderContract", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("doAddAdFinderContractMM", java.lang.Long.valueOf(currentTimeMillis), yVar.f484362a, yVar.f484363b, yVar.f484365d, yVar.f484364c, yVar.f484366e, yVar.f484367f, yVar.f484368g, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addAdFinderContract", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: addCallback */
    public void m69781xbba9cc06(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n nVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long m69979xd383b362 = m69979xd383b362(str);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f245573n;
        java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(java.lang.Long.valueOf(m69979xd383b362));
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            arrayList.add(nVar);
        } else if (!arrayList.contains(nVar)) {
            arrayList.add(nVar);
        }
        concurrentHashMap.put(java.lang.Long.valueOf(m69979xd383b362), arrayList);
        m142014x6c2fab7("addCallbackMM", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: addCallbackMM */
    public void m69782x7866ec26() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addCallbackMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        za4.k g17 = za4.k.g();
        za4.f fVar = this.f245574o;
        g17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (fVar != null) {
            g17.f552670d = fVar;
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().a(g17.f552674h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addCallbackMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: addReportInfo */
    public void m69783x744b3383(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.j3 j3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addReportInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        m142014x6c2fab7("addReportInfoMM", str, j3Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addReportInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: addReportInfoMM */
    public void m69784x8e4c6863(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.j3 j3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addReportInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        za4.k.g().e(str, j3Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addReportInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: clearCallback */
    public void m69785xc9bb9db2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        m142014x6c2fab7("clearCallbackMM", new java.lang.Object[0]);
        synchronized (this.f245575p) {
            try {
                ((java.util.HashMap) this.f245575p).clear();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                throw th6;
            }
        }
        ((java.util.HashMap) this.f245568f).clear();
        this.f245573n.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: clearCallbackMM */
    public void m69786x494b02d2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearCallbackMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "clearCallbackMM, hashCode=" + hashCode());
        ((java.util.HashMap) this.f245569g).clear();
        this.f245574o = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeOnSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        gm0.j1.i();
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f245572m;
        r1Var.q(1337, u0Var);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(1210, u0Var);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(2874, u0Var);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(2721, u0Var);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(1802, u0Var);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(2605, u0Var);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(2883, u0Var);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(4353, u0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeOnSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearCallbackMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: confirmDialPhoneNum */
    public void m69787x3c09f1a8(android.app.Activity activity, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("confirmDialPhoneNum", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (str == null || str.length() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("confirmDialPhoneNum", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18126x284db4ee.class);
        intent.putExtra("phoneNum", str);
        intent.putExtra("op", 4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "confirmDialPhoneNum", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "confirmDialPhoneNum", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("confirmDialPhoneNum", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: connect */
    public void m69788x38b478ea(java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("connect", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        this.f245570h.a(runnable);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("connect", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: contactGetTypeTextFromUserName */
    public int m69789xdb1e581d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("contactGetTypeTextFromUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("contactGetTypeTextFromUserNameMM", str);
        int intValue = m142014x6c2fab7 == null ? 0 : ((java.lang.Integer) m142014x6c2fab7).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("contactGetTypeTextFromUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return intValue;
    }

    @k55.m
    /* renamed from: contactGetTypeTextFromUserNameMM */
    public int m69790x8ce8ce7d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("contactGetTypeTextFromUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int C = c01.e2.C(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("contactGetTypeTextFromUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return C;
    }

    /* renamed from: deleteDeferredDeepLink */
    public void m69791xec88fbd0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteDeferredDeepLink", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        m142014x6c2fab7("deleteDeferredDeepLinkMM", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteDeferredDeepLink", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: deleteDeferredDeepLinkMM */
    public void m69792xee395170(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteDeferredDeepLinkMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        j().edit().remove(str).commit();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteDeferredDeepLinkMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: doAdChannelScene */
    public void m69793x9be12277(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAdChannelScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("doAdChannelSceneMM", java.lang.Long.valueOf(currentTimeMillis), str, str2, str3, java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAdChannelScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: doAdChannelSceneMM */
    public void m69794x28226a57(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAdChannelSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.b bVar = new ib4.b(str, str2, str3, z17);
        ((java.util.HashMap) this.f245569g).put(bVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f354821b.g(bVar);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(1210, this.f245572m);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAdChannelSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: doAdNativeAntiAbuseScene */
    public void m69795xe074ce8d(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAdNativeAntiAbuseScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("doAdNativeAntiAbuseSceneMM", java.lang.Long.valueOf(currentTimeMillis), str, str2, str3, java.lang.Integer.valueOf(i17), str4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAdNativeAntiAbuseScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: doAdNativeAntiAbuseSceneMM */
    public void m69796x967b68ed(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAdNativeAntiAbuseSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.a aVar = new ib4.a(str, str2, str3, i17, str4, "", 0L);
        ((java.util.HashMap) this.f245569g).put(aVar, java.lang.Long.valueOf(j17));
        gm0.j1.d().a(4679, this.f245572m);
        gm0.j1.d().g(aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAdNativeAntiAbuseSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: doAdUpdateQrUrlScene */
    public void m69797x38f82575(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAdUpdateQrUrlScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long incrementAndGet = f245567s.incrementAndGet();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(incrementAndGet), tVar);
        m142014x6c2fab7("doAdUpdateQrUrlSceneMM", java.lang.Long.valueOf(incrementAndGet), str, str2, str3, str4, str5, str6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAdUpdateQrUrlScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: doAdUpdateQrUrlSceneMM */
    public void m69798xdb84a5d5(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAdUpdateQrUrlSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.m mVar = new ib4.m(str, str2, str3, str4, str5, str6);
        ((java.util.HashMap) this.f245569g).put(mVar, java.lang.Long.valueOf(j17));
        gm0.j1.d().a(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46404xa5f7fd74, this.f245572m);
        gm0.j1.d().g(mVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAdUpdateQrUrlSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: doAddAdFinderContractMM */
    public void m69799x73ae6bf1(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAddAdFinderContractMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doFollowFinder", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "doFollowFinder, userName=" + str);
        if (this.f245571i == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.FollowUserEventListener followUserEventListener = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.FollowUserEventListener(j17, str);
            this.f245571i = followUserEventListener;
            followUserEventListener.mo48813x58998cd();
        }
        try {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Ni(str, 1, 0L, false, 102, 0);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "doFollowFinder exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFollowFinder", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAddAdFinderContractMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: doAddBrandScene */
    public void m69800x8aebd5fb(java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAddBrandScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("doAddBrandSceneSceneMM", java.lang.Long.valueOf(currentTimeMillis), str, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAddBrandScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: doAddBrandSceneSceneMM */
    public void m69801x702950b1(long j17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAddBrandSceneSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p944x882e457a.m1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y.a(str, this.f245572m, i17);
        boolean z17 = a17 instanceof ab0.s;
        java.util.Map map = this.f245569g;
        if (z17) {
            ((java.util.HashMap) map).put(a17, java.lang.Long.valueOf(j17));
            gm0.j1.d().g(a17);
        } else if (a17 instanceof ns.l) {
            ((java.util.HashMap) map).put(a17, java.lang.Long.valueOf(j17));
            gm0.j1.d().g(a17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAddBrandSceneSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: doCgiReportCanvasBrowseInfo */
    public void m69802x925c1fbe(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doCgiReportCanvasBrowseInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        m142014x6c2fab7("doCgiReportCanvasBrowseInfoMM", java.lang.Integer.valueOf(i17), str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doCgiReportCanvasBrowseInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: doCgiReportCanvasBrowseInfoMM */
    public void m69803x6bd331de(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doCgiReportCanvasBrowseInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        r45.e44 e44Var = new r45.e44();
        e44Var.f454540d = i17;
        e44Var.f454542f = (int) (java.lang.System.currentTimeMillis() / 1000);
        e44Var.f454543g = 1;
        e44Var.f454541e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(str.getBytes());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e44Var);
        i64.n0 n0Var = new i64.n0(arrayList);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(n0Var);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(1802, this.f245572m);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doCgiReportCanvasBrowseInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: doDynamicUpdateScene */
    public void m69804x315cdb6f(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDynamicUpdateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("doDynamicUpdateSceneMM", java.lang.Long.valueOf(currentTimeMillis), str, str2, str3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDynamicUpdateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: doDynamicUpdateSceneMM */
    public void m69805x4d93c54f(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDynamicUpdateSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.l lVar = new ib4.l(str, str2, str3);
        ((java.util.HashMap) this.f245569g).put(lVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f354821b.g(lVar);
        gm0.j1.i();
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f245572m;
        r1Var.a(1337, u0Var);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(2721, u0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDynamicUpdateSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: doFav */
    public int m69806x5b4b690(android.content.Intent intent, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doFav", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("doFavMM", intent, java.lang.Integer.valueOf(i17));
        int intValue = m142014x6c2fab7 == null ? 0 : ((java.lang.Integer) m142014x6c2fab7).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFav", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return intValue;
    }

    /* renamed from: doFavAdlanding */
    public int m69807xfac19be4(long j17, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i18, java.lang.String str7, java.lang.String str8) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doFavAdlanding", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("doFavAdlandingMM", java.lang.Long.valueOf(j17), str, java.lang.Integer.valueOf(i17), str2, str3, str4, str5, str6, java.lang.Integer.valueOf(i18), str7, str8);
        int intValue = m142014x6c2fab7 == null ? 0 : ((java.lang.Integer) m142014x6c2fab7).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFavAdlanding", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return intValue;
    }

    @k55.m
    /* renamed from: doFavAdlandingMM */
    public int m69808x50ca3c84(long j17, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i18, java.lang.String str7, java.lang.String str8) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doFavAdlandingMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        if (((i17 != 1 && i17 != 2 && i17 != 3 && i17 != 4 && i17 != 9 && i17 != 10 && i17 != 11) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) && ((i17 != 5 && i17 != 6) || j17 == -2147483648L)) {
        }
        o72.c5 c5Var = (o72.c5) i95.n0.c(o72.c5.class);
        java.lang.String str9 = str6.hashCode() + "";
        java.lang.String r17 = c01.z1.r();
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b2) c5Var).getClass();
        boolean z17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.f270312a;
        java.lang.String format = java.lang.String.format("%s#%s", str9, "");
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(r17);
        jq0Var.g(2);
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.d(str9 + "");
        jq0Var.i(format);
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.g0(format);
        gp0Var.z0(true);
        gp0Var.h0(5);
        gp0Var.O0(str4);
        gp0Var.m0(str5);
        gp0Var.Z(str6);
        gp0Var.x0(true);
        bq0Var.f452497f.add(gp0Var);
        r45.tq0 tq0Var = new r45.tq0();
        tq0Var.o(str7);
        tq0Var.i(str2);
        bq0Var.r(tq0Var);
        bq0Var.o(jq0Var);
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87848a = bq0Var;
        c4Var.f87852e = str4;
        c4Var.f87850c = 5;
        c4Var.f87855h = c01.n2.a(str3);
        c4Var.f87851d = str4;
        c4Var.f87852e = str5;
        r45.bq0 bq0Var2 = c4Var.f87848a;
        if (bq0Var2 != null && (linkedList = bq0Var2.f452497f) != null && linkedList.size() > 0 && bq0Var2.f452497f.get(0) != null) {
            ((r45.gp0) bq0Var2.f452497f.get(0)).Z(str6);
            ((r45.gp0) bq0Var2.f452497f.get(0)).O0(str4);
            ((r45.gp0) bq0Var2.f452497f.get(0)).m0(str5);
            ((r45.gp0) bq0Var2.f452497f.get(0)).H0(str8);
        }
        if (bq0Var2 != null) {
            bq0Var2.p(str4);
            bq0Var2.e(str5);
        }
        c4Var.f87860m = i18;
        c5303xc75d2f73.e();
        int i19 = c4Var.f87859l;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFavAdlandingMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return i19;
    }

    @k55.m
    /* renamed from: doFavMM */
    public int m69809x6b615c30(android.content.Intent intent, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doFavMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.l(c5303xc75d2f73, intent);
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87860m = i17;
        c5303xc75d2f73.e();
        int i18 = c4Var.f87859l;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFavMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return i18;
    }

    /* renamed from: doFavOfficialItemScene */
    public void m69810xecd8b9de(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doFavOfficialItemScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "doFavOfficialItemScene with empty itemBuff, interrupted!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFavOfficialItemScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("doFavOfficialItemSceneMM", java.lang.Long.valueOf(currentTimeMillis), str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFavOfficialItemScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: doFavOfficialItemSceneMM */
    public void m69811x1991c3fe(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doFavOfficialItemSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.k kVar = new ib4.k(str);
        ((java.util.HashMap) this.f245569g).put(kVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f354821b.g(kVar);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(2874, this.f245572m);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFavOfficialItemSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: doGetHbCoverState */
    public void m69812x56abea1f(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doGetHbCoverState", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("doGetHbCoverStateMM", java.lang.Long.valueOf(currentTimeMillis), str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "doGetHbCoverState, hbCoverId=" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doGetHbCoverState", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: doGetHbCoverStateMM */
    public void m69813x5b59e7ff(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doGetHbCoverStateMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.d dVar = new ib4.d(str);
        ((java.util.HashMap) this.f245569g).put(dVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f354821b.g(dVar);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(2944, this.f245572m);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doGetHbCoverStateMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: doGetSmartPhoneScene */
    public void m69814xd109581c(long j17, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doGetSmartPhoneScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("doGetSmartPhoneSceneMM", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), str, str2, java.lang.Integer.valueOf(i18), str3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doGetSmartPhoneScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: doGetSmartPhoneSceneMM */
    public void m69815xb413cabc(long j17, long j18, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doGetSmartPhoneSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.e eVar = new ib4.e(j18, i17, str, str2, i18, str3);
        ((java.util.HashMap) this.f245569g).put(eVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f354821b.g(eVar);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(2605, this.f245572m);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doGetSmartPhoneSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: doJumpToFinderFeedsDetailUI */
    public void m69816x89fa1980(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doJumpToFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            m142014x6c2fab7("doJumpToFinderFeedsDetailUIMM", str, str2, str3, str4, str5, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "doJumpToFinderFeedsDetailUI remote call has an exception!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpToFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: doJumpToFinderFeedsDetailUIMM */
    public void m69817xf3d9c320(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, int i18) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doJumpToFinderFeedsDetailUIMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(str5);
            if (b17 == null) {
                z17 = false;
            } else {
                z17 = (i17 == 16 ? b17.m70356x450e1efa() : b17.m70346x10413e67()).f38099x947561cd;
            }
            l44.s4.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str4, str, str2, str3, ca4.m0.D0(str5), z17, i18);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "doJumpToFinderFeedsDetailUI call has an exception");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpToFinderFeedsDetailUIMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: doJumpToFinderProfileUI */
    public boolean m69818x1e004a23(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        android.content.Context context2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (context == null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "doJumpToFinderProfileUI, context==null");
                context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "doJumpToFinderProfileUI, exp=" + th6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                return false;
            }
        } else {
            context2 = context;
        }
        android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18009xc0007d67.class);
        intent.putExtra("action_type", 4);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str4 = "";
        intent.putExtra("finderUsername", str == null ? "" : str);
        intent.putExtra("uxInfo", str2 == null ? "" : str2);
        if (str3 != null) {
            str4 = str3;
        }
        intent.putExtra("snsIdStr", str4);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "doJumpToFinderProfileUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "doJumpToFinderProfileUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return true;
    }

    /* renamed from: doPreloadAdCanvas */
    public void m69819xde45e479(long j17, java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        m142014x6c2fab7("doPreloadAdCanvasMM", java.lang.Long.valueOf(j17), str, str2, java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: doPreloadAdCanvasMM */
    public void m69820x645eb3d9(long j17, java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadAdCanvasMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        za4.o0.c(j17, z17, str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadAdCanvasMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: doPreloadTextStatusResource */
    public void m69821xf699f44b(f54.c0 c0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadTextStatusResource", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        m142014x6c2fab7("doPreloadTextStatusResourceMM", c0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadTextStatusResource", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: doPreloadTextStatusResourceMM */
    public void m69822xb7ee172b(f54.c0 c0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadTextStatusResourceMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            c0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
            java.lang.String str = c0Var.G1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImageUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
            java.lang.String str2 = c0Var.f341235z1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
            w64.t.e(str, str2, c0Var.A1);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "doPreloadTextStatusMM, exp is " + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadTextStatusResourceMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: doSearchContactMM */
    public void m69823x8d36e0ed(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doSearchContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "doSearchContactMM, userName=" + str);
        ((k90.l) ((l90.k) i95.n0.c(l90.k.class))).getClass();
        tg3.r1 r1Var = new tg3.r1(str, 1);
        ((java.util.HashMap) this.f245569g).put(r1Var, java.lang.Long.valueOf(j17));
        gm0.j1.d().a(106, this.f245572m);
        gm0.j1.d().g(r1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doSearchContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: doSearchDynamicUpdateScene */
    public void m69824x42c406f7(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doSearchDynamicUpdateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("doSearchDynamicUpdateSceneMM", java.lang.Long.valueOf(currentTimeMillis), str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doSearchDynamicUpdateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: doSearchDynamicUpdateSceneMM */
    public void m69825xa1de2ed7(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doSearchDynamicUpdateSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.l lVar = new ib4.l(str);
        ((java.util.HashMap) this.f245569g).put(lVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f354821b.g(lVar);
        gm0.j1.i();
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f245572m;
        r1Var.a(1337, u0Var);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(2721, u0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doSearchDynamicUpdateSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: doTransimt */
    public void m69826x68f79d3(android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doTransimt", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18126x284db4ee.class);
        intent.putExtra("adlandingXml", str);
        intent.putExtra("shareTitle", str2);
        intent.putExtra("shareThumbUrl", str3);
        intent.putExtra("shareDesc", str4);
        intent.putExtra("shareUrl", str5);
        intent.putExtra("statExtStr", str6);
        intent.putExtra("uxInfo", str7);
        intent.putExtra("canvasId", str8);
        intent.putExtra("op", 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "doTransimt", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "doTransimt", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doTransimt", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: doTransimtMM */
    public void m69827xa0985ab3(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doTransimtMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doTransimtMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: doUpdateUxInfoScene */
    public void m69828x87c21b47(java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doUpdateUxInfoScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("doUpdateUxInfoSceneMM", java.lang.Long.valueOf(currentTimeMillis), str, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUpdateUxInfoScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: doUpdateUxInfoSceneMM */
    public void m69829x9fa86f27(long j17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doUpdateUxInfoSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.n nVar = new ib4.n(str, i17);
        ((java.util.HashMap) this.f245569g).put(nVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f354821b.g(nVar);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(2883, this.f245572m);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUpdateUxInfoSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: downloadLandingPageVideo */
    public void m69830xc4004f7d(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, int i18, boolean z18, dn.n nVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, str2, str3)) {
            if (nVar != null) {
                nVar.g(str, -1, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.A(nd1.j0.f72943x366c91de, 20);
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("sns_ad_download_resource_preferences", 0);
        boolean z19 = sharedPreferences.getBoolean(str, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "downloadLandingPageVideo, mediaId is %s, finish is %s, isPreload=%s", str, java.lang.Boolean.valueOf(z19), java.lang.String.valueOf(z17));
        if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "downloadLandingPageVideo, %s is already download, and finished is %s", str, java.lang.Boolean.valueOf(z19));
            if (z19) {
                g0Var.A(nd1.j0.f72943x366c91de, 21);
                nVar.g(str, 0, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                return;
            }
            g0Var.A(nd1.j0.f72943x366c91de, 22);
        } else if (z19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "downloadLandingPageVideo, %s last download file was deleted, and finished is %s", str, java.lang.Boolean.valueOf(z19));
            g0Var.A(nd1.j0.f72943x366c91de, 23);
            sharedPreferences.edit().putBoolean(str, false).commit();
        } else {
            g0Var.A(nd1.j0.f72943x366c91de, 24);
        }
        java.util.Map map = this.f245576q;
        if (z17 && ((java.util.HashMap) map).containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "downloadLandingPageVideo, %s, %s is already in downloading, preload=true", str2, str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        } else {
            if (nVar != null) {
                ((java.util.HashMap) map).put(str, nVar);
            }
            m142014x6c2fab7("downloadLandingPageVideoMM", str, str2, str3, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z18));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        }
    }

    @k55.m
    /* renamed from: downloadLandingPageVideoMM */
    public void m69831xc52a6ddd(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, int i18, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadLandingPageVideoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "add online video task [%s] url[%s] path[%s]", str, str2, str3);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 25);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i(this, str, str2, str3, i17, z17, i18, z18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadLandingPageVideoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: downloadLandingPagesCDNFile */
    public void m69832x928730f4(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, fe0.o3 o3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadLandingPagesCDNFile", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            if (o3Var != null) {
                o3Var.a();
            }
            return;
        }
        if (o3Var != null) {
            synchronized (this.f245575p) {
                try {
                    if (!((java.util.HashMap) this.f245575p).containsKey(str2)) {
                        ((java.util.HashMap) this.f245575p).put(str2, new java.util.ArrayList());
                    }
                    java.util.List list = (java.util.List) ((java.util.HashMap) this.f245575p).get(str2);
                    if (list != null) {
                        list.add(o3Var);
                    }
                } finally {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadLandingPagesCDNFile", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                }
            }
        }
        m142014x6c2fab7("downloadLandingPagesCDNFileMM", str, str2, str3, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadLandingPagesCDNFile", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: downloadLandingPagesCDNFileMM */
    public void m69833xd7ecd94(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadLandingPagesCDNFileMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (i17 == 0) {
            m69834xa1696526(str, str2, str3);
        } else if (i17 == 1) {
            m69835x9c2bdbe8(str, str2, str3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadLandingPagesCDNFileMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: downloadLandingPagesImageMMImpl */
    public void m69834xa1696526(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadLandingPagesImageMMImpl", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "downloadLandingPagesImageMMImpl, mediaId=" + str2);
        r45.jj4 h17 = m21.y.h(str2, 2, str3, str3, 1, 1, "");
        ca4.s0 s0Var = new ca4.s0(h17);
        s0Var.d(3);
        s0Var.e(h17.f459388d);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f(this, h17, s0Var, str, str2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadLandingPagesImageMMImpl", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: downloadLandingPagesSightMMImpl */
    public void m69835x9c2bdbe8(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadLandingPagesSightMMImpl", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "downloadLandingPagesSightMMImpl, mediaId=" + str2);
        r45.jj4 h17 = m21.y.h(str2, 6, str3, str3, 1, 1, "");
        h17.N = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g(this, h17, str, str2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadLandingPagesSightMMImpl", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: downloadPagFile */
    public void m69836xe799858a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadPagFile", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        m142014x6c2fab7("downloadPagFileMM", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadPagFile", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: downloadPagFileMM */
    public boolean m69837x674e54aa(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadPagFileMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.a(str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "downloadPagFileMM exp=" + android.util.Log.getStackTraceString(th6));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadPagFileMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return false;
    }

    @k55.l
    /* renamed from: failed */
    public void m69838xb396943d(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f245573n;
        java.util.Iterator it = ((java.util.ArrayList) concurrentHashMap.get(java.lang.Long.valueOf(j17))).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n) it.next();
            if (nVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.s4 s4Var = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z3) nVar).f247397a;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4.V(s4Var.f247018r).V1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4.U(s4Var.f247018r).l(8);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
            }
        }
        concurrentHashMap.remove(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: favEditTag */
    public void m69839x57ac0d95() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("favEditTag", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        m142014x6c2fab7("favEditTagMM", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favEditTag", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: favEditTagMM */
    public void m69840x1cdf05f5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("favEditTagMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        c5432x35bb364f.f135776g.f90061a = 35;
        c5432x35bb364f.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favEditTagMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: fetchQRCodeInfo */
    public void m69841xd28ebb6(int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fetchQRCodeInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("fetchQRCodeInfoMM", java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(i17), str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchQRCodeInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: fetchQRCodeInfoMM */
    public void m69842x669cdfd6(long j17, int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fetchQRCodeInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k(this, i17, str, j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchQRCodeInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: geoLocation */
    public void m69843x7d3b226(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("geoLocation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
            m142014x6c2fab7("geoLocationMM", java.lang.Long.valueOf(currentTimeMillis), str);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "geoLocation catch one exception");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("geoLocation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: geoLocationMM */
    public void m69844x61afca46(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("geoLocationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            r54.f fVar = null;
            if (j17 <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            } else {
                try {
                    fVar = new r54.f(this, "onGeoLocation", j17);
                } catch (java.lang.Throwable unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GeoServerRequester", "there is something wrong in makeRequester");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            }
            if (fVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("request", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestGeo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
                    boolean equalsIgnoreCase = "GCJ02".equalsIgnoreCase(str);
                    i11.e eVar = fVar.f474274g;
                    if (equalsIgnoreCase) {
                        ((i11.h) eVar).j(fVar, false);
                    } else {
                        ((i11.h) eVar).k(fVar, false);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(12, 10);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestGeo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
                } catch (java.lang.Throwable unused2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GeoServerRequester", "there is something wrong in request");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("request", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            }
        } catch (java.lang.Throwable unused3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "geoLocationMM catch one exception");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("geoLocationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: getAccSnsPath */
    public java.lang.String m69845xe9748df2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAccSnsPath", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String str = (java.lang.String) m142014x6c2fab7("getAccSnsPathMM", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAccSnsPath", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @k55.m
    /* renamed from: getAccSnsPathMM */
    public java.lang.String m69846x5e88e312() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAccSnsPathMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String Di = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAccSnsPathMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return Di;
    }

    /* renamed from: getAdFinderContact */
    public void m69847x4f02f381(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdFinderContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("getAdFinderContactMM", java.lang.Long.valueOf(currentTimeMillis), str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdFinderContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: getAdFinderContactMM */
    public void m69848x9a1420e1(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdFinderContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Ui(str, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a(this, j17), 4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdFinderContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: getAdValue */
    public java.lang.String m69849xf897eed8(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
        try {
            java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("getAdValueMM", str, str2);
            if (m142014x6c2fab7 instanceof java.lang.String) {
                java.lang.String str3 = (java.lang.String) m142014x6c2fab7;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                return str3;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "getAdValue exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return "";
    }

    @k55.m
    /* renamed from: getAdValueMM */
    public java.lang.String m69850x3257a278(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdValueMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            java.lang.String d17 = p34.o.d(str, str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdValueMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return d17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "getAdValueMM exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdValueMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
    }

    /* renamed from: getAdVoteIndex */
    public int m69851x33b279ef(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdVoteIndex", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int intValue = ((java.lang.Integer) m142014x6c2fab7("getAdVoteIndexMM", str, str2, str3)).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdVoteIndex", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return intValue;
    }

    @k55.m
    /* renamed from: getAdVoteIndexMM */
    public int m69852x10fbc3cf(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdVoteIndexMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.c(str, str2, str3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdVoteIndexMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return c17;
    }

    /* renamed from: getAdVoteInfo */
    public java.lang.String m69853x9ecfbf1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdVoteInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String str4 = (java.lang.String) m142014x6c2fab7("getAdVoteInfoMM", str, str2, str3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdVoteInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str4;
    }

    @k55.m
    /* renamed from: getAdVoteInfoMM */
    public java.lang.String m69854x429dcd51(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdVoteInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.d(str, str2, str3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdVoteInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return d17;
    }

    /* renamed from: getAdWuid */
    public java.lang.String m69855x1047b632() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdWuid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("getAdWuidMM", new java.lang.Object[0]);
        java.lang.String str = m142014x6c2fab7 == null ? "" : (java.lang.String) m142014x6c2fab7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdWuid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @k55.m
    /* renamed from: getAdWuidMM */
    public java.lang.String m69856x1d32fb52() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdWuidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String c17 = n74.w0.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdWuidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return c17;
    }

    /* renamed from: getAvatarByUserName */
    public android.graphics.Bitmap m69857x6f0d101c(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAvatarByUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("getAvatarByUserNameMM", str, java.lang.Boolean.valueOf(z17));
        if (!(m142014x6c2fab7 instanceof android.graphics.Bitmap)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAvatarByUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return null;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) m142014x6c2fab7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAvatarByUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return bitmap;
    }

    @k55.m
    /* renamed from: getAvatarByUserNameMM */
    public android.graphics.Bitmap m69858xe00982bc(java.lang.String str, boolean z17) {
        java.lang.String str2;
        u45.f a17;
        android.graphics.Bitmap Ai;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAvatarByUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            str2 = str + "-1.0";
            a17 = u45.e.a();
            Ai = a17 != null ? ((va3.m0) u45.e.a()).Ai(str2) : null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "getAvatarByUserNameMM name=" + str + ", exp=" + android.util.Log.getStackTraceString(th6));
        }
        if (Ai != null && !Ai.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "getAvatarByUserNameMM, useCache, name=" + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAvatarByUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return Ai;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 c17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.u.c();
        if (c17 != null) {
            Ai = c17.mo560xd586ddb5(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "getAvatarByUserNameMM, loader==null");
        }
        if (Ai != null) {
            android.graphics.Bitmap s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(Ai, false, Ai.getWidth() * 1.0f);
            if (a17 != null) {
                ((va3.m0) a17).Bi(str2, s07);
            }
            if (s07 != null && !s07.isRecycled()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAvatarByUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                return s07;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "getAvatarByUserNameMM, loader return null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAvatarByUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return null;
    }

    /* renamed from: getBtnPersonalWxUserName */
    public void m69859xe326df1d(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBtnPersonalWxUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("getBtnPersonalWxUserNameMM", java.lang.Long.valueOf(currentTimeMillis), str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBtnPersonalWxUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: getBtnPersonalWxUserNameMM */
    public void m69860xb4eb957d(long j17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBtnPersonalWxUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.c cVar = new ib4.c(str, str2);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(cVar);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(4353, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d(this, j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBtnPersonalWxUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: getCfg */
    public java.lang.Object m69861xb588312e(int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCfg", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("getCfgMM", java.lang.Integer.valueOf(i17), obj);
        if (m142014x6c2fab7 != null) {
            obj = m142014x6c2fab7;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCfg", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return obj;
    }

    @k55.m
    /* renamed from: getCfgMM */
    public java.lang.Object m69862x7440a74e(int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCfgMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        gm0.j1.i();
        java.lang.Object l17 = gm0.j1.u().c().l(i17, obj);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCfgMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return l17;
    }

    /* renamed from: getDisplayName */
    public java.lang.String m69863x40021d37(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("getDisplayNameMM", str);
        java.lang.String str2 = m142014x6c2fab7 == null ? "" : (java.lang.String) m142014x6c2fab7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    @k55.m
    /* renamed from: getDisplayNameMM */
    public java.lang.String m69864x47efb517(java.lang.String str) {
        java.lang.String str2 = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07 = Bi == null ? null : Bi.f0(str);
            if (f07 != null) {
                str2 = f07.g2();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return str2;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "getDisplayNameMM, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
    }

    /* renamed from: getOpenSdkAppInfo */
    public void m69865xf7f9dbb5(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOpenSdkAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "getOpenSdkAppInfo, appId=" + str);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("getOpenSdkAppInfoMM", str, java.lang.Long.valueOf(currentTimeMillis));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpenSdkAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: getOpenSdkAppInfoMM */
    public void m69866xe0f1cc15(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOpenSdkAppInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m(this, str, j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpenSdkAppInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: getPhoneNumber */
    public java.lang.String m69867x92bb0121() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPhoneNumber", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("getPhoneNumberMM", new java.lang.Object[0]);
        if (!(m142014x6c2fab7 instanceof java.lang.String)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhoneNumber", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
        java.lang.String str = (java.lang.String) m142014x6c2fab7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhoneNumber", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @k55.m
    /* renamed from: getPhoneNumberMM */
    public java.lang.String m69868xcfff4681() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPhoneNumberMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            str = (java.lang.String) gm0.j1.u().c().l(6, null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "getPhoneNumberMM exp=" + android.util.Log.getStackTraceString(th6));
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhoneNumberMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    /* renamed from: getRemoteServiceProxy */
    public k55.k m69869x1347215() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRemoteServiceProxy", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRemoteServiceProxy", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return this.f245570h;
    }

    /* renamed from: getSelfNickName */
    public java.lang.String m69870xbe3cd670() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelfNickName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("getSelfNickNameMM", new java.lang.Object[0]);
        java.lang.String str = m142014x6c2fab7 == null ? "" : (java.lang.String) m142014x6c2fab7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelfNickName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @k55.m
    /* renamed from: getSelfNickNameMM */
    public java.lang.String m69871x22610410() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelfNickNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            java.lang.String l17 = c01.z1.l();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelfNickNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return l17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "getSelfNickNameMM, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelfNickNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
    }

    /* renamed from: getSelfUserName */
    public java.lang.String m69872xaa2fb6d8() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelfUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("getSelfUserNameMM", new java.lang.Object[0]);
        java.lang.String str = m142014x6c2fab7 == null ? "" : (java.lang.String) m142014x6c2fab7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelfUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @k55.m
    /* renamed from: getSelfUserNameMM */
    public java.lang.String m69873xdd1d6a78() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelfUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            java.lang.String r17 = c01.z1.r();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelfUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return r17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "getSelfUserNameMM, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelfUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
    }

    /* renamed from: getSnsAdCanvasExtXml */
    public java.lang.String m69874xb7cdf053(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdCanvasExtXml", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String str2 = (java.lang.String) m142014x6c2fab7("getSnsAdCanvasExtXmlMM", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdCanvasExtXml", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    @k55.m
    /* renamed from: getSnsAdCanvasExtXmlMM */
    public java.lang.String m69875xfc133133(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdCanvasExtXmlMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(str);
        if (b17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdCanvasExtXmlMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
        java.lang.String str2 = b17.m70346x10413e67().f38068x19c5d171;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdCanvasExtXmlMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    /* renamed from: getSnsAdType */
    public int m69876x74ed66df(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdType", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("getSnsAdTypeMM", str);
        if (!(m142014x6c2fab7 instanceof java.lang.Number)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdType", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return 0;
        }
        int intValue = ((java.lang.Number) m142014x6c2fab7).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdType", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return intValue;
    }

    @k55.m
    /* renamed from: getSnsAdTypeMM */
    public int m69877xef2f34bf(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdTypeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(str);
        if (b17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdTypeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return 0;
        }
        int m70353x104668f3 = b17.m70353x104668f3();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdTypeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return m70353x104668f3;
    }

    /* renamed from: getSnsAid */
    public java.lang.String m69878x2f97d39a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String str2 = (java.lang.String) m142014x6c2fab7("getSnsAidMM", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    @k55.m
    /* renamed from: getSnsAidMM */
    public java.lang.String m69879xa8f15eba(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(str);
        if (b17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
        java.lang.String m70355xb5882a06 = b17.m70355xb5882a06();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return m70355xb5882a06;
    }

    /* renamed from: getSnsInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 m69880xc3665610(java.lang.String str) {
        android.os.Bundle bundle;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        android.os.Bundle bundle2 = null;
        try {
            bundle = (android.os.Bundle) m142014x6c2fab7("getSnsInfoMM", str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AdLandingPagesProxy", e17, "", new java.lang.Object[0]);
        }
        if (bundle == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return null;
        }
        bundle2 = bundle;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        c17933xe8d1b226.m70437x9c96ff02(bundle2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return c17933xe8d1b226;
    }

    @k55.m
    /* renamed from: getSnsInfoMM */
    public android.os.Bundle m69881x83291bb0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(str);
        if (b17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return null;
        }
        android.os.Bundle m70477xb128fdc = b17.m70477xb128fdc();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return m70477xb128fdc;
    }

    /* renamed from: getSnsStatExtBySnsId */
    public java.lang.String m69882x6a7c2991(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String str = (java.lang.String) m142014x6c2fab7("getSnsStatExtBySnsIdMM", java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @k55.m
    /* renamed from: getSnsStatExtBySnsIdMM */
    public java.lang.String m69883xbc1812f1(long j17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsStatExtBySnsIdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(j17);
        if (y07 != null) {
            str = i64.q0.d(y07.m70311x485d7());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsStatExtBySnsIdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    /* renamed from: getSnsTraceid */
    public java.lang.String m69884x2e66bc7e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsTraceid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String str2 = (java.lang.String) m142014x6c2fab7("getSnsTraceidMM", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsTraceid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    @k55.m
    /* renamed from: getSnsTraceidMM */
    public java.lang.String m69885x2fa99e9e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsTraceidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(str);
        if (b17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsTraceidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
        java.lang.String m70372xfe2dfcea = b17.m70372xfe2dfcea();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsTraceidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return m70372xfe2dfcea;
    }

    /* renamed from: getSnsUxInfo */
    public java.lang.String m69886x9822fed3(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsUxInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String str2 = (java.lang.String) m142014x6c2fab7("getSnsUxInfoMM", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsUxInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    @k55.m
    /* renamed from: getSnsUxInfoMM */
    public java.lang.String m69887x1b5e9fb3(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsUxInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(str);
        if (b17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsUxInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
        java.lang.String m70375x338a8cc7 = b17.m70375x338a8cc7();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsUxInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return m70375x338a8cc7;
    }

    /* renamed from: getSyncServerTimeSecond */
    public int m69888xb09a0e75() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSyncServerTimeSecond", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("getSyncServerTimeSecondMM", new java.lang.Object[0]);
        if (m142014x6c2fab7 instanceof java.lang.Integer) {
            int intValue = ((java.lang.Integer) m142014x6c2fab7).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSyncServerTimeSecond", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return intValue;
        }
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSyncServerTimeSecond", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return currentTimeMillis;
    }

    @k55.m
    /* renamed from: getSyncServerTimeSecondMM */
    public int m69889xf2504ed5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSyncServerTimeSecondMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            int e17 = c01.id.e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSyncServerTimeSecondMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return e17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "getSyncServerTimeSecondMM, exp=" + th6.toString());
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSyncServerTimeSecondMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return currentTimeMillis;
        }
    }

    /* renamed from: getTaskProgress */
    public int m69890xc5e09948(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTaskProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("getTaskProgressMM", str);
        int intValue = m142014x6c2fab7 == null ? -1 : ((java.lang.Integer) m142014x6c2fab7).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTaskProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return intValue;
    }

    @k55.m
    /* renamed from: getTaskProgressMM */
    public int m69891xd01f70e8(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTaskProgressMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int i17 = za4.k.g().i(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTaskProgressMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return i17;
    }

    /* renamed from: getTwistAdCard */
    public long m69892xc6b282a4(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTwistAdCard", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("getTwistAdCardMM", java.lang.Long.valueOf(currentTimeMillis), str, str2, java.lang.Integer.valueOf(i17), str3, str4, str5);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTwistAdCard", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return currentTimeMillis;
    }

    @k55.m
    /* renamed from: getTwistAdCardMM */
    public void m69893xe41c7344(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTwistAdCardMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.f fVar = new ib4.f(str, str2, i17, str3, str4, str5);
        ((java.util.HashMap) this.f245569g).put(fVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f354821b.g(fVar);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(4729, this.f245572m);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTwistAdCardMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: getTwistAdCardStatus */
    public void m69894xdaf9b3b6(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTwistAdCardStatus", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("getTwistAdCardStatusMM", java.lang.Long.valueOf(currentTimeMillis), str, java.lang.Integer.valueOf(i17), str2, str3, str4, java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTwistAdCardStatus", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: getTwistAdCardStatusMM */
    public void m69895x35ba7d6(long j17, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTwistAdCardStatusMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.g gVar = new ib4.g(str, i17, str2, str3, str4, i18);
        ((java.util.HashMap) this.f245569g).put(gVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f354821b.g(gVar);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(4689, this.f245572m);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTwistAdCardStatusMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: getUin */
    public java.lang.String m69896xb5887524() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUin", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("getUinMM", new java.lang.Object[0]);
        java.lang.String str = m142014x6c2fab7 == null ? "" : (java.lang.String) m142014x6c2fab7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUin", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @k55.m
    /* renamed from: getUinMM */
    public java.lang.String m69897x753fc5c4() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUinMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String j17 = gm0.j1.b().j();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUinMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return j17;
    }

    /* renamed from: installApp */
    public boolean m69898x35ab3286(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("installApp", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("installAppMM", str, str2, str3, str4, java.lang.Integer.valueOf(i17), str5);
        boolean booleanValue = m142014x6c2fab7 == null ? false : ((java.lang.Boolean) m142014x6c2fab7).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("installApp", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    /* renamed from: installAppMM */
    public boolean m69899x77a8b2a6(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("installAppMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean j17 = za4.k.g().j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, str2, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o(this, str, str2, false, 1, i17), str5);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("installAppMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return j17;
    }

    @k55.l
    /* renamed from: isApkExist */
    public boolean m69900xc5e9985(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isApkExist", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("isApkExistMM", str);
        boolean booleanValue = m142014x6c2fab7 == null ? false : ((java.lang.Boolean) m142014x6c2fab7).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isApkExist", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    /* renamed from: isApkExistMM */
    public boolean m69901x6f1e55e5(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isApkExistMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean k17 = za4.k.g().k(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isApkExistMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return k17;
    }

    /* renamed from: isAutoAdDownload */
    public int m69902x939598a4() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("isAutoAdDownloadMM", new java.lang.Object[0]);
        int intValue = m142014x6c2fab7 != null ? ((java.lang.Integer) m142014x6c2fab7).intValue() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return intValue;
    }

    @k55.m
    /* renamed from: isAutoAdDownloadMM */
    public int m69903x4920944() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAutoAdDownloadMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
        hj6.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        int v17 = hj6.v(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAutoAdDownloadMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return v17;
    }

    /* renamed from: isBrandAdded */
    public boolean m69904xd1a8be83(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isBrandAdded", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("selectBrandAdd", str);
        if (!(m142014x6c2fab7 instanceof java.lang.Boolean)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isBrandAdded", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return false;
        }
        boolean booleanValue = ((java.lang.Boolean) m142014x6c2fab7).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isBrandAdded", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    /* renamed from: isConnected */
    public boolean m69905x23b734ff() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isConnected", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        k55.k kVar = this.f245570h;
        boolean c17 = kVar == null ? false : kVar.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isConnected", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return c17;
    }

    /* renamed from: isDownloading */
    public boolean m69906x63c43ed0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDownloading", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("isDownloadingMM", str);
        boolean booleanValue = m142014x6c2fab7 == null ? false : ((java.lang.Boolean) m142014x6c2fab7).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDownloading", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (r6.f178496f == 1) goto L8;
     */
    @k55.m
    /* renamed from: isDownloadingMM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m69907x83afd470(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "isDownloadingMM"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            za4.k r2 = za4.k.g()
            r2.getClass()
            java.lang.String r2 = "isDownloading"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            java.lang.Class<vz.v1> r4 = vz.v1.class
            i95.m r4 = i95.n0.c(r4)
            vz.v1 r4 = (vz.v1) r4
            uz.v1 r4 = (uz.v1) r4
            r4.getClass()
            com.tencent.mm.plugin.downloader.model.r0 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i()
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo r6 = r4.q(r6)
            if (r6 == 0) goto L34
            int r6 = r6.f178496f
            r4 = 1
            if (r6 != r4) goto L34
            goto L35
        L34:
            r4 = 0
        L35:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69907x83afd470(java.lang.String):boolean");
    }

    /* renamed from: isFreeSimCard */
    public boolean m69908x2290b4f1() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFreeSimCard", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("isFreeSimCardMM", new java.lang.Object[0]);
        if (!(m142014x6c2fab7 instanceof java.lang.Boolean)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFreeSimCard", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return false;
        }
        boolean booleanValue = ((java.lang.Boolean) m142014x6c2fab7).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFreeSimCard", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    /* renamed from: isFreeSimCardMM */
    public boolean m69909xc1374651() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFreeSimCardMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int Bi = ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Bi();
        boolean z17 = Bi == 3 || Bi == 4 || Bi == 5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "isFreeSimCard, simType=" + Bi + ", isFree=" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFreeSimCardMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z17;
    }

    /* renamed from: isFriend */
    public java.lang.String m69910xdcb2fc68(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFriend", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("isFriendMM", str);
        if (!(m142014x6c2fab7 instanceof java.lang.String)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFriend", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
        java.lang.String str2 = (java.lang.String) m142014x6c2fab7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFriend", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    @k55.m
    /* renamed from: isFriendMM */
    public java.lang.String m69911x7be58c08(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFriendMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            java.lang.String Di = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).Di(str, 2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "isFriendMM, hashName=" + str + ", userName=" + Di);
            if (!android.text.TextUtils.isEmpty(Di)) {
                str = Di;
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                gm0.j1.i();
                com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                if (Bi != null) {
                    boolean h17 = Bi.h(str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "userName=" + str + ", isFriend=" + h17);
                    if (h17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFriendMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                        return str;
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "isFriendMM exp=" + android.util.Log.getStackTraceString(th6));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFriendMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return "";
    }

    /* renamed from: isPaused */
    public boolean m69912xecd98af8(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPaused", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("isPausedMM", str);
        boolean booleanValue = m142014x6c2fab7 == null ? false : ((java.lang.Boolean) m142014x6c2fab7).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPaused", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    /* renamed from: isPausedMM */
    public boolean m69913x1ca2b698(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPausedMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        za4.k.g().getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPaused", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(str);
        boolean z17 = q17 != null && q17.f178496f == 2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPaused", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPausedMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z17;
    }

    /* renamed from: isPkgInstalled */
    public boolean m69914x2ea7dd58(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPkgInstalled", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("isPkgInstalledMM", str);
        boolean booleanValue = m142014x6c2fab7 == null ? false : ((java.lang.Boolean) m142014x6c2fab7).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPkgInstalled", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    /* renamed from: isPkgInstalledMM */
    public boolean m69915x2425f0f8(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPkgInstalledMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean m17 = za4.k.g().m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPkgInstalledMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return m17;
    }

    /* renamed from: isRecExpAd */
    public boolean m69916x9ec757ba(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isRecExpAd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("isRecExpAdMM", str);
        boolean booleanValue = m142014x6c2fab7 == null ? false : ((java.lang.Boolean) m142014x6c2fab7).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRecExpAd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    /* renamed from: isRecExpAdMM */
    public boolean m69917xa505ada(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isRecExpAdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(str);
        if (b17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRecExpAdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return false;
        }
        boolean m70406x9ec757ba = b17.m70406x9ec757ba();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRecExpAdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return m70406x9ec757ba;
    }

    /* renamed from: isVideoDataAvailable */
    public boolean m69918x9b94c84e(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isVideoDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("isVideoDataAvailableMM", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        boolean booleanValue = m142014x6c2fab7 == null ? false : ((java.lang.Boolean) m142014x6c2fab7).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVideoDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    /* renamed from: isVideoDataAvailableMM */
    public boolean m69919x983f66e(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isVideoDataAvailableMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean o17 = t21.o2.Di().o(str, i17, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "is video data avaiable %s %d %d %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(o17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVideoDataAvailableMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return o17;
    }

    /* renamed from: isWeAppAppendClickTime */
    public boolean m69920x262c9d2(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWeAppAppendClickTime", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean z17 = false;
        try {
            java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("isWeAppAppendClickTimeMM", str, java.lang.Integer.valueOf(i17));
            if (m142014x6c2fab7 instanceof java.lang.Boolean) {
                if (((java.lang.Boolean) m142014x6c2fab7).booleanValue()) {
                    z17 = true;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWeAppAppendClickTime", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return z17;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "isWeAppAppendClickTime remote call has an exception!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWeAppAppendClickTime", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return false;
        }
    }

    @k55.m
    /* renamed from: isWeAppAppendClickTimeMM */
    public boolean m69921xf4d7a6f2(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWeAppAppendClickTimeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean z17 = false;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(str);
            if (b17 != null) {
                z17 = (i17 == 16 ? b17.m70356x450e1efa() : b17.m70346x10413e67()).f38087x22383189;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWeAppAppendClickTimeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return z17;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "isWeAppAppendClickTimeMM call has an exception");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWeAppAppendClickTimeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return false;
        }
    }

    public final android.content.SharedPreferences j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSP", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + "_comm_preferences", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSP", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return sharedPreferences;
    }

    /* renamed from: jumpToTextStatus */
    public void m69922xf70e6ba8(f54.c0 c0Var, w64.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToTextStatus", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        m142014x6c2fab7("jumpToTextStatusMM", c0Var, oVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToTextStatus", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: jumpToTextStatusMM */
    public void m69923x6d222b48(f54.c0 c0Var, w64.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToTextStatusMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            w64.t.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, c0Var, oVar);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "jumpToTextStatusMM, exp is " + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToTextStatusMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: launchBackApp */
    public void m69924x6621f487(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("launchBackApp", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        m142014x6c2fab7("launchBackAppMM", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("launchBackApp", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: launchBackAppMM */
    public void m69925x6576f867(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("launchBackAppMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai("nativeOpenAdCanvas", "", str, 0, "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("launchBackAppMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: notifyFinderCnyEggCardResult */
    public void m69926x730fdd53(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyFinderCnyEggCardResult", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "notifyFinderCnyEggCardResult, pageId=" + str + ", cardId=" + str2);
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyFinderCnyEggCardResult", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        } else {
            m142014x6c2fab7("notifyFinderCnyEggCardResultMM", str, str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyFinderCnyEggCardResult", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        }
    }

    @k55.m
    /* renamed from: notifyFinderCnyEggCardResultMM */
    public void m69927xee8dde33(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyFinderCnyEggCardResultMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "notifyFinderCnyEggCardResultMM, pageId=" + str + ", cardId=" + str2);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5452xdae2de4d c5452xdae2de4d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5452xdae2de4d();
        am.pa paVar = c5452xdae2de4d.f135792g;
        paVar.getClass();
        paVar.getClass();
        paVar.getClass();
        c5452xdae2de4d.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyFinderCnyEggCardResultMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: notifyFinderVideoPlayStateToChange */
    public void m69928x763f0f5c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyFinderVideoPlayStateToChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "notifyFinderVideoPlayStateToChange tools, shouldPlay=" + z17);
        m142014x6c2fab7("notifyFinderVideoPlayStateToChangeMM", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyFinderVideoPlayStateToChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: notifyFinderVideoPlayStateToChangeMM */
    public void m69929xe2b8b1fc(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyFinderVideoPlayStateToChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Qk(z17, 0, false);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "notifyFinderVideoPlayStateToChangeMM, shouldPlay=" + z17 + ", exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyFinderVideoPlayStateToChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onAdChannelEnd */
    public void m69930x8ca3b4da(long j17, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdChannelEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdChannelEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: onAdLandingPageClick */
    public void m69931x8bf45e64(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdLandingPageClick", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.System.currentTimeMillis();
        m142014x6c2fab7("onAdLandingPageClickMM", str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdLandingPageClick", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: onAdLandingPageClickMM */
    public void m69932x60565f04(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdLandingPageClickMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.i iVar = new ib4.i(str, str2);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(iVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "NetSceneAdLadingPageClick, adChannelCgiReport, main, channel=" + str + ", content=" + str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdLandingPageClickMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onAdNativeAntiAbuse */
    public void m69933x66929a6b(long j17, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdNativeAntiAbuse", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdNativeAntiAbuse", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onAdUpdateQrUrlEnd */
    public void m69934x3c919558(long j17, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdUpdateQrUrlEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdUpdateQrUrlEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onAddBrandSceneEnd */
    public void m69935x8c160e34(long j17, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAddBrandSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAddBrandSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onBulletCommentEvent */
    public void m69936xd364addc(long j17, long j18, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBulletCommentEvent", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy.BulletCommentEvent", "onBulletCommentEvent, feedId=" + j18 + ", isSucc=" + z17 + ", comment=" + str + ", id=" + j17 + ", proxy.hash=" + hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("finderFeedId", j18);
                jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37641x4a9d0f2f, str);
                jSONObject.put("isSuccess", z17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "onBulletCommentEvent, exp=" + e17);
            }
            tVar.a(jSONObject);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy.BulletCommentEvent", "onBulletCommentEvent, callback==null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBulletCommentEvent", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @Override // k55.b, k55.e
    /* renamed from: onCallback */
    public void mo66824x9ad64344(java.lang.String str, android.os.Bundle bundle, boolean z17) {
        java.lang.reflect.Method method;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            java.lang.reflect.Method[] methods = getClass().getMethods();
            int length = methods.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    method = null;
                    break;
                }
                method = methods[i17];
                if (method.getName().equalsIgnoreCase(str)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (method != null) {
                if (method.isAnnotationPresent(z17 ? k55.l.class : k55.m.class)) {
                    java.lang.Object invoke = method.invoke(this, m142015xfb7d3953(bundle));
                    if (method.getReturnType() != java.lang.Void.TYPE) {
                        if (invoke instanceof android.os.Parcelable) {
                            bundle.putParcelable("result_key", (android.os.Parcelable) invoke);
                        } else {
                            bundle.putSerializable("result_key", (java.io.Serializable) invoke);
                        }
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onCdnVideoDataAvailable */
    public void m69937x561793f2(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCdnVideoDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "cdn video data available %s %d %d", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        java.util.Map map = this.f245576q;
        if (((java.util.HashMap) map).containsKey(str)) {
            ((dn.n) ((java.util.HashMap) map).get(str)).mo65706x9bb59ea0(str, j17, j18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCdnVideoDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onCdnVideoFinish */
    public void m69938x8bdde640(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCdnVideoFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "cdn video finish %s, %d", str, java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("sns_ad_download_resource_preferences", 0).edit().putBoolean(str, true).commit();
        }
        java.util.Map map = this.f245576q;
        if (((java.util.HashMap) map).containsKey(str)) {
            ((dn.n) ((java.util.HashMap) map).remove(str)).g(str, i17, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCdnVideoFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onCdnVideoMoovReady */
    public void m69939x3a17d74d(java.lang.String str, long j17, long j18, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCdnVideoMoovReady", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "cdn video moov ready %s %d %d", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        java.util.Map map = this.f245576q;
        if (((java.util.HashMap) map).containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo();
            videoInfo.f18114x9330627b = str2;
            ((dn.n) ((java.util.HashMap) map).get(str)).mo65708xe7d268fb(str, j17, j18, videoInfo);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCdnVideoMoovReady", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onCdnVideoProgress */
    public void m69940xf879649a(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCdnVideoProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "cdn video progress %s %d %d", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        java.util.Map map = this.f245576q;
        if (((java.util.HashMap) map).containsKey(str)) {
            ((dn.n) ((java.util.HashMap) map).get(str)).f(str, j17, j18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCdnVideoProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onDynamicUpdateEnd */
    public void m69941x88bf81d2(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDynamicUpdateEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            tVar.a(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDynamicUpdateEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onFavOfficialItemEnd */
    public void m69942xa9dd2b01(long j17, java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFavOfficialItemEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).remove(java.lang.Long.valueOf(j17));
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "FavOfficialItem succeed, item_buff[%s]", str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "FavOfficialItem fail, errrType[%d], errCode[%d], item_buff[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        }
        if (tVar != null) {
            tVar.b(i17, i18, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFavOfficialItemEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onFetchQRCodeInfo */
    public void m69943xb8103bd7(long j17, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFetchQRCodeInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFetchQRCodeInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onGeoLocation */
    public void m69944x24623ac7(long j17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGeoLocation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).remove(java.lang.Long.valueOf(j17));
            if (tVar != null) {
                tVar.a(obj);
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "onGeoLocation catch one exception");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGeoLocation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onGetAdCanvasXmlFromNet */
    public void m69945x8411548e(long j17, boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetAdCanvasXmlFromNet", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.a(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetAdCanvasXmlFromNet", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onGetBtnAdFinderContact */
    public void m69946x61e7ad12(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetBtnAdFinderContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.a(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetBtnAdFinderContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onGetBtnPersonalWxUserName */
    public void m69947xfcf1241c(long j17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetBtnPersonalWxUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).get(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(dm.i4.f66875xa013b0d5, str);
                jSONObject.put("aliasname", str2);
                tVar.a(jSONObject.toString());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "onGetBtnPersonalWxUserName, exp=" + e17.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetBtnPersonalWxUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onGetHbCoverStateScene */
    public void m69948x5f02c901(long j17, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetHbCoverStateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetHbCoverStateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onGetOpenSdkAppInfo */
    public void m69949x864da796(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetOpenSdkAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "onGetOpenSdkAppInfo");
            tVar.a(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetOpenSdkAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onGetSmartPhoneScene */
    public void m69950xf7532c70(long j17, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetSmartPhoneScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetSmartPhoneScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: onHalfScreenAnimationChange */
    public void m69951xe46712b6(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onHalfScreenAnimationChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "onHalfScreenAnimationChange tools, isOpen=" + z17 + ", isAnimBegin=" + z18);
        m142014x6c2fab7("onHalfScreenAnimationChangeMM", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHalfScreenAnimationChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: onHalfScreenAnimationChangeMM */
    public void m69952x66ed46d6(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onHalfScreenAnimationChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        n54.i.b(z17, z18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHalfScreenAnimationChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: onHalfScreenHeightChange */
    public void m69953x3dea1895(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onHalfScreenHeightChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        m142014x6c2fab7("onHalfScreenHeightChangeMM", java.lang.Float.valueOf(f17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHalfScreenHeightChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: onHalfScreenHeightChangeMM */
    public void m69954x6bc650f5(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onHalfScreenHeightChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        n54.i.c(f17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHalfScreenHeightChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onImgDownloadCallback */
    public void m69955x67709271(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onImgDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "onImgDownloadCallback, id=" + str + ", isOk=" + z17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImgDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        synchronized (this.f245575p) {
            try {
                java.util.List list = (java.util.List) ((java.util.HashMap) this.f245575p).remove(str);
                if (list == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImgDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                    return;
                }
                for (int i17 = 0; i17 < list.size(); i17++) {
                    fe0.o3 o3Var = (fe0.o3) list.get(i17);
                    if (o3Var != null) {
                        if (z17) {
                            o3Var.b();
                        } else {
                            o3Var.a();
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImgDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImgDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                throw th6;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x024f  */
    @k55.l
    /* renamed from: onRspCallbackCommon */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m69956x1d9acaa0(long r25, int r27, int r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69956x1d9acaa0(long, int, int, java.lang.Object):void");
    }

    @k55.l
    /* renamed from: onSearchContact */
    public void m69957xba3e0db9(long j17, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSearchContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSearchContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onSendAppointmentReq */
    public void m69958x34ceca66(long j17, int i17, int i18, int i19, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSendAppointmentReq", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("status", str);
                jSONObject.put("opType", i19);
                tVar.b(i17, i18, jSONObject.toString());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "onSendAppointmentReq, exp=" + e17.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSendAppointmentReq", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: onSightDownloadCallback */
    public void m69959xd5427c0b(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSightDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "onSightDownloadCallback, id=" + str + ", isOk=" + z17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSightDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        synchronized (this.f245575p) {
            try {
                java.util.List list = (java.util.List) ((java.util.HashMap) this.f245575p).remove(str);
                if (list == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSightDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                    return;
                }
                for (int i17 = 0; i17 < list.size(); i17++) {
                    fe0.o3 o3Var = (fe0.o3) list.get(i17);
                    if (o3Var != null) {
                        if (z17) {
                            o3Var.b();
                        } else {
                            o3Var.a();
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSightDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSightDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                throw th6;
            }
        }
    }

    @k55.l
    /* renamed from: onUpdateUxInfo */
    public void m69960x40c71399(long j17, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUpdateUxInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t) ((java.util.HashMap) this.f245568f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUpdateUxInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: openForAd */
    public java.lang.String m69961x5ac8cea2(long j17, int i17, int i18, int i19, int i27, java.lang.String str, java.lang.String str2, za4.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openForAd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("openForAdMM", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str, str2, aVar);
        if (!(m142014x6c2fab7 instanceof java.lang.String)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openForAd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
        java.lang.String str3 = (java.lang.String) m142014x6c2fab7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openForAd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str3;
    }

    @k55.m
    /* renamed from: openForAdMM */
    public java.lang.String m69962xcbcfb7c2(long j17, int i17, int i18, int i19, int i27, java.lang.String str, java.lang.String str2, za4.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openForAdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String c17 = za4.s1.b().c(j17, i17, i18, i19, i27, str, str2, aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openForAdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return c17;
    }

    /* renamed from: pauseTask */
    public boolean m69963x316fe49b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pauseTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("pauseTaskMM", str);
        boolean booleanValue = m142014x6c2fab7 == null ? false : ((java.lang.Boolean) m142014x6c2fab7).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pauseTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    /* renamed from: pauseTaskMM */
    public boolean m69964x9509337b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pauseTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean n17 = za4.k.g().n(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pauseTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return n17;
    }

    @k55.l
    /* renamed from: paused */
    public void m69965xc4ac992e(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("paused", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.Iterator it = ((java.util.ArrayList) this.f245573n.get(java.lang.Long.valueOf(j17))).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n) it.next();
            if (nVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("paused", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.s4 s4Var = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z3) nVar).f247397a;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4.V(s4Var.f247018r).V1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4.U(s4Var.f247018r).l(7);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("paused", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("paused", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: playTimelineBackAnimation */
    public void m69966x311364c8(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playTimelineBackAnimation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), null);
        m142014x6c2fab7("playTimelineBackAnimationMM", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playTimelineBackAnimation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: playTimelineBackAnimationMM */
    public void m69967x39cd5c68(long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playTimelineBackAnimationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6164xa16f40ad c6164xa16f40ad = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6164xa16f40ad();
        c6164xa16f40ad.f136424g.f89861a = j18;
        c6164xa16f40ad.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playTimelineBackAnimationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: playTimelineClickAnimation */
    public void m69968xe521e1d1(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playTimelineClickAnimation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), null);
        m142014x6c2fab7("playTimelineClickAnimationMM", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playTimelineClickAnimation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: playTimelineClickAnimationMM */
    public void m69969x2430bb31(long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playTimelineClickAnimationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6165xae6520f6 c6165xae6520f6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6165xae6520f6();
        c6165xae6520f6.f136425g.f89941a = j18;
        c6165xae6520f6.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playTimelineClickAnimationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: postBulletComment */
    public void m69970xdcf6763d(long j17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("postBulletComment", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy.BulletCommentEvent", "postBulletComment, feedId=" + j17 + ", comment=" + str + ", proxy.hash=" + hashCode());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("postBulletCommentMM", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postBulletComment", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: postBulletCommentMM */
    public void m69971x7931e49d(long j17, long j18, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("postBulletCommentMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy.BulletCommentEvent", "postBulletCommentMM, feedId=" + j18 + ", comment=" + str + ", id=" + j17 + ", proxy.hash=" + hashCode());
        new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.BulletCommentEventListener(j17, j18, str, 15000).mo48813x58998cd();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5453x48da22f3 c5453x48da22f3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5453x48da22f3();
        am.qa qaVar = c5453x48da22f3.f135793g;
        qaVar.f89233a = 100;
        qaVar.f89235c = j18;
        qaVar.f89234b = str;
        c5453x48da22f3.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("postBulletCommentMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: prefetchH5Url */
    public void m69972x958521ab(java.lang.String str, java.lang.String[] strArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prefetchH5Url", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            m142014x6c2fab7("prefetchH5UrlMM", str, strArr);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "prefetchH5Url remote call has an exception!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prefetchH5Url", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: prefetchH5UrlMM */
    public void m69973x48c36c8b(java.lang.String str, java.lang.String[] strArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prefetchH5UrlMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (!android.text.TextUtils.isEmpty(str) && !a84.b0.d(strArr)) {
            try {
                e44.a aVar = e44.a.f330899b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("instance", "com.tencent.mm.plugin.sns.ad.h5.H5PrefetchManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("instance", "com.tencent.mm.plugin.sns.ad.h5.H5PrefetchManager");
                e44.a.f330899b.a(str, strArr);
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "prefetchH5UrlMM call has an exception!");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prefetchH5UrlMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: preloadFinderFeeds */
    public void m69974xfa36d846(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadFinderFeeds", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            m142014x6c2fab7("preloadFinderFeedsMM", str, java.lang.Integer.valueOf(i17), str2);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "preloadFinderFeeds remote call has an exception!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadFinderFeeds", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: preloadFinderFeedsMM */
    public void m69975x47e1e866(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadFinderFeedsMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(str);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "preloadFinderFeeds call has an exception!");
        }
        if (b17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadFinderFeedsMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70356x450e1efa = i17 == 16 ? b17.m70356x450e1efa() : b17.m70346x10413e67();
        if (m70356x450e1efa != null && m70356x450e1efa.f38099x947561cd) {
            l44.a5.h(str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadFinderFeedsMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: progress */
    public void m69976xc454c22d(long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("progress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.Iterator it = ((java.util.ArrayList) this.f245573n.get(java.lang.Long.valueOf(j17))).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n) it.next();
            if (nVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z3 z3Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z3) nVar;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("progress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
                if (i17 % 20 == 0) {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4.V(z3Var.f247397a.f247018r).V1;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.s4 U = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4.U(z3Var.f247397a.f247018r);
                k75.j jVar = U.f386380e;
                if (jVar != null) {
                    jVar.sendMessage(android.os.Message.obtain(U.f386380e, 1, i17, 0));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("progress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("progress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: publishEggCanvasEvent */
    public void m69977xd653e1cc(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publishEggCanvasEvent", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "publishEggCanvasEvent, eventType=" + i17 + ", pageId=" + str);
        m142014x6c2fab7("publishEggCanvasEventMM", java.lang.Integer.valueOf(i17), str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publishEggCanvasEvent", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: publishEggCanvasEventMM */
    public void m69978x90e2a86c(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publishEggCanvasEventMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "publishEggCanvasEventMM, eventType=" + i17 + ", pageId=" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publishEventMM", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.SnsAdEggCanvasEventHelper");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6032xa3513758 c6032xa3513758 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6032xa3513758();
        am.xu xuVar = c6032xa3513758.f136322g;
        xuVar.f89934a = i17;
        if (str == null) {
            str = "";
        }
        xuVar.f89935b = str;
        c6032xa3513758.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publishEventMM", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.SnsAdEggCanvasEventHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publishEggCanvasEventMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: queryIdByAppid */
    public long m69979xd383b362(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("queryIdByAppid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("queryIdByAppidMM", str);
        long longValue = m142014x6c2fab7 == null ? -1L : ((java.lang.Long) m142014x6c2fab7).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("queryIdByAppid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return longValue;
    }

    @k55.m
    /* renamed from: queryIdByAppidMM */
    public long m69980x1646c82(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("queryIdByAppidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long o17 = za4.k.g().o(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("queryIdByAppidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return o17;
    }

    /* renamed from: queryVideoMoov */
    public long[] m69981x494e763c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("queryVideoMoov", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "mediaId %s, path %s, url %s", str, str2, str3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, str2, str3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("queryVideoMoov", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return null;
        }
        long[] jArr = (long[]) m142014x6c2fab7("queryVideoMoovMM", str, str2, str3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("queryVideoMoov", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return jArr;
    }

    @k55.m
    /* renamed from: queryVideoMoovMM */
    public long[] m69982x2f89e0dc(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("queryVideoMoovMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest();
        c2CDownloadRequest.f17792xcd096f43 = str;
        c2CDownloadRequest.f17793xd428dad6 = 100;
        c2CDownloadRequest.url = str3;
        c2CDownloadRequest.m37861xfb0731c4(str2);
        long[] jArr = new long[2];
        if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37764x7493d10a(c2CDownloadRequest, jArr)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("queryVideoMoovMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return jArr;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("queryVideoMoovMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return null;
    }

    /* renamed from: reportOpenAppInfo */
    public void m69983x488cef1(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportOpenAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        m142014x6c2fab7("reportOpenAppInfoMM", java.lang.Integer.valueOf(i17), str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportOpenAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: reportOpenAppInfoMM */
    public void m69984x590e051(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportOpenAppInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        za4.k g17 = za4.k.g();
        g17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportOpenAppInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        g17.t(i17, str, str2, "", "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportOpenAppInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportOpenAppInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: requestAdCanvasXmlFromNet */
    public void m69985x3502c826(long j17, int i17, int i18, int i19, java.lang.String str, java.lang.String str2, za4.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestAdCanvasXmlFromNet", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("requestAdCanvasXmlFromNetMM", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, str2, aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestAdCanvasXmlFromNet", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: requestAdCanvasXmlFromNetMM */
    public void m69986xff716046(long j17, long j18, int i17, int i18, int i19, java.lang.String str, java.lang.String str2, za4.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestAdCanvasXmlFromNetMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            za4.s1.f(j18, i17, i18, i19, str, str2, aVar, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b(this, j18, j17), null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "doRequestDynamicCanvasXml, exp is " + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestAdCanvasXmlFromNetMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: requestVideoData */
    public void m69987xff4560f6(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestVideoData", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 32);
        m142014x6c2fab7("requestVideoDataMM", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestVideoData", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: requestVideoDataMM */
    public void m69988x43710516(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestVideoDataMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 33);
        t21.o2.Di().p(str, i17, i18, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestVideoDataMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: resumeTask */
    public boolean m69989xdecb9352(java.lang.String str, java.lang.String str2, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.j3 j3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumeTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("resumeTaskMM", str, str2, java.lang.Boolean.valueOf(z17), j3Var, java.lang.Integer.valueOf(i17));
        boolean booleanValue = m142014x6c2fab7 == null ? false : ((java.lang.Boolean) m142014x6c2fab7).booleanValue();
        if (booleanValue) {
            long m69979xd383b362 = m69979xd383b362(str);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f245573n;
            java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(java.lang.Long.valueOf(m69979xd383b362));
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                arrayList.add(nVar);
            } else if (!arrayList.contains(nVar)) {
                arrayList.add(nVar);
            }
            concurrentHashMap.put(java.lang.Long.valueOf(m69979xd383b362), arrayList);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    /* renamed from: resumeTaskMM */
    public boolean m69990x5a341072(java.lang.String str, java.lang.String str2, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.j3 j3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumeTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean v17 = za4.k.g().v(str, this.f245574o, str2, z17, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o(this, str, str2, z17, 2, i17), j3Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return v17;
    }

    @k55.l
    /* renamed from: resumed */
    public void m69991x416b3dd7(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumed", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.Iterator it = ((java.util.ArrayList) this.f245573n.get(java.lang.Long.valueOf(j17))).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n) it.next();
            if (nVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.s4 s4Var = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z3) nVar).f247397a;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4.V(s4Var.f247018r).V1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4.U(s4Var.f247018r).l(13);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumed", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: saveAdVoteInfo */
    public void m69992xb2e1e958(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveAdVoteInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        m142014x6c2fab7("saveAdVoteInfoMM", str, str2, str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveAdVoteInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: saveAdVoteInfoMM */
    public void m69993x820cfcf8(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveAdVoteInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.l(str, str2, str3, i17, i18, str4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveAdVoteInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: selectBrandAdd */
    public boolean m69994x373f10b6(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("selectBrandAdd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        boolean z17 = false;
        if (Bi == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectBrandAdd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(str, true);
        if (n17 != null && n17.r2()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectBrandAdd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z17;
    }

    /* renamed from: sendAppointmentReq */
    public void m69995xf8a91a27(java.lang.String str, long j17, int i17, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendAppointmentReq", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f245568f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        m142014x6c2fab7("sendAppointmentReqMM", java.lang.Long.valueOf(currentTimeMillis), str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendAppointmentReq", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: sendAppointmentReqMM */
    public void m69996x72cb3607(long j17, java.lang.String str, long j18, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendAppointmentReqMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        k64.o oVar = new k64.o(str, j18, i17, str2);
        ((java.util.HashMap) this.f245569g).put(oVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f354821b.g(oVar);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(5159, this.f245572m);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendAppointmentReqMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: setAdValue */
    public void m69997x6c093c4c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        try {
            m142014x6c2fab7("setAdValueMM", str, str2, str3);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "setAdValue exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: setAdValueMM */
    public java.lang.String m69998x8eab62ec(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdValueMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            p34.o.h(str, str2, str3);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "setAdValueMM exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdValueMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return "";
    }

    /* renamed from: setHalfScreenLandingPageShow */
    public void m69999x65e1aea2(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHalfScreenLandingPageShow", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "setHalfScreenLandingPageShow tools, isShow=" + z17);
        m142014x6c2fab7("setHalfScreenLandingPageShowMM", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHalfScreenLandingPageShow", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: setHalfScreenLandingPageShowMM */
    public void m70000x743097c2(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHalfScreenLandingPageShowMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        n54.i.d(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHalfScreenLandingPageShowMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: start */
    public void m70001x68ac462(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.Iterator it = ((java.util.ArrayList) this.f245573n.get(java.lang.Long.valueOf(j17))).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n) it.next();
            if (nVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4.V(((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z3) nVar).f247397a.f247018r).V1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: startDownload */
    public long m70002x5cae6f0a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n nVar, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.j3 j3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startDownload", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "startDownload, appId=" + str + ", pkg=" + str3 + ", aid=" + j3Var.f246811d + ", fileName=" + str6 + ", isGameApp=" + z18 + ", url=" + str5 + ", uxinfo=" + j3Var.f246813f);
        java.lang.Object m142014x6c2fab7 = m142014x6c2fab7("startDownloadMM", str, str2, str3, str4, str5, str6, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), j3Var, java.lang.Integer.valueOf(i17));
        long longValue = m142014x6c2fab7 == null ? -1L : ((java.lang.Long) m142014x6c2fab7).longValue();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f245573n;
        java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(java.lang.Long.valueOf(longValue));
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            arrayList.add(nVar);
        } else if (!arrayList.contains(nVar)) {
            arrayList.add(nVar);
        }
        concurrentHashMap.put(java.lang.Long.valueOf(longValue), arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startDownload", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return longValue;
    }

    @k55.m
    /* renamed from: startDownloadMM */
    public long m70003xeacede2a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.j3 j3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startDownloadMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long w17 = za4.k.g().w(str, str2, str3, str4, str5, str6, z17, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o(this, str, str3, z17, 2, i17), this.f245574o, z18, j3Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "startDownloadMM, id %d", java.lang.Long.valueOf(w17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startDownloadMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return w17;
    }

    /* renamed from: stopDownloadLandingPageVideo */
    public void m70004xccd159f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopDownloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.Map map = this.f245576q;
        if (((java.util.HashMap) map).containsKey(str)) {
            ((java.util.HashMap) map).remove(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "stop download video %s", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 34);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("sns_ad_download_resource_preferences", 0).edit().putBoolean(str, false).commit();
        }
        m142014x6c2fab7("stopDownloadLandingPageVideoMM", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopDownloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: stopDownloadLandingPageVideoMM */
    public void m70005xdde337f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopDownloadLandingPageVideoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().w(str, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopDownloadLandingPageVideoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: stopTask */
    public void m70006x6635e0a7(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n nVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long m69979xd383b362 = m69979xd383b362(str);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f245573n;
        java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(java.lang.Long.valueOf(m69979xd383b362));
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            arrayList.add(nVar);
        } else if (!arrayList.contains(nVar)) {
            arrayList.add(nVar);
        }
        concurrentHashMap.put(java.lang.Long.valueOf(m69979xd383b362), arrayList);
        m142014x6c2fab7("stopTaskMM", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: stopTaskMM */
    public void m70007xb0405c87(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        za4.k.g().x(str, this.f245574o);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: stopped */
    public void m70008x8faf91cd(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopped", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.Iterator it = ((java.util.ArrayList) this.f245573n.get(java.lang.Long.valueOf(j17))).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n) it.next();
            if (nVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z3 z3Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z3) nVar;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopped", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4.V(z3Var.f247397a.f247018r).V1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4.U(z3Var.f247397a.f247018r).l(14);
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y3(z3Var));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopped", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
            }
        }
        this.f245573n.remove(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopped", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    /* renamed from: succeed */
    public void m70009x90b53e42(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61558xbb80ca22, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f245573n;
        java.util.Iterator it = ((java.util.ArrayList) concurrentHashMap.get(java.lang.Long.valueOf(j17))).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n) it.next();
            if (nVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61558xbb80ca22, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.s4 s4Var = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z3) nVar).f247397a;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4.V(s4Var.f247018r).V1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4.U(s4Var.f247018r).l(9);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61558xbb80ca22, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
            }
        }
        concurrentHashMap.remove(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61558xbb80ca22, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: updateContact */
    public void m70010xdf8cbf17(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        m142014x6c2fab7("updateContactMM", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: updateContactMM */
    public void m70011x2f595ef7(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        if (Bi == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(str, true);
        n17.N2();
        n17.X1(str);
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l(this, n17, Bi));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    /* renamed from: writeDeferredDeepLink */
    public void m70012xe781e604(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("writeDeferredDeepLink", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        m142014x6c2fab7("writeDeferredDeepLinkMM", str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeDeferredDeepLink", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    /* renamed from: writeDeferredDeepLinkMM */
    public void m70013xea07ea4(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("writeDeferredDeepLinkMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        j().edit().putString(str, str2).commit();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeDeferredDeepLinkMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }
}
