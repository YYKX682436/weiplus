package l0;

/* loaded from: classes14.dex */
public final class o3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f395942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f395943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0.n f395944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0.m3 f395945g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f395946h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f395947i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(boolean z17, boolean z18, c0.n nVar, l0.m3 m3Var, int i17, int i18) {
        super(2);
        this.f395942d = z17;
        this.f395943e = z18;
        this.f395944f = nVar;
        this.f395945g = m3Var;
        this.f395946h = i17;
        this.f395947i = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        l0.s3 s3Var = l0.s3.f396043a;
        boolean z17 = this.f395942d;
        boolean z18 = this.f395943e;
        c0.n nVar = this.f395944f;
        l0.m3 m3Var = this.f395945g;
        int i17 = this.f395946h;
        s3Var.a(z17, z18, nVar, m3Var, null, 0.0f, 0.0f, oVar, ((i17 >> 9) & ce1.h.f4368x366c91de) | ((i17 >> 6) & 14) | 12582912 | ((i17 >> 15) & 112) | ((this.f395947i << 6) & 7168), 112);
        return jz5.f0.f384359a;
    }
}
