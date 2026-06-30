package com.tencent.mm.live.core.core.trtc.sdkadapter.feature;

/* loaded from: classes3.dex */
public class WeixinAudioJitterBufferControllerFactory {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.live.core.core.trtc.sdkadapter.feature.WeixinAudioJitterBufferControllerFactory f68564b;

    /* renamed from: a, reason: collision with root package name */
    public long f68565a = 0;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("voipCodec");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/live/core/core/trtc/sdkadapter/feature/WeixinAudioJitterBufferControllerFactory", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/live/core/core/trtc/sdkadapter/feature/WeixinAudioJitterBufferControllerFactory", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        f68564b = null;
    }

    private native long nativeCreateFactory();

    private native void nativeDestroyFactory(long j17);

    private native void nativeSetJitterBufferConfig(long j17, int i17, float f17, float f18);

    private native void nativeSetJitterBufferParams(long j17, int i17, int i18);

    private native void nativeSetJoinLiveRoom(long j17, int i17);

    private native void nativeSetJsonStrConfigs(long j17, java.lang.String str);

    public long a() {
        if (this.f68565a == 0) {
            this.f68565a = nativeCreateFactory();
        }
        return this.f68565a;
    }

    public void b(int i17) {
        long j17 = this.f68565a;
        if (j17 != 0) {
            nativeSetJoinLiveRoom(j17, i17);
        }
    }

    public void c(java.lang.String str) {
        long j17 = this.f68565a;
        if (j17 != 0) {
            nativeSetJsonStrConfigs(j17, str);
        }
    }

    public void finalize() {
        long j17 = this.f68565a;
        if (j17 != 0) {
            nativeDestroyFactory(j17);
        }
    }
}
