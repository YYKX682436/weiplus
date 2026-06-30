package rk4;

/* loaded from: classes11.dex */
public final class p8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f478441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f478442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f478443f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.pp0 f478444g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ il4.e f478445h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rk4.z8 f478446i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(java.util.List list, bw5.lp0 lp0Var, bw5.o50 o50Var, bw5.pp0 pp0Var, il4.e eVar, rk4.z8 z8Var) {
        super(0);
        this.f478441d = list;
        this.f478442e = lp0Var;
        this.f478443f = o50Var;
        this.f478444g = pp0Var;
        this.f478445h = eVar;
        this.f478446i = z8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zk4.l lVar = zk4.l.f555071a;
        java.util.List list = this.f478441d;
        if (list == null) {
            bw5.lp0 lp0Var = this.f478442e;
            list = lp0Var != null ? kz5.b0.c(lp0Var) : new java.util.LinkedList();
        }
        bw5.o50 o50Var = this.f478443f;
        bw5.pp0 pp0Var = this.f478444g;
        il4.e eVar = this.f478445h;
        rk4.z8.wi(this.f478446i, (jm4.m3) lVar.a(list, o50Var, pp0Var, eVar), eVar.f373638b);
        return jz5.f0.f384359a;
    }
}
