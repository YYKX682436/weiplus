package com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d;

/* renamed from: com.tencent.tmassistantsdk.downloadservice.DownloadTask */
/* loaded from: classes13.dex */
public class C26670x4be6424d {

    /* renamed from: AD_INJECT_KEY_PREFIX */
    public static final java.lang.String f56131xffdbdee4 = "ad-inject-apk-offset:";
    public static final java.lang.String TAG = "_DownloadTask";

    /* renamed from: mDownloadInfo */
    protected com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 f56132xd9ab3663;

    /* renamed from: mRequestUrl */
    private java.lang.String f56137xde6814ad;

    /* renamed from: mSaveFile */
    com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26761xfeddef81 f56138xa96dcc26;

    /* renamed from: mStopTask */
    protected boolean f56139x8b338834 = false;

    /* renamed from: mHttpClient */
    org.apache.http.client.HttpClient f56133xf8445ac0 = null;

    /* renamed from: mHttpGet */
    org.apache.http.client.methods.HttpGet f56134xe8299481 = null;

    /* renamed from: mRecvBuf */
    protected final byte[] f56136xdea24d80 = new byte[4096];

    /* renamed from: mTaskId */
    protected final int f56140x1aeb184d = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105487x7655dada();

    /* renamed from: startDownloadNetType */
    private java.lang.String f56141x25dca00d = "wifi";

    /* renamed from: mIsRedirect */
    private boolean f56135x7ea69773 = false;

    public C26670x4be6424d(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 c26667x4be17176) {
        this.f56132xd9ab3663 = null;
        this.f56132xd9ab3663 = c26667x4be17176;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cancelInWorkThread */
    public void m104927x6b6b8b1a() {
        this.f56139x8b338834 = true;
        org.apache.http.client.methods.HttpGet httpGet = this.f56134xe8299481;
        if (httpGet == null || httpGet.isAborted()) {
            return;
        }
        this.f56134xe8299481.abort();
    }

    /* renamed from: handleResponseCode */
    private void m104928x34d2f416(org.apache.http.HttpResponse httpResponse, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26742x5a9e4fad c26742x5a9e4fad) {
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "httpResponseCode = " + statusCode + " " + java.lang.Thread.currentThread().getName());
        c26742x5a9e4fad.f56620xaecb4d30 = java.lang.System.currentTimeMillis();
        c26742x5a9e4fad.f56626x3ea74df6 = statusCode;
        if (statusCode == 200 || statusCode == 206) {
            this.f56132xd9ab3663.f56112x1289ad2e = 0;
        }
        if (statusCode == 200) {
            org.apache.http.Header[] headers = httpResponse.getHeaders("Content-Type");
            if (headers != null && headers.length > 0) {
                if (this.f56132xd9ab3663.f56099x92db64a6.equals("resource/tm.android.unknown")) {
                    this.f56132xd9ab3663.f56103xf9236db4 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104893x1f73e245(this.f56132xd9ab3663.f56103xf9236db4);
                } else {
                    java.lang.String value = headers[0].getValue();
                    if (!android.text.TextUtils.isEmpty(value) && value.startsWith(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24)) {
                        throw new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26676xa62caac2(708, "Return contenttype = text " + java.lang.Thread.currentThread().getName());
                    }
                    m104931x312fe645(httpResponse);
                }
            }
            m104930x8266808b(httpResponse, c26742x5a9e4fad);
            return;
        }
        if (statusCode == 206) {
            if (this.f56132xd9ab3663.f56099x92db64a6.equals("resource/tm.android.unknown")) {
                this.f56132xd9ab3663.f56103xf9236db4 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104893x1f73e245(this.f56132xd9ab3663.f56103xf9236db4);
            } else {
                m104931x312fe645(httpResponse);
            }
            m104930x8266808b(httpResponse, c26742x5a9e4fad);
            return;
        }
        if (statusCode != 307) {
            if (statusCode == 416) {
                throw new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26676xa62caac2(statusCode, "HTTP response code error, code = " + statusCode);
            }
            if (statusCode == 500) {
                throw new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26676xa62caac2(statusCode, "HTTP response code error, code = " + statusCode);
            }
            if (statusCode == 503) {
                throw new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26676xa62caac2(statusCode, "HTTP response code error, code = " + statusCode);
            }
            switch (statusCode) {
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    throw new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26676xa62caac2(statusCode, "HTTP response code error, code = " + statusCode);
            }
        }
        if (this.f56132xd9ab3663.f56109x1f7dc540 > 5) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "mRedirectCnt = " + this.f56132xd9ab3663.f56109x1f7dc540 + ",MAX_REDIRESTS = 5");
            throw new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26676xa62caac2(709, "Redirect cnt many times.");
        }
        org.apache.http.Header firstHeader = httpResponse.getFirstHeader(ya.b.f77489x9ff58fb5);
        if (firstHeader == null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.e(TAG, "location header is null. httpResponseCode = " + statusCode);
            throw new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26676xa62caac2(702, "location header is null. httpResponseCode = " + statusCode);
        }
        java.lang.String value2 = firstHeader.getValue();
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "jumpURL = " + value2);
        if (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104892x7c008f1d(value2)) {
            this.f56137xde6814ad = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104881x44e1d0a5(value2);
            this.f56135x7ea69773 = true;
            this.f56132xd9ab3663.f56109x1f7dc540++;
            return;
        }
        throw new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26676xa62caac2(700, "Jump url is not valid. httpResponseCode = " + statusCode + " url: " + value2);
    }

    /* renamed from: onDownloadError */
    private void m104929x338612c1(java.lang.Throwable th6) {
        if (th6 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0363, code lost:
    
        r2 = r26.f56138xa96dcc26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0365, code lost:
    
        if (r2 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0367, code lost:
    
        r2.m105410x5a5ddf8();
        r26.f56138xa96dcc26 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x036d, code lost:
    
        r28.f56621xff1ba2ce = r4;
        r0 = r27.getFirstHeader("X-COS-META-EDGEPACK-OFFSET");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0377, code lost:
    
        if (r0 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x037b, code lost:
    
        if (r26.f56132xd9ab3663 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x037d, code lost:
    
        r0 = r17 + r0.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0393, code lost:
    
        if (r0.length() <= 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0395, code lost:
    
        r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("ad-apk-inject-mmkv", 2, null);
        r3 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d.f56131xffdbdee4 + r26.f56132xd9ab3663.f56118x32d5c2;
        r2.putString(r3, r0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d.TAG, "inject info to mmkv, key = " + r3 + "   value = " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x03cb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0206 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0363 A[EDGE_INSN: B:80:0x0363->B:53:0x0363 BREAK  A[LOOP:0: B:20:0x01fe->B:33:0x0315], SYNTHETIC] */
    /* renamed from: onReceivedResponseData */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m104930x8266808b(org.apache.http.HttpResponse r27, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26742x5a9e4fad r28) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d.m104930x8266808b(org.apache.http.HttpResponse, com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo):void");
    }

    /* renamed from: renameApkFileName */
    private void m104931x312fe645(org.apache.http.HttpResponse httpResponse) {
        java.lang.String m104883xb5542af3;
        if (httpResponse != null && this.f56132xd9ab3663.f56099x92db64a6.equals("application/vnd.android.package-archive")) {
            org.apache.http.Header[] headers = httpResponse.getHeaders("Content-Disposition");
            if (headers == null || headers.length <= 0) {
                m104883xb5542af3 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104883xb5542af3(this.f56132xd9ab3663.f56111xde6810ad);
            } else {
                java.lang.String value = headers[0].getValue();
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "headerFileName = " + value);
                if (android.text.TextUtils.isEmpty(value) || !value.contains("filename=\"")) {
                    m104883xb5542af3 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104883xb5542af3(this.f56132xd9ab3663.f56111xde6810ad);
                } else {
                    java.lang.String substring = value.substring(value.indexOf("filename=\"") + 10);
                    if (android.text.TextUtils.isEmpty(substring)) {
                        m104883xb5542af3 = null;
                    } else {
                        m104883xb5542af3 = substring.substring(0, substring.indexOf("\""));
                        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "header file Name =" + m104883xb5542af3);
                    }
                }
            }
            if (android.text.TextUtils.isEmpty(m104883xb5542af3)) {
                return;
            }
            this.f56132xd9ab3663.f56103xf9236db4 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104880x901cc8b1(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104882xa0e0ee35(m104883xb5542af3));
        }
    }

    /* renamed from: setExtraHeaderParam */
    private void m104932x8b85bc52(org.apache.http.client.methods.HttpGet httpGet, java.util.Map<java.lang.String, java.lang.String> map) {
        if (httpGet == null || map == null || map.size() <= 0) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            httpGet.addHeader(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: setRangeHeader */
    private void m104933x2e572068(org.apache.http.client.methods.HttpGet httpGet, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26742x5a9e4fad c26742x5a9e4fad) {
        long j17;
        java.lang.String m104885x3d316d39 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104885x3d316d39();
        this.f56132xd9ab3663.f56106xbea494a = m104885x3d316d39;
        if (android.text.TextUtils.isEmpty(m104885x3d316d39) || (!m104885x3d316d39.contains("wap") && (!m104885x3d316d39.contains("net") || this.f56132xd9ab3663.f56112x1289ad2e <= 0))) {
            java.lang.String str = "bytes=" + this.f56132xd9ab3663.f56108xcf18f39d + "-";
            httpGet.addHeader("range", str);
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.d(TAG, "set range header: " + str);
            c26742x5a9e4fad.f56625xd21e29fe = this.f56132xd9ab3663.m104899xdd045eaf();
            c26742x5a9e4fad.f56622xe775ee38 = this.f56132xd9ab3663.f56108xcf18f39d;
            c26742x5a9e4fad.f56623xa5741490 = 0L;
            return;
        }
        try {
            int m104916xd81af701 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.m104916xd81af701(m104885x3d316d39);
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 c26667x4be17176 = this.f56132xd9ab3663;
            long j18 = c26667x4be17176.f56108xcf18f39d;
            if (c26667x4be17176.m104899xdd045eaf() > 0) {
                com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 c26667x4be171762 = this.f56132xd9ab3663;
                j17 = (c26667x4be171762.f56108xcf18f39d + m104916xd81af701) - 1;
                if (j17 >= c26667x4be171762.m104899xdd045eaf()) {
                    j17 = this.f56132xd9ab3663.m104899xdd045eaf() - 1;
                }
            } else {
                j17 = m104916xd81af701 - 1;
            }
            java.lang.String str2 = "bytes=" + j18 + "-" + j17;
            httpGet.addHeader("range", str2);
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.d(TAG, "set range header: " + str2);
            c26742x5a9e4fad.f56625xd21e29fe = this.f56132xd9ab3663.m104899xdd045eaf();
            c26742x5a9e4fad.f56622xe775ee38 = j18;
            c26742x5a9e4fad.f56623xa5741490 = m104916xd81af701;
        } catch (java.lang.UnsupportedOperationException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: shouldRetryConnect */
    private boolean m104934x90e9675() {
        boolean z17 = false;
        if (this.f56139x8b338834) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "mStopTask = " + this.f56139x8b338834);
            return false;
        }
        try {
            java.lang.Thread.sleep(5000L);
        } catch (java.lang.InterruptedException unused) {
        }
        if (!com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104890xc0ad1bc0()) {
            int i17 = 0;
            while (!com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104890xc0ad1bc0() && i17 < 5) {
                i17++;
                try {
                    java.lang.Thread.sleep(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                } catch (java.lang.InterruptedException unused2) {
                    this.f56132xd9ab3663.f56100x9d2defe0 = 600;
                }
            }
        }
        if (!com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104890xc0ad1bc0()) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "network unconnected");
            return false;
        }
        if (!com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104885x3d316d39().equalsIgnoreCase("wifi") && !com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104885x3d316d39().equalsIgnoreCase(this.f56141x25dca00d)) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "not equal netType, current: " + com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104885x3d316d39() + ", startNetType: " + this.f56141x25dca00d);
            return false;
        }
        if (this.f56132xd9ab3663.m104902x931dd502()) {
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 c26667x4be17176 = this.f56132xd9ab3663;
            c26667x4be17176.f56112x1289ad2e++;
            c26667x4be17176.f56109x1f7dc540 = 0;
            try {
                java.lang.Thread.sleep(5000L);
                z17 = true;
            } catch (java.lang.InterruptedException unused3) {
                this.f56132xd9ab3663.f56100x9d2defe0 = 600;
            }
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "shouldRetryConnect(" + z17 + "), retryCnt = " + this.f56132xd9ab3663.f56112x1289ad2e);
        return z17;
    }

    /* renamed from: verifyTotalLen */
    private boolean m104935xefa2bbca(org.apache.http.HttpResponse httpResponse, org.apache.http.HttpEntity httpEntity) {
        if (httpResponse.getStatusLine().getStatusCode() == 200) {
            long contentLength = httpEntity.getContentLength();
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "verifyTotalLen,totalLen = " + contentLength + "mRequestFileSize = " + this.f56132xd9ab3663.f56110x3e27b31f);
            return contentLength != -1 && (this.f56132xd9ab3663.f56110x3e27b31f.longValue() <= 0 || contentLength == this.f56132xd9ab3663.f56110x3e27b31f.longValue());
        }
        if (httpResponse.getStatusLine().getStatusCode() != 206) {
            return true;
        }
        long m104872xdd045eaf = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26665xfc706cf5.m104872xdd045eaf(httpResponse.getFirstHeader("content-range").getValue());
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "verifyTotalLen,totalLen = " + m104872xdd045eaf + "mRequestFileSize = " + this.f56132xd9ab3663.f56110x3e27b31f);
        return m104872xdd045eaf != -1 && (this.f56132xd9ab3663.f56110x3e27b31f.longValue() <= 0 || m104872xdd045eaf == this.f56132xd9ab3663.f56110x3e27b31f.longValue());
    }

    /* renamed from: cancel */
    public void m104936xae7a2e7a() {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "DownloadTask::cancel url: " + this.f56132xd9ab3663.f56118x32d5c2);
        if (java.lang.Thread.currentThread().getId() == android.os.Looper.getMainLooper().getThread().getId()) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.w0.b(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.downloadservice.DownloadTask.1
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d.this.m104927x6b6b8b1a();
                }
            });
        } else {
            m104927x6b6b8b1a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0366, code lost:
    
        if (r1 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0368, code lost:
    
        r1.m105410x5a5ddf8();
        r11.f56138xa96dcc26 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x036d, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0316, code lost:
    
        if (r1 == null) goto L152;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e9 A[Catch: all -> 0x017b, StopRequestException -> 0x01d3, IOException -> 0x0271, SSLHandshakeException -> 0x02c9, InterruptedException -> 0x0319, UnknownHostException -> 0x0370, SocketTimeoutException -> 0x03c8, ConnectTimeoutException -> 0x041f, TryCatch #5 {ConnectTimeoutException -> 0x041f, blocks: (B:8:0x003c, B:12:0x0040, B:14:0x0044, B:17:0x004b, B:18:0x0075, B:20:0x00e9, B:21:0x0106, B:30:0x012c, B:24:0x015a, B:25:0x017a, B:49:0x0052, B:50:0x0073, B:51:0x0063), top: B:7:0x003c, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012c A[SYNTHETIC] */
    /* renamed from: exec */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m104937x2fb891(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d.m104937x2fb891(java.lang.String):void");
    }

    /* renamed from: getDownloadURI */
    public java.lang.String m104938x91a59a8e() {
        return this.f56132xd9ab3663.f56118x32d5c2;
    }

    /* renamed from: getPriority */
    public int m104939x3662b71a() {
        return this.f56132xd9ab3663.f56107xdf862131;
    }

    /* renamed from: getTaskId */
    public int m104940x30961476() {
        return this.f56140x1aeb184d;
    }
}
