package b1;

/* loaded from: classes14.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f98542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.a1 f98543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f98544f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f98545g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f98546h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(float f17, e1.a1 a1Var, boolean z17, long j17, long j18) {
        super(1);
        this.f98542d = f17;
        this.f98543e = a1Var;
        this.f98544f = z17;
        this.f98545g = j17;
        this.f98546h = j18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        e1.e0 graphicsLayer = (e1.e0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(graphicsLayer, "$this$graphicsLayer");
        e1.x0 x0Var = (e1.x0) graphicsLayer;
        x0Var.f327833i = this.f98542d * x0Var.mo7005x9a59d0b2();
        e1.a1 a1Var = this.f98543e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a1Var, "<set-?>");
        x0Var.f327841t = a1Var;
        x0Var.f327842u = this.f98544f;
        x0Var.f327834m = this.f98545g;
        x0Var.f327835n = this.f98546h;
        return jz5.f0.f384359a;
    }
}
