package qe;

/* loaded from: classes7.dex */
public class v0 implements com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssWebSocketListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f443530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f443531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qe.d1 f443532c;

    public v0(qe.d1 d1Var, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        this.f443532c = d1Var;
        this.f443530a = weakReference;
        this.f443531b = weakReference2;
    }

    @Override // com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssWebSocketListener
    /* renamed from: bindSocketToCellularAndDnsByCellular */
    public com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssWebSocketListener.BindAndDnsReturn mo83421x9a3b21a8(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4551xb30b7784.BindAndDnsReturnKt m40040x9a3b21a8 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4551xb30b7784.INSTANCE.m40049x21169495().m40040x9a3b21a8(i17, str, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        m40040x9a3b21a8.getHostIpStr();
        com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssWebSocketListener.BindAndDnsReturn bindAndDnsReturn = new com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssWebSocketListener.BindAndDnsReturn();
        bindAndDnsReturn.f39939xd40736c2 = m40040x9a3b21a8.getHostIpStr();
        bindAndDnsReturn.f39940xdde293aa = m40040x9a3b21a8.getResultCode();
        return bindAndDnsReturn;
    }

    @Override // com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssWebSocketListener
    /* renamed from: doCertificateVerify */
    public int mo83422x2f1063a5(java.lang.String str, long j17, java.lang.String str2, byte[][] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar;
        qe.d1 d1Var = this.f443532c;
        if ((d1Var.f443463c == null || d1Var.f443464d == null) && (lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) this.f443531b.get()) != null) {
            d1Var.f443463c = (uh1.a) lVar.b(uh1.a.class);
            uh1.a aVar = d1Var.f443463c;
            if (aVar != null) {
                d1Var.f443464d = uh1.j0.r(aVar);
                if (d1Var.f443464d == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "MMWcWss doCertificateVerify getTrustManager fail");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "MMWcWss doCertificateVerify getConfig fail");
            }
        }
        javax.net.ssl.X509TrustManager x509TrustManager = d1Var.f443464d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WcWssNativeInstallHelper", "certifivate verify for " + str2);
        try {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4546xcbb9aa9 m40150xe12d20f8 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.m40150xe12d20f8(bArr, "RSA", str2, 1, x509TrustManager);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WcWssNativeInstallHelper", "host %s rsa verify result %d, isknownroots %b, ishostmatched %b", str2, java.lang.Integer.valueOf(m40150xe12d20f8.m39971x2fe4f2e8()), java.lang.Boolean.valueOf(m40150xe12d20f8.m39973x5df97c79()), java.lang.Boolean.valueOf(m40150xe12d20f8.m39972x5cc1bf10()));
            if (m40150xe12d20f8.m39971x2fe4f2e8() != 0) {
                m40150xe12d20f8 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.m40150xe12d20f8(bArr, "ECDSA", str2, 1, x509TrustManager);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WcWssNativeInstallHelper", "host %s ecdsa verify result %d, isknownroots %b, ishostmatched %b", str2, java.lang.Integer.valueOf(m40150xe12d20f8.m39971x2fe4f2e8()), java.lang.Boolean.valueOf(m40150xe12d20f8.m39973x5df97c79()), java.lang.Boolean.valueOf(m40150xe12d20f8.m39972x5cc1bf10()));
            }
            if (m40150xe12d20f8.m39971x2fe4f2e8() != 0) {
                ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(972L, 7L, 1L, false);
            }
            if (m40150xe12d20f8.m39971x2fe4f2e8() == 0 && !m40150xe12d20f8.m39972x5cc1bf10()) {
                ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(972L, 8L, 1L, false);
            }
            if (m40150xe12d20f8.m39971x2fe4f2e8() == 0 && !m40150xe12d20f8.m39973x5df97c79()) {
                ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(972L, 9L, 1L, false);
            }
            if (m40150xe12d20f8.m39971x2fe4f2e8() == 0) {
                return m40150xe12d20f8.m39973x5df97c79() ? 0 : -1;
            }
            return -1;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WcWssNativeInstallHelper", e17, "doCertificateVerify Exception", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssWebSocketListener
    /* renamed from: onStateChange */
    public void mo83423x4799dc42(java.lang.String str, long j17, int i17) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) this.f443530a.get()).mo51545x3498a0(new qe.u0(this, str, j17, i17));
    }
}
