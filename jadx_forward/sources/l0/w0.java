package l0;

/* loaded from: classes14.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f396099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f396100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0.o f396101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0.m3 f396102g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e1.a1 f396103h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f396104i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f396105m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(boolean z17, boolean z18, c0.o oVar, l0.m3 m3Var, e1.a1 a1Var, int i17, int i18) {
        super(2);
        this.f396099d = z17;
        this.f396100e = z18;
        this.f396101f = oVar;
        this.f396102g = m3Var;
        this.f396103h = a1Var;
        this.f396104i = i17;
        this.f396105m = i18;
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
        boolean z17 = this.f396099d;
        boolean z18 = this.f396100e;
        c0.o oVar2 = this.f396101f;
        l0.m3 m3Var = this.f396102g;
        e1.a1 a1Var = this.f396103h;
        int i17 = ((this.f396104i >> 9) & 14) | 12582912;
        int i18 = this.f396105m;
        s3Var.a(z17, z18, oVar2, m3Var, a1Var, 0.0f, 0.0f, oVar, i17 | ((i18 << 3) & 112) | ((i18 >> 12) & ce1.h.f4368x366c91de) | ((i18 >> 15) & 7168) | ((i18 >> 9) & 57344), 96);
        return jz5.f0.f384359a;
    }
}
