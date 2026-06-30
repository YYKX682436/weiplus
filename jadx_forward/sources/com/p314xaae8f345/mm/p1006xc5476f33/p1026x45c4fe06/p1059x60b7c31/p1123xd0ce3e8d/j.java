package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d;

/* loaded from: classes7.dex */
public final class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f34966x366c91de = 1204;

    /* renamed from: NAME */
    public static final java.lang.String f34967x24728b = "isOpenSR";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        java.lang.Integer valueOf = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("mediaStreamTrackId", 0)) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.w wVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.e0.f165338u;
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.e0.f165339v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
        int intValue = ((java.lang.Number) kz5.c1.h(hashMap, valueOf)).intValue();
        if (intValue == -1) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("isOpen", java.lang.Boolean.FALSE);
            hashMap2.put("errCode", 1001);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap2.put("errno", 0);
            java.lang.String t17 = t("ok", hashMap2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t17, "makeReturnJson(...)");
            return t17;
        }
        if (intValue != 0) {
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("isOpen", java.lang.Boolean.TRUE);
            hashMap3.put("errCode", 1002);
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap3.put("errno", 0);
            java.lang.String t18 = t("ok", hashMap3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t18, "makeReturnJson(...)");
            return t18;
        }
        java.util.HashMap hashMap4 = new java.util.HashMap();
        hashMap4.put("isOpen", java.lang.Boolean.FALSE);
        hashMap4.put("errCode", 1000);
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap4.put("errno", 0);
        java.lang.String t19 = t("ok", hashMap4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t19, "makeReturnJson(...)");
        return t19;
    }
}
