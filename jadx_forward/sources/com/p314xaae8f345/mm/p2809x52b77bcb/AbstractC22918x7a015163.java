package com.p314xaae8f345.mm.p2809x52b77bcb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0004J\t\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0011\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0011\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u0007J\b\u0010\u000f\u001a\u00020\u0007H$J\b\u0010\u0010\u001a\u00020\u0007H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/weapp_core/InitLoader;", "", "<init>", "()V", "nativePtr", "", "dispose", "", "finalize", "nativeInit", "nativeDispose", "JflbHvBHq", "JDXmEv1LV", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "initMainThreadLoop", "initOnMainThread", "initOnMainThreadJNI", "weapp_core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.tencent.mm.weapp_core.InitLoader */
/* loaded from: classes13.dex */
public abstract class AbstractC22918x7a015163 {
    private long nativePtr;

    public AbstractC22918x7a015163() {
        long m83307xb90145c7 = m83307xb90145c7();
        this.nativePtr = m83307xb90145c7;
        if (!(m83307xb90145c7 != 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: JDXmEv1LV */
    private final native void m83303x60bf569b(long nativePtr);

    /* renamed from: JflbHvBHq */
    private final native void m83304x3c09246b(long nativePtr);

    /* renamed from: initOnMainThreadJNI */
    private final void m83305xb0c0ccb3() {
        mo83312xc61d1192();
    }

    /* renamed from: nativeDispose */
    private final native void m83306x2a9c7608(long nativePtr);

    /* renamed from: nativeInit */
    private final native long m83307xb90145c7();

    /* renamed from: dispose */
    public final void m83308x63a5261f() {
        long j17 = this.nativePtr;
        if (j17 != 0) {
            m83306x2a9c7608(j17);
            this.nativePtr = 0L;
        }
    }

    /* renamed from: finalize */
    public final void m83309xd764dc1e() {
        m83308x63a5261f();
    }

    /* renamed from: init */
    public final void m83310x316510() {
        m83304x3c09246b(this.nativePtr);
    }

    /* renamed from: initMainThreadLoop */
    public final void m83311x26bd1797() {
        m83303x60bf569b(this.nativePtr);
    }

    /* renamed from: initOnMainThread */
    public abstract void mo83312xc61d1192();
}
