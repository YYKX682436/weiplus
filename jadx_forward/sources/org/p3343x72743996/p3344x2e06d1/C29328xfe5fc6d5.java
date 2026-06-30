package org.p3343x72743996.p3344x2e06d1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.base.PathServiceJni */
/* loaded from: classes16.dex */
public class C29328xfe5fc6d5 implements org.p3343x72743996.p3344x2e06d1.AbstractC29327x53449eb0.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73357xce5021a3 = new c56.a() { // from class: org.chromium.base.PathServiceJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m152563x2f08577e(org.p3343x72743996.p3344x2e06d1.AbstractC29327x53449eb0.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.p3344x2e06d1.C29328xfe5fc6d5.f73358x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.p3344x2e06d1.AbstractC29327x53449eb0.Natives f73358x4baa8b47;

    public static org.p3343x72743996.p3344x2e06d1.AbstractC29327x53449eb0.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.p3344x2e06d1.AbstractC29327x53449eb0.Natives natives = f73358x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of PathService.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.p3344x2e06d1.C29328xfe5fc6d5();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29327x53449eb0.Natives
    /* renamed from: override */
    public void mo152561x1f971bcc(int i17, java.lang.String str) {
        org.p3362x76ca9b02.C29682x261049f6.m154513x6e2af6fb(i17, str);
    }
}
