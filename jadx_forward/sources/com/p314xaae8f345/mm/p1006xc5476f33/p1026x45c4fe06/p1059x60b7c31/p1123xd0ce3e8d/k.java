package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d;

/* loaded from: classes7.dex */
public final class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f34968x366c91de = 1205;

    /* renamed from: NAME */
    public static final java.lang.String f34969x24728b = "isSupportSR";

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f165376g = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f165377h = "";

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f165378i = "";

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f165379m = "";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.w wVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.e0.f165338u;
        f165376g = wVar.b();
        f165378i = wVar.a();
        if (wo.w0.q()) {
            f165377h = "5cbdf5691046122ffd776971f3f2c327";
        } else {
            f165377h = "10c74c8fd7af5879063796155fe5d264";
        }
        f165379m = "1c200d3e9055b847fc718206e9974ec5";
        if (!com.p314xaae8f345.mm.vfs.w6.j(f165376g)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("isSupport", java.lang.Boolean.FALSE);
            hashMap.put("errCode", 1003);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            java.lang.String t17 = t("ok", hashMap);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t17, "makeReturnJson(...)");
            return t17;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.p(f165376g).equals(f165377h)) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("isSupport", java.lang.Boolean.FALSE);
            hashMap2.put("errCode", 1004);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap2.put("errno", 0);
            java.lang.String t18 = t("ok", hashMap2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t18, "makeReturnJson(...)");
            return t18;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(f165378i)) {
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("isSupport", java.lang.Boolean.FALSE);
            hashMap3.put("errCode", 1005);
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap3.put("errno", 0);
            java.lang.String t19 = t("ok", hashMap3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t19, "makeReturnJson(...)");
            return t19;
        }
        if (com.p314xaae8f345.mm.vfs.w6.p(f165378i).equals(f165379m)) {
            java.util.HashMap hashMap4 = new java.util.HashMap();
            hashMap4.put("isSupport", java.lang.Boolean.TRUE);
            hashMap4.put("errCode", 1007);
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap4.put("errno", 0);
            java.lang.String t27 = t("ok", hashMap4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t27, "makeReturnJson(...)");
            return t27;
        }
        java.util.HashMap hashMap5 = new java.util.HashMap();
        hashMap5.put("isSupport", java.lang.Boolean.FALSE);
        hashMap5.put("errCode", 1006);
        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap5.put("errno", 0);
        java.lang.String t28 = t("ok", hashMap5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t28, "makeReturnJson(...)");
        return t28;
    }
}
