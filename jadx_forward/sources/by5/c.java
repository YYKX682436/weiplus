package by5;

/* loaded from: classes13.dex */
public class c extends by5.e0 {
    @Override // by5.e0
    public int a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        boolean z17;
        by5.c4.f("BsPatchWrapper", "doBSPatch oldFile:" + str + ",patchFile:" + str2 + ",newFile:" + str3);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = by5.s0.f118128c;
        if (n1Var != null) {
            n1Var.b(577L, 14L, 1L);
        }
        if (str.equals(str3)) {
            str3 = str.concat(".temp");
            z17 = true;
        } else {
            z17 = false;
        }
        int m120524x32e59266 = new com.p314xaae8f345.p3210x3857dc.p3221x36f002.C27867x3755a297().m120524x32e59266(str, str2, str3);
        if (m120524x32e59266 < 0) {
            by5.c4.f("BsPatchWrapper", "doBSPatch failed, ret = " + m120524x32e59266 + ", isSamePath = " + z17 + ", newFile = " + str3);
            com.p314xaae8f345.p3210x3857dc.n1 n1Var2 = by5.s0.f118128c;
            if (n1Var2 != null) {
                n1Var2.b(577L, 15L, 1L);
            }
            java.lang.String c17 = by5.x.c(str);
            java.lang.String c18 = by5.x.c(str2);
            java.lang.String c19 = by5.x.c(str3);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doBSPatch failed, oldFileMD5 = ");
            if (c17 == null) {
                c17 = "";
            }
            sb6.append(c17);
            sb6.append(", patchFileMD5 = ");
            if (c18 == null) {
                c18 = "";
            }
            sb6.append(c18);
            sb6.append(", newFileMD5 = ");
            if (c19 == null) {
                c19 = "";
            }
            sb6.append(c19);
            by5.c4.f("BsPatchWrapper", sb6.toString());
        } else {
            by5.c4.f("BsPatchWrapper", "doBSPatch successful");
            if (z17) {
                if (!by5.u.d(str3, str)) {
                    by5.c4.c("BsPatchWrapper", "doBSPatch same path, copy failed");
                    return -1;
                }
                by5.u.i(str3);
            }
            by5.s0.f(java.lang.System.currentTimeMillis() - currentTimeMillis);
        }
        return m120524x32e59266;
    }
}
