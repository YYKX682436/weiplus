package org.p3343x72743996.p3344x2e06d1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.base.ImportantFileWriterAndroidJni */
/* loaded from: classes16.dex */
public class C29310xad6a9847 implements org.p3343x72743996.p3344x2e06d1.C29309xd66e927e.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73295xce5021a3 = new c56.a() { // from class: org.chromium.base.ImportantFileWriterAndroidJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m152438x2f08577e(org.p3343x72743996.p3344x2e06d1.C29309xd66e927e.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.p3344x2e06d1.C29310xad6a9847.f73296x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.p3344x2e06d1.C29309xd66e927e.Natives f73296x4baa8b47;

    public static org.p3343x72743996.p3344x2e06d1.C29309xd66e927e.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.p3344x2e06d1.C29309xd66e927e.Natives natives = f73296x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of ImportantFileWriterAndroid.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.p3344x2e06d1.C29310xad6a9847();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.C29309xd66e927e.Natives
    /* renamed from: writeFileAtomically */
    public boolean mo152436xf52e1bfe(java.lang.String str, byte[] bArr) {
        return org.p3362x76ca9b02.C29682x261049f6.m154507x1814b33d(str, bArr);
    }
}
