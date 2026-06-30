package n0;

/* loaded from: classes14.dex */
public final class a4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.p1 f414966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0.d f414967e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(n0.p1 p1Var, o0.d dVar) {
        super(1);
        this.f414966d = p1Var;
        this.f414967e = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        ((n0.j1) this.f414966d).r(value);
        o0.d dVar = this.f414967e;
        if (dVar != null) {
            dVar.add(value);
        }
        return jz5.f0.f384359a;
    }
}
