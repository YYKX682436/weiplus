package a0;

/* loaded from: classes14.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f144f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0.m3 f145g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f146h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(boolean z17, boolean z18, boolean z19, a0.m3 m3Var, kotlinx.coroutines.y0 y0Var) {
        super(1);
        this.f142d = z17;
        this.f143e = z18;
        this.f144f = z19;
        this.f145g = m3Var;
        this.f146h = y0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        kotlin.jvm.internal.o.g(semantics, "$this$semantics");
        a0.m3 m3Var = this.f145g;
        y1.j jVar = new y1.j(new a0.e3(m3Var), new a0.f3(m3Var), this.f142d);
        boolean z17 = this.f143e;
        if (z17) {
            y1.m0.g(semantics, jVar);
        } else {
            y1.m0.e(semantics, jVar);
        }
        if (this.f144f) {
            y1.m0.c(semantics, null, new a0.d3(this.f146h, z17, m3Var), 1, null);
        }
        return jz5.f0.f302826a;
    }
}
