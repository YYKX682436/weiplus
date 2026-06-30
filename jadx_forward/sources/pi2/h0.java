package pi2;

/* loaded from: classes10.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f436313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi2.q0 f436314e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.content.Context context, pi2.q0 q0Var) {
        super(0);
        this.f436313d = context;
        this.f436314e = q0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pi2.q0 q0Var = this.f436314e;
        return new pi2.b0(this.f436313d, q0Var.I, new pi2.g0(q0Var));
    }
}
