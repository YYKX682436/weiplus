package gf0;

/* loaded from: classes15.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf0.r f352755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f352756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352757f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(gf0.r rVar, int i17, java.lang.String str) {
        super(0);
        this.f352755d = rVar;
        this.f352756e = i17;
        this.f352757f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gf0.r rVar = this.f352755d;
        gf0.i iVar = rVar.f352764d;
        double b17 = iVar != null ? iVar.b() : 0.0d;
        if (rVar.f352765e == gf0.u.f352779f) {
            rVar.f352765e = gf0.u.f352777d;
            qk.b8 b8Var = rVar.f352770m;
            if (b8Var != null) {
                b8Var.a(this.f352756e, this.f352757f, b17);
            }
        }
        return jz5.f0.f384359a;
    }
}
