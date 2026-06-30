package rh;

/* loaded from: classes12.dex */
public class g1 extends rh.o2 {
    public g1(rh.j1 j1Var, rh.j1 j1Var2, rh.j1 j1Var3) {
        super(j1Var2, j1Var3);
    }

    @Override // rh.o2
    public rh.d3 a() {
        rh.f1 f1Var;
        rh.j1 j1Var = new rh.j1();
        rh.j1 j1Var2 = (rh.j1) this.f477018b;
        if (j1Var2.f476957d.size() > 0) {
            j1Var.f476958e = new java.util.ArrayList();
            for (rh.f1 f1Var2 : j1Var2.f476957d) {
                java.util.Iterator it = ((rh.j1) this.f477017a).f476957d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        f1Var = null;
                        break;
                    }
                    f1Var = (rh.f1) it.next();
                    if (f1Var.f476920f == f1Var2.f476920f) {
                        break;
                    }
                }
                if (f1Var == null) {
                    f1Var = new rh.f1();
                    f1Var.f476920f = f1Var2.f476920f;
                    f1Var.f476921g = f1Var2.f476921g;
                    f1Var.f476919e = new java.util.ArrayList(f1Var2.f476919e.size());
                    java.util.Iterator it6 = f1Var2.f476919e.iterator();
                    while (it6.hasNext()) {
                        f1Var.f476919e.add(rh.y2.a(new long[((rh.y2) it6.next()).f477093a.size()]));
                    }
                }
                f1Var2.getClass();
                j1Var.f476958e.add(new rh.e1(f1Var2, f1Var, f1Var2));
            }
        }
        return j1Var;
    }
}
