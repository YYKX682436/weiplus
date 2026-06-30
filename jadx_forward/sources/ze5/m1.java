package ze5;

/* loaded from: classes9.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z01.m f553611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd5.d f553612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f553614g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(z01.m mVar, rd5.d dVar, yb5.d dVar2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f553611d = mVar;
        this.f553612e = dVar;
        this.f553613f = dVar2;
        this.f553614g = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p653x55bb7a46.p656x6c9280c5.p657xd1075a44.C10390x428ecefb c10390x428ecefb;
        ze5.g1 holder = (ze5.g1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(this.f553612e, this.f553613f.D(), holder, null);
        z01.m mVar = this.f553611d;
        mVar.C = erVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22077x74a7dc07 c22077x74a7dc07 = holder.f553470f;
        if (c22077x74a7dc07 != null) {
            c22077x74a7dc07.m48330xfcfee142(mVar);
        }
        if (!te5.e2.e((ot0.q) this.f553614g.f391656d) && (c10390x428ecefb = holder.f553471g) != null) {
            c10390x428ecefb.m48330xfcfee142(mVar.f550638s);
        }
        return jz5.f0.f384359a;
    }
}
