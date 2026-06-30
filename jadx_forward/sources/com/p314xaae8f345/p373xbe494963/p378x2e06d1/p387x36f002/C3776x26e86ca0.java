package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.base.util.HandlerThreadHolder */
/* loaded from: classes7.dex */
public class C3776x26e86ca0 {

    /* renamed from: mHandlerThread */
    private final android.os.HandlerThread f14746x3e0f3a87;

    public C3776x26e86ca0(java.lang.String str) {
        this.f14746x3e0f3a87 = new android.os.HandlerThread(str);
    }

    /* renamed from: getLooper */
    public android.os.Looper m29529x23b2dd47() {
        return this.f14746x3e0f3a87.getLooper();
    }

    /* renamed from: start */
    public void m29530x68ac462() {
        this.f14746x3e0f3a87.start();
    }
}
