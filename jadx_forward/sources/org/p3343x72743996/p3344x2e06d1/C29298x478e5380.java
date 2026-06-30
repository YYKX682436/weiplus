package org.p3343x72743996.p3344x2e06d1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.base.CpuFeaturesJni */
/* loaded from: classes16.dex */
public class C29298x478e5380 implements org.p3343x72743996.p3344x2e06d1.AbstractC29297x8dca49e5.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73254xce5021a3 = new c56.a() { // from class: org.chromium.base.CpuFeaturesJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m152369x2f08577e(org.p3343x72743996.p3344x2e06d1.AbstractC29297x8dca49e5.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.p3344x2e06d1.C29298x478e5380.f73255x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.p3344x2e06d1.AbstractC29297x8dca49e5.Natives f73255x4baa8b47;

    public static org.p3343x72743996.p3344x2e06d1.AbstractC29297x8dca49e5.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.p3344x2e06d1.AbstractC29297x8dca49e5.Natives natives = f73255x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of CpuFeatures.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.p3344x2e06d1.C29298x478e5380();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29297x8dca49e5.Natives
    /* renamed from: getCoreCount */
    public int mo152366x9f4b0dfa() {
        return org.p3362x76ca9b02.C29682x261049f6.m154483x2b42ac94();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29297x8dca49e5.Natives
    /* renamed from: getCpuFeatures */
    public long mo152367x436e8cf() {
        return org.p3362x76ca9b02.C29682x261049f6.m154484x70c148e9();
    }
}
