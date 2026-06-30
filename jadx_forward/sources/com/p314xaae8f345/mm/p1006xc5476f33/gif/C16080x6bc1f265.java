package com.p314xaae8f345.mm.p1006xc5476f33.gif;

/* renamed from: com.tencent.mm.plugin.gif.MMWXGFJNI */
/* loaded from: classes10.dex */
public class C16080x6bc1f265 {

    /* renamed from: KV_STAT_WXAM_DEC_REPORT */
    public static final int f37010xcf12ff4c = 31880;

    /* renamed from: KV_STAT_WXAM_ENC_REPORT */
    public static final int f37011xf9c45774 = 31862;

    /* renamed from: PIC_TYPE_JPG */
    public static final int f37012xd7c21c71 = 0;

    /* renamed from: PIC_TYPE_PNG */
    public static final int f37013xd7c232b9 = 1;
    private static final java.lang.String TAG = "MicroMsg.JNI.MMWXGF";

    /* renamed from: WXAM_SCENE_BRAND */
    public static final int f37014x38034762 = 7;

    /* renamed from: WXAM_SCENE_C2C */
    public static final int f37015x30ceb88f = 1;

    /* renamed from: WXAM_SCENE_EMOJI */
    public static final int f37016x382b7c21 = 6;

    /* renamed from: WXAM_SCENE_HEAD */
    public static final int f37017xe90ae685 = 3;

    /* renamed from: WXAM_SCENE_MISC */
    public static final int f37018xe90d3d91 = 5;

    /* renamed from: WXAM_SCENE_SCAN */
    public static final int f37019xe90fdf22 = 4;

    /* renamed from: WXAM_SCENE_SNS */
    public static final int f37020x30cef813 = 2;

    /* renamed from: WXAM_SCENE_UNKONWN */
    public static final int f37021x2b1f8a03 = 0;

    /* renamed from: mECode */
    static int f37022xbdecb385 = -1;

    /* renamed from: mIsInit */
    static boolean f37023x9106827;

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "static MMWXGFJNI");
        fp.d0.n("wxVcodec2");
        f37023x9106827 = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r9.a();
        int m64976xb90145c7 = m64976xb90145c7("libwxVcodec2.so");
        f37022xbdecb385 = m64976xb90145c7;
        f37023x9106827 = m64976xb90145c7 >= 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "native init MMWXGF mECode:%d result:%b :%s", java.lang.Integer.valueOf(m64976xb90145c7), java.lang.Boolean.valueOf(f37023x9106827), "libwxVcodec2.so");
    }

    /* renamed from: getErrorCode */
    public static int m64962x130a215f() {
        return f37022xbdecb385;
    }

    /* renamed from: isWxGF */
    public static boolean m64963xb9aabfca(byte[] bArr, int i17) {
        return m64980x7e04d6a1(bArr, i17);
    }

    /* renamed from: nativeAV2Gif */
    private static native int m64964x6eb45abe(java.lang.String str, java.lang.String str2);

    /* renamed from: nativeAV2Gif */
    private static native int m64965x6eb45abe(byte[] bArr, byte[] bArr2);

    /* renamed from: nativeAddGifEncodeRgbaFrame */
    public static native int m64966xf0deed69(long j17, int i17, int i18, byte[] bArr, long j18);

    /* renamed from: nativeAddWxAMEncodeRgbaFrame */
    public static native int m64967x3000772c(long j17, int i17, int i18, byte[] bArr, long j18);

    /* renamed from: nativeDecodeBufferFrame */
    public static native int m64968x5ea842e8(long j17, byte[] bArr, int i17, android.graphics.Bitmap bitmap, int[] iArr);

    /* renamed from: nativeDecodeBufferHeader */
    public static native int m64969x79127872(long j17, byte[] bArr, int i17);

    /* renamed from: nativeFinishGifEncode */
    public static native byte[] m64970x70ae3690(long j17);

    /* renamed from: nativeFinishWxAMEncode */
    public static native byte[] m64971xf7f7926d(long j17);

    /* renamed from: nativeFinishWxAMEncodeReport */
    public static native byte[] m64972x483a8e01(long j17, long[] jArr);

    /* renamed from: nativeGetAigcInfoFromBuf */
    public static native byte[] m64973x2abfde78(byte[] bArr);

    /* renamed from: nativeGetAigcInfoFromFile */
    public static native byte[] m64974x2d3d9617(java.lang.String str);

    /* renamed from: nativeGetOption */
    public static native int m64975xf44a514(long j17, byte[] bArr, int i17, int[] iArr);

    /* renamed from: nativeInit */
    public static native int m64976xb90145c7(java.lang.String str);

    /* renamed from: nativeInitGifEncode */
    public static native long m64977xd2c040f3(int i17, int i18, long j17);

    /* renamed from: nativeInitWxAMDecoder */
    public static native long m64978xe871e070();

    /* renamed from: nativeInitWxAMEncoder */
    public static native long m64979x2cb3b948(int i17, int i18, long j17, int i19, int i27, int i28, int i29, int i37);

    /* renamed from: nativeIsWXGF */
    public static native boolean m64980x7e04d6a1(byte[] bArr, int i17);

    /* renamed from: nativePic2Wxam */
    private static native int m64981xe8be540c(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, boolean z17, int i37, int i38, int i39, int i47);

    /* renamed from: nativePic2WxamReport */
    private static native int m64982x7a2b5c60(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, long[] jArr, boolean z17, int i37, int i38, int i39, int i47, byte[] bArr);

    /* renamed from: nativePic2WxamWHReportWithAigc */
    private static native int m64983x42e9177b(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, long[] jArr, int i39, int i47, int i48, int i49, byte[] bArr2, byte[] bArr3, int i57);

    /* renamed from: nativePic2WxamWHWithAigc */
    private static native int m64984x1c91c3e7(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, byte[] bArr2, int i57);

    /* renamed from: nativePic2WxamWithWH */
    private static native int m64985x82eda943(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38);

    /* renamed from: nativePic2WxamWithWH */
    private static native int m64986x82eda943(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49);

    /* renamed from: nativePic2WxamWithWHReport */
    private static native int m64987x443dac57(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, long[] jArr, boolean z17, int i28, int i29, int i37, int i38);

    /* renamed from: nativePic2WxamWithWHReport */
    private static native int m64988x443dac57(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, long[] jArr, int i39, int i47, int i48, int i49, byte[] bArr2);

    /* renamed from: nativeRewindBuffer */
    public static native int m64989xa5576e92(long j17);

    /* renamed from: nativeUninit */
    public static native int m64990x92410e20(long j17);

    /* renamed from: nativeWxam2Pic */
    private static native int m64991xd928597c(java.lang.String str, java.lang.String str2);

    /* renamed from: nativeWxam2PicBuf */
    private static native byte[] m64992xde866b57(byte[] bArr);

    /* renamed from: nativeWxam2PicBufReport */
    private static native byte[] m64993x28b98f6b(byte[] bArr, long[] jArr, byte[] bArr2);

    /* renamed from: nativeWxam2PicReport */
    private static native int m64994x96f78dd0(java.lang.String str, java.lang.String str2, long[] jArr, byte[] bArr);

    /* renamed from: nativeWxamToGif */
    public static native byte[] m64995x4dcf8e25(byte[] bArr);

    /* renamed from: pic2Wxam */
    public static int m64996xd0cba6d5(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, int i39, int i47, int i48, int i49) {
        java.lang.String a17 = kk.w.a(str, false);
        java.lang.String a18 = kk.w.a(str2, true);
        if (i37 != 1) {
            return m64981xe8be540c(a17, a18, i17, i18, i28, i19, i27, i29, z17, i39, i47, i48, i49);
        }
        long[] jArr = new long[26];
        byte[] bArr = new byte[1024];
        int m64982x7a2b5c60 = m64982x7a2b5c60(a17, a18, i17, i18, i28, i19, i27, i29, jArr, z17, i39, i47, i48, i49, bArr);
        if (m64982x7a2b5c60 != 0) {
            return m64982x7a2b5c60;
        }
        java.lang.String str3 = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        int indexOf = str3.indexOf(0);
        if (indexOf != -1) {
            str3 = str3.substring(0, indexOf);
        }
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.mo68478xbd3cda5f(f37011xf9c45774, fVar.s(java.lang.Integer.valueOf(i38), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]), java.lang.Long.valueOf(jArr[3]), java.lang.Long.valueOf(jArr[4]), java.lang.Long.valueOf(jArr[5]), java.lang.Long.valueOf(jArr[6]), java.lang.Long.valueOf(jArr[7]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[9]), java.lang.Long.valueOf(jArr[10]), java.lang.Long.valueOf(jArr[11]), java.lang.Long.valueOf(jArr[12]), java.lang.Long.valueOf(jArr[13]), java.lang.Long.valueOf(jArr[14]), java.lang.Long.valueOf(jArr[15]), java.lang.Long.valueOf(jArr[16]), java.lang.Long.valueOf(jArr[17]), java.lang.Long.valueOf(jArr[18]), java.lang.Long.valueOf(jArr[19]), java.lang.Long.valueOf(jArr[20]), java.lang.Long.valueOf(jArr[21]), java.lang.Long.valueOf(jArr[22]), java.lang.Long.valueOf(jArr[23]), java.lang.Long.valueOf(jArr[24]), java.lang.Long.valueOf(jArr[25]), str3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "Pic2Wxam report:scene[%d], type[%d], srcSize[%d], dstSize[%d], ver[%d], time[%d], icc:%s", java.lang.Integer.valueOf(i38), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[17]), java.lang.Long.valueOf(jArr[18]), str3);
        return m64982x7a2b5c60;
    }

    /* renamed from: pic2WxamWithWH */
    public static int m64997xb4fa014c(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47) {
        java.lang.String a17 = kk.w.a(str, false);
        java.lang.String a18 = kk.w.a(str2, true);
        if (i28 == 1) {
            long[] jArr = new long[26];
            int m64987x443dac57 = m64987x443dac57(a17, a18, i17, i18, i19, i27, jArr, false, i37, i38, i39, i47);
            if (m64987x443dac57 != 0) {
                return m64987x443dac57;
            }
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68478xbd3cda5f(f37011xf9c45774, fVar.s(java.lang.Integer.valueOf(i29), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]), java.lang.Long.valueOf(jArr[3]), java.lang.Long.valueOf(jArr[4]), java.lang.Long.valueOf(jArr[5]), java.lang.Long.valueOf(jArr[6]), java.lang.Long.valueOf(jArr[7]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[9]), java.lang.Long.valueOf(jArr[10]), java.lang.Long.valueOf(jArr[11]), java.lang.Long.valueOf(jArr[12]), java.lang.Long.valueOf(jArr[13]), java.lang.Long.valueOf(jArr[14]), java.lang.Long.valueOf(jArr[15]), java.lang.Long.valueOf(jArr[16]), java.lang.Long.valueOf(jArr[17]), java.lang.Long.valueOf(jArr[18]), java.lang.Long.valueOf(jArr[19]), java.lang.Long.valueOf(jArr[20]), java.lang.Long.valueOf(jArr[21]), java.lang.Long.valueOf(jArr[22]), java.lang.Long.valueOf(jArr[23]), java.lang.Long.valueOf(jArr[24]), java.lang.Long.valueOf(jArr[25])));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "Pic2Wxam report:scene[%d], type[%d], srcSize[%d], dstSize[%d], ver[%d], time[%d]", java.lang.Integer.valueOf(i29), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[17]), java.lang.Long.valueOf(jArr[18]));
            return m64987x443dac57;
        }
        return m64985x82eda943(a17, a18, i17, i18, i19, i27, i37, i38, i39, i47);
    }

    /* renamed from: wxam2Pic */
    public static int m65000xc135ac45(java.lang.String str, java.lang.String str2, int i17, int i18) {
        java.lang.String a17 = kk.w.a(str, false);
        java.lang.String a18 = kk.w.a(str2, true);
        if (i17 != 1) {
            return m64991xd928597c(a17, a18);
        }
        long[] jArr = new long[15];
        byte[] bArr = new byte[1024];
        int m64994x96f78dd0 = m64994x96f78dd0(a17, a18, jArr, bArr);
        if (m64994x96f78dd0 != 0) {
            return m64994x96f78dd0;
        }
        java.lang.String str3 = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        int indexOf = str3.indexOf(0);
        if (indexOf != -1) {
            str3 = str3.substring(0, indexOf);
        }
        java.lang.String str4 = str3;
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.mo68478xbd3cda5f(f37010xcf12ff4c, fVar.s(java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]), java.lang.Long.valueOf(jArr[3]), java.lang.Long.valueOf(jArr[4]), java.lang.Long.valueOf(jArr[5]), java.lang.Long.valueOf(jArr[6]), str4, java.lang.Long.valueOf(jArr[7]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[9]), java.lang.Long.valueOf(jArr[10]), java.lang.Long.valueOf(jArr[11]), java.lang.Long.valueOf(jArr[12]), java.lang.Long.valueOf(jArr[13]), java.lang.Long.valueOf(jArr[14])));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "Wxam2Pic report:scene[%d], type[%d], time[%d], ver[%d], srcSize[%d], dstSize[%d]", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[3]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[9]), java.lang.Long.valueOf(jArr[10]));
        return m64994x96f78dd0;
    }

    /* renamed from: wxam2PicBuf */
    public static byte[] m65001x4fb37ee(byte[] bArr, int i17, int i18) {
        if (i17 != 1) {
            return m64992xde866b57(bArr);
        }
        long[] jArr = new long[15];
        byte[] bArr2 = new byte[1024];
        byte[] m64993x28b98f6b = m64993x28b98f6b(bArr, jArr, bArr2);
        if (m64993x28b98f6b == null) {
            return m64993x28b98f6b;
        }
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        int indexOf = str.indexOf(0);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        java.lang.String str2 = str;
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.mo68478xbd3cda5f(f37010xcf12ff4c, fVar.s(java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]), java.lang.Long.valueOf(jArr[3]), java.lang.Long.valueOf(jArr[4]), java.lang.Long.valueOf(jArr[5]), java.lang.Long.valueOf(jArr[6]), str2, java.lang.Long.valueOf(jArr[7]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[9]), java.lang.Long.valueOf(jArr[10]), java.lang.Long.valueOf(jArr[11]), java.lang.Long.valueOf(jArr[12]), java.lang.Long.valueOf(jArr[13]), java.lang.Long.valueOf(jArr[14])));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "Wxam2Pic report:scene[%d], type[%d], time[%d], ver[%d], srcSize[%d], dstSize[%d]", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[3]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[9]), java.lang.Long.valueOf(jArr[10]));
        return m64993x28b98f6b;
    }

    /* renamed from: pic2WxamWithWH */
    public static int m64998xb4fa014c(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58) {
        return m64999xb4fa014c(str, bArr, i17, i18, i19, i27, i28, i29, i37, i38, i39, i47, i48, i49, i57, i58, new byte[0]);
    }

    /* renamed from: pic2WxamWithWH */
    public static int m64999xb4fa014c(java.lang.String str, byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, byte[] bArr2) {
        java.lang.String a17 = kk.w.a(str, true);
        if (i39 == 1) {
            long[] jArr = new long[26];
            byte[] bArr3 = new byte[1024];
            int m64983x42e9177b = m64983x42e9177b(a17, bArr, i17, i18, i19, i27, i28, i29, i37, i38, jArr, i48, i49, i57, i58, bArr3, bArr2, bArr2.length);
            if (m64983x42e9177b != 0) {
                return m64983x42e9177b;
            }
            java.lang.String str2 = new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8);
            int indexOf = str2.indexOf(0);
            if (indexOf != -1) {
                str2 = str2.substring(0, indexOf);
            }
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68478xbd3cda5f(f37011xf9c45774, fVar.s(java.lang.Integer.valueOf(i47), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]), java.lang.Long.valueOf(jArr[3]), java.lang.Long.valueOf(jArr[4]), java.lang.Long.valueOf(jArr[5]), java.lang.Long.valueOf(jArr[6]), java.lang.Long.valueOf(jArr[7]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[9]), java.lang.Long.valueOf(jArr[10]), java.lang.Long.valueOf(jArr[11]), java.lang.Long.valueOf(jArr[12]), java.lang.Long.valueOf(jArr[13]), java.lang.Long.valueOf(jArr[14]), java.lang.Long.valueOf(jArr[15]), java.lang.Long.valueOf(jArr[16]), java.lang.Long.valueOf(jArr[17]), java.lang.Long.valueOf(jArr[18]), java.lang.Long.valueOf(jArr[19]), java.lang.Long.valueOf(jArr[20]), java.lang.Long.valueOf(jArr[21]), java.lang.Long.valueOf(jArr[22]), java.lang.Long.valueOf(jArr[23]), java.lang.Long.valueOf(jArr[24]), java.lang.Long.valueOf(jArr[25]), str2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "Pic2Wxam report:scene[%d], type[%d], srcSize[%d], dstSize[%d], ver[%d], time[%d], icc:%s", java.lang.Integer.valueOf(i47), java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[17]), java.lang.Long.valueOf(jArr[18]), str2);
            return m64983x42e9177b;
        }
        return m64984x1c91c3e7(a17, bArr, i17, i18, i19, i27, i28, i29, i37, i38, i48, i49, i57, i58, bArr2, bArr2.length);
    }
}
