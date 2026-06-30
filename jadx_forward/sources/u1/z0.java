package u1;

/* loaded from: classes14.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.c1 f505258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.u f505259e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(u1.c1 c1Var, e1.u uVar) {
        super(0);
        this.f505258d = c1Var;
        this.f505259e = uVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        u1.c1 c1Var = this.f505258d;
        u1.o oVar = (u1.o) c1Var.f505101y[0];
        e1.u uVar = this.f505259e;
        if (oVar == null) {
            c1Var.y0(uVar);
        } else {
            oVar.c(uVar);
        }
        return jz5.f0.f384359a;
    }
}
