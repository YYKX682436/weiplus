package bt3;

/* loaded from: classes9.dex */
public class i0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f105817d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f105818e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f105819f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f105820g;

    /* renamed from: h, reason: collision with root package name */
    public bt3.h0 f105821h;

    public i0(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this(dVar, str, str2, str3, str4, str5, false, null);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f105817d = u0Var;
        return mo9409x10f9447a(sVar, this.f105818e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 728;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig onGYNetEnd [%d, %d, %s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) v0Var;
            r45.uz uzVar = (r45.uz) oVar.f152244b.f152233a;
            java.lang.String str2 = uzVar.f469276d;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f105819f;
            dVar.f68111xda9bc3b3 = str2;
            dVar.f68097xfafba34a = uzVar.f469278f;
            dVar.f68098xbfce865e = uzVar.f469279g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig onGYNetEnd field_signature[%s], field_fakeAeskey[%s], field_fakeSignature[%s], update[%b]", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(dVar.f68111xda9bc3b3), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(dVar.f68097xfafba34a), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(dVar.f68098xbfce865e), java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).mo9952xce0038c9(dVar, new java.lang.String[0])));
            if (this.f105820g) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                java.lang.String str3 = dVar.f68111xda9bc3b3;
                objArr[0] = java.lang.Integer.valueOf(str3 == null ? -1 : str3.length());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckBigFileDownload", "summerapp onSceneEnd CheckBigFileDownload ok signature len[%d] start NetSceneDownloadAppAttach", objArr);
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d3) ((ct.w2) i95.n0.c(ct.w2.class))).wi(false);
                dVar.f68112x10a0fed7 = 101;
                dVar.f68103x4a777c2 = c01.id.e();
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).mo9952xce0038c9(dVar, new java.lang.String[0]);
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new bt3.l0(dVar.f68106x315a5445, dVar.f68107xaaaa6883, dVar.f68104xaca5bdda, null));
            }
            bt3.h0 h0Var = this.f105821h;
            if (h0Var != null) {
                r45.tz tzVar = (r45.tz) oVar.f152243a.f152217a;
                ((ez.b) h0Var).a(str, tzVar.f468408h, tzVar.f468407g, uzVar.f469276d, uzVar.f469278f, uzVar.f469279g, tzVar.f468406f);
                this.f105821h = null;
            }
        } else {
            bt3.h0 h0Var2 = this.f105821h;
            if (h0Var2 != null) {
                ((ez.b) h0Var2).a(str, "", "", "", "", "", 0L);
                this.f105821h = null;
            }
        }
        this.f105817d.mo815x76e0bfae(i18, i19, str, this);
    }

    public i0(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17, bt3.h0 h0Var) {
        this.f105820g = false;
        this.f105820g = z17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.tz();
        lVar.f152198b = new r45.uz();
        lVar.f152199c = "/cgi-bin/micromsg-bin/checkbigfiledownload";
        lVar.f152200d = 728;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f105818e = a17;
        this.f105819f = dVar;
        if (h0Var != null) {
            this.f105821h = h0Var;
        }
        r45.tz tzVar = (r45.tz) a17.f152243a.f152217a;
        tzVar.f468407g = str;
        tzVar.f468406f = dVar.f68113xeb1a61d6;
        tzVar.f468408h = str2;
        tzVar.f468411n = str3;
        tzVar.f468410m = str4;
        tzVar.f468404d = str5;
        tzVar.f468405e = (java.lang.String) gm0.j1.u().c().l(2, "");
        tzVar.f468409i = 7;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig AESKey[%s] FileMd5[%s] FileName[%s] FileExt[%s] FileSize[%d] FileType[%d] autoDownload[%s] stack[%s]", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(tzVar.f468407g), tzVar.f468408h, tzVar.f468411n, tzVar.f468410m, java.lang.Long.valueOf(tzVar.f468406f), java.lang.Integer.valueOf(tzVar.f468409i), java.lang.Boolean.valueOf(z17), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }
}
