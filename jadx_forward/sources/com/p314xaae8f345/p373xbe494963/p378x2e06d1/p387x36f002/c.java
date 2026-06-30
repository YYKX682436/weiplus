package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final /* synthetic */ class c implements android.os.MessageQueue.IdleHandler {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 f127964a;

    private c(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 handlerC3775x958f0279) {
        this.f127964a = handlerC3775x958f0279;
    }

    public static android.os.MessageQueue.IdleHandler a(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 handlerC3775x958f0279) {
        return new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.c(handlerC3775x958f0279);
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279.m29516x880067cb(this.f127964a);
    }
}
