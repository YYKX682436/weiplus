package in4;

/* loaded from: classes9.dex */
public class b implements t25.a, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f374477d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f374478e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f374479f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f374480g;

    public b(android.content.Context context) {
        this.f374477d = context;
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        this.f374479f = rVar;
        this.f374478e = z3Var;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
        h0Var.g(com.p314xaae8f345.mm.R.xml.f576391a2);
        gm0.j1.u().c().a(this);
        this.f374480g = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h0Var.h("contact_info_top_story_not_disturb");
        b();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean equals = "contact_info_go_to_top_story".equals(str);
        android.content.Context context = this.f374477d;
        if (equals) {
            o11.g gVar = wm4.u.f528842a;
            wm4.u.u(context, 0, new android.os.Bundle(), "", new java.util.HashMap());
        } else {
            if ("contact_info_top_story_install".equals(str)) {
                a(true);
            } else if ("contact_info_top_story_uninstall".equals(str)) {
                db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new in4.a(this), null);
            } else if ("contact_info_top_story_not_disturb".equals(str)) {
                int o17 = c01.z1.o();
                gm0.j1.u().c().w(40, java.lang.Integer.valueOf(this.f374480g.N() ? o17 & (-16777217) : o17 | com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb));
                r45.p53 p53Var = new r45.p53();
                p53Var.f464294d = 55;
                p53Var.f464295e = this.f374480g.N() ? 2 : 1;
                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(55, p53Var));
            }
        }
        return false;
    }

    public final void a(boolean z17) {
        int n17 = c01.z1.n();
        gm0.j1.u().c().w(34, java.lang.Integer.valueOf(z17 ? n17 & (-67108865) : n17 | 67108864));
        r45.u85 u85Var = new r45.u85();
        u85Var.f468669d = 67108864;
        u85Var.f468670e = !z17 ? 1 : 0;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(39, u85Var));
        b();
        if (!z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k("topstoryapp");
            return;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("topstoryapp") == null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
            l4Var.b2("topstoryapp");
            l4Var.l1(this.f374477d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572537bj2));
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            l4Var.n1(java.lang.System.currentTimeMillis());
            l4Var.M1(0);
            l4Var.Y1(0);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var);
        }
    }

    public final void b() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f374479f).h("contact_info_header_helper");
        c19708x15855336.M(this.f374478e.d1(), this.f374478e.g2(), this.f374477d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572537bj2));
        if ((c01.z1.n() & 67108864) == 0) {
            c19708x15855336.N(1);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f374479f).m("contact_info_top_story_install", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f374479f).m("contact_info_top_story_uninstall", false);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f374479f).m("contact_info_go_to_top_story", false);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f374479f).m("contact_info_top_story_not_disturb", false);
        } else {
            c19708x15855336.N(0);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f374479f).m("contact_info_top_story_install", false);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f374479f).m("contact_info_top_story_uninstall", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f374479f).m("contact_info_go_to_top_story", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f374479f).m("contact_info_top_story_not_disturb", true);
        }
        if ((c01.z1.o() & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) == 0) {
            this.f374480g.O(true);
        } else {
            this.f374480g.O(false);
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(obj, 0);
        if (a1Var != gm0.j1.u().c() || o17 <= 0) {
            return;
        }
        if (o17 == 40 || o17 == 34 || o17 == 7) {
            b();
        }
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    /* renamed from: onDetach */
    public boolean mo67450x3f5eee52() {
        gm0.j1.u().c().e(this);
        return true;
    }
}
