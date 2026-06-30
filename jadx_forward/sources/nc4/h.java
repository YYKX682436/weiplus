package nc4;

/* loaded from: classes4.dex */
public final class h implements nc4.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f417681a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f417682b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f417683c;

    public h(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f417681a = context;
        this.f417682b = jz5.h.b(nc4.e.f417672d);
        this.f417683c = jz5.h.b(nc4.f.f417677d);
    }

    @Override // nc4.c
    public db5.h4 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        android.content.Context context = this.f417681a;
        db5.h4 h4Var = new db5.h4(context, 6, 0);
        h4Var.f309901i = i65.a.r(context, c().a() == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.btf : com.p314xaae8f345.mm.R.C30867xcad56011.btg);
        if (c().a() == 2) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_JUMP_FINDER_POST_EXPOSE_COUNT_INT_SYNC;
            java.lang.Object m17 = c17.m(u3Var, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(((java.lang.Integer) m17).intValue() + 1));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        return h4Var;
    }

    @Override // nc4.c
    public java.lang.Object b(yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        android.content.Intent intent = new android.content.Intent();
        int a17 = c().a();
        android.content.Context context = this.f417681a;
        if (a17 == 1) {
            intent.putExtra("key_finder_post_router", 6);
            intent.putExtra("key_finder_sns_post_type", 1);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).gk(context, intent);
        } else {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 5, 44, intent);
            intent.putExtra("key_form_sns", true);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f542005a.C(context, intent);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nc4.g(this));
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        return f0Var;
    }

    public final nc4.i c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderEntranceData", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        nc4.i iVar = (nc4.i) ((jz5.n) this.f417683c).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderEntranceData", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        return iVar;
    }

    @Override // nc4.c
    /* renamed from: onActivityResult */
    public void mo149389x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c7, code lost:
    
        if (r5 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e4, code lost:
    
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e2, code lost:
    
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).gl() != false) goto L26;
     */
    @Override // nc4.c
    /* renamed from: show */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo149390x35dafd() {
        /*
            r10 = this;
            java.lang.String r0 = "show"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            com.tencent.mm.sdk.platformtools.f9 r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MomentChannels
            boolean r2 = r2.h()
            r3 = 0
            if (r2 != 0) goto Le8
            nc4.i r2 = r10.c()
            int r2 = r2.a()
            r4 = 1
            if (r2 != r4) goto Lc9
            java.lang.String r2 = "checkFinderExposeCount"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r1)
            java.lang.String r5 = "getExposeMaxCountByFinderStatus"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r5, r1)
            java.lang.String r6 = "getCurFinderStatus"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r1)
            jz5.g r7 = r10.f417682b
            r8 = r7
            jz5.n r8 = (jz5.n) r8
            java.lang.Object r8 = r8.mo141623x754a37bb()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r1)
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData"
            if (r8 != 0) goto L53
            nc4.i r6 = r10.c()
            r6.getClass()
            java.lang.String r7 = "getFinderEntranceMaxCountNoUser"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r9)
            int r6 = r6.f417688b
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r9)
            goto L8a
        L53:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r1)
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.mo141623x754a37bb()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r1)
            if (r7 != r4) goto L79
            nc4.i r6 = r10.c()
            r6.getClass()
            java.lang.String r7 = "getFinderEntranceMaxCountNoFeed"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r9)
            int r6 = r6.f417689c
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r9)
            goto L8a
        L79:
            nc4.i r6 = r10.c()
            r6.getClass()
            java.lang.String r7 = "getFinderEntranceMaxCountNormal"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r9)
            int r6 = r6.f417690d
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r9)
        L8a:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r1)
            gm0.b0 r5 = gm0.j1.u()
            com.tencent.mm.storage.n3 r5 = r5.c()
            com.tencent.mm.storage.u3 r7 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_FINDER_EXPOSE_COUNT_INT_SYNC
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Object r5 = r5.m(r7, r8)
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Int"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r5, r8)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 < r6) goto Lb3
            r8 = -1
            if (r6 != r8) goto Lb1
            goto Lb3
        Lb1:
            r5 = r3
            goto Lc4
        Lb3:
            gm0.b0 r6 = gm0.j1.u()
            com.tencent.mm.storage.n3 r6 = r6.c()
            int r5 = r5 + r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.x(r7, r5)
            r5 = r4
        Lc4:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
            if (r5 != 0) goto Le4
        Lc9:
            nc4.i r2 = r10.c()
            int r2 = r2.a()
            r5 = 2
            if (r2 != r5) goto Le8
            java.lang.Class<zy2.b6> r2 = zy2.b6.class
            i95.m r2 = i95.n0.c(r2)
            zy2.b6 r2 = (zy2.b6) r2
            c61.l7 r2 = (c61.l7) r2
            boolean r2 = r2.gl()
            if (r2 == 0) goto Le8
        Le4:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r4
        Le8:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nc4.h.mo149390x35dafd():boolean");
    }

    @Override // nc4.c
    /* renamed from: type */
    public int mo149391x368f3a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        int h17 = nc4.d.f417659h.h();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        return h17;
    }
}
