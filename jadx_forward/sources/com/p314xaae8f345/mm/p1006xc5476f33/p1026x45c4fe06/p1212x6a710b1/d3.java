package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public abstract class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedList f171939a = new java.util.LinkedList();

    public static void a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3 b3Var, java.lang.String str2, long j17) {
        if (str2 == null || !str2.contains("11111")) {
            if (b3Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsValidationInjector", "hy: file %s inject failed!", str);
                b3Var.b(str2);
                return;
            }
            return;
        }
        if (b3Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsValidationInjector", "hy: file %s inject success! cost:%d", str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17));
            b3Var.mo1150xe05b4124(str2);
        }
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, java.net.URL url, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3 b3Var) {
        boolean z17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (b3Var != null) {
                b3Var.b("isNullOrNil script");
                return;
            }
            return;
        }
        if (tVar == null) {
            if (b3Var != null) {
                b3Var.b("wv is null");
                return;
            }
            return;
        }
        java.util.LinkedList linkedList = f171939a;
        synchronized (linkedList) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = true;
                    break;
                } else if (str.startsWith((java.lang.String) it.next())) {
                    z17 = false;
                    break;
                }
            }
        }
        if (z17) {
            str = str + java.lang.String.format(java.util.Locale.ENGLISH, "\n;(function(){return %d;})();", 11111);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.x2 x2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.x2(b3Var);
        if (url == null) {
            tVar.mo14660x738236e6(str, x2Var);
        } else {
            tVar.R(url, str, x2Var);
        }
    }
}
