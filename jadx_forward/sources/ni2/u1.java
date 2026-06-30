package ni2;

/* loaded from: classes3.dex */
public final class u1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f419009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ni2.z1 f419010e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(android.content.Context context, ni2.z1 z1Var) {
        super(0);
        this.f419009d = context;
        this.f419010e = z1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f419009d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5((android.app.Activity) context);
        f5Var.f291933e = new ni2.t1(this.f419010e);
        return f5Var;
    }
}
