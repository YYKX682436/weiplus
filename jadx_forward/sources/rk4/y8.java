package rk4;

/* loaded from: classes11.dex */
public final class y8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f478642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f478643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ il4.e f478644f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(bw5.lp0 lp0Var, bw5.o50 o50Var, il4.e eVar) {
        super(0);
        this.f478642d = lp0Var;
        this.f478643e = o50Var;
        this.f478644f = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zk4.l lVar = zk4.l.f555071a;
        jm4.g3 b17 = lVar.b();
        java.util.List c17 = kz5.b0.c(this.f478642d);
        bw5.o50 o50Var = this.f478643e;
        il4.e eVar = this.f478644f;
        jm4.m3 m3Var = (jm4.m3) lVar.a(c17, o50Var, null, eVar);
        if (b17 != null) {
            jm4.f3.a(b17, m3Var, eVar.f373638b, null, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
