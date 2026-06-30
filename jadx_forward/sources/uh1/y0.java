package uh1;

/* loaded from: classes7.dex */
public class y0 implements javax.net.ssl.X509TrustManager {

    /* renamed from: c, reason: collision with root package name */
    public final java.security.KeyStore f509467c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f509468d;

    /* renamed from: g, reason: collision with root package name */
    public java.security.cert.X509Certificate[] f509471g;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f509469e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.security.KeyStore f509470f = null;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f509465a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f509466b = new java.util.LinkedList();

    public y0(boolean z17) {
        this.f509468d = z17;
        try {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance(java.security.KeyStore.getDefaultType());
            this.f509467c = keyStore;
            keyStore.load(null, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandX509TrustManager", e17, "Exception: Local KeyStore init failed", new java.lang.Object[0]);
        }
    }

    public void a() {
        java.util.LinkedList linkedList = this.f509465a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.System.currentTimeMillis();
        try {
            javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((java.security.KeyStore) null);
            javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            int i17 = 0;
            while (trustManagers != null) {
                if (i17 >= trustManagers.length) {
                    break;
                }
                linkedList.add((javax.net.ssl.X509TrustManager) trustManagers[i17]);
                i17++;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandX509TrustManager", e17, "Exception: init SystemTrustManager", new java.lang.Object[0]);
        }
        java.util.LinkedList linkedList2 = this.f509466b;
        java.security.KeyStore keyStore = this.f509467c;
        if (keyStore != null) {
            try {
                javax.net.ssl.TrustManagerFactory trustManagerFactory2 = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory2.init(keyStore);
                javax.net.ssl.TrustManager[] trustManagers2 = trustManagerFactory2.getTrustManagers();
                int i18 = 0;
                while (trustManagers2 != null) {
                    if (i18 >= trustManagers2.length) {
                        break;
                    }
                    linkedList2.add((javax.net.ssl.X509TrustManager) trustManagers2[i18]);
                    i18++;
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandX509TrustManager", e18, "Exception: init LocalTrustManager", new java.lang.Object[0]);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.security.cert.X509Certificate[] acceptedIssuers = ((javax.net.ssl.X509TrustManager) it.next()).getAcceptedIssuers();
            if (acceptedIssuers != null) {
                arrayList.addAll(java.util.Arrays.asList(acceptedIssuers));
            }
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            java.security.cert.X509Certificate[] acceptedIssuers2 = ((javax.net.ssl.X509TrustManager) it6.next()).getAcceptedIssuers();
            if (acceptedIssuers2 != null) {
                arrayList.addAll(java.util.Arrays.asList(acceptedIssuers2));
            }
        }
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        java.security.cert.X509Certificate[] x509CertificateArr = new java.security.cert.X509Certificate[arrayList.size()];
        this.f509471g = x509CertificateArr;
        this.f509471g = (java.security.cert.X509Certificate[]) arrayList.toArray(x509CertificateArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandX509TrustManager", "initAcceptedIssuers: %d, %d, %d", java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis), java.lang.Long.valueOf(currentTimeMillis3 - currentTimeMillis2), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis3));
        java.lang.System.currentTimeMillis();
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) {
        throw new java.security.cert.CertificateException("Client Certification not supported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02eb  */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.Iterator] */
    @Override // javax.net.ssl.X509TrustManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void checkServerTrusted(java.security.cert.X509Certificate[] r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uh1.y0.checkServerTrusted(java.security.cert.X509Certificate[], java.lang.String):void");
    }

    @Override // javax.net.ssl.X509TrustManager
    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return this.f509471g;
    }
}
