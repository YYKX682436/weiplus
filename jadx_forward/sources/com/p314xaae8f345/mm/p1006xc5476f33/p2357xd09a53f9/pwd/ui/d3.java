package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class d3 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.rr6 f260521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c f260522b;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c activityC19056xd4c1806c, r45.rr6 rr6Var) {
        this.f260522b = activityC19056xd4c1806c;
        this.f260521a = rr6Var;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public void mo2289xd6191dc1(boolean z17) {
        r45.qr6 qr6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUniversalPayOrderUI", "click switch: %s", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c activityC19056xd4c1806c = this.f260522b;
        activityC19056xd4c1806c.f260491d.m82180x5f152dab(z17);
        r45.rr6 rr6Var = this.f260521a;
        if (z17) {
            if (rr6Var.f466694n != 1 || (qr6Var = rr6Var.f466695o) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qr6Var.f465764d)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c.U6(activityC19056xd4c1806c);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUniversalPayOrderUI", "show open dialog");
                r45.qr6 qr6Var2 = rr6Var.f466695o;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19056xd4c1806c.mo55332x76847179();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                aVar.f293242a = qr6Var2.f465764d;
                aVar.f293262s = qr6Var2.f465765e;
                aVar.A = false;
                r45.b74 b74Var = qr6Var2.f465766f;
                if (b74Var != null) {
                    aVar.f293266w = b74Var.f452135d;
                    aVar.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.z2(this);
                }
                r45.b74 b74Var2 = qr6Var2.f465767g;
                if (b74Var2 != null) {
                    aVar.f293265v = b74Var2.f452135d;
                    aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.a3(this);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                j0Var.e(aVar);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
                if (d0Var != null) {
                    d0Var.a(j0Var.f293370r);
                }
                activityC19056xd4c1806c.mo53058xe5d1a549(j0Var);
                j0Var.show();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16343, 3);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16343, 2);
            return;
        }
        if (activityC19056xd4c1806c.f260502r) {
            activityC19056xd4c1806c.f260502r = false;
            r45.qr6 qr6Var3 = rr6Var.f466696p;
            if (qr6Var3 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qr6Var3.f465764d)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c.V6(activityC19056xd4c1806c);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUniversalPayOrderUI", "show close dialog");
                r45.qr6 qr6Var4 = rr6Var.f466696p;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC19056xd4c1806c.mo55332x76847179();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                aVar2.f293242a = qr6Var4.f465764d;
                aVar2.f293262s = qr6Var4.f465765e;
                aVar2.A = false;
                r45.b74 b74Var3 = qr6Var4.f465766f;
                if (b74Var3 != null) {
                    aVar2.f293266w = b74Var3.f452135d;
                    aVar2.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.b3(this);
                }
                r45.b74 b74Var4 = qr6Var4.f465767g;
                if (b74Var4 != null) {
                    aVar2.f293265v = b74Var4.f452135d;
                    aVar2.E = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.c3(this);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x768471792, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                j0Var2.e(aVar2);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var2 = aVar2.f293256m;
                if (d0Var2 != null) {
                    d0Var2.a(j0Var2.f293370r);
                }
                activityC19056xd4c1806c.mo53058xe5d1a549(j0Var2);
                j0Var2.show();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16343, 7);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c.V6(activityC19056xd4c1806c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16343, 6);
    }
}
