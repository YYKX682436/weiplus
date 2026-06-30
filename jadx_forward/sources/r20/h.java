package r20;

/* loaded from: classes9.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10562xfadc7655 f450310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.d9 f450311e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10562xfadc7655 c10562xfadc7655, bw5.d9 d9Var) {
        super(0);
        this.f450310d = c10562xfadc7655;
        this.f450311e = d9Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10562xfadc7655 c10562xfadc7655 = this.f450310d;
        yz5.a preOnCLick = c10562xfadc7655.getPreOnCLick();
        if (preOnCLick != null) {
            preOnCLick.mo152xb9724478();
        }
        i95.m c17 = i95.n0.c(pq.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        pq.q qVar = (pq.q) c17;
        android.content.Context context = c10562xfadc7655.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pq.a aVar = new pq.a(context);
        bw5.d9 d9Var = this.f450311e;
        bw5.x7 x7Var = d9Var.f107913f[2] ? d9Var.f107912e : new bw5.x7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(x7Var, "getEcsJumpInfo(...)");
        pq.q.Lb(qVar, aVar, x7Var, null, 4, null);
        return jz5.f0.f384359a;
    }
}
