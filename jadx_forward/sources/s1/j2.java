package s1;

/* loaded from: classes14.dex */
public final class j2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.k2 f483551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(s1.k2 k2Var) {
        super(2);
        this.f483551d = k2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        u1.w wVar = (u1.w) obj;
        s1.k2 it = (s1.k2) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wVar, "$this$null");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        s1.q0 q0Var = wVar.L;
        s1.k2 k2Var = this.f483551d;
        if (q0Var == null) {
            q0Var = new s1.q0(wVar, k2Var.f483559a);
            wVar.L = q0Var;
        }
        k2Var.f483560b = q0Var;
        k2Var.a().b();
        s1.q0 a17 = k2Var.a();
        s1.n2 value = k2Var.f483559a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (a17.f483596c != value) {
            a17.f483596c = value;
            a17.a(0);
        }
        return jz5.f0.f384359a;
    }
}
