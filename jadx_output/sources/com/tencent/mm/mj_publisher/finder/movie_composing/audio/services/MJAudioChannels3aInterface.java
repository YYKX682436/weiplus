package com.tencent.mm.mj_publisher.finder.movie_composing.audio.services;

/* loaded from: classes5.dex */
public class MJAudioChannels3aInterface {
    private byte _hellAccFlag_;
    private final long nativePtr = nCreateProcessorInterface();

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("voipCodec");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/audio/services/MJAudioChannels3aInterface", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/mj_publisher/finder/movie_composing/audio/services/MJAudioChannels3aInterface", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private native long nCreateProcessorInterface();

    private native void nDestroyProcessorInterface(long j17);

    private native int nGetVersion();

    private native int nInit(long j17);

    private native int nProcessPlayoutData(long j17, byte[] bArr, int i17, int i18, int i19);

    private native int nProcessRecordedData(long j17, byte[] bArr, int i17, int i18, int i19);

    private native int nReset(long j17);

    private native int nSetConfig(long j17, com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.AudioChannels3aConfig audioChannels3aConfig);

    private native int nSetModelBinFilePath(long j17, java.lang.String str, int i17);

    public void destroy() {
        long j17 = this.nativePtr;
        if (j17 == 0) {
            throw new java.lang.IllegalStateException("Not initialized");
        }
        nDestroyProcessorInterface(j17);
    }

    public int getVersion() {
        return nGetVersion();
    }

    public boolean init() {
        long j17 = this.nativePtr;
        if (j17 != 0) {
            return nInit(j17) == 0;
        }
        throw new java.lang.IllegalStateException("Unable to initialize");
    }

    public int processPlayoutData(byte[] bArr, int i17, int i18, int i19) {
        long j17 = this.nativePtr;
        if (j17 != 0) {
            return nProcessPlayoutData(j17, bArr, i17, i18, i19);
        }
        throw new java.lang.IllegalStateException("Not initialized");
    }

    public int processRecordedData(byte[] bArr, int i17, int i18, int i19) {
        long j17 = this.nativePtr;
        if (j17 != 0) {
            return nProcessRecordedData(j17, bArr, i17, i18, i19);
        }
        throw new java.lang.IllegalStateException("Not initialized");
    }

    public int reset() {
        long j17 = this.nativePtr;
        if (j17 != 0) {
            return nReset(j17);
        }
        throw new java.lang.IllegalStateException("Not initialized");
    }

    public int setConfig(com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.AudioChannels3aConfig audioChannels3aConfig) {
        long j17 = this.nativePtr;
        if (j17 != 0) {
            return nSetConfig(j17, audioChannels3aConfig);
        }
        throw new java.lang.IllegalStateException("Not initialized");
    }

    public int setModelBinFilePath(java.lang.String str, int i17) {
        long j17 = this.nativePtr;
        if (j17 != 0) {
            return nSetModelBinFilePath(j17, str, i17);
        }
        throw new java.lang.IllegalStateException("Unable to initialize");
    }
}
