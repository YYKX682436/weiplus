package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm;

/* renamed from: com.tencent.thumbplayer.core.drm.TPDrmInterruptCallbackProxy */
/* loaded from: classes13.dex */
public final class C26388xe82750e9 implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26385x848b480e {

    /* renamed from: mNativeContext */
    private long f53068x5abc8e2b;

    private C26388xe82750e9() {
    }

    /* renamed from: native_isInterrupted */
    private native boolean m102526x12d87890();

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.InterfaceC26385x848b480e
    /* renamed from: isInterrupted */
    public boolean mo102506x37ddcab8() {
        try {
            return m102526x12d87890();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            return false;
        }
    }
}
