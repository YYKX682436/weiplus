package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9;

/* loaded from: classes8.dex */
public abstract class b {
    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d c19226x5a0e667d;
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            if (str2 == null) {
                str2 = "";
            }
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = lVar;
            objArr[3] = lVar == null ? null : lVar.f256752f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryJsEventNotifier", "notifyJsEvent %s %s %s, %s", objArr);
            java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", str, str, str2);
            if (lVar == null || (c19226x5a0e667d = lVar.f256752f) == null) {
                return;
            }
            c19226x5a0e667d.mo14660x738236e6(format, new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.a(str, str2));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryJsEventNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }
}
