package n20;

/* loaded from: classes9.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.v3.C10555x824069c8 f415768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.qf f415769e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.v3.C10555x824069c8 c10555x824069c8, bw5.qf qfVar) {
        super(0);
        this.f415768d = c10555x824069c8;
        this.f415769e = qfVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        i95.m c17 = i95.n0.c(pq.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        pq.q qVar = (pq.q) c17;
        android.content.Context context = this.f415768d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pq.a aVar = new pq.a(context);
        bw5.x7 e17 = this.f415769e.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getProductDetailJumpInfo(...)");
        pq.q.Lb(qVar, aVar, e17, null, 4, null);
        return jz5.f0.f384359a;
    }
}
