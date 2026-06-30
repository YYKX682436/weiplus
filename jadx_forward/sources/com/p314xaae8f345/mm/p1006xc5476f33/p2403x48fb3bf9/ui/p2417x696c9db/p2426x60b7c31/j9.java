package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public abstract class j9 {
    public static java.lang.String a(nw4.y2 y2Var, java.lang.String str) {
        java.util.Map map = y2Var.f422551h;
        return (map == null || !((java.util.HashMap) map).containsKey(str)) ? "" : java.lang.String.valueOf(((java.util.HashMap) y2Var.f422551h).get(str));
    }

    public static java.lang.String b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        try {
            java.lang.String a17 = fp.s0.a(str);
            return a17 == null ? "" : a17;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }
}
