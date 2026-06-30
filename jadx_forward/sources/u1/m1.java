package u1;

/* loaded from: classes14.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.n1 f505158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f505159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f505160f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f505161g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(u1.n1 n1Var, long j17, float f17, yz5.l lVar) {
        super(0);
        this.f505158d = n1Var;
        this.f505159e = j17;
        this.f505160f = f17;
        this.f505161g = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float f17 = this.f505160f;
        long j17 = this.f505159e;
        s1.m1 m1Var = s1.n1.f483574a;
        yz5.l lVar = this.f505161g;
        u1.n1 n1Var = this.f505158d;
        if (lVar == null) {
            m1Var.c(n1Var.f505173i, j17, f17);
        } else {
            m1Var.i(n1Var.f505173i, j17, f17, lVar);
        }
        return jz5.f0.f384359a;
    }
}
