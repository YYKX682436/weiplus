package org.p3343x72743996.net.p3358x316220;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.impl.CronetUrlRequestJni */
/* loaded from: classes16.dex */
public class C29614xf7132c88 implements org.p3343x72743996.net.p3358x316220.C29609x93734ddd.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f74740xce5021a3 = new c56.a() { // from class: org.chromium.net.impl.CronetUrlRequestJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m154240x2f08577e(org.p3343x72743996.net.p3358x316220.C29609x93734ddd.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.net.p3358x316220.C29614xf7132c88.f74741x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.net.p3358x316220.C29609x93734ddd.Natives f74741x4baa8b47;

    public static org.p3343x72743996.net.p3358x316220.C29609x93734ddd.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.net.p3358x316220.C29609x93734ddd.Natives natives = f74741x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of CronetUrlRequest.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.net.p3358x316220.C29614xf7132c88();
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29609x93734ddd.Natives
    /* renamed from: addRequestHeader */
    public boolean mo154187x3c42dedb(long j17, org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd, java.lang.String str, java.lang.String str2) {
        return org.p3362x76ca9b02.C29682x261049f6.m154601x6c2027ee(j17, c29609x93734ddd, str, str2);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29609x93734ddd.Natives
    /* renamed from: createRequestAdapter */
    public long mo154188x21b1ddc(org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd, long j17, java.lang.String str, int i17, boolean z17, boolean z18, boolean z19, int i18, boolean z27, int i19, int i27, long j18) {
        return org.p3362x76ca9b02.C29682x261049f6.m154602x137a56f(c29609x93734ddd, j17, str, i17, z17, z18, z19, i18, z27, i19, i27, j18);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29609x93734ddd.Natives
    /* renamed from: destroy */
    public void mo154189x5cd39ffa(long j17, org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd, boolean z17) {
        org.p3362x76ca9b02.C29682x261049f6.m154603xaa334587(j17, c29609x93734ddd, z17);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29609x93734ddd.Natives
    /* renamed from: followDeferredRedirect */
    public void mo154190x989912ac(long j17, org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd) {
        org.p3362x76ca9b02.C29682x261049f6.m154604x42b2017f(j17, c29609x93734ddd);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29609x93734ddd.Natives
    /* renamed from: getStatus */
    public void mo154191x2fe4f2e8(long j17, org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd, org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.UrlRequestStatusListener urlRequestStatusListener) {
        org.p3362x76ca9b02.C29682x261049f6.m154605xa3f16935(j17, c29609x93734ddd, urlRequestStatusListener);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29609x93734ddd.Natives
    /* renamed from: readData */
    public boolean mo154192xcc430260(long j17, org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd, java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        return org.p3362x76ca9b02.C29682x261049f6.m154606x2ad80e73(j17, c29609x93734ddd, byteBuffer, i17, i18);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29609x93734ddd.Natives
    /* renamed from: setHttpMethod */
    public boolean mo154193x492a458b(long j17, org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd, java.lang.String str) {
        return org.p3362x76ca9b02.C29682x261049f6.m154607x5a48cd58(j17, c29609x93734ddd, str);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29609x93734ddd.Natives
    /* renamed from: start */
    public void mo154194x68ac462(long j17, org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd) {
        org.p3362x76ca9b02.C29682x261049f6.m154608x8ac0692f(j17, c29609x93734ddd);
    }
}
