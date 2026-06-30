package com.tencent.mars.cdn;

/* loaded from: classes7.dex */
public class CronetLogic {
    protected static final java.lang.String TAG = "mars::CronetLogic";
    protected static java.util.List<com.tencent.mars.cdn.CronetLogic.CronetTaskNetworkStateCallback> cronetTaskNetworkStateCallbackList = new java.util.ArrayList();
    protected static com.tencent.mars.cdn.CronetLogic.IGetHostIps getHostImpl;
    public static com.tencent.mars.cdn.CronetLogic.CallBack mCallBack;
    protected static com.tencent.mars.cdn.CronetLogic.CronetDnsCallback simpleDnsCallback;
    protected static boolean useHttpdns;

    /* loaded from: classes7.dex */
    public interface CallBack {
        void reportGroupIDKey(int[] iArr, int[] iArr2, int[] iArr3, int i17);

        void reportIDKey(long j17, long j18, long j19);

        void reportKV(long j17, java.lang.String str, long j18);
    }

    /* loaded from: classes6.dex */
    public static class ChunkedData {
        public byte[] data = null;
    }

    /* loaded from: classes6.dex */
    public interface CronetDnsCallback {
        java.lang.String[] dns(java.lang.String str);
    }

    /* loaded from: classes6.dex */
    public static class CronetDnsType {
        public static final int BACKUP_DNS = 4;
        public static final int CELLULAR_DNS = 5;
        public static final int DEFAULT = 0;
        public static final int HTTP_DNS = 3;
        public static final int NEW_DNS = 2;
        public static final int SIMPLE_DNS = 1;
    }

    /* loaded from: classes7.dex */
    public static class CronetDownloadProgress {
        public long totalByte = 0;
        public long currentWriteByte = 0;
    }

    /* loaded from: classes7.dex */
    public static class CronetHttpsCreateResult {
        public int createRet = 0;
        public java.lang.String taskId = "";
    }

    /* loaded from: classes7.dex */
    public static class CronetRequestParams {
        public java.lang.String url = "";
        public java.lang.String taskId = "";
        public java.lang.String header = "";
        public byte[] bodyData = null;
        public java.lang.String method = "";
        public java.lang.String savePath = "";
        public boolean needWriteLocal = false;
        public boolean followRedirect = false;
        public int maxRedirectCount = 2;
        public int taskType = 0;
        public boolean useMemoryCache = false;
        public boolean needGenerateId = true;
        public com.tencent.mars.cdn.CronetLogic.DefaultHttpTaskParams defaultHttpTaskParams = null;
        public com.tencent.mars.cdn.CronetLogic.HeaderMap[] headers = null;
        public boolean useHttp2 = false;
        public boolean useQuic = false;
        public boolean enableBrotli = false;
        public com.tencent.mars.cdn.CronetLogic.HostIPHint hostIPHint = null;
        public int dnsType = 0;
        public boolean forbidSocketReuse = false;
        public boolean miniPrograms = false;
        public boolean forceBindMobileNetwork = false;
        public boolean preferMobileBecauseWifiIsWeak = false;
        public com.tencent.mars.cdn.CronetLogic.UploadParams uploadParams = null;
        public int maxRetryCount = 1;
        public boolean downloadResumption = false;
        public boolean enableVerifyHeader = false;
        public boolean enableUseZstdDecompress = false;

        /* loaded from: classes6.dex */
        public static class CronetTaskType {
            public static final int CUSTOM_FILE_DOWNLOAD = 9;
            public static final int DEFAULT_HTTP_REQUEST = 8;
            public static final int HTTP2_DOWNLOAD = 4;
            public static final int HTTP2_REQUEST = 3;
            public static final int HTTP_CHUNK_REQUEST = 10;
            public static final int HTTP_DOWNLOAD = 2;
            public static final int HTTP_REQUEST = 1;
            public static final int HTTP_UPLOAD = 7;
            public static final int NONE = 0;
            public static final int QUIC_DOWNLOAD = 6;
            public static final int QUIC_REQUEST = 5;
        }

        public void makeRequestHeader(java.util.Map<java.lang.String, java.lang.String> map) {
            if (map == null || !map.isEmpty()) {
                int size = map.size();
                this.headers = new com.tencent.mars.cdn.CronetLogic.HeaderMap[size];
                int i17 = 0;
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                    com.tencent.mars.cdn.CronetLogic.HeaderMap headerMap = new com.tencent.mars.cdn.CronetLogic.HeaderMap();
                    headerMap.key = entry.getKey();
                    headerMap.value = entry.getValue();
                    this.headers[i17] = headerMap;
                    i17++;
                    if (i17 > size) {
                        return;
                    }
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public interface CronetTaskCallback {
        void onCronetReceiveChunkedData(com.tencent.mars.cdn.CronetLogic.ChunkedData chunkedData, long j17);

        int onCronetReceiveHeader(com.tencent.mars.cdn.CronetLogic.ResponseHeader responseHeader, int i17, java.lang.String str);

        void onCronetReceiveUploadProgress(long j17, long j18);

        void onCronetTaskCompleted(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult, java.lang.String str2);

        void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress);
    }

    /* loaded from: classes6.dex */
    public interface CronetTaskNetworkStateCallback {
        void onNetWeakChange(boolean z17);
    }

    /* loaded from: classes7.dex */
    public static class CronetTaskResult {
        public com.tencent.mars.cdn.CronetLogic.WebPageProfile webPageProfile;
        public byte[] data = null;
        public int statusCode = 0;
        public java.lang.String rawHeader = "";
        public java.lang.String newLocation = "";
        public java.lang.String statusText = "";
        public long totalReceiveByte = 0;
        public long totalWriteByte = 0;
        public java.lang.String originTaskId = "";
        public java.lang.String errorMsg = "";
        public int errorCode = 0;
        public int quicErrorCode = 0;
        public com.tencent.mars.cdn.CronetLogic.HeaderMap[] headers = null;
        public int cronetErrorCode = 0;
        public long totalSendByte = 0;
        public boolean useQuic = false;
        public boolean useHttp2 = false;
        public int dnsType = 0;

        public java.lang.String getDataString() {
            try {
                return new java.lang.String(this.data, com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.lang.Exception unused) {
                return "";
            }
        }

        public java.util.Map<java.lang.String, java.lang.String> getHeaderMap() {
            java.lang.String str;
            java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap();
            com.tencent.mars.cdn.CronetLogic.HeaderMap[] headerMapArr = this.headers;
            if (headerMapArr != null) {
                for (com.tencent.mars.cdn.CronetLogic.HeaderMap headerMap : headerMapArr) {
                    if (headerMap != null && (str = headerMap.key) != null && headerMap.value != null) {
                        identityHashMap.put(new java.lang.String(str), headerMap.value);
                    }
                }
            }
            return identityHashMap;
        }

        public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaderMapList() {
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : getHeaderMap().entrySet()) {
                java.lang.String key = entry.getKey();
                if (key != null && !key.isEmpty()) {
                    java.lang.String value = entry.getValue();
                    java.util.List list = (java.util.List) hashMap.get(key);
                    if (list == null) {
                        list = new java.util.ArrayList();
                    }
                    list.add(value);
                    hashMap.put(key, list);
                }
            }
            return hashMap;
        }
    }

    /* loaded from: classes7.dex */
    public static class DefaultHttpTaskParams {
        public int reportId = 0;
    }

    /* loaded from: classes7.dex */
    public static class HeaderMap {
        public java.lang.String key = "";
        public java.lang.String value = "";
    }

    /* loaded from: classes7.dex */
    public static class HostIPHint {
        public com.tencent.mars.cdn.CronetLogic.HostIpMap[] hostMap;
    }

    /* loaded from: classes7.dex */
    public static class HostIpMap {
        public java.lang.String host;

        /* renamed from: ip, reason: collision with root package name */
        public java.lang.String f52523ip;
        public int port;
    }

    /* loaded from: classes7.dex */
    public interface IGetHostIps {
        java.lang.String[] getNewDnsIps(java.lang.String str);
    }

    /* loaded from: classes6.dex */
    public static class QuicForceHost {
        public java.lang.String host;
        public int port;
    }

    /* loaded from: classes6.dex */
    public static class QuicHostMap {
        public java.lang.String host;

        /* renamed from: ip, reason: collision with root package name */
        public java.lang.String f52524ip;
        public int port;
    }

    /* loaded from: classes6.dex */
    public static class QuicTaskParams {
        public com.tencent.mars.cdn.CronetLogic.QuicForceHost[] quicForceHosts;
        public com.tencent.mars.cdn.CronetLogic.QuicHostMap[] quicHostMaps;
    }

    /* loaded from: classes7.dex */
    public static class ResponseHeader {
        public com.tencent.mars.cdn.CronetLogic.HeaderMap[] headers = null;
    }

    /* loaded from: classes7.dex */
    public static class UploadParams {
        public byte[] endData;
        public java.lang.String filePath;
        public byte[] formData;
        public long uploadOffset = 0;
        public long uploadRange = 0;
        public boolean vfsPath = false;
        public int reportId = 0;
    }

    /* loaded from: classes7.dex */
    public static class WebPageProfile {
        public long SSLconnectionEnd;
        public long SSLconnectionStart;
        public long connectEnd;
        public long connectStart;
        public long domainLookUpEnd;
        public long domainLookUpStart;
        public int downstreamThroughputKbpsEstimate;
        public long fetchStart;
        public int httpRttEstimate;
        public int networkTypeEstimate;
        public int port;
        public long receivedBytedCount;
        public long redirectEnd;
        public long redirectStart;
        public long requestEnd;
        public long requestStart;
        public long responseEnd;
        public long responseStart;
        public int rtt;
        public long sendBytesCount;
        public boolean socketReused;
        public int statusCode;
        public int throughputKbps;
        public int transportRttEstimate;
        public java.lang.String protocol = "";
        public java.lang.String peerIP = "";

        public java.lang.String toString() {
            return "WebPageProfile{redirectStart=" + this.redirectStart + ", redirectEnd=" + this.redirectEnd + ", fetchStart=" + this.fetchStart + ", domainLookUpStart=" + this.domainLookUpStart + ", domainLookUpEnd=" + this.domainLookUpEnd + ", connectStart=" + this.connectStart + ", connectEnd=" + this.connectEnd + ", SSLconnectionStart=" + this.SSLconnectionStart + ", SSLconnectionEnd=" + this.SSLconnectionEnd + ", requestStart=" + this.requestStart + ", requestEnd=" + this.requestEnd + ", responseStart=" + this.responseStart + ", responseEnd=" + this.responseEnd + ", protocol='" + this.protocol + "', rtt=" + this.rtt + ", statusCode=" + this.statusCode + ", networkTypeEstimate=" + this.networkTypeEstimate + ", httpRttEstimate=" + this.httpRttEstimate + ", transportRttEstimate=" + this.transportRttEstimate + ", downstreamThroughputKbpsEstimate=" + this.downstreamThroughputKbpsEstimate + ", throughputKbps=" + this.throughputKbps + ", peerIP='" + this.peerIP + "', port=" + this.port + ", socketReused=" + this.socketReused + ", sendBytesCount=" + this.sendBytesCount + ", receivedBytedCount=" + this.receivedBytedCount + '}';
        }
    }

    public static void addCronetTaskNetworkStateCallback(com.tencent.mars.cdn.CronetLogic.CronetTaskNetworkStateCallback cronetTaskNetworkStateCallback) {
        cronetTaskNetworkStateCallbackList.add(cronetTaskNetworkStateCallback);
    }

    public static native void cancelCronetTask(java.lang.String str);

    public static java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaderList(com.tencent.mars.cdn.CronetLogic.ResponseHeader responseHeader) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : getHeaderMap(responseHeader).entrySet()) {
            java.lang.String key = entry.getKey();
            if (key != null && !key.isEmpty()) {
                java.lang.String value = entry.getValue();
                java.util.List list = (java.util.List) hashMap.get(key);
                if (list == null) {
                    list = new java.util.ArrayList();
                }
                list.add(value);
                hashMap.put(key, list);
            }
        }
        return hashMap;
    }

    public static java.util.Map<java.lang.String, java.lang.String> getHeaderMap(com.tencent.mars.cdn.CronetLogic.ResponseHeader responseHeader) {
        com.tencent.mars.cdn.CronetLogic.HeaderMap[] headerMapArr;
        java.lang.String str;
        java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap();
        if (responseHeader != null && (headerMapArr = responseHeader.headers) != null) {
            for (com.tencent.mars.cdn.CronetLogic.HeaderMap headerMap : headerMapArr) {
                if (headerMap != null && (str = headerMap.key) != null && headerMap.value != null) {
                    identityHashMap.put(new java.lang.String(str), headerMap.value);
                }
            }
        }
        return identityHashMap;
    }

    public static java.lang.String getSystemProperty(java.lang.String str) {
        return java.lang.System.getProperty(str);
    }

    public static boolean getUseHttpdns() {
        return useHttpdns;
    }

    public static java.lang.String[] newDns(java.lang.String str) {
        com.tencent.mars.cdn.CronetLogic.IGetHostIps iGetHostIps = getHostImpl;
        if (iGetHostIps != null) {
            return iGetHostIps.getNewDnsIps(str);
        }
        com.tencent.mars.xlog.Log.w(TAG, "null");
        return null;
    }

    public static void notifyCronetWeaknet(boolean z17) {
        com.tencent.mars.xlog.Log.i(TAG, "receive weaknet notify " + (z17 ? 1 : 0));
        java.util.List<com.tencent.mars.cdn.CronetLogic.CronetTaskNetworkStateCallback> list = cronetTaskNetworkStateCallbackList;
        if (list == null || list.size() <= 0) {
            return;
        }
        java.util.Iterator<com.tencent.mars.cdn.CronetLogic.CronetTaskNetworkStateCallback> it = cronetTaskNetworkStateCallbackList.iterator();
        while (it.hasNext()) {
            it.next().onNetWeakChange(z17);
        }
    }

    public static void removeCronetTaskNetworkStateCallback(com.tencent.mars.cdn.CronetLogic.CronetTaskNetworkStateCallback cronetTaskNetworkStateCallback) {
        cronetTaskNetworkStateCallbackList.remove(cronetTaskNetworkStateCallback);
    }

    public static native void removeUserCert();

    public static void reportGroupIDKey(int[] iArr, int[] iArr2, int[] iArr3, int i17) {
        com.tencent.mars.cdn.CronetLogic.CallBack callBack = mCallBack;
        if (callBack == null) {
            com.tencent.mars.xlog.Log.i(TAG, "CallBack is null");
        } else {
            callBack.reportGroupIDKey(iArr, iArr2, iArr3, i17);
        }
    }

    public static void reportIDKey(long j17, long j18, long j19) {
        com.tencent.mars.cdn.CronetLogic.CallBack callBack = mCallBack;
        if (callBack == null) {
            com.tencent.mars.xlog.Log.i(TAG, "CallBack is null");
        } else {
            callBack.reportIDKey(j17, j18, j19);
        }
    }

    public static void reportKV(long j17, java.lang.String str, long j18) {
        com.tencent.mars.cdn.CronetLogic.CallBack callBack = mCallBack;
        if (callBack == null) {
            com.tencent.mars.xlog.Log.i(TAG, "CallBack is null");
        } else {
            callBack.reportKV(j17, str, j18);
        }
    }

    public static void setCallback(com.tencent.mars.cdn.CronetLogic.CallBack callBack) {
        mCallBack = callBack;
    }

    public static void setGetHostImpl(com.tencent.mars.cdn.CronetLogic.IGetHostIps iGetHostIps) {
        getHostImpl = iGetHostIps;
    }

    public static native void setGoodNetNotifyInterval(int i17);

    public static void setSimpleDnsCallback(com.tencent.mars.cdn.CronetLogic.CronetDnsCallback cronetDnsCallback) {
        simpleDnsCallback = cronetDnsCallback;
    }

    public static void setUseHttpdns(boolean z17) {
        com.tencent.mars.xlog.Log.i(TAG, "use httpdns " + z17);
        useHttpdns = z17;
    }

    public static native void setUserCertVerify(boolean z17);

    public static java.lang.String[] simpleDns(java.lang.String str) {
        return simpleDnsCallback.dns(str);
    }

    public static native com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult startCronetDefaultHttpTask(com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams, com.tencent.mars.cdn.CronetLogic.CronetTaskCallback cronetTaskCallback);

    public static native com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult startCronetDownloadTask(com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams, com.tencent.mars.cdn.CronetLogic.CronetTaskCallback cronetTaskCallback);

    public static native com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult startCronetHttpTask(com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams, com.tencent.mars.cdn.CronetLogic.CronetTaskCallback cronetTaskCallback);

    public static native com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult startCronetTask(com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams, com.tencent.mars.cdn.CronetLogic.CronetTaskCallback cronetTaskCallback);

    public static native com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult startCronetUploadTask(com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams, com.tencent.mars.cdn.CronetLogic.CronetTaskCallback cronetTaskCallback);
}
