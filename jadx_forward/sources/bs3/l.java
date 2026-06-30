package bs3;

/* loaded from: classes.dex */
public final class l extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f105533d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f105534e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f105533d = jz5.h.b(new bs3.i(this));
        this.f105534e = jz5.h.b(new bs3.k(this));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 O6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4) ((jz5.n) this.f105533d).mo141623x754a37bb();
    }

    public final void P6() {
        int size;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 O6 = O6();
        if (O6 == null) {
            return;
        }
        jz5.g gVar = this.f105534e;
        if (((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb()) == null) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb(), true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2 n2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2.f235073a;
        int i17 = 0;
        if (n17 != null && (size = n2Var.e(n17.d1()).size()) > 0) {
            i17 = size;
        }
        if (i17 <= 0) {
            O6.m67737xe9f5bdb7(null);
            return;
        }
        java.lang.String string = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oce, java.lang.Integer.valueOf(i17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        O6.m67737xe9f5bdb7(string);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 == 104) {
            P6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        if (O6() == null) {
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4((java.lang.String) ((jz5.n) this.f105534e).mo141623x754a37bb())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 O6 = O6();
            if (O6 == null) {
                return;
            }
            O6.setVisibility(8);
            return;
        }
        P6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 O62 = O6();
        if (O62 != null) {
            O62.setOnClickListener(new bs3.j(this));
        }
    }
}
