package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6;

/* loaded from: classes12.dex */
public final class b0 implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback, xh3.d, yh3.b, dn.f {

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f172401f;

    /* renamed from: d, reason: collision with root package name */
    public sx.z f172402d;

    /* renamed from: e, reason: collision with root package name */
    public dn.f f172403e;

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a0(null);
        f172401f = jz5.h.a(jz5.i.f384362d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.z.f172458d);
    }

    public b0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewCdnService", "ipcinvoke start");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = new java.util.concurrent.CountDownLatch(1);
        java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.x.f172455d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.y(this, h0Var));
        ((java.util.concurrent.CountDownLatch) h0Var.f391656d).await();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewCdnService", "ipcinvoke end");
    }

    @Override // dn.f
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // dn.f
    public int a(java.lang.String str, dn.g gVar, dn.h hVar) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // yh3.b
    public int b(java.lang.String mediaId, dn.h result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewCdnService", "[stopVideoStreamingDownload] mediaId=%s %s", mediaId, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult();
        int m37740x55b651aa = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37740x55b651aa(mediaId, c2CDownloadResult);
        f(c2CDownloadResult, result);
        return m37740x55b651aa;
    }

    @Override // yh3.b
    public int c(java.lang.String mediaId, long j17, long j18, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        return ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37765xff4560f6(mediaId, j17, j18, i17);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: combineResolveHost */
    public java.lang.String[] mo37799x705052f5(java.lang.String str, int i17, int i18, int[] iArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewCdnService", "resolveHost not impl!");
        return new java.lang.String[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a7, code lost:
    
        if (r26.n0.K(r3, 'X', 0, false, 6, null) >= 0) goto L18;
     */
    @Override // yh3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(dn.m r10, int r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.b0.d(dn.m, int):int");
    }

    public final int e(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewCdnService", "ipFromString %s ->", str);
        int i17 = 0;
        if (!r26.n0.D(str, ".", false, 2, null) && !r26.n0.D(str, ":", false, 2, null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebviewCdnService", "invalid ip str.");
            return 0;
        }
        byte[] address = java.net.InetAddress.getByName(str).getAddress();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(address, "getAddress(...)");
        int length = address.length;
        int i18 = 0;
        while (i17 < length) {
            try {
                i18 = (i18 << 8) | (address[i17] & 255);
                i17++;
            } catch (java.lang.NullPointerException | java.net.UnknownHostException unused) {
                i17 = i18;
                i18 = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewCdnService", "<- ipFromString %s --> %d", str, java.lang.Integer.valueOf(i18));
                return i18;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewCdnService", "<- ipFromString %s --> %d", str, java.lang.Integer.valueOf(i18));
        return i18;
    }

    public final dn.h f(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult, dn.h hVar) {
        if (hVar == null) {
            hVar = new dn.h();
        }
        hVar.f69553xb5f54fe9 = c2CDownloadResult.f17871x139cb015;
        hVar.f69504x4825e5df = c2CDownloadResult.f17848xd3933824;
        hVar.f69523x17c343e7 = c2CDownloadResult.f17873xd4282b9d;
        hVar.f69522xf9dbbe9c = c2CDownloadResult.f17875xb4089397;
        hVar.f69564xd94f6271 = c2CDownloadResult.f17913x88d0d6a0;
        hVar.f69514x6904c4c9 = false;
        hVar.f69548xe026fea1 = c2CDownloadResult.f17900x7467a666;
        hVar.f69571x9373c88d = c2CDownloadResult.f17921x27b47052;
        hVar.f69570xea0afd82 = c2CDownloadResult.f17920x4f6cd287;
        hVar.f69568x8db7f4aa = c2CDownloadResult.f17919x21f89c6f;
        hVar.f69519x314c8910 = c2CDownloadResult.f17869xc58d30d5;
        hVar.f69559x1bb3b54a = c2CDownloadResult.f17907x81158a4f;
        hVar.f69520x14c61803 = c2CDownloadResult.f17870xa0336a48;
        hVar.f69529x3bf012d1 = c2CDownloadResult.f17878x992a7e2c;
        hVar.f69531x3bf74305 = c2CDownloadResult.f17880x9931ae60;
        hVar.f69530xf4dab7ad = c2CDownloadResult.f17879xc6cd9808;
        hVar.f69528x97d8d5c7 = c2CDownloadResult.f17877xa0b24b4c;
        hVar.f69508x556c2b4f = c2CDownloadResult.f17853x49407c2a;
        hVar.f69505x1282dcdf = c2CDownloadResult.f17850xacfdd7a;
        hVar.f69527x5e24f3ac = c2CDownloadResult.f17876xbb5f5f07;
        hVar.f69545x96fadd74 = c2CDownloadResult.f17893x47681ab9;
        hVar.f69541xda6d4445 = c2CDownloadResult.f17891x37a7afa0;
        hVar.f69539xc7fbc1b = c2CDownloadResult.f17889xeebcb276;
        hVar.f69542xc86ec4f = c2CDownloadResult.f17892xeec3e2aa;
        hVar.f69538xa9f16abd = c2CDownloadResult.f17888x30a73542;
        hVar.f69540xb5d620d0 = c2CDownloadResult.f17890x5d9a6eb;
        hVar.f69546x64bf5b0 = c2CDownloadResult.f17896xf256b35;
        hVar.f69507xf0552c38 = c2CDownloadResult.f17852xe8a22cd3;
        hVar.f69506xf04dfc04 = c2CDownloadResult.f17851xe89afc9f;
        hVar.f69552xd5af1815 = c2CDownloadResult.f17903x1fc2181a;
        hVar.f69550x93e5c46e = c2CDownloadResult.f17901x9cbf39f3;
        hVar.f69551xde601d98 = c2CDownloadResult.f17902xefb3305d;
        hVar.f323301c = c2CDownloadResult.f17908xa410551e;
        hVar.f69533xab94fd8c = c2CDownloadResult.f17883xfb9883a7;
        hVar.f69532xac74343b = c2CDownloadResult.f17882xa4c134d6;
        hVar.f69515x7ea831eb = c2CDownloadResult.f17865xe40a06f0;
        hVar.f69518x11ebd0be = c2CDownloadResult.f17868xa62c7883;
        hVar.f69513x1966ddff = c2CDownloadResult.f17861xc9d41b44;
        hVar.f69572xa89a7555 = c2CDownloadResult.f17922xc1a9bb30;
        hVar.f69547xcabbcef8 = c2CDownloadResult.f17899x7b290c3d;
        java.lang.String clientIP = c2CDownloadResult.f17860x36253632;
        hVar.f69512x53e83fd7 = clientIP;
        hVar.f69556x6ff67d4f = c2CDownloadResult.f17904x523373aa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(clientIP, "clientIP");
        hVar.f69511xa3bc7f9f = e(clientIP);
        java.lang.String serverIP = c2CDownloadResult.f17904x523373aa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(serverIP, "serverIP");
        hVar.f69555x6aff4117 = e(serverIP);
        hVar.f69573xda6123f6 = c2CDownloadResult.f17923xbc9e1a51;
        hVar.f69509x42a09867 = c2CDownloadResult.f17858xa8026d6c;
        hVar.f69566x86033819 = c2CDownloadResult.f17917x7e5038b4;
        hVar.f69534x86d8cec = c2CDownloadResult.f17863x7e8eb13d;
        hVar.f69512x53e83fd7 = c2CDownloadResult.f17860x36253632;
        hVar.f69517x2f5726cc = c2CDownloadResult.f17867xdfc46411;
        hVar.f69516x2f4f457f = c2CDownloadResult.f17866xdfbc82c4;
        java.lang.String[] strArr = c2CDownloadResult.f17918x7a6a6d5a;
        if (strArr != null && strArr.length > 0) {
            hVar.f69567x3391a1bf = (java.lang.String[]) strArr.clone();
            hVar.f323302d = c2CDownloadResult.f17918x7a6a6d5a[r0.length - 1];
            hVar.f323303e = c2CDownloadResult.f17887x3830c1a;
            hVar.f323304f = c2CDownloadResult.f17886xde1fa701;
        }
        hVar.f69535xe3dc39c = c2CDownloadResult.f17884xf07ab9f7;
        hVar.f323306h = c2CDownloadResult.f17895xd219ed68;
        hVar.f323307i = c2CDownloadResult.f17855x6037da71;
        hVar.f323308j = c2CDownloadResult.f17914xebb6b0e1;
        hVar.f323309k = c2CDownloadResult.f17915xceeb95a7;
        hVar.f323310l = c2CDownloadResult.f17911xc060bd40;
        hVar.f323311m = c2CDownloadResult.f17897xed8e89a9;
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.SNSVideoProfile sNSVideoProfile = c2CDownloadResult.f17906x7e4dba46;
        hVar.f323312n = sNSVideoProfile;
        hVar.f323313o = c2CDownloadResult.f17905xf2f04131;
        if (sNSVideoProfile != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewCdnService", "snsvideo mode %d usecold %b useprov %d exptid %d strategy %s", java.lang.Integer.valueOf(sNSVideoProfile.f18091x3339a3), java.lang.Boolean.valueOf(hVar.f323312n.f18093x26395aa7), java.lang.Integer.valueOf(hVar.f323312n.f18094x7ba06e0d), java.lang.Integer.valueOf(hVar.f323312n.f18090xf13441d2), hVar.f323312n.f18092x6a8fa373);
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo = hVar.f323313o;
        if (videoInfo != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewCdnService", "snsvideo flag %s flag %d rawflag %d", videoInfo.f18114x9330627b, java.lang.Integer.valueOf(videoInfo.f18115x27b47052), java.lang.Integer.valueOf(hVar.f323313o.f18112xd87e3d8c));
        }
        return hVar;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: isUsingWangKaService */
    public boolean mo37800xc9848262(int i17) {
        return false;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: onBadNetworkProbed */
    public void mo37801x4491727c() {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult result) {
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CronetTaskResult cronetTaskResult;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewCdnService", "onC2CDownloadCompleted filekey %s error %d", str, java.lang.Integer.valueOf(result.f17871x139cb015));
        dn.h f17 = f(result, null);
        if (result.f17881x65357807 && (cronetTaskResult = result.f17862xd968619f) != null) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = cronetTaskResult.f18046xeddcaf63 ? "true" : "false";
            objArr[1] = cronetTaskResult.f18047xf72c4065 ? "true" : "false";
            objArr[2] = java.lang.Integer.valueOf(cronetTaskResult.f18044xec0a8ff);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewCdnService", "cronet this task is from cronet ,use http2 %s, use quic %s, status code %d ", objArr);
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.WebPageProfile webPageProfile = result.f17862xd968619f.f18043xa7c31030;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewCdnService", "cronet webperformance ip:%s, protocol:%s", webPageProfile.f18128xc4ddaa09, webPageProfile.f18130xc50a8e98);
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CronetTaskResult cronetTaskResult2 = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CronetTaskResult();
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CronetTaskResult cronetTaskResult3 = result.f17862xd968619f;
            cronetTaskResult2.f18047xf72c4065 = cronetTaskResult3.f18047xf72c4065;
            cronetTaskResult2.f18046xeddcaf63 = cronetTaskResult3.f18046xeddcaf63;
            cronetTaskResult2.f18044xec0a8ff = cronetTaskResult3.f18044xec0a8ff;
            cronetTaskResult2.f18045xec8403f = cronetTaskResult3.f18045xec8403f;
            cronetTaskResult2.f18043xa7c31030 = cronetTaskResult3.f18043xa7c31030;
            f17.f69533xab94fd8c = cronetTaskResult3.f18044xec0a8ff;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - result.f17910xf3a4da4a;
        if (30001 == result.f17874xd428dad6 && result.f17881x65357807) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewCdnService", "cronet task use cronet download time " + currentTimeMillis);
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CronetTaskResult cronetTaskResult4 = result.f17862xd968619f;
            if (cronetTaskResult4 != null) {
                if (cronetTaskResult4.f18047xf72c4065) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewCdnService", "cronet task use cronet quic download time " + currentTimeMillis);
                } else if (cronetTaskResult4.f18046xeddcaf63) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewCdnService", "cronet task use cronet http2 download time " + currentTimeMillis);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewCdnService", "cronet task use cronet http1.x download time " + currentTimeMillis);
                }
            }
        }
        if (f17.f69553xb5f54fe9 != 0) {
            sx.z zVar = this.f172402d;
            if (zVar != null) {
                zVar.a(str, null, f17);
            }
            dn.f fVar = this.f172403e;
            if (fVar != null) {
                fVar.a(str, null, f17);
                return;
            }
            return;
        }
        sx.z zVar2 = this.f172402d;
        if (zVar2 != null) {
            zVar2.a(str, null, f17);
        }
        dn.f fVar2 = this.f172403e;
        if (fVar2 != null) {
            fVar2.a(str, null, f17);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onDataAvailable */
    public void mo37930x9bb59ea0(java.lang.String str, long j17, long j18) {
        sx.z zVar = this.f172402d;
        if (zVar != null) {
            zVar.c(str, (int) j17, (int) j18);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
        dn.g gVar = new dn.g();
        gVar.f69496x83ec3dd = j17;
        gVar.f69500x8ab84c59 = j18;
        gVar.f69499x10a0fed7 = 0;
        gVar.f69498xe0f25a29 = z17;
        gVar.f69497x7f197b15 = false;
        dn.f fVar = this.f172403e;
        if (fVar != null) {
            fVar.a(str, gVar, null);
        }
        sx.z zVar = this.f172402d;
        if (zVar != null) {
            zVar.a(str, gVar, null);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onDownloadToEnd */
    public void mo37931x34576d19(java.lang.String str, long j17, long j18) {
        sx.z zVar = this.f172402d;
        if (zVar != null) {
            zVar.c(str, (int) j17, (int) j18);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onM3U8Ready */
    public void mo37932xc5dd699b(java.lang.String str, java.lang.String str2) {
        sx.z zVar = this.f172402d;
        if (zVar != null) {
            zVar.mo48095xc5dd699b(str, str2);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onMoovReady */
    public void mo37933xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        sx.z zVar = this.f172402d;
        if (zVar != null) {
            zVar.d(str, (int) j17, (int) j18, videoInfo);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onMoovReadyWithFlag */
    public void mo37934xedc4f36d(java.lang.String str, long j17, long j18, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onObtainMoovFailed */
    public void mo37935x6e07772a(java.lang.String str, int i17) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onPreloadCompletedWithResult */
    public void mo37936x23ba0da4(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2CDownloadResult);
        long j19 = c2CDownloadResult.f17900x7467a666;
        c2CDownloadResult.f17900x7467a666 = (int) j17;
        dn.h f17 = f(c2CDownloadResult, null);
        f17.f69549x50119311 = j19;
        dn.f fVar = this.f172403e;
        if (fVar != null) {
            fVar.x(str, f17);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: onTaskTearDown */
    public void mo37802xb2a6aa48(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadTaskProfile downloadTaskProfile, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportFlow */
    public void mo37803x73181082(int i17, int i18, int i19, int i27) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportFlowWithTag */
    public void mo37804xe90cea12(java.lang.String str, int i17, long j17, long j18, long j19, long j27) {
        ((kn4.d0) ((pf0.r) i95.n0.c(pf0.r.class))).getClass();
        kn4.c0.INSTANCE.b(str, j18, j17, j27, j19);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportGroupIDKey */
    public void mo37805xc9114479(int[] idArray, int[] keyArray, int[] valueArray, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(idArray, "idArray");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyArray, "keyArray");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueArray, "valueArray");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(idArray[i18], keyArray[i18], valueArray[i18]));
        }
        jx3.f.INSTANCE.b(arrayList, z17);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportIDKey */
    public void mo37806xf0018e90(long j17, long j18, long j19, boolean z17) {
        jx3.f.INSTANCE.mo68477x336bdfd8(j17, j18, j19, z17);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportKV */
    public void mo37807xe68be19f(long j17, java.lang.String str, boolean z17, boolean z18, long j18) {
        jx3.f.INSTANCE.n((int) j17, (int) j18, str, z18, z17);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportKVNoFreqLimit */
    public void mo37808xc8cf6843(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebviewCdnService", "!no impl!");
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: requestGetCDN */
    public void mo37809x3e59a466(int i17) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: requestSnsGetCdnDistance */
    public void mo37810x54b3aed5(int i17, int i18, int i19) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: resolveHost */
    public java.lang.String[] mo37811x746015b4(java.lang.String str, boolean z17, int[] iArr) {
        if (iArr != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.util.Arrays.toString(iArr), "toString(...)");
        }
        return new java.lang.String[0];
    }

    @Override // dn.f
    public byte[] w(java.lang.String str, byte[] bArr) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // dn.f
    public int x(java.lang.String str, dn.h hVar) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }
}
