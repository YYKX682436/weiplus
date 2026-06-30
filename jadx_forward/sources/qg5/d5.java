package qg5;

/* loaded from: classes8.dex */
public final class d5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.n5 f444481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f444482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f444483f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f444484g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444485h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(qg5.n5 n5Var, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        super(0);
        this.f444481d = n5Var;
        this.f444482e = context;
        this.f444483f = z3Var;
        this.f444484g = f9Var;
        this.f444485h = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qg5.n5 n5Var = this.f444481d;
        ct.q2 T6 = qg5.n5.T6(n5Var);
        ac5.f fVar = ac5.f.f84623a;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f444483f;
        if (z3Var == null) {
            z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        }
        android.content.Context context = this.f444482e;
        ((qg5.l0) T6).oj(context, fVar.b(context, z3Var), this.f444483f, kz5.b0.c(this.f444484g), true);
        ct.q2 T62 = qg5.n5.T6(n5Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T62, "access$getChatRecordsStagingService(...)");
        ct.q2.k5(T62, false, 2, false, false, false, 28, null);
        ((qg5.l0) qg5.n5.T6(n5Var)).Zi(false);
        qg5.n5.V6(n5Var, context, "com.tencent.mm.intent.extra.FROM_SUMMARIZE_FILE", this.f444485h);
        return jz5.f0.f384359a;
    }
}
