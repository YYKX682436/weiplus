package com.tencent.mm.audio.mix.jni;

/* loaded from: classes13.dex */
public class AudioFFmpegDecodeJni {
    private byte _hellAccFlag_;
    protected long nativeCtx = 0;

    /* loaded from: classes10.dex */
    public static class StreamMetaInfo {
        public long audioBitrate;
        public int audioChannel;
        public java.lang.String audioCodecId;
        public java.lang.String audioCodecTag;
        public int audioFormat;
        public long audioSampleRate;
        public int codecId;
        public int colorSpace;
        public double duration;
        public int height;
        public int level;
        public int profile;
        public java.lang.String profileName;
        public long videoBitrate;
        public java.lang.String videoCodecId;
        public java.lang.String videoCodecTag;
        public int width;
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("xffmpeg");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/audio/mix/jni/AudioFFmpegDecodeJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/audio/mix/jni/AudioFFmpegDecodeJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add("AudioFFmpegDecode");
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/audio/mix/jni/AudioFFmpegDecodeJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList2.get(0));
        yj0.a.f(obj2, "com/tencent/mm/audio/mix/jni/AudioFFmpegDecodeJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static native int decode(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.audio.mix.decode.IDecodeCallback iDecodeCallback);

    public static native com.tencent.mm.audio.mix.jni.AudioFFmpegDecodeJni.StreamMetaInfo parseMetaInfo(byte[] bArr, int i17);

    public native int clearResample(java.lang.String str);

    public native int initResample(java.lang.String str, int i17, int i18, int i19, int i27);

    public native java.nio.ByteBuffer resamplePcm(java.lang.String str, int i17, int i18, byte[] bArr, int i19, java.nio.ByteBuffer byteBuffer);
}
