package com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c;

/* renamed from: com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester */
/* loaded from: classes13.dex */
public interface InterfaceC27948xa14a9cf7 {

    /* renamed from: com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester$LiveStyleAndroidData */
    /* loaded from: classes13.dex */
    public static class LiveStyleAndroidData {
        public float lux = 0.0f;

        /* renamed from: build_brand */
        public java.lang.String f62515x99d36a76 = android.os.Build.BRAND;

        /* renamed from: build_model */
        public java.lang.String f62519x9a6d1a18 = android.os.Build.MODEL;

        /* renamed from: build_hardware */
        public java.lang.String f62518xea2eac99 = android.os.Build.HARDWARE;

        /* renamed from: build_display */
        public java.lang.String f62517xce1237f1 = android.os.Build.DISPLAY;

        /* renamed from: build_product */
        public java.lang.String f62520x57faec1e = android.os.Build.PRODUCT;

        /* renamed from: build_device */
        public java.lang.String f62516xa355dd47 = android.os.Build.DEVICE;

        /* renamed from: android_apilevel */
        public java.lang.String f62513x99cc297a = "" + android.os.Build.VERSION.SDK_INT;

        /* renamed from: android_version */
        public java.lang.String f62514xff431b08 = android.os.Build.VERSION.RELEASE;
    }

    /* renamed from: com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester$SeleceData */
    /* loaded from: classes13.dex */
    public static class SeleceData {

        /* renamed from: android_data */
        public com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.InterfaceC27948xa14a9cf7.LiveStyleAndroidData f62521xc4dd1f7a;

        /* renamed from: platform */
        public int f62523x6fbd6873 = 2;

        /* renamed from: protocal */
        public int f62524xc50a8ce6 = 1;

        /* renamed from: version */
        public java.lang.String f62526x14f51cd8 = com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.f62360x3fc0a8b8;

        /* renamed from: reflect_param */
        public java.lang.String f62525xed65908b = " version 2 ";

        /* renamed from: change_point_num */
        public int f62522xa91d1a88 = 2;

        public SeleceData(float f17) {
            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.InterfaceC27948xa14a9cf7.LiveStyleAndroidData liveStyleAndroidData = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.InterfaceC27948xa14a9cf7.LiveStyleAndroidData();
            this.f62521xc4dd1f7a = liveStyleAndroidData;
            liveStyleAndroidData.lux = f17;
        }
    }

    /* renamed from: com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester$YTLiveStyleReq */
    /* loaded from: classes13.dex */
    public static class YTLiveStyleReq {

        /* renamed from: app_id */
        public java.lang.String f62527xabe4b7f9;

        /* renamed from: select_data */
        public com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.InterfaceC27948xa14a9cf7.SeleceData f62528xcd0310d;

        public YTLiveStyleReq(float f17, java.lang.String str) {
            this.f62528xcd0310d = new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.InterfaceC27948xa14a9cf7.SeleceData(f17);
            this.f62527xabe4b7f9 = str;
        }
    }
}
