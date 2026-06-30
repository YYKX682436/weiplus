package com.tencent.mars.cdn;

/* loaded from: classes7.dex */
public class CronetLogicTest {
    private static final java.lang.String TAG = "MicroMsg.CronetLogicTest";
    private static final java.lang.String mUserAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36";
    private static final java.lang.String testUrl = "https://stream.weixin.qq.com/weapp/SendMsg";

    /* loaded from: classes7.dex */
    public static class callback implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback {
        private final java.lang.String TAG;

        public callback(java.lang.String str) {
            this.TAG = "CronetLogicTest." + str;
        }

        @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
        public void onCronetReceiveChunkedData(com.tencent.mars.cdn.CronetLogic.ChunkedData chunkedData, long j17) {
            int length = chunkedData.data.length;
        }

        @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
        public int onCronetReceiveHeader(com.tencent.mars.cdn.CronetLogic.ResponseHeader responseHeader, int i17, java.lang.String str) {
            for (com.tencent.mars.cdn.CronetLogic.HeaderMap headerMap : responseHeader.headers) {
                java.lang.String str2 = headerMap.key;
            }
            return 0;
        }

        @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
        public void onCronetReceiveUploadProgress(long j17, long j18) {
        }

        @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
        public void onCronetTaskCompleted(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult, java.lang.String str2) {
            int i17 = cronetTaskResult.errorCode;
            cronetTaskResult.getDataString();
        }

        @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
        public void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
            long j17 = cronetDownloadProgress.totalByte;
        }
    }

    public static void cronetDebugTest() {
        testChunk();
        testUpload();
        testIp();
        testCellular();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.String[] lambda$testSimpleDns$0(java.lang.String str) {
        return new java.lang.String[0];
    }

    private static void testCellular() {
        com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams = new com.tencent.mars.cdn.CronetLogic.CronetRequestParams();
        cronetRequestParams.taskType = 1;
        cronetRequestParams.url = "https://www.cip.cc/";
        cronetRequestParams.forceBindMobileNetwork = true;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("user-agent", mUserAgent);
        cronetRequestParams.makeRequestHeader(hashMap);
        com.tencent.mars.cdn.CronetLogic.startCronetHttpTask(cronetRequestParams, new com.tencent.mars.cdn.CronetLogicTest.callback("testCellular"));
    }

    private static void testChunk() {
        com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams = new com.tencent.mars.cdn.CronetLogic.CronetRequestParams();
        cronetRequestParams.taskType = 10;
        cronetRequestParams.url = "https://www.httpwatch.com/httpgallery/chunked/chunkedimage.aspx";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("user-agent", mUserAgent);
        cronetRequestParams.makeRequestHeader(hashMap);
        com.tencent.mars.cdn.CronetLogic.startCronetHttpTask(cronetRequestParams, new com.tencent.mars.cdn.CronetLogicTest.callback("testChunk"));
    }

    private static void testIp() {
        com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams = new com.tencent.mars.cdn.CronetLogic.CronetRequestParams();
        cronetRequestParams.taskType = 1;
        cronetRequestParams.url = "https://www.cip.cc/";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("user-agent", mUserAgent);
        cronetRequestParams.makeRequestHeader(hashMap);
        com.tencent.mars.cdn.CronetLogic.cancelCronetTask(com.tencent.mars.cdn.CronetLogic.startCronetHttpTask(cronetRequestParams, new com.tencent.mars.cdn.CronetLogicTest.callback("testIp")).taskId);
    }

    private static void testSimpleDns() {
        com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams = new com.tencent.mars.cdn.CronetLogic.CronetRequestParams();
        cronetRequestParams.taskType = 1;
        cronetRequestParams.dnsType = 1;
        com.tencent.mars.cdn.CronetLogic.setSimpleDnsCallback(new com.tencent.mars.cdn.CronetLogicTest$$a());
        cronetRequestParams.url = testUrl;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("user-agent", mUserAgent);
        cronetRequestParams.makeRequestHeader(hashMap);
        com.tencent.mars.cdn.CronetLogic.startCronetHttpTask(cronetRequestParams, new com.tencent.mars.cdn.CronetLogicTest.callback("testSimpleDns"));
    }

    private static void testUpload() {
        com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams = new com.tencent.mars.cdn.CronetLogic.CronetRequestParams();
        cronetRequestParams.taskType = 7;
        cronetRequestParams.url = "http://www.csm-testcenter.org/test";
        cronetRequestParams.method = "POST";
        com.tencent.mars.cdn.CronetLogic.UploadParams uploadParams = new com.tencent.mars.cdn.CronetLogic.UploadParams();
        uploadParams.filePath = android.os.Environment.getExternalStorageDirectory().getAbsolutePath() + "/upload_text";
        long length = new java.io.File(uploadParams.filePath).length();
        uploadParams.uploadOffset = 0L;
        uploadParams.uploadRange = length;
        uploadParams.formData = "----WebKitFormBoundaryn35wXoQ8S5FsBTGs".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        uploadParams.endData = "----WebKitFormBoundaryn35wXoQ8S5FsBTGs".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        uploadParams.vfsPath = true;
        uploadParams.reportId = 1800;
        cronetRequestParams.uploadParams = uploadParams;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("Content-Length", java.lang.Long.toString(length + (uploadParams.formData == null ? 0 : r5.length) + (uploadParams.endData != null ? r1.length : 0)));
        hashMap.put("Origin", "http://www.csm-testcenter.org");
        hashMap.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
        hashMap.put("Accept-Encoding", "gzip, deflate");
        hashMap.put("Referer", "http://www.csm-testcenter.org/test?do=show&subdo=common&test=file_upload");
        hashMap.put("Content-Type", "multipart/form-data; boundary=----WebKitFormBoundaryn35wXoQ8S5FsBTGs");
        hashMap.put("Host", "www.csm-testcenter.org");
        hashMap.put("User-Agent", mUserAgent);
        cronetRequestParams.makeRequestHeader(hashMap);
        com.tencent.mars.cdn.CronetLogic.startCronetUploadTask(cronetRequestParams, new com.tencent.mars.cdn.CronetLogicTest.callback("testUpload"));
    }
}
