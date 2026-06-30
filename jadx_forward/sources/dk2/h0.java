package dk2;

/* loaded from: classes3.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.c04 f315079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f315080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(r45.c04 c04Var, gk2.e eVar) {
        super(0);
        this.f315079d = c04Var;
        this.f315080e = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        gk2.e eVar = this.f315080e;
        r45.c04 c04Var = this.f315079d;
        if (c04Var != null) {
            mm2.f7 f7Var = (mm2.f7) eVar.a(mm2.f7.class);
            f7Var.f410592g.mo7808x76db6cb1(new dk2.z7(c04Var, true));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            mm2.f7 f7Var2 = (mm2.f7) eVar.a(mm2.f7.class);
            f7Var2.f410592g.mo7808x76db6cb1(new dk2.z7(new r45.c04(), false));
        }
        return f0Var2;
    }
}
