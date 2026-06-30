package org.p3343x72743996.p3344x2e06d1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.base.JavaExceptionReporterJni */
/* loaded from: classes16.dex */
public class C29314x84278497 implements org.p3343x72743996.p3344x2e06d1.C29313x7a21882e.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73303xce5021a3 = new c56.a() { // from class: org.chromium.base.JavaExceptionReporterJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m152450x2f08577e(org.p3343x72743996.p3344x2e06d1.C29313x7a21882e.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.p3344x2e06d1.C29314x84278497.f73304x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.p3344x2e06d1.C29313x7a21882e.Natives f73304x4baa8b47;

    public static org.p3343x72743996.p3344x2e06d1.C29313x7a21882e.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.p3344x2e06d1.C29313x7a21882e.Natives natives = f73304x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of JavaExceptionReporter.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.p3344x2e06d1.C29314x84278497();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29313x7a21882e.Natives
    /* renamed from: reportJavaException */
    public void mo152447x75627b79(boolean z17, java.lang.Throwable th6) {
        org.p3362x76ca9b02.C29682x261049f6.m154508x34817b68(z17, th6);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29313x7a21882e.Natives
    /* renamed from: reportJavaStackTrace */
    public void mo152448xfe094db3(java.lang.String str) {
        org.p3362x76ca9b02.C29682x261049f6.m154509x22ca4ba4(str);
    }
}
