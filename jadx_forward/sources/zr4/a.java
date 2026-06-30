package zr4;

/* loaded from: classes9.dex */
public abstract class a {
    public static as4.b a(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05, boolean z17) {
        java.lang.String str;
        if (c19090x75920c71 == null || c19099x8d444f05 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "empty authen or orders");
            return null;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = c19090x75920c71.f261090v;
        if (c19760x34448d56 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "get reqKey from payInfo");
            str = c19760x34448d56.f273647m;
        } else {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "get reqKey from orders");
            str = c19099x8d444f05.f261208e;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "empty reqKey!");
            return new as4.b(c19090x75920c71, c19099x8d444f05, z17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "authen reqKey: %s", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "authen go new split cgi");
        return str.startsWith("sns_aa_") ? new as4.a(c19090x75920c71, c19099x8d444f05, z17) : str.startsWith("sns_tf_") ? new as4.m(c19090x75920c71, c19099x8d444f05, z17) : str.startsWith("sns_ff_") ? new as4.e(c19090x75920c71, c19099x8d444f05, z17) : str.startsWith("ts_") ? new as4.g(c19090x75920c71, c19099x8d444f05, z17) : str.startsWith("sns_") ? new as4.j(c19090x75920c71, c19099x8d444f05, z17) : str.startsWith("offline_") ? new as4.h(c19090x75920c71, c19099x8d444f05, z17) : str.startsWith("up_") ? new as4.n(c19090x75920c71, c19099x8d444f05, z17) : str.startsWith("seb_ff_") ? new as4.i(c19090x75920c71, c19099x8d444f05, z17) : str.startsWith("tax_") ? new as4.l(c19090x75920c71, c19099x8d444f05, z17) : str.startsWith("dc_") ? new as4.d(c19090x75920c71, c19099x8d444f05, z17) : new as4.b(c19090x75920c71, c19099x8d444f05, z17);
    }

    public static as4.c b(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05, boolean z17) {
        boolean z18;
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56;
        boolean z19 = false;
        if (vr4.f1.wi().Ai().f95537m == null || (c19760x34448d56 = c19090x75920c71.f261090v) == null || z17) {
            z18 = false;
        } else {
            int i17 = c19760x34448d56.f273642e;
            z18 = true;
            if (i17 == 31 || i17 == 32 || i17 == 33 || i17 == 42 || i17 == 37 || i17 == 56) {
                z18 = false;
                z19 = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "isLqtSns: %s, isLqtTs: %s, isBalance: %s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        return z19 ? new as4.k(c19090x75920c71, c19099x8d444f05, z17) : z18 ? new as4.f(c19090x75920c71, c19099x8d444f05, z17) : new as4.c(c19090x75920c71, c19099x8d444f05, z17);
    }

    public static ds4.b c(at4.z0 z0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05) {
        boolean z17;
        boolean z18 = false;
        if (vr4.f1.wi().Ai().f95537m == null || z0Var.f95568n == null || !z0Var.f95559e.equals(vr4.f1.wi().Ai().f95537m.f69223x58802fcb)) {
            z17 = false;
        } else {
            int i17 = z0Var.f95568n.f273642e;
            z17 = true;
            if (i17 == 31 || i17 == 32 || i17 == 33 || i17 == 42 || i17 == 37 || i17 == 56) {
                z17 = false;
                z18 = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "isLqtSns: %s, isLqtTs: %s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        return z18 ? new ds4.i(z0Var, c19099x8d444f05) : z17 ? new ds4.e(z0Var, c19099x8d444f05) : new ds4.b(z0Var, c19099x8d444f05);
    }

    public static ds4.g d(at4.z0 z0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05) {
        java.lang.String str;
        if (z0Var == null || c19099x8d444f05 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiManager", "empty verify or orders");
            return null;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = z0Var.f95568n;
        if (c19760x34448d56 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "get reqKey from payInfo");
            str = c19760x34448d56.f273647m;
        } else {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "get reqKey from orders");
            str = c19099x8d444f05.f261208e;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "empty reqKey!");
            return new ds4.g(z0Var, c19099x8d444f05);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "verify reqKey: %s", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiManager", "verify go new split cgi");
        return str.startsWith("sns_aa_") ? new ds4.a(z0Var, c19099x8d444f05) : str.startsWith("sns_tf_") ? new ds4.l(z0Var, c19099x8d444f05) : str.startsWith("sns_ff_") ? new ds4.d(z0Var, c19099x8d444f05) : str.startsWith("ts_") ? new ds4.f(z0Var, c19099x8d444f05) : str.startsWith("sns_") ? new ds4.j(z0Var, c19099x8d444f05) : str.startsWith("up_") ? new ds4.m(z0Var, c19099x8d444f05) : str.startsWith("seb_ff_") ? new ds4.h(z0Var, c19099x8d444f05) : str.startsWith("tax_") ? new ds4.k(z0Var, c19099x8d444f05) : str.startsWith("dc_") ? new ds4.c(z0Var, c19099x8d444f05) : new ds4.g(z0Var, c19099x8d444f05);
    }
}
