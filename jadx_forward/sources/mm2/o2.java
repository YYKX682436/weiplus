package mm2;

/* loaded from: classes3.dex */
public final class o2 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f410833f;

    /* renamed from: g, reason: collision with root package name */
    public int f410834g;

    /* renamed from: h, reason: collision with root package name */
    public r45.lz1 f410835h;

    /* renamed from: i, reason: collision with root package name */
    public int f410836i;

    /* renamed from: m, reason: collision with root package name */
    public dk2.p f410837m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f410838n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f410839o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f410840p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f410841q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f410833f = "LiveGamePostSlice@" + hashCode();
        this.f410835h = new r45.lz1();
        this.f410837m = new dk2.p();
    }

    public final void N6(r45.n73 gameUserInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gameUserInfo, "gameUserInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initFromGameUserInfo] = ");
        r45.z73 z73Var = (r45.z73) gameUserInfo.m75936x14adae67(5);
        sb6.append(z73Var != null ? pm0.b0.g(z73Var) : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f410833f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        r45.z73 z73Var2 = (r45.z73) gameUserInfo.m75936x14adae67(5);
        if (z73Var2 != null) {
            ((mm2.o2) m147920xbba4bfc0(mm2.o2.class)).f410834g = z73Var2.m75939xb282bd08(2);
            mm2.o2 o2Var = (mm2.o2) m147920xbba4bfc0(mm2.o2.class);
            r45.lz1 lz1Var = new r45.lz1();
            lz1Var.set(0, java.lang.Integer.valueOf(z73Var2.m75939xb282bd08(3)));
            lz1Var.set(1, java.lang.Integer.valueOf(z73Var2.m75939xb282bd08(4)));
            o2Var.f410835h = lz1Var;
            ((mm2.o2) m147920xbba4bfc0(mm2.o2.class)).f410836i = z73Var2.m75939xb282bd08(5);
            dk2.p pVar = ((mm2.o2) m147920xbba4bfc0(mm2.o2.class)).f410837m;
            r45.xl1 xl1Var = (r45.xl1) z73Var2.m75936x14adae67(6);
            pVar.l(xl1Var != null ? xl1Var.m75941xfb821914(1) : null);
            ((mm2.o2) m147920xbba4bfc0(mm2.o2.class)).O6(z73Var2.m75939xb282bd08(8) != 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[saveFuncSwitchFlag] flags = " + z73Var2.m75942xfb822ef2(9));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_GAME_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, java.lang.Long.valueOf(z73Var2.m75942xfb822ef2(9)));
            mm2.o2 o2Var2 = (mm2.o2) m147920xbba4bfc0(mm2.o2.class);
            r45.dc6 dc6Var = (r45.dc6) z73Var2.m75936x14adae67(12);
            o2Var2.f410841q = dc6Var != null ? dc6Var.m75933x41a8a7f2(2) : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[saveGameLiveGlobalFlag] flags = " + z73Var2.m75939xb282bd08(15));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_GAME_LIVE_GLOBAL_FLAG_INT_SYNC, java.lang.Integer.valueOf(z73Var2.m75939xb282bd08(15)));
            mm2.o2 o2Var3 = (mm2.o2) m147920xbba4bfc0(mm2.o2.class);
            r45.kz0 kz0Var = (r45.kz0) z73Var2.m75936x14adae67(10);
            o2Var3.f410839o = pm0.v.z(kz0Var != null ? kz0Var.m75939xb282bd08(1) : 0, 16);
            ((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).f410338f6.mo523x53d8522f(java.lang.Boolean.valueOf(z73Var2.m75933x41a8a7f2(13)));
            ((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).f410344g6 = (r45.yq1) z73Var2.m75936x14adae67(14);
            ((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).t9((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) z73Var2.m75936x14adae67(20));
            ((mm2.o2) m147920xbba4bfc0(mm2.o2.class)).f410840p = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) z73Var2.m75936x14adae67(19);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("gamelive creatorCenterEntrance:");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) z73Var2.m75936x14adae67(16);
            sb8.append(c19786x6a1e2862 != null ? java.lang.Integer.valueOf(c19786x6a1e2862.hashCode()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
            ((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).W2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) z73Var2.m75936x14adae67(18);
            ((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).X2 = z73Var2.m75933x41a8a7f2(17);
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("canShow3d: ");
            sb9.append(((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).X2);
            sb9.append(", data: ");
            sb9.append(((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).W2 != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb9.toString());
        }
    }

    public final void O6(boolean z17) {
        if (z17 != this.f410838n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f410833f, "bindShop:from " + this.f410838n + " to " + z17 + '!');
            if (z17) {
                ((mm2.f6) m147920xbba4bfc0(mm2.f6.class)).e7(((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).v7());
            }
        }
        this.f410838n = z17;
    }

    public final void P6(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        this.f410840p = c19786x6a1e2862;
    }

    public final void Q6(boolean z17) {
        this.f410841q = z17;
    }

    /* renamed from: clear */
    public final void m147993x5a5b64d() {
        this.f410834g = 0;
        this.f410835h = new r45.lz1();
        this.f410836i = 0;
        this.f410837m = new dk2.p();
        O6(false);
        this.f410839o = false;
        this.f410840p = null;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        m147993x5a5b64d();
    }
}
