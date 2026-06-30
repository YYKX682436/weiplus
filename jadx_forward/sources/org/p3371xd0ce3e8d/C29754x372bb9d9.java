package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.DataChannel */
/* loaded from: classes14.dex */
public class C29754x372bb9d9 {

    /* renamed from: nativeDataChannel */
    private long f75275xad4d4562;

    /* renamed from: nativeObserver */
    private long f75276x2cba000d;

    /* renamed from: org.webrtc.DataChannel$Buffer */
    /* loaded from: classes6.dex */
    public static class Buffer {

        /* renamed from: binary */
        public final boolean f75277xad360c01;

        /* renamed from: data */
        public final java.nio.ByteBuffer f75278x2eefaa;

        public Buffer(java.nio.ByteBuffer byteBuffer, boolean z17) {
            this.f75278x2eefaa = byteBuffer;
            this.f75277xad360c01 = z17;
        }
    }

    /* renamed from: org.webrtc.DataChannel$Init */
    /* loaded from: classes6.dex */
    public static class Init {

        /* renamed from: negotiated */
        public boolean f75281xfde2c9a6;

        /* renamed from: ordered */
        public boolean f75282xb80cf86d = true;

        /* renamed from: maxRetransmitTimeMs */
        public int f75279xb4a329a = -1;

        /* renamed from: maxRetransmits */
        public int f75280x77563aec = -1;

        /* renamed from: protocol */
        public java.lang.String f75283xc50a8e98 = "";

        /* renamed from: id, reason: collision with root package name */
        public int f429420id = -1;

        /* renamed from: getId */
        public int m155377x5db1b11() {
            return this.f429420id;
        }

        /* renamed from: getMaxRetransmitTimeMs */
        public int m155378x637a0f64() {
            return this.f75279xb4a329a;
        }

        /* renamed from: getMaxRetransmits */
        public int m155379x65ee07e2() {
            return this.f75280x77563aec;
        }

        /* renamed from: getNegotiated */
        public boolean m155380xec23819c() {
            return this.f75281xfde2c9a6;
        }

        /* renamed from: getOrdered */
        public boolean m155381xf5da3437() {
            return this.f75282xb80cf86d;
        }

        /* renamed from: getProtocol */
        public java.lang.String m155382x40e4cc0e() {
            return this.f75283xc50a8e98;
        }
    }

    /* renamed from: org.webrtc.DataChannel$Observer */
    /* loaded from: classes6.dex */
    public interface Observer {
        /* renamed from: onBufferedAmountChange */
        void m155383x4ff6d926(long j17);

        /* renamed from: onMessage */
        void m155384x88910128(org.p3371xd0ce3e8d.C29754x372bb9d9.Buffer buffer);

        /* renamed from: onStateChange */
        void m155385x4799dc42();
    }

    /* renamed from: org.webrtc.DataChannel$State */
    /* loaded from: classes6.dex */
    public enum State {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED;

        /* renamed from: fromNativeIndex */
        public static org.p3371xd0ce3e8d.C29754x372bb9d9.State m155387xde3460f1(int i17) {
            return m155389xcee59d22()[i17];
        }
    }

    public C29754x372bb9d9(long j17) {
        this.f75275xad4d4562 = j17;
    }

    /* renamed from: checkDataChannelExists */
    private void m155359xd801df8d() {
        if (this.f75275xad4d4562 == 0) {
            throw new java.lang.IllegalStateException("DataChannel has been disposed.");
        }
    }

    /* renamed from: nativeBufferedAmount */
    private native long m155360x2cfc120e();

    /* renamed from: nativeClose */
    private native void m155361x66d21421();

    /* renamed from: nativeId */
    private native int m155362x79eeaf92();

    /* renamed from: nativeLabel */
    private native java.lang.String m155363x674bb51d();

    /* renamed from: nativeRegisterObserver */
    private native long m155364x26ac18d0(org.p3371xd0ce3e8d.C29754x372bb9d9.Observer observer);

    /* renamed from: nativeSend */
    private native boolean m155365xb905b03f(byte[] bArr, boolean z17);

    /* renamed from: nativeState */
    private native org.p3371xd0ce3e8d.C29754x372bb9d9.State m155366x67b6faba();

    /* renamed from: nativeUnregisterObserver */
    private native void m155367x620d23a9(long j17);

    /* renamed from: bufferedAmount */
    public long m155368x5f086a17() {
        m155359xd801df8d();
        return m155360x2cfc120e();
    }

    /* renamed from: close */
    public void m155369x5a5ddf8() {
        m155359xd801df8d();
        m155361x66d21421();
    }

    /* renamed from: dispose */
    public void m155370x63a5261f() {
        m155359xd801df8d();
        org.p3371xd0ce3e8d.C29797xa99bc1d0.m155650x8b8e8283(this.f75275xad4d4562);
        this.f75275xad4d4562 = 0L;
    }

    /* renamed from: getNativeDataChannel */
    public long m155371x81ccac() {
        return this.f75275xad4d4562;
    }

    public int id() {
        m155359xd801df8d();
        return m155362x79eeaf92();
    }

    /* renamed from: label */
    public java.lang.String m155372x61f7ef4() {
        m155359xd801df8d();
        return m155363x674bb51d();
    }

    /* renamed from: registerObserver */
    public void m155373x7029299(org.p3371xd0ce3e8d.C29754x372bb9d9.Observer observer) {
        m155359xd801df8d();
        long j17 = this.f75276x2cba000d;
        if (j17 != 0) {
            m155367x620d23a9(j17);
        }
        this.f75276x2cba000d = m155364x26ac18d0(observer);
    }

    /* renamed from: send */
    public boolean m155374x35cf88(org.p3371xd0ce3e8d.C29754x372bb9d9.Buffer buffer) {
        m155359xd801df8d();
        byte[] bArr = new byte[buffer.f75278x2eefaa.remaining()];
        buffer.f75278x2eefaa.get(bArr);
        return m155365xb905b03f(bArr, buffer.f75277xad360c01);
    }

    /* renamed from: state */
    public org.p3371xd0ce3e8d.C29754x372bb9d9.State m155375x68ac491() {
        m155359xd801df8d();
        return m155366x67b6faba();
    }

    /* renamed from: unregisterObserver */
    public void m155376x86ac4f32() {
        m155359xd801df8d();
        m155367x620d23a9(this.f75276x2cba000d);
        this.f75276x2cba000d = 0L;
    }
}
