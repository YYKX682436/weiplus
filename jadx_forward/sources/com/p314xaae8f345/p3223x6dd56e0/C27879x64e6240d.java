package com.p314xaae8f345.p3223x6dd56e0;

/* renamed from: com.tencent.youtu.YTBizPalmRegister */
/* loaded from: classes14.dex */
public class C27879x64e6240d {

    /* renamed from: nativePtr */
    private long f61422xc3e75f57;

    /* renamed from: com.tencent.youtu.YTBizPalmRegister$HandType */
    /* loaded from: classes14.dex */
    public static class HandType {

        /* renamed from: LEFT */
        public static int f61423x239807 = 0;

        /* renamed from: RIGHT */
        public static int f61424x4a5c9fc = 1;

        /* renamed from: UNKNOWN */
        public static int f61425x19d1382a = 2;
    }

    /* renamed from: com.tencent.youtu.YTBizPalmRegister$ImageDataResult */
    /* loaded from: classes14.dex */
    public static class ImageDataResult {

        /* renamed from: data */
        public byte[] f61426x2eefaa;

        /* renamed from: md5Hex */
        public java.lang.String f61427xbf9a9cbd;
    }

    /* renamed from: com.tencent.youtu.YTBizPalmRegister$ImageResult */
    /* loaded from: classes14.dex */
    public static class ImageResult {

        /* renamed from: LIVENESS */
        public static int f61428x8331d543 = 2;

        /* renamed from: REGISTER */
        public static int f61429x5821ea3 = 1;
    }

    /* renamed from: com.tencent.youtu.YTBizPalmRegister$Result */
    /* loaded from: classes14.dex */
    public static class Result {

        /* renamed from: angle */
        public float f61430x58a78d3;

        /* renamed from: code */
        public int f61431x2eaded;

        /* renamed from: debugJSON */
        public java.lang.String f61432xf42a19bb;

        /* renamed from: frame */
        public int f61433x5d2a96d;

        /* renamed from: handType */
        public int f61434x14f449;

        /* renamed from: isFirstPalm */
        public boolean f61435x4e2913f8;

        /* renamed from: isQualifiedPalm */
        public boolean f61436x5f2170e4;

        /* renamed from: palmCircle */
        public float[] f61437xdf675ea2;

        /* renamed from: palmRect */
        public android.graphics.RectF f61438x3c324836;

        /* renamed from: targetHandType */
        public int f61439xa12fa8fa;

        /* renamed from: tipCircle */
        public float[] f61440x6769494b;

        /* renamed from: tipCode */
        public int f61441xb1ca1d28;
    }

    /* renamed from: com.tencent.youtu.YTBizPalmRegister$Tip */
    /* loaded from: classes14.dex */
    public static class Tip {

        /* renamed from: YT_TIP_HAND_ACTION_CLOSE */
        public static int f61442x4d823377 = 120;

        /* renamed from: YT_TIP_HAND_ACTION_OPEN */
        public static int f61443xc8b720cb = 110;

        /* renamed from: YT_TIP_HAND_ACTION_STILL_CLOSE */
        public static int f61444xd0e546c0 = 121;

        /* renamed from: YT_TIP_HAND_ACTION_STILL_OPEN */
        public static int f61445xbc700062 = 111;

        /* renamed from: YT_TIP_HAND_ACTION_UNKNOWN */
        public static int f61446xb1229a09 = 198;

        /* renamed from: YT_TIP_HAND_ACTION_WRONG */
        public static int f61447x4e9ec32c = 199;

        /* renamed from: YT_TIP_HAND_LEAN_BACKWARD */
        public static int f61448x9cf1ecb4 = 1021;

        /* renamed from: YT_TIP_HAND_LEAN_FORWARD */
        public static int f61449x4c3c0fb4 = 1020;

        /* renamed from: YT_TIP_HAND_LEAN_RIGHT_LEFT */
        public static int f61450xc3ba4fb = 1022;

        /* renamed from: YT_TIP_HAND_MOVE_CENTER */
        public static int f61451xfa14969b = 1010;

        /* renamed from: YT_TIP_HAND_MOVE_CLOSER */
        public static int f61452xfa77abc0 = 1011;

        /* renamed from: YT_TIP_HAND_MOVE_FAST */
        public static int f61453x941c8022 = 1016;

        /* renamed from: YT_TIP_HAND_MOVE_FURTHER */
        public static int f61454x2b6e07e = 1012;

        /* renamed from: YT_TIP_HAND_MOVE_ROTATE */
        public static int f61455x143ca7a1 = 1013;

        /* renamed from: YT_TIP_HAND_MULTI */
        public static int f61456xe4291931 = 1001;

        /* renamed from: YT_TIP_HAND_NOT_AVAILABLE */
        public static int f61457xd495e435 = 1004;

        /* renamed from: YT_TIP_HAND_NOT_FOUND */
        public static int f61458xe9968eee = 1000;

        /* renamed from: YT_TIP_HAND_TOO_NEAR */
        public static int f61459xea2a413b = 1005;

        /* renamed from: YT_TIP_HAND_TYPE_LEFT */
        public static int f61460x7364ae04 = 1002;

        /* renamed from: YT_TIP_HAND_TYPE_RIGHT */
        public static int f61461xf987739f = 1003;

        /* renamed from: YT_TIP_IMAGE_TOO_BRIGHT */
        public static int f61462xda9adbd1 = 1901;

        /* renamed from: YT_TIP_IMAGE_TOO_DARK */
        public static int f61463x424b6a0d = 1900;

        /* renamed from: YT_TIP_JOINT_OUT_OF_IMAGE */
        public static int f61464xd066f061 = 1015;

        /* renamed from: YT_TIP_PALM_MULTI */
        public static int f61465x92ca5db4 = 1101;

        /* renamed from: YT_TIP_PALM_NOT_FOUND */
        public static int f61466x252bd9f1 = 1100;

        /* renamed from: YT_TIP_PALM_OUT_OF_IMAGE */
        public static int f61467xab67dc9 = 1014;

        /* renamed from: YT_TIP_PALM_QUALITY_ABNORMAL */
        public static int f61468x55b2ec2d = 1204;

        /* renamed from: YT_TIP_PALM_QUALITY_BLUE */
        public static int f61469x63d672bf = 1212;

        /* renamed from: YT_TIP_PALM_QUALITY_BLURRINESS */
        public static int f61470xe946c2da = 1206;

        /* renamed from: YT_TIP_PALM_QUALITY_CONTINUE_BLURRINESS */
        public static int f61471x99231c8 = 1260;

        /* renamed from: YT_TIP_PALM_QUALITY_DORSUM */
        public static int f61472xcb9798c9 = 1200;

        /* renamed from: YT_TIP_PALM_QUALITY_FOCUS */
        public static int f61473x17315ef3 = 1216;

        /* renamed from: YT_TIP_PALM_QUALITY_FORWARD */
        public static int f61474x11297e20 = 1202;

        /* renamed from: YT_TIP_PALM_QUALITY_GREEN */
        public static int f61475x1740d91e = 1213;

        /* renamed from: YT_TIP_PALM_QUALITY_ILLUM_BRIGHT */
        public static int f61476x7f50de7d = 1208;

        /* renamed from: YT_TIP_PALM_QUALITY_ILLUM_DARK */
        public static int f61477x87ba27b9 = 1207;

        /* renamed from: YT_TIP_PALM_QUALITY_LATERAL */
        public static int f61478x36bf4712 = 1201;

        /* renamed from: YT_TIP_PALM_QUALITY_LIGHT_BRIGHT */
        public static int f61479x61f717c8 = 1211;

        /* renamed from: YT_TIP_PALM_QUALITY_LIGHT_DART */
        public static int f61480xfca437cd = 1210;

        /* renamed from: YT_TIP_PALM_QUALITY_LINE */
        public static int f61481x63daf259 = 1215;

        /* renamed from: YT_TIP_PALM_QUALITY_NOISE */
        public static int f61482x17a23135 = 1209;

        /* renamed from: YT_TIP_PALM_QUALITY_OCCLUSION */
        public static int f61483x9973e228 = 1203;

        /* renamed from: YT_TIP_PALM_QUALITY_REGISTRATION */
        public static int f61484x3d6fe61e = 1205;

        /* renamed from: YT_TIP_PALM_QUALITY_TOTAL */
        public static int f61485x17f6e55f = 1214;

        /* renamed from: YT_TIP_PIPELINE_SUCCESS */
        public static int f61486x5d02d2e;
    }

    public C27879x64e6240d(java.lang.String str, java.lang.String str2) {
        int m120534x65a24b43 = m120534x65a24b43(str, str2);
        if (m120534x65a24b43 == 0) {
            return;
        }
        throw new java.lang.IllegalAccessError("error model dirpath and config filaneme: " + m120534x65a24b43);
    }

    /* renamed from: NativeConstructor */
    private native int m120533x65a24b43(android.content.res.AssetManager assetManager, java.lang.String str, java.lang.String str2);

    /* renamed from: NativeConstructor */
    private native int m120534x65a24b43(java.lang.String str, java.lang.String str2);

    /* renamed from: NativeDestructor */
    private native void m120535xb127390();

    /* renamed from: getFullVersion */
    public static native java.lang.String m120536xaa91aa13(java.lang.String str, java.lang.String str2);

    /* renamed from: getVersion */
    public static native java.lang.String m120537x52c258a2();

    /* renamed from: destroy */
    public void m120538x5cd39ffa() {
        m120535xb127390();
    }

    /* renamed from: finalize */
    public void m120539xd764dc1e() {
        m120535xb127390();
    }

    /* renamed from: getImageData */
    public native com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.ImageDataResult m120540xcb0e58ef(int i17);

    /* renamed from: getPipelineResult */
    public native java.lang.String m120541xa1a72a55();

    /* renamed from: process */
    public native com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Result m120542xed8d1e6f(byte[] bArr, int i17, int i18);

    /* renamed from: reset */
    public native int m120543x6761d4f();

    /* renamed from: resetConfig */
    public native int m120544xb65d1571(java.lang.String str);

    /* renamed from: setConfig */
    public native int m120545x78bda44(java.lang.String str);

    /* renamed from: setDebug */
    public native int m120546x52dc5711(boolean z17);

    /* renamed from: setHandType */
    public native int m120547x76a792cb(int i17);

    public C27879x64e6240d(android.content.res.AssetManager assetManager, java.lang.String str, java.lang.String str2) {
        int m120533x65a24b43 = m120533x65a24b43(assetManager, str, str2);
        if (m120533x65a24b43 == 0) {
            return;
        }
        throw new java.lang.IllegalAccessError("error model dirpath and config filaneme: " + m120533x65a24b43);
    }
}
