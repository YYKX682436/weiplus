package com.tencent.liteav.audio2;

/* loaded from: classes13.dex */
final /* synthetic */ class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.audio2.AndroidInterruptedStateListener f46251a;

    private a(com.tencent.liteav.audio2.AndroidInterruptedStateListener androidInterruptedStateListener) {
        this.f46251a = androidInterruptedStateListener;
    }

    public static java.lang.Runnable a(com.tencent.liteav.audio2.AndroidInterruptedStateListener androidInterruptedStateListener) {
        return new com.tencent.liteav.audio2.a(androidInterruptedStateListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.audio2.AndroidInterruptedStateListener.lambda$registerAudioRecordingCallback$0(this.f46251a);
    }
}
