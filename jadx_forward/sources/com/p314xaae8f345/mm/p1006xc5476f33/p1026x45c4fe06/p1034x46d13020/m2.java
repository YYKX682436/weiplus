package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public class m2 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public int f158050d = 0;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.n2 n2Var) {
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.f172083a).remove(this);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this);
        int i18 = this.f158050d;
        this.f158050d = i18 + 1;
        if (i18 < 1 && z17) {
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaapp/uploaduserlocationinfo";
            lVar.f152200d = 1154;
            lVar.f152198b = new r45.wu6();
            r45.vu6 vu6Var = new r45.vu6();
            vu6Var.f470120d = f18;
            vu6Var.f470121e = f17;
            vu6Var.f470123g = d18;
            lVar.f152197a = vu6Var;
            com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l2(this, f17, f18, d18), true);
        }
        return true;
    }
}
