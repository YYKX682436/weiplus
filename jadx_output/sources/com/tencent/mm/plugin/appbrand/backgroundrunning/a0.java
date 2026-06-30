package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes4.dex */
public abstract class a0 {
    public static java.lang.Class a(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandForegroundNotificationCommons", "getCustomNotificationLogicClass fail since " + e17.toString());
            return null;
        }
    }
}
