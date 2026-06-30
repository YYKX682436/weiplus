package hr3;

/* loaded from: classes9.dex */
public abstract class d8 implements t25.a, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f365009d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365010e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f365011f;

    /* renamed from: g, reason: collision with root package name */
    public final hr3.i9 f365012g;

    public d8(android.content.Context context, hr3.i9 i9Var) {
        this.f365009d = context;
        this.f365012g = i9Var;
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
        c01.d9.b().p().a(this);
        this.f365010e = z3Var;
        this.f365011f = rVar;
        b();
        return true;
    }

    public abstract void a(boolean z17);

    public void b() {
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365011f).t();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365011f).g(com.p314xaae8f345.mm.R.xml.f576377q);
        boolean z17 = (c01.z1.n() & 32768) == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16856x15855336 c16856x15855336 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16856x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365011f).h("contact_info_header_helper");
        if (c16856x15855336 != null) {
            c16856x15855336.N(this.f365010e, this.f365012g);
        }
        if (z17) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365011f).w("contact_info_plugin_install");
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365011f).w("contact_info_plugin_view");
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365011f).w("contact_info_plugin_clear_data");
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365011f).w("contact_info_plugin_uninstall");
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(obj, 0);
        if (a1Var != c01.d9.b().p() || o17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetPlugin", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
        } else if (o17 == 40 || o17 == 34 || o17 == 7) {
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
        hr3.i9 i9Var;
        c01.d9.b().p().e(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16856x15855336 c16856x15855336 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16856x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f365011f).h("contact_info_header_helper");
        if (c16856x15855336 == null || (i9Var = c16856x15855336.R) == null) {
            return true;
        }
        i9Var.mo133943x3f5eee52();
        return true;
    }
}
