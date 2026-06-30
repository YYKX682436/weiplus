package rh;

/* loaded from: classes12.dex */
public class e1 extends rh.o2 {
    public e1(rh.f1 f1Var, rh.f1 f1Var2, rh.f1 f1Var3) {
        super(f1Var2, f1Var3);
    }

    @Override // rh.o2
    public rh.d3 a() {
        rh.f1 f1Var = new rh.f1();
        rh.f1 f1Var2 = (rh.f1) this.f477018b;
        f1Var.f476920f = f1Var2.f476920f;
        f1Var.f476921g = f1Var2.f476921g;
        rh.f1 f1Var3 = (rh.f1) this.f477017a;
        if (f1Var3.f476918d.size() != f1Var2.f476918d.size()) {
            f1Var.f476898c = false;
        } else {
            f1Var.f476918d = new java.util.ArrayList();
            for (int i17 = 0; i17 < f1Var2.f476918d.size(); i17++) {
                f1Var.f476918d.add(rh.q2.a((rh.y2) f1Var3.f476918d.get(i17), (rh.y2) f1Var2.f476918d.get(i17)));
            }
            f1Var.f476919e = new java.util.ArrayList();
            for (int i18 = 0; i18 < f1Var2.f476919e.size(); i18++) {
                f1Var.f476919e.add(rh.q2.a((rh.y2) f1Var3.f476919e.get(i18), (rh.y2) f1Var2.f476919e.get(i18)));
            }
        }
        return f1Var;
    }
}
