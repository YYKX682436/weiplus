package pr;

/* loaded from: classes15.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.a1 f439334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f439335e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(pr.a1 a1Var, java.util.List list) {
        super(0);
        this.f439334d = a1Var;
        this.f439335e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pr.a1 a1Var = this.f439334d;
        a1Var.f439222a.addAll(this.f439335e);
        pm0.v.X(new pr.w0(a1Var));
        return jz5.f0.f384359a;
    }
}
