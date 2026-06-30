package sc2;

/* loaded from: classes2.dex */
public final class o4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.s4 f487654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487655f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487656g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(xc2.p0 p0Var, sc2.s4 s4Var, in5.s0 s0Var, android.view.View view) {
        super(1);
        this.f487653d = p0Var;
        this.f487654e = s4Var;
        this.f487655f = s0Var;
        this.f487656g = view;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        xc2.p0 p0Var = this.f487653d;
        p0Var.K = booleanValue;
        p0Var.f534774d0 = xc2.l.f534728d;
        this.f487654e.r(this.f487655f, this.f487656g, p0Var);
        return jz5.f0.f384359a;
    }
}
