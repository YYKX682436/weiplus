package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29;

/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Class[] f271242a = {java.lang.InterruptedException.class};

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Class[] f271243b = {java.net.UnknownHostException.class, java.lang.IllegalArgumentException.class, java.net.MalformedURLException.class, java.io.IOException.class, java.io.FileNotFoundException.class, n35.a.class, n35.d.class, n35.g.class};

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class[] f271244c = {java.net.SocketException.class, java.net.SocketTimeoutException.class};

    public final void a(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i iVar, java.net.HttpURLConnection httpURLConnection) {
        java.util.Set<java.lang.String> keySet;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x xVar = (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x) iVar;
        xVar.f();
        java.util.Map map = ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.u) xVar.c()).f271251g;
        java.util.LinkedList<com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.f> linkedList = null;
        java.util.Map unmodifiableMap = ((java.util.HashMap) map).size() == 0 ? null : java.util.Collections.unmodifiableMap(map);
        if (unmodifiableMap != null && unmodifiableMap.size() != 0 && (keySet = unmodifiableMap.keySet()) != null && keySet.size() != 0) {
            linkedList = new java.util.LinkedList();
            for (java.lang.String str : keySet) {
                java.lang.String str2 = (java.lang.String) unmodifiableMap.get(str);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    linkedList.add(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.f(str, str2));
                }
            }
        }
        if (linkedList != null && linkedList.size() > 0) {
            for (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.f fVar : linkedList) {
                httpURLConnection.addRequestProperty(fVar.f271206a, fVar.f271207b);
            }
        }
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setConnectTimeout(((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.u) xVar.c()).f271252h);
        httpURLConnection.setReadTimeout(((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.u) xVar.c()).f271253i);
        httpURLConnection.setUseCaches(false);
        if (xVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a9) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        } else {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        java.lang.String property = java.lang.System.getProperty("http.agent");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(property)) {
            httpURLConnection.setRequestProperty("User-agent", property);
        }
        httpURLConnection.setInstanceFollowRedirects(true);
    }

    public final void b(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i iVar, javax.net.ssl.HttpsURLConnection httpsURLConnection) {
        javax.net.ssl.SSLContext sSLContext;
        try {
            sSLContext = javax.net.ssl.SSLContext.getInstance("TLSv1.2");
        } catch (java.lang.Exception unused) {
            sSLContext = null;
        }
        if (sSLContext == null) {
            try {
                sSLContext = javax.net.ssl.SSLContext.getInstance("TLSv1");
            } catch (java.lang.Exception unused2) {
                sSLContext = null;
            }
            if (sSLContext == null) {
                try {
                    sSLContext = javax.net.ssl.SSLContext.getDefault();
                } catch (java.lang.Exception unused3) {
                }
            }
        }
        if (sSLContext != null) {
            try {
                sSLContext.init(null, null, new java.security.SecureRandom());
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                return;
            } catch (java.lang.Exception unused4) {
            }
        }
        httpsURLConnection.setSSLSocketFactory(android.net.SSLCertificateSocketFactory.getDefault(((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.u) ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x) iVar).c()).f271254j, new android.net.SSLSessionCache(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
    }

    public final boolean c(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i iVar, java.net.HttpURLConnection httpURLConnection) {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x xVar = (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x) iVar;
        long g17 = o35.a.g(xVar.e());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.NetworkPerformer", "%s: RangeOffset = %d", xVar.f(), java.lang.Long.valueOf(g17));
        if (g17 == 0) {
            return false;
        }
        httpURLConnection.addRequestProperty("Range", "bytes=" + g17 + "-");
        return true;
    }

    public final void d() {
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException(java.lang.Thread.currentThread().getName() + " has interrupted by someone!");
        }
    }

    public final java.io.OutputStream e(java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            throw new java.io.FileNotFoundException(java.lang.String.format("%s filePath is null or nil", str2));
        }
        return new java.io.BufferedOutputStream(com.p314xaae8f345.mm.vfs.w6.K(str, z17));
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v f(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i iVar, java.lang.Exception exc) {
        if (exc instanceof java.net.ProtocolException) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x xVar = (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x) iVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.NetworkPerformer", "%s: Protocol not support, the protocol: %s", xVar.f(), "GET");
            return h(xVar, exc);
        }
        if (exc instanceof n35.b) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x xVar2 = (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x) iVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.NetworkPerformer", "%s: %s [%s]", xVar2.f(), exc.getClass().getSimpleName(), exc.getMessage());
            o35.a.a(xVar2.e());
            return null;
        }
        if (f271242a[0].equals(exc.getClass())) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x xVar3 = (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x) iVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.NetworkPerformer", "%s: download canceled, caused by %s", xVar3.f(), exc);
            return new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v(xVar3, exc, -1, 4);
        }
        java.lang.Class[] clsArr = f271244c;
        for (int i17 = 0; i17 < 2; i17++) {
            if (clsArr[i17].equals(exc.getClass())) {
                return null;
            }
        }
        java.lang.Class[] clsArr2 = f271243b;
        for (int i18 = 0; i18 < 8 && !clsArr2[i18].equals(exc.getClass()); i18++) {
        }
        return h(iVar, exc);
    }

    public final boolean g(java.net.HttpURLConnection httpURLConnection) {
        if ("bytes".equals(httpURLConnection.getHeaderField("Accept-Ranges"))) {
            return true;
        }
        java.lang.String headerField = httpURLConnection.getHeaderField("Content-Range");
        return headerField != null && headerField.startsWith("bytes");
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v h(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i iVar, java.lang.Exception exc) {
        int i17;
        if (exc instanceof n35.f) {
            n35.f fVar = (n35.f) exc;
            i17 = fVar.f416340d;
            exc = fVar.f416341e;
        } else {
            i17 = -1;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x xVar = (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x) iVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.NetworkPerformer", "%s: download failed, caused by %s", xVar.f(), exc);
        return new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v(xVar, exc, i17, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v i(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i r13) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.t.i(com.tencent.mm.pluginsdk.res.downloader.model.i):com.tencent.mm.pluginsdk.res.downloader.model.v");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Class, java.lang.Class<zy.s>] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15, types: [yy.o] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v j(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i iVar, java.net.HttpURLConnection httpURLConnection, boolean z17) {
        java.lang.Throwable th6;
        java.io.OutputStream outputStream;
        java.io.FilterInputStream filterInputStream;
        java.lang.Class cls;
        javax.net.ssl.SSLHandshakeException sSLHandshakeException;
        java.net.UnknownHostException unknownHostException;
        java.net.SocketTimeoutException socketTimeoutException;
        java.net.SocketException socketException;
        java.lang.InterruptedException interruptedException;
        java.io.IOException iOException;
        int i17;
        java.lang.Class cls2;
        java.lang.Class cls3;
        int i18;
        java.io.FilterInputStream filterInputStream2;
        int i19;
        java.net.UnknownHostException unknownHostException2;
        java.net.SocketTimeoutException socketTimeoutException2;
        java.lang.InterruptedException interruptedException2;
        java.lang.Class cls4;
        java.lang.Class cls5;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar;
        int i27;
        ?? r27 = zy.s.class;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x xVar = (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x) iVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.NetworkPerformer", "%s: step4, start to read response", xVar.f());
        int i28 = -1;
        try {
            try {
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        int contentLength = httpURLConnection.getContentLength();
                        java.lang.String contentEncoding = httpURLConnection.getContentEncoding();
                        java.lang.String contentType = httpURLConnection.getContentType();
                        boolean g17 = g(httpURLConnection);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.NetworkPerformer", "%s: received status code = %d, content-length = %d, content-encoding = %s, content-type = %s, isSupportRange = %b, \nresponseHeaders = %s", xVar.f(), java.lang.Integer.valueOf(responseCode), java.lang.Integer.valueOf(contentLength), contentEncoding, contentType, java.lang.Boolean.valueOf(g17), o35.b.a(httpURLConnection.getHeaderFields()));
                        long g18 = o35.a.g(xVar.e());
                        if (contentLength == 0 && 206 == responseCode && g18 > 0) {
                            try {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.NetworkPerformer", "%s: file exists, return", xVar.f());
                                i27 = responseCode;
                            } catch (java.io.IOException e17) {
                                e = e17;
                                i27 = responseCode;
                            }
                            try {
                                com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar2 = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v(xVar, 2, g18, contentType);
                                ((yy.o) ((zy.s) i95.n0.c(r27))).wi(-1, 0);
                                return vVar2;
                            } catch (java.io.IOException e18) {
                                e = e18;
                                iOException = e;
                                i17 = -1;
                                outputStream = null;
                                i28 = i27;
                                filterInputStream = null;
                                cls3 = r27;
                                o35.a.j(filterInputStream);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.NetworkPerformer", "%s: HttpUrlConnection getInputStream failed! %s", xVar.f(), iOException);
                                throw new n35.f(i28, iOException);
                            }
                        }
                        if (301 != responseCode) {
                        }
                        try {
                            if (contentLength == 0) {
                                throw new n35.g();
                            }
                            try {
                                if (!xVar.d() && contentLength < 0) {
                                    throw new java.net.SocketException();
                                }
                                if (contentLength > 0 && !xVar.b(contentLength)) {
                                    throw new n35.a();
                                }
                                if (416 == responseCode) {
                                    throw new n35.b(contentLength, g18);
                                }
                                java.io.FilterInputStream bufferedInputStream = new java.io.BufferedInputStream(httpURLConnection.getInputStream());
                                try {
                                    try {
                                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(contentEncoding)) {
                                            try {
                                                if (contentEncoding.equalsIgnoreCase("gzip")) {
                                                    bufferedInputStream = new java.util.zip.GZIPInputStream(bufferedInputStream);
                                                }
                                            } catch (java.io.IOException e19) {
                                                iOException = e19;
                                                filterInputStream = bufferedInputStream;
                                                i17 = -1;
                                                outputStream = null;
                                                i28 = responseCode;
                                                cls3 = r27;
                                                o35.a.j(filterInputStream);
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.NetworkPerformer", "%s: HttpUrlConnection getInputStream failed! %s", xVar.f(), iOException);
                                                throw new n35.f(i28, iOException);
                                            }
                                        }
                                    } catch (java.io.IOException e27) {
                                        i18 = responseCode;
                                        iOException = e27;
                                        filterInputStream = bufferedInputStream;
                                        i17 = -1;
                                    }
                                } catch (java.lang.InterruptedException e28) {
                                    interruptedException = e28;
                                } catch (java.net.SocketException e29) {
                                    socketException = e29;
                                } catch (java.net.SocketTimeoutException e37) {
                                    socketTimeoutException = e37;
                                } catch (java.net.UnknownHostException e38) {
                                    unknownHostException = e38;
                                } catch (javax.net.ssl.SSLHandshakeException e39) {
                                    sSLHandshakeException = e39;
                                } catch (java.lang.Throwable th7) {
                                    th6 = th7;
                                    filterInputStream = bufferedInputStream;
                                }
                                try {
                                    java.io.OutputStream e47 = e(xVar.e(), xVar.f(), z17 && g17);
                                    try {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.NetworkPerformer", "%s: append = %b, isSupportRange = %s", xVar.f(), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(g17));
                                        byte[] bArr = new byte[16384];
                                        i17 = 0;
                                        while (true) {
                                            try {
                                                int read = bufferedInputStream.read(bArr, 0, 16384);
                                                if (read == -1) {
                                                    break;
                                                }
                                                try {
                                                    e47.write(bArr, 0, read);
                                                    i17 += read;
                                                    d();
                                                } catch (java.net.SocketTimeoutException e48) {
                                                    throw e48;
                                                } catch (java.io.IOException e49) {
                                                    iOException = e49;
                                                    filterInputStream = bufferedInputStream;
                                                    outputStream = e47;
                                                    i28 = responseCode;
                                                    cls3 = r27;
                                                    o35.a.j(filterInputStream);
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.NetworkPerformer", "%s: HttpUrlConnection getInputStream failed! %s", xVar.f(), iOException);
                                                    throw new n35.f(i28, iOException);
                                                } catch (java.lang.InterruptedException e57) {
                                                    throw e57;
                                                } catch (java.net.SocketException e58) {
                                                    socketException = e58;
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.NetworkPerformer", xVar.f() + ": " + socketException.getMessage());
                                                    throw socketException;
                                                } catch (java.net.UnknownHostException e59) {
                                                    throw e59;
                                                } catch (javax.net.ssl.SSLHandshakeException e66) {
                                                    sSLHandshakeException = e66;
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.NetworkPerformer", "%s: HttpUrlConnection SSLHandshakeException!", xVar.f());
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloader.NetworkPerformer", sSLHandshakeException, "", new java.lang.Object[0]);
                                                    throw sSLHandshakeException;
                                                } catch (java.lang.Throwable th8) {
                                                    th6 = th8;
                                                    filterInputStream = bufferedInputStream;
                                                    outputStream = e47;
                                                    cls2 = r27;
                                                    i28 = i17;
                                                    cls = cls2;
                                                    o35.a.j(filterInputStream);
                                                    o35.a.j(outputStream);
                                                    ((yy.o) ((zy.s) i95.n0.c(cls))).wi(i28, 0);
                                                    throw th6;
                                                }
                                            } catch (java.net.SocketException e67) {
                                                e = e67;
                                                filterInputStream2 = bufferedInputStream;
                                            } catch (java.net.SocketTimeoutException e68) {
                                                e = e68;
                                                filterInputStream2 = bufferedInputStream;
                                            } catch (java.net.UnknownHostException e69) {
                                                e = e69;
                                                filterInputStream2 = bufferedInputStream;
                                            } catch (javax.net.ssl.SSLHandshakeException e76) {
                                                e = e76;
                                                filterInputStream2 = bufferedInputStream;
                                            } catch (java.io.IOException e77) {
                                                e = e77;
                                                filterInputStream2 = bufferedInputStream;
                                                outputStream = e47;
                                                i19 = responseCode;
                                            } catch (java.lang.InterruptedException e78) {
                                                e = e78;
                                                filterInputStream2 = bufferedInputStream;
                                            } catch (java.lang.Throwable th9) {
                                                th = th9;
                                                filterInputStream2 = bufferedInputStream;
                                                outputStream = e47;
                                            }
                                        }
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.NetworkPerformer", "%s: read count = %d", xVar.f(), java.lang.Integer.valueOf(i17));
                                        e47.flush();
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.NetworkPerformer", "%s: download complete, flush and send complete status", xVar.f());
                                        try {
                                            if (xVar.d()) {
                                                filterInputStream2 = bufferedInputStream;
                                                outputStream = e47;
                                                i19 = responseCode;
                                                vVar = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v(xVar, 2, o35.a.g(xVar.e()), contentType);
                                            } else {
                                                filterInputStream2 = bufferedInputStream;
                                                outputStream = e47;
                                                i19 = responseCode;
                                                vVar = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v(xVar, 2, contentLength, contentType);
                                            }
                                            o35.a.j(filterInputStream2);
                                            o35.a.j(outputStream);
                                            r27 = (yy.o) ((zy.s) i95.n0.c(r27));
                                            r27.wi(i17, 0);
                                            return vVar;
                                        } catch (java.io.IOException e79) {
                                            e = e79;
                                            iOException = e;
                                            cls5 = r27;
                                            filterInputStream = filterInputStream2;
                                            i28 = i19;
                                            cls3 = cls5;
                                            o35.a.j(filterInputStream);
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.NetworkPerformer", "%s: HttpUrlConnection getInputStream failed! %s", xVar.f(), iOException);
                                            throw new n35.f(i28, iOException);
                                        } catch (java.lang.InterruptedException e86) {
                                            e = e86;
                                            interruptedException2 = e;
                                            throw interruptedException2;
                                        } catch (java.net.SocketException e87) {
                                            e = e87;
                                            socketException = e;
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.NetworkPerformer", xVar.f() + ": " + socketException.getMessage());
                                            throw socketException;
                                        } catch (java.net.SocketTimeoutException e88) {
                                            e = e88;
                                            socketTimeoutException2 = e;
                                            throw socketTimeoutException2;
                                        } catch (java.net.UnknownHostException e89) {
                                            e = e89;
                                            unknownHostException2 = e;
                                            throw unknownHostException2;
                                        } catch (javax.net.ssl.SSLHandshakeException e96) {
                                            e = e96;
                                            sSLHandshakeException = e;
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.NetworkPerformer", "%s: HttpUrlConnection SSLHandshakeException!", xVar.f());
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloader.NetworkPerformer", sSLHandshakeException, "", new java.lang.Object[0]);
                                            throw sSLHandshakeException;
                                        } catch (java.lang.Throwable th10) {
                                            th = th10;
                                            th6 = th;
                                            i28 = i17;
                                            cls4 = r27;
                                            filterInputStream = filterInputStream2;
                                            cls = cls4;
                                            o35.a.j(filterInputStream);
                                            o35.a.j(outputStream);
                                            ((yy.o) ((zy.s) i95.n0.c(cls))).wi(i28, 0);
                                            throw th6;
                                        }
                                    } catch (java.lang.InterruptedException e97) {
                                        filterInputStream2 = bufferedInputStream;
                                        interruptedException2 = e97;
                                    } catch (java.net.SocketException e98) {
                                        filterInputStream2 = bufferedInputStream;
                                        socketException = e98;
                                    } catch (java.net.SocketTimeoutException e99) {
                                        filterInputStream2 = bufferedInputStream;
                                        socketTimeoutException2 = e99;
                                    } catch (java.net.UnknownHostException e100) {
                                        filterInputStream2 = bufferedInputStream;
                                        unknownHostException2 = e100;
                                    } catch (javax.net.ssl.SSLHandshakeException e101) {
                                        filterInputStream2 = bufferedInputStream;
                                        sSLHandshakeException = e101;
                                    } catch (java.io.IOException e102) {
                                        filterInputStream2 = bufferedInputStream;
                                        outputStream = e47;
                                        i19 = responseCode;
                                        iOException = e102;
                                        i17 = -1;
                                        cls5 = r27;
                                    } catch (java.lang.Throwable th11) {
                                        filterInputStream2 = bufferedInputStream;
                                        outputStream = e47;
                                        th6 = th11;
                                        cls4 = r27;
                                    }
                                } catch (java.lang.InterruptedException e103) {
                                    interruptedException = e103;
                                    throw interruptedException;
                                } catch (java.net.SocketException e104) {
                                    socketException = e104;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.NetworkPerformer", xVar.f() + ": " + socketException.getMessage());
                                    throw socketException;
                                } catch (java.net.SocketTimeoutException e105) {
                                    socketTimeoutException = e105;
                                    throw socketTimeoutException;
                                } catch (java.net.UnknownHostException e106) {
                                    unknownHostException = e106;
                                    throw unknownHostException;
                                } catch (javax.net.ssl.SSLHandshakeException e107) {
                                    sSLHandshakeException = e107;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.NetworkPerformer", "%s: HttpUrlConnection SSLHandshakeException!", xVar.f());
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ResDownloader.NetworkPerformer", sSLHandshakeException, "", new java.lang.Object[0]);
                                    throw sSLHandshakeException;
                                } catch (java.io.IOException e108) {
                                    i18 = responseCode;
                                    iOException = e108;
                                    i17 = -1;
                                    filterInputStream = bufferedInputStream;
                                    i28 = i18;
                                    outputStream = null;
                                    cls3 = r27;
                                    o35.a.j(filterInputStream);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.NetworkPerformer", "%s: HttpUrlConnection getInputStream failed! %s", xVar.f(), iOException);
                                    throw new n35.f(i28, iOException);
                                } catch (java.lang.Throwable th12) {
                                    th6 = th12;
                                    filterInputStream = bufferedInputStream;
                                    outputStream = null;
                                    cls = r27;
                                    o35.a.j(filterInputStream);
                                    o35.a.j(outputStream);
                                    ((yy.o) ((zy.s) i95.n0.c(cls))).wi(i28, 0);
                                    throw th6;
                                }
                            } catch (java.io.IOException e109) {
                                iOException = e109;
                                i17 = -1;
                                filterInputStream = null;
                            }
                        } catch (java.io.IOException e110) {
                            e = e110;
                            iOException = e;
                            i17 = -1;
                            i28 = responseCode;
                            filterInputStream = null;
                            outputStream = null;
                            cls3 = r27;
                            o35.a.j(filterInputStream);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.NetworkPerformer", "%s: HttpUrlConnection getInputStream failed! %s", xVar.f(), iOException);
                            throw new n35.f(i28, iOException);
                        }
                    } catch (java.io.IOException e111) {
                        e = e111;
                    }
                } catch (java.io.IOException e112) {
                    iOException = e112;
                    i17 = -1;
                }
                try {
                    o35.a.j(filterInputStream);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloader.NetworkPerformer", "%s: HttpUrlConnection getInputStream failed! %s", xVar.f(), iOException);
                    throw new n35.f(i28, iOException);
                } catch (java.lang.Throwable th13) {
                    th6 = th13;
                    cls2 = cls3;
                    i28 = i17;
                    cls = cls2;
                    o35.a.j(filterInputStream);
                    o35.a.j(outputStream);
                    ((yy.o) ((zy.s) i95.n0.c(cls))).wi(i28, 0);
                    throw th6;
                }
            } catch (java.lang.InterruptedException e113) {
                interruptedException = e113;
            } catch (java.net.SocketException e114) {
                socketException = e114;
            } catch (java.net.SocketTimeoutException e115) {
                socketTimeoutException = e115;
            } catch (java.net.UnknownHostException e116) {
                unknownHostException = e116;
            } catch (javax.net.ssl.SSLHandshakeException e117) {
                sSLHandshakeException = e117;
            } catch (java.lang.Throwable th14) {
                th6 = th14;
                filterInputStream = null;
            }
        } catch (java.lang.Throwable th15) {
            th6 = th15;
            cls = r27;
        }
    }
}
