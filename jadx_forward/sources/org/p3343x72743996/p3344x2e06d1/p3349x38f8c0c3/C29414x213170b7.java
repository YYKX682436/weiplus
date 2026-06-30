package org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.base.metrics.StatisticsRecorderAndroidJni */
/* loaded from: classes16.dex */
public class C29414x213170b7 implements org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29413xd09c100e.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73544xce5021a3 = new c56.a() { // from class: org.chromium.base.metrics.StatisticsRecorderAndroidJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m152949x2f08577e(org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29413xd09c100e.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29414x213170b7.f73545x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29413xd09c100e.Natives f73545x4baa8b47;

    public static org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29413xd09c100e.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29413xd09c100e.Natives natives = f73545x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of StatisticsRecorderAndroid.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29414x213170b7();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29413xd09c100e.Natives
    /* renamed from: toJson */
    public java.lang.String mo152947xcc31ba03(int i17) {
        return org.p3362x76ca9b02.C29682x261049f6.m154552x82ae05d0(i17);
    }
}
