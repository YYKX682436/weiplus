package hr5;

/* loaded from: classes15.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f365995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f365997f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zq5.v f365998g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(hr5.a1 a1Var, java.lang.String str, float f17, zq5.v vVar) {
        super(0);
        this.f365995d = a1Var;
        this.f365996e = str;
        this.f365997f = f17;
        this.f365998g = vVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return this.f365995d.f365811b + ". " + this.f365996e + ". animated running. fraction=" + this.f365997f + ", userTransform=" + zq5.w.c(this.f365998g);
    }
}
