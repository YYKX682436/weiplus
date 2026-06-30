package wd;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final wd.a f526203a = new wd.a();

    public byte[] a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 mo49254xc00e82af;
        java.lang.String a17;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MBFontManagerRegistry", "read data with empty path");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBFontManagerRegistry", "readDataFromURLSync at path[%s]", str);
        if (e9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MBFontManagerRegistry", "service released");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = e9Var.t3();
        if (t37 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MBFontManagerRegistry", "no runtime provided");
            return null;
        }
        try {
            if (str.startsWith("wxfile://")) {
                com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = t37.mo48802x59eafec1().mo49620x1d537609(str);
                if (mo49620x1d537609 != null) {
                    a17 = mo49620x1d537609.o();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBFontManagerRegistry", "read [%s] from filesystem failed, no file", str);
                    a17 = null;
                }
            } else {
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.n(str) && (mo49254xc00e82af = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.o(t37, false).mo49254xc00e82af(str)) != null) {
                    a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y5.a(mo49254xc00e82af.f157576d, mo49254xc00e82af.f157578f);
                }
                a17 = null;
            }
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBFontManagerRegistry", "read file failed");
                return null;
            }
            byte[] c17 = s46.d.c(com.p314xaae8f345.mm.vfs.w6.E(a17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBFontManagerRegistry", "readFile success, size = %d", java.lang.Integer.valueOf(c17.length));
            return c17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MBFontManagerRegistry", e17, "readDataFromURLSync failed", new java.lang.Object[0]);
            return null;
        }
    }
}
