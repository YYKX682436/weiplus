package org.p3343x72743996.p3344x2e06d1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.base.EarlyTraceEventJni */
/* loaded from: classes16.dex */
public class C29301xcf9ee08d implements org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73283xce5021a3 = new c56.a() { // from class: org.chromium.base.EarlyTraceEventJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m152397x2f08577e(org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.p3344x2e06d1.C29301xcf9ee08d.f73284x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Natives f73284x4baa8b47;

    public static org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Natives natives = f73284x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of EarlyTraceEvent.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.p3344x2e06d1.C29301xcf9ee08d();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Natives
    /* renamed from: recordEarlyAsyncBeginEvent */
    public void mo152390x95b8db1b(java.lang.String str, long j17, long j18) {
        org.p3362x76ca9b02.C29682x261049f6.m154485x1a1a1a42(str, j17, j18);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Natives
    /* renamed from: recordEarlyAsyncEndEvent */
    public void mo152391x3b6bfca9(long j17, long j18) {
        org.p3362x76ca9b02.C29682x261049f6.m154486xb590d990(j17, j18);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Natives
    /* renamed from: recordEarlyBeginEvent */
    public void mo152392x25fa5ea3(java.lang.String str, long j17, int i17, long j18) {
        org.p3362x76ca9b02.C29682x261049f6.m154487x1a3a031c(str, j17, i17, j18);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Natives
    /* renamed from: recordEarlyEndEvent */
    public void mo152393x6fc8c231(java.lang.String str, long j17, int i17, long j18) {
        org.p3362x76ca9b02.C29682x261049f6.m154488x8a6930ea(str, j17, i17, j18);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Natives
    /* renamed from: recordEarlyToplevelBeginEvent */
    public void mo152394xdfc1b952(java.lang.String str, long j17, int i17, long j18) {
        org.p3362x76ca9b02.C29682x261049f6.m154489x1075d4cb(str, j17, i17, j18);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.Natives
    /* renamed from: recordEarlyToplevelEndEvent */
    public void mo152395x73b4fca0(java.lang.String str, long j17, int i17, long j18) {
        org.p3362x76ca9b02.C29682x261049f6.m154490x7b7ba259(str, j17, i17, j18);
    }
}
