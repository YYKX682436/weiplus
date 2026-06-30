package org.p3343x72743996.net.mm;

/* renamed from: org.chromium.net.mm.CronetJsBindingJni */
/* loaded from: classes16.dex */
public class C29636xe56b8586 implements org.p3343x72743996.net.mm.AbstractC29635x248bc59f.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f74870xce5021a3 = new c56.a() { // from class: org.chromium.net.mm.CronetJsBindingJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m154285x2f08577e(org.p3343x72743996.net.mm.AbstractC29635x248bc59f.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.net.mm.C29636xe56b8586.f74871x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.net.mm.AbstractC29635x248bc59f.Natives f74871x4baa8b47;

    public static org.p3343x72743996.net.mm.AbstractC29635x248bc59f.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.net.mm.AbstractC29635x248bc59f.Natives natives = f74871x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of CronetJsBinding.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.net.mm.C29636xe56b8586();
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f.Natives
    /* renamed from: cancelAllRequests */
    public void mo154279x4dfb95ab(long j17) {
        org.p3362x76ca9b02.C29682x261049f6.m154609xda5bf97c(j17);
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f.Natives
    /* renamed from: destroy */
    public void mo154280x5cd39ffa(long j17) {
        org.p3362x76ca9b02.C29682x261049f6.m154610xcaf6650b(j17);
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f.Natives
    /* renamed from: initCronetJsBinding */
    public long mo154281x41e19e8f(org.p3343x72743996.net.mm.AbstractC29635x248bc59f abstractC29635x248bc59f, long j17, long j18, long j19) {
        return org.p3362x76ca9b02.C29682x261049f6.m154611x37b85220(abstractC29635x248bc59f, j17, j18, j19);
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f.Natives
    /* renamed from: setupConfig */
    public void mo154282x8a00181f(long j17, java.lang.String str, java.lang.String str2, long j18, long j19, long j27, long j28, java.lang.String str3, boolean z17) {
        org.p3362x76ca9b02.C29682x261049f6.m154612xf027ecb0(j17, str, str2, j18, j19, j27, j28, str3, z17);
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f.Natives
    /* renamed from: setupMemoryPressureListener */
    public void mo154283xc6d54417() {
        org.p3362x76ca9b02.C29682x261049f6.m154613x5b0bd6a8();
    }
}
