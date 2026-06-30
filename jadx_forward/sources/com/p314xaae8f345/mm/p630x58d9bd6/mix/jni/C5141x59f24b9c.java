package com.p314xaae8f345.mm.p630x58d9bd6.mix.jni;

/* renamed from: com.tencent.mm.audio.mix.jni.AudioFFmpegDecodeJni */
/* loaded from: classes13.dex */
public class C5141x59f24b9c {

    /* renamed from: _hellAccFlag_ */
    private byte f21485x7f11beae;

    /* renamed from: nativeCtx */
    protected long f21486xc3e72e90 = 0;

    /* renamed from: com.tencent.mm.audio.mix.jni.AudioFFmpegDecodeJni$StreamMetaInfo */
    /* loaded from: classes10.dex */
    public static class StreamMetaInfo {

        /* renamed from: audioBitrate */
        public long f21487x9b599ab7;

        /* renamed from: audioChannel */
        public int f21488xcd7d9c4d;

        /* renamed from: audioCodecId */
        public java.lang.String f21489xd9958b1b;

        /* renamed from: audioCodecTag */
        public java.lang.String f21490x591c019a;

        /* renamed from: audioFormat */
        public int f21491x3e7c76d;

        /* renamed from: audioSampleRate */
        public long f21492xa80e7620;

        /* renamed from: codecId */
        public int f21493x38236bd1;

        /* renamed from: colorSpace */
        public int f21494x4c33f763;

        /* renamed from: duration */
        public double f21495x89444d94;

        /* renamed from: height */
        public int f21496xb7389127;

        /* renamed from: level */
        public int f21497x6219b84;

        /* renamed from: profile */
        public int f21498xed8e89a9;

        /* renamed from: profileName */
        public java.lang.String f21499xa947bd4;

        /* renamed from: videoBitrate */
        public long f21500xf1220e72;

        /* renamed from: videoCodecId */
        public java.lang.String f21501x2f5dfed6;

        /* renamed from: videoCodecTag */
        public java.lang.String f21502xbc62053f;

        /* renamed from: width */
        public int f21503x6be2dc6;
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("xffmpeg");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/audio/mix/jni/AudioFFmpegDecodeJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/audio/mix/jni/AudioFFmpegDecodeJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add("AudioFFmpegDecode");
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/audio/mix/jni/AudioFFmpegDecodeJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList2.get(0));
        yj0.a.f(obj2, "com/tencent/mm/audio/mix/jni/AudioFFmpegDecodeJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: decode */
    public static native int m43235xb06291ee(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p630x58d9bd6.mix.p631xb06291ee.InterfaceC5140x264f60fc interfaceC5140x264f60fc);

    /* renamed from: parseMetaInfo */
    public static native com.p314xaae8f345.mm.p630x58d9bd6.mix.jni.C5141x59f24b9c.StreamMetaInfo m43236xb6738026(byte[] bArr, int i17);

    /* renamed from: clearResample */
    public native int m43237xbee24f0a(java.lang.String str);

    /* renamed from: initResample */
    public native int m43238x72008acd(java.lang.String str, int i17, int i18, int i19, int i27);

    /* renamed from: resamplePcm */
    public native java.nio.ByteBuffer m43239xf12825fd(java.lang.String str, int i17, int i18, byte[] bArr, int i19, java.nio.ByteBuffer byteBuffer);
}
