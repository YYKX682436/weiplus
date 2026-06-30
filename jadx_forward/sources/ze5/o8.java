package ze5;

/* loaded from: classes9.dex */
public final class o8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f553665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ze5.w8 f553667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q31.p f553668g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(rd5.d dVar, yb5.d dVar2, ze5.w8 w8Var, q31.p pVar) {
        super(1);
        this.f553665d = dVar;
        this.f553666e = dVar2;
        this.f553667f = w8Var;
        this.f553668g = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ze5.n8 it = (ze5.n8) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = it.f553644c;
        yb5.d dVar = this.f553666e;
        if (abstractC11172x705e5905 != null) {
            abstractC11172x705e5905.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(this.f553665d, dVar.D(), it, dVar.x()));
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = it.f553644c;
        if (abstractC11172x705e59052 != null) {
            abstractC11172x705e59052.setOnLongClickListener(this.f553667f.u(dVar));
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59053 = it.f553644c;
        if (abstractC11172x705e59053 != null) {
            abstractC11172x705e59053.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59054 = it.f553644c;
        if (abstractC11172x705e59054 != null) {
            abstractC11172x705e59054.m48330xfcfee142(this.f553668g);
        }
        return jz5.f0.f384359a;
    }
}
