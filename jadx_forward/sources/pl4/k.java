package pl4;

/* loaded from: classes15.dex */
public final class k implements com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26242xd2a9d8e0 {

    /* renamed from: v, reason: collision with root package name */
    public static final pl4.c f438249v = new pl4.c(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f438250a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f438251b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f438252c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f438253d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f438254e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p2917x47247089.p2918x58d9bd6.p2919x6cb1a5ac.C25465x5bc08976 f438255f;

    /* renamed from: g, reason: collision with root package name */
    public long f438256g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f438257h;

    /* renamed from: i, reason: collision with root package name */
    public long f438258i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f438259j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f438260k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f438261l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f438262m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f438263n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f438264o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f438265p;

    /* renamed from: q, reason: collision with root package name */
    public final ku5.f f438266q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f438267r;

    /* renamed from: s, reason: collision with root package name */
    public final dn.o f438268s;

    /* renamed from: t, reason: collision with root package name */
    public final pl4.f f438269t;

    /* renamed from: u, reason: collision with root package name */
    public final pl4.d f438270u;

    public k(java.lang.String dataUrl, java.lang.String fileCacheId, java.lang.String str, java.lang.String str2, yz5.l onError) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataUrl, "dataUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileCacheId, "fileCacheId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onError, "onError");
        this.f438250a = dataUrl;
        this.f438251b = fileCacheId;
        this.f438252c = str2;
        this.f438253d = onError;
        this.f438254e = new java.lang.Object();
        e();
        this.f438258i = -1L;
        this.f438265p = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f438266q = ((ku5.t0) ku5.t0.f394148d).o("TingTPResourceLoader:" + fileCacheId, 2, 2, new java.util.concurrent.LinkedBlockingQueue());
        dn.o oVar = new dn.o();
        oVar.M1 = dataUrl;
        oVar.f69601xaca5bdda = fileCacheId;
        oVar.f69595x6d25b0d9 = ol4.s.f427739d.d(fileCacheId);
        boolean z17 = true;
        oVar.H1 = 1;
        oVar.f323318d = "task_TingAudioDownloader";
        oVar.Z = 10;
        oVar.f323342y0 = 4;
        oVar.f323324l1 = true;
        if (str != null && !r26.n0.N(str)) {
            z17 = false;
        }
        if (!z17) {
            oVar.N1 = str;
        }
        this.f438268s = oVar;
        this.f438269t = new pl4.f(this);
        this.f438270u = new pl4.d(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016a  */
    /* JADX WARN: Type inference failed for: r9v1, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(pl4.k r21, com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26244x6ec750ac r22) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl4.k.a(pl4.k, com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest):boolean");
    }

    public static int h(pl4.k kVar, long j17, long j18, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", "requestVideoData, mediaId:" + kVar.f438251b + ", offset: " + j17 + ", length: " + j18 + ", durationMs: " + i17);
        return ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37765xff4560f6(kVar.f438251b, j17, j18, 10000);
    }

    public final void b() {
        if (this.f438262m) {
            synchronized (this.f438254e) {
                if (!this.f438259j) {
                    if (this.f438260k) {
                        if (this.f438263n) {
                            if (this.f438258i > 0) {
                                this.f438263n = false;
                                long d17 = d(0L);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", "checkBufferTask fileCacheId " + this.f438251b + " requestAllData currentOffset " + d17);
                                h(this, d17, this.f438258i, 0, 4, null);
                                return;
                            }
                            return;
                        }
                        synchronized (this.f438254e) {
                            if (this.f438265p.isEmpty()) {
                                return;
                            }
                            com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26244x6ec750ac interfaceC26244x6ec750ac = (com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26244x6ec750ac) this.f438265p.getLast();
                            long mo101490x3b780bb6 = interfaceC26244x6ec750ac.mo101498x11b6d29f().mo101490x3b780bb6();
                            long mo101493xad3aef6b = (interfaceC26244x6ec750ac.mo101498x11b6d29f().mo101493xad3aef6b() + interfaceC26244x6ec750ac.mo101498x11b6d29f().mo101492xa811c5be()) - mo101490x3b780bb6;
                            long j17 = this.f438258i;
                            if (mo101493xad3aef6b > j17) {
                                mo101493xad3aef6b = j17;
                            }
                            if (mo101493xad3aef6b <= 0) {
                                return;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", "checkBufferTask fileCacheId:" + this.f438251b + ", currentOffset:" + mo101490x3b780bb6 + ", leftLength:" + mo101493xad3aef6b);
                            h(this, mo101490x3b780bb6, mo101493xad3aef6b, 0, 4, null);
                        }
                    }
                }
            }
        }
    }

    public final void c(long j17) {
        this.f438258i = j17;
        yz5.l lVar = this.f438267r;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Long.valueOf(j17));
        }
        this.f438267r = null;
    }

    public final long d(long j17) {
        if (this.f438259j) {
            return this.f438258i - j17;
        }
        long[] jArr = new long[2];
        int m37760xcac8ee98 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37760xcac8ee98(this.f438251b, j17, jArr);
        long j18 = jArr[0];
        if (m37760xcac8ee98 != 0 || j18 == -1) {
            return 0L;
        }
        return j18;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26242xd2a9d8e0
    /* renamed from: didCancelLoadingRequest */
    public void mo101487x1455adec(com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26244x6ec750ac interfaceC26244x6ec750ac) {
        synchronized (this.f438254e) {
            this.f438265p.remove(interfaceC26244x6ec750ac);
        }
    }

    public final void e() {
        if (this.f438255f != null) {
            return;
        }
        boolean z17 = true;
        java.lang.String str = this.f438252c;
        if (str != null && (r26.n0.N(str) ^ true)) {
            if (!com.p314xaae8f345.p2917x47247089.p2918x58d9bd6.p2919x6cb1a5ac.C25465x5bc08976.f296788c) {
                try {
                    fp.d0.n("ekeydecryptor");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingTPResourceLoader", "loadLibrary failed e " + e17.getMessage());
                    this.f438253d.mo146xb9724478("Decrypt init error: " + e17.getMessage());
                    z17 = false;
                }
                com.p314xaae8f345.p2917x47247089.p2918x58d9bd6.p2919x6cb1a5ac.C25465x5bc08976.f296788c = z17;
            }
            if (com.p314xaae8f345.p2917x47247089.p2918x58d9bd6.p2919x6cb1a5ac.C25465x5bc08976.f296788c) {
                this.f438255f = new com.p314xaae8f345.p2917x47247089.p2918x58d9bd6.p2919x6cb1a5ac.C25465x5bc08976(str);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingTPResourceLoader", "loadLibrary failed");
            }
        }
    }

    public final void f(boolean z17, boolean z18) {
        java.lang.String str;
        boolean z19;
        synchronized (this.f438254e) {
            if (this.f438260k) {
                return;
            }
            this.f438260k = true;
            if (z17) {
                e();
            }
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest();
            dn.o oVar = this.f438268s;
            c2CDownloadRequest.f17792xcd096f43 = oVar.f69601xaca5bdda;
            c2CDownloadRequest.url = oVar.M1;
            c2CDownloadRequest.f17823x40acd92d = oVar.N1;
            c2CDownloadRequest.m37861xfb0731c4(oVar.f69595x6d25b0d9);
            c2CDownloadRequest.f17793xd428dad6 = 90;
            c2CDownloadRequest.f17769xd0bc10db = 276;
            c2CDownloadRequest.f17775x596916e = 3;
            c2CDownloadRequest.f17780x81527598 = 4;
            c2CDownloadRequest.f17841x86986d5f = 60;
            dn.o oVar2 = this.f438268s;
            c2CDownloadRequest.f17820x5e9d4f82 = oVar2.f69608x6ac8fea7;
            c2CDownloadRequest.f17819x31507f2a = oVar2.f323338x;
            c2CDownloadRequest.f17842x8460e80b = oVar2.f323324l1;
            pl4.c cVar = f438249v;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2573x3652ee.C20778x99327c1e()) == 1) {
                c2CDownloadRequest.f17828xaffbff78 = 1;
                c2CDownloadRequest.f17827x549a5933 = 7;
            }
            dn.o oVar3 = this.f438268s;
            if (com.p314xaae8f345.mm.vfs.w6.j(oVar3.M1)) {
                str = oVar3.M1;
            } else {
                java.lang.String field_fullpath = oVar3.f69595x6d25b0d9;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fullpath, "field_fullpath");
                str = (com.p314xaae8f345.mm.vfs.w6.j(cVar.a(field_fullpath)) && com.p314xaae8f345.mm.vfs.w6.j(oVar3.f69595x6d25b0d9)) ? oVar3.f69595x6d25b0d9 : null;
            }
            if (str != null && (r26.n0.N(str) ^ true)) {
                long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkIsDownloadComplete mediaId:");
                sb6.append(this.f438251b);
                sb6.append(" total:");
                sb6.append(k17);
                sb6.append(", decryptKeySize:");
                java.lang.String str2 = this.f438252c;
                sb6.append(str2 != null ? str2.length() : 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", sb6.toString());
                if (this.f438258i <= 0 && k17 > 0) {
                    this.f438259j = true;
                    c(k17);
                }
                z19 = true;
            } else {
                z19 = false;
            }
            if (z19) {
                this.f438257h = true;
                return;
            }
            int m37789x737fa05e = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37789x737fa05e(c2CDownloadRequest, this.f438269t, this.f438270u, this.f438268s.H1);
            if (-21006 == m37789x737fa05e && !z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", "startSNSDownload fileCacheId:" + this.f438251b + ", result:" + m37789x737fa05e + " do retry");
                ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37741x70920b1f(this.f438251b);
                synchronized (this.f438254e) {
                    this.f438260k = false;
                }
                f(z17, true);
                return;
            }
            byte[] bytes = (this.f438250a + '-' + this.f438252c).getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("startSNSDownload, useSimpleDns: ");
            sb7.append(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2573x3652ee.C20778x99327c1e()) == 1);
            sb7.append(", mediaId: ");
            sb7.append(this.f438268s.f69601xaca5bdda);
            sb7.append(", result: ");
            sb7.append(m37789x737fa05e);
            sb7.append(", decryptKeySize:");
            java.lang.String str3 = this.f438252c;
            sb7.append(str3 != null ? str3.length() : 0);
            sb7.append(", md5hash:");
            sb7.append(g17);
            sb7.append(", url:");
            sb7.append(this.f438268s.M1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", sb7.toString());
            if (m37789x737fa05e != 0) {
                this.f438253d.mo146xb9724478("download error: " + m37789x737fa05e);
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26242xd2a9d8e0
    /* renamed from: fillInContentInformation */
    public void mo101488x5240871b(com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.C26245xdfa71862 c26245xdfa71862) {
        if (c26245xdfa71862 == null) {
            return;
        }
        c26245xdfa71862.f51347xe8ce5353 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54280xf59ed10d;
        java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("resourceLoader");
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(c17);
        java.lang.String str = this.f438251b;
        if (!j17) {
            com.p314xaae8f345.mm.vfs.w6.u(c17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", "fillInContentInformation, fileCacheId:" + str + ", mkdirs for " + c17 + ", success: " + com.p314xaae8f345.mm.vfs.w6.j(c17) + '.');
        }
        boolean z17 = true;
        java.lang.String b17 = com.p314xaae8f345.mm.vfs.x6.b(c17 + '/' + str + ".mp4", true);
        if (b17 != null && b17.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            c26245xdfa71862.f51348x2342b98b = b17;
        }
        if (this.f438258i <= 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", "fillInContentInformation, fileCacheId:" + str + ", totalLen:" + this.f438258i + ", nativePath:" + b17);
        c26245xdfa71862.f51349x71fc1cdb = this.f438258i;
    }

    public final void g() {
        this.f438266q.execute(new pl4.g(this));
    }

    public final void i(boolean z17) {
        ((ku5.t0) ku5.t0.f394148d).h(new pl4.h(this, z17), "TingTPResourceLoaderPool");
    }

    public final void j(boolean z17) {
        ((ku5.t0) ku5.t0.f394148d).h(new pl4.i(this, z17), "TingTPResourceLoaderPool");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26242xd2a9d8e0
    /* renamed from: shouldWaitForLoadingOfRequestedResource */
    public boolean mo101489x1ec01c6a(com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26244x6ec750ac interfaceC26244x6ec750ac) {
        if (interfaceC26244x6ec750ac == null) {
            return false;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26243xc8b78f22 mo101498x11b6d29f = interfaceC26244x6ec750ac.mo101498x11b6d29f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingTPResourceLoader", "shouldWaitForLoadingOfRequestedResource, fileCacheId:" + this.f438251b + ", requestedOffset:" + mo101498x11b6d29f.mo101493xad3aef6b() + ", currentOffset:" + mo101498x11b6d29f.mo101490x3b780bb6() + ", requestedLength:" + mo101498x11b6d29f.mo101492xa811c5be());
        synchronized (this.f438254e) {
            this.f438265p.add(interfaceC26244x6ec750ac);
            this.f438264o = true;
        }
        i(false);
        g();
        b();
        return true;
    }
}
