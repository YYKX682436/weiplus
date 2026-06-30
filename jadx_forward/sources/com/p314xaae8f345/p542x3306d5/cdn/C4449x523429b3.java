package com.p314xaae8f345.p542x3306d5.cdn;

/* renamed from: com.tencent.mars.cdn.CronetLogicTest */
/* loaded from: classes7.dex */
public class C4449x523429b3 {
    private static final java.lang.String TAG = "MicroMsg.CronetLogicTest";

    /* renamed from: mUserAgent */
    private static final java.lang.String f18259x8d47580d = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36";

    /* renamed from: testUrl */
    private static final java.lang.String f18260xab36e77d = "https://stream.weixin.qq.com/weapp/SendMsg";

    /* renamed from: com.tencent.mars.cdn.CronetLogicTest$callback */
    /* loaded from: classes7.dex */
    public static class callback implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback {
        private final java.lang.String TAG;

        public callback(java.lang.String str) {
            this.TAG = "CronetLogicTest." + str;
        }

        @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
        /* renamed from: onCronetReceiveChunkedData */
        public void mo37969x6a58464f(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ChunkedData chunkedData, long j17) {
            int length = chunkedData.f18148x2eefaa.length;
        }

        @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
        /* renamed from: onCronetReceiveHeader */
        public int mo37970x82943234(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ResponseHeader responseHeader, int i17, java.lang.String str) {
            for (com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap headerMap : responseHeader.f18226x2f676f86) {
                java.lang.String str2 = headerMap.key;
            }
            return 0;
        }

        @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
        /* renamed from: onCronetReceiveUploadProgress */
        public void mo37971x77ce5bf5(long j17, long j18) {
        }

        @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
        /* renamed from: onCronetTaskCompleted */
        public void mo37972x5b5f2d2a(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult, java.lang.String str2) {
            int i17 = cronetTaskResult.f18200x139cb015;
            cronetTaskResult.m37974x3a5e0c51();
        }

        @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
        /* renamed from: onDownloadProgressChanged */
        public void mo37973x617c4940(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress) {
            long j17 = cronetDownloadProgress.f18156xdd8f6e6c;
        }
    }

    /* renamed from: cronetDebugTest */
    public static void m37979xe8e59648() {
        m37982xb818f8fb();
        m37985x6a2a0933();
        m37983xcbb77159();
        m37981xf3f1d01c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$testSimpleDns$0 */
    public static /* synthetic */ java.lang.String[] m37980x75fe4e14(java.lang.String str) {
        return new java.lang.String[0];
    }

    /* renamed from: testCellular */
    private static void m37981xf3f1d01c() {
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
        cronetRequestParams.f18181xe78dee5f = 1;
        cronetRequestParams.url = "https://www.cip.cc/";
        cronetRequestParams.f18168x1292e644 = true;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("user-agent", f18259x8d47580d);
        cronetRequestParams.m37968xeb7416ae(hashMap);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37962x5ffa1e0c(cronetRequestParams, new com.p314xaae8f345.p542x3306d5.cdn.C4449x523429b3.callback("testCellular"));
    }

    /* renamed from: testChunk */
    private static void m37982xb818f8fb() {
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
        cronetRequestParams.f18181xe78dee5f = 10;
        cronetRequestParams.url = "https://www.httpwatch.com/httpgallery/chunked/chunkedimage.aspx";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("user-agent", f18259x8d47580d);
        cronetRequestParams.m37968xeb7416ae(hashMap);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37962x5ffa1e0c(cronetRequestParams, new com.p314xaae8f345.p542x3306d5.cdn.C4449x523429b3.callback("testChunk"));
    }

    /* renamed from: testIp */
    private static void m37983xcbb77159() {
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
        cronetRequestParams.f18181xe78dee5f = 1;
        cronetRequestParams.url = "https://www.cip.cc/";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("user-agent", f18259x8d47580d);
        cronetRequestParams.m37968xeb7416ae(hashMap);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37962x5ffa1e0c(cronetRequestParams, new com.p314xaae8f345.p542x3306d5.cdn.C4449x523429b3.callback("testIp")).f18158xcb7ef180);
    }

    /* renamed from: testSimpleDns */
    private static void m37984xa94b05a5() {
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
        cronetRequestParams.f18181xe78dee5f = 1;
        cronetRequestParams.f18161x6c20cc03 = 1;
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37956xc461373a(new com.p314xaae8f345.p542x3306d5.cdn.C4450x2441214e());
        cronetRequestParams.url = f18260xab36e77d;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("user-agent", f18259x8d47580d);
        cronetRequestParams.m37968xeb7416ae(hashMap);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37962x5ffa1e0c(cronetRequestParams, new com.p314xaae8f345.p542x3306d5.cdn.C4449x523429b3.callback("testSimpleDns"));
    }

    /* renamed from: testUpload */
    private static void m37985x6a2a0933() {
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
        cronetRequestParams.f18181xe78dee5f = 7;
        cronetRequestParams.url = "http://www.csm-testcenter.org/test";
        cronetRequestParams.f18174xbfc5d0e1 = "POST";
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.UploadParams uploadParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.UploadParams();
        uploadParams.f18228xd426afc1 = android.os.Environment.getExternalStorageDirectory().getAbsolutePath() + "/upload_text";
        long length = new java.io.File(uploadParams.f18228xd426afc1).length();
        uploadParams.f18231x93c419f4 = 0L;
        uploadParams.f18232x3ebad3bc = length;
        uploadParams.f18229x1c346e8e = "----WebKitFormBoundaryn35wXoQ8S5FsBTGs".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        uploadParams.f18227xa02c0725 = "----WebKitFormBoundaryn35wXoQ8S5FsBTGs".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        uploadParams.f18233x16a80688 = true;
        uploadParams.f18230xe68be16f = 1800;
        cronetRequestParams.f18182x9537aee7 = uploadParams;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("Content-Length", java.lang.Long.toString(length + (uploadParams.f18229x1c346e8e == null ? 0 : r5.length) + (uploadParams.f18227xa02c0725 != null ? r1.length : 0)));
        hashMap.put("Origin", "http://www.csm-testcenter.org");
        hashMap.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
        hashMap.put("Accept-Encoding", "gzip, deflate");
        hashMap.put("Referer", "http://www.csm-testcenter.org/test?do=show&subdo=common&test=file_upload");
        hashMap.put("Content-Type", "multipart/form-data; boundary=----WebKitFormBoundaryn35wXoQ8S5FsBTGs");
        hashMap.put("Host", "www.csm-testcenter.org");
        hashMap.put("User-Agent", f18259x8d47580d);
        cronetRequestParams.m37968xeb7416ae(hashMap);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37964x2ef4345(cronetRequestParams, new com.p314xaae8f345.p542x3306d5.cdn.C4449x523429b3.callback("testUpload"));
    }
}
