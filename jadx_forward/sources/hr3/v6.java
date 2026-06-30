package hr3;

/* loaded from: classes11.dex */
public class v6 implements t25.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f365634d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365635e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f365636f;

    /* renamed from: g, reason: collision with root package name */
    public cr3.d0 f365637g;

    public v6(android.content.Context context) {
        this.f365634d = context;
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, z3Var != null);
        java.lang.String d17 = z3Var.d1();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (d17 == null) {
            d17 = "";
        }
        iz5.a.g(null, d17.length() > 0);
        iz5.a.g(null, rVar != null);
        this.f365635e = z3Var;
        android.content.Context context = this.f365634d;
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).getIntent().putExtra("Contact_Scene", 25);
        if (this.f365637g == null) {
            this.f365637g = new cr3.d0((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, z3Var);
        }
        mo67450x3f5eee52();
        this.f365636f = rVar;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        h0Var.t();
        h0Var.g(com.p314xaae8f345.mm.R.xml.f576373n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a) h0Var.h("contact_info_header_normal");
        if (viewOnClickListenerC16860xc669c20a != null) {
            viewOnClickListenerC16860xc669c20a.S = h0Var;
            viewOnClickListenerC16860xc669c20a.M(z3Var, 25, z17, null);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced c21554xcdf33ced = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced) h0Var.h("contact_info_signature");
        java.lang.String str = z3Var.V;
        if (str == null || str.trim().equals("")) {
            h0Var.v(c21554xcdf33ced);
        } else if (c21554xcdf33ced != null) {
            c21554xcdf33ced.P = false;
            c21554xcdf33ced.L(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bhc));
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = z3Var.V;
            ((ke0.e) xVar).getClass();
            c21554xcdf33ced.H(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2));
            c21554xcdf33ced.O(false);
            c21554xcdf33ced.E(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16858xa77bc0e6 c16858xa77bc0e6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16858xa77bc0e6) h0Var.h("contact_profile_multi_button");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ak6);
        hr3.u6 u6Var = new hr3.u6(this);
        c16858xa77bc0e6.L = string;
        c16858xa77bc0e6.N = u6Var;
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        if (!str.equals("contact_profile_say_hi")) {
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f365635e.d1());
        intent.putExtra("Contact_Scene", 25);
        intent.putExtra("AntispamTicket", this.f365635e.F1);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.z(intent, this.f365634d);
        return true;
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    /* renamed from: onDetach */
    public boolean mo67450x3f5eee52() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.f365636f;
        if (rVar == null) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("contact_info_header_normal");
        if (viewOnClickListenerC16860xc669c20a != null) {
            viewOnClickListenerC16860xc669c20a.T();
        }
        cr3.d0 d0Var = this.f365637g;
        if (d0Var != null) {
            ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).c(d0Var);
        }
        return true;
    }
}
