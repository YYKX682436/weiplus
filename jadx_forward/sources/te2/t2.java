package te2;

/* loaded from: classes14.dex */
public final class t2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.a3 f499958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x91.h f499959e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(te2.a3 a3Var, x91.h hVar) {
        super(0);
        this.f499958d = a3Var;
        this.f499959e = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gk2.e eVar;
        te2.a3 a3Var = this.f499958d;
        java.lang.String str = a3Var.f499393h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLinkingDevice mrDevice:");
        x91.h hVar = this.f499959e;
        sb6.append(hVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        te2.b2 b2Var = a3Var.f499392g;
        je2.i iVar = (b2Var == null || (eVar = ((te2.l2) b2Var).f499724d) == null) ? null : (je2.i) eVar.a(je2.i.class);
        if (iVar != null) {
            iVar.f380768f = hVar;
        }
        a3Var.g(a3Var.f499397o);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f409260i, a3Var.a());
        return jz5.f0.f384359a;
    }
}
