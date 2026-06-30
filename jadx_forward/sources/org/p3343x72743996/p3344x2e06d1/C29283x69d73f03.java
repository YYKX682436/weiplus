package org.p3343x72743996.p3344x2e06d1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.base.ApplicationStatusJni */
/* loaded from: classes16.dex */
public class C29283x69d73f03 implements org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73145xce5021a3 = new c56.a() { // from class: org.chromium.base.ApplicationStatusJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m152228x2f08577e(org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.p3344x2e06d1.C29283x69d73f03.f73146x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.Natives f73146x4baa8b47;

    public static org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.Natives natives = f73146x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of ApplicationStatus.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.p3344x2e06d1.C29283x69d73f03();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.Natives
    /* renamed from: onApplicationStateChange */
    public void mo152224xd854fcf0(int i17) {
        org.p3362x76ca9b02.C29682x261049f6.m154473xd77dbbcd(i17);
    }
}
