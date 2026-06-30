package hy4;

/* loaded from: classes8.dex */
public final class n0 implements o04.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r01.h0 f367715d;

    public n0(java.lang.String str, java.lang.String str2, java.lang.String str3, r01.h0 h0Var) {
        this.f367712a = str;
        this.f367713b = str2;
        this.f367714c = str3;
        this.f367715d = h0Var;
    }

    @Override // o04.p
    public r45.x60 a() {
        java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.odq);
        java.lang.String str = this.f367712a;
        if (str.length() > 0) {
            ((r01.l1) i95.n0.c(r01.l1.class)).getClass();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.F3(str) && ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ui()) {
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.pba);
            }
        }
        r45.x60 x60Var = new r45.x60();
        x60Var.f471346d = this.f367713b;
        x60Var.f471347e = "1";
        x60Var.f471349g = g17;
        r45.ea7 ea7Var = new r45.ea7();
        ea7Var.f454737d = this.f367714c;
        ea7Var.f454738e = this.f367715d.f449635j;
        try {
            x60Var.f471348f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(ea7Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewRestorePageHelper", "set customInfo exception:%s", e17.getMessage());
        }
        return x60Var;
    }
}
