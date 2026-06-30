package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes.dex */
public final class s1 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.t1 {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.t1
    public boolean a(java.lang.String str, android.content.Context context, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        if (!str.startsWith("weixin://openNativeUrl/myDeviceList")) {
            str.startsWith("weixin://openNativeUrl/bindMyDevice");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("device_brand_name", str2);
        j45.l.j(context, "exdevice", ".ui.ExdeviceManageDeviceUI", intent, null);
        return true;
    }
}
