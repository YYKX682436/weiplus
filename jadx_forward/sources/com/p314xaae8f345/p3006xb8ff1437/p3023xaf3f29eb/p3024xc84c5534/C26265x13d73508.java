package com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534;

/* renamed from: com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters */
/* loaded from: classes16.dex */
public class C26265x13d73508 {

    /* renamed from: mCommonParams */
    private com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.CommonParams f51400x9879cc5e = new com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.CommonParams();

    /* renamed from: mAV1DecoderParams */
    private com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.AV1DecoderParams f51399xf0dba41b = new com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.AV1DecoderParams();

    /* renamed from: mVP9DecoderParams */
    private com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.VP9DecoderParams f51403x659ca6d8 = new com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.VP9DecoderParams();

    /* renamed from: mHEVCDecoderParams */
    private com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.HEVCDecoderParams f51401x624b79d3 = new com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.HEVCDecoderParams();

    /* renamed from: mVP8DecoderParams */
    private com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.VP8DecoderParams f51402x83bedd39 = new com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.VP8DecoderParams();

    /* renamed from: com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters$AV1DecoderParams */
    /* loaded from: classes16.dex */
    public class AV1DecoderParams implements com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff {

        /* renamed from: AV1_HW_DECODER_LEVEL */
        private static final java.lang.String f51404x46cd79c = "av1hwdecoderlevel";

        /* renamed from: AV1_HW_DECODER_PROFILE */
        private static final java.lang.String f51405x85fb1bc1 = "av1hwdecoderprofile";

        /* renamed from: LEVEL_UNKNOWN */
        private static final int f51406x6918de4f = -1;

        /* renamed from: PROFILE_UNKNOWN */
        private static final int f51407xba755b74 = -1;

        /* renamed from: av1HWDecoderLevel */
        public int f51408x16b001eb;

        /* renamed from: av1HWDecoderProfile */
        public int f51409x141cf250;

        public AV1DecoderParams() {
            mo101571x6761d4f();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff
        /* renamed from: paramsToJson */
        public void mo101569x52e5e329(org.json.JSONObject jSONObject) {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff
        /* renamed from: paramsToProperties */
        public void mo101570xb4a60eb4(com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c) {
            interfaceC26262x6f07842c.put(f51405x85fb1bc1, this.f51409x141cf250);
            interfaceC26262x6f07842c.put(f51404x46cd79c, this.f51408x16b001eb);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff
        /* renamed from: reset */
        public void mo101571x6761d4f() {
            this.f51409x141cf250 = -1;
            this.f51408x16b001eb = -1;
        }
    }

    /* renamed from: com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters$CommonParams */
    /* loaded from: classes16.dex */
    public class CommonParams implements com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff {

        /* renamed from: API_LEVEL */
        private static final java.lang.String f51411xd7d120df = "apilevel";

        /* renamed from: CPU_NAME */
        private static final java.lang.String f51412x4e4c5ae2 = "cpuname";

        /* renamed from: FLOW_ID */
        private static final java.lang.String f51413xfd26bdcc = "flowid";

        /* renamed from: MODEL */
        private static final java.lang.String f51414x4620309 = "model";

        /* renamed from: OS_VER */
        private static final java.lang.String f51415x8b8cf2a8 = "osver";

        /* renamed from: PLATFORM */
        private static final java.lang.String f51416x9e635873 = "appplatform";

        /* renamed from: SERIAL_NO */
        private static final java.lang.String f51417x83e9c7ec = "serialno";

        /* renamed from: apiLevel */
        public int f51418x3897718a;

        /* renamed from: cpuName */
        public java.lang.String f51419x3abd5c53;

        /* renamed from: flowId */
        public java.lang.String f51420xb43476e9;

        /* renamed from: model */
        public java.lang.String f51421x633fb29;

        /* renamed from: osVer */
        public java.lang.String f51422x651c71f;

        /* renamed from: platform */
        public int f51423x6fbd6873;

        /* renamed from: serialNo */
        public java.lang.String f51424x517a5ad5;

        public CommonParams() {
            mo101571x6761d4f();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff
        /* renamed from: paramsToJson */
        public void mo101569x52e5e329(org.json.JSONObject jSONObject) {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff
        /* renamed from: paramsToProperties */
        public void mo101570xb4a60eb4(com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c) {
            interfaceC26262x6f07842c.put("flowid", this.f51420xb43476e9);
            interfaceC26262x6f07842c.put(f51416x9e635873, this.f51423x6fbd6873);
            interfaceC26262x6f07842c.put(f51411xd7d120df, this.f51418x3897718a);
            interfaceC26262x6f07842c.put("osver", this.f51422x651c71f);
            interfaceC26262x6f07842c.put(f51414x4620309, this.f51421x633fb29);
            interfaceC26262x6f07842c.put(f51417x83e9c7ec, this.f51424x517a5ad5);
            interfaceC26262x6f07842c.put(f51412x4e4c5ae2, this.f51419x3abd5c53);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff
        /* renamed from: reset */
        public void mo101571x6761d4f() {
            this.f51420xb43476e9 = "";
            this.f51423x6fbd6873 = -1;
            this.f51418x3897718a = -1;
            this.f51422x651c71f = "";
            this.f51421x633fb29 = "";
            this.f51424x517a5ad5 = "";
            this.f51419x3abd5c53 = "";
        }
    }

    /* renamed from: com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters$HEVCDecoderParams */
    /* loaded from: classes16.dex */
    public class HEVCDecoderParams implements com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff {

        /* renamed from: HEVC_HW_DECODER_LEVEL */
        private static final java.lang.String f51426x3b238e = "hevchwdecoderlevel";

        /* renamed from: HEVC_HW_DECODER_PROFILE */
        private static final java.lang.String f51427xc7663333 = "hevchwdecoderprofile";

        /* renamed from: LEVEL_UNKNOWN */
        private static final int f51428x6918de4f = -1;

        /* renamed from: PROFILE_UNKNOWN */
        private static final int f51429xba755b74 = -1;

        /* renamed from: hevcHWDecoderLevel */
        public int f51430xc1761739;

        /* renamed from: hevcHWDecoderProfile */
        public int f51431x25b2ec1e;

        public HEVCDecoderParams() {
            mo101571x6761d4f();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff
        /* renamed from: paramsToJson */
        public void mo101569x52e5e329(org.json.JSONObject jSONObject) {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff
        /* renamed from: paramsToProperties */
        public void mo101570xb4a60eb4(com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c) {
            interfaceC26262x6f07842c.put(f51427xc7663333, this.f51431x25b2ec1e);
            interfaceC26262x6f07842c.put(f51426x3b238e, this.f51430xc1761739);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff
        /* renamed from: reset */
        public void mo101571x6761d4f() {
            this.f51431x25b2ec1e = -1;
            this.f51430xc1761739 = -1;
        }
    }

    /* renamed from: com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters$VP8DecoderParams */
    /* loaded from: classes16.dex */
    public class VP8DecoderParams implements com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff {

        /* renamed from: LEVEL_UNKNOWN */
        private static final int f51433x6918de4f = -1;

        /* renamed from: PROFILE_UNKNOWN */
        private static final int f51434xba755b74 = -1;

        /* renamed from: VP8_HW_DECODER_LEVEL */
        private static final java.lang.String f51435x92b251ba = "vp8hwdecoderlevel";

        /* renamed from: VP8_HW_DECODER_PROFILE */
        private static final java.lang.String f51436x98ca865f = "vp8hwdecoderprofile";

        /* renamed from: vp8HWDecoderLevel */
        public int f51438xe033ec8d;

        /* renamed from: vp8HWDecoderProfile */
        public int f51439x8c50bc72;

        public VP8DecoderParams() {
            mo101571x6761d4f();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff
        /* renamed from: paramsToJson */
        public void mo101569x52e5e329(org.json.JSONObject jSONObject) {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff
        /* renamed from: paramsToProperties */
        public void mo101570xb4a60eb4(com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c) {
            interfaceC26262x6f07842c.put(f51436x98ca865f, this.f51439x8c50bc72);
            interfaceC26262x6f07842c.put(f51435x92b251ba, this.f51438xe033ec8d);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff
        /* renamed from: reset */
        public void mo101571x6761d4f() {
            this.f51439x8c50bc72 = -1;
            this.f51438xe033ec8d = -1;
        }
    }

    /* renamed from: com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters$VP9DecoderParams */
    /* loaded from: classes16.dex */
    public class VP9DecoderParams implements com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff {

        /* renamed from: LEVEL_UNKNOWN */
        private static final int f51440x6918de4f = -1;

        /* renamed from: PROFILE_UNKNOWN */
        private static final int f51441xba755b74 = -1;

        /* renamed from: VP9_HW_DECODER_LEVEL */
        private static final java.lang.String f51442x574433d9 = "vp9hwdecoderlevel";

        /* renamed from: VP9_HW_DECODER_PROFILE */
        private static final java.lang.String f51443x806c5cbe = "vp9hwdecoderprofile";

        /* renamed from: vp9HWDecoderLevel */
        public int f51445x3a0f56ce;

        /* renamed from: vp9HWDecoderProfile */
        public int f51446xdcfa9a73;

        public VP9DecoderParams() {
            mo101571x6761d4f();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff
        /* renamed from: paramsToJson */
        public void mo101569x52e5e329(org.json.JSONObject jSONObject) {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff
        /* renamed from: paramsToProperties */
        public void mo101570xb4a60eb4(com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c) {
            interfaceC26262x6f07842c.put(f51443x806c5cbe, this.f51446xdcfa9a73);
            interfaceC26262x6f07842c.put(f51442x574433d9, this.f51445x3a0f56ce);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26261x6ce154ff
        /* renamed from: reset */
        public void mo101571x6761d4f() {
            this.f51446xdcfa9a73 = -1;
            this.f51445x3a0f56ce = -1;
        }
    }

    /* renamed from: getAV1DecoderParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.AV1DecoderParams m101589x729c4104() {
        return this.f51399xf0dba41b;
    }

    /* renamed from: getCommonParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.CommonParams m101590x61d745c7() {
        return this.f51400x9879cc5e;
    }

    /* renamed from: getHEVCDecoderParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.HEVCDecoderParams m101591x189e7a0a() {
        return this.f51401x624b79d3;
    }

    /* renamed from: getVP8DecoderParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.VP8DecoderParams m101592x57f7a22() {
        return this.f51402x83bedd39;
    }

    /* renamed from: getVP9DecoderParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26265x13d73508.VP9DecoderParams m101593xe75d43c1() {
        return this.f51403x659ca6d8;
    }

    /* renamed from: resetAllParams */
    public void m101594xea546df8() {
        this.f51400x9879cc5e.mo101571x6761d4f();
        this.f51399xf0dba41b.mo101571x6761d4f();
    }
}
