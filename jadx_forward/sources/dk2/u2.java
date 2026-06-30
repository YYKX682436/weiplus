package dk2;

/* loaded from: classes3.dex */
public final class u2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f315679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f315680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.s f315681f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315682g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.sw1 f315683h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(int i17, int i18, yz5.s sVar, java.lang.String str, r45.sw1 sw1Var) {
        super(0);
        this.f315679d = i17;
        this.f315680e = i18;
        this.f315681f = sVar;
        this.f315682g = str;
        this.f315683h = sw1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.s sVar = this.f315681f;
        int i17 = this.f315680e;
        int i18 = this.f315679d;
        if (i18 == 0 && i17 == 0) {
            if (sVar != null) {
                sVar.v(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), this.f315682g, this.f315683h);
            }
        } else if (sVar != null) {
            sVar.v(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), this.f315682g, this.f315683h);
        }
        return jz5.f0.f384359a;
    }
}
