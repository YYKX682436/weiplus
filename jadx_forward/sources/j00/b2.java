package j00;

/* loaded from: classes9.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c00.j3 f378251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f378252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f378253f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f378254g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378255h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f378256i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c00.j3 j3Var, boolean z17, bw5.x7 x7Var, int i17, java.lang.String str, long j17) {
        super(0);
        this.f378251d = j3Var;
        this.f378252e = z17;
        this.f378253f = x7Var;
        this.f378254g = i17;
        this.f378255h = str;
        this.f378256i = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        j00.d dVar = j00.d.f378272a;
        c00.j3 j3Var = this.f378251d;
        int i17 = j3Var.f118526b.f118502c;
        boolean z17 = this.f378252e;
        bw5.x7 tmpInfo = this.f378253f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tmpInfo, "$tmpInfo");
        dVar.a(i17, 2, z17, tmpInfo, dVar.b(j3Var, this.f378252e, this.f378254g, this.f378255h), this.f378256i);
        return jz5.f0.f384359a;
    }
}
