package f26;

/* loaded from: classes16.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f340689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f26.b2 f340690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i26.o f340691f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i26.j f340692g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.List list, f26.b2 b2Var, i26.o oVar, i26.j jVar) {
        super(1);
        this.f340689d = list;
        this.f340690e = b2Var;
        this.f340691f = oVar;
        this.f340692g = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        f26.u1 runForkingPoint = (f26.u1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runForkingPoint, "$this$runForkingPoint");
        java.util.Iterator it = this.f340689d.iterator();
        while (it.hasNext()) {
            f26.e eVar = new f26.e(this.f340690e, this.f340691f, (i26.j) it.next(), this.f340692g);
            f26.t1 t1Var = (f26.t1) runForkingPoint;
            if (!t1Var.f340752a) {
                t1Var.f340752a = ((java.lang.Boolean) eVar.mo152xb9724478()).booleanValue();
            }
        }
        return jz5.f0.f384359a;
    }
}
