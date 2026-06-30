package wu;

/* loaded from: classes9.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.b f531137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu.p f531138e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hu.b bVar, wu.p pVar) {
        super(1);
        this.f531137d = bVar;
        this.f531138e = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.ImageView it = (android.widget.ImageView) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        i95.m c17 = i95.n0.c(pt.l0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        pt.l0 l0Var = (pt.l0) c17;
        android.content.Context context = it.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        s15.h hVar = this.f531137d.f366530e;
        wu.p pVar = this.f531138e;
        zt.k kVar = new zt.k("RecordQuote", hVar, pVar.f531143e.j());
        kVar.f557080d = pVar.f531143e.f366537d;
        pt.l0.zg(l0Var, context, kVar, it, new gk0.k(i65.a.B(it.getContext()), i65.a.k(it.getContext())), null, 16, null);
        return jz5.f0.f384359a;
    }
}
