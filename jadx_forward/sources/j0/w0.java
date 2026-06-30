package j0;

/* loaded from: classes14.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f378145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2.g0 f378146e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.e0 f378147f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g2.l f378148g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f378149h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f378150i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g0.f f378151m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g2.v f378152n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(j0.c5 c5Var, g2.g0 g0Var, g2.e0 e0Var, g2.l lVar, k0.y0 y0Var, p3325xe03a0797.p3326xc267989b.y0 y0Var2, g0.f fVar, g2.v vVar) {
        super(1);
        this.f378145d = c5Var;
        this.f378146e = g0Var;
        this.f378147f = e0Var;
        this.f378148g = lVar;
        this.f378149h = y0Var;
        this.f378150i = y0Var2;
        this.f378151m = fVar;
        this.f378152n = vVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        j0.d5 d5Var;
        c1.i0 it = (c1.i0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        j0.c5 c5Var = this.f378145d;
        c1.j0 j0Var = (c1.j0) it;
        if (c5Var.b() != j0Var.i()) {
            ((n0.q4) c5Var.f377770e).mo148714x53d8522f(java.lang.Boolean.valueOf(j0Var.i()));
            g2.g0 g0Var = this.f378146e;
            if (g0Var != null) {
                if (c5Var.b()) {
                    j0.s3 s3Var = j0.t3.f378103a;
                    yz5.l onValueChange = c5Var.f377780o;
                    yz5.l onImeActionPerformed = c5Var.f377781p;
                    g2.e0 value = this.f378147f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
                    g2.e editProcessor = c5Var.f377768c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editProcessor, "editProcessor");
                    g2.l imeOptions = this.f378148g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imeOptions, "imeOptions");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onValueChange, "onValueChange");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onImeActionPerformed, "onImeActionPerformed");
                    c5Var.f377769d = s3Var.a(g0Var, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
                } else {
                    j0.p1.f(c5Var);
                }
                if (j0Var.i() && (d5Var = c5Var.f377772g) != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(this.f378150i, null, null, new j0.v0(this.f378151m, this.f378147f, c5Var, d5Var, this.f378152n, null), 3, null);
                }
            }
            if (!j0Var.i()) {
                this.f378149h.g(null);
            }
        }
        return jz5.f0.f384359a;
    }
}
