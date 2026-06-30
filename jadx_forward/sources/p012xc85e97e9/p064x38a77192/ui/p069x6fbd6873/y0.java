package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f92350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.z0 f92351e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(android.content.Context context, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.z0 z0Var) {
        super(1);
        this.f92350d = context;
        this.f92351e = z0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(DisposableEffect, "$this$DisposableEffect");
        android.content.Context context = this.f92350d;
        android.content.Context applicationContext = context.getApplicationContext();
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.z0 z0Var = this.f92351e;
        applicationContext.registerComponentCallbacks(z0Var);
        return new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.x0(context, z0Var);
    }
}
