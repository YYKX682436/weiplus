package com.tencent.mm.network;

/* loaded from: classes7.dex */
public class j2 implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback, com.tencent.mm.network.i2 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f72037c;

    /* renamed from: g, reason: collision with root package name */
    public final int f72041g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f72042h;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f72044j;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f72046l;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mars.cdn.CronetLogic.CronetTaskCallback f72048n;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f72051q;

    /* renamed from: a, reason: collision with root package name */
    public boolean f72035a = false;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f72036b = "";

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f72038d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f72039e = 5000;

    /* renamed from: f, reason: collision with root package name */
    public int f72040f = 5000;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f72043i = "GET";

    /* renamed from: k, reason: collision with root package name */
    public boolean f72045k = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f72047m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f72049o = 8;

    /* renamed from: p, reason: collision with root package name */
    public int f72050p = -1;

    /* renamed from: r, reason: collision with root package name */
    public java.util.Map f72052r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public int f72053s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f72054t = false;

    public j2(java.lang.String str, int i17) {
        this.f72037c = str;
        this.f72041g = i17;
    }

    public void a() {
        if ("".equals(this.f72036b) && this.f72049o == 2) {
            b();
        }
    }

    public final synchronized void b() {
        com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult startCronetHttpTask;
        com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams = new com.tencent.mars.cdn.CronetLogic.CronetRequestParams();
        cronetRequestParams.url = this.f72037c;
        cronetRequestParams.followRedirect = false;
        cronetRequestParams.bodyData = this.f72044j;
        cronetRequestParams.method = this.f72043i;
        cronetRequestParams.useMemoryCache = this.f72045k;
        cronetRequestParams.useHttp2 = this.f72047m;
        cronetRequestParams.useQuic = false;
        cronetRequestParams.makeRequestHeader(this.f72038d);
        cronetRequestParams.taskType = this.f72049o;
        if (this.f72053s != 0) {
            com.tencent.mars.cdn.CronetLogic.DefaultHttpTaskParams defaultHttpTaskParams = new com.tencent.mars.cdn.CronetLogic.DefaultHttpTaskParams();
            cronetRequestParams.defaultHttpTaskParams = defaultHttpTaskParams;
            defaultHttpTaskParams.reportId = this.f72053s;
        }
        int i17 = this.f72049o;
        if (i17 == 1) {
            startCronetHttpTask = com.tencent.mars.cdn.CronetLogic.startCronetHttpTask(cronetRequestParams, this);
        } else if (i17 != 2) {
            cronetRequestParams.dnsType = this.f72054t ? 2 : 0;
            startCronetHttpTask = com.tencent.mars.cdn.CronetLogic.startCronetDefaultHttpTask(cronetRequestParams, this);
        } else {
            cronetRequestParams.savePath = this.f72046l;
            cronetRequestParams.needWriteLocal = true;
            startCronetHttpTask = com.tencent.mars.cdn.CronetLogic.startCronetDownloadTask(cronetRequestParams, this);
        }
        this.f72036b = startCronetHttpTask.taskId;
        try {
            wait(this.f72039e + this.f72040f);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CronetConnect", "createAndStartCronetRequest " + e17.getLocalizedMessage());
        }
        if (!this.f72035a) {
            com.tencent.mars.cdn.CronetLogic.cancelCronetTask(this.f72036b);
        }
        p();
    }

    public int c() {
        long j17;
        java.lang.String i17 = i("content-length");
        if (i17 == null) {
            return -1;
        }
        try {
            j17 = java.lang.Long.parseLong(i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CronetConnect", "getContentLength content-length " + e17.getLocalizedMessage());
            j17 = -1;
        }
        if (j17 > 2147483647L) {
            return -1;
        }
        return (int) j17;
    }

    @Override // com.tencent.mm.network.i2
    public void d(java.lang.String str) {
        ((java.util.HashMap) this.f72038d).put("Referer", str);
    }

    @Override // com.tencent.mm.network.i2
    public void disconnect() {
    }

    @Override // com.tencent.mm.network.i2
    public java.lang.String e() {
        return i("content-type");
    }

    @Override // com.tencent.mm.network.i2
    public int f() {
        int i17;
        if (this.f72035a && (i17 = this.f72050p) != -1) {
            return i17;
        }
        if ("".equals(this.f72036b)) {
            b();
        }
        return this.f72050p;
    }

    @Override // com.tencent.mm.network.i2
    public void g(int i17) {
        this.f72039e = i17;
    }

    @Override // com.tencent.mm.network.i2
    public java.io.InputStream getInputStream() {
        return new java.io.ByteArrayInputStream(this.f72051q);
    }

    @Override // com.tencent.mm.network.i2
    public void h(java.lang.String str, java.lang.String str2) {
        ((java.util.HashMap) this.f72038d).put(str, str2);
    }

    @Override // com.tencent.mm.network.i2
    public java.lang.String i(java.lang.String str) {
        if (str.isEmpty()) {
            return "";
        }
        java.util.List list = (java.util.List) this.f72052r.get(str.toLowerCase());
        if (list == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CronetConnect", "getHeaderField %s is null", str);
            return "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CronetConnect", "getHeaderField field %s, value %s ", str, list.get(0));
        return (java.lang.String) list.get(0);
    }

    @Override // com.tencent.mm.network.i2
    public void j(boolean z17) {
        this.f72045k = z17;
    }

    @Override // com.tencent.mm.network.i2
    public void k(int i17) {
        this.f72040f = i17;
    }

    public java.lang.String l() {
        return this.f72042h;
    }

    public int m() {
        return this.f72041g;
    }

    public int n(java.lang.String str, int i17) {
        try {
            return java.lang.Integer.parseInt(i(str));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CronetConnect", "getHeaderFieldInt field " + str + " " + e17.getLocalizedMessage());
            return i17;
        }
    }

    public java.util.Map o() {
        return this.f72052r;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveChunkedData(com.tencent.mars.cdn.CronetLogic.ChunkedData chunkedData, long j17) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public int onCronetReceiveHeader(com.tencent.mars.cdn.CronetLogic.ResponseHeader responseHeader, int i17, java.lang.String str) {
        if (this.f72048n == null) {
            return 0;
        }
        this.f72052r = com.tencent.mars.cdn.CronetLogic.getHeaderList(responseHeader);
        return this.f72048n.onCronetReceiveHeader(responseHeader, i17, str);
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveUploadProgress(long j17, long j18) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetTaskCompleted(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CronetConnect", "receive callback, status %d, error %d, msg %s, quic %b http2 %b newdns %d", java.lang.Integer.valueOf(cronetTaskResult.statusCode), java.lang.Integer.valueOf(cronetTaskResult.errorCode), cronetTaskResult.errorMsg, java.lang.Boolean.valueOf(cronetTaskResult.useQuic), java.lang.Boolean.valueOf(cronetTaskResult.useHttp2), java.lang.Integer.valueOf(cronetTaskResult.dnsType));
        synchronized (this) {
            this.f72035a = true;
            this.f72050p = cronetTaskResult.statusCode;
            this.f72051q = cronetTaskResult.data;
            this.f72052r = cronetTaskResult.getHeaderMapList();
            notify();
        }
        com.tencent.mars.cdn.CronetLogic.CronetTaskCallback cronetTaskCallback = this.f72048n;
        if (cronetTaskCallback != null) {
            cronetTaskCallback.onCronetTaskCompleted(str, cronetTaskResult, str2);
        }
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
        com.tencent.mars.cdn.CronetLogic.CronetTaskCallback cronetTaskCallback = this.f72048n;
        if (cronetTaskCallback != null) {
            cronetTaskCallback.onDownloadProgressChanged(str, cronetDownloadProgress);
        }
    }

    public final void p() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(this.f72052r);
        this.f72052r.clear();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (entry != null && entry.getKey() != null) {
                this.f72052r.put(((java.lang.String) entry.getKey()).toLowerCase(), (java.util.List) entry.getValue());
            }
        }
    }

    public void q(int i17) {
        this.f72053s = i17;
    }

    public void r(java.lang.String str) {
        this.f72043i = str;
    }

    public void s(boolean z17) {
        this.f72054t = z17;
    }
}
