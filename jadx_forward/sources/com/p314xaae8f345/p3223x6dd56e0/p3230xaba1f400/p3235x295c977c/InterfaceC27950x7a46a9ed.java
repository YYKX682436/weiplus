package com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c;

/* renamed from: com.tencent.youtu.ytagreflectlivecheck.requester.RGBConfigRequester */
/* loaded from: classes6.dex */
public interface InterfaceC27950x7a46a9ed {

    /* renamed from: com.tencent.youtu.ytagreflectlivecheck.requester.RGBConfigRequester$RGBConfigRequestCallBack */
    /* loaded from: classes6.dex */
    public interface RGBConfigRequestCallBack {
        /* renamed from: onFailed */
        void m121187x428b6afc(int i17);

        /* renamed from: onSuccess */
        void m121188xe05b4124(java.lang.String str, int i17);
    }

    /* renamed from: com.tencent.youtu.ytagreflectlivecheck.requester.RGBConfigRequester$RGBConfigRequestCallBackType */
    /* loaded from: classes6.dex */
    public static class RGBConfigRequestCallBackType {

        /* renamed from: RGB_FullResponse */
        public static int f62537x9ce5de62 = 0;

        /* renamed from: RGB_OnlyRgbConfig */
        public static int f62538x93fe87f1 = 1;
    }

    /* renamed from: com.tencent.youtu.ytagreflectlivecheck.requester.RGBConfigRequester$YTColorSeqReq */
    /* loaded from: classes13.dex */
    public static class YTColorSeqReq {

        /* renamed from: app_id */
        public java.lang.String f62541xabe4b7f9;

        /* renamed from: business_name */
        public java.lang.String f62551x258b4baa;

        /* renamed from: person_id */
        public java.lang.String f62552x32da9a45;

        /* renamed from: build_brand */
        public java.lang.String f62542x99d36a76 = android.os.Build.BRAND;

        /* renamed from: build_model */
        public java.lang.String f62547x9a6d1a18 = android.os.Build.MODEL;

        /* renamed from: build_hardware */
        public java.lang.String f62545xea2eac99 = android.os.Build.HARDWARE;

        /* renamed from: build_serial */
        public java.lang.String f62549xbcecbce5 = android.os.Build.SERIAL;

        /* renamed from: build_id */
        public java.lang.String f62546xaab9ec8c = android.os.Build.ID;

        /* renamed from: build_display */
        public java.lang.String f62544xce1237f1 = android.os.Build.DISPLAY;

        /* renamed from: build_product */
        public java.lang.String f62548x57faec1e = android.os.Build.PRODUCT;

        /* renamed from: build_device */
        public java.lang.String f62543xa355dd47 = android.os.Build.DEVICE;

        /* renamed from: build_test */
        public java.lang.String f62550xe3f60bc3 = null;

        /* renamed from: android_apilevel */
        public java.lang.String f62539x99cc297a = "" + android.os.Build.VERSION.SDK_INT;

        /* renamed from: android_version */
        public java.lang.String f62540xff431b08 = android.os.Build.VERSION.RELEASE;

        /* renamed from: platform */
        public int f62553x6fbd6873 = 2;

        public YTColorSeqReq(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.f62541xabe4b7f9 = str;
            this.f62551x258b4baa = str2;
            this.f62552x32da9a45 = str3;
        }
    }

    /* renamed from: request */
    void m121186x414ef28f(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.InterfaceC27950x7a46a9ed.RGBConfigRequestCallBack rGBConfigRequestCallBack);
}
