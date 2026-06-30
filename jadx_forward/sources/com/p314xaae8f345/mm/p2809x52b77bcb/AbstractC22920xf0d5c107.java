package com.p314xaae8f345.mm.p2809x52b77bcb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\r\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0004J\t\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0019\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0082 J!\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 J\u0019\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0082 J\u0019\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 J\u0019\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005J\u0016\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J \u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0005H$J \u0010\u001c\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0005H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/weapp_core/JsThreadMonitor;", "", "<init>", "()V", "nativePtr", "", "dispose", "", "finalize", "nativeInit", "nativeDispose", "JJXUAJ0Uu", "thresholdMs", "JmWHH3tPG", "isolatePtr", "appId", "", "J8utqEtkL", "JKUP5EPwE", "JKMVCBCHk", "start", "attachIsolate", "detachIsolate", "setAppForeground", "setAppBackground", "onHangDetected", "stackJson", "durationUs", "onHangDetectedJNI", "weapp_core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.tencent.mm.weapp_core.JsThreadMonitor */
/* loaded from: classes7.dex */
public abstract class AbstractC22920xf0d5c107 {
    private long nativePtr;

    public AbstractC22920xf0d5c107() {
        long m83343xb90145c7 = m83343xb90145c7();
        this.nativePtr = m83343xb90145c7;
        if (!(m83343xb90145c7 != 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: J8utqEtkL */
    private final native void m83337x8e8ea214(long nativePtr, long isolatePtr);

    /* renamed from: JJXUAJ0Uu */
    private final native void m83338xa6c5b40a(long nativePtr, long thresholdMs);

    /* renamed from: JKMVCBCHk */
    private final native void m83339xca8fff7d(long nativePtr, java.lang.String appId);

    /* renamed from: JKUP5EPwE */
    private final native void m83340x66c11032(long nativePtr, java.lang.String appId);

    /* renamed from: JmWHH3tPG */
    private final native void m83341x8fd2c9ac(long nativePtr, long isolatePtr, java.lang.String appId);

    /* renamed from: nativeDispose */
    private final native void m83342x2a9c7608(long nativePtr);

    /* renamed from: nativeInit */
    private final native long m83343xb90145c7();

    /* renamed from: onHangDetectedJNI */
    private final void m83344xaf253e12(java.lang.String appId, java.lang.String stackJson, long durationUs) {
        mo52390xe1823493(appId, stackJson, durationUs);
    }

    /* renamed from: attachIsolate */
    public final void m83345x4dbd62a6(long isolatePtr, java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        m83341x8fd2c9ac(this.nativePtr, isolatePtr, appId);
    }

    /* renamed from: detachIsolate */
    public final void m83346xa5ddc598(long isolatePtr) {
        m83337x8e8ea214(this.nativePtr, isolatePtr);
    }

    /* renamed from: dispose */
    public final void m83347x63a5261f() {
        long j17 = this.nativePtr;
        if (j17 != 0) {
            m83342x2a9c7608(j17);
            this.nativePtr = 0L;
        }
    }

    /* renamed from: finalize */
    public final void m83348xd764dc1e() {
        m83347x63a5261f();
    }

    /* renamed from: onHangDetected */
    public abstract void mo52390xe1823493(java.lang.String appId, java.lang.String stackJson, long durationUs);

    /* renamed from: setAppBackground */
    public final void m83349x590c58ed(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        m83339xca8fff7d(this.nativePtr, appId);
    }

    /* renamed from: setAppForeground */
    public final void m83350x1ebc6d02(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        m83340x66c11032(this.nativePtr, appId);
    }

    /* renamed from: start */
    public final void m83351x68ac462(long thresholdMs) {
        m83338xa6c5b40a(this.nativePtr, thresholdMs);
    }
}
