package org.p3343x72743996.p3344x2e06d1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.base.PowerMonitorJni */
/* loaded from: classes16.dex */
public class C29334x1ec78ab0 implements org.p3343x72743996.p3344x2e06d1.C29332xf2ffe0b5.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73402xce5021a3 = new c56.a() { // from class: org.chromium.base.PowerMonitorJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m152606x2f08577e(org.p3343x72743996.p3344x2e06d1.C29332xf2ffe0b5.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.p3344x2e06d1.C29334x1ec78ab0.f73403x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.p3344x2e06d1.C29332xf2ffe0b5.Natives f73403x4baa8b47;

    public static org.p3343x72743996.p3344x2e06d1.C29332xf2ffe0b5.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.p3344x2e06d1.C29332xf2ffe0b5.Natives natives = f73403x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of PowerMonitor.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.p3344x2e06d1.C29334x1ec78ab0();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29332xf2ffe0b5.Natives
    /* renamed from: onBatteryChargingChanged */
    public void mo152602x15ca2df5() {
        org.p3362x76ca9b02.C29682x261049f6.m154514xbc0433bf();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29332xf2ffe0b5.Natives
    /* renamed from: onThermalStatusChanged */
    public void mo152603xfa5388a(int i17) {
        org.p3362x76ca9b02.C29682x261049f6.m154515xcf5a28d4(i17);
    }
}
