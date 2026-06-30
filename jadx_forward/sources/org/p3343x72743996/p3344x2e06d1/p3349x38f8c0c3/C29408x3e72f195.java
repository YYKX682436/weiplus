package org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3;

/* renamed from: org.chromium.base.metrics.NativeUmaRecorderJni */
/* loaded from: classes16.dex */
public class C29408x3e72f195 implements org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73542xce5021a3 = new c56.a() { // from class: org.chromium.base.metrics.NativeUmaRecorderJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m152919x2f08577e(org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29408x3e72f195.f73543x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0.Natives f73543x4baa8b47;

    public static org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0.Natives natives = f73543x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of NativeUmaRecorder.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29408x3e72f195();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0.Natives
    /* renamed from: addActionCallbackForTesting */
    public long mo152906x35b785c3(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465 interfaceC29287xf9968465) {
        return org.p3362x76ca9b02.C29682x261049f6.m154540xb0c064f8(interfaceC29287xf9968465);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0.Natives
    /* renamed from: createHistogramSnapshotForTesting */
    public long mo152907xf9037bd3() {
        return org.p3362x76ca9b02.C29682x261049f6.m154541x8f535f48();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0.Natives
    /* renamed from: destroyHistogramSnapshotForTesting */
    public void mo152908xa42c0e15(long j17) {
        org.p3362x76ca9b02.C29682x261049f6.m154542xd7d89940(j17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0.Natives
    /* renamed from: getHistogramSamplesForTesting */
    public long[] mo152909xfa151ce2(java.lang.String str) {
        return org.p3362x76ca9b02.C29682x261049f6.m154543xd66302d7(str);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0.Natives
    /* renamed from: getHistogramTotalCountForTesting */
    public int mo152910x4ed4f60(java.lang.String str, long j17) {
        return org.p3362x76ca9b02.C29682x261049f6.m154544x1208a94b(str, j17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0.Natives
    /* renamed from: getHistogramValueCountForTesting */
    public int mo152911x9298d993(java.lang.String str, int i17, long j17) {
        return org.p3362x76ca9b02.C29682x261049f6.m154545x9fb4337e(str, i17, j17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0.Natives
    /* renamed from: recordBooleanHistogram */
    public long mo152912xa16fd08d(java.lang.String str, long j17, boolean z17) {
        return org.p3362x76ca9b02.C29682x261049f6.m154546xb68b8438(str, j17, z17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0.Natives
    /* renamed from: recordExponentialHistogram */
    public long mo152913x3de52390(java.lang.String str, long j17, int i17, int i18, int i19, int i27) {
        return org.p3362x76ca9b02.C29682x261049f6.m154547x315909bb(str, j17, i17, i18, i19, i27);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0.Natives
    /* renamed from: recordLinearHistogram */
    public long mo152914xb3dbcb2e(java.lang.String str, long j17, int i17, int i18, int i19, int i27) {
        return org.p3362x76ca9b02.C29682x261049f6.m154548x61f57623(str, j17, i17, i18, i19, i27);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0.Natives
    /* renamed from: recordSparseHistogram */
    public long mo152915xada41a93(java.lang.String str, long j17, int i17) {
        return org.p3362x76ca9b02.C29682x261049f6.m154549x5bbdc588(str, j17, i17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0.Natives
    /* renamed from: recordUserAction */
    public void mo152916xf69de912(java.lang.String str, long j17) {
        org.p3362x76ca9b02.C29682x261049f6.m154550xa8c878fd(str, j17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29407xd63f6bf0.Natives
    /* renamed from: removeActionCallbackForTesting */
    public void mo152917x20084ca6(long j17) {
        org.p3362x76ca9b02.C29682x261049f6.m154551xcd772551(j17);
    }
}
