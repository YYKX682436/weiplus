package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.NetworkMonitor */
/* loaded from: classes13.dex */
public class C29829xa86b976c {
    private static final java.lang.String TAG = "NetworkMonitor";

    /* renamed from: currentConnectionType */
    private volatile org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType f75608x620ee511;

    /* renamed from: nativeNetworkObservers */
    private final java.util.ArrayList<java.lang.Long> f75609x7174e806;

    /* renamed from: networkChangeDetector */
    private org.p3371xd0ce3e8d.InterfaceC29826xb786ed44 f75610x4aa59d64;

    /* renamed from: networkChangeDetectorFactory */
    private org.p3371xd0ce3e8d.InterfaceC29827x16382726 f75611x30591306;

    /* renamed from: networkChangeDetectorLock */
    private final java.lang.Object f75612x1a3484af;

    /* renamed from: networkObservers */
    private final java.util.ArrayList<org.p3371xd0ce3e8d.C29829xa86b976c.NetworkObserver> f75613x51cb61cf;

    /* renamed from: numObservers */
    private int f75614x59b51377;

    /* renamed from: org.webrtc.NetworkMonitor$InstanceHolder */
    /* loaded from: classes13.dex */
    public static class InstanceHolder {

        /* renamed from: instance */
        static final org.p3371xd0ce3e8d.C29829xa86b976c f75617x21169495 = new org.p3371xd0ce3e8d.C29829xa86b976c();

        private InstanceHolder() {
        }
    }

    /* renamed from: org.webrtc.NetworkMonitor$NetworkObserver */
    /* loaded from: classes13.dex */
    public interface NetworkObserver {
        /* renamed from: onConnectionTypeChanged */
        void m155862x67d37bbd(org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType connectionType);
    }

    @java.lang.Deprecated
    /* renamed from: addNetworkObserver */
    public static void m155828xa803cc43(org.p3371xd0ce3e8d.C29829xa86b976c.NetworkObserver networkObserver) {
        m155834x9cf0d20b().m155853xdab4fe97(networkObserver);
    }

    /* renamed from: androidSdkInt */
    private static int m155829xc25094a4() {
        return android.os.Build.VERSION.SDK_INT;
    }

    /* renamed from: assertIsTrue */
    private static void m155830xc6b0a4be(boolean z17) {
        if (!z17) {
            throw new java.lang.AssertionError("Expected to be true");
        }
    }

    /* renamed from: createAndSetAutoDetectForTest */
    public static org.p3371xd0ce3e8d.C29830x5a2dcdbe m155831xd2950f02(android.content.Context context) {
        org.p3371xd0ce3e8d.C29829xa86b976c m155834x9cf0d20b = m155834x9cf0d20b();
        org.p3371xd0ce3e8d.InterfaceC29826xb786ed44 m155832x98901c8 = m155834x9cf0d20b.m155832x98901c8(context);
        m155834x9cf0d20b.f75610x4aa59d64 = m155832x98901c8;
        return (org.p3371xd0ce3e8d.C29830x5a2dcdbe) m155832x98901c8;
    }

    /* renamed from: createNetworkChangeDetector */
    private org.p3371xd0ce3e8d.InterfaceC29826xb786ed44 m155832x98901c8(android.content.Context context) {
        return this.f75611x30591306.mo155822xaf65a0fc(new org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.Observer() { // from class: org.webrtc.NetworkMonitor.2
            @Override // org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.Observer
            /* renamed from: onConnectionTypeChanged */
            public void mo155818x67d37bbd(org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType connectionType) {
                org.p3371xd0ce3e8d.C29829xa86b976c.this.m155851xa0c283c8(connectionType);
            }

            @Override // org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.Observer
            /* renamed from: onNetworkConnect */
            public void mo155819x1f62e9b(org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation networkInformation) {
                org.p3371xd0ce3e8d.C29829xa86b976c.this.m155845x70772bc7(networkInformation);
            }

            @Override // org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.Observer
            /* renamed from: onNetworkDisconnect */
            public void mo155820x9553f94b(long j17) {
                org.p3371xd0ce3e8d.C29829xa86b976c.this.m155846x9e9dc9f(j17);
            }

            @Override // org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.Observer
            /* renamed from: onNetworkPreference */
            public void mo155821x1eb35d8a(java.util.List<org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType> list, int i17) {
                org.p3371xd0ce3e8d.C29829xa86b976c.this.m155847x934940de(list, i17);
            }
        }, context);
    }

    /* renamed from: getCurrentConnectionType */
    private org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType m155833x6dbab75b() {
        return this.f75608x620ee511;
    }

    /* renamed from: getInstance */
    public static org.p3371xd0ce3e8d.C29829xa86b976c m155834x9cf0d20b() {
        return org.p3371xd0ce3e8d.C29829xa86b976c.InstanceHolder.f75617x21169495;
    }

    /* renamed from: getNativeNetworkObserversSync */
    private java.util.List<java.lang.Long> m155835xbc6b0fb7() {
        java.util.ArrayList arrayList;
        synchronized (this.f75609x7174e806) {
            arrayList = new java.util.ArrayList(this.f75609x7174e806);
        }
        return arrayList;
    }

    @java.lang.Deprecated
    /* renamed from: init */
    public static void m155836x316510(android.content.Context context) {
    }

    /* renamed from: isOnline */
    public static boolean m155837xebd7a81d() {
        return m155834x9cf0d20b().m155833x6dbab75b() != org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_NONE;
    }

    /* renamed from: nativeNotifyConnectionTypeChanged */
    private native void m155838x94dc19fc(long j17);

    /* renamed from: nativeNotifyOfActiveNetworkList */
    private native void m155839x7d7d958f(long j17, org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation[] networkInformationArr);

    /* renamed from: nativeNotifyOfNetworkConnect */
    private native void m155840xe4acc6f3(long j17, org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation networkInformation);

    /* renamed from: nativeNotifyOfNetworkDisconnect */
    private native void m155841x741e61f3(long j17, long j18);

    /* renamed from: nativeNotifyOfNetworkPreference */
    private native void m155842xfd7dc632(long j17, org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType connectionType, int i17);

    /* renamed from: networkBindingSupported */
    private boolean m155843xdf7a4df7() {
        boolean z17;
        synchronized (this.f75612x1a3484af) {
            org.p3371xd0ce3e8d.InterfaceC29826xb786ed44 interfaceC29826xb786ed44 = this.f75610x4aa59d64;
            z17 = interfaceC29826xb786ed44 != null && interfaceC29826xb786ed44.mo155808x4cae90c4();
        }
        return z17;
    }

    /* renamed from: notifyObserversOfConnectionTypeChange */
    private void m155844x1934a1b3(org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType connectionType) {
        java.util.ArrayList arrayList;
        java.util.Iterator<java.lang.Long> it = m155835xbc6b0fb7().iterator();
        while (it.hasNext()) {
            m155838x94dc19fc(it.next().longValue());
        }
        synchronized (this.f75613x51cb61cf) {
            arrayList = new java.util.ArrayList(this.f75613x51cb61cf);
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ((org.p3371xd0ce3e8d.C29829xa86b976c.NetworkObserver) it6.next()).m155862x67d37bbd(connectionType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyObserversOfNetworkConnect */
    public void m155845x70772bc7(org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation networkInformation) {
        java.util.Iterator<java.lang.Long> it = m155835xbc6b0fb7().iterator();
        while (it.hasNext()) {
            m155840xe4acc6f3(it.next().longValue(), networkInformation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyObserversOfNetworkDisconnect */
    public void m155846x9e9dc9f(long j17) {
        java.util.Iterator<java.lang.Long> it = m155835xbc6b0fb7().iterator();
        while (it.hasNext()) {
            m155841x741e61f3(it.next().longValue(), j17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyObserversOfNetworkPreference */
    public void m155847x934940de(java.util.List<org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType> list, int i17) {
        java.util.List<java.lang.Long> m155835xbc6b0fb7 = m155835xbc6b0fb7();
        for (org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType connectionType : list) {
            java.util.Iterator<java.lang.Long> it = m155835xbc6b0fb7.iterator();
            while (it.hasNext()) {
                m155842xfd7dc632(it.next().longValue(), connectionType, i17);
            }
        }
    }

    @java.lang.Deprecated
    /* renamed from: removeNetworkObserver */
    public static void m155848x86042a00(org.p3371xd0ce3e8d.C29829xa86b976c.NetworkObserver networkObserver) {
        m155834x9cf0d20b().m155856xb5bdeb7a(networkObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateCurrentConnectionType */
    public void m155851xa0c283c8(org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType connectionType) {
        this.f75608x620ee511 = connectionType;
        m155844x1934a1b3(connectionType);
    }

    /* renamed from: updateObserverActiveNetworkList */
    private void m155852xa3650007(long j17) {
        java.util.List<org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation> mo155806x6393e850;
        synchronized (this.f75612x1a3484af) {
            org.p3371xd0ce3e8d.InterfaceC29826xb786ed44 interfaceC29826xb786ed44 = this.f75610x4aa59d64;
            mo155806x6393e850 = interfaceC29826xb786ed44 == null ? null : interfaceC29826xb786ed44.mo155806x6393e850();
        }
        if (mo155806x6393e850 == null || mo155806x6393e850.size() == 0) {
            return;
        }
        m155839x7d7d958f(j17, (org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation[]) mo155806x6393e850.toArray(new org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation[mo155806x6393e850.size()]));
    }

    /* renamed from: addObserver */
    public void m155853xdab4fe97(org.p3371xd0ce3e8d.C29829xa86b976c.NetworkObserver networkObserver) {
        synchronized (this.f75613x51cb61cf) {
            this.f75613x51cb61cf.add(networkObserver);
        }
    }

    /* renamed from: getNetworkChangeDetector */
    public org.p3371xd0ce3e8d.InterfaceC29826xb786ed44 m155854x56516fae() {
        org.p3371xd0ce3e8d.InterfaceC29826xb786ed44 interfaceC29826xb786ed44;
        synchronized (this.f75612x1a3484af) {
            interfaceC29826xb786ed44 = this.f75610x4aa59d64;
        }
        return interfaceC29826xb786ed44;
    }

    /* renamed from: getNumObservers */
    public int m155855xbaa7a5ed() {
        int i17;
        synchronized (this.f75612x1a3484af) {
            i17 = this.f75614x59b51377;
        }
        return i17;
    }

    /* renamed from: removeObserver */
    public void m155856xb5bdeb7a(org.p3371xd0ce3e8d.C29829xa86b976c.NetworkObserver networkObserver) {
        synchronized (this.f75613x51cb61cf) {
            this.f75613x51cb61cf.remove(networkObserver);
        }
    }

    /* renamed from: setNetworkChangeDetectorFactory */
    public void m155857x771d5c88(org.p3371xd0ce3e8d.InterfaceC29827x16382726 interfaceC29827x16382726) {
        m155830xc6b0a4be(this.f75614x59b51377 == 0);
        this.f75611x30591306 = interfaceC29827x16382726;
    }

    /* renamed from: startMonitoring */
    public void m155859xdfa8b24a(android.content.Context context) {
        synchronized (this.f75612x1a3484af) {
            this.f75614x59b51377++;
            if (this.f75610x4aa59d64 == null) {
                this.f75610x4aa59d64 = m155832x98901c8(context);
            }
            this.f75608x620ee511 = this.f75610x4aa59d64.mo155807x6dbab75b();
        }
    }

    /* renamed from: stopMonitoring */
    public void m155860xe94bedea() {
        synchronized (this.f75612x1a3484af) {
            int i17 = this.f75614x59b51377 - 1;
            this.f75614x59b51377 = i17;
            if (i17 == 0) {
                this.f75610x4aa59d64.mo155805x5cd39ffa();
                this.f75610x4aa59d64 = null;
            }
        }
    }

    private C29829xa86b976c() {
        this.f75611x30591306 = new org.p3371xd0ce3e8d.InterfaceC29827x16382726() { // from class: org.webrtc.NetworkMonitor.1
            @Override // org.p3371xd0ce3e8d.InterfaceC29827x16382726
            /* renamed from: create */
            public org.p3371xd0ce3e8d.InterfaceC29826xb786ed44 mo155822xaf65a0fc(org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.Observer observer, android.content.Context context) {
                return new org.p3371xd0ce3e8d.C29830x5a2dcdbe(observer, context);
            }
        };
        this.f75612x1a3484af = new java.lang.Object();
        this.f75609x7174e806 = new java.util.ArrayList<>();
        this.f75613x51cb61cf = new java.util.ArrayList<>();
        this.f75614x59b51377 = 0;
        this.f75608x620ee511 = org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_UNKNOWN;
    }

    /* renamed from: stopMonitoring */
    private void m155850xe94bedea(long j17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Stop monitoring with native observer " + j17);
        m155860xe94bedea();
        synchronized (this.f75609x7174e806) {
            this.f75609x7174e806.remove(java.lang.Long.valueOf(j17));
        }
    }

    @java.lang.Deprecated
    /* renamed from: startMonitoring */
    public void m155858xdfa8b24a() {
        m155859xdfa8b24a(org.p3371xd0ce3e8d.C29752x4bd17462.m155345x6e669035());
    }

    /* renamed from: startMonitoring */
    private void m155849xdfa8b24a(android.content.Context context, long j17) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Start monitoring with native observer " + j17);
        if (context == null) {
            context = org.p3371xd0ce3e8d.C29752x4bd17462.m155345x6e669035();
        }
        m155859xdfa8b24a(context);
        synchronized (this.f75609x7174e806) {
            this.f75609x7174e806.add(java.lang.Long.valueOf(j17));
        }
        m155852xa3650007(j17);
        m155844x1934a1b3(this.f75608x620ee511);
    }
}
