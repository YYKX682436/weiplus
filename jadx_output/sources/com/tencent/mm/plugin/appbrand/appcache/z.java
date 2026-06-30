package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class z extends org.chromium.net.apihelpers.ImplicitFlowControlCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.vfs.r6 f76079a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f76080b;

    /* renamed from: c, reason: collision with root package name */
    public org.chromium.net.apihelpers.CronetRequestCompletionListener f76081c;

    /* renamed from: d, reason: collision with root package name */
    public java.nio.channels.WritableByteChannel f76082d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f76083e;

    /* renamed from: f, reason: collision with root package name */
    public long f76084f;

    /* renamed from: g, reason: collision with root package name */
    public long f76085g;

    /* renamed from: h, reason: collision with root package name */
    public wu5.c f76086h;

    public z(com.tencent.mm.vfs.r6 filePath, boolean z17) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        this.f76079a = filePath;
        this.f76080b = z17;
    }

    public final void a() {
        try {
            java.nio.channels.WritableByteChannel writableByteChannel = this.f76082d;
            if (writableByteChannel != null) {
                writableByteChannel.close();
            }
            this.f76082d = null;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChromiumCronetDownloadCallback", "safeCloseChannel error", e17);
        }
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    public void onBodyChunkRead(org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer bodyChunk) {
        kotlin.jvm.internal.o.g(bodyChunk, "bodyChunk");
        this.f76085g += bodyChunk.remaining();
        java.nio.channels.WritableByteChannel writableByteChannel = this.f76082d;
        kotlin.jvm.internal.o.d(writableByteChannel);
        writableByteChannel.write(bodyChunk);
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    public void onCanceled(org.chromium.net.UrlResponseInfo urlResponseInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCanceled url=");
        sb6.append(urlResponseInfo != null ? urlResponseInfo.getUrl() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChromiumCronetDownloadCallback", sb6.toString());
        wu5.c cVar = this.f76086h;
        if (cVar != null) {
            cVar.cancel(false);
        }
        org.chromium.net.apihelpers.CronetRequestCompletionListener cronetRequestCompletionListener = this.f76081c;
        if (cronetRequestCompletionListener != null) {
            cronetRequestCompletionListener.onCanceled(urlResponseInfo);
        }
        a();
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    public void onFailed(org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
        if (com.tencent.mm.sdk.platformtools.s9.f192975c && cronetException != null) {
            throw cronetException;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFailed url=");
        sb6.append(urlResponseInfo != null ? urlResponseInfo.getUrl() : null);
        sb6.append(" statusCode=");
        sb6.append(urlResponseInfo != null ? java.lang.Integer.valueOf(urlResponseInfo.getHttpStatusCode()) : null);
        sb6.append(" exception=");
        sb6.append(cronetException);
        com.tencent.mars.xlog.Log.e("MicroMsg.ChromiumCronetDownloadCallback", sb6.toString());
        wu5.c cVar = this.f76086h;
        if (cVar != null) {
            cVar.cancel(false);
        }
        org.chromium.net.apihelpers.CronetRequestCompletionListener cronetRequestCompletionListener = this.f76081c;
        if (cronetRequestCompletionListener != null) {
            cronetRequestCompletionListener.onFailed(urlResponseInfo, cronetException);
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResponseStarted(org.chromium.net.UrlResponseInfo r10) {
        /*
            r9 = this;
            java.lang.String r0 = "info"
            kotlin.jvm.internal.o.g(r10, r0)
            yz5.p r0 = r9.f76083e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L61
            java.util.Map r0 = r10.getAllHeaders()
            java.lang.String r3 = "Content-Length"
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L30
            int r3 = r0.size()
            if (r3 == r2) goto L20
            goto L30
        L20:
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.NumberFormatException -> L30
            java.lang.String r3 = "get(...)"
            kotlin.jvm.internal.o.f(r0, r3)     // Catch: java.lang.NumberFormatException -> L30
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L30
            long r3 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L30
            goto L32
        L30:
            r3 = -1
        L32:
            r5 = 2147483639(0x7ffffff7, double:1.060997891E-314)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L3b
            r0 = r2
            goto L3c
        L3b:
            r0 = r1
        L3c:
            if (r0 == 0) goto L55
            r9.f76084f = r3
            ku5.u0 r0 = ku5.t0.f312615d
            com.tencent.mm.plugin.appbrand.appcache.y r4 = new com.tencent.mm.plugin.appbrand.appcache.y
            r4.<init>(r9)
            r5 = 0
            r7 = 1000(0x3e8, double:4.94E-321)
            r3 = r0
            ku5.t0 r3 = (ku5.t0) r3
            wu5.c r0 = r3.d(r4, r5, r7)
            r9.f76086h = r0
            goto L61
        L55:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The body is too large and wouldn't fit in a byte array!"
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L61:
            r10.getUrl()
            com.tencent.mm.vfs.r6 r10 = r9.f76079a
            com.tencent.mm.vfs.r6 r10 = r10.s()
            if (r10 == 0) goto L79
            boolean r0 = r10.m()
            if (r0 != 0) goto L79
            boolean r10 = r10.J()
            if (r10 == 0) goto L79
            r1 = r2
        L79:
            boolean r10 = r9.f76080b
            if (r10 != 0) goto L87
            com.tencent.mm.vfs.r6 r10 = r9.f76079a
            java.lang.String r10 = r10.o()
            boolean r2 = com.tencent.mm.vfs.w6.h(r10)
        L87:
            com.tencent.mm.vfs.r6 r10 = r9.f76079a
            java.lang.String r10 = r10.o()
            boolean r10 = com.tencent.mm.vfs.w6.e(r10)
            boolean r0 = r9.f76080b     // Catch: java.io.FileNotFoundException -> La2
            com.tencent.mm.vfs.r6 r3 = r9.f76079a     // Catch: java.io.FileNotFoundException -> La2
            com.tencent.mm.vfs.z7 r4 = r3.f213166d     // Catch: java.io.FileNotFoundException -> La2
            com.tencent.mm.vfs.z2 r3 = r3.M()     // Catch: java.io.FileNotFoundException -> La2
            java.nio.channels.WritableByteChannel r0 = com.tencent.mm.vfs.w6.L(r4, r3, r0)     // Catch: java.io.FileNotFoundException -> La2
            r9.f76082d = r0     // Catch: java.io.FileNotFoundException -> La2
            return
        La2:
            r0 = move-exception
            com.tencent.mm.vfs.r6 r3 = r9.f76079a
            java.lang.String r3 = r3.o()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r3, r1, r2, r10}
            java.lang.String r1 = "MicroMsg.ChromiumCronetDownloadCallback"
            java.lang.String r2 = "onResponseStarted fail: FileNotFoundException path: %s mkdirsRes: %b deleteRes: %b createRes: %b"
            com.tencent.mars.xlog.Log.e(r1, r2, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.z.onResponseStarted(org.chromium.net.UrlResponseInfo):void");
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    public void onSucceeded(org.chromium.net.UrlResponseInfo urlResponseInfo) {
        if (urlResponseInfo != null) {
            urlResponseInfo.getUrl();
        }
        wu5.c cVar = this.f76086h;
        if (cVar != null) {
            cVar.cancel(false);
        }
        org.chromium.net.apihelpers.CronetRequestCompletionListener cronetRequestCompletionListener = this.f76081c;
        if (cronetRequestCompletionListener != null) {
            cronetRequestCompletionListener.onSucceeded(urlResponseInfo, null);
        }
        a();
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    public boolean shouldFollowRedirect(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
        return true;
    }
}
