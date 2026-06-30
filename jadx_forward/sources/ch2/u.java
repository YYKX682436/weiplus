package ch2;

/* loaded from: classes10.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f123004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f123005e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ch2.o2 o2Var, yz5.a aVar) {
        super(0);
        this.f123004d = o2Var;
        this.f123005e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.yx1 Q6;
        ch2.o2 o2Var = this.f123004d;
        if (o2Var.q7().S6() && (Q6 = o2Var.q7().Q6()) != null) {
            o2Var.E(Q6, new ch2.z(o2Var));
        }
        this.f123005e.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
