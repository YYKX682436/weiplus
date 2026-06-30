package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class u0 extends com.tencent.mm.plugin.appbrand.appstorage.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f76324d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f76325e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.f2 f76326f;

    public u0(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.appbrand.appstorage.t0 t0Var) {
        this.f76325e = str;
        java.lang.String o17 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)).o();
        this.f76324d = str3;
        this.f76326f = new com.tencent.mm.plugin.appbrand.appstorage.f2(o17, str2, str3, t0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public boolean accept(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return str.startsWith(this.f76324d);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 access(java.lang.String str) {
        return this.f76326f.a(str) == null ? com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS : com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01c0, code lost:
    
        if (r0 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c7, code lost:
    
        if (r0.h() >= 2) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ca, code lost:
    
        r0 = (java.lang.String) r0.a(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d4, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d6, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.LuggageBlobFileObjectManager", "createTempLocalFile appId %s, Null Or Nil fileFullPath");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01dc, code lost:
    
        if (r3 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01de, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.LuggageBlobFileObjectManager", "get buffer success");
        com.tencent.mm.vfs.w6.R(r0, ik1.f.a(r3));
        r3 = new com.tencent.mm.vfs.r6(r0);
        ((java.util.concurrent.ConcurrentHashMap) r5).put(r24, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01f6, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.LuggageBlobFileObjectManager", "get buffer fail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01fc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01fd, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.LuggageBlobFileObjectManager", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0204, code lost:
    
        r3 = new java.lang.Object[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0207, code lost:
    
        if (r0 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0209, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x020f, code lost:
    
        r3[0] = java.lang.Integer.valueOf(r0);
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.LuggageBlobFileObjectManager", "createTempLocalFile, no handler return correct info, attach.size = %d", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x020b, code lost:
    
        r0 = r0.h();
     */
    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.vfs.r6 getPrivateAbsoluteFile(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appstorage.u0.getPrivateAbsoluteFile(java.lang.String):com.tencent.mm.vfs.r6");
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void initialize() {
        if (com.tencent.mm.vfs.w6.u(this.f76325e)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Luggage.BlobFileSystem", "Initialization Failed");
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, ik1.b0 b0Var) {
        if (!accept(str)) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NOT_SUPPORTED;
        }
        java.nio.ByteBuffer a17 = this.f76326f.a(str);
        if (a17 == null) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        }
        b0Var.f291824a = a17;
        return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public void release() {
        com.tencent.mm.plugin.appbrand.appstorage.f2 f2Var = this.f76326f;
        ((java.util.concurrent.ConcurrentHashMap) f2Var.f76178h).clear();
        com.tencent.mm.vfs.w6.f(f2Var.f76171a);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 stat(java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat) {
        if (!accept(str)) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NOT_SUPPORTED;
        }
        if (this.f76326f.a(str) == null) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        }
        if (fileStructStat == null) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_OP_FAIL;
        }
        fileStructStat.st_mode = 33152;
        fileStructStat.st_size = r3.limit();
        return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, long j17, long j18, ik1.b0 b0Var) {
        if (!accept(str)) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_NOT_SUPPORTED;
        }
        java.nio.ByteBuffer a17 = this.f76326f.a(str);
        if (a17 == null) {
            return com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
        }
        int limit = a17.limit();
        if (j18 > 2147483647L) {
            j18 = limit - j17;
        }
        com.tencent.mm.plugin.appbrand.appstorage.j1 a18 = a(j17, j18, limit);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        if (a18 != j1Var) {
            return a18;
        }
        int i17 = (int) j18;
        byte[] bArr = new byte[i17];
        a17.get(bArr, (int) j17, i17);
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.BIG_ENDIAN);
        b0Var.f291824a = wrap;
        return j1Var;
    }
}
