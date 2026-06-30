package g63;

/* loaded from: classes8.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.f0 f350714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(g63.f0 f0Var) {
        super(2);
        this.f350714d = f0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        z53.i result = (z53.i) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (booleanValue) {
            g63.f0 f0Var = this.f350714d;
            g63.j jVar = f0Var.f350640b;
            jVar.getClass();
            pm0.v.X(new g63.f(jVar, result));
            pm0.v.X(new g63.t(f0Var));
        }
        return jz5.f0.f384359a;
    }
}
