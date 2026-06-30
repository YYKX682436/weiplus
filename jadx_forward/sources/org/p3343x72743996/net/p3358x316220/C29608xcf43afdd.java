package org.p3343x72743996.net.p3358x316220;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.impl.CronetUploadDataStreamJni */
/* loaded from: classes16.dex */
public class C29608xcf43afdd implements org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f74642xce5021a3 = new c56.a() { // from class: org.chromium.net.impl.CronetUploadDataStreamJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m154152x2f08577e(org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.net.p3358x316220.C29608xcf43afdd.f74643x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.Natives f74643x4baa8b47;

    public static org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.Natives natives = f74643x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of CronetUploadDataStream.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.net.p3358x316220.C29608xcf43afdd();
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.Natives
    /* renamed from: attachUploadDataToRequest */
    public long mo154145xdf520804(org.p3343x72743996.net.p3358x316220.C29607x7a6892a8 c29607x7a6892a8, long j17, long j18) {
        return org.p3362x76ca9b02.C29682x261049f6.m154581xe897b21c(c29607x7a6892a8, j17, j18);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.Natives
    /* renamed from: createAdapterForTesting */
    public long mo154146x5a34181a(org.p3343x72743996.net.p3358x316220.C29607x7a6892a8 c29607x7a6892a8) {
        return org.p3362x76ca9b02.C29682x261049f6.m154582x948d6832(c29607x7a6892a8);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.Natives
    /* renamed from: createUploadDataStreamForTesting */
    public long mo154147xc9a0562e(org.p3343x72743996.net.p3358x316220.C29607x7a6892a8 c29607x7a6892a8, long j17, long j18) {
        return org.p3362x76ca9b02.C29682x261049f6.m154583xfda3a116(c29607x7a6892a8, j17, j18);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.Natives
    /* renamed from: destroy */
    public void mo154148x5cd39ffa(long j17) {
        org.p3362x76ca9b02.C29682x261049f6.m154584x70402012(j17);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.Natives
    /* renamed from: onReadSucceeded */
    public void mo154149xf9a6d5cc(long j17, org.p3343x72743996.net.p3358x316220.C29607x7a6892a8 c29607x7a6892a8, int i17, boolean z17) {
        org.p3362x76ca9b02.C29682x261049f6.m154585xfefdbde4(j17, c29607x7a6892a8, i17, z17);
    }

    @Override // org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.Natives
    /* renamed from: onRewindSucceeded */
    public void mo154150xe8a7e807(long j17, org.p3343x72743996.net.p3358x316220.C29607x7a6892a8 c29607x7a6892a8) {
        org.p3362x76ca9b02.C29682x261049f6.m154586xf3e52a1f(j17, c29607x7a6892a8);
    }
}
