package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginCallbackToNative */
/* loaded from: classes13.dex */
public class C26285x152c2624 implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.AudioPassThroughPluginListener {
    private static final java.lang.String TAG = "TPAudioPassThroughPluginCallback";

    /* renamed from: mNativeContext */
    private long f51609x5abc8e2b;

    private C26285x152c2624(long j17) {
        this.f51609x5abc8e2b = j17;
    }

    /* renamed from: _onAudioPassThroughStateChanged */
    private native void m101675x60a3695f(boolean z17);

    /* renamed from: getNativeContext */
    private long m101676xbd0e41e2() {
        return this.f51609x5abc8e2b;
    }

    /* renamed from: registerCallback */
    private void m101677xe7f76008() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.m101683x162a7075(this);
    }

    /* renamed from: unregisterCallback */
    private void m101678x67a11ca1() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.m101692xf1335d58(this);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26286x2d472913.AudioPassThroughPluginListener
    /* renamed from: onAudioPassThroughPlugin */
    public void mo101679xdaae3150(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "onAudioPassThroughPlugin bPlugin:" + z17);
        m101675x60a3695f(z17);
    }
}
