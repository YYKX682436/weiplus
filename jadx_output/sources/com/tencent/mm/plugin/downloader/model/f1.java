package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class f1 extends com.tencent.mm.plugin.downloader.model.z0 {

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f97029c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f97030d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f97031e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f97032f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f97033g;

    /* renamed from: h, reason: collision with root package name */
    public final dn.k f97034h;

    public f1(com.tencent.mm.plugin.downloader.model.l0 l0Var) {
        super(l0Var);
        this.f97031e = com.tencent.mm.vfs.q7.c("HotPatchDownload");
        this.f97032f = new java.lang.Object();
        this.f97033g = true;
        this.f97034h = new com.tencent.mm.plugin.downloader.model.e1(this);
        this.f97029c = com.tencent.mm.sdk.platformtools.x2.f193071a;
        this.f97030d = new java.util.HashMap();
    }

    public static void g(com.tencent.mm.plugin.downloader.model.f1 f1Var, java.lang.String str, int i17, int i18, java.lang.String str2) {
        f1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FileWebNetDownloader", "updateDownloadState, url = %s, state = %d, errCode= %d, errMsg = %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
        h02.a f17 = com.tencent.mm.plugin.downloader.model.m0.f(str);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileWebNetDownloader", "updateDownloadState, info is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileWebNetDownloader", "updateDownloadState, url = %s, state = %d, errCode = %d, errMsg = %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
        if (i17 == 3) {
            synchronized (f1Var.f97032f) {
                f1Var.f97033g = false;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96957n, 1);
            intent.setClass(f1Var.f97029c, com.tencent.mm.plugin.downloader.model.FileDownloadService.class);
            intent.putExtra(com.tencent.mm.plugin.downloader.model.FileDownloadService.f96956m, f17.field_downloadId);
            try {
                j45.l.A(intent);
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileWebNetDownloader", e17.getMessage());
                return;
            }
        }
        if (i17 != 4) {
            return;
        }
        if (i18 == -21009) {
            synchronized (f1Var.f97032f) {
                f1Var.f97033g = true;
            }
        }
        f17.field_errCode = java.lang.Math.abs(i18);
        f17.field_status = 4;
        com.tencent.mm.plugin.downloader.model.m0.l(f17);
        f1Var.f97212a.c(f17.field_downloadId, java.lang.Math.abs(i18), false);
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public boolean a(long j17) {
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null || c17.field_status != 2) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.downloader.model.d1(this, c17, j17));
        return true;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public long b(com.tencent.mm.plugin.downloader.model.t0 t0Var) {
        boolean z17;
        long currentTimeMillis;
        java.lang.String str;
        if (t0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(t0Var.f97150a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileWebNetDownloader", "Invalid Request");
            return -1L;
        }
        java.lang.String str2 = t0Var.f97150a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FileWebNetDownloader", "addDownloadTask: %s", str2);
        h02.a f17 = com.tencent.mm.plugin.downloader.model.m0.f(str2);
        if (f17 != null) {
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo d17 = d(f17.field_downloadId);
            com.tencent.mars.xlog.Log.i("MicroMsg.FileWebNetDownloader", "addDownloadTask, status = " + d17.f96963f);
            if (d17.f96963f == 1) {
                return d17.f96961d;
            }
        }
        com.tencent.mm.plugin.downloader.model.m0.k(str2);
        com.tencent.mm.plugin.downloader.model.m0.j(t0Var.f97156g);
        h02.a b17 = com.tencent.mm.plugin.downloader.model.u0.b(t0Var);
        synchronized (this.f97032f) {
            z17 = this.f97033g;
        }
        if (z17 && !h(this.f97031e)) {
            java.lang.String[] strArr = {"HotPatchDownload", "HotPatchDownload2", "HotPatchDownload3", "HotPatchDownload4", "HotPatchDownload5", "HotPatchDownload6", "HotPatchDownload7", "HotPatchDownload8", "HotPatchDownload9"};
            int i17 = 0;
            while (true) {
                if (i17 >= 9) {
                    str = null;
                    break;
                }
                str = com.tencent.mm.vfs.q7.c(strArr[i17]);
                if (h(str)) {
                    break;
                }
                i17++;
            }
            if (str != null) {
                this.f97031e = str;
                com.tencent.mars.xlog.Log.i("MicroMsg.FileWebNetDownloader", "found new available dir %s", str);
            }
        }
        try {
            currentTimeMillis = com.tencent.wcdb.core.Database.DictDefaultMatchValue & java.nio.ByteBuffer.wrap(java.security.MessageDigest.getInstance("SHA-256").digest(str2.getBytes(java.nio.charset.StandardCharsets.UTF_8))).getLong();
        } catch (java.security.NoSuchAlgorithmException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileWebNetDownloader", "Failed to get SHA-256 hash for URL: " + str2);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                currentTimeMillis = com.tencent.wcdb.core.Database.DictDefaultMatchValue & ((java.time.Instant.now().getEpochSecond() * 1000000) + (r9.getNano() / 1000));
            } else {
                currentTimeMillis = java.lang.System.currentTimeMillis();
            }
        }
        b17.field_downloadId = currentTimeMillis;
        b17.field_downloaderType = 4;
        java.lang.String str3 = this.f97031e + "/" + com.tencent.mm.plugin.downloader.model.z0.f(str2);
        b17.field_filePath = str3;
        if (f17 != null) {
            java.lang.String str4 = f17.field_filePath;
            if (str3 != null && str4 != null && !str3.equals(str4)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileWebNetDownloader", "removeLastFile, new File = %s, oldFile = %s", str3, str4);
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str4));
                if (r6Var.m()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FileWebNetDownloader", "Delete previous file result: %b", java.lang.Boolean.valueOf(r6Var.l()));
                }
            }
        }
        b17.field_startTime = java.lang.System.currentTimeMillis();
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_FileWebNetDownloader";
        mVar.f241811z = str2;
        mVar.field_mediaId = str2;
        mVar.f241809y0 = t0Var.C;
        int i18 = t0Var.f97155f;
        if (i18 == 2) {
            mVar.field_fileType = 30003;
            mVar.M = t0Var.B;
            mVar.A = 20;
            if (t0Var.f97174y) {
                mVar.B = 900;
            } else {
                mVar.B = 90;
            }
        } else if (i18 == 4) {
            mVar.field_fileType = com.tencent.mars.cdn.proto.FileType.FILETYPE_UDR_VALUE;
            mVar.M = t0Var.B;
            mVar.A = 240;
            if (t0Var.f97174y) {
                mVar.B = 900;
            } else {
                mVar.B = 120;
            }
            mVar.f241797p1 = 1;
            mVar.f241807x1 = 7;
        }
        mVar.field_fullpath = b17.field_filePath;
        mVar.f241787f = this.f97034h;
        b17.field_status = 1;
        com.tencent.mm.plugin.downloader.model.m0.a(b17);
        boolean wi6 = ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileWebNetDownloader", "addDownloadTask: " + wi6);
        if (wi6) {
            this.f97212a.i(b17.field_downloadId, b17.field_filePath);
        } else {
            b17.field_status = 4;
            b17.field_errCode = 201;
            com.tencent.mm.plugin.downloader.model.m0.a(b17);
            this.f97212a.c(b17.field_downloadId, b17.field_errCode, false);
        }
        return b17.field_downloadId;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public boolean c(long j17) {
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.downloader.model.c1(this, j17));
        return true;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo d(long j17) {
        int i17;
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo fileDownloadTaskInfo = new com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo();
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 != null) {
            com.tencent.mars.cdn.CdnManager cdnManager = (com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.cdn.CdnManager.class);
            com.tencent.mars.cdn.CdnManager.CdnTaskStateInfo httpMultiSocketDownloadTaskState = cdnManager != null ? cdnManager.httpMultiSocketDownloadTaskState(c17.field_downloadUrl) : null;
            int i18 = c17.field_status;
            if (i18 != 1 || (httpMultiSocketDownloadTaskState != null && ((i17 = httpMultiSocketDownloadTaskState.taskState) == 100 || i17 == 101))) {
                fileDownloadTaskInfo.f96963f = i18;
            } else {
                fileDownloadTaskInfo.f96963f = 0;
            }
            fileDownloadTaskInfo.f96967m = c17.field_downloadedSize;
            fileDownloadTaskInfo.f96968n = c17.field_totalSize;
            fileDownloadTaskInfo.f96961d = j17;
            fileDownloadTaskInfo.f96970p = c17.field_downloaderType;
            fileDownloadTaskInfo.f96969o = c17.field_autoDownload;
            fileDownloadTaskInfo.f96964g = c17.field_filePath;
            fileDownloadTaskInfo.f96962e = c17.field_downloadUrl;
            fileDownloadTaskInfo.f96965h = c17.field_md5;
            fileDownloadTaskInfo.f96973s = c17.field_userSessionId;
        }
        return fileDownloadTaskInfo;
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public long e(h02.a aVar) {
        return 0L;
    }

    public final boolean h(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m()) {
            if (!r6Var.s().m()) {
                com.tencent.mm.vfs.r6 s17 = r6Var.s();
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(s17.o() + java.lang.System.currentTimeMillis());
                if (!r6Var2.J()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FileWebNetDownloader", "mkdir parent error, %s", s17.o());
                    return false;
                }
                r6Var2.L(s17);
            }
            r6Var.J();
            if (r6Var.m()) {
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.FileWebNetDownloader", "Make download dir failed");
            return false;
        }
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(str, java.util.UUID.randomUUID().toString().replace("-", ""));
        java.lang.String o17 = r6Var3.o();
        com.tencent.mars.xlog.Log.i("MicroMsg.FileWebNetDownloader", "ensureDownloadDir, CREATE temp file %s", o17);
        try {
            boolean k17 = r6Var3.k();
            if (k17) {
                if (k17 && r6Var3.m()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FileWebNetDownloader", "DELETE temp file %s result: %b", o17, java.lang.Boolean.valueOf(r6Var3.l()));
                }
                return true;
            }
            if (k17 && r6Var3.m()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileWebNetDownloader", "DELETE temp file %s result: %b", o17, java.lang.Boolean.valueOf(r6Var3.l()));
            }
            return false;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileWebNetDownloader", "CREATE temp file error, %s %s", o17, e17.getMessage());
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.h1
    public int removeDownloadTask(long j17) {
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.downloader.model.b1(this, j17));
        return 1;
    }
}
