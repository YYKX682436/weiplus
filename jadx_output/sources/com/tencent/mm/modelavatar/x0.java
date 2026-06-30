package com.tencent.mm.modelavatar;

/* loaded from: classes12.dex */
public class x0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f70556d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f70557e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f70558f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f70559g;

    /* renamed from: h, reason: collision with root package name */
    public final int f70560h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f70561i;

    /* renamed from: m, reason: collision with root package name */
    public int f70562m;

    /* renamed from: n, reason: collision with root package name */
    public int f70563n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f70564o;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.network.s f70566q;

    /* renamed from: p, reason: collision with root package name */
    public boolean f70565p = false;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.modelcdntran.q0 f70567r = new com.tencent.mm.modelavatar.w0(this);

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Boolean f70568s = null;

    /* JADX WARN: Can't wrap try/catch for region: R(37:11|(1:172)(1:15)|(2:16|17)|(6:169|(1:(1:27)(1:165))(1:(1:167)(1:168))|28|(29:38|39|40|(1:42)(2:157|(1:159)(2:160|(1:162)(1:163)))|43|44|45|46|(1:48)(2:148|(1:150)(2:151|(1:153)(1:154)))|49|(19:51|52|53|54|(2:126|(1:128)(1:(15:(1:(14:143|59|(1:61)(1:125)|(1:63)|64|(1:66)(1:124)|67|(1:69)|70|(1:72)|73|(1:75)(9:77|(3:119|(1:121)|(2:123|(2:35|36)(1:37)))(1:81)|82|83|84|86|87|(2:90|91)|89)|76|(0)(0))(1:142))(1:136)|137|59|(0)(0)|(0)|64|(0)(0)|67|(0)|70|(0)|73|(0)(0)|76|(0)(0))(1:132)))(1:57)|58|59|(0)(0)|(0)|64|(0)(0)|67|(0)|70|(0)|73|(0)(0)|76|(0)(0))|147|(0)|126|(0)(0)|58|59|(0)(0)|(0)|64|(0)(0)|67|(0)|70|(0)|73|(0)(0)|76|(0)(0))(1:32)|33|(0)(0))|24|(0)(0)|28|(1:30)|38|39|40|(0)(0)|43|44|45|46|(0)(0)|49|(0)|147|(0)|126|(0)(0)|58|59|(0)(0)|(0)|64|(0)(0)|67|(0)|70|(0)|73|(0)(0)|76|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(38:11|(1:172)(1:15)|16|17|(6:169|(1:(1:27)(1:165))(1:(1:167)(1:168))|28|(29:38|39|40|(1:42)(2:157|(1:159)(2:160|(1:162)(1:163)))|43|44|45|46|(1:48)(2:148|(1:150)(2:151|(1:153)(1:154)))|49|(19:51|52|53|54|(2:126|(1:128)(1:(15:(1:(14:143|59|(1:61)(1:125)|(1:63)|64|(1:66)(1:124)|67|(1:69)|70|(1:72)|73|(1:75)(9:77|(3:119|(1:121)|(2:123|(2:35|36)(1:37)))(1:81)|82|83|84|86|87|(2:90|91)|89)|76|(0)(0))(1:142))(1:136)|137|59|(0)(0)|(0)|64|(0)(0)|67|(0)|70|(0)|73|(0)(0)|76|(0)(0))(1:132)))(1:57)|58|59|(0)(0)|(0)|64|(0)(0)|67|(0)|70|(0)|73|(0)(0)|76|(0)(0))|147|(0)|126|(0)(0)|58|59|(0)(0)|(0)|64|(0)(0)|67|(0)|70|(0)|73|(0)(0)|76|(0)(0))(1:32)|33|(0)(0))|24|(0)(0)|28|(1:30)|38|39|40|(0)(0)|43|44|45|46|(0)(0)|49|(0)|147|(0)|126|(0)(0)|58|59|(0)(0)|(0)|64|(0)(0)|67|(0)|70|(0)|73|(0)(0)|76|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:77|(3:119|(1:121)|(2:123|(2:35|36)(1:37)))(1:81)|82|83|84|86|87|(2:90|91)|89) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x03a8, code lost:
    
        if (r4 != null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03aa, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03c1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03c2, code lost:
    
        if (r4 != null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03c7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03c4, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0374, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0375, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x037d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x037e, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x037a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x037b, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0377, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0378, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x037f, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadHDHeadImg", "open FileOutputStream fail");
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadHDHeadImg", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(r0));
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadHDHeadImg", "recycle bitmap:%s", r9.toString());
        r9.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03a6, code lost:
    
        r0 = 0 - fp.k.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c3 A[Catch: Exception -> 0x0230, TryCatch #0 {Exception -> 0x0230, blocks: (B:46:0x01a8, B:48:0x01b0, B:49:0x020b, B:51:0x0214, B:148:0x01c3, B:150:0x01cb, B:151:0x01de, B:153:0x01e6, B:154:0x01f9), top: B:45:0x01a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0150 A[Catch: Exception -> 0x01a4, TryCatch #10 {Exception -> 0x01a4, blocks: (B:40:0x0131, B:42:0x0139, B:157:0x0150, B:159:0x0158, B:160:0x016f, B:162:0x0177, B:163:0x018e), top: B:39:0x0131 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0139 A[Catch: Exception -> 0x01a4, TryCatch #10 {Exception -> 0x01a4, blocks: (B:40:0x0131, B:42:0x0139, B:157:0x0150, B:159:0x0158, B:160:0x016f, B:162:0x0177, B:163:0x018e), top: B:39:0x0131 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b0 A[Catch: Exception -> 0x0230, TryCatch #0 {Exception -> 0x0230, blocks: (B:46:0x01a8, B:48:0x01b0, B:49:0x020b, B:51:0x0214, B:148:0x01c3, B:150:0x01cb, B:151:0x01de, B:153:0x01e6, B:154:0x01f9), top: B:45:0x01a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0214 A[Catch: Exception -> 0x0230, TRY_LEAVE, TryCatch #0 {Exception -> 0x0230, blocks: (B:46:0x01a8, B:48:0x01b0, B:49:0x020b, B:51:0x0214, B:148:0x01c3, B:150:0x01cb, B:151:0x01de, B:153:0x01e6, B:154:0x01f9), top: B:45:0x01a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0233 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0304  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x0(int r18, java.lang.String r19, java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelavatar.x0.<init>(int, java.lang.String, java.lang.String, boolean):void");
    }

    public static void I(java.lang.String str) {
        try {
            androidx.exifinterface.media.ExifInterface exifInterface = new androidx.exifinterface.media.ExifInterface(str);
            exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE, null);
            exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE, null);
            exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF, null);
            exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF, null);
            exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LONGITUDE, null);
            exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LONGITUDE_REF, null);
            exifInterface.saveAttributes();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneUploadHDHeadImg", e17, "clearExif failed", new java.lang.Object[0]);
        }
    }

    public static int J() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.avatar.RepairerConfigAvatarHdResolutionUpgrade()) == 1 ? 2160 : 1620;
    }

    public static int K() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.avatar.RepairerConfigAvatarHdResolutionUpgrade()) == 1 ? 1440 : 1080;
    }

    public boolean H() {
        boolean booleanValue;
        java.lang.Boolean bool = this.f70568s;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("CdnUploadHeadImgSwitch", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadHDHeadImg", "DynamicConfig value %s", java.lang.Integer.valueOf(b17));
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(b17 == 1);
            this.f70568s = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        if (!booleanValue) {
            return false;
        }
        if (this.f70565p) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadHDHeadImg", "hasTryCdnUpload");
            return false;
        }
        this.f70565p = true;
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_NetSceneUploadHead";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uploadhead_");
        java.lang.String str = this.f70559g;
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        mVar.field_mediaId = sb7;
        java.lang.String str2 = this.f70557e;
        mVar.field_fullpath = str2;
        mVar.field_thumbpath = "";
        mVar.field_fileType = 20301;
        mVar.field_talker = "";
        mVar.field_priority = 2;
        mVar.field_needStorage = true;
        mVar.field_isStreamMedia = false;
        mVar.field_appType = 220;
        mVar.field_bzScene = 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadHDHeadImg", "start cdn upload task mediaId:%s, fullpath:%s", sb7, str2);
        if (((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ui(mVar, new java.lang.ref.WeakReference(this.f70567r)) != null) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadHDHeadImg", "cdntra addSendTask failed. imgHash:%s", str);
        return false;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void cancel() {
        super.cancel();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f70556d = u0Var;
        this.f70566q = sVar;
        java.lang.String str = this.f70557e;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadHDHeadImg", "imgPath is null or length = 0");
            return -1;
        }
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadHDHeadImg", "The img does not exist, imgPath = " + str);
            return -1;
        }
        if (this.f70562m == 0) {
            this.f70562m = (int) com.tencent.mm.vfs.w6.k(str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadHDHeadImg", "head total len:%s", java.lang.Integer.valueOf(this.f70562m));
        if (H()) {
            return 0;
        }
        byte[] N = com.tencent.mm.vfs.w6.N(str, this.f70563n, java.lang.Math.min(this.f70562m - this.f70563n, 8192));
        if (N == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadHDHeadImg", "readFromFile error");
            return -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadHDHeadImg", "doScene uploadLen:%d, total: %d", java.lang.Integer.valueOf(N.length), java.lang.Integer.valueOf(this.f70562m));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.bu6();
        lVar.f70665b = new r45.cu6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/uploadhdheadimg";
        lVar.f70667d = 157;
        lVar.f70668e = 46;
        lVar.f70669f = 1000000046;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.bu6 bu6Var = (r45.bu6) a17.f70710a.f70684a;
        bu6Var.f371069d = this.f70562m;
        bu6Var.f371070e = this.f70563n;
        bu6Var.f371071f = this.f70560h;
        bu6Var.f371073h = this.f70559g;
        bu6Var.f371074i = this.f70561i;
        bu6Var.f371077o = com.tencent.mm.vfs.w6.p(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f70564o)) {
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(N);
            bu6Var.f371072g = cu5Var;
            bu6Var.f371078p = 0;
        } else {
            bu6Var.f371072g = new r45.cu5();
            bu6Var.f371076n = this.f70564o;
            bu6Var.f371078p = 1;
        }
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(fo3.s.INSTANCE.h());
            k57Var.f378396f = cu5Var2;
            r45.cu5 cu5Var3 = new r45.cu5();
            cu5Var3.d(k57Var.toByteArray());
            bu6Var.f371075m = cu5Var3;
        } catch (java.lang.Throwable unused) {
        }
        return dispatch(sVar, a17, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 157;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        boolean z17;
        java.lang.String str2 = this.f70558f;
        r45.cu6 cu6Var = (r45.cu6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 != 4 && i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadHDHeadImg", "errType:" + i18 + " errCode:" + i19);
            this.f70556d.onSceneEnd(i18, i19, str, this);
            return;
        }
        if (i18 == 4 || i18 == 5) {
            this.f70556d.onSceneEnd(i18, i19, str, this);
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadHDHeadImg", "ErrType:" + i18);
            return;
        }
        int retCode = v0Var.getRespObj().getRetCode();
        if (retCode == -4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadHDHeadImg", "retcode == %d", java.lang.Integer.valueOf(retCode));
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadHDHeadImg", "handleCertainError");
            this.f70556d.onSceneEnd(i18, i19, str, this);
            return;
        }
        int i27 = cu6Var.f371844e;
        this.f70563n = i27;
        if (i27 < this.f70562m && com.tencent.mm.sdk.platformtools.t8.K0(cu6Var.f371846g)) {
            if (doScene(dispatcher(), this.f70556d) < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadHDHeadImg", "doScene again failed");
                this.f70556d.onSceneEnd(3, -1, "", this);
                return;
            }
            return;
        }
        try {
            com.tencent.mm.vfs.w6.w(this.f70557e, str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadHDHeadImg", "destPath:" + com.tencent.mm.vfs.w6.k(str2) + ":" + str2);
            gm0.j1.u().c().w(12297, cu6Var.f371845f);
            com.tencent.mm.modelavatar.z Ai = com.tencent.mm.modelavatar.d1.Ai();
            android.graphics.Bitmap i07 = com.tencent.mm.sdk.platformtools.x.i0(str2);
            java.lang.String str3 = this.f70561i;
            Ai.t(str3, i07);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
                r0Var.f70529a = str3;
                r0Var.f70534f = 1;
                r0Var.f70530b = 3;
                r0Var.f70537i = 34;
                com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
            }
            this.f70556d.onSceneEnd(i18, i19, str, this);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadHDHeadImg", "rename temp file failed :" + e17.getMessage());
            this.f70556d.onSceneEnd(3, -1, "", this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 200;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        java.lang.String str = this.f70557e;
        return (str == null || str.length() == 0) ? com.tencent.mm.modelbase.o1.EFailed : com.tencent.mm.modelbase.o1.EOk;
    }
}
