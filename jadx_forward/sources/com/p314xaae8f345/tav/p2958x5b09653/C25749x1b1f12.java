package com.p314xaae8f345.tav.p2958x5b09653;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/tav/debug/DebugTraceLog;", "", "Ljz5/f0;", "clear", "", "tag", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17.f55894xb53fa237, "Ljava/lang/ref/WeakReference;", "Lcom/tencent/tav/debug/DebugTraceLogger;", "logger", "Ljava/lang/ref/WeakReference;", "getLogger", "()Ljava/lang/ref/WeakReference;", "setLogger", "(Ljava/lang/ref/WeakReference;)V", "<init>", "()V", "tav-foundation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.tav.debug.DebugTraceLog */
/* loaded from: classes13.dex */
public final class C25749x1b1f12 {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.tav.p2958x5b09653.C25749x1b1f12 f47904x4fbc8495 = new com.p314xaae8f345.tav.p2958x5b09653.C25749x1b1f12();
    private static java.lang.ref.WeakReference<com.p314xaae8f345.tav.p2958x5b09653.InterfaceC25750x54263f02> logger;

    private C25749x1b1f12() {
    }

    /* renamed from: clear */
    public final void m97312x5a5b64d() {
        com.p314xaae8f345.tav.p2958x5b09653.InterfaceC25750x54263f02 interfaceC25750x54263f02;
        java.lang.ref.WeakReference<com.p314xaae8f345.tav.p2958x5b09653.InterfaceC25750x54263f02> weakReference = logger;
        if (weakReference == null || (interfaceC25750x54263f02 = weakReference.get()) == null) {
            return;
        }
        interfaceC25750x54263f02.m97316x5a5b64d();
    }

    /* renamed from: getLogger */
    public final java.lang.ref.WeakReference<com.p314xaae8f345.tav.p2958x5b09653.InterfaceC25750x54263f02> m97313x23af1886() {
        return logger;
    }

    /* renamed from: print */
    public final void m97314x65fb2ad(java.lang.String tag, java.lang.String message) {
        com.p314xaae8f345.tav.p2958x5b09653.InterfaceC25750x54263f02 interfaceC25750x54263f02;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        java.lang.ref.WeakReference<com.p314xaae8f345.tav.p2958x5b09653.InterfaceC25750x54263f02> weakReference = logger;
        if (weakReference == null || (interfaceC25750x54263f02 = weakReference.get()) == null) {
            return;
        }
        interfaceC25750x54263f02.m97317x65fb2ad(tag, message);
    }

    /* renamed from: setLogger */
    public final void m97315x16e44c92(java.lang.ref.WeakReference<com.p314xaae8f345.tav.p2958x5b09653.InterfaceC25750x54263f02> weakReference) {
        logger = weakReference;
    }
}
