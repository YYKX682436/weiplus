package sx4;

/* loaded from: classes8.dex */
public class o0 extends sx4.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sx4.q0 f495168b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(sx4.q0 q0Var, sx4.g0 g0Var) {
        super(q0Var.f495187c);
        this.f495168b = q0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void g(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        sx4.q0 q0Var = this.f495168b;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = q0Var.f495187c.J3;
        if (c10723x8ab106bc.F == 0) {
            c10723x8ab106bc.F = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b activityC19411xef36c7b = q0Var.f495187c;
        sx4.d0 d0Var = activityC19411xef36c7b.L3;
        if (d0Var.f495119e == 0) {
            d0Var.f495119e = java.lang.System.currentTimeMillis();
        }
        android.widget.ProgressBar progressBar = activityC19411xef36c7b.f265376p;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        ((vz4.x) activityC19411xef36c7b.C3).h(c27816xac2547f9, str);
        sx4.u uVar = this.f495111a.B3.f495199f;
        uVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sx4.v vVar = uVar.f495193a;
        vVar.f495196c = currentTimeMillis;
        vVar.f495197d = java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void h(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        sx4.q0 q0Var = this.f495168b;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = q0Var.f495187c.J3;
        if (c10723x8ab106bc.E == 0) {
            c10723x8ab106bc.E = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b activityC19411xef36c7b = q0Var.f495187c;
        sx4.d0 d0Var = activityC19411xef36c7b.L3;
        if (d0Var.f495118d == 0) {
            d0Var.f495118d = java.lang.System.currentTimeMillis();
        }
        vz4.x xVar = (vz4.x) activityC19411xef36c7b.C3;
        xVar.getClass();
        xVar.f523287b = java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b activityC19411xef36c7b = this.f495168b.f495187c;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b.S3;
        android.widget.ProgressBar progressBar = activityC19411xef36c7b.f265376p;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }
}
