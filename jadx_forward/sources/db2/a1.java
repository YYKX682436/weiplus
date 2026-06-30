package db2;

/* loaded from: classes3.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db2.b1 f309415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f309416e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f309417f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309418g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.v71 f309419h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(db2.b1 b1Var, int i17, int i18, java.lang.String str, r45.v71 v71Var) {
        super(0);
        this.f309415d = b1Var;
        this.f309416e = i17;
        this.f309417f = i18;
        this.f309418g = str;
        this.f309419h = v71Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        db2.z0 z0Var = this.f309415d.f309439t;
        if (z0Var != null) {
            z0Var.a(this.f309416e, this.f309417f, this.f309418g, this.f309419h);
        }
        return jz5.f0.f384359a;
    }
}
