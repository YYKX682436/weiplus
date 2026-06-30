package i21;

/* loaded from: classes10.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public static i21.q f369448a;

    public static i21.q h() {
        if (f369448a == null) {
            f369448a = new i21.q();
        }
        return f369448a;
    }

    public java.lang.String a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.lang.String a17 = gw3.a.a();
        java.lang.String g17 = kk.k.g((str + "ZnVjaw==").getBytes());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) || !a17.endsWith("/")) {
            return null;
        }
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.h1.b(g17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            return null;
        }
        return a17 + b17;
    }

    public java.lang.String b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.h1.c(gw3.a.a(), "remark_", kk.k.g((str + "ZnVjaw==").getBytes()), ".png", 1);
    }

    public java.lang.String c(java.lang.String str, int i17) {
        java.lang.String str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        if (i17 > 0) {
            str2 = "_" + java.lang.Integer.toString(i17);
        } else {
            str2 = "";
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.h1.c(gw3.a.a(), "remark_", kk.k.g((str + "ZnVjaw==").getBytes()) + str2, ".png", 1);
    }

    public java.lang.String d(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.lang.String str3 = "_" + kk.k.g(str2.getBytes());
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.h1.c(gw3.a.a(), "remark_", kk.k.g((str + "ZnVjaw==").getBytes()) + str3, ".png", 1);
    }

    public java.lang.String e(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return f(str) + ("_" + kk.k.g(str2.getBytes())) + ".png";
    }

    public java.lang.String f(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return "remark_" + kk.k.g((str + "ZnVjaw==").getBytes());
    }

    public java.lang.String g(java.lang.String str) {
        return com.p314xaae8f345.mm.vfs.q7.c("sayhi") + "/" + ("pic_" + kk.k.g(str.getBytes()));
    }

    public boolean i(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(b(str));
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            return m17.f294799a.F(m17.f294800b);
        }
        return false;
    }
}
