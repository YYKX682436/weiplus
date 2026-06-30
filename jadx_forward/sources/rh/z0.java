package rh;

/* loaded from: classes12.dex */
public class z0 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f477103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.a1 f477104b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wh.n1 f477105c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f477106d;

    public z0(rh.b1 b1Var, rh.c1 c1Var, rh.a1 a1Var, wh.n1 n1Var, java.util.Map map) {
        this.f477103a = c1Var;
        this.f477104b = a1Var;
        this.f477105c = n1Var;
        this.f477106d = map;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        rh.a1 a1Var;
        wh.n1 n1Var;
        rh.o2 o2Var = (rh.o2) obj;
        rh.c1 c1Var = this.f477103a;
        qh.f0 f0Var = c1Var.f476862k;
        if (f0Var == null) {
            return;
        }
        java.util.Iterator it = ((rh.j1) o2Var.f477019c).f476958e.iterator();
        double d17 = 0.0d;
        double d18 = 0.0d;
        while (true) {
            boolean hasNext = it.hasNext();
            a1Var = this.f477104b;
            n1Var = this.f477105c;
            if (!hasNext) {
                break;
            }
            rh.f1 f1Var = (rh.f1) ((rh.o2) it.next()).f477019c;
            long a17 = a1Var.a(f1Var.f476921g);
            d18 += uh.i.f(n1Var, a17) + uh.i.i(n1Var, f1Var, a17, false) + uh.i.l(n1Var, f1Var, a17, false);
        }
        java.lang.Double valueOf = java.lang.Double.valueOf(d18);
        java.util.Map map = this.f477106d;
        map.put("power-cpu-uidDiff", valueOf);
        if (f0Var.f444868d.D) {
            java.util.Iterator it6 = ((rh.j1) o2Var.f477019c).f476958e.iterator();
            while (it6.hasNext()) {
                rh.f1 f1Var2 = (rh.f1) ((rh.o2) it6.next()).f477019c;
                long a18 = a1Var.a(f1Var2.f476921g);
                d17 += uh.i.f(n1Var, a18) + uh.i.i(n1Var, f1Var2, a18, true) + uh.i.l(n1Var, f1Var2, a18, true);
            }
            map.put("power-cpu-uidDiffScale", java.lang.Double.valueOf(d17));
            c1Var.u(rh.f1.class, new rh.y0(this));
        }
    }
}
