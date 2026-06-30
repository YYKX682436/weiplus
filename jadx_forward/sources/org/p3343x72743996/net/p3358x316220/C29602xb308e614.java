package org.p3343x72743996.net.p3358x316220;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.impl.CronetLibraryLoaderJni */
/* loaded from: classes16.dex */
public class C29602xb308e614 implements org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f74563xce5021a3 = new c56.a() { // from class: org.chromium.net.impl.CronetLibraryLoaderJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m154089x2f08577e(org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.net.p3358x316220.C29602xb308e614.f74564x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.Natives f74564x4baa8b47;

    public static org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.Natives natives = f74564x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of CronetLibraryLoader.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.net.p3358x316220.C29602xb308e614();
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.Natives
    /* renamed from: cronetInitOnInitThread */
    public void mo154085x1257d986() {
        org.p3362x76ca9b02.C29682x261049f6.m154578xfcdd7de3();
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.Natives
    /* renamed from: getCronetVersion */
    public java.lang.String mo154086xf714d6a5() {
        return org.p3362x76ca9b02.C29682x261049f6.m154579x8e5044c2();
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.Natives
    /* renamed from: setMinLogLevel */
    public void mo154087x37f1c550(int i17) {
        org.p3362x76ca9b02.C29682x261049f6.m154580xc87c16ad(i17);
    }
}
