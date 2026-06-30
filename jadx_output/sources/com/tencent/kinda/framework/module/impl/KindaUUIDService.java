package com.tencent.kinda.framework.module.impl;

/* loaded from: classes9.dex */
public class KindaUUIDService implements com.tencent.kinda.gen.KUUIDService {
    @Override // com.tencent.kinda.gen.KUUIDService
    public boolean adbEnable() {
        return wo.w0.a();
    }

    @Override // com.tencent.kinda.gen.KUUIDService
    public boolean developmentSettingEnable() {
        return wo.w0.b();
    }

    @Override // com.tencent.kinda.gen.KUUIDService
    public com.tencent.kinda.gen.ITransmitKvData getExtendInfo() {
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("pay_keyboard_security_setting").getString("kv_pwd_keyboard_click_btn_pressure", "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
            java.util.ArrayList<java.lang.String> P1 = (com.tencent.mm.sdk.platformtools.t8.K0(string) || com.tencent.mm.sdk.platformtools.t8.K0(",")) ? null : com.tencent.mm.sdk.platformtools.t8.P1(string.split(","));
            if (P1 != null && P1.size() > 0) {
                create.putListString("key_extendInfo_pwd_keyboard_click_btn_pressure", P1);
            }
        }
        create.putBool("key_extendInfo_is_pwd_keyboard_overlaid", com.tencent.mm.sdk.platformtools.o4.M("pay_keyboard_security_setting").getBoolean("kv_pay_pwd_keyboard_overlaid", false));
        create.putLong("key_extendInfo_wechat_last_launch_timestamp", com.tencent.mm.app.x.f53906a / 1000);
        create.putString("key_extendInfo_oaid", getOaid());
        create.putInt("key_extendInfo_adb_enable", adbEnable() ? 1 : 0);
        create.putInt("key_extendInfo_development_setting_enable", developmentSettingEnable() ? 1 : 0);
        create.putInt("key_extendInfo_screen_reading_enable", ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ai() != 1 ? 0 : 1);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_paysec_vpn_report, false)) {
            create.putBool("key_extendInfo_is_wechat_voip_calling", ((pg0.l3) ((qg0.e0) i95.n0.c(qg0.e0.class))).Bi());
            create.putBool("key_extendInfo_is_vpn", ((pg0.l3) ((qg0.e0) i95.n0.c(qg0.e0.class))).Ai());
        }
        com.tencent.mm.autogen.events.KindaNotifyEvent kindaNotifyEvent = new com.tencent.mm.autogen.events.KindaNotifyEvent();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("url", "FinishUUID");
        kindaNotifyEvent.f54459g.f6954a = hashMap;
        kindaNotifyEvent.e();
        return create;
    }

    @Override // com.tencent.kinda.gen.KUUIDService
    public java.lang.String getOaid() {
        return wo.w0.n();
    }

    @Override // com.tencent.kinda.gen.KUUIDService
    public java.lang.String getUuid() {
        return java.util.UUID.randomUUID().toString();
    }

    @Override // com.tencent.kinda.gen.KUUIDService
    public boolean isWechatClient() {
        return c01.e2.a0();
    }
}
