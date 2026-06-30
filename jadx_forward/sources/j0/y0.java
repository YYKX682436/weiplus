package j0;

/* loaded from: classes14.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f378173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1.d0 f378174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f378175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f378176g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g2.v f378177h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(j0.c5 c5Var, c1.d0 d0Var, boolean z17, k0.y0 y0Var, g2.v vVar) {
        super(1);
        this.f378173d = c5Var;
        this.f378174e = d0Var;
        this.f378175f = z17;
        this.f378176g = y0Var;
        this.f378177h = vVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long j17 = ((d1.e) obj).f307160a;
        boolean z17 = !this.f378175f;
        j0.c5 c5Var = this.f378173d;
        j0.p1.e(c5Var, this.f378174e, z17);
        if (c5Var.b()) {
            if (c5Var.a() != j0.v1.Selection) {
                j0.d5 d5Var = c5Var.f377772g;
                if (d5Var != null) {
                    yz5.l onValueChange = c5Var.f377780o;
                    g2.e editProcessor = c5Var.f377768c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editProcessor, "editProcessor");
                    g2.v offsetMapping = this.f378177h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(offsetMapping, "offsetMapping");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onValueChange, "onValueChange");
                    int b17 = d5Var.b(j17, true);
                    ((j0.a5) onValueChange).mo146xb9724478(g2.e0.a(editProcessor.f349224a, null, a2.n1.a(b17, b17), null, 5, null));
                    if (c5Var.f377766a.f377936a.length() > 0) {
                        ((n0.q4) c5Var.f377773h).mo148714x53d8522f(j0.v1.Cursor);
                    }
                }
            } else {
                this.f378176g.g(new d1.e(j17));
            }
        }
        return jz5.f0.f384359a;
    }
}
