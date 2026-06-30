package cq;

@j95.b
/* loaded from: classes2.dex */
public final class k extends i95.w {

    /* renamed from: n, reason: collision with root package name */
    public static final cq.e f302754n = new cq.e(null);

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f302755o;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 f302756d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c0(200);

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 f302757e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c0(200);

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 f302758f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c0(200);

    /* renamed from: g, reason: collision with root package name */
    public final dq.b f302759g = new dq.b();

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.c2 f302760h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.c2();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Integer f302761i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p674x2eefaa.p675xbac1c3cb.C10430xf371ba78 f302762m;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        f302755o = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Sf).mo141623x754a37bb()).r()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.data.dataservice.FinderDataService$beforeCleanCacheListener$1] */
    public k() {
        final gm0.b bVar = gm0.j1.b().f354778h;
        this.f302762m = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de>(bVar) { // from class: com.tencent.mm.data.dataservice.FinderDataService$beforeCleanCacheListener$1
            {
                this.f39173x3fe91575 = 1489935310;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de c5189xf98047de) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de event = c5189xf98047de;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if ((event.f135532g.f89122a & 32) == 0) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderDataService", "onBeforeCleanCache clear interaction easter egg");
                cq.k kVar = cq.k.this;
                kVar.f302759g.c(null);
                kVar.f302759g.b(null);
                return false;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r1.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 wi(cq.k r0, java.lang.String r1, int r2, int r3, java.lang.Object r4) {
        /*
            r3 = r3 & 2
            r4 = 0
            if (r3 == 0) goto L6
            r2 = r4
        L6:
            if (r1 == 0) goto L11
            r0.getClass()
            int r3 = r1.length()
            if (r3 != 0) goto L12
        L11:
            r4 = 1
        L12:
            if (r4 == 0) goto L15
            goto L24
        L15:
            com.tencent.mm.sdk.platformtools.c0 r3 = r0.f302757e
            java.lang.Object r1 = r3.b(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L24
            long r3 = r1.longValue()
            goto L26
        L24:
            r3 = 0
        L26:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.Ai(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cq.k.wi(cq.k, java.lang.String, int, int, java.lang.Object):com.tencent.mm.plugin.finder.storage.FinderItem");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 Ai(long j17, int i17) {
        cq.f fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(j17);
        if (h17 != null && i17 != 0 && f302755o) {
            java.lang.String str = i17 + '_' + pm0.v.u(h17.m59251x5db1b11());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 c0Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.c0) this.f302756d.b(java.lang.Integer.valueOf(i17));
            if (c0Var != null && (fVar = (cq.f) c0Var.b(str)) != null) {
                h17.getFeedObject().m76911x94207d5e(fVar.f302722c);
            }
        }
        return h17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 Bi() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
    }

    public final java.lang.String Di(int i17) {
        java.lang.String str = i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 7 ? i17 != 8 ? i17 != 10 ? "" : "network" : "cleaner" : com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100 : "preload" : "fans" : "feed" : "follow";
        if (str.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183667c + "page/";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183667c + "page/");
        sb6.append(str);
        sb6.append('/');
        return sb6.toString();
    }

    public final void Ni(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feed, int i17, int i18, long j17) {
        r45.zu0 zu0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        bu2.j.f106067a.n(feed, new bu2.h(i18, j17));
        r45.dm2 m76806xdef68064 = feed.getFeedObject().m76806xdef68064();
        if (m76806xdef68064 != null && (zu0Var = (r45.zu0) m76806xdef68064.m75936x14adae67(58)) != null) {
            Vi(feed.m59299x6bf53a6c(), zu0Var);
        }
        Ri(feed.getFeedObject(), i17);
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Fj(feed.getFeedObject(), i17);
    }

    public final void Ri(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feed, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        if (f302755o) {
            ((cq.f) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.c0) this.f302756d.c(java.lang.Integer.valueOf(i17), cq.j.f302750d)).c(i17 + '_' + pm0.v.u(feed.m76784x5db1b11()), new cq.i(feed, i17))).f302722c = feed.m76818x5d49e3ea();
        }
    }

    public final void Ui(java.util.List feeds, int i17, int i18, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feeds, "feeds");
        java.util.Iterator it = feeds.iterator();
        while (it.hasNext()) {
            Ni((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next(), i17, i18, j17);
        }
    }

    public final void Vi(java.lang.String username, r45.zu0 interactionData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interactionData, "interactionData");
        if (username.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderDataService", "update, username is empty");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 c0Var = this.f302758f;
        r45.zu0 zu0Var = (r45.zu0) c0Var.b(username);
        if (zu0Var == null || zu0Var.m75942xfb822ef2(3) < interactionData.m75942xfb822ef2(3)) {
            c0Var.d(username, interactionData);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        mo48813x58998cd();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        mo48814x2efc64();
    }
}
