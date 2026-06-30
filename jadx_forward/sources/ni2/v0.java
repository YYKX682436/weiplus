package ni2;

/* loaded from: classes10.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f419017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ni2.x0 f419018e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.content.Context context, ni2.x0 x0Var) {
        super(0);
        this.f419017d = context;
        this.f419018e = x0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ni2.x0 x0Var = this.f419018e;
        gk2.e a17 = ((df2.d3) x0Var.f419035J).a();
        zh2.c cVar = x0Var.K;
        if (cVar == null) {
            cVar = x0Var.R;
        }
        return new pi2.q0(this.f419017d, a17, cVar, new ni2.u0(x0Var));
    }
}
