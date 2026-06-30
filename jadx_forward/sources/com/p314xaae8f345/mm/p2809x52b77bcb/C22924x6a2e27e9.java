package com.p314xaae8f345.mm.p2809x52b77bcb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0004J\t\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J!\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0082 JI\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0082 J\u0011\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0011\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0016\u0010\u0018\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J>\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u001a\u001a\u00020\u0007J\u0006\u0010\u001b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/weapp_core/WsBinding;", "", "<init>", "()V", "nativePtr", "", "dispose", "", "finalize", "nativeInit", "nativeDispose", "JkIGCTkH2", "isolatePtr", "contextPtr", "Jor0AJJ2F", "ua", "", "verifyUserCa", "", "uvPtr", "skipDomainCheck", "referUrl", "JdyOtdkm2", "JSIuwO5FM", "tempInit", "create", "suspend", "destroy", "weapp_core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.tencent.mm.weapp_core.WsBinding */
/* loaded from: classes7.dex */
public final class C22924x6a2e27e9 {
    private long nativePtr;

    public C22924x6a2e27e9() {
        long m83389xb90145c7 = m83389xb90145c7();
        this.nativePtr = m83389xb90145c7;
        if (!(m83389xb90145c7 != 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: JSIuwO5FM */
    private final native void m83384x6dc92ecf(long nativePtr);

    /* renamed from: JdyOtdkm2 */
    private final native void m83385xfdf032d0(long nativePtr);

    /* renamed from: JkIGCTkH2 */
    private final native void m83386xd98cc1a5(long nativePtr, long isolatePtr, long contextPtr);

    /* renamed from: Jor0AJJ2F */
    private final native void m83387xca904312(long nativePtr, java.lang.String ua6, boolean verifyUserCa, long uvPtr, boolean skipDomainCheck, java.lang.String referUrl, long isolatePtr, long contextPtr);

    /* renamed from: nativeDispose */
    private final native void m83388x2a9c7608(long nativePtr);

    /* renamed from: nativeInit */
    private final native long m83389xb90145c7();

    /* renamed from: create */
    public final void m83390xaf65a0fc(java.lang.String ua6, boolean verifyUserCa, long uvPtr, boolean skipDomainCheck, java.lang.String referUrl, long isolatePtr, long contextPtr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ua6, "ua");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(referUrl, "referUrl");
        m83387xca904312(this.nativePtr, ua6, verifyUserCa, uvPtr, skipDomainCheck, referUrl, isolatePtr, contextPtr);
    }

    /* renamed from: destroy */
    public final void m83391x5cd39ffa() {
        m83384x6dc92ecf(this.nativePtr);
    }

    /* renamed from: dispose */
    public final void m83392x63a5261f() {
        long j17 = this.nativePtr;
        if (j17 != 0) {
            m83388x2a9c7608(j17);
            this.nativePtr = 0L;
        }
    }

    /* renamed from: finalize */
    public final void m83393xd764dc1e() {
        m83392x63a5261f();
    }

    /* renamed from: suspend */
    public final void m83394x919ca03c() {
        m83385xfdf032d0(this.nativePtr);
    }

    /* renamed from: tempInit */
    public final void m83395xb12b1304(long isolatePtr, long contextPtr) {
        m83386xd98cc1a5(this.nativePtr, isolatePtr, contextPtr);
    }
}
