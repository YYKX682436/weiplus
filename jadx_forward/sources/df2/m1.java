package df2;

/* loaded from: classes3.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.p1 f312276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v94 f312277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(df2.p1 p1Var, r45.v94 v94Var) {
        super(0);
        this.f312276d = p1Var;
        this.f312277e = v94Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        df2.p1 p1Var = this.f312276d;
        ((mm2.c1) p1Var.m56788xbba4bfc0(mm2.c1.class)).Y5 = this.f312277e;
        r45.v94 v94Var = ((mm2.c1) p1Var.m56788xbba4bfc0(mm2.c1.class)).Y5;
        if (v94Var != null) {
            df2.p1.Z6(p1Var, v94Var);
        }
        return jz5.f0.f384359a;
    }
}
