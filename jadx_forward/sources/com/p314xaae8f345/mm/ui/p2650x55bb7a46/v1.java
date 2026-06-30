package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes.dex */
public abstract class v1 {
    public static boolean a(java.lang.String str, android.content.Context context, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010, java.lang.String str2) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.t1 u1Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        if (str.startsWith("weixin://openNativeUrl/weixinHB")) {
            u1Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.r1();
        } else {
            if (str.startsWith("weixin://openNativeUrl/myDeviceList") || str.startsWith("weixin://openNativeUrl/bindMyDevice")) {
                u1Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.s1();
            } else {
                u1Var = str.startsWith("weixin://wesport/recommend") || str.startsWith("weixin://openNativeUrl/rankMyHomepage") || str.startsWith("weixin://openNativeUrl/rankSetting") ? new com.p314xaae8f345.mm.ui.p2650x55bb7a46.u1() : null;
            }
        }
        return u1Var != null && u1Var.a(str, context, abstractViewOnAttachStateChangeListenerC21400xb429b010, str2);
    }
}
