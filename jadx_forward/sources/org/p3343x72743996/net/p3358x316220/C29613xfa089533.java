package org.p3343x72743996.net.p3358x316220;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.impl.CronetUrlRequestContextJni */
/* loaded from: classes16.dex */
public class C29613xfa089533 implements org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f74738xce5021a3 = new c56.a() { // from class: org.chromium.net.impl.CronetUrlRequestContextJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m154237x2f08577e(org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.net.p3358x316220.C29613xfa089533.f74739x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives f74739x4baa8b47;

    public static org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives natives = f74739x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of CronetUrlRequestContext.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.net.p3358x316220.C29613xfa089533();
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives
    /* renamed from: addPkp */
    public void mo154222xab35f174(long j17, java.lang.String str, byte[][] bArr, boolean z17, long j18) {
        org.p3362x76ca9b02.C29682x261049f6.m154587xcd5e47f0(j17, str, bArr, z17, j18);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives
    /* renamed from: addQuicHint */
    public void mo154223x864dd1a6(long j17, java.lang.String str, int i17, int i18) {
        org.p3362x76ca9b02.C29682x261049f6.m154588x118428aa(j17, str, i17, i18);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives
    /* renamed from: configureNetworkQualityEstimatorForTesting */
    public void mo154224x1bbc11b0(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12, boolean z17, boolean z18, boolean z19) {
        org.p3362x76ca9b02.C29682x261049f6.m154589x303bda2c(j17, c29611x38ff9d12, z17, z18, z19);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives
    /* renamed from: createRequestContextAdapter */
    public long mo154225x9b400f73(long j17) {
        return org.p3362x76ca9b02.C29682x261049f6.m154590xf78fde77(j17);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives
    /* renamed from: createRequestContextConfig */
    public long mo154226xc6fc029e(byte[] bArr) {
        return org.p3362x76ca9b02.C29682x261049f6.m154591xc1b4431a(bArr);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives
    /* renamed from: destroy */
    public void mo154227x5cd39ffa(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12) {
        org.p3362x76ca9b02.C29682x261049f6.m154592x7fb618fe(j17, c29611x38ff9d12);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives
    /* renamed from: getEnableTelemetry */
    public boolean mo154228x8e507340(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12) {
        return org.p3362x76ca9b02.C29682x261049f6.m154593x401eefbc(j17, c29611x38ff9d12);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives
    /* renamed from: getHistogramDeltas */
    public byte[] mo154229xe62be009() {
        return org.p3362x76ca9b02.C29682x261049f6.m154594x97fa5c85();
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives
    /* renamed from: initRequestContextOnInitThread */
    public void mo154230x90ab4fe9(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12) {
        org.p3362x76ca9b02.C29682x261049f6.m154595xfc16f265(j17, c29611x38ff9d12);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives
    /* renamed from: provideRTTObservations */
    public void mo154231xe6f8d078(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12, boolean z17) {
        org.p3362x76ca9b02.C29682x261049f6.m154596xdbfcaef4(j17, c29611x38ff9d12, z17);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives
    /* renamed from: provideThroughputObservations */
    public void mo154232xff2c6512(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12, boolean z17) {
        org.p3362x76ca9b02.C29682x261049f6.m154597x86c48316(j17, c29611x38ff9d12, z17);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives
    /* renamed from: startNetLogToDisk */
    public void mo154233xdb787381(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12, java.lang.String str, boolean z17, int i17) {
        org.p3362x76ca9b02.C29682x261049f6.m154598xb7ea7785(j17, c29611x38ff9d12, str, z17, i17);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives
    /* renamed from: startNetLogToFile */
    public boolean mo154234xdb795b60(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12, java.lang.String str, boolean z17) {
        return org.p3362x76ca9b02.C29682x261049f6.m154599xb7eb5f64(j17, c29611x38ff9d12, str, z17);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29611x38ff9d12.Natives
    /* renamed from: stopNetLog */
    public void mo154235xa63bab09(long j17, org.p3343x72743996.net.p3358x316220.C29611x38ff9d12 c29611x38ff9d12) {
        org.p3362x76ca9b02.C29682x261049f6.m154600x371c6385(j17, c29611x38ff9d12);
    }
}
