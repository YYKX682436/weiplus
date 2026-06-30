package org.p3343x72743996.net;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.HttpNegotiateAuthenticatorJni */
/* loaded from: classes16.dex */
public class C29516xcf61408 implements org.p3343x72743996.net.C29515x7545965d.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73852xce5021a3 = new c56.a() { // from class: org.chromium.net.HttpNegotiateAuthenticatorJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m153292x2f08577e(org.p3343x72743996.net.C29515x7545965d.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.net.C29516xcf61408.f73853x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.net.C29515x7545965d.Natives f73853x4baa8b47;

    public static org.p3343x72743996.net.C29515x7545965d.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.net.C29515x7545965d.Natives natives = f73853x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of HttpNegotiateAuthenticator.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.net.C29516xcf61408();
    }

    @Override // org.p3343x72743996.net.C29515x7545965d.Natives
    /* renamed from: setResult */
    public void mo153290x209a1f1f(long j17, org.p3343x72743996.net.C29515x7545965d c29515x7545965d, int i17, java.lang.String str) {
        org.p3362x76ca9b02.C29682x261049f6.m154558xd319f10d(j17, c29515x7545965d, i17, str);
    }
}
