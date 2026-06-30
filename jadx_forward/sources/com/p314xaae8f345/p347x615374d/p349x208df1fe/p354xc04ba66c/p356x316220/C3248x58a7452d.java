package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.KindaUUIDService */
/* loaded from: classes9.dex */
public class C3248x58a7452d implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3540x862d4d4f {
    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3540x862d4d4f
    /* renamed from: adbEnable */
    public boolean mo25927x7e005702() {
        return wo.w0.a();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3540x862d4d4f
    /* renamed from: developmentSettingEnable */
    public boolean mo25928x9eb34e78() {
        return wo.w0.b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3540x862d4d4f
    /* renamed from: getExtendInfo */
    public com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e mo25929x818532de() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("pay_keyboard_security_setting").getString("kv_pwd_keyboard_click_btn_pressure", "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
            java.util.ArrayList<java.lang.String> P1 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(",")) ? null : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(string.split(","));
            if (P1 != null && P1.size() > 0) {
                m27539xaf65a0fc.mo27563xe1b7d6be("key_extendInfo_pwd_keyboard_click_btn_pressure", P1);
            }
        }
        m27539xaf65a0fc.mo27556xf2e34299("key_extendInfo_is_pwd_keyboard_overlaid", com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("pay_keyboard_security_setting").getBoolean("kv_pay_pwd_keyboard_overlaid", false));
        m27539xaf65a0fc.mo27564xf2e7ce2b("key_extendInfo_wechat_last_launch_timestamp", com.p314xaae8f345.mm.app.x.f135439a / 1000);
        m27539xaf65a0fc.mo27566xe4673800("key_extendInfo_oaid", mo25930xfb8356e3());
        m27539xaf65a0fc.mo27557xc5c55e60("key_extendInfo_adb_enable", mo25927x7e005702() ? 1 : 0);
        m27539xaf65a0fc.mo27557xc5c55e60("key_extendInfo_development_setting_enable", mo25928x9eb34e78() ? 1 : 0);
        m27539xaf65a0fc.mo27557xc5c55e60("key_extendInfo_screen_reading_enable", ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ai() != 1 ? 0 : 1);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_paysec_vpn_report, false)) {
            m27539xaf65a0fc.mo27556xf2e34299("key_extendInfo_is_wechat_voip_calling", ((pg0.l3) ((qg0.e0) i95.n0.c(qg0.e0.class))).Bi());
            m27539xaf65a0fc.mo27556xf2e34299("key_extendInfo_is_vpn", ((pg0.l3) ((qg0.e0) i95.n0.c(qg0.e0.class))).Ai());
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5667xda32364 c5667xda32364 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5667xda32364();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("url", "FinishUUID");
        c5667xda32364.f135992g.f88487a = hashMap;
        c5667xda32364.e();
        return m27539xaf65a0fc;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3540x862d4d4f
    /* renamed from: getOaid */
    public java.lang.String mo25930xfb8356e3() {
        return wo.w0.n();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3540x862d4d4f
    /* renamed from: getUuid */
    public java.lang.String mo25931xfb865c31() {
        return java.util.UUID.randomUUID().toString();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3540x862d4d4f
    /* renamed from: isWechatClient */
    public boolean mo25932xa5bde8db() {
        return c01.e2.a0();
    }
}
