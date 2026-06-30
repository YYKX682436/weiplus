package com.tencent.mm.live.core.core.trtc.sdkadapter.feature;

/* loaded from: classes3.dex */
public class WxAudio3aParmConfig {
    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("voipCodec");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/live/core/core/trtc/sdkadapter/feature/WxAudio3aParmConfig", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/live/core/core/trtc/sdkadapter/feature/WxAudio3aParmConfig", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static native int GetIsVoiceRoom();

    public static native int GetNNAecState();

    public static native long GetTxliteLive3AStrategyCreateAddr();

    public static native long GetTxliteLive3AStrategyDestroyAddr();

    public static native long GetWaveLive3AStrategyCreateAddr();

    public static native long GetWaveLive3AStrategyDestroyAddr();

    public static native long GetWaveLive3aProcessorCreateAddr();

    public static native long GetWaveLive3aProcessorDestoryAddr();

    public static native int GetXNetCommit();

    public static native int SetModelBinFilePath(java.lang.String str, int i17);

    public static native int SetTxlite3ALiveXSysParm(int i17, long j17, long j18, long j19, long j27);

    public static native int SetWave3ALiveXSysParm(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, int i59, int i66, int i67, int i68, int i69, int i76, int i77, int i78, int i79, int i86, int i87);
}
