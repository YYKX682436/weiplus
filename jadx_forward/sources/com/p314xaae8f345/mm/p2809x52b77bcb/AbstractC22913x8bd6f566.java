package com.p314xaae8f345.mm.p2809x52b77bcb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0004J\t\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0019\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0082 J\u0019\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0082 J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005J\b\u0010\u0010\u001a\u00020\u0011H$J\b\u0010\u0012\u001a\u00020\u0007H$J\b\u0010\u0013\u001a\u00020\u0005H$J\b\u0010\u0014\u001a\u00020\u0011H\u0003J\b\u0010\u0015\u001a\u00020\u0007H\u0003J\b\u0010\u0016\u001a\u00020\u0005H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/weapp_core/CellularNetworkHandler;", "", "<init>", "()V", "nativePtr", "", "dispose", "", "finalize", "nativeInit", "nativeDispose", "Jc9VcBIjY", "networkHandle", "Jh0sy5Epe", "onNetworkAvailable", "onNetworkLost", "startMonitoring", "", "stopMonitoring", "getActiveCellularNetworkHandle", "startMonitoringJNI", "stopMonitoringJNI", "getActiveCellularNetworkHandleJNI", "weapp_core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.tencent.mm.weapp_core.CellularNetworkHandler */
/* loaded from: classes13.dex */
public abstract class AbstractC22913x8bd6f566 {
    private long nativePtr;

    public AbstractC22913x8bd6f566() {
        long m83231xb90145c7 = m83231xb90145c7();
        this.nativePtr = m83231xb90145c7;
        if (!(m83231xb90145c7 != 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: Jc9VcBIjY */
    private final native void m83227x67729e03(long nativePtr, long networkHandle);

    /* renamed from: Jh0sy5Epe */
    private final native void m83228xc56d011d(long nativePtr, long networkHandle);

    /* renamed from: getActiveCellularNetworkHandleJNI */
    private final long m83229x902e1575() {
        return mo83236x69385010();
    }

    /* renamed from: nativeDispose */
    private final native void m83230x2a9c7608(long nativePtr);

    /* renamed from: nativeInit */
    private final native long m83231xb90145c7();

    /* renamed from: startMonitoringJNI */
    private final boolean m83232x7064d0fb() {
        return mo83239xdfa8b24a();
    }

    /* renamed from: stopMonitoringJNI */
    private final void m83233xfafc715b() {
        mo83240xe94bedea();
    }

    /* renamed from: dispose */
    public final void m83234x63a5261f() {
        long j17 = this.nativePtr;
        if (j17 != 0) {
            m83230x2a9c7608(j17);
            this.nativePtr = 0L;
        }
    }

    /* renamed from: finalize */
    public final void m83235xd764dc1e() {
        m83234x63a5261f();
    }

    /* renamed from: getActiveCellularNetworkHandle */
    public abstract long mo83236x69385010();

    /* renamed from: onNetworkAvailable */
    public final void m83237x53ec983a(long networkHandle) {
        m83227x67729e03(this.nativePtr, networkHandle);
    }

    /* renamed from: onNetworkLost */
    public final void m83238xa8df5713(long networkHandle) {
        m83228xc56d011d(this.nativePtr, networkHandle);
    }

    /* renamed from: startMonitoring */
    public abstract boolean mo83239xdfa8b24a();

    /* renamed from: stopMonitoring */
    public abstract void mo83240xe94bedea();
}
