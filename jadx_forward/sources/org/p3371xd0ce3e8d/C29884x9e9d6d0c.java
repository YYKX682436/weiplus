package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.TurnCustomizer */
/* loaded from: classes4.dex */
public class C29884x9e9d6d0c {

    /* renamed from: nativeTurnCustomizer */
    private long f76037xa84a48e3;

    public C29884x9e9d6d0c(long j17) {
        this.f76037xa84a48e3 = j17;
    }

    /* renamed from: checkTurnCustomizerExists */
    private void m156490x81f46590() {
        if (this.f76037xa84a48e3 == 0) {
            throw new java.lang.IllegalStateException("TurnCustomizer has been disposed.");
        }
    }

    /* renamed from: nativeFreeTurnCustomizer */
    private static native void m156491x29e0aaef(long j17);

    /* renamed from: dispose */
    public void m156492x63a5261f() {
        m156490x81f46590();
        m156491x29e0aaef(this.f76037xa84a48e3);
        this.f76037xa84a48e3 = 0L;
    }

    /* renamed from: getNativeTurnCustomizer */
    public long m156493x56160559() {
        m156490x81f46590();
        return this.f76037xa84a48e3;
    }
}
