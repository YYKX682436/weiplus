package g63;

/* loaded from: classes8.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public g63.t0 f350639a;

    /* renamed from: b, reason: collision with root package name */
    public final g63.j f350640b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f350641c;

    /* renamed from: d, reason: collision with root package name */
    public final u53.a0 f350642d;

    /* renamed from: e, reason: collision with root package name */
    public final z53.t f350643e;

    /* renamed from: f, reason: collision with root package name */
    public final g63.d0 f350644f;

    /* renamed from: g, reason: collision with root package name */
    public final l75.q0 f350645g;

    /* renamed from: h, reason: collision with root package name */
    public final l75.q0 f350646h;

    public f0(g63.t0 t0Var, g63.j adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        this.f350639a = t0Var;
        this.f350640b = adapter;
        this.f350641c = true;
        this.f350642d = (u53.a0) i95.n0.c(u53.a0.class);
        this.f350643e = ((t53.m0) i95.n0.c(t53.m0.class)).Ui();
        this.f350644f = new g63.d0(this);
        this.f350645g = new g63.a0(this);
        this.f350646h = new g63.c0(this);
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ConversationPresenter", "checkHistoryConversation");
        m33.l1 l1Var = (m33.l1) i95.n0.c(m33.l1.class);
        g63.u uVar = new g63.u(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 p0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) l1Var;
        p0Var.getClass();
        if (((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_LIFE_HISTORY_DELETED_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue()) {
            uVar.a(null);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.t0(p0Var, uVar));
    }
}
