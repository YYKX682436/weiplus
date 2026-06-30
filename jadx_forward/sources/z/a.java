package z;

/* loaded from: classes14.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.e f550099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.r f550100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f550101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f550102g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z.e eVar, z.r rVar, yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f550099d = eVar;
        this.f550100e = rVar;
        this.f550101f = lVar;
        this.f550102g = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        z.o animate = (z.o) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animate, "$this$animate");
        z.e eVar = this.f550099d;
        z.z1.f(animate, eVar.f550165c);
        java.lang.Object a17 = z.e.a(eVar, animate.b());
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, animate.b());
        yz5.l lVar = this.f550101f;
        if (!b17) {
            ((n0.q4) eVar.f550165c.f550344e).mo148714x53d8522f(a17);
            ((n0.q4) this.f550100e.f550344e).mo148714x53d8522f(a17);
            if (lVar != null) {
                lVar.mo146xb9724478(eVar);
            }
            animate.a();
            this.f550102g.f391645d = true;
        } else if (lVar != null) {
            lVar.mo146xb9724478(eVar);
        }
        return jz5.f0.f384359a;
    }
}
