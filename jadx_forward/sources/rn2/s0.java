package rn2;

/* loaded from: classes10.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.c1 f479371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f479372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f479373f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(rn2.c1 c1Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.String str) {
        super(0);
        this.f479371d = c1Var;
        this.f479372e = c0Var;
        this.f479373f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rn2.c1 c1Var = this.f479371d;
        c1Var.g(c1Var.f479201h, false);
        boolean z17 = this.f479372e.f391645d;
        java.lang.String str = this.f479373f;
        if (z17) {
            zd2.d.f553133a.e(str, false, 2142, "gift not found in pool");
        } else {
            zd2.d.f553133a.e(str, true, 0, null);
        }
        return jz5.f0.f384359a;
    }
}
