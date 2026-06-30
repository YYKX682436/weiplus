package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final /* synthetic */ class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 f127965a;

    /* renamed from: b, reason: collision with root package name */
    private final android.os.MessageQueue.IdleHandler f127966b;

    private d(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 handlerC3775x958f0279, android.os.MessageQueue.IdleHandler idleHandler) {
        this.f127965a = handlerC3775x958f0279;
        this.f127966b = idleHandler;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 handlerC3775x958f0279, android.os.MessageQueue.IdleHandler idleHandler) {
        return new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.d(handlerC3775x958f0279, idleHandler);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279.m29517x880067cc(this.f127965a, this.f127966b);
    }
}
