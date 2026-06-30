package c01;

/* loaded from: classes9.dex */
public abstract class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Set f37047a = new java.util.HashSet();

    public static java.lang.String a(java.lang.String str) {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        return (n17 == null || com.tencent.mm.sdk.platformtools.t8.K0(n17.w0())) ? "" : com.tencent.mm.contact.s.q3(n17.w0());
    }

    public static java.lang.String b(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null) {
            return str;
        }
        if (com.tencent.mm.storage.z3.R4(str) && com.tencent.mm.sdk.platformtools.t8.K0(n17.P0())) {
            java.lang.String displayName = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().getDisplayName(str);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(displayName)) {
                return displayName;
            }
        }
        return (n17.f2() == null || n17.f2().length() <= 0) ? com.tencent.mm.storage.z3.E4(str) ? " " : str : n17.f2();
    }

    public static java.lang.String c(com.tencent.mm.storage.z3 z3Var, java.lang.String str) {
        return d(z3Var, str, com.tencent.mm.storage.z3.R4(str));
    }

    public static java.lang.String d(com.tencent.mm.storage.z3 z3Var, java.lang.String str, boolean z17) {
        if (z3Var == null) {
            return com.tencent.mm.contact.u.a();
        }
        if (z17 && com.tencent.mm.sdk.platformtools.t8.K0(z3Var.P0()) && com.tencent.mm.sdk.platformtools.t8.K0(z3Var.w0())) {
            com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
            return (com.tencent.mm.sdk.platformtools.t8.K0(a17.getDisplayName(str)) && c01.v1.u(str)) ? c01.v1.k() : com.tencent.mm.contact.s.q3(a17.getDisplayName(str));
        }
        java.lang.String g27 = z3Var.g2();
        if (g27 != null && !g27.isEmpty()) {
            return g27;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(z3Var.P0()) || (!com.tencent.mm.storage.z3.C3(str) && !com.tencent.mm.storage.z3.B4(str))) {
            return com.tencent.mm.storage.z3.E4(str) ? " " : str;
        }
        com.tencent.mm.contact.q qVar = com.tencent.mm.contact.s.I2;
        if (qVar != null) {
            return ((com.tencent.mm.app.s7) qVar).a(str);
        }
        return null;
    }

    public static java.lang.String e(java.lang.String str) {
        return (str == null || str.length() <= 0) ? "" : c(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true), str);
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return e(str);
        }
        java.lang.String a17 = a(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            return a17;
        }
        java.lang.String l17 = c01.v1.l(str, str2);
        return com.tencent.mm.sdk.platformtools.t8.K0(l17) ? e(str) : l17;
    }
}
