package zw1;

/* loaded from: classes15.dex */
public class i1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.k1 f558192d;

    public i1(zw1.k1 k1Var) {
        this.f558192d = k1Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        if (tw1.f.Di().Ri()) {
            g4Var.add(0, 1, 0, com.p314xaae8f345.mm.R.C30867xcad56011.b_1);
        } else {
            g4Var.add(0, 1, 0, com.p314xaae8f345.mm.R.C30867xcad56011.b_c);
        }
        zw1.k1 k1Var = this.f558192d;
        if (k1Var.f558219d != null) {
            for (int i17 = 0; i17 < k1Var.f558219d.size(); i17++) {
                r45.uk4 uk4Var = (r45.uk4) k1Var.f558219d.get(i17);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uk4Var.f468965e)) {
                    g4Var.add(0, i17 + 1 + 1, 0, uk4Var.f468965e);
                }
            }
        }
    }
}
