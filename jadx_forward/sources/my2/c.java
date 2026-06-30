package my2;

/* loaded from: classes3.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.e f414253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(my2.e eVar) {
        super(0);
        this.f414253d = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        my2.a aVar;
        my2.e eVar = this.f414253d;
        if (((mm2.c1) eVar.P0(mm2.c1.class)).a8() && (aVar = eVar.f414258r) != null) {
            my2.u uVar = (my2.u) aVar;
            r45.me2 me2Var = ((mm2.c1) uVar.f414296d.a(mm2.c1.class)).f410317b6;
            if (me2Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar.f414298f, "resume votingInfo is null");
                qo0.c.a(uVar.f414297e, qo0.b.f446972y2, null, 2, null);
            } else {
                pm0.v.X(new my2.j(me2Var, uVar));
            }
        }
        return jz5.f0.f384359a;
    }
}
