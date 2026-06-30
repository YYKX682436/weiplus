package hr5;

/* loaded from: classes15.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f365991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365992e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(hr5.a1 a1Var, java.lang.String str) {
        super(0);
        this.f365991d = a1Var;
        this.f365992e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        hr5.a1 a1Var = this.f365991d;
        sb6.append(a1Var.f365811b);
        sb6.append(". ");
        sb6.append(this.f365992e);
        sb6.append(". animated started. transform=");
        sb6.append(zq5.w.c(a1Var.f365830u));
        sb6.append(", userTransform=");
        sb6.append(zq5.w.c(a1Var.f365829t));
        return sb6.toString();
    }
}
