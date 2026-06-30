package ze5;

/* loaded from: classes9.dex */
public final class a9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.c9 f553359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd5.d f553360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553361f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q31.p f553362g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(ze5.c9 c9Var, rd5.d dVar, yb5.d dVar2, q31.p pVar) {
        super(1);
        this.f553359d = c9Var;
        this.f553360e = dVar;
        this.f553361f = dVar2;
        this.f553362g = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ze5.z8 it = (ze5.z8) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ze5.c9 c9Var = this.f553359d;
        c9Var.getClass();
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = it.f553885b;
        yb5.d dVar = this.f553361f;
        if (abstractC11172x705e5905 != null) {
            abstractC11172x705e5905.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(this.f553360e, dVar.D(), it, dVar.x()));
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = it.f553885b;
        if (abstractC11172x705e59052 != null) {
            abstractC11172x705e59052.setOnLongClickListener(c9Var.u(dVar));
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59053 = it.f553885b;
        if (abstractC11172x705e59053 != null) {
            abstractC11172x705e59053.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59054 = it.f553885b;
        if (abstractC11172x705e59054 != null) {
            abstractC11172x705e59054.m48330xfcfee142(this.f553362g);
        }
        return jz5.f0.f384359a;
    }
}
