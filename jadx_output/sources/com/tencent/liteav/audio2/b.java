package com.tencent.liteav.audio2;

/* loaded from: classes13.dex */
final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.audio2.AndroidInterruptedStateListener f46252a;

    private b(com.tencent.liteav.audio2.AndroidInterruptedStateListener androidInterruptedStateListener) {
        this.f46252a = androidInterruptedStateListener;
    }

    public static java.lang.Runnable a(com.tencent.liteav.audio2.AndroidInterruptedStateListener androidInterruptedStateListener) {
        return new com.tencent.liteav.audio2.b(androidInterruptedStateListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.audio2.AndroidInterruptedStateListener.lambda$unregisterAudioRecordingCallback$1(this.f46252a);
    }
}
