package hr3;

/* loaded from: classes9.dex */
public final class n8 implements t25.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f365360d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365361e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f365362f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f365363g;

    public n8(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f365360d = context;
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        this.f365362f = rVar;
        this.f365361e = z3Var;
        if (rVar != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).g(com.p314xaae8f345.mm.R.xml.f576388dg);
        }
        java.lang.Object h17 = rVar != null ? ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("contact_info_schedule_msg_sticky") : null;
        this.f365363g = h17 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17 : null;
        a();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "contact_info_schedule_msg_sticky")) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = this.f365363g;
            if (c21541x1c1b08fe != null && c21541x1c1b08fe.N()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f365361e;
                c01.e2.t0(z3Var != null ? z3Var.d1() : null, true, true);
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = this.f365361e;
                c01.e2.B0(z3Var2 != null ? z3Var2.d1() : null, true, true);
            }
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[2];
            java.lang.String str2 = pj5.u.f436940a;
            if (str2 == null) {
                str2 = "";
            }
            lVarArr[0] = new jz5.l("reminder_sessionid", str2);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = this.f365363g;
            lVarArr[1] = new jz5.l("pin_btn_clk", java.lang.Integer.valueOf(c21541x1c1b08fe2 != null && c21541x1c1b08fe2.N() ? 1 : 2));
            ((cy1.a) rVar).Hj("pin_reminder_btn", "view_clk", kz5.c1.k(lVarArr), 35684);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "contact_info_schedule_msg_clear_data")) {
            android.content.Context context = this.f365360d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            u1Var.g(context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nlm) : null);
            u1Var.j(context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nlk) : null);
            u1Var.n(context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nll) : null);
            u1Var.b(new hr3.m8(this));
            u1Var.q(false);
        }
        return false;
    }

    public final void a() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.f365362f;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = rVar != null ? ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("contact_info_header_helper") : null;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = h17 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 ? (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) h17 : null;
        if (c19708x15855336 == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f365361e;
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = this.f365361e;
        java.lang.String g27 = z3Var2 != null ? z3Var2.g2() : null;
        android.content.Context context = this.f365360d;
        c19708x15855336.M(d17, g27, context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nln) : null);
        c19708x15855336.N(2);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = this.f365363g;
        if (c21541x1c1b08fe == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.l8 r17 = c01.d9.b().r();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3 = this.f365361e;
        c21541x1c1b08fe.O(((com.p314xaae8f345.mm.p2621x8fb0427b.m4) r17).K(z3Var3 != null ? z3Var3.d1() : null));
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    /* renamed from: onDetach */
    public boolean mo67450x3f5eee52() {
        return true;
    }
}
