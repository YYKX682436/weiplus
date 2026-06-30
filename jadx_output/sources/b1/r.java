package b1;

/* loaded from: classes14.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f17009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.a1 f17010e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f17011f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f17012g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f17013h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(float f17, e1.a1 a1Var, boolean z17, long j17, long j18) {
        super(1);
        this.f17009d = f17;
        this.f17010e = a1Var;
        this.f17011f = z17;
        this.f17012g = j17;
        this.f17013h = j18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        e1.e0 graphicsLayer = (e1.e0) obj;
        kotlin.jvm.internal.o.g(graphicsLayer, "$this$graphicsLayer");
        e1.x0 x0Var = (e1.x0) graphicsLayer;
        x0Var.f246300i = this.f17009d * x0Var.getDensity();
        e1.a1 a1Var = this.f17010e;
        kotlin.jvm.internal.o.g(a1Var, "<set-?>");
        x0Var.f246308t = a1Var;
        x0Var.f246309u = this.f17011f;
        x0Var.f246301m = this.f17012g;
        x0Var.f246302n = this.f17013h;
        return jz5.f0.f302826a;
    }
}
