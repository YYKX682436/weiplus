package org.p3343x72743996.net;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.X509UtilJni */
/* loaded from: classes16.dex */
public class C29566xc275fbd implements org.p3343x72743996.net.C29565xfe45eec8.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f74356xce5021a3 = new c56.a() { // from class: org.chromium.net.X509UtilJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m153712x2f08577e(org.p3343x72743996.net.C29565xfe45eec8.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.net.C29566xc275fbd.f74357x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.net.C29565xfe45eec8.Natives f74357x4baa8b47;

    public static org.p3343x72743996.net.C29565xfe45eec8.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.net.C29565xfe45eec8.Natives natives = f74357x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of X509Util.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.net.C29566xc275fbd();
    }

    @Override // org.p3343x72743996.net.C29565xfe45eec8.Natives
    /* renamed from: notifyClientCertStoreChanged */
    public void mo153709x23a0336b() {
        org.p3362x76ca9b02.C29682x261049f6.m154570x7273e32();
    }

    @Override // org.p3343x72743996.net.C29565xfe45eec8.Natives
    /* renamed from: notifyTrustStoreChanged */
    public void mo153710xc07244c2() {
        org.p3362x76ca9b02.C29682x261049f6.m154571x3ac3599b();
    }
}
