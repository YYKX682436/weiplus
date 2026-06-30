package ze5;

/* loaded from: classes9.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.c0 f553836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553837e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ze5.c0 c0Var, yb5.d dVar) {
        super(1);
        this.f553836d = c0Var;
        this.f553837e = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ze5.n8 holder = (ze5.n8) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = holder.f553644c;
        if (abstractC11172x705e5905 != null) {
            abstractC11172x705e5905.setOnClickListener(this.f553836d.w(this.f553837e));
        }
        return jz5.f0.f384359a;
    }
}
