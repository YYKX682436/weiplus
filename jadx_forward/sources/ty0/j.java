package ty0;

/* loaded from: classes14.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f504381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f504382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f504383f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f504384g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3, n0.v2 v2Var) {
        super(1);
        this.f504381d = h0Var;
        this.f504382e = h0Var2;
        this.f504383f = h0Var3;
        this.f504384g = v2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "$this$layout");
        s1.n1.b(layout, (s1.o1) this.f504381d.f391656d, ((java.lang.Number) this.f504384g.mo128745x754a37bb()).intValue(), 0, 0.0f, 4, null);
        jz5.l lVar = (jz5.l) this.f504382e.f391656d;
        if (lVar != null) {
            s1.n1.b(layout, (s1.o1) lVar.f384366d, ((java.lang.Number) lVar.f384367e).intValue(), 0, 0.0f, 4, null);
        }
        s1.o1 o1Var = (s1.o1) this.f504383f.f391656d;
        if (o1Var != null) {
            s1.n1.b(layout, o1Var, 0, 0, 0.0f, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
