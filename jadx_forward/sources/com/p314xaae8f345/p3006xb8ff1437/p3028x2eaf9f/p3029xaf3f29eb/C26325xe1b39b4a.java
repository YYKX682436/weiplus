package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPScreenRefreshRateCallBackToNative */
/* loaded from: classes13.dex */
public class C26325xe1b39b4a implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.ScreenRefreshRateChangedListener {
    private static final java.lang.String TAG = "TPScreenRefreshRateCallBack";

    /* renamed from: mNativeContext */
    private long f52339x5abc8e2b;

    private C26325xe1b39b4a(long j17) {
        this.f52339x5abc8e2b = j17;
    }

    /* renamed from: _onScreenRefreshRateChanged */
    private native void m101914xf102f603(float f17);

    /* renamed from: getNativeContext */
    private long m101915xbd0e41e2() {
        return this.f52339x5abc8e2b;
    }

    /* renamed from: registerCallback */
    private void m101916xe7f76008() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.m101924x162a7075(this);
    }

    /* renamed from: unregisterCallback */
    private void m101917x67a11ca1() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.m101931xf1335d58(this);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.ScreenRefreshRateChangedListener
    /* renamed from: onScreenRefreshRateChanged */
    public void mo101918xabedbe64(float f17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "onScreenRefreshRateChanged refreshRate:" + f17);
        m101914xf102f603(f17);
    }
}
