package ct2;

/* loaded from: classes10.dex */
public final class o extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f303828f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f303829g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f303830h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f303831i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f303832m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f303833n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f303828f = "ReplayPreviewSlice";
        this.f303829g = new java.util.concurrent.CopyOnWriteArrayList();
        this.f303830h = new java.util.LinkedList();
    }

    public final void N6(yz5.l lVar) {
        r45.kr1 kr1Var = new r45.kr1();
        kr1Var.set(4, this.f303831i);
        kr1Var.set(2, java.lang.Long.valueOf(((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410516m));
        kr1Var.set(3, java.lang.Long.valueOf(((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152200d = 10123;
        lVar2.f152199c = "/cgi-bin/micromsg-bin/finderlivegetallreplaythumb";
        lVar2.f152197a = kr1Var;
        lVar2.f152198b = new r45.lr1();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar2.a();
        com.p314xaae8f345.mm.p944x882e457a.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        wi6.l().K(new ct2.n(this, lVar));
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        this.f303829g.clear();
        this.f303831i = null;
        this.f303832m = null;
        this.f303833n = false;
    }
}
