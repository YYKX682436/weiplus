package zw1;

/* loaded from: classes15.dex */
public class v3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.x3 f558360d;

    public v3(zw1.x3 x3Var) {
        this.f558360d = x3Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        zw1.x3 x3Var = this.f558360d;
        g0Var.d(25983, 7, java.lang.Integer.valueOf(x3Var.f558377a));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3.W6(x3Var.f558379c, x3Var.f558377a)) {
            g4Var.add(0, 1, 0, com.p314xaae8f345.mm.R.C30867xcad56011.b_1);
        } else {
            g4Var.add(0, 1, 0, com.p314xaae8f345.mm.R.C30867xcad56011.b_c);
        }
        for (int i17 = 0; i17 < x3Var.f558378b.size(); i17++) {
            r45.uk4 uk4Var = (r45.uk4) x3Var.f558378b.get(i17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uk4Var.f468965e)) {
                g4Var.add(0, i17 + 1 + 1, 0, uk4Var.f468965e);
            }
        }
    }
}
