package org.p3343x72743996.net;

/* renamed from: org.chromium.net.GURLUtilsJni */
/* loaded from: classes16.dex */
public class C29514x57654fc implements org.p3343x72743996.net.C29513x151219e9.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73836xce5021a3 = new c56.a() { // from class: org.chromium.net.GURLUtilsJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m153282x2f08577e(org.p3343x72743996.net.C29513x151219e9.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.net.C29514x57654fc.f73837x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.net.C29513x151219e9.Natives f73837x4baa8b47;

    public static org.p3343x72743996.net.C29513x151219e9.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.net.C29513x151219e9.Natives natives = f73837x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of GURLUtils.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.net.C29514x57654fc();
    }

    @Override // org.p3343x72743996.net.C29513x151219e9.Natives
    /* renamed from: getOrigin */
    public java.lang.String mo153280x28f8d21c(java.lang.String str) {
        return org.p3362x76ca9b02.C29682x261049f6.m154557x3e177bf6(str);
    }
}
