package i06;

/* loaded from: classes15.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.f1 f368158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i06.k1 f368159e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(i06.f1 f1Var, i06.k1 k1Var) {
        super(0);
        this.f368158d = f1Var;
        this.f368159e = k1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List<o06.e2> m17 = this.f368158d.a().m();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "getDeclaredTypeParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        for (o06.e2 e2Var : m17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e2Var);
            arrayList.add(new i06.y3(this.f368159e, e2Var));
        }
        return arrayList;
    }
}
