package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

/* loaded from: classes4.dex */
public abstract class a0 {
    public static java.lang.Class a(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandForegroundNotificationCommons", "getCustomNotificationLogicClass fail since " + e17.toString());
            return null;
        }
    }
}
