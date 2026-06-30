package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPHeadsetPluginCallbackToNative */
/* loaded from: classes14.dex */
public class C26303x2c860730 implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.HeadsetPluginListener {
    private static final java.lang.String TAG = "TPHeadsetPluginCallback";

    /* renamed from: mNativeContext */
    private long f51922x5abc8e2b;

    private C26303x2c860730(long j17) {
        this.f51922x5abc8e2b = j17;
    }

    /* renamed from: _onAudioRouteChanged */
    private native void m101763xb9a50c43(java.util.Set<java.lang.Integer> set, java.util.Set<java.lang.Integer> set2);

    /* renamed from: getNativeContext */
    private long m101764xbd0e41e2() {
        return this.f51922x5abc8e2b;
    }

    /* renamed from: registerCallback */
    private void m101765xe7f76008() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.m101772x774dce08(this);
    }

    /* renamed from: unregisterCallback */
    private void m101766x67a11ca1() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.m101785x86ce2a05(this);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26304xc368d61f.HeadsetPluginListener
    /* renamed from: onHeadsetPlugin */
    public void mo101767x164b78b6(java.util.Set<java.lang.Integer> set, java.util.Set<java.lang.Integer> set2) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "onHeadsetPlugin: oldOutputs: " + set + ", newOutputs: " + set2);
        m101763xb9a50c43(set, set2);
    }
}
