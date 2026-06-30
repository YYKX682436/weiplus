package rb2;

/* loaded from: classes2.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f475094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rb2.m0 f475095f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(in5.s0 s0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, rb2.m0 m0Var) {
        super(1);
        this.f475093d = s0Var;
        this.f475094e = c19786x6a1e2862;
        this.f475095f = m0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        xc2.y2 y2Var = xc2.y2.f534876a;
        android.content.Context context = this.f475093d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        xc2.p0 p0Var = new xc2.p0(this.f475094e);
        p0Var.f534777f = this.f475095f.f475219e.f0();
        xc2.y2.i(y2Var, context, p0Var, 0, this.f475093d, 4, null);
        return jz5.f0.f384359a;
    }
}
