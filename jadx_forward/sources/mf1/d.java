package mf1;

/* loaded from: classes7.dex */
public class d implements com.p314xaae8f345.p3132xf2511bc7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mf1.f f407566a;

    public d(mf1.f fVar) {
        this.f407566a = fVar;
    }

    @Override // com.p314xaae8f345.p3132xf2511bc7.a
    public void a(java.lang.String str, int i17, byte[] bArr, boolean z17) {
        mf1.f fVar = this.f407566a;
        if (z17) {
            try {
                ((yc1.o) ((mf1.a) fVar.f407583r).f407556c).d(new java.lang.String(bArr, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
                return;
            } catch (java.io.UnsupportedEncodingException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandWcWssSocket", e17, "onmessage unsupport encoding UnsupportedEncodingException", new java.lang.Object[0]);
                return;
            }
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        mf1.a aVar = (mf1.a) fVar.f407583r;
        if (wrap != null) {
            aVar.getClass();
            wrap.capacity();
        }
        ((yc1.o) aVar.f407556c).e(wrap);
    }

    @Override // com.p314xaae8f345.p3132xf2511bc7.a
    public void b(java.lang.String str, int i17, java.lang.String[] strArr, java.lang.String[] strArr2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWcWssSocket", "onHandShake group:%s, wssId:%s", str, java.lang.Integer.valueOf(i17));
        mf1.f fVar = this.f407566a;
        xk1.e f17 = mf1.f.f(fVar, 1, strArr, strArr2);
        mf1.a aVar = (mf1.a) fVar.f407583r;
        aVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkWcWssSocket", "onWebsocketHandshakeSentAsClient");
        ((yc1.o) aVar.f407556c).g((xk1.a) f17);
    }

    @Override // com.p314xaae8f345.p3132xf2511bc7.a
    public void c(java.lang.String str, int i17, boolean z17, java.lang.String[] strArr, java.lang.String[] strArr2, int i18, java.lang.String str2, java.lang.String[] strArr3, java.lang.String[] strArr4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWcWssSocket", "onOpen group:%s,isSuc:%s, msg:%s, code:%s, wssId:%s", str, java.lang.Boolean.valueOf(z17), str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        mf1.f fVar = this.f407566a;
        if (!z17) {
            ((mf1.a) fVar.f407583r).a("onOpen fail code:" + i18 + ", msg:" + str2);
            return;
        }
        fVar.f407585t = mf1.e.OPEN;
        xk1.e f17 = mf1.f.f(fVar, 2, strArr, strArr2);
        fVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (strArr3 == null || strArr4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWcWssSocket", "buildProfileMap profileKey args is null");
        } else if (strArr3.length == strArr4.length) {
            for (int i19 = 0; i19 < strArr3.length; i19++) {
                hashMap.put(strArr3[i19], strArr4[i19]);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWcWssSocket", "buildProfileMap profileKey != profileValue profileKey.length:%d,profileValue.length:%d", java.lang.Integer.valueOf(strArr3.length), java.lang.Integer.valueOf(strArr4.length));
        }
        mf1.a aVar = (mf1.a) fVar.f407583r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkWcWssSocket", "onSocketOpen taskId=%s", aVar.f407554a);
        aVar.f407558e.i(aVar.f407555b);
        ((yc1.o) aVar.f407556c).f((xk1.g) f17, hashMap);
    }

    @Override // com.p314xaae8f345.p3132xf2511bc7.a
    public void d(java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWcWssSocket", "onClose group:%s,id:%s, reason:%s, code:%s", str, java.lang.Integer.valueOf(i17), str2, java.lang.Integer.valueOf(i18));
        mf1.e eVar = mf1.e.CLOSED;
        mf1.f fVar = this.f407566a;
        fVar.f407585t = eVar;
        mf1.a aVar = (mf1.a) fVar.f407583r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkWcWssSocket", "onSocketClose url is %s ,state: closed ,reason: %s, errCode = %d,taskId=%s", aVar.f407557d, str2, java.lang.Integer.valueOf(i18), aVar.f407554a);
        mf1.c cVar = aVar.f407558e;
        mf1.k kVar = aVar.f407555b;
        cVar.i(kVar);
        cVar.h(kVar);
        mf1.h hVar = aVar.f407556c;
        if (i18 != -1) {
            ((yc1.o) hVar).a(i18, str2);
            return;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            ((yc1.o) hVar).c(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? "abnormal closure" : str2);
        } else {
            ((yc1.o) hVar).c("network is down");
        }
        ((yc1.o) hVar).a(1006, str2);
    }

    @Override // com.p314xaae8f345.p3132xf2511bc7.a
    /* renamed from: doCertificateVerify */
    public int mo108928x2f1063a5(java.lang.String str, byte[][] bArr) {
        mf1.f fVar = this.f407566a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWcWssSocket", "certifivate verify for " + str);
        try {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4546xcbb9aa9 m40150xe12d20f8 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.m40150xe12d20f8(bArr, "RSA", str, 1, fVar.f407586u);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWcWssSocket", "host %s rsa verify result %d, isknownroots %b, ishostmatched %b", str, java.lang.Integer.valueOf(m40150xe12d20f8.m39971x2fe4f2e8()), java.lang.Boolean.valueOf(m40150xe12d20f8.m39973x5df97c79()), java.lang.Boolean.valueOf(m40150xe12d20f8.m39972x5cc1bf10()));
            if (m40150xe12d20f8.m39971x2fe4f2e8() != 0) {
                m40150xe12d20f8 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.m40150xe12d20f8(bArr, "ECDSA", str, 1, fVar.f407586u);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWcWssSocket", "host %s ecdsa verify result %d, isknownroots %b, ishostmatched %b", str, java.lang.Integer.valueOf(m40150xe12d20f8.m39971x2fe4f2e8()), java.lang.Boolean.valueOf(m40150xe12d20f8.m39973x5df97c79()), java.lang.Boolean.valueOf(m40150xe12d20f8.m39972x5cc1bf10()));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandWcWssSocket", e17, "doCertificateVerify Exception", new java.lang.Object[0]);
            return -1;
        }
    }
}
