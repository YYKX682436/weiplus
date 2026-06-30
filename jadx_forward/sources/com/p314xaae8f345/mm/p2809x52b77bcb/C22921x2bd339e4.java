package com.p314xaae8f345.mm.p2809x52b77bcb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0004J\t\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J!\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0082 J\u0011\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/weapp_core/PerformanceNowUs;", "", "<init>", "()V", "nativePtr", "", "dispose", "", "finalize", "nativeInit", "nativeDispose", "JOUt05VmX", "isolatePtr", "contextPtr", "JuFLwEIWT", "bindTo", "destroy", "weapp_core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.tencent.mm.weapp_core.PerformanceNowUs */
/* loaded from: classes7.dex */
public final class C22921x2bd339e4 {
    private long nativePtr;

    public C22921x2bd339e4() {
        long m83355xb90145c7 = m83355xb90145c7();
        this.nativePtr = m83355xb90145c7;
        if (!(m83355xb90145c7 != 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: JOUt05VmX */
    private final native void m83352x436693f8(long nativePtr, long isolatePtr, long contextPtr);

    /* renamed from: JuFLwEIWT */
    private final native void m83353x550382a7(long nativePtr);

    /* renamed from: nativeDispose */
    private final native void m83354x2a9c7608(long nativePtr);

    /* renamed from: nativeInit */
    private final native long m83355xb90145c7();

    /* renamed from: bindTo */
    public final void m83356xad361398(long isolatePtr, long contextPtr) {
        m83352x436693f8(this.nativePtr, isolatePtr, contextPtr);
    }

    /* renamed from: destroy */
    public final void m83357x5cd39ffa() {
        m83353x550382a7(this.nativePtr);
    }

    /* renamed from: dispose */
    public final void m83358x63a5261f() {
        long j17 = this.nativePtr;
        if (j17 != 0) {
            m83354x2a9c7608(j17);
            this.nativePtr = 0L;
        }
    }

    /* renamed from: finalize */
    public final void m83359xd764dc1e() {
        m83358x63a5261f();
    }
}
