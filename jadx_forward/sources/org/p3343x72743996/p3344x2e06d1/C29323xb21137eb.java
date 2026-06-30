package org.p3343x72743996.p3344x2e06d1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.base.MemoryPressureListenerJni */
/* loaded from: classes16.dex */
public class C29323xb21137eb implements org.p3343x72743996.p3344x2e06d1.C29321xc460b55a.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73340xce5021a3 = new c56.a() { // from class: org.chromium.base.MemoryPressureListenerJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m152525x2f08577e(org.p3343x72743996.p3344x2e06d1.C29321xc460b55a.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.p3344x2e06d1.C29323xb21137eb.f73341x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.p3344x2e06d1.C29321xc460b55a.Natives f73341x4baa8b47;

    public static org.p3343x72743996.p3344x2e06d1.C29321xc460b55a.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.p3344x2e06d1.C29321xc460b55a.Natives natives = f73341x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of MemoryPressureListener.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.p3344x2e06d1.C29323xb21137eb();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29321xc460b55a.Natives
    /* renamed from: onMemoryPressure */
    public void mo152523xde904e25(int i17) {
        org.p3362x76ca9b02.C29682x261049f6.m154512x3f47ea(i17);
    }
}
