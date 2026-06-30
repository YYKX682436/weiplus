package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes8.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f225544a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f225545b = new java.util.ArrayList();

    public static void a(java.lang.String str, boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.l0 l0Var) {
        java.lang.String str2;
        android.net.NetworkInfo activeNetworkInfo;
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        ((v60.u) ((w60.i) i95.n0.c(w60.i.class))).getClass();
        com.p314xaae8f345.mm.p944x882e457a.o b17 = com.p314xaae8f345.mm.p957x53236a1b.j0.b(str, 0);
        r45.r83 r83Var = (r45.r83) b17.f152243a.f152217a;
        r83Var.f466143d = 2;
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = str;
        du5Var.f454290e = true;
        r83Var.f466148i = du5Var;
        r83Var.f466151o = i17;
        r83Var.f466152p = "";
        r83Var.f466155s = 0;
        r83Var.f466157u = 0;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            if (activeNetworkInfo.getType() == 1) {
                str2 = "WIFI";
            } else if (activeNetworkInfo.getExtraInfo() != null) {
                str2 = activeNetworkInfo.getExtraInfo().toLowerCase();
            }
            r83Var.f466158v = str2;
            r83Var.f466161y = currentTimeMillis;
            r83Var.f466162z = "";
            r83Var.A = 0;
            r45.du5 du5Var2 = new r45.du5();
            du5Var2.f454289d = "";
            du5Var2.f454290e = true;
            r83Var.f466145f = du5Var2;
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(f225544a);
            r83Var.B = cu5Var;
            ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(b17, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.j0(l0Var, (r45.r83) b17.f152243a.f152217a, z17));
        }
        str2 = "no";
        r83Var.f466158v = str2;
        r83Var.f466161y = currentTimeMillis;
        r83Var.f466162z = "";
        r83Var.A = 0;
        r45.du5 du5Var22 = new r45.du5();
        du5Var22.f454289d = "";
        du5Var22.f454290e = true;
        r83Var.f466145f = du5Var22;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(f225544a);
        r83Var.B = cu5Var2;
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(b17, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.j0(l0Var, (r45.r83) b17.f152243a.f152217a, z17));
    }
}
