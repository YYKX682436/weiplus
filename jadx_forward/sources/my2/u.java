package my2;

/* loaded from: classes3.dex */
public final class u implements my2.a {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f414296d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f414297e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f414298f;

    /* renamed from: g, reason: collision with root package name */
    public my2.b f414299g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f414300h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f414301i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f414302m;

    public u(android.content.Context context, gk2.e liveData, qo0.c statusMonitor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f414296d = liveData;
        this.f414297e = statusMonitor;
        this.f414298f = "FinderLiveVoteBubblePresenter";
        this.f414300h = "vote_bubble_close_tag";
        this.f414301i = new my2.f(this);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 c() {
        qo0.c cVar = this.f414297e;
        if (cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar;
        }
        return null;
    }

    public final boolean f() {
        if (zl2.r4.f555483a.w1() || ((mm2.c1) this.f414296d.a(mm2.c1.class)).T) {
            return true;
        }
        return ((mm2.n0) this.f414296d.a(mm2.n0.class)).f410806r;
    }

    public void g() {
        qo0.c.a(this.f414297e, qo0.b.f446952u2, null, 2, null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 2);
        r45.me2 me2Var = ((mm2.c1) this.f414296d.a(mm2.c1.class)).f410317b6;
        jSONObject.put("vote_id", me2Var != null ? me2Var.m75945x2fec8307(5) : null);
        java.lang.Object obj = this.f414299g;
        ie2.a aVar = obj instanceof ie2.a ? (ie2.a) obj : null;
        int i17 = aVar != null && aVar.x() ? 2 : 1;
        if (i17 != 0) {
            jSONObject.put("ui_type", i17);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.E1, t17, 0L, null, null, null, null, null, 252, null);
    }

    @Override // fs2.a
    /* renamed from: onAttach */
    public void mo56536x3b13c504(java.lang.Object obj) {
        my2.b callback = (my2.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f414298f, "onAttach");
        this.f414299g = callback;
        my2.y yVar = (my2.y) callback;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVoteBubbleViewCallback", "initView!");
        android.view.View t17 = yVar.t(com.p314xaae8f345.mm.R.id.fqf);
        if (t17 != null) {
            t17.setOnClickListener(new my2.w(yVar));
        }
        yVar.E();
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f414298f, "onDetach");
        if (this.f414299g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVoteBubbleViewCallback", "reset");
        }
        this.f414299g = null;
        ((ku5.t0) ku5.t0.f394148d).A(this.f414300h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f414298f, "voteInfo clear task remove");
    }
}
