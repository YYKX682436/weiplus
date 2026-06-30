package org.p3343x72743996.net;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.ProxyChangeListenerJni */
/* loaded from: classes16.dex */
public class C29546xf1f3a3d3 implements org.p3343x72743996.net.C29542x701272.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f74230xce5021a3 = new c56.a() { // from class: org.chromium.net.ProxyChangeListenerJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m153470x2f08577e(org.p3343x72743996.net.C29542x701272.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.net.C29546xf1f3a3d3.f74231x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.net.C29542x701272.Natives f74231x4baa8b47;

    public static org.p3343x72743996.net.C29542x701272.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.net.C29542x701272.Natives natives = f74231x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of ProxyChangeListener.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.net.C29546xf1f3a3d3();
    }

    @Override // org.p3343x72743996.net.C29542x701272.Natives
    /* renamed from: proxySettingsChanged */
    public void mo153463x4e51e4c3(long j17, org.p3343x72743996.net.C29542x701272 c29542x701272) {
        org.p3362x76ca9b02.C29682x261049f6.m154568x79cff1c0(j17, c29542x701272);
    }

    @Override // org.p3343x72743996.net.C29542x701272.Natives
    /* renamed from: proxySettingsChangedTo */
    public void mo153464x16bca9e(long j17, org.p3343x72743996.net.C29542x701272 c29542x701272, java.lang.String str, int i17, java.lang.String str2, java.lang.String[] strArr) {
        org.p3362x76ca9b02.C29682x261049f6.m154569x459a8c5b(j17, c29542x701272, str, i17, str2, strArr);
    }
}
