package io.p3277xa1c40a32.p3278x9b169b86;

/* renamed from: io.clipworks.analytics.ALManager */
/* loaded from: classes16.dex */
public class C28517x113b2902 {

    /* renamed from: _sInstance */
    private static io.p3277xa1c40a32.p3278x9b169b86.C28517x113b2902 f70358x66efd0a9;

    /* renamed from: _eventBridge */
    private io.p3277xa1c40a32.p3278x9b169b86.C28516x24ab8d98 f70359xc42c8504 = null;

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f70360x39e86013 = m136809xfce9a72c();

    private C28517x113b2902() {
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m136809xfce9a72c();

    /* renamed from: nativeInitReporter */
    private native void m136810xc584d7c8();

    /* renamed from: nativeRegisterDefaultFileSink */
    private native void m136811xca4a0056();

    /* renamed from: nativeRegisterEventBridge */
    private native void m136812x36dae689(io.p3277xa1c40a32.p3278x9b169b86.C28516x24ab8d98 c28516x24ab8d98);

    /* renamed from: nativeShutdownReporter */
    private native void m136813x18f1f8e();

    /* renamed from: nativeUnregisterEventBridge */
    private native void m136814x38c84110();

    /* renamed from: sharedInstance */
    public static io.p3277xa1c40a32.p3278x9b169b86.C28517x113b2902 m136815x4a9701a() {
        if (f70358x66efd0a9 == null) {
            f70358x66efd0a9 = new io.p3277xa1c40a32.p3278x9b169b86.C28517x113b2902();
        }
        return f70358x66efd0a9;
    }

    /* renamed from: initReporter */
    public void m136816x6da99e11() {
        m136810xc584d7c8();
    }

    /* renamed from: registerDefaultFileSink */
    public void m136817xfb35a26d() {
        m136811xca4a0056();
    }

    /* renamed from: registerEventSink */
    public void m136818x570ba0ea(cz5.a aVar) {
    }

    /* renamed from: shutdownReporter */
    public void m136819xe1e59957() {
        m136813x18f1f8e();
    }

    /* renamed from: unregisterEventSink */
    public void m136820xcc997771(cz5.a aVar) {
    }
}
