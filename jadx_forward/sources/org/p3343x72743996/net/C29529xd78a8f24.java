package org.p3343x72743996.net;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "net")
/* renamed from: org.chromium.net.NetworkChangeNotifier */
/* loaded from: classes13.dex */
public class C29529xd78a8f24 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f74124x7118e671 = false;

    /* renamed from: sInstance */
    private static org.p3343x72743996.net.C29529xd78a8f24 f74125xbfaed628;

    /* renamed from: mAutoDetector */
    private org.p3343x72743996.net.C29530x68a47f76 f74126xcbb353a2;

    /* renamed from: mCurrentConnectionType */
    private int f74129x15e0aaa4 = 0;

    /* renamed from: mCurrentConnectionCost */
    private int f74128x15d8cb37 = 0;

    /* renamed from: mNativeChangeNotifiers */
    private final java.util.ArrayList<java.lang.Long> f74130x609ca39 = new java.util.ArrayList<>();

    /* renamed from: mConnectionTypeObservers */
    private final org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.net.C29529xd78a8f24.ConnectionTypeObserver> f74127xa15610d8 = new org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<>();

    /* renamed from: org.chromium.net.NetworkChangeNotifier$ConnectionTypeObserver */
    /* loaded from: classes13.dex */
    public interface ConnectionTypeObserver {
        /* renamed from: onConnectionTypeChanged */
        void m153365x67d37bbd(int i17);
    }

    /* renamed from: org.chromium.net.NetworkChangeNotifier$Natives */
    /* loaded from: classes13.dex */
    public interface Natives {
        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "NetworkChangeNotifierDelegateAndroid")
        /* renamed from: notifyConnectionCostChanged */
        void mo153366xa95b7ca0(long j17, org.p3343x72743996.net.C29529xd78a8f24 c29529xd78a8f24, int i17);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "NetworkChangeNotifierDelegateAndroid")
        /* renamed from: notifyConnectionTypeChanged */
        void mo153367x446ad893(long j17, org.p3343x72743996.net.C29529xd78a8f24 c29529xd78a8f24, int i17, long j18);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "NetworkChangeNotifierDelegateAndroid")
        /* renamed from: notifyMaxBandwidthChanged */
        void mo153368xf462d43e(long j17, org.p3343x72743996.net.C29529xd78a8f24 c29529xd78a8f24, int i17);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "NetworkChangeNotifierDelegateAndroid")
        /* renamed from: notifyOfNetworkConnect */
        void mo153369x74905fc(long j17, org.p3343x72743996.net.C29529xd78a8f24 c29529xd78a8f24, long j18, int i17);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "NetworkChangeNotifierDelegateAndroid")
        /* renamed from: notifyOfNetworkDisconnect */
        void mo153370x18a9da4a(long j17, org.p3343x72743996.net.C29529xd78a8f24 c29529xd78a8f24, long j18);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "NetworkChangeNotifierDelegateAndroid")
        /* renamed from: notifyOfNetworkSoonToDisconnect */
        void mo153371x5a67f580(long j17, org.p3343x72743996.net.C29529xd78a8f24 c29529xd78a8f24, long j18);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "NetworkChangeNotifierDelegateAndroid")
        /* renamed from: notifyPurgeActiveNetworkList */
        void mo153372x16543244(long j17, org.p3343x72743996.net.C29529xd78a8f24 c29529xd78a8f24, long[] jArr);
    }

    /* renamed from: addConnectionTypeObserver */
    public static void m153315xae4e682f(org.p3343x72743996.net.C29529xd78a8f24.ConnectionTypeObserver connectionTypeObserver) {
        m153328x9cf0d20b().m153316xabd0f40c(connectionTypeObserver);
    }

    /* renamed from: addConnectionTypeObserverInternal */
    private void m153316xabd0f40c(org.p3343x72743996.net.C29529xd78a8f24.ConnectionTypeObserver connectionTypeObserver) {
        this.f74127xa15610d8.m152532xdab4fe97(connectionTypeObserver);
    }

    /* renamed from: destroyAutoDetector */
    private void m153317x433b07af() {
        org.p3343x72743996.net.C29530x68a47f76 c29530x68a47f76 = this.f74126xcbb353a2;
        if (c29530x68a47f76 != null) {
            c29530x68a47f76.m153384x5cd39ffa();
            this.f74126xcbb353a2 = null;
        }
    }

    /* renamed from: fakeConnectionCostChanged */
    public static void m153318x111ffc14(int i17) {
        m153339xd4453c46(false);
        m153328x9cf0d20b().m153349x66c8c806(i17);
    }

    /* renamed from: fakeConnectionSubtypeChanged */
    public static void m153319xf3370acd(int i17) {
        m153339xd4453c46(false);
        m153328x9cf0d20b().m153350x620ea701(i17);
    }

    /* renamed from: fakeDefaultNetwork */
    public static void m153320x47a26b62(long j17, int i17) {
        m153339xd4453c46(false);
        m153328x9cf0d20b().m153332x1934a1b3(i17, j17);
    }

    /* renamed from: fakeNetworkConnected */
    public static void m153321xacef1df0(long j17, int i17) {
        m153339xd4453c46(false);
        m153328x9cf0d20b().m153352x70772bc7(j17, i17);
    }

    /* renamed from: fakeNetworkDisconnected */
    public static void m153322xc19545f4(long j17) {
        m153339xd4453c46(false);
        m153328x9cf0d20b().m153353x9e9dc9f(j17);
    }

    /* renamed from: fakeNetworkSoonToBeDisconnected */
    public static void m153323xa0ff5b8d(long j17) {
        m153339xd4453c46(false);
        m153328x9cf0d20b().m153354xb8902415(j17);
    }

    /* renamed from: fakePurgeActiveNetworkList */
    public static void m153324xa71fa150(long[] jArr) {
        m153339xd4453c46(false);
        m153328x9cf0d20b().m153355xf3bd332a(jArr);
    }

    /* renamed from: forceConnectivityState */
    public static void m153325x5c076d6f(boolean z17) {
        m153339xd4453c46(false);
        m153328x9cf0d20b().m153326xf7d0b94c(z17);
    }

    /* renamed from: forceConnectivityStateInternal */
    private void m153326xf7d0b94c(boolean z17) {
        if ((this.f74129x15e0aaa4 != 6) != z17) {
            m153342xa0c283c8(z17 ? 0 : 6);
            m153350x620ea701(!z17 ? 1 : 0);
        }
    }

    /* renamed from: getAutoDetectorForTest */
    public static org.p3343x72743996.net.C29530x68a47f76 m153327x9b57d170() {
        return m153328x9cf0d20b().f74126xcbb353a2;
    }

    /* renamed from: getInstance */
    public static org.p3343x72743996.net.C29529xd78a8f24 m153328x9cf0d20b() {
        return f74125xbfaed628;
    }

    /* renamed from: init */
    public static org.p3343x72743996.net.C29529xd78a8f24 m153329x316510() {
        if (f74125xbfaed628 == null) {
            f74125xbfaed628 = new org.p3343x72743996.net.C29529xd78a8f24();
        }
        return f74125xbfaed628;
    }

    /* renamed from: isInitialized */
    public static boolean m153330xf582434a() {
        return f74125xbfaed628 != null;
    }

    /* renamed from: isOnline */
    public static boolean m153331xebd7a81d() {
        return m153328x9cf0d20b().m153346x6dbab75b() != 6;
    }

    /* renamed from: registerToReceiveNotificationsAlways */
    public static void m153333xf196e852() {
        m153328x9cf0d20b().m153340x79d9c123(true, new org.p3343x72743996.net.C29549xacc7a21d());
    }

    /* renamed from: removeConnectionTypeObserver */
    public static void m153334x8ed98bd2(org.p3343x72743996.net.C29529xd78a8f24.ConnectionTypeObserver connectionTypeObserver) {
        m153328x9cf0d20b().m153335x941bc4af(connectionTypeObserver);
    }

    /* renamed from: removeConnectionTypeObserverInternal */
    private void m153335x941bc4af(org.p3343x72743996.net.C29529xd78a8f24.ConnectionTypeObserver connectionTypeObserver) {
        this.f74127xa15610d8.m152537xb5bdeb7a(connectionTypeObserver);
    }

    /* renamed from: resetInstanceForTests */
    public static void m153336xf0a0ddfc() {
        f74125xbfaed628 = new org.p3343x72743996.net.C29529xd78a8f24();
    }

    /* renamed from: setAutoDetectConnectivityState */
    public static void m153339xd4453c46(boolean z17) {
        m153328x9cf0d20b().m153340x79d9c123(z17, new org.p3343x72743996.net.C29550x57912137());
    }

    /* renamed from: setAutoDetectConnectivityStateInternal */
    private void m153340x79d9c123(boolean z17, org.p3343x72743996.net.C29530x68a47f76.RegistrationPolicy registrationPolicy) {
        if (!z17) {
            m153317x433b07af();
            return;
        }
        if (this.f74126xcbb353a2 == null) {
            org.p3343x72743996.net.C29530x68a47f76 c29530x68a47f76 = new org.p3343x72743996.net.C29530x68a47f76(new org.p3343x72743996.net.C29530x68a47f76.Observer() { // from class: org.chromium.net.NetworkChangeNotifier.1
                @Override // org.p3343x72743996.net.C29530x68a47f76.Observer
                /* renamed from: onConnectionCostChanged */
                public void mo153358xccc41fca(int i17) {
                    org.p3343x72743996.net.C29529xd78a8f24.this.m153349x66c8c806(i17);
                }

                @Override // org.p3343x72743996.net.C29530x68a47f76.Observer
                /* renamed from: onConnectionSubtypeChanged */
                public void mo153359xf54ec357(int i17) {
                    org.p3343x72743996.net.C29529xd78a8f24.this.m153350x620ea701(i17);
                }

                @Override // org.p3343x72743996.net.C29530x68a47f76.Observer
                /* renamed from: onConnectionTypeChanged */
                public void mo153360x67d37bbd(int i17) {
                    org.p3343x72743996.net.C29529xd78a8f24.this.m153342xa0c283c8(i17);
                }

                @Override // org.p3343x72743996.net.C29530x68a47f76.Observer
                /* renamed from: onNetworkConnect */
                public void mo153361x1f62e9b(long j17, int i17) {
                    org.p3343x72743996.net.C29529xd78a8f24.this.m153352x70772bc7(j17, i17);
                }

                @Override // org.p3343x72743996.net.C29530x68a47f76.Observer
                /* renamed from: onNetworkDisconnect */
                public void mo153362x9553f94b(long j17) {
                    org.p3343x72743996.net.C29529xd78a8f24.this.m153353x9e9dc9f(j17);
                }

                @Override // org.p3343x72743996.net.C29530x68a47f76.Observer
                /* renamed from: onNetworkSoonToDisconnect */
                public void mo153363x45a50fc1(long j17) {
                    org.p3343x72743996.net.C29529xd78a8f24.this.m153354xb8902415(j17);
                }

                @Override // org.p3343x72743996.net.C29530x68a47f76.Observer
                /* renamed from: purgeActiveNetworkList */
                public void mo153364xaba7b9b(long[] jArr) {
                    org.p3343x72743996.net.C29529xd78a8f24.this.m153355xf3bd332a(jArr);
                }
            }, registrationPolicy);
            this.f74126xcbb353a2 = c29530x68a47f76;
            org.p3343x72743996.net.C29530x68a47f76.NetworkState m153385xb28f27e6 = c29530x68a47f76.m153385xb28f27e6();
            m153342xa0c283c8(m153385xb28f27e6.m153416x3a4db02e());
            m153341xa0baa45b(m153385xb28f27e6.m153414x3a45d0c1());
            m153350x620ea701(m153385xb28f27e6.m153415x9a32f806());
        }
    }

    /* renamed from: updateCurrentConnectionCost */
    private void m153341xa0baa45b(int i17) {
        this.f74128x15d8cb37 = i17;
        m153349x66c8c806(i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateCurrentConnectionType */
    public void m153342xa0c283c8(int i17) {
        this.f74129x15e0aaa4 = i17;
        m153351x1934a1b3(i17);
    }

    /* renamed from: addNativeObserver */
    public void m153343xb80e170e(long j17) {
        this.f74130x609ca39.add(java.lang.Long.valueOf(j17));
    }

    /* renamed from: getCurrentConnectionCost */
    public int m153344x6db2d7ee() {
        return this.f74128x15d8cb37;
    }

    /* renamed from: getCurrentConnectionSubtype */
    public int m153345x16e905b9() {
        org.p3343x72743996.net.C29530x68a47f76 c29530x68a47f76 = this.f74126xcbb353a2;
        if (c29530x68a47f76 == null) {
            return 0;
        }
        return c29530x68a47f76.m153385xb28f27e6().m153415x9a32f806();
    }

    /* renamed from: getCurrentConnectionType */
    public int m153346x6dbab75b() {
        return this.f74129x15e0aaa4;
    }

    /* renamed from: getCurrentDefaultNetId */
    public long m153347x8ca93aba() {
        org.p3343x72743996.net.C29530x68a47f76 c29530x68a47f76 = this.f74126xcbb353a2;
        if (c29530x68a47f76 == null) {
            return -1L;
        }
        return c29530x68a47f76.m153386x393a4c4d();
    }

    /* renamed from: getCurrentNetworksAndTypes */
    public long[] m153348x6fab4f6a() {
        org.p3343x72743996.net.C29530x68a47f76 c29530x68a47f76 = this.f74126xcbb353a2;
        return c29530x68a47f76 == null ? new long[0] : c29530x68a47f76.m153388x63635f7d();
    }

    /* renamed from: notifyObserversOfConnectionCostChange */
    public void m153349x66c8c806(int i17) {
        java.util.Iterator<java.lang.Long> it = this.f74130x609ca39.iterator();
        while (it.hasNext()) {
            org.p3343x72743996.net.C29534xc54891e1.get().mo153366xa95b7ca0(it.next().longValue(), this, i17);
        }
    }

    /* renamed from: notifyObserversOfConnectionSubtypeChange */
    public void m153350x620ea701(int i17) {
        java.util.Iterator<java.lang.Long> it = this.f74130x609ca39.iterator();
        while (it.hasNext()) {
            org.p3343x72743996.net.C29534xc54891e1.get().mo153368xf462d43e(it.next().longValue(), this, i17);
        }
    }

    /* renamed from: notifyObserversOfConnectionTypeChange */
    public void m153351x1934a1b3(int i17) {
        m153332x1934a1b3(i17, m153347x8ca93aba());
    }

    /* renamed from: notifyObserversOfNetworkConnect */
    public void m153352x70772bc7(long j17, int i17) {
        java.util.Iterator<java.lang.Long> it = this.f74130x609ca39.iterator();
        while (it.hasNext()) {
            org.p3343x72743996.net.C29534xc54891e1.get().mo153369x74905fc(it.next().longValue(), this, j17, i17);
        }
    }

    /* renamed from: notifyObserversOfNetworkDisconnect */
    public void m153353x9e9dc9f(long j17) {
        java.util.Iterator<java.lang.Long> it = this.f74130x609ca39.iterator();
        while (it.hasNext()) {
            org.p3343x72743996.net.C29534xc54891e1.get().mo153370x18a9da4a(it.next().longValue(), this, j17);
        }
    }

    /* renamed from: notifyObserversOfNetworkSoonToDisconnect */
    public void m153354xb8902415(long j17) {
        java.util.Iterator<java.lang.Long> it = this.f74130x609ca39.iterator();
        while (it.hasNext()) {
            org.p3343x72743996.net.C29534xc54891e1.get().mo153371x5a67f580(it.next().longValue(), this, j17);
        }
    }

    /* renamed from: notifyObserversToPurgeActiveNetworkList */
    public void m153355xf3bd332a(long[] jArr) {
        java.util.Iterator<java.lang.Long> it = this.f74130x609ca39.iterator();
        while (it.hasNext()) {
            org.p3343x72743996.net.C29534xc54891e1.get().mo153372x16543244(it.next().longValue(), this, jArr);
        }
    }

    /* renamed from: registerNetworkCallbackFailed */
    public boolean m153356xc2910bcd() {
        org.p3343x72743996.net.C29530x68a47f76 c29530x68a47f76 = this.f74126xcbb353a2;
        if (c29530x68a47f76 == null) {
            return false;
        }
        return c29530x68a47f76.m153393xc2910bcd();
    }

    /* renamed from: removeNativeObserver */
    public void m153357x53dc8db1(long j17) {
        this.f74130x609ca39.remove(java.lang.Long.valueOf(j17));
    }

    /* renamed from: notifyObserversOfConnectionTypeChange */
    private void m153332x1934a1b3(int i17, long j17) {
        java.util.Iterator<java.lang.Long> it = this.f74130x609ca39.iterator();
        while (it.hasNext()) {
            org.p3343x72743996.net.C29534xc54891e1.get().mo153367x446ad893(it.next().longValue(), this, i17, j17);
        }
        java.util.Iterator<org.p3343x72743996.net.C29529xd78a8f24.ConnectionTypeObserver> it6 = this.f74127xa15610d8.iterator();
        while (it6.hasNext()) {
            it6.next().m153365x67d37bbd(i17);
        }
    }

    /* renamed from: resetInstanceForTests */
    public static void m153337xf0a0ddfc(org.p3343x72743996.net.C29529xd78a8f24 c29529xd78a8f24) {
        f74125xbfaed628 = c29529xd78a8f24;
    }

    /* renamed from: setAutoDetectConnectivityState */
    public static void m153338xd4453c46(org.p3343x72743996.net.C29530x68a47f76.RegistrationPolicy registrationPolicy) {
        m153328x9cf0d20b().m153340x79d9c123(true, registrationPolicy);
    }
}
