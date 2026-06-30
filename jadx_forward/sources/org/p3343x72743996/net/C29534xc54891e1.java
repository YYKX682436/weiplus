package org.p3343x72743996.net;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.NetworkChangeNotifierJni */
/* loaded from: classes16.dex */
public class C29534xc54891e1 implements org.p3343x72743996.net.C29529xd78a8f24.Natives {

    /* renamed from: TEST_HOOKS */
    public static final c56.a f74186xce5021a3 = new c56.a() { // from class: org.chromium.net.NetworkChangeNotifierJni.1
        /* renamed from: setInstanceForTesting, reason: merged with bridge method [inline-methods] */
        public void m153432x2f08577e(org.p3343x72743996.net.C29529xd78a8f24.Natives natives) {
            if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
                org.p3343x72743996.net.C29534xc54891e1.f74187x4baa8b47 = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };

    /* renamed from: testInstance */
    private static org.p3343x72743996.net.C29529xd78a8f24.Natives f74187x4baa8b47;

    public static org.p3343x72743996.net.C29529xd78a8f24.Natives get() {
        if (org.p3362x76ca9b02.C29682x261049f6.f75008x91888bd2) {
            org.p3343x72743996.net.C29529xd78a8f24.Natives natives = f74187x4baa8b47;
            if (natives != null) {
                return natives;
            }
            if (org.p3362x76ca9b02.C29682x261049f6.f75007x2a92e044) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of NetworkChangeNotifier.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.p3343x72743996.net.C29534xc54891e1();
    }

    @Override // org.p3343x72743996.net.C29529xd78a8f24.Natives
    /* renamed from: notifyConnectionCostChanged */
    public void mo153366xa95b7ca0(long j17, org.p3343x72743996.net.C29529xd78a8f24 c29529xd78a8f24, int i17) {
        org.p3362x76ca9b02.C29682x261049f6.m154561x313a3ab5(j17, c29529xd78a8f24, i17);
    }

    @Override // org.p3343x72743996.net.C29529xd78a8f24.Natives
    /* renamed from: notifyConnectionTypeChanged */
    public void mo153367x446ad893(long j17, org.p3343x72743996.net.C29529xd78a8f24 c29529xd78a8f24, int i17, long j18) {
        org.p3362x76ca9b02.C29682x261049f6.m154562xcc4996a8(j17, c29529xd78a8f24, i17, j18);
    }

    @Override // org.p3343x72743996.net.C29529xd78a8f24.Natives
    /* renamed from: notifyMaxBandwidthChanged */
    public void mo153368xf462d43e(long j17, org.p3343x72743996.net.C29529xd78a8f24 c29529xd78a8f24, int i17) {
        org.p3362x76ca9b02.C29682x261049f6.m154563x83941393(j17, c29529xd78a8f24, i17);
    }

    @Override // org.p3343x72743996.net.C29529xd78a8f24.Natives
    /* renamed from: notifyOfNetworkConnect */
    public void mo153369x74905fc(long j17, org.p3343x72743996.net.C29529xd78a8f24 c29529xd78a8f24, long j18, int i17) {
        org.p3362x76ca9b02.C29682x261049f6.m154564x99570ec7(j17, c29529xd78a8f24, j18, i17);
    }

    @Override // org.p3343x72743996.net.C29529xd78a8f24.Natives
    /* renamed from: notifyOfNetworkDisconnect */
    public void mo153370x18a9da4a(long j17, org.p3343x72743996.net.C29529xd78a8f24 c29529xd78a8f24, long j18) {
        org.p3362x76ca9b02.C29682x261049f6.m154565xa7db199f(j17, c29529xd78a8f24, j18);
    }

    @Override // org.p3343x72743996.net.C29529xd78a8f24.Natives
    /* renamed from: notifyOfNetworkSoonToDisconnect */
    public void mo153371x5a67f580(long j17, org.p3343x72743996.net.C29529xd78a8f24 c29529xd78a8f24, long j18) {
        org.p3362x76ca9b02.C29682x261049f6.m154566x39dfa115(j17, c29529xd78a8f24, j18);
    }

    @Override // org.p3343x72743996.net.C29529xd78a8f24.Natives
    /* renamed from: notifyPurgeActiveNetworkList */
    public void mo153372x16543244(long j17, org.p3343x72743996.net.C29529xd78a8f24 c29529xd78a8f24, long[] jArr) {
        org.p3362x76ca9b02.C29682x261049f6.m154567x8a4d36cf(j17, c29529xd78a8f24, jArr);
    }
}
