package vl3;

/* loaded from: classes13.dex */
public class a implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61 {

    /* renamed from: a, reason: collision with root package name */
    public gl3.a f519403a;

    /* renamed from: b, reason: collision with root package name */
    public long f519404b = -1;

    /* renamed from: c, reason: collision with root package name */
    public java.net.URL f519405c = null;

    /* renamed from: d, reason: collision with root package name */
    public java.net.URL f519406d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f519407e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.net.HttpURLConnection f519408f = null;

    /* renamed from: g, reason: collision with root package name */
    public long f519409g = -1;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f519410h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.io.InputStream f519411i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f519412j = true;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f519413k = new byte[1];

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f519414l;

    public a(java.util.Map map) {
        this.f519414l = map;
    }

    public java.lang.String a() {
        return this.f519406d.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0219, code lost:
    
        r17.f519405c = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0225 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00f4 A[Catch: IOException -> 0x023e, TRY_LEAVE, TryCatch #3 {IOException -> 0x023e, blocks: (B:131:0x003c, B:10:0x004f, B:12:0x0079, B:13:0x0082, B:15:0x0088, B:18:0x00a5, B:29:0x00b8, B:31:0x00d7, B:32:0x00dc, B:34:0x00ea, B:124:0x00f4, B:9:0x0047), top: B:130:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0079 A[Catch: IOException -> 0x023e, TryCatch #3 {IOException -> 0x023e, blocks: (B:131:0x003c, B:10:0x004f, B:12:0x0079, B:13:0x0082, B:15:0x0088, B:18:0x00a5, B:29:0x00b8, B:31:0x00d7, B:32:0x00dc, B:34:0x00ea, B:124:0x00f4, B:9:0x0047), top: B:130:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8 A[Catch: IOException -> 0x023e, TryCatch #3 {IOException -> 0x023e, blocks: (B:131:0x003c, B:10:0x004f, B:12:0x0079, B:13:0x0082, B:15:0x0088, B:18:0x00a5, B:29:0x00b8, B:31:0x00d7, B:32:0x00dc, B:34:0x00ea, B:124:0x00f4, B:9:0x0047), top: B:130:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7 A[Catch: IOException -> 0x023e, TryCatch #3 {IOException -> 0x023e, blocks: (B:131:0x003c, B:10:0x004f, B:12:0x0079, B:13:0x0082, B:15:0x0088, B:18:0x00a5, B:29:0x00b8, B:31:0x00d7, B:32:0x00dc, B:34:0x00ea, B:124:0x00f4, B:9:0x0047), top: B:130:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea A[Catch: IOException -> 0x023e, TryCatch #3 {IOException -> 0x023e, blocks: (B:131:0x003c, B:10:0x004f, B:12:0x0079, B:13:0x0082, B:15:0x0088, B:18:0x00a5, B:29:0x00b8, B:31:0x00d7, B:32:0x00dc, B:34:0x00ea, B:124:0x00f4, B:9:0x0047), top: B:130:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019a A[Catch: IOException -> 0x023c, TRY_LEAVE, TryCatch #4 {IOException -> 0x023c, blocks: (B:45:0x010a, B:47:0x010e, B:50:0x011a, B:52:0x0128, B:54:0x0130, B:58:0x013e, B:61:0x015a, B:63:0x0162, B:67:0x0178, B:68:0x017d, B:70:0x017e, B:74:0x0149, B:76:0x0151, B:77:0x018e, B:78:0x0193, B:80:0x0194, B:82:0x019a, B:85:0x01a4, B:87:0x01ac, B:91:0x01b5, B:92:0x01ba, B:93:0x01bb, B:95:0x01c5, B:97:0x01d8, B:101:0x01e5, B:102:0x01ec, B:103:0x01ed, B:108:0x020f, B:109:0x0216, B:111:0x0219, B:116:0x021f, B:117:0x0224, B:119:0x0225, B:120:0x023b), top: B:79:0x0194 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047 A[Catch: IOException -> 0x023e, TryCatch #3 {IOException -> 0x023e, blocks: (B:131:0x003c, B:10:0x004f, B:12:0x0079, B:13:0x0082, B:15:0x0088, B:18:0x00a5, B:29:0x00b8, B:31:0x00d7, B:32:0x00dc, B:34:0x00ea, B:124:0x00f4, B:9:0x0047), top: B:130:0x003c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r18) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vl3.a.b(long):void");
    }

    public final void c() {
        java.io.InputStream inputStream = this.f519411i;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMMediaHTTPConnection", e17, "teardownConnection", new java.lang.Object[0]);
            }
            this.f519411i = null;
        }
        java.net.HttpURLConnection httpURLConnection = this.f519408f;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.getInputStream().close();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMediaHTTPConnection", e18.getMessage());
            }
            this.f519408f.disconnect();
            this.f519408f = null;
            this.f519404b = -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61
    /* renamed from: connect */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo94091x38b478ea(java.net.URL r20, java.util.Map r21) {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vl3.a.mo94091x38b478ea(java.net.URL, java.util.Map):boolean");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61
    /* renamed from: disconnect */
    public void mo94092x1f9d589c() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i("MicroMsg.Music.MMMediaHTTPConnection", "disconnect");
        c();
        this.f519407e = null;
        this.f519405c = null;
        gl3.a aVar = this.f519403a;
        if (aVar != null) {
            aVar.b();
            aVar.f354344b.d();
            gl3.i iVar = aVar.f354345c;
            synchronized (iVar) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i("MicroMsg.Music.PieceFileCache", "close");
                java.io.RandomAccessFile randomAccessFile = iVar.f354373a;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Music.PieceFileCache", "close RandomAccessFile error ", "" + e17.getMessage());
                    }
                }
            }
            aVar.f354343a = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.FileBytesCacheMgr", "detach()");
            this.f519403a = null;
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61
    /* renamed from: getMIMEType */
    public java.lang.String mo94093x53babee4() {
        java.lang.String str;
        if (!android.text.TextUtils.isEmpty(this.f519410h)) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i("MicroMsg.Music.MMMediaHTTPConnection", "getMIMEType mimeType:" + this.f519410h);
            return this.f519410h;
        }
        java.lang.String a17 = a();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = gl3.h.f354369f;
        java.lang.String str2 = r2Var.k(a17) ? (java.lang.String) r2Var.get(a17) : null;
        if (!android.text.TextUtils.isEmpty(str2)) {
            this.f519410h = str2;
            return str2;
        }
        if (this.f519408f == null) {
            try {
                java.lang.System.currentTimeMillis();
                b(0L);
                str = this.f519408f.getContentType();
                java.lang.System.currentTimeMillis();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Music.MMMediaHTTPConnection", "getMIMEType exception:%s", "" + e17);
                str = "";
            }
        } else {
            java.lang.System.currentTimeMillis();
            str = this.f519408f.getContentType();
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i("MicroMsg.Music.MMMediaHTTPConnection", "getMIMEType mimeType:" + str);
            java.lang.System.currentTimeMillis();
        }
        this.f519410h = str;
        if (!android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.lang.String c17 = gl3.h.c(a());
        this.f519410h = c17;
        return !android.text.TextUtils.isEmpty(c17) ? c17 : "application/octet-stream";
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61
    /* renamed from: getSize */
    public long mo94094xfb854877() {
        long j17 = this.f519409g;
        if (j17 > 0) {
            return j17;
        }
        java.lang.String a17 = a();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = gl3.h.f354368e;
        if ((r2Var.k(a17) ? ((java.lang.Long) r2Var.get(a17)).longValue() : -1L) > 0) {
            java.lang.String a18 = a();
            long longValue = r2Var.k(a18) ? ((java.lang.Long) r2Var.get(a18)).longValue() : -1L;
            this.f519409g = longValue;
            return longValue;
        }
        if (this.f519408f == null) {
            try {
                java.lang.System.currentTimeMillis();
                b(0L);
                java.lang.System.currentTimeMillis();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Music.MMMediaHTTPConnection", "getSize exception:%s", "" + e17);
                this.f519409g = -1L;
            }
        }
        long j18 = this.f519409g;
        if (j18 > 0) {
            return j18;
        }
        if (gl3.i.c(a()) <= 0) {
            return -1L;
        }
        long c17 = gl3.i.c(a());
        this.f519409g = c17;
        return c17;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61
    /* renamed from: getUri */
    public java.lang.String mo94095xb5887636() {
        return this.f519405c.toString();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25396xa9fd0b61
    /* renamed from: readAt */
    public int mo94096xc8455469(long j17, byte[] bArr, int i17, int i18) {
        gl3.a aVar;
        int f17;
        if (i18 > this.f519413k.length) {
            this.f519413k = new byte[i18];
        }
        byte[] bArr2 = this.f519413k;
        int i19 = 0;
        java.util.Arrays.fill(bArr2, 0, bArr2.length, (byte) 0);
        try {
            if (!gl3.h.d(this.f519406d.toString()) && (aVar = this.f519403a) != null && (f17 = aVar.f(this.f519413k, (int) j17, i18)) > 0) {
                if (f17 != i18) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i("MicroMsg.Music.MMMediaHTTPConnection", "read from cache, n%d, size %d " + f17 + "," + i18);
                }
                java.lang.System.arraycopy(this.f519413k, 0, bArr, i17, f17);
                return f17;
            }
            long j18 = this.f519409g;
            if (j18 > 0 && j17 >= j18 && i18 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMediaHTTPConnection", "offset is illegal, mTotalSize:%d, offset:%d, size:%d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
                return 0;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d("MicroMsg.Music.MMMediaHTTPConnection", "read from network");
            if (j17 != this.f519404b) {
                b(j17);
            }
            int read = this.f519411i.read(this.f519413k, 0, i18);
            if (read != -1) {
                java.lang.System.arraycopy(this.f519413k, 0, bArr, i17, read);
                i19 = read;
            }
            this.f519404b += i19;
            gl3.a aVar2 = this.f519403a;
            if (aVar2 != null) {
                aVar2.h(this.f519413k, (int) j17, i19);
            }
            return i19;
        } catch (java.net.NoRouteToHostException e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Music.MMMediaHTTPConnection", "readAt " + j17 + " / " + i18 + " => " + e17);
            gl3.h.e(this.f519406d.toString(), 751);
            c();
            return -1010;
        } catch (java.net.ProtocolException e18) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Music.MMMediaHTTPConnection", "readAt " + j17 + " / " + i18 + " => " + e18);
            gl3.h.e(this.f519406d.toString(), 750);
            c();
            return -1010;
        } catch (java.net.UnknownServiceException e19) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Music.MMMediaHTTPConnection", "readAt " + j17 + " / " + i18 + " => " + e19);
            gl3.h.e(this.f519406d.toString(), 752);
            c();
            return -1010;
        } catch (java.io.IOException e27) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Music.MMMediaHTTPConnection", "readAt " + j17 + " / " + i18 + " => -1 " + e27);
            gl3.h.e(this.f519406d.toString(), 753);
            c();
            return -1;
        } catch (java.lang.Exception e28) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Music.MMMediaHTTPConnection", "unknown exception " + e28);
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e("MicroMsg.Music.MMMediaHTTPConnection", "readAt " + j17 + " / " + i18 + " => -1");
            gl3.h.e(this.f519406d.toString(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t0.f34879x366c91de);
            c();
            return -1;
        }
    }
}
