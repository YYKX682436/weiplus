package db2;

/* loaded from: classes8.dex */
public final class x4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.u f309767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309768b;

    public x4(yz5.u uVar, java.lang.String str) {
        this.f309767a = uVar;
        this.f309768b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.i23 i23Var;
        r45.i23 i23Var2;
        r45.i23 i23Var3;
        r45.i23 i23Var4;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = 2;
        int i18 = 0;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.l23 l23Var = (r45.l23) fVar.f152151d;
            java.lang.String m75945x2fec8307 = (l23Var == null || (i23Var4 = (r45.i23) l23Var.m75936x14adae67(1)) == null) ? null : i23Var4.m75945x2fec8307(0);
            r45.l23 l23Var2 = (r45.l23) fVar.f152151d;
            if (l23Var2 != null && (i23Var3 = (r45.i23) l23Var2.m75936x14adae67(1)) != null) {
                i18 = i23Var3.m75939xb282bd08(1);
            }
            r45.l23 l23Var3 = (r45.l23) fVar.f152151d;
            if (l23Var3 != null && (i23Var2 = (r45.i23) l23Var3.m75936x14adae67(1)) != null) {
                i17 = i23Var2.m75939xb282bd08(4);
            }
            r45.l23 l23Var4 = (r45.l23) fVar.f152151d;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (l23Var4 == null || (i23Var = (r45.i23) l23Var4.m75936x14adae67(1)) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) i23Var.m75936x14adae67(5);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307) || m75945x2fec8307 == null) {
                this.f309767a.K(java.lang.Integer.valueOf(db2.z4.f309795d), "", this.f309768b, "", java.lang.Integer.valueOf(i18), 2, c19786x6a1e2862);
            } else {
                yz5.u uVar = this.f309767a;
                java.util.Map map = db2.z4.f309792a;
                uVar.K(0, "", this.f309768b, m75945x2fec8307, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), c19786x6a1e2862);
            }
        } else {
            this.f309767a.K(java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c, this.f309768b, "", 0, 2, null);
        }
        return jz5.f0.f384359a;
    }
}
