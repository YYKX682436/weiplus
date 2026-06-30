package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public abstract class e3 {
    public static java.lang.String a(int i17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? "" : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575093kq2) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575092kq1) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575095kq4) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575094kq3) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kqg);
    }

    public static void b(android.content.Context context, r45.oa5 oa5Var) {
        if (oa5Var == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293262s = oa5Var.f463629d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oa5Var.f463634i)) {
            aVar.f293266w = oa5Var.f463634i;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oa5Var.f463635m)) {
            aVar.f293265v = oa5Var.f463635m;
        }
        aVar.A = false;
        aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.d3(oa5Var, context);
        aVar.Z = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
    }
}
