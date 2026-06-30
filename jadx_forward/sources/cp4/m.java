package cp4;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.r f302581d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(cp4.r rVar) {
        super(2);
        this.f302581d = rVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        r45.is result = (r45.is) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        cp4.r rVar = this.f302581d;
        rVar.f302607y++;
        rVar.f302591f.m68236x76500a7f(false);
        ju3.c0 c0Var = ju3.c0.f383428p1;
        ju3.d0 d0Var = rVar.f546865d;
        ju3.d0.k(d0Var, c0Var, null, 2, null);
        ju3.d0.k(d0Var, ju3.c0.K1, null, 2, null);
        rVar.I(intValue, result);
        return jz5.f0.f384359a;
    }
}
