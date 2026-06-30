package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class g9 {
    public g9(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g9 g9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o9 o9Var) {
        g9Var.getClass();
        if (o9Var == null) {
            return false;
        }
        java.lang.String str = o9Var.f67177x28d45f97;
        if (str == null || str.length() == 0) {
            return false;
        }
        java.lang.String str2 = o9Var.f33477x94cabbc4;
        return !(str2 == null || str2.length() == 0);
    }

    public static java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g9 g9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o9 o9Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        g9Var.getClass();
        if (o9Var == null) {
            return "(null)";
        }
        java.util.ArrayList d17 = kz5.c0.d("appId:" + o9Var.f67177x28d45f97, "versionType:" + o9Var.f67180x8ecd6328, "versionDesc:" + o9Var.f33477x94cabbc4);
        if (z17) {
            java.lang.String str = o9Var.f67183x55b471cc;
            if (str == null) {
                str = "";
            }
            d17.add("filePath:".concat(str));
        }
        return kz5.n0.g0(d17, ", ", "(", ")", 0, null, null, 56, null);
    }
}
