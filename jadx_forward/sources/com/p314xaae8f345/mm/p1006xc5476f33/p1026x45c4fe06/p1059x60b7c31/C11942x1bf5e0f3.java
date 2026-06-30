package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultTask */
/* loaded from: classes12.dex */
final class C11942x1bf5e0f3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {
    private C11942x1bf5e0f3() {
    }

    private void d(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f91197, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11941x671d6861 c11941x671d6861) {
        java.lang.String str;
        int i17;
        r45.vm4 vm4Var = new r45.vm4();
        str = c11941x671d6861.f160154e;
        vm4Var.f469893d = str;
        i17 = c11941x671d6861.f160156g;
        vm4Var.f469894e = i17;
        ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Ai(c5292x67f91197, 0, vm4Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1 c11946x584a00d1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1 c11946x584a00d12;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1 c11946x584a00d13;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1 c11946x584a00d14;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1 c11946x584a00d15;
        java.lang.String str;
        java.lang.String str2;
        int i17;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i18;
        java.lang.String str6;
        java.lang.String str7;
        if (!(abstractC11887x3610e10c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11941x671d6861)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShowImageOperateSheet", "IPCProcessQRCodeResultTask request instance not valid");
            return;
        }
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5751x758c1063>(m50421x3c6fed6a()) { // from class: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultTask.1
            {
                this.f39173x3fe91575 = 1280295539;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5751x758c1063 c5751x758c1063) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11942x1bf5e0f3 c11942x1bf5e0f3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11942x1bf5e0f3.this;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = c11942x1bf5e0f3.m50421x3c6fed6a();
                am.kl klVar = c5751x758c1063.f136072g;
                if (m50421x3c6fed6a == klVar.f88700b) {
                    int i19 = klVar.f88701c;
                    if (i19 != 0) {
                        if (i19 != 1 && i19 != 2) {
                            if (i19 == 3) {
                                android.os.Bundle bundle = klVar.f88702d;
                                if (!(bundle != null && bundle.getBoolean("key_scan_qr_code_result"))) {
                                    c11942x1bf5e0f3.m50420x7b736e5c(null);
                                    mo48814x2efc64();
                                }
                            }
                        }
                    }
                    c11942x1bf5e0f3.m50420x7b736e5c(null);
                    mo48814x2efc64();
                }
                return false;
            }
        }.mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11941x671d6861 c11941x671d6861 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11941x671d6861) abstractC11887x3610e10c;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f91197 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
        am.r3 r3Var = c5292x67f91197.f135612g;
        r3Var.f89314b = m50421x3c6fed6a;
        c11946x584a00d1 = c11941x671d6861.f160153d;
        r3Var.f89313a = c11946x584a00d1.f160177d;
        c11946x584a00d12 = c11941x671d6861.f160153d;
        r3Var.f89315c = c11946x584a00d12.f160179f;
        c11946x584a00d13 = c11941x671d6861.f160153d;
        r3Var.f89316d = c11946x584a00d13.f160180g;
        r3Var.f89321i = 44;
        c11946x584a00d14 = c11941x671d6861.f160153d;
        r3Var.f89325m = c11946x584a00d14.f160178e;
        r3Var.f89327o = true;
        c11946x584a00d15 = c11941x671d6861.f160153d;
        r3Var.f89329q = c11946x584a00d15.f160181h;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", 6);
        str = c11941x671d6861.f160154e;
        bundle.putString("stat_app_id", str);
        str2 = c11941x671d6861.f160155f;
        bundle.putString("stat_url", str2);
        i17 = c11941x671d6861.f160159m;
        bundle.putInt("stat_geta8key_msg_scene", i17);
        str3 = c11941x671d6861.f160157h;
        bundle.putString("stat_send_msg_user", str3);
        str4 = c11941x671d6861.f160158i;
        bundle.putString("stat_chat_talker_username", str4);
        str5 = c11941x671d6861.f160160n;
        bundle.putString("stat_msg_id", str5);
        i18 = c11941x671d6861.f160161o;
        bundle.putInt("stat_scene", i18);
        str6 = c11941x671d6861.f160162p;
        bundle.putString("stat_scene_note", str6);
        str7 = c11941x671d6861.f160163q;
        bundle.putString("weapp_username", str7);
        r3Var.f89324l = bundle;
        d(c5292x67f91197, c11941x671d6861);
        c5292x67f91197.e();
    }
}
