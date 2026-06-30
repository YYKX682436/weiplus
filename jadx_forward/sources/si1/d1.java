package si1;

/* loaded from: classes7.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f489770a = java.util.Arrays.asList("scope.userLocation", "scope.camera");

    public static java.lang.String a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        str.getClass();
        if (str.equals("scope.camera")) {
            return c11510xdd90c2f2.f156328d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a0_);
        }
        k91.g gVar = (k91.g) ((java.util.HashMap) c11510xdd90c2f2.m0().f387277n).get(str);
        if (gVar == null) {
            return null;
        }
        return gVar.f387117b;
    }

    public static boolean b(java.lang.String str, k91.z0 z0Var) {
        java.lang.String[] strArr;
        boolean z17;
        if (!f489770a.contains(str)) {
            if (!(z0Var instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052) || (strArr = ((com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052) z0Var).Y.U) == null) {
                return false;
            }
            int length = strArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    z17 = false;
                    break;
                }
                if (java.util.Objects.equals(strArr[i17], str)) {
                    z17 = true;
                    break;
                }
                i17++;
            }
            if (!z17) {
                return false;
            }
        }
        str.getClass();
        if (str.equals("scope.userLocation")) {
            return z0Var.f387381n;
        }
        return true;
    }
}
