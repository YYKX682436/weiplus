package ee5;

/* loaded from: classes9.dex */
public final class b3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.e3 f333369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333370e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(ee5.e3 e3Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f333369d = e3Var;
        this.f333370e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ee5.b3(this.f333369d, this.f333370e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ee5.b3 b3Var = (ee5.b3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        b3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        de5.a aVar2 = de5.a.f310929a;
        pf5.u uVar = pf5.u.f435469a;
        ee5.e3 e3Var = this.f333369d;
        int R6 = ((ee5.z) uVar.c(e3Var.m158354x19263085()).a(ee5.z.class)).R6();
        int P6 = ((ee5.z) uVar.c(e3Var.m158354x19263085()).a(ee5.z.class)).P6();
        java.lang.String query = this.f333370e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "report do search " + de5.a.f310931c + ", " + de5.a.f310934f + ", " + R6 + ", " + P6 + ' ' + query);
        aVar2.i(R6);
        de5.a.f310934f = query;
        de5.a.f310942n = P6;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        de5.a.f310936h = currentTimeMillis;
        de5.a.f310931c = java.lang.String.valueOf(currentTimeMillis);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSearchSessionId >> ");
        sb6.append(de5.a.f310931c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370 a17 = aVar2.a();
        a17.f141819f = 4L;
        a17.p(query);
        a17.k();
        ((ee5.a3) uVar.c(e3Var.m158354x19263085()).a(ee5.a3.class)).P6(8);
        ((ee5.q3) uVar.c(e3Var.m158354x19263085()).a(ee5.q3.class)).T6(0);
        ((ee5.z) uVar.c(e3Var.m158354x19263085()).a(ee5.z.class)).X6(query);
        ee5.q3 q3Var = (ee5.q3) uVar.c(e3Var.m158354x19263085()).a(ee5.q3.class);
        q3Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiTabViewUIC", "updateQuery");
        java.lang.Object obj2 = q3Var.f333542g.get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiAllResultFragment");
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21856x604a8fa) obj2).f284212r = true;
        q3Var.f333553u = 0;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = q3Var.f333552t;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = q3Var.f333554v;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        fn5.o0 o0Var = fn5.o0.f346276d;
        if (q3Var.f333550r) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = q3Var.f333547o;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(8);
            }
            android.widget.TextView textView = q3Var.f333546n;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        q3Var.f333556x = true;
        ee5.h0 h0Var = (ee5.h0) uVar.c(e3Var.m158354x19263085()).a(ee5.h0.class);
        h0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "onSearch: ".concat(query));
        h0Var.Q6();
        p3325xe03a0797.p3326xc267989b.r2 r2Var3 = h0Var.f333442u;
        if (r2Var3 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var3, null, 1, null);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = h0Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.search.multi.FTSChattingConvMultiTabUI");
        for (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c9 : ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.ActivityC21855xa077090f) m158354x19263085).mo80395x5316d740()) {
            if (abstractC22275x3ce1d8c9 instanceof ee5.t2) {
                ee5.t2 t2Var = (ee5.t2) abstractC22275x3ce1d8c9;
                ae5.n nVar = ae5.n.f85966e;
                t2Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t2Var.f333581d, "updateSearchState >> searchState " + nVar);
                t2Var.f333585h.mo7808x76db6cb1(nVar);
                p3325xe03a0797.p3326xc267989b.r2 r2Var4 = t2Var.f333588n;
                if (r2Var4 != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var4, null, 1, null);
                }
            }
        }
        h0Var.f333431g.mo523x53d8522f(ae5.n.f85966e);
        if (h0Var.f333429e != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(h0Var.f333429e);
        }
        java.util.List list = h0Var.f333433i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(list, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.fts.api.model.MatchInfo>");
        ((java.util.ArrayList) list).clear();
        h0Var.f333441t = false;
        h0Var.f333434m.clear();
        h0Var.f333435n.clear();
        h0Var.f333440s.clear();
        h0Var.f333439r.clear();
        ce5.d dVar = h0Var.f333444w;
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoadMoreImageDataModel", "reset");
        dVar.f122345a = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var5 = dVar.f122347c;
        if (r2Var5 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var5, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var6 = h0Var.f333445x;
        if (r2Var6 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var6, null, 1, null);
        }
        h0Var.f333446y = false;
        h0Var.f333447z = false;
        h0Var.A = false;
        h0Var.B = false;
        h0Var.C = false;
        h0Var.D = false;
        h0Var.G.clear();
        h0Var.H = 0L;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = h0Var.I;
        atomicBoolean.set(false);
        h0Var.f333427J = 0L;
        if (!h0Var.K) {
            h0Var.H = java.lang.System.currentTimeMillis();
            atomicBoolean.set(false);
            h0Var.f333427J = 0L;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = h0Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        ((ee5.q3) zVar.a(activity).a(ee5.q3.class)).getClass();
        h0Var.f333430f = query;
        p13.u uVar2 = new p13.u();
        uVar2.f432674c = query;
        uVar2.f432675d = h0Var.f333428d;
        uVar2.f432683l = r13.e.f450138d;
        uVar2.f432681j.add("create_talker_message\u200b");
        uVar2.f432684m = h0Var;
        uVar2.f432685n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        uVar2.f432673b = 3;
        h0Var.f333429e = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(3, uVar2);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = h0Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        if (((ee5.z) zVar.a(activity2).a(ee5.z.class)).f333638o) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = h0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
            if (((ee5.z) zVar.a(activity3).a(ee5.z.class)).f333637n) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "getDataFromFlow >> " + query + ", " + h0Var.f333428d + ", " + h0Var.f333443v);
                if (!(query.length() == 0)) {
                    h0Var.f333445x = p3325xe03a0797.p3326xc267989b.l.d(h0Var.m158345xefc66565(), null, null, new ee5.e0(h0Var, query, null), 3, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
