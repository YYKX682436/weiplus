package org.p3343x72743996.net;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.NetworkActiveNotifierJni */
/* loaded from: classes16.dex */
public class C29528xf7bcd4cb implements org.p3343x72743996.net.C29527x6545447a.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f74122xce5021a3 = new c56.a() { // from class: org.chromium.net.NetworkActiveNotifierJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m153313x2f08577e(org.p3343x72743996.net.C29527x6545447a.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.net.C29528xf7bcd4cb.f74123x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.net.C29527x6545447a.Natives f74123x4baa8b47;

    public static org.p3343x72743996.net.C29527x6545447a.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.net.C29527x6545447a.Natives natives = f74123x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of NetworkActiveNotifier.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.net.C29528xf7bcd4cb();
    }

    @Override // org.p3343x72743996.net.C29527x6545447a.Natives
    /* renamed from: notifyOfDefaultNetworkActive */
    public void mo153311x227cdd33(long j17) {
        org.p3362x76ca9b02.C29682x261049f6.m154560x2a54f428(j17);
    }
}
