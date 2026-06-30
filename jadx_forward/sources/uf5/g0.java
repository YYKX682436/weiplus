package uf5;

/* loaded from: classes10.dex */
public class g0 extends uf5.w0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22346xe85a7ad0 f508763s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22346xe85a7ad0 activityC22346xe85a7ad0, com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var) {
        super(activityC22346xe85a7ad0, l4Var);
        this.f508763s = activityC22346xe85a7ad0;
    }

    @Override // uf5.w0, com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        super.s();
        gm0.j1.i();
        android.database.Cursor U = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U(null, this.f508850q, "@social.black.android", "", this.f288121m);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22346xe85a7ad0 activityC22346xe85a7ad0 = this.f508763s;
        activityC22346xe85a7ad0.f288633d.clear();
        if (U != null) {
            for (int i17 = 0; U.moveToPosition(i17); i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                z3Var.mo9015xbf5d97fd(U);
                activityC22346xe85a7ad0.f288633d.add(z3Var.d1());
            }
        }
        U.close();
    }

    @Override // uf5.w0
    public java.lang.String v() {
        return "@social.black.android";
    }
}
