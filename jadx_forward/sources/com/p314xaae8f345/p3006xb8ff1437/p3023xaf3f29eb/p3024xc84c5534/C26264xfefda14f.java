package com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534;

/* renamed from: com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportManager */
/* loaded from: classes16.dex */
public class C26264xfefda14f {

    /* renamed from: COMMON_DEVICE_CAP_EVENT */
    private static final java.lang.String f51397xde3ce4d8 = "tp_common_device_cap";
    private static final java.lang.String TAG = "TPDeviceCapabilityReportManager";

    /* renamed from: CommonCapabilityReport */
    private void m101577x8e6a1897() {
        com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508 c26265x13d73508 = new com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf c26578x4d6188cf = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf();
        m101579xe30b1899(c26265x13d73508.m101590x61d745c7(), c26578x4d6188cf);
        m101578x903117ca(c26265x13d73508.m101589x729c4104(), c26578x4d6188cf);
        m101586x5a41eced(c26265x13d73508.m101593xe75d43c1(), c26578x4d6188cf);
        m101585xd6119fec(c26265x13d73508.m101592x57f7a22(), c26578x4d6188cf);
        m101584x1bcf6398(c26265x13d73508.m101591x189e7a0a(), c26578x4d6188cf);
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "device capability report:" + c26578x4d6188cf.m104379x9616526c());
        com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26263x413d0abf.m101574xbcd477d3(f51397xde3ce4d8, c26578x4d6188cf);
    }

    /* renamed from: av1DecoderCapabilityCollect */
    private void m101578x903117ca(com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.AV1DecoderParams aV1DecoderParams, com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c) {
        com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26212x9b697801 m101580x464f2bb6 = m101580x464f2bb6();
        if (m101580x464f2bb6 != null) {
            aV1DecoderParams.f51409x141cf250 = m101580x464f2bb6.m101268x21c81b9b();
            aV1DecoderParams.f51408x16b001eb = m101580x464f2bb6.m101266x931b01f6();
        }
        aV1DecoderParams.mo101570xb4a60eb4(interfaceC26262x6f07842c);
    }

    /* renamed from: commonParamsCollect */
    private void m101579xe30b1899(com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.CommonParams commonParams, com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c) {
        commonParams.f51418x3897718a = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.f52378x9efbee2a;
        commonParams.f51420xb43476e9 = java.util.UUID.randomUUID().toString() + java.lang.System.nanoTime() + "_" + com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101638xeb97a5e9();
        commonParams.f51423x6fbd6873 = com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101638xeb97a5e9();
        commonParams.f51422x651c71f = java.lang.String.format("Android %s", com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101951x6b6e6f9e());
        commonParams.f51421x633fb29 = java.lang.String.format("%s_%s", com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101946x8a78273d(), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7());
        commonParams.f51419x3abd5c53 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101943x709d7b26();
        commonParams.mo101570xb4a60eb4(interfaceC26262x6f07842c);
    }

    /* renamed from: getAV1MaxCapability */
    private static com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26212x9b697801 m101580x464f2bb6() {
        com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26212x9b697801 c26212x9b697801;
        try {
            c26212x9b697801 = com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26210x55de20b4.m101252xe665f2c1(1029, 102);
        } catch (com.p314xaae8f345.p3006xb8ff1437.api.C26180xf897afdc e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            c26212x9b697801 = null;
        }
        if (c26212x9b697801 == com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26212x9b697801.f51172xa2a98fac) {
            return null;
        }
        return c26212x9b697801;
    }

    /* renamed from: getHEVCMaxCapability */
    private static com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26212x9b697801 m101581xec5164bc() {
        com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26212x9b697801 c26212x9b697801;
        try {
            c26212x9b697801 = com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26210x55de20b4.m101252xe665f2c1(172, 102);
        } catch (com.p314xaae8f345.p3006xb8ff1437.api.C26180xf897afdc e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            c26212x9b697801 = null;
        }
        if (c26212x9b697801 == com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26212x9b697801.f51172xa2a98fac) {
            return null;
        }
        return c26212x9b697801;
    }

    /* renamed from: getVP8MaxCapability */
    private static com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26212x9b697801 m101582xd93264d4() {
        com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26212x9b697801 c26212x9b697801;
        try {
            c26212x9b697801 = com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26210x55de20b4.m101252xe665f2c1(138, 102);
        } catch (com.p314xaae8f345.p3006xb8ff1437.api.C26180xf897afdc e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            c26212x9b697801 = null;
        }
        if (c26212x9b697801 == com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26212x9b697801.f51172xa2a98fac) {
            return null;
        }
        return c26212x9b697801;
    }

    /* renamed from: getVP9MaxCapability */
    private static com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26212x9b697801 m101583xbb102e73() {
        com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26212x9b697801 c26212x9b697801;
        try {
            c26212x9b697801 = com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26210x55de20b4.m101252xe665f2c1(166, 102);
        } catch (com.p314xaae8f345.p3006xb8ff1437.api.C26180xf897afdc e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            c26212x9b697801 = null;
        }
        if (c26212x9b697801 == com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26212x9b697801.f51172xa2a98fac) {
            return null;
        }
        return c26212x9b697801;
    }

    /* renamed from: hevcDecoderCapabilityCollect */
    private void m101584x1bcf6398(com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.HEVCDecoderParams hEVCDecoderParams, com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c) {
        com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26212x9b697801 m101581xec5164bc = m101581xec5164bc();
        if (m101581xec5164bc != null) {
            hEVCDecoderParams.f51431x25b2ec1e = m101581xec5164bc.m101268x21c81b9b();
            hEVCDecoderParams.f51430xc1761739 = m101581xec5164bc.m101266x931b01f6();
        }
        hEVCDecoderParams.mo101570xb4a60eb4(interfaceC26262x6f07842c);
    }

    /* renamed from: vp8DecoderCapabilityCollect */
    private void m101585xd6119fec(com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.VP8DecoderParams vP8DecoderParams, com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c) {
        com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26212x9b697801 m101582xd93264d4 = m101582xd93264d4();
        if (m101582xd93264d4 != null) {
            vP8DecoderParams.f51439x8c50bc72 = m101582xd93264d4.m101268x21c81b9b();
            vP8DecoderParams.f51438xe033ec8d = m101582xd93264d4.m101266x931b01f6();
        }
        vP8DecoderParams.mo101570xb4a60eb4(interfaceC26262x6f07842c);
    }

    /* renamed from: vp9DecoderCapabilityCollect */
    private void m101586x5a41eced(com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.VP9DecoderParams vP9DecoderParams, com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c) {
        com.p314xaae8f345.p3006xb8ff1437.api.p3014xd14a2518.C26212x9b697801 m101583xbb102e73 = m101583xbb102e73();
        if (m101583xbb102e73 != null) {
            vP9DecoderParams.f51446xdcfa9a73 = m101583xbb102e73.m101268x21c81b9b();
            vP9DecoderParams.f51445x3a0f56ce = m101583xbb102e73.m101266x931b01f6();
        }
        vP9DecoderParams.mo101570xb4a60eb4(interfaceC26262x6f07842c);
    }

    /* renamed from: reportAsync */
    public void m101587xefa6dda8() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104413x137f2902().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportManager.1
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26264xfefda14f.this.m101588x731e29ef();
            }
        });
    }

    /* renamed from: reportSync */
    public void m101588x731e29ef() {
        m101577x8e6a1897();
    }
}
