package fy;

/* loaded from: classes11.dex */
public final class i implements ey.o {

    /* renamed from: b, reason: collision with root package name */
    public static final fy.i f348703b = new fy.i();

    public static final boolean c(fy.i iVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        iVar.getClass();
        java.lang.String d17 = z3Var.d1();
        boolean z17 = true;
        if (d17 != null) {
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(d17) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(z3Var.f1()) && !c01.e2.W(d17) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(d17) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(d17)) {
                z17 = false;
            }
            if (z17) {
                z3Var.P0();
            }
        }
        return z17;
    }

    @Override // ey.o
    public java.lang.String a() {
        return "contact";
    }

    @Override // ey.o
    public java.util.Map b() {
        return kz5.c1.k(new jz5.l("search_contacts", fy.e.f348699d), new jz5.l("search_contacts_by_pinyin", fy.g.f348701d), new jz5.l("display_contact_list", fy.h.f348702d));
    }
}
