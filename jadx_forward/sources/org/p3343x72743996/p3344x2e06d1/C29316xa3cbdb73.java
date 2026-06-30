package org.p3343x72743996.p3344x2e06d1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.base.JavaHandlerThreadJni */
/* loaded from: classes16.dex */
public class C29316xa3cbdb73 implements org.p3343x72743996.p3344x2e06d1.C29315xdc2bfed2.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73314xce5021a3 = new c56.a() { // from class: org.chromium.base.JavaHandlerThreadJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m152465x2f08577e(org.p3343x72743996.p3344x2e06d1.C29315xdc2bfed2.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.p3344x2e06d1.C29316xa3cbdb73.f73315x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.p3344x2e06d1.C29315xdc2bfed2.Natives f73315x4baa8b47;

    public static org.p3343x72743996.p3344x2e06d1.C29315xdc2bfed2.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.p3344x2e06d1.C29315xdc2bfed2.Natives natives = f73315x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of JavaHandlerThread.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.p3344x2e06d1.C29316xa3cbdb73();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29315xdc2bfed2.Natives
    /* renamed from: initializeThread */
    public void mo152462x3f6ed9ba(long j17, long j18) {
        org.p3362x76ca9b02.C29682x261049f6.m154510xd050de07(j17, j18);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29315xdc2bfed2.Natives
    /* renamed from: onLooperStopped */
    public void mo152463x4bd5469d(long j17) {
        org.p3362x76ca9b02.C29682x261049f6.m154511xf5ab04b0(j17);
    }
}
