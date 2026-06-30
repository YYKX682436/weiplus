package com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p828xce4391d5.p829xc5a27af6;

/* renamed from: com.tencent.mm.live.core.core.trtc.sdkadapter.feature.WeixinAudioJitterBufferControllerFactory */
/* loaded from: classes3.dex */
public class C10834xb010c4ce {

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p828xce4391d5.p829xc5a27af6.C10834xb010c4ce f150097b;

    /* renamed from: a, reason: collision with root package name */
    public long f150098a = 0;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("voipCodec");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/live/core/core/trtc/sdkadapter/feature/WeixinAudioJitterBufferControllerFactory", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/live/core/core/trtc/sdkadapter/feature/WeixinAudioJitterBufferControllerFactory", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        f150097b = null;
    }

    /* renamed from: nativeCreateFactory */
    private native long m46481xe85e5197();

    /* renamed from: nativeDestroyFactory */
    private native void m46482x5ca8c3a7(long j17);

    /* renamed from: nativeSetJitterBufferConfig */
    private native void m46483x22099ed9(long j17, int i17, float f17, float f18);

    /* renamed from: nativeSetJitterBufferParams */
    private native void m46484x3775151d(long j17, int i17, int i18);

    /* renamed from: nativeSetJoinLiveRoom */
    private native void m46485x8655ab9c(long j17, int i17);

    /* renamed from: nativeSetJsonStrConfigs */
    private native void m46486xc813d2b3(long j17, java.lang.String str);

    public long a() {
        if (this.f150098a == 0) {
            this.f150098a = m46481xe85e5197();
        }
        return this.f150098a;
    }

    public void b(int i17) {
        long j17 = this.f150098a;
        if (j17 != 0) {
            m46485x8655ab9c(j17, i17);
        }
    }

    public void c(java.lang.String str) {
        long j17 = this.f150098a;
        if (j17 != 0) {
            m46486xc813d2b3(j17, str);
        }
    }

    /* renamed from: finalize */
    public void m46487xd764dc1e() {
        long j17 = this.f150098a;
        if (j17 != 0) {
            m46482x5ca8c3a7(j17);
        }
    }
}
