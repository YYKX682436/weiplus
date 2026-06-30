package org.p3343x72743996.p3344x2e06d1.p3351x363585;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.base.task.TaskRunnerImplJni */
/* loaded from: classes16.dex */
public class C29448x288b6a70 implements org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73643xce5021a3 = new c56.a() { // from class: org.chromium.base.task.TaskRunnerImplJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m153043x2f08577e(org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.p3344x2e06d1.p3351x363585.C29448x288b6a70.f73644x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5.Natives f73644x4baa8b47;

    public static org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5.Natives natives = f73644x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of TaskRunnerImpl.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.p3344x2e06d1.p3351x363585.C29448x288b6a70();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5.Natives
    /* renamed from: belongsToCurrentThread */
    public boolean mo153037xbdc9b874(long j17) {
        return org.p3362x76ca9b02.C29682x261049f6.m154553x7ba82644(j17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5.Natives
    /* renamed from: destroy */
    public void mo153038x5cd39ffa(long j17) {
        org.p3362x76ca9b02.C29682x261049f6.m154554x93c14c2a(j17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5.Natives
    /* renamed from: init */
    public long mo153039x316510(int i17, int i18) {
        return org.p3362x76ca9b02.C29682x261049f6.m154555x3e0ea6e0(i17, i18);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5.Natives
    /* renamed from: postDelayedTask */
    public void mo153040x6a420547(long j17, java.lang.Runnable runnable, long j18, java.lang.String str) {
        org.p3362x76ca9b02.C29682x261049f6.m154556x2b988177(j17, runnable, j18, str);
    }
}
