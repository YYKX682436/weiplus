package rh;

/* loaded from: classes12.dex */
public class o0 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f477012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.b1 f477013b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uh.g f477014c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f477015d;

    public o0(rh.c1 c1Var, boolean z17, rh.b1 b1Var, uh.g gVar) {
        this.f477015d = c1Var;
        this.f477012a = z17;
        this.f477013b = b1Var;
        this.f477014c = gVar;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        double d17;
        double d18;
        double d19;
        double d27;
        wh.v1 b17;
        double d28;
        double d29;
        double d37;
        double d38;
        rh.k1 k1Var = (rh.k1) obj;
        if (k1Var.y()) {
            wh.n1 n1Var = k1Var.f476968k;
            rh.l0 l0Var = new rh.l0(this, n1Var);
            rh.c1 c1Var = this.f477015d;
            c1Var.u(rh.f1.class, l0Var);
            rh.w0 w0Var = c1Var.f476867p;
            if (w0Var != null) {
                d28 = w0Var.a(w0Var.f477069d);
                d29 = w0Var.a(w0Var.f477070e);
                d37 = w0Var.a(w0Var.f477067b);
                d38 = w0Var.a(w0Var.f477068c);
            } else {
                qh.f0 f0Var = c1Var.f476862k;
                if (f0Var == null || (b17 = wh.x1.b(f0Var.d())) == null) {
                    d17 = 0.0d;
                    d18 = 0.0d;
                    d19 = 0.0d;
                    d27 = 0.0d;
                    double d39 = d17;
                    double d47 = d18;
                    double d48 = d19;
                    double d49 = d27;
                    c1Var.u(uh.g.class, new rh.m0(this, n1Var, d39, d47, d48, d49));
                    c1Var.u(rh.n3.class, new rh.n0(this, n1Var, d39, d47, d48, d49));
                }
                d28 = b17.f527419c;
                d29 = b17.f527420d;
                d37 = b17.f527417a;
                d38 = b17.f527418b;
            }
            d17 = d28;
            d18 = d29;
            d19 = d37;
            d27 = d38;
            double d392 = d17;
            double d472 = d18;
            double d482 = d19;
            double d492 = d27;
            c1Var.u(uh.g.class, new rh.m0(this, n1Var, d392, d472, d482, d492));
            c1Var.u(rh.n3.class, new rh.n0(this, n1Var, d392, d472, d482, d492));
        }
    }
}
