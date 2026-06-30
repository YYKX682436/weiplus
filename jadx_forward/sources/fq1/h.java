package fq1;

/* loaded from: classes8.dex */
public abstract class h {
    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a(com.p314xaae8f345.mm.ui.ga gaVar, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar2) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 x17 = gaVar.x();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293260q = bp.b.m10969xb866ec1c(gaVar.x().getResources(), com.p314xaae8f345.mm.R.raw.f78968xd6d29e07, null);
        aVar.D = false;
        aVar.T = 3;
        aVar.A = false;
        aVar.B = false;
        aVar.f293246c = str;
        aVar.R = 17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(x17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 x18 = gaVar.x();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || str3.length() == 0) {
            str3 = x18.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572474bb3);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || str2.length() == 0) {
            str2 = x18.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        }
        j0Var.A(str3, true, new fq1.f(j0Var, jVar2));
        j0Var.w(str2, true, new fq1.g(j0Var, jVar));
        j0Var.x(gaVar.x().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp));
        j0Var.show();
        return j0Var;
    }
}
