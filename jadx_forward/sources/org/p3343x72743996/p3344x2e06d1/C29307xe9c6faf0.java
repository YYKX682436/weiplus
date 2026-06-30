package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.FileUtilsJni */
/* loaded from: classes16.dex */
public class C29307xe9c6faf0 implements org.p3343x72743996.p3344x2e06d1.C29305x28705875.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73289xce5021a3 = new c56.a() { // from class: org.chromium.base.FileUtilsJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m152427x2f08577e(org.p3343x72743996.p3344x2e06d1.C29305x28705875.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.p3344x2e06d1.C29307xe9c6faf0.f73290x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.p3344x2e06d1.C29305x28705875.Natives f73290x4baa8b47;

    public static org.p3343x72743996.p3344x2e06d1.C29305x28705875.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.p3344x2e06d1.C29305x28705875.Natives natives = f73290x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of FileUtils.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.p3344x2e06d1.C29307xe9c6faf0();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29305x28705875.Natives
    /* renamed from: getAbsoluteFilePath */
    public java.lang.String mo152425xbb4d21ce(java.lang.String str) {
        return org.p3362x76ca9b02.C29682x261049f6.m154506xa1474884(str);
    }
}
