package ch2;

/* loaded from: classes10.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f41472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ch2.o2 o2Var, yz5.a aVar) {
        super(0);
        this.f41471d = o2Var;
        this.f41472e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.yx1 Q6;
        ch2.o2 o2Var = this.f41471d;
        if (o2Var.q7().S6() && (Q6 = o2Var.q7().Q6()) != null) {
            o2Var.E(Q6, new ch2.z(o2Var));
        }
        this.f41472e.invoke();
        return jz5.f0.f302826a;
    }
}
