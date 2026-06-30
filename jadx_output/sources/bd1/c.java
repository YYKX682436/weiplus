package bd1;

/* loaded from: classes7.dex */
public class c implements gb1.m {

    /* renamed from: d, reason: collision with root package name */
    public final uh1.d0 f19238d;

    /* renamed from: f, reason: collision with root package name */
    public final gb1.a f19240f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19239e = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f19241g = new java.util.concurrent.atomic.AtomicBoolean(false);

    public c(uh1.d0 d0Var, gb1.a aVar) {
        this.f19238d = d0Var;
        this.f19240f = aVar;
    }

    @Override // gb1.m
    public java.lang.String a() {
        return "uploadTaskId";
    }

    public final void b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.BaseCreateUploadTask", "sendFailMsg, uploadTaskId = %s, errMsg = %s, errno = %d", str, str2, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("uploadTaskId", str);
        hashMap.put("state", "fail");
        hashMap.put("errno", java.lang.Integer.valueOf(i17));
        hashMap.put("errMsg", str2);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        bd1.b bVar = new bd1.b();
        bVar.p(lVar);
        bVar.r(jSONObject);
        bVar.n(this.f19240f.a(str));
    }

    @Override // gb1.m
    public void d(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, java.lang.String str) {
        uh1.a aVar;
        uh1.e0 a17;
        lVar.getAppId();
        if (!this.f19241g.getAndSet(true)) {
            if (this.f19238d != null) {
                lVar.getAppId();
                this.f19239e = com.tencent.mm.plugin.appbrand.vf.a(5);
            }
            if (this.f19239e) {
                uh1.a aVar2 = (uh1.a) lVar.b(uh1.a.class);
                fp.d0.o(org.chromium.net.impl.CronetLibraryLoader.libraryName());
                if (aVar2 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BaseCreateUploadTask", "setupRequestMode config not found, setUserCertVerify false appId(%s)", lVar.getAppId());
                    com.tencent.mars.cdn.CronetLogic.setUserCertVerify(false);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateUploadTask", "setupRequestMode(%b),appId(%s)", java.lang.Boolean.valueOf(aVar2.H), lVar.getAppId());
                    com.tencent.mars.cdn.CronetLogic.setUserCertVerify(aVar2.H);
                }
            }
        }
        java.lang.String appId = lVar.getAppId();
        java.lang.String optString = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            b(lVar, str, "filePath is null", 600005);
            return;
        }
        com.tencent.mm.vfs.r6 absoluteFile = lVar.getFileSystem().getAbsoluteFile(optString);
        if (absoluteFile == null || !absoluteFile.m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseCreateUploadTask", "upload appId(%s) tempFilePath(%s), found no real file", lVar.getAppId(), optString);
            b(lVar, str, "fail:file doesn't exist", 600005);
            return;
        }
        java.lang.String o17 = absoluteFile.o();
        java.lang.String c17 = q75.g.c(optString);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateUploadTask", "upload appId(%s) uploadTaskId(%s)", lVar.getAppId(), str);
        bd1.a aVar3 = new bd1.a(this, str, o17, lVar);
        uh1.a aVar4 = (uh1.a) lVar.b(uh1.a.class);
        java.util.Map g17 = uh1.j0.g(jSONObject, aVar4);
        java.lang.String optString2 = jSONObject.optString("url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateUploadTask", "url is null");
            b(lVar, str, "url is null or nil", 600005);
            return;
        }
        boolean z17 = jSONObject.optBoolean("__skipDomainCheck__") ? false : aVar4.f427740d;
        if (z17 && !uh1.j0.A(aVar4.f427751r, optString2, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateUploadTask", "not in domain url %s", optString2);
            b(lVar, str, "url not in domain list", 600002);
            return;
        }
        if (aVar4.f427747n <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateUploadTask", "concurrent <= 0 ");
        }
        int optInt = jSONObject.optInt("timeout", 0);
        if (optInt <= 0) {
            optInt = uh1.j0.n(aVar4, 2);
        }
        if (optInt <= 0) {
            optInt = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.h0.f427796b;
        uh1.h0 h0Var = uh1.g0.f427794a;
        if (h0Var.a(appId) == null) {
            aVar = aVar4;
            uh1.e0 e0Var = new uh1.e0(lVar, this.f19239e);
            java.util.HashMap hashMap = h0Var.f427797a;
            if (!hashMap.containsKey(appId)) {
                hashMap.put(appId, e0Var);
            }
            a17 = e0Var;
        } else {
            aVar = aVar4;
            a17 = h0Var.a(appId);
        }
        java.lang.String d17 = s46.c.d(optString);
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateUploadTask", "before do upload, checkDomains = %b, timeout %d, inputTimeout: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(jSONObject.optInt("timeout", 0)));
            if (z17) {
                a17.a(optInt, c17, o17, jSONObject, g17, aVar.f427751r, aVar3, str, bd1.d.NAME, d17);
            } else {
                a17.a(optInt, c17, o17, jSONObject, g17, null, aVar3, str, bd1.d.NAME, d17);
            }
        }
    }

    @Override // gb1.m
    public java.lang.String getTaskId() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.h0.f427796b;
        uh1.g0.f427794a.getClass();
        sb6.append(uh1.h0.f427796b.incrementAndGet());
        sb6.append("");
        return sb6.toString();
    }
}
