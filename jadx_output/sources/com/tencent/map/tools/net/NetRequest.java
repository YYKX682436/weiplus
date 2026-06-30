package com.tencent.map.tools.net;

/* loaded from: classes13.dex */
public class NetRequest {
    public com.tencent.map.tools.net.http.HttpCanceler canceler;
    private java.io.File mCacheFile;
    private boolean mIsLogEnable;
    private com.tencent.map.tools.net.NetAdapter mNetAdapter;
    private java.util.HashSet<java.lang.Class<? extends com.tencent.mapsdk.internal.md>> mNetFlowProcessorClz;
    private java.util.HashMap<java.lang.String, java.lang.String> mNetFlowRules;
    public com.tencent.map.tools.net.NetMethod mNetMethod;
    private java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> mProxyRules;
    private java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> mRegionHostList;
    private java.lang.String mSecretKey;
    public byte[] postData;
    public com.tencent.map.tools.net.http.HttpProxy proxy;
    public int retryMethod;
    public int timeout;
    public java.lang.String url;
    public final long mRequestId = java.lang.System.nanoTime();
    public final java.util.Map<java.lang.String, java.lang.String> mapHeaders = new java.util.HashMap();
    public final java.util.Set<java.lang.String> respHeaders = new java.util.HashSet();
    public final java.util.List<com.tencent.map.tools.net.processor.Processor> processors = new java.util.ArrayList();
    private boolean mForceHttps = true;
    public com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.RegionName mRegionName = com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.RegionName.EARTH;

    /* loaded from: classes13.dex */
    public static class NetRequestBuilder {
        private final com.tencent.map.tools.net.NetRequest mNetRequest;

        public NetRequestBuilder(com.tencent.map.tools.net.NetAdapter netAdapter, java.lang.String str, com.tencent.tencentmap.mapsdk.maps.model.LocationRegion locationRegion) {
            this(netAdapter, str, locationRegion, null);
        }

        private com.tencent.map.tools.net.NetResponse onRequestFinish(com.tencent.map.tools.net.NetResponse netResponse) {
            java.io.FileOutputStream fileOutputStream;
            if (netResponse == null) {
                com.tencent.map.tools.net.NetResponse netResponse2 = new com.tencent.map.tools.net.NetResponse(this.mNetRequest);
                netResponse2.errorCode = -100;
                netResponse2.errorData = "未知".getBytes();
                return netResponse2;
            }
            java.io.File file = this.mNetRequest.mCacheFile;
            if (file != null) {
                java.io.FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        if (file.isFile()) {
                            if (file.exists()) {
                                file.delete();
                            }
                            file.getParentFile().mkdirs();
                            file.createNewFile();
                        }
                        fileOutputStream = new java.io.FileOutputStream(file);
                    } catch (java.lang.Exception e17) {
                        e = e17;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
                try {
                    com.tencent.map.tools.net.NetUtil.writeBytesWithoutClose(netResponse.data, fileOutputStream);
                    com.tencent.map.tools.net.NetUtil.safeClose(fileOutputStream);
                } catch (java.lang.Exception e18) {
                    e = e18;
                    fileOutputStream2 = fileOutputStream;
                    com.tencent.map.tools.net.NetUtil.safeClose(fileOutputStream2);
                    netResponse.exception(e);
                    com.tencent.map.tools.net.NetUtil.safeClose(fileOutputStream2);
                    return netResponse;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    fileOutputStream2 = fileOutputStream;
                    com.tencent.map.tools.net.NetUtil.safeClose(fileOutputStream2);
                    throw th;
                }
            }
            return netResponse;
        }

        private void onRequestStart(java.lang.String str, com.tencent.map.tools.net.NetRequest.NetRequestBuilder netRequestBuilder) {
            netRequestBuilder.addProcessor(new com.tencent.mapsdk.internal.mh(this.mNetRequest.mIsLogEnable));
            netRequestBuilder.addProcessor(com.tencent.mapsdk.internal.mf.a(this.mNetRequest.mForceHttps));
            netRequestBuilder.addProcessor(com.tencent.mapsdk.internal.mg.a(this.mNetRequest.mProxyRules));
            netRequestBuilder.addProcessor(com.tencent.mapsdk.internal.mk.a(this.mNetRequest.mSecretKey));
            netRequestBuilder.addProcessor(new com.tencent.mapsdk.internal.mj(this.mNetRequest.mRegionHostList));
            if (this.mNetRequest.mProxyRules == null || this.mNetRequest.mProxyRules.size() <= 0) {
                java.util.Iterator it = this.mNetRequest.mNetFlowProcessorClz.iterator();
                while (it.hasNext()) {
                    try {
                        netRequestBuilder.addProcessor((com.tencent.mapsdk.internal.md) com.tencent.mapsdk.internal.hp.a((java.lang.Class) it.next(), this.mNetRequest.mNetFlowRules));
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder addProcessor(com.tencent.map.tools.net.processor.Processor processor) {
            this.mNetRequest.addProcessor(processor);
            return this;
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder canceler(com.tencent.map.tools.net.http.HttpCanceler httpCanceler) {
            this.mNetRequest.canceler = httpCanceler;
            return this;
        }

        public com.tencent.map.tools.net.NetResponse doGet() {
            onRequestStart("doGet", this);
            return onRequestFinish(this.mNetRequest.doGet());
        }

        public com.tencent.map.tools.net.NetResponse doPost() {
            onRequestStart("doPost", this);
            return onRequestFinish(this.mNetRequest.doPost());
        }

        public com.tencent.map.tools.net.NetResponse doRequest() {
            onRequestStart("doRequest", this);
            return onRequestFinish(this.mNetRequest.doRequest());
        }

        public com.tencent.map.tools.net.NetResponse doStream() {
            onRequestStart("doStream", this);
            return onRequestFinish(this.mNetRequest.doStream());
        }

        public com.tencent.map.tools.net.NetResponse downloadTo(java.io.File file) {
            onRequestStart("downloadTo[" + file + "]", this);
            return file(file).doGet();
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder file(java.io.File file) {
            this.mNetRequest.mCacheFile = file;
            return this;
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder forceHttps(boolean z17) {
            this.mNetRequest.mForceHttps = z17;
            return this;
        }

        public com.tencent.map.tools.net.NetRequest getNetRequest() {
            return this.mNetRequest;
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder gzip() {
            header("Accept-Encoding", "gzip");
            return this;
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder header(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            this.mNetRequest.setMapHeaders(hashMap);
            return this;
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder nonce(java.lang.String str) {
            this.mNetRequest.setNonce(str);
            return this;
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder postData(byte[] bArr) {
            this.mNetRequest.postData = bArr;
            return this;
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder proxy(com.tencent.map.tools.net.http.HttpProxy httpProxy) {
            this.mNetRequest.proxy = httpProxy;
            return this;
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder region(com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.RegionName regionName) {
            this.mNetRequest.mRegionName = regionName;
            return this;
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder retryNum(int i17) {
            this.mNetRequest.retryMethod = i17;
            return this;
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder startTag(java.lang.String str) {
            this.mNetRequest.setStart(str);
            return this;
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder timeOut(int i17) {
            this.mNetRequest.timeout = i17;
            return this;
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder timestamp(java.lang.String str) {
            this.mNetRequest.setTimeStamp(str);
            return this;
        }

        public java.lang.String toString() {
            return "NetRequestBuilder{, mRequestId=" + this.mNetRequest.mRequestId + ", mNetRequest=" + this.mNetRequest + '}';
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder token(java.lang.String str) {
            this.mNetRequest.setToken(str);
            return this;
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder url(java.lang.String str) {
            this.mNetRequest.url = str;
            return this;
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder userAgent(java.lang.String str) {
            this.mNetRequest.setUserAgent(str);
            return this;
        }

        public NetRequestBuilder(com.tencent.map.tools.net.NetAdapter netAdapter, java.lang.String str, com.tencent.tencentmap.mapsdk.maps.model.LocationRegion locationRegion, com.tencent.map.tools.net.NetRequest netRequest) {
            if (netRequest == null) {
                this.mNetRequest = new com.tencent.map.tools.net.NetRequest().setTimeout(10000).setRetryMethod(1);
            } else {
                this.mNetRequest = netRequest;
            }
            this.mNetRequest.mNetAdapter = netAdapter;
            this.mNetRequest.mSecretKey = str;
            this.mNetRequest.mProxyRules = netAdapter.getProxyRuleList();
            this.mNetRequest.mIsLogEnable = netAdapter.isLogEnable();
            this.mNetRequest.mNetFlowProcessorClz = netAdapter.getNetFlowProcessor();
            this.mNetRequest.mNetFlowRules = netAdapter.getNetFlowRuleList();
            this.mNetRequest.mRegionHostList = netAdapter.getRegionHostList();
            if (locationRegion != null) {
                this.mNetRequest.mRegionName = locationRegion.regionName;
            }
        }

        public com.tencent.map.tools.net.NetRequest.NetRequestBuilder header(java.lang.String str, java.lang.String str2) {
            this.mNetRequest.setMapHeaders(str, str2);
            return this;
        }
    }

    public NetRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.map.tools.net.NetResponse doGet() {
        setNetMethod(com.tencent.map.tools.net.NetMethod.GET);
        return this.mNetAdapter.doRequest(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.map.tools.net.NetResponse doPost() {
        setNetMethod(com.tencent.map.tools.net.NetMethod.POST);
        return this.mNetAdapter.doRequest(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.map.tools.net.NetResponse doRequest() {
        return this.mNetAdapter.doRequest(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.map.tools.net.NetResponse doStream() {
        setNetMethod(com.tencent.map.tools.net.NetMethod.GET);
        return this.mNetAdapter.openStream(this);
    }

    public com.tencent.map.tools.net.NetRequest addProcessor(com.tencent.map.tools.net.processor.Processor processor) {
        this.processors.add(processor);
        return this;
    }

    public com.tencent.map.tools.net.NetRequest setCanceler(com.tencent.map.tools.net.http.HttpCanceler httpCanceler) {
        this.canceler = httpCanceler;
        return this;
    }

    public com.tencent.map.tools.net.NetRequest setMapHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null) {
            return this;
        }
        this.mapHeaders.putAll(map);
        return this;
    }

    public com.tencent.map.tools.net.NetRequest setNetMethod(com.tencent.map.tools.net.NetMethod netMethod) {
        this.mNetMethod = netMethod;
        return this;
    }

    public com.tencent.map.tools.net.NetRequest setNonce(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.mapHeaders.put("nonce", str);
        }
        return this;
    }

    public com.tencent.map.tools.net.NetRequest setPostData(byte[] bArr) {
        this.postData = bArr;
        return this;
    }

    public com.tencent.map.tools.net.NetRequest setRespHeaders(java.lang.String... strArr) {
        this.respHeaders.addAll(java.util.Arrays.asList((java.lang.Object[]) strArr.clone()));
        return this;
    }

    public com.tencent.map.tools.net.NetRequest setRetryMethod(int i17) {
        this.retryMethod = i17;
        return this;
    }

    public com.tencent.map.tools.net.NetRequest setStart(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.mapHeaders.put("Range", "bytes=" + str + "-");
        }
        return this;
    }

    public com.tencent.map.tools.net.NetRequest setTimeStamp(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.mapHeaders.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, str);
        }
        return this;
    }

    public com.tencent.map.tools.net.NetRequest setTimeout(int i17) {
        this.timeout = i17;
        return this;
    }

    public com.tencent.map.tools.net.NetRequest setToken(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.mapHeaders.put("Sign", str);
        }
        return this;
    }

    public com.tencent.map.tools.net.NetRequest setUrl(java.lang.String str) {
        this.url = str;
        return this;
    }

    public com.tencent.map.tools.net.NetRequest setUserAgent(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.mapHeaders.put("User-Agent", str);
        }
        return this;
    }

    public java.lang.String toString() {
        return "NetRequest{mRequestId=" + this.mRequestId + ", mNetMethod=" + this.mNetMethod + ", url='" + this.url + "', postData=" + java.util.Arrays.toString(this.postData) + ", retryMethod=" + this.retryMethod + ", mapHeaders=" + this.mapHeaders + ", respHeaders=" + this.respHeaders + ", processorSet=" + this.processors + ", canceler=" + this.canceler + ", timeout=" + this.timeout + ", proxy=" + this.proxy + '}';
    }

    public com.tencent.map.tools.net.NetRequest setMapHeaders(java.lang.String str, java.lang.String str2) {
        this.mapHeaders.put(str, str2);
        return this;
    }

    public NetRequest(com.tencent.map.tools.net.NetMethod netMethod, java.lang.String str) {
        this.mNetMethod = netMethod;
        this.url = str;
    }
}
