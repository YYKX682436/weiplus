package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class z extends org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.r6 f157612a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f157613b;

    /* renamed from: c, reason: collision with root package name */
    public org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442 f157614c;

    /* renamed from: d, reason: collision with root package name */
    public java.nio.channels.WritableByteChannel f157615d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f157616e;

    /* renamed from: f, reason: collision with root package name */
    public long f157617f;

    /* renamed from: g, reason: collision with root package name */
    public long f157618g;

    /* renamed from: h, reason: collision with root package name */
    public wu5.c f157619h;

    public z(com.p314xaae8f345.mm.vfs.r6 filePath, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        this.f157612a = filePath;
        this.f157613b = z17;
    }

    public final void a() {
        try {
            java.nio.channels.WritableByteChannel writableByteChannel = this.f157615d;
            if (writableByteChannel != null) {
                writableByteChannel.close();
            }
            this.f157615d = null;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChromiumCronetDownloadCallback", "safeCloseChannel error", e17);
        }
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f
    /* renamed from: onBodyChunkRead */
    public void mo49578x67a67282(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.nio.ByteBuffer bodyChunk) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyChunk, "bodyChunk");
        this.f157618g += bodyChunk.remaining();
        java.nio.channels.WritableByteChannel writableByteChannel = this.f157615d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(writableByteChannel);
        writableByteChannel.write(bodyChunk);
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f
    /* renamed from: onCanceled */
    public void mo49579x9dc2a798(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCanceled url=");
        sb6.append(abstractC29564x6974077e != null ? abstractC29564x6974077e.mo153687xb5887639() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChromiumCronetDownloadCallback", sb6.toString());
        wu5.c cVar = this.f157619h;
        if (cVar != null) {
            cVar.cancel(false);
        }
        org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442 interfaceC29569x80e9f442 = this.f157614c;
        if (interfaceC29569x80e9f442 != null) {
            interfaceC29569x80e9f442.mo49258x9dc2a798(abstractC29564x6974077e);
        }
        a();
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f
    /* renamed from: onFailed */
    public void mo49580x428b6afc(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, org.p3343x72743996.net.AbstractC29501x119930f2 abstractC29501x119930f2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c && abstractC29501x119930f2 != null) {
            throw abstractC29501x119930f2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFailed url=");
        sb6.append(abstractC29564x6974077e != null ? abstractC29564x6974077e.mo153687xb5887639() : null);
        sb6.append(" statusCode=");
        sb6.append(abstractC29564x6974077e != null ? java.lang.Integer.valueOf(abstractC29564x6974077e.mo153682xea30509d()) : null);
        sb6.append(" exception=");
        sb6.append(abstractC29501x119930f2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChromiumCronetDownloadCallback", sb6.toString());
        wu5.c cVar = this.f157619h;
        if (cVar != null) {
            cVar.cancel(false);
        }
        org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442 interfaceC29569x80e9f442 = this.f157614c;
        if (interfaceC29569x80e9f442 != null) {
            interfaceC29569x80e9f442.mo49259x428b6afc(abstractC29564x6974077e, abstractC29501x119930f2);
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f
    /* renamed from: onResponseStarted */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo49581x5d21f921(org.p3343x72743996.net.AbstractC29564x6974077e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "info"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            yz5.p r0 = r9.f157616e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L61
            java.util.Map r0 = r10.mo153680x70925e9b()
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r3)     // Catch: java.lang.NumberFormatException -> L30
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
            r9.f157617f = r3
            ku5.u0 r0 = ku5.t0.f394148d
            com.tencent.mm.plugin.appbrand.appcache.y r4 = new com.tencent.mm.plugin.appbrand.appcache.y
            r4.<init>(r9)
            r5 = 0
            r7 = 1000(0x3e8, double:4.94E-321)
            r3 = r0
            ku5.t0 r3 = (ku5.t0) r3
            wu5.c r0 = r3.d(r4, r5, r7)
            r9.f157619h = r0
            goto L61
        L55:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The body is too large and wouldn't fit in a byte array!"
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L61:
            r10.mo153687xb5887639()
            com.tencent.mm.vfs.r6 r10 = r9.f157612a
            com.tencent.mm.vfs.r6 r10 = r10.s()
            if (r10 == 0) goto L79
            boolean r0 = r10.m()
            if (r0 != 0) goto L79
            boolean r10 = r10.J()
            if (r10 == 0) goto L79
            r1 = r2
        L79:
            boolean r10 = r9.f157613b
            if (r10 != 0) goto L87
            com.tencent.mm.vfs.r6 r10 = r9.f157612a
            java.lang.String r10 = r10.o()
            boolean r2 = com.p314xaae8f345.mm.vfs.w6.h(r10)
        L87:
            com.tencent.mm.vfs.r6 r10 = r9.f157612a
            java.lang.String r10 = r10.o()
            boolean r10 = com.p314xaae8f345.mm.vfs.w6.e(r10)
            boolean r0 = r9.f157613b     // Catch: java.io.FileNotFoundException -> La2
            com.tencent.mm.vfs.r6 r3 = r9.f157612a     // Catch: java.io.FileNotFoundException -> La2
            com.tencent.mm.vfs.z7 r4 = r3.f294699d     // Catch: java.io.FileNotFoundException -> La2
            com.tencent.mm.vfs.z2 r3 = r3.M()     // Catch: java.io.FileNotFoundException -> La2
            java.nio.channels.WritableByteChannel r0 = com.p314xaae8f345.mm.vfs.w6.L(r4, r3, r0)     // Catch: java.io.FileNotFoundException -> La2
            r9.f157615d = r0     // Catch: java.io.FileNotFoundException -> La2
            return
        La2:
            r0 = move-exception
            com.tencent.mm.vfs.r6 r3 = r9.f157612a
            java.lang.String r3 = r3.o()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r3, r1, r2, r10}
            java.lang.String r1 = "MicroMsg.ChromiumCronetDownloadCallback"
            java.lang.String r2 = "onResponseStarted fail: FileNotFoundException path: %s mkdirsRes: %b deleteRes: %b createRes: %b"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z.mo49581x5d21f921(org.chromium.net.UrlResponseInfo):void");
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f
    /* renamed from: onSucceeded */
    public void mo49582x3688ff42(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
        if (abstractC29564x6974077e != null) {
            abstractC29564x6974077e.mo153687xb5887639();
        }
        wu5.c cVar = this.f157619h;
        if (cVar != null) {
            cVar.cancel(false);
        }
        org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442 interfaceC29569x80e9f442 = this.f157614c;
        if (interfaceC29569x80e9f442 != null) {
            interfaceC29569x80e9f442.mo49260x3688ff42(abstractC29564x6974077e, null);
        }
        a();
    }

    @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f
    /* renamed from: shouldFollowRedirect */
    public boolean mo49553xe12ec340(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.lang.String str) {
        return true;
    }
}
