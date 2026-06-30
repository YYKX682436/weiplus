package n34;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f416189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f416190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f416191f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416192g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f416193h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n34.p f416194i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f416195m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f416196n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i17, long j17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, n34.p pVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f416190e = i17;
        this.f416191f = j17;
        this.f416192g = str;
        this.f416193h = c17933xe8d1b226;
        this.f416194i = pVar;
        this.f416195m = u3Var;
        this.f416196n = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
        n34.l lVar = new n34.l(this.f416190e, this.f416191f, this.f416192g, this.f416193h, this.f416194i, this.f416195m, this.f416196n, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
        return lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
        java.lang.Object mo150x989b7ca4 = ((n34.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f416193h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f416189d;
        int i18 = this.f416190e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n6 n6Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n6.f246047a;
            this.f416189d = 1;
            a17 = n6Var.a(i18, this.f416191f, this);
            if (a17 == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2 && i17 != 3) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
                    throw illegalStateException;
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                jz5.f0 f0Var = jz5.f0.f384359a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
                return f0Var;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a17 = obj;
        }
        r45.ja6 ja6Var = (r45.ja6) a17;
        n34.p pVar = this.f416194i;
        java.lang.String str = this.f416192g;
        if (ja6Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommentDetailStarHelper", "change star success " + str + ", " + i18);
            try {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(c17933xe8d1b226.f68881x4c58c87d);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsObject");
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) mo11468x92b714fd;
                c19806x4c372b7.f38980x988ba8e = i18 == 1 ? 1 : 0;
                c17933xe8d1b226.f68881x4c58c87d = c19806x4c372b7.mo14344x5f01b1f6();
                pVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStarClickCallback", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
                n34.p2 p2Var = pVar.f416238f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarClickCallback", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
                if (p2Var != null) {
                    p2Var.a(i18);
                }
                oi0.e.f427124d.e(c19806x4c372b7);
            } catch (java.io.IOException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommentDetailStarHelper", "parse obj error");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.d(c17933xe8d1b226.m70367x7525eefd(), c17933xe8d1b226);
            pb4.e eVar = pb4.e.f434729a;
            if (i18 == 1) {
                pb4.e.i(eVar, c17933xe8d1b226, false, 2, null);
            } else {
                java.lang.String field_userName = c17933xe8d1b226.f68896xdde069b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_userName, "field_userName");
                pb4.e.b(eVar, field_userName, c17933xe8d1b226.f68891x29d1292e, false, 4, null);
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            n34.j jVar = new n34.j(this.f416195m, this.f416190e, this.f416194i, this.f416196n, this.f416193h, null);
            this.f416189d = 2;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, jVar, this) == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
                return aVar;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommentDetailStarHelper", "change star error " + str + ", " + i18);
            p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            n34.k kVar = new n34.k(this.f416195m, pVar, null);
            this.f416189d = 3;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var2, kVar, this) == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
                return aVar;
            }
        }
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1");
        return f0Var2;
    }
}
