package ks3;

/* loaded from: classes13.dex */
public class c0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f393177d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f393178e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f393179f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f393180g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f393181h;

    public c0(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String str5;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 586;
        this.f393179f = str;
        this.f393180g = str2;
        this.f393181h = str3;
        ks3.e eVar = new ks3.e();
        eVar.f393189d = i17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            try {
                byte[] m21241x6cbe8fef = com.qq.taf.jce.C2855x93dd899d.m21241x6cbe8fef(str3);
                javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(m21241x6cbe8fef, "AES");
                javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, secretKeySpec, new javax.crypto.spec.IvParameterSpec(m21241x6cbe8fef));
                char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                byte[] bytes = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str4.getBytes()).getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                byte[] doFinal = cipher.doFinal(bytes);
                com.qq.taf.jce.C2855x93dd899d.m21238x223991d(m21241x6cbe8fef);
                com.qq.taf.jce.C2855x93dd899d.m21238x223991d(bytes);
                com.qq.taf.jce.C2855x93dd899d.m21238x223991d(doFinal);
                str5 = android.util.Base64.encodeToString(doFinal, 2);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneBindXmail", e17, "bind xmail encrypt second pwd error", new java.lang.Object[0]);
                str5 = "";
            }
            eVar.f393193h = str5;
        }
        eVar.f393191f = str;
        eVar.f393192g = str2;
        lVar.f152197a = eVar;
        lVar.f152198b = new ks3.f();
        lVar.f152199c = "/cgi-bin/micromsg-bin/commitbindxmail";
        this.f393177d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f393178e = u0Var;
        return mo9409x10f9447a(sVar, this.f393177d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 586;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f393178e.mo815x76e0bfae(i18, i19, str, this);
    }
}
