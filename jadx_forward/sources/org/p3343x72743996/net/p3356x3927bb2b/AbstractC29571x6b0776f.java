package org.p3343x72743996.net.p3356x3927bb2b;

/* renamed from: org.chromium.net.apihelpers.ImplicitFlowControlCallback */
/* loaded from: classes7.dex */
public abstract class AbstractC29571x6b0776f extends org.p3343x72743996.net.AbstractC29563x9a627640.Callback {

    /* renamed from: BYTE_BUFFER_CAPACITY */
    private static final int f74363x378494a2 = 32768;

    /* renamed from: onBodyChunkRead */
    public abstract void mo49578x67a67282(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.nio.ByteBuffer byteBuffer);

    @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
    /* renamed from: onCanceled */
    public final void mo153673x9dc2a798(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
        mo49579x9dc2a798(abstractC29564x6974077e);
    }

    /* renamed from: onCanceled */
    public abstract void mo49579x9dc2a798(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e);

    @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
    /* renamed from: onFailed */
    public final void mo153674x428b6afc(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, org.p3343x72743996.net.AbstractC29501x119930f2 abstractC29501x119930f2) {
        mo49580x428b6afc(abstractC29564x6974077e, abstractC29501x119930f2);
    }

    /* renamed from: onFailed */
    public abstract void mo49580x428b6afc(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, org.p3343x72743996.net.AbstractC29501x119930f2 abstractC29501x119930f2);

    @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
    /* renamed from: onReadCompleted */
    public final void mo153675x6da909b6(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.nio.ByteBuffer byteBuffer) {
        mo49578x67a67282(abstractC29564x6974077e, byteBuffer);
        abstractC29563x9a627640.mo153670x355996(byteBuffer);
    }

    @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
    /* renamed from: onRedirectReceived */
    public final void mo153676x4d4e5ddc(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.lang.String str) {
        if (mo49553xe12ec340(abstractC29564x6974077e, str)) {
            abstractC29563x9a627640.mo153667x25da56ad();
        } else {
            abstractC29563x9a627640.mo153666xae7a2e7a();
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
    /* renamed from: onResponseStarted */
    public final void mo153677x5d21f921(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
        mo49581x5d21f921(abstractC29564x6974077e);
        abstractC29563x9a627640.mo153670x355996(java.nio.ByteBuffer.allocateDirect(32768));
    }

    /* renamed from: onResponseStarted */
    public abstract void mo49581x5d21f921(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e);

    @Override // org.p3343x72743996.net.AbstractC29563x9a627640.Callback
    /* renamed from: onSucceeded */
    public final void mo153678x3688ff42(org.p3343x72743996.net.AbstractC29563x9a627640 abstractC29563x9a627640, org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
        mo49582x3688ff42(abstractC29564x6974077e);
    }

    /* renamed from: onSucceeded */
    public abstract void mo49582x3688ff42(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e);

    /* renamed from: shouldFollowRedirect */
    public abstract boolean mo49553xe12ec340(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.lang.String str);
}
