package pc3;

/* loaded from: classes7.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pc3.t f434928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434930f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434931g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(pc3.t tVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(0);
        this.f434928d = tVar;
        this.f434929e = str;
        this.f434930f = str2;
        this.f434931g = str3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sc3.k1 k1Var = (sc3.k1) this.f434928d.f434935h.get(this.f434929e);
        if (k1Var != null) {
            k1Var.s2(this.f434930f, this.f434931g);
        }
        return jz5.f0.f384359a;
    }
}
