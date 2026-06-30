package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes.dex */
public final class u1 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.t1 {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.t1
    public boolean a(java.lang.String str, android.content.Context context, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        if (str.startsWith("weixin://wesport/recommend") && abstractViewOnAttachStateChangeListenerC21400xb429b010 != null) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.class);
            intent.putExtra("Select_Talker_Name", str2);
            intent.putExtra("Select_block_List", str2);
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("Select_Send_Card", true);
            abstractViewOnAttachStateChangeListenerC21400xb429b010.m7587x5dc77fb5(intent, 224);
            return true;
        }
        if (!str.startsWith("weixin://openNativeUrl/rankMyHomepage")) {
            if (!str.startsWith("weixin://openNativeUrl/rankSetting")) {
                return false;
            }
            j45.l.h(context, "exdevice", ".ui.ExdeviceSettingUI");
            return true;
        }
        java.lang.String r17 = c01.z1.r();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizNativeUrlDispatcher", "Get username from UserInfo return null or nil.");
            return false;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra(dm.i4.f66875xa013b0d5, r17);
        j45.l.j(context, "exdevice", ".ui.ExdeviceProfileUI", intent2, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizNativeUrlDispatcher", "Jump to ExdeviceProfileUI.");
        return true;
    }
}
