package sg0;

/* loaded from: classes15.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tg0.g1 f489198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(tg0.g1 g1Var) {
        super(2);
        this.f489198d = g1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String status = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(status, "dismiss");
        jz5.f0 f0Var = jz5.f0.f384359a;
        tg0.g1 g1Var = this.f489198d;
        if (b17) {
            if (g1Var != null) {
                g1Var.mo68686xb349b3ab();
                return f0Var;
            }
        } else {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(status, "enter")) {
                return f0Var;
            }
            if (g1Var != null) {
                g1Var.mo68687xaf88dc39();
                return f0Var;
            }
        }
        return null;
    }
}
