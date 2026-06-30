package cw2;

/* loaded from: classes15.dex */
public final class s6 extends com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.AbstractC26467x83ec0ba3 implements dn.n, dn.k, dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f305532d;

    /* renamed from: e, reason: collision with root package name */
    public final cw2.wa f305533e;

    /* renamed from: f, reason: collision with root package name */
    public int f305534f;

    /* renamed from: g, reason: collision with root package name */
    public so2.i3 f305535g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f305536h;

    /* renamed from: i, reason: collision with root package name */
    public long f305537i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f305538m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f305539n;

    public s6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, java.lang.String mediaId, cw2.wa mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        this.f305539n = c15188xd8bd4bd;
        this.f305532d = mediaId;
        this.f305533e = mediaInfo;
        this.f305536h = new java.util.concurrent.atomic.AtomicBoolean(false);
        so2.i3 c17 = cu2.x.c(cu2.x.f303982a, mediaId, true, false, false, 12, null);
        this.f305535g = c17;
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(c17.u0());
        java.lang.String str = mediaInfo.f305628b;
        boolean j18 = com.p314xaae8f345.mm.vfs.w6.j(str);
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "create ResourceLoaderProxy, cache:" + this.f305535g + " mediaCache path:" + this.f305535g.u0() + ", exists:" + j17 + " mediaInfo path:" + str + ", exists:" + j18 + "size:" + k17 + "totalSize:" + this.f305535g.f68989x78351860);
        so2.i3 i3Var = this.f305535g;
        int i17 = i3Var.f68988x29d3a50c;
        cw2.p6 p6Var = c15188xd8bd4bd.T;
        if (i17 == -2 || i17 == -1 || i17 == 0) {
            p6Var.getClass();
            p6Var.f305466d = "未命中预加载";
            a();
        } else if (i17 != 3) {
            int w07 = i3Var.w0();
            if (w07 > 0) {
                java.lang.String str2 = "预加载" + w07 + '%';
                p6Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
                p6Var.f305466d = str2;
            } else {
                p6Var.getClass();
                p6Var.f305466d = "未命中预加载";
            }
        } else if (!j18 || k17 != i3Var.f68989x78351860) {
            a();
            p6Var.getClass();
            p6Var.f305466d = "未命中预加载";
        }
        this.f305538m = "";
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305539n.m61380xe56ce956(), "resetMediaCache");
        cu2.x xVar = cu2.x.f303982a;
        cw2.wa waVar = this.f305533e;
        long feedId = waVar.f305632f.getFeedId();
        java.lang.String str = this.f305532d;
        java.lang.String m75945x2fec8307 = waVar.f305631e.e().m75945x2fec8307(9);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String str2 = waVar.f305627a;
        if (str2 == null) {
            str2 = "";
        }
        cu2.x.h(xVar, feedId, str, m75945x2fec8307, str2, waVar.f305631e.b(), waVar.f305631e.g(), waVar.f305631e.c(), 0L, 0L, 1, waVar.f305631e.e().m75939xb282bd08(3), "", "", false, waVar.f305631e.d(), 8192, null);
        b();
    }

    public final void b() {
        this.f305535g = cu2.x.c(cu2.x.f303982a, this.f305532d, false, false, false, 14, null);
    }

    public final void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305539n.m61380xe56ce956(), "updateRequestingData " + z17 + ' ' + this);
        this.f305536h.set(z17);
    }

    @Override // dn.n
    public void f(java.lang.String mediaId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305539n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "FTPP.onProgress() offset=" + j17 + " total=" + j18 + ' ' + this);
        c15188xd8bd4bd.f212184e2 = java.lang.Math.max(c15188xd8bd4bd.f212184e2, j17);
        cu2.x.f303982a.n(mediaId, j17, j18, (j17 == 0 || j17 != j18) ? 1 : 3);
        b();
        if (c15188xd8bd4bd.isViewFocused) {
            so2.i3 i3Var = this.f305535g;
            if (i3Var.f68994xfd4dbd97 + i3Var.f68967xa78549dc > 0) {
                c15188xd8bd4bd.mo56686xe906e26b();
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6217x9fc60304 c6217x9fc60304 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6217x9fc60304();
                c6217x9fc60304.f136466g.getClass();
                c6217x9fc60304.e();
            }
        }
        cw2.eb downloadCallback = c15188xd8bd4bd.getDownloadCallback();
        if (downloadCallback != null) {
            downloadCallback.c((int) j17, (int) j18, this.f305533e.f305631e);
        }
    }

    @Override // dn.n
    public void g(java.lang.String mediaId, int i17, dn.h sceneResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneResult, "sceneResult");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305539n.m61380xe56ce956(), "FTPP.onFinish mediaId=" + mediaId + " ret=" + i17 + " recvedBytes=" + sceneResult.f69548xe026fea1 + " fileLength=" + sceneResult.f69523x17c343e7 + "  finderformat:" + java.lang.Integer.valueOf(sceneResult.f69571x9373c88d));
        cu2.x xVar = cu2.x.f303982a;
        java.lang.String profile = sceneResult.f323311m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(profile, "profile");
        xVar.l(mediaId, profile);
        pm0.v.X(new cw2.r6(this.f305539n, i17, mediaId, sceneResult, this));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getContentType */
    public java.lang.String mo103118xc2a49a1d(int i17, java.lang.String str, java.lang.String str2) {
        boolean z17 = false;
        if (str != null && r26.i0.n(str, ".m3u8", true)) {
            z17 = true;
        }
        java.lang.String str3 = z17 ? "application/vnd.apple.mpegurl" : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54280xf59ed10d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305539n.m61380xe56ce956(), "getContentType() taskId:" + i17 + ", fileKey:" + str2 + " contentType:" + str3);
        return str3;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataFilePath */
    public java.lang.String mo103119x84354c01(int i17, java.lang.String str, java.lang.String str2) {
        cw2.wa waVar = this.f305533e;
        java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(waVar.f305628b, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305539n.m61380xe56ce956(), "getDataFilePath(), taskId:" + i17 + " fileKey:" + str2 + " dataFilePath:" + i18 + " isExists:" + com.p314xaae8f345.mm.vfs.w6.j(i18) + " mediaInfoPath:" + waVar.f305628b);
        return i18;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataTotalSize */
    public long mo103120x2f5bd925(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305539n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "getDataTotalSize() taskId:" + i17 + ", fileKey:" + str2 + " dataTotalSize:" + this.f305535g.f68989x78351860 + ' ');
        long j17 = this.f305535g.f68989x78351860;
        c15188xd8bd4bd.f212182d2 = j17;
        return j17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.AbstractC26467x83ec0ba3, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getM3U8Content */
    public java.lang.String mo103114x79c2649a(int i17, java.lang.String str, java.lang.String str2) {
        java.util.HashSet hashSet = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.f212174g2;
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.f212175h2;
        java.lang.String str3 = this.f305532d;
        boolean containsKey = hashMap.containsKey(str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305539n.m61380xe56ce956(), "getM3U8Content() taskId:" + i17 + ", fileKey:" + str2 + " contains:" + containsKey);
        java.lang.String str4 = (java.lang.String) hashMap.get(str3);
        return str4 == null ? this.f305538m : str4;
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String mediaId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        c(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305539n;
        c15188xd8bd4bd.f212184e2 = java.lang.Math.max(c15188xd8bd4bd.f212184e2, j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "FTPP.onDataAvailable() offset=" + j17 + " length=" + j18 + ' ' + this + '}');
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String mediaId, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305539n.m61380xe56ce956(), "onM3U8Ready m3u8:" + str);
        if (str == null) {
            str = "";
        }
        this.f305538m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    @Override // dn.n
    /* renamed from: onMoovReady */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo65708xe7d268fb(java.lang.String r8, long r9, long r11, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.s6.mo65708xe7d268fb(java.lang.String, long, long, com.tencent.mars.cdn.CdnManager$VideoInfo):void");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onReadData */
    public int mo103121x715d255f(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
        fw2.a m61370xe56ccd00;
        java.lang.String str3;
        java.lang.String str4;
        long j19;
        long j27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd;
        long j28;
        long j29;
        fw2.a m61370xe56ccd002;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2;
        long j37;
        fw2.a m61370xe56ccd003;
        java.lang.String str5;
        long j38;
        long j39;
        fw2.a m61370xe56ccd004;
        fw2.a m61370xe56ccd005;
        kw2.a m61369x69d78610;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd3 = this.f305539n;
        c15188xd8bd4bd3.m61426x9c3efec0(j17);
        c15188xd8bd4bd3.f212180c2 = j18;
        if (!c15188xd8bd4bd3.U.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c15188xd8bd4bd3.m61380xe56ce956(), "notifyDataReady taskId:" + i17 + ", return for downloader never start. requestOffset:" + j17 + " requestLength:" + j18 + ' ' + this);
            m61369x69d78610 = c15188xd8bd4bd3.m61369x69d78610();
            if (!m61369x69d78610.f394396a) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1505L, 249L, 1L);
                m61369x69d78610.f394396a = true;
            }
        } else {
            if (!c15188xd8bd4bd3.V() || j17 <= this.f305535g.f68968x799e9d9e) {
                boolean A0 = this.f305535g.A0();
                java.lang.String str6 = this.f305532d;
                if (A0) {
                    str4 = str6;
                    str3 = " requestLength:";
                    j27 = j18;
                    j19 = 0;
                } else {
                    long[] jArr = new long[2];
                    int m37760xcac8ee98 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37760xcac8ee98(str6, j17, jArr);
                    if (m37760xcac8ee98 == 0) {
                        long j47 = jArr[0];
                        if (j47 != -1) {
                            if (j47 > j18) {
                                j47 = j18;
                            }
                            str3 = " requestLength:";
                            j27 = j47;
                            j19 = 0;
                            str4 = str6;
                        }
                    }
                    m61370xe56ccd00 = c15188xd8bd4bd3.m61370xe56ccd00();
                    java.lang.String m61380xe56ce956 = c15188xd8bd4bd3.m61380xe56ce956();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyDataReady taskId:");
                    sb6.append(i17);
                    str3 = " requestLength:";
                    sb6.append(" queryContinuousSize error, ret:");
                    sb6.append(m37760xcac8ee98);
                    sb6.append(" requestOffset:");
                    sb6.append(j17);
                    sb6.append(" continuousSize:");
                    str4 = str6;
                    sb6.append(jArr[0]);
                    sb6.append(" totalSize:");
                    sb6.append(jArr[1]);
                    sb6.append(' ');
                    sb6.append(this);
                    java.lang.String sb7 = sb6.toString();
                    m61370xe56ccd00.getClass();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (currentTimeMillis - m61370xe56ccd00.f348616a > 1000) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m61380xe56ce956, sb7);
                        m61370xe56ccd00.f348616a = currentTimeMillis;
                    }
                    j19 = 0;
                    j27 = 0;
                }
                if (j27 != j19) {
                    c15188xd8bd4bd = c15188xd8bd4bd3;
                    j28 = j17;
                    j29 = j27;
                    if (j28 + j29 != this.f305537i) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "notifyDataReady taskId:" + i17 + " returnLength:" + j29 + " fixRequest[offset:" + j28 + " length:" + j18 + "], originRequest[offset:" + j28 + " length:" + j18 + "] lastOnReadDataEnd:" + this.f305537i + ' ' + this);
                        c15188xd8bd4bd2 = c15188xd8bd4bd;
                        long j48 = j28 + j29;
                        this.f305537i = j48;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd4 = c15188xd8bd4bd2;
                        c15188xd8bd4bd4.f212184e2 = java.lang.Math.max(c15188xd8bd4bd4.f212184e2, j48);
                        j37 = j29;
                    } else {
                        m61370xe56ccd002 = c15188xd8bd4bd.m61370xe56ccd00();
                        java.lang.String m61380xe56ce9562 = c15188xd8bd4bd.m61380xe56ce956();
                        c15188xd8bd4bd2 = c15188xd8bd4bd;
                        java.lang.String str7 = "notifyDataReady taskId:" + i17 + " returnLength:" + j29 + " fixRequest[offset:" + j28 + " length:" + j18 + "],  originRequest[offset:" + j28 + " length:" + j18 + "] lastOnReadDataEnd:" + this.f305537i + ' ' + this;
                        m61370xe56ccd002.getClass();
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        if (currentTimeMillis2 - m61370xe56ccd002.f348618c > 1000) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m61380xe56ce9562, str7);
                            m61370xe56ccd002.f348618c = currentTimeMillis2;
                        }
                        long j482 = j28 + j29;
                        this.f305537i = j482;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd42 = c15188xd8bd4bd2;
                        c15188xd8bd4bd42.f212184e2 = java.lang.Math.max(c15188xd8bd4bd42.f212184e2, j482);
                        j37 = j29;
                    }
                } else if (!this.f305535g.f68982x84465715 || this.f305536h.get()) {
                    long j49 = j27;
                    c15188xd8bd4bd = c15188xd8bd4bd3;
                    j28 = j17;
                    m61370xe56ccd003 = c15188xd8bd4bd.m61370xe56ccd00();
                    java.lang.String m61380xe56ce9563 = c15188xd8bd4bd.m61380xe56ce956();
                    java.lang.String str8 = "notifyDataReady taskId:" + i17 + " returnLength:" + j49 + " fixRequest[offset:" + j28 + " length:" + j18 + "],  originRequest[offset:" + j28 + " length:" + j18 + "] " + this;
                    m61370xe56ccd003.getClass();
                    long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                    if (currentTimeMillis3 - m61370xe56ccd003.f348618c > 500) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m61380xe56ce9563, str8);
                        m61370xe56ccd003.f348618c = currentTimeMillis3;
                    }
                    j29 = j49;
                    c15188xd8bd4bd2 = c15188xd8bd4bd;
                    long j4822 = j28 + j29;
                    this.f305537i = j4822;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd422 = c15188xd8bd4bd2;
                    c15188xd8bd4bd422.f212184e2 = java.lang.Math.max(c15188xd8bd4bd422.f212184e2, j4822);
                    j37 = j29;
                } else {
                    long j57 = j17 + j18;
                    long j58 = this.f305535g.f68989x78351860;
                    if (j57 > j58) {
                        long j59 = j58 - j17;
                        java.lang.String m61380xe56ce9564 = c15188xd8bd4bd3.m61380xe56ce956();
                        str5 = "notifyDataReady taskId:";
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(str5);
                        sb8.append(i17);
                        sb8.append(" requestLength is valid, requestOffset:");
                        sb8.append(j17);
                        sb8.append(", requestLength:");
                        sb8.append(j59);
                        sb8.append(", totalSize:");
                        j38 = j27;
                        sb8.append(this.f305535g.f68989x78351860);
                        sb8.append(' ');
                        sb8.append(this);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m61380xe56ce9564, sb8.toString());
                        j39 = j59;
                    } else {
                        str5 = "notifyDataReady taskId:";
                        j38 = j27;
                        j39 = j18;
                    }
                    ek4.s Di = ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di();
                    Di.getClass();
                    java.lang.String mediaId = str4;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
                    if (Di.f335218a.containsKey(mediaId)) {
                        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                        java.lang.String str9 = str5;
                        long j66 = j39;
                        java.lang.String str10 = str3;
                        int f17 = ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di().f(this.f305532d, j17, j39, 3000, new cw2.q6(c15188xd8bd4bd3, i17, this, countDownLatch));
                        if (f17 == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd3.m61380xe56ce956(), str9 + i17 + " requestVideoData not in running id mediaId:" + mediaId);
                            c(false);
                            countDownLatch.countDown();
                        }
                        try {
                            countDownLatch.await(5L, java.util.concurrent.TimeUnit.SECONDS);
                        } catch (java.lang.Throwable unused) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c15188xd8bd4bd3.m61380xe56ce956(), str9 + i17 + " countdown timeout exception.");
                        }
                        java.lang.String m61380xe56ce9565 = c15188xd8bd4bd3.m61380xe56ce956();
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(str9);
                        sb9.append(i17);
                        sb9.append(" requestVideoData requestOffset:");
                        sb9.append(j17);
                        sb9.append(" requestLengthFix:");
                        sb9.append(j66);
                        sb9.append(str10);
                        j28 = j17;
                        sb9.append(j18);
                        sb9.append(" requestDataRet:");
                        sb9.append(f17);
                        sb9.append("  cacheSize:");
                        sb9.append(this.f305535g.f68968x799e9d9e);
                        sb9.append(' ');
                        sb9.append(this);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m61380xe56ce9565, sb9.toString());
                        c15188xd8bd4bd2 = c15188xd8bd4bd3;
                        j29 = j38;
                        long j48222 = j28 + j29;
                        this.f305537i = j48222;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd4222 = c15188xd8bd4bd2;
                        c15188xd8bd4bd4222.f212184e2 = java.lang.Math.max(c15188xd8bd4bd4222.f212184e2, j48222);
                        j37 = j29;
                    } else {
                        m61370xe56ccd004 = c15188xd8bd4bd3.m61370xe56ccd00();
                        java.lang.String m61380xe56ce9566 = c15188xd8bd4bd3.m61380xe56ce956();
                        java.lang.String str11 = str5 + i17 + " isMediaInRunningStreamTaskMap mediaId:" + mediaId;
                        m61370xe56ccd004.getClass();
                        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
                        if (currentTimeMillis4 - m61370xe56ccd004.f348619d > 500) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m61380xe56ce9566, str11);
                            m61370xe56ccd004.f348619d = currentTimeMillis4;
                        }
                        j29 = j38;
                        j37 = j29;
                    }
                }
                return (int) j37;
            }
            m61370xe56ccd005 = c15188xd8bd4bd3.m61370xe56ccd00();
            java.lang.String m61380xe56ce9567 = c15188xd8bd4bd3.m61380xe56ce956();
            java.lang.String str12 = "notifyDataReady taskId:" + i17 + " return for pause state. request[offset:" + j17 + " length:" + j18 + "] cacheSize:" + this.f305535g.f68968x799e9d9e + ' ' + this;
            m61370xe56ccd005.getClass();
            long currentTimeMillis5 = java.lang.System.currentTimeMillis();
            if (currentTimeMillis5 - m61370xe56ccd005.f348617b > 5000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m61380xe56ce9567, str12);
                m61370xe56ccd005.f348617b = currentTimeMillis5;
            }
        }
        j37 = 0;
        return (int) j37;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStartReadData */
    public int mo103122x6e58d43(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305539n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "onStartReadData() taskId:" + i17 + ", fileKey:" + str2 + ", requestStart:" + j17 + ", requestEnd:" + j18);
        kz2.a aVar = c15188xd8bd4bd.R;
        if (aVar != null) {
            aVar.c("onStartRead");
        }
        int i18 = this.f305534f;
        this.f305534f = i18 + 1;
        return i18;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStopReadData */
    public int mo103123xfb96d801(int i17, java.lang.String str, java.lang.String str2, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305539n.m61380xe56ce956(), "onStopReadData() taskId:" + i17 + ", fileName:" + str + ", requestId:" + i18);
        return this.f305534f;
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.lang.String m61380xe56ce956 = this.f305539n.m61380xe56ce956();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback() mediaId=");
        sb6.append(mediaId);
        sb6.append(" startRet=");
        sb6.append(i17);
        sb6.append(" finishedLength=");
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.f69496x83ec3dd) : null);
        sb6.append(" fileFormat=");
        sb6.append(hVar != null ? hVar.f69570xea0afd82 : null);
        sb6.append(' ');
        sb6.append(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m61380xe56ce956, sb6.toString());
        if (gVar != null) {
            if (!(i17 == 0 && gVar.f69496x83ec3dd > 0)) {
                gVar = null;
            }
            if (gVar != null) {
                long j17 = gVar.f69496x83ec3dd;
                long j18 = gVar.f69500x8ab84c59;
                this.f305535g = cu2.x.f303982a.n(mediaId, j17, j18, j17 >= j18 ? 3 : 1);
                b();
            }
        }
        if (hVar != null) {
            cu2.x xVar = cu2.x.f303982a;
            java.lang.String profile = hVar.f323311m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(profile, "profile");
            xVar.l(mediaId, profile);
        }
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m122923x9616526c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(this.f305539n) + " isMoovReady:" + this.f305535g.f68982x84465715 + " isRequestingData:" + this.f305536h.get() + " isFinish:" + this.f305535g.A0() + " total:" + this.f305535g.f68989x78351860 + " mediacache:" + this.f305535g.m164895x8cdac1b();
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }

    @Override // dn.l
    public void x(java.lang.String mediaId, dn.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.lang.String m61380xe56ce956 = this.f305539n.m61380xe56ce956();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onPreloadCompleted] mediaId=");
        sb6.append(mediaId);
        sb6.append(" Ret=");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.f69553xb5f54fe9) : null);
        sb6.append(" finishedLength=");
        sb6.append(hVar != null ? java.lang.Long.valueOf(hVar.f69548xe026fea1) : null);
        sb6.append(' ');
        sb6.append(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m61380xe56ce956, sb6.toString());
        ((c61.l7) i95.n0.c(c61.l7.class)).Uj().i(mediaId, hVar, "proxy#complete");
    }
}
