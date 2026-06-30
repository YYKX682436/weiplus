package org.p3343x72743996.net;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.HttpUtilJni */
/* loaded from: classes16.dex */
public class C29519x8f7d2a7b implements org.p3343x72743996.net.C29518xfbec4cca.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f73869xce5021a3 = new c56.a() { // from class: org.chromium.net.HttpUtilJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m153297x2f08577e(org.p3343x72743996.net.C29518xfbec4cca.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.net.C29519x8f7d2a7b.f73870x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.net.C29518xfbec4cca.Natives f73870x4baa8b47;

    public static org.p3343x72743996.net.C29518xfbec4cca.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.net.C29518xfbec4cca.Natives natives = f73870x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of HttpUtil.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.net.C29519x8f7d2a7b();
    }

    @Override // org.p3343x72743996.net.C29518xfbec4cca.Natives
    /* renamed from: isAllowedHeader */
    public boolean mo153295xee59494b(java.lang.String str, java.lang.String str2) {
        return org.p3362x76ca9b02.C29682x261049f6.m154559xd6736126(str, str2);
    }
}
