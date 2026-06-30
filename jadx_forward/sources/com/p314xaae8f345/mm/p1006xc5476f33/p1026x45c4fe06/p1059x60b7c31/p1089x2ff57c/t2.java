package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes8.dex */
public class t2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.u2 f162665d;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.u2 u2Var) {
        this.f162665d = u2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a2;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a3;
        java.lang.String str9;
        java.lang.String str10;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.u2 u2Var = this.f162665d;
        if (itemId == 0) {
            str = u2Var.f162666a.f162561g;
            by5.s0.j(str);
            uh0.r rVar = (uh0.r) i95.n0.c(uh0.r.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.a aVar = u2Var.f162666a;
            m50421x3c6fed6a = aVar.m50421x3c6fed6a();
            str2 = aVar.f162559e;
            str3 = aVar.f162560f;
            str4 = aVar.f162561g;
            ((th0.u) rVar).getClass();
            com.p314xaae8f345.mm.p2829xfa87f9de.i.f(m50421x3c6fed6a, str2, str3, str4, 0L, "", false);
            return;
        }
        if (itemId == 1) {
            str5 = u2Var.f162666a.f162561g;
            by5.s0.i(str5);
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.a aVar2 = u2Var.f162666a;
            m50421x3c6fed6a2 = aVar2.m50421x3c6fed6a();
            str6 = aVar2.f162559e;
            str7 = aVar2.f162560f;
            str8 = aVar2.f162561g;
            ((ht.a) vVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.m(m50421x3c6fed6a2, str6, str7, str8, 8);
            return;
        }
        if (itemId == 2) {
            if (u2Var.f162666a.m50422x8f77ef41() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.a aVar3 = u2Var.f162666a;
                if (aVar3.m50422x8f77ef41().f159902q != null) {
                    aVar3.m50422x8f77ef41().f159902q.B(false);
                    return;
                }
                return;
            }
            return;
        }
        if (itemId == 3) {
            if (u2Var.f162666a.m50422x8f77ef41() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.a aVar4 = u2Var.f162666a;
                if (aVar4.m50422x8f77ef41().f159902q != null) {
                    aVar4.m50422x8f77ef41().f159902q.B(true);
                    return;
                }
                return;
            }
            return;
        }
        if (itemId == 4) {
            u2Var.f162666a.F();
            return;
        }
        if (itemId != 5) {
            return;
        }
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        m50421x3c6fed6a3 = u2Var.f162666a.m50421x3c6fed6a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.a aVar5 = u2Var.f162666a;
        str9 = aVar5.f162559e;
        str10 = aVar5.f162560f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.s2 s2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.s2(this);
        ((yb0.g) b0Var).getClass();
        com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.e(m50421x3c6fed6a3, str9, str10, s2Var);
    }
}
