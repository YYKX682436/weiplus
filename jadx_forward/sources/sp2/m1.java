package sp2;

/* loaded from: classes2.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f492617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f492619f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f492620g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f492621h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f492622i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f492623m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(boolean z17, sp2.o2 o2Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, boolean z18, int i18, long j17) {
        super(0);
        this.f492617d = z17;
        this.f492618e = o2Var;
        this.f492619f = gVar;
        this.f492620g = i17;
        this.f492621h = z18;
        this.f492622i = i18;
        this.f492623m = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.dk2 dk2Var;
        sp2.o2 o2Var = this.f492618e;
        boolean z17 = this.f492617d;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = (z17 || (dk2Var = o2Var.A) == null) ? null : dk2Var.m75934xbce7f2f(6);
        java.lang.String str = (java.lang.String) ((jz5.n) o2Var.R).mo141623x754a37bb();
        java.util.List c17 = z17 ? kz5.p0.f395529d : sp2.o2.c(o2Var, "loadDataWithCgi");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o2Var.f492654a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractActivityC21394xb3d2c0cf, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        int d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) abstractActivityC21394xb3d2c0cf).getD();
        r45.o72 o72Var = o2Var.f492661d0;
        java.lang.String str2 = o2Var.V;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f492619f;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = gVar == null ? (z17 && this.f492620g == 0) ? o2Var.Q : null : gVar;
        boolean z18 = this.f492621h;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g c18 = z18 ? cq2.q.f302961a.c() : null;
        r45.rk0 rk0Var = cq2.q.f302972l;
        int i17 = this.f492620g;
        int i18 = this.f492622i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        aq2.a aVar = new aq2.a(i17, i18, m75934xbce7f2f, str, c17, d17, this.f492623m, o72Var, null, 0, 0.0f, false, str2, gVar2, c18, false, rk0Var, 36608, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "#loadDataWithCgi needRequestWithMoreObjects=" + z18 + ", req=" + aVar);
        return new aq2.b(aVar, null, o2Var.f492654a, 2, null);
    }
}
