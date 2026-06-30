package com.p314xaae8f345.mm.p670x38b72420;

/* loaded from: classes11.dex */
public abstract class a {
    public static java.lang.String a(java.util.ArrayList arrayList) {
        if (arrayList == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append((java.lang.String) it.next());
            stringBuffer.append("，");
        }
        return stringBuffer.toString();
    }

    public static java.lang.String[] b(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.lang.String str;
        if (z3Var == null || (str = z3Var.E1) == null) {
            return null;
        }
        return str.split(z3Var.K1 == 0 ? "," : "，");
    }

    public static java.lang.String[] c(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String str2 = ",";
        if (z3Var != null && z3Var.K1 != 0) {
            str2 = "，";
        }
        return str.split(str2);
    }

    public static void d(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        if (z3Var != null) {
            z3Var.K1 = 1;
            z3Var.f318114u = true;
        }
    }
}
