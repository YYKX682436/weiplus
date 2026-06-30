package tv;

/* loaded from: classes8.dex */
public abstract class a {
    public static java.lang.String a() {
        return ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Zi() ? g83.a.c() : "wcf://bizimg/";
    }

    public static java.lang.String b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        if (((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Zi()) {
            java.lang.String c17 = g83.a.c();
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            return java.lang.String.format("%spic_%s", c17, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
        }
        if (!gm0.j1.b().m()) {
            return "";
        }
        return java.lang.String.format("%s%s", "wcf://bizimg/", kk.k.g((gm0.j1.b().j() + str).getBytes()));
    }
}
