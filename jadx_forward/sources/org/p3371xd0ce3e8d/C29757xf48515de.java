package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.DtmfSender */
/* loaded from: classes14.dex */
public class C29757xf48515de {

    /* renamed from: nativeDtmfSender */
    private long f75294x63af7535;

    public C29757xf48515de(long j17) {
        this.f75294x63af7535 = j17;
    }

    /* renamed from: checkDtmfSenderExists */
    private void m155394xd45c6ce2() {
        if (this.f75294x63af7535 == 0) {
            throw new java.lang.IllegalStateException("DtmfSender has been disposed.");
        }
    }

    /* renamed from: nativeCanInsertDtmf */
    private static native boolean m155395x752d3d9b(long j17);

    /* renamed from: nativeDuration */
    private static native int m155396xa136facb(long j17);

    /* renamed from: nativeInsertDtmf */
    private static native boolean m155397x1f8ba3f9(long j17, java.lang.String str, int i17, int i18);

    /* renamed from: nativeInterToneGap */
    private static native int m155398xbbc5d3f(long j17);

    /* renamed from: nativeTones */
    private static native java.lang.String m155399x67c2fb6a(long j17);

    /* renamed from: canInsertDtmf */
    public boolean m155400xd1a14072() {
        m155394xd45c6ce2();
        return m155395x752d3d9b(this.f75294x63af7535);
    }

    /* renamed from: dispose */
    public void m155401x63a5261f() {
        m155394xd45c6ce2();
        org.p3371xd0ce3e8d.C29797xa99bc1d0.m155650x8b8e8283(this.f75294x63af7535);
        this.f75294x63af7535 = 0L;
    }

    /* renamed from: duration */
    public int m155402x89444d94() {
        m155394xd45c6ce2();
        return m155396xa136facb(this.f75294x63af7535);
    }

    /* renamed from: insertDtmf */
    public boolean m155403x398f6882(java.lang.String str, int i17, int i18) {
        m155394xd45c6ce2();
        return m155397x1f8ba3f9(this.f75294x63af7535, str, i17, i18);
    }

    /* renamed from: interToneGap */
    public int m155404xb3e12388() {
        m155394xd45c6ce2();
        return m155398xbbc5d3f(this.f75294x63af7535);
    }

    /* renamed from: tones */
    public java.lang.String m155405x696c541() {
        m155394xd45c6ce2();
        return m155399x67c2fb6a(this.f75294x63af7535);
    }
}
