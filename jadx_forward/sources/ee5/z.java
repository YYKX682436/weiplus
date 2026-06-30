package ee5;

/* loaded from: classes9.dex */
public final class z extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f333630d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197 f333631e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f333632f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f333633g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f333634h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f333635i;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f333636m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f333637n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f333638o;

    /* renamed from: p, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f333639p;

    /* renamed from: q, reason: collision with root package name */
    public aq.c f333640q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f333641r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f333632f = "";
        this.f333633g = "";
        this.f333635i = jz5.h.b(new ee5.p(activity));
        this.f333636m = Q6().f346257g;
        this.f333640q = aq.c.f94375d;
    }

    public final void O6() {
        this.f333637n = true;
        this.f333641r = true;
        aq.n nVar = aq.o.f94455c;
        if (nVar != null) {
            nVar.a(m158354x19263085());
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        int i17 = ((ee5.q3) pf5.z.f435481a.a(activity).a(ee5.q3.class)).f333548p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "onActivityResult >> currentTab: " + i17);
        if (i17 == 0 || i17 == 1 || i17 == 2) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ee5.j jVar = (ee5.j) pf5.z.f435481a.a(activity2).a(ee5.j.class);
            android.view.View view = jVar.f333463d;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC", "openFeatureFromMediaHistory", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC", "openFeatureFromMediaHistory", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = jVar.f333465f;
            if (view2 != null) {
                V6(view2);
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
        ((ee5.q3) pf5.z.f435481a.a(activity3).a(ee5.q3.class)).S6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity4 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity4, "activity");
        ee5.h0 h0Var = (ee5.h0) pf5.z.f435481a.a(activity4).a(ee5.h0.class);
        aq.c cVar = aq.c.f94376e;
        h0Var.U6(cVar);
        this.f333640q = cVar;
        U6();
    }

    public final int P6() {
        if (this.f333638o) {
            return this.f333637n ? 1 : 2;
        }
        return 3;
    }

    public final fn5.n0 Q6() {
        return (fn5.n0) this.f333635i.mo141623x754a37bb();
    }

    public final int R6() {
        return Q6().f346264q.size();
    }

    public final boolean S6() {
        bm5.t0 t0Var = bm5.t0.f104271a;
        boolean z17 = t0Var.a() && t0Var.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "getImageQueryEntrance >> " + z17);
        return z17;
    }

    public final boolean T6() {
        boolean z17 = (c01.z1.i() & 1) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryEntranceConfig", "getC2CImageQuerySettingState: " + z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "getImageQueryFeatureState > " + z17);
        return z17;
    }

    public final void U6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "initIdentifyObserver");
        pm0.v.X(new ee5.r(this));
    }

    public final void V6(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "initParentView");
        this.f333630d = parentView;
        com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197 c11098x3efa6197 = (com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197) parentView.findViewById(com.p314xaae8f345.mm.R.id.gfk);
        this.f333631e = c11098x3efa6197;
        aq.o.f94453a = true;
        if (c11098x3efa6197 != null) {
            c11098x3efa6197.setVisibility(0);
        }
        com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197 c11098x3efa61972 = this.f333631e;
        if (c11098x3efa61972 != null) {
            c11098x3efa61972.m47820xe9f5bdb7(u0.j.c(-1694448054, true, new ee5.v(this)));
        }
    }

    public final void W6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "postRunning");
        pm0.v.X(new ee5.s(this));
    }

    public final void X6(java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "updateQuery >> ".concat(query));
        this.f333633g = query;
        if (this.f333638o && this.f333637n) {
            Q6().c7(query);
            if (query.length() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "startToQuery: ".concat(query));
                fn5.n0 Q6 = Q6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q6, "<get-imageDataQueryModel>(...)");
                java.util.List list = fn5.n0.E;
                Q6.P6(query, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 == 1) {
            if (i18 == -1 && intent != null) {
                boolean booleanExtra = intent.getBooleanExtra("RESULT_OPEN_FEATURE", false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "onActivityResult >> " + booleanExtra);
                if (booleanExtra) {
                    O6();
                    return;
                }
                return;
            }
            boolean T6 = T6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "onActivityResult >> deal " + T6 + ", " + this.f333637n);
            if (this.f333637n || !T6) {
                return;
            }
            O6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("detail_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f333632f = stringExtra;
        this.f333637n = T6();
        boolean S6 = S6();
        this.f333638o = S6;
        if (this.f333637n && S6) {
            this.f333639p = p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.d1.a(this), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new ee5.y(this, null), 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "onDestroy >> " + this.f333637n + ", " + this.f333638o + (char) 65292 + this.f333641r);
        if (!this.f333637n || !this.f333638o || !this.f333641r) {
            de5.a.f310929a.i(0);
            return;
        }
        de5.a.f310929a.i(R6());
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f333639p;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        aq.n nVar = aq.o.f94455c;
        if (nVar != null) {
            nVar.d();
        }
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Zi();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        aq.o.f94453a = true;
    }
}
