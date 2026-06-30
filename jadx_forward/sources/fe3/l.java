package fe3;

/* loaded from: classes7.dex */
public abstract class l {
    public static java.lang.String a() {
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("magicPath"), true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17)) {
            return null;
        }
        java.lang.String str = i17 + "/biz";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgPath", "getMagicBizRoot path:%s", str);
        return str;
    }

    public static java.lang.String b() {
        return com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("magicDebugPath"), true) + "/";
    }

    public static java.lang.String c() {
        java.lang.String e17 = e();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            return null;
        }
        return e17 + "/network/temp/";
    }

    public static java.lang.String d(java.lang.String str) {
        java.lang.String e17 = e();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            return null;
        }
        java.lang.String str2 = e17 + "/pkg/" + str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgPath", "getMagicPkgRoot path:%s", str2);
        return str2;
    }

    public static java.lang.String e() {
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("magicPath"), true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17)) {
            return null;
        }
        java.lang.String str = i17 + "/magicpkg";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgPath", "getMagicRoot path:%s", str);
        return str;
    }

    public static boolean f(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd) {
        if (c16421xe4d4fcd != null) {
            try {
                java.lang.String str = c16421xe4d4fcd.f229394g;
                java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16421xe4d4fcd.f229396i) ? bf3.b0.f101145a.a(c16421xe4d4fcd.f229395h) : c16421xe4d4fcd.f229394g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgPath", "pkgFileExist pkgId:%s,pid:%s,md5:%s,wxaPkgPath:%s", c16421xe4d4fcd.f229391d, c16421xe4d4fcd.f229398n, c16421xe4d4fcd.f229393f, a17);
                if (com.p314xaae8f345.mm.vfs.w6.j(a17) && com.p314xaae8f345.mm.vfs.w6.j(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgPath", "wxapkg exist");
                    return true;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MagicPkgPath", e17, "pkgFileExist", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgPath", "pkg not exist");
        return false;
    }
}
