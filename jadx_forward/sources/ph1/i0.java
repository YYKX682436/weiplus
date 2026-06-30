package ph1;

/* loaded from: classes7.dex */
public final class i0 {

    /* renamed from: a */
    public static final ph1.i0 f435865a = new ph1.i0();

    public static final java.lang.Object a(java.util.List list, java.lang.String pathOrModule, java.lang.String str, boolean z17) {
        java.lang.String[] strArr;
        java.lang.String[] strArr2;
        java.lang.String d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pathOrModule, "pathOrModule");
        ph1.i0 i0Var = f435865a;
        java.lang.String[] e17 = i0Var.e(pathOrModule);
        java.util.Iterator it = kz5.n0.F0(list, new ph1.h0()).iterator();
        while (true) {
            if (!it.hasNext()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.WxaRuntimeModularizingUtils", "findModule, return null with path:" + pathOrModule + ", message[ " + str + " ]");
                return null;
            }
            java.lang.Object next = it.next();
            boolean z18 = false;
            if (next == null || (d17 = i0Var.d(next)) == null || (strArr = i0Var.e(d17)) == null) {
                strArr = new java.lang.String[0];
            }
            if (i0Var.f(e17, strArr)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("findModule, hit module(independent:");
                if (next != null && i0Var.c(next)) {
                    z18 = true;
                }
                sb6.append(z18);
                sb6.append(") by name:");
                sb6.append(next != null ? i0Var.d(next) : null);
                sb6.append(", path:");
                sb6.append(pathOrModule);
                sb6.append(", message[ ");
                sb6.append(str);
                sb6.append(" ]");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.WxaRuntimeModularizingUtils", sb6.toString());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                return next;
            }
            if (next != null) {
                if (next instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f) {
                    strArr2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f) next).f159001h;
                } else {
                    if (!(next instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e)) {
                        throw new java.lang.IllegalStateException("Only WxaAttributes.WxaVersionModuleInfo or ModulePkgInfo supported here.".toString());
                    }
                    strArr2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) next).f33452xc97d4efe;
                }
                if (strArr2 != null) {
                    int length = strArr2.length;
                    for (int i17 = 0; i17 < length; i17++) {
                        java.lang.String str2 = strArr2[i17];
                        if (!(str2 == null || str2.length() == 0) && r26.i0.y(pathOrModule, str2, false)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.WxaRuntimeModularizingUtils", "findModule, hit module(independent:" + i0Var.c(next) + ") by alias:" + str2 + ", path:" + pathOrModule + ", message[ " + str + " ]");
                            return next;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public static /* synthetic */ java.lang.Object b(java.util.List list, java.lang.String str, java.lang.String str2, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str2 = "";
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        return a(list, str, str2, z17);
    }

    public final boolean c(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f) obj).f158999f;
        }
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) obj).f33453xc73e777a;
        }
        throw new java.lang.IllegalStateException("Only WxaAttributes.WxaVersionModuleInfo or ModulePkgInfo supported here.".toString());
    }

    public final java.lang.String d(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f) obj).f158997d;
        }
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) obj).f33454x337a8b;
        }
        throw new java.lang.IllegalStateException("Only WxaAttributes.WxaVersionModuleInfo or ModulePkgInfo supported here.".toString());
    }

    public final java.lang.String[] e(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        int length = str.length();
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                i17 = 0;
                break;
            }
            if (str.charAt(i17) != '/') {
                break;
            }
            i17++;
        }
        int length2 = str.length();
        int length3 = str.length();
        while (true) {
            length3--;
            if (-1 >= length3 || str.charAt(length3) != '/') {
                break;
            }
            length2--;
        }
        java.lang.String substring = str.substring(i17, length2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return (java.lang.String[]) r26.n0.f0(substring, new java.lang.String[]{"/"}, false, 0, 6, null).toArray(new java.lang.String[0]);
    }

    public final boolean f(java.lang.String[] strArr, java.lang.String[] prefixArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strArr, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefixArr, "prefixArr");
        if (strArr.length < prefixArr.length) {
            return false;
        }
        int length = prefixArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(strArr[i17], prefixArr[i17])) {
                return false;
            }
        }
        return true;
    }
}
