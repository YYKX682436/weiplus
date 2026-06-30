package com.p314xaae8f345.p542x3306d5.cdn;

/* renamed from: com.tencent.mars.cdn.CronetLogic */
/* loaded from: classes7.dex */
public class C4447x56271981 {
    protected static final java.lang.String TAG = "mars::CronetLogic";

    /* renamed from: cronetTaskNetworkStateCallbackList */
    protected static java.util.List<com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskNetworkStateCallback> f18143xf3682628 = new java.util.ArrayList();

    /* renamed from: getHostImpl */
    protected static com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.IGetHostIps f18144x69eaf55e;

    /* renamed from: mCallBack */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CallBack f18145x1aab3bf2;

    /* renamed from: simpleDnsCallback */
    protected static com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDnsCallback f18146x9596a37c;

    /* renamed from: useHttpdns */
    protected static boolean f18147xe96f2c1a;

    /* renamed from: com.tencent.mars.cdn.CronetLogic$CallBack */
    /* loaded from: classes7.dex */
    public interface CallBack {
        /* renamed from: reportGroupIDKey */
        void mo37965xc9114479(int[] iArr, int[] iArr2, int[] iArr3, int i17);

        /* renamed from: reportIDKey */
        void mo37966xf0018e90(long j17, long j18, long j19);

        /* renamed from: reportKV */
        void mo37967xe68be19f(long j17, java.lang.String str, long j18);
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$ChunkedData */
    /* loaded from: classes6.dex */
    public static class ChunkedData {

        /* renamed from: data */
        public byte[] f18148x2eefaa = null;
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$CronetDnsCallback */
    /* loaded from: classes6.dex */
    public interface CronetDnsCallback {
        java.lang.String[] dns(java.lang.String str);
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$CronetDnsType */
    /* loaded from: classes6.dex */
    public static class CronetDnsType {

        /* renamed from: BACKUP_DNS */
        public static final int f18149xe550f10c = 4;

        /* renamed from: CELLULAR_DNS */
        public static final int f18150x54f93cb4 = 5;

        /* renamed from: DEFAULT */
        public static final int f18151x86df6221 = 0;

        /* renamed from: HTTP_DNS */
        public static final int f18152x26cab4d2 = 3;

        /* renamed from: NEW_DNS */
        public static final int f18153x98daa5ca = 2;

        /* renamed from: SIMPLE_DNS */
        public static final int f18154xc7a934fc = 1;
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$CronetDownloadProgress */
    /* loaded from: classes7.dex */
    public static class CronetDownloadProgress {

        /* renamed from: totalByte */
        public long f18156xdd8f6e6c = 0;

        /* renamed from: currentWriteByte */
        public long f18155xf006a00e = 0;
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$CronetHttpsCreateResult */
    /* loaded from: classes7.dex */
    public static class CronetHttpsCreateResult {

        /* renamed from: createRet */
        public int f18157x23aa2e05 = 0;

        /* renamed from: taskId */
        public java.lang.String f18158xcb7ef180 = "";
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$CronetRequestParams */
    /* loaded from: classes7.dex */
    public static class CronetRequestParams {
        public java.lang.String url = "";

        /* renamed from: taskId */
        public java.lang.String f18180xcb7ef180 = "";

        /* renamed from: header */
        public java.lang.String f18169xb734e28d = "";

        /* renamed from: bodyData */
        public byte[] f18159x6574fc6c = null;

        /* renamed from: method */
        public java.lang.String f18174xbfc5d0e1 = "";

        /* renamed from: savePath */
        public java.lang.String f18179x84749342 = "";

        /* renamed from: needWriteLocal */
        public boolean f18177xa943cc02 = false;

        /* renamed from: followRedirect */
        public boolean f18166x25da56ad = false;

        /* renamed from: maxRedirectCount */
        public int f18172x2e85f8f = 2;

        /* renamed from: taskType */
        public int f18181xe78dee5f = 0;

        /* renamed from: useMemoryCache */
        public boolean f18184x1eb6f2fa = false;

        /* renamed from: needGenerateId */
        public boolean f18176xe274b6a6 = true;

        /* renamed from: defaultHttpTaskParams */
        public com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.DefaultHttpTaskParams f18160x5f211ab4 = null;

        /* renamed from: headers */
        public com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap[] f18170x2f676f86 = null;

        /* renamed from: useHttp2 */
        public boolean f18183xeddcaf63 = false;

        /* renamed from: useQuic */
        public boolean f18185xf72c4065 = false;

        /* renamed from: enableBrotli */
        public boolean f18163x7e503dd5 = false;

        /* renamed from: hostIPHint */
        public com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HostIPHint f18171xab1787f6 = null;

        /* renamed from: dnsType */
        public int f18161x6c20cc03 = 0;

        /* renamed from: forbidSocketReuse */
        public boolean f18167xdeb9da8d = false;

        /* renamed from: miniPrograms */
        public boolean f18175xe83ff3e6 = false;

        /* renamed from: forceBindMobileNetwork */
        public boolean f18168x1292e644 = false;

        /* renamed from: preferMobileBecauseWifiIsWeak */
        public boolean f18178x9602f52b = false;

        /* renamed from: uploadParams */
        public com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.UploadParams f18182x9537aee7 = null;

        /* renamed from: maxRetryCount */
        public int f18173x74c0bbcb = 1;

        /* renamed from: downloadResumption */
        public boolean f18162x5806d9f4 = false;

        /* renamed from: enableVerifyHeader */
        public boolean f18165x49e3a589 = false;

        /* renamed from: enableUseZstdDecompress */
        public boolean f18164xd851d150 = false;

        /* renamed from: com.tencent.mars.cdn.CronetLogic$CronetRequestParams$CronetTaskType */
        /* loaded from: classes6.dex */
        public static class CronetTaskType {

            /* renamed from: CUSTOM_FILE_DOWNLOAD */
            public static final int f18186x8e995f9d = 9;

            /* renamed from: DEFAULT_HTTP_REQUEST */
            public static final int f18187xde0d6316 = 8;

            /* renamed from: HTTP2_DOWNLOAD */
            public static final int f18188x169ef87d = 4;

            /* renamed from: HTTP2_REQUEST */
            public static final int f18189xbb29ebda = 3;

            /* renamed from: HTTP_CHUNK_REQUEST */
            public static final int f18190x87c7f706 = 10;

            /* renamed from: HTTP_DOWNLOAD */
            public static final int f18191x5648025f = 2;

            /* renamed from: HTTP_REQUEST */
            public static final int f18192x7b271db8 = 1;

            /* renamed from: HTTP_UPLOAD */
            public static final int f18193x5c44d598 = 7;

            /* renamed from: NONE */
            public static final int f18194x24a738 = 0;

            /* renamed from: QUIC_DOWNLOAD */
            public static final int f18195xf3067569 = 6;

            /* renamed from: QUIC_REQUEST */
            public static final int f18196x4ea9216e = 5;
        }

        /* renamed from: makeRequestHeader */
        public void m37968xeb7416ae(java.util.Map<java.lang.String, java.lang.String> map) {
            if (map == null || !map.isEmpty()) {
                int size = map.size();
                this.f18170x2f676f86 = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap[size];
                int i17 = 0;
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                    com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap headerMap = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap();
                    headerMap.key = entry.getKey();
                    headerMap.f18216x6ac9171 = entry.getValue();
                    this.f18170x2f676f86[i17] = headerMap;
                    i17++;
                    if (i17 > size) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$CronetTaskCallback */
    /* loaded from: classes7.dex */
    public interface CronetTaskCallback {
        /* renamed from: onCronetReceiveChunkedData */
        void mo37969x6a58464f(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ChunkedData chunkedData, long j17);

        /* renamed from: onCronetReceiveHeader */
        int mo37970x82943234(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ResponseHeader responseHeader, int i17, java.lang.String str);

        /* renamed from: onCronetReceiveUploadProgress */
        void mo37971x77ce5bf5(long j17, long j18);

        /* renamed from: onCronetTaskCompleted */
        void mo37972x5b5f2d2a(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult, java.lang.String str2);

        /* renamed from: onDownloadProgressChanged */
        void mo37973x617c4940(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress);
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$CronetTaskNetworkStateCallback */
    /* loaded from: classes6.dex */
    public interface CronetTaskNetworkStateCallback {
        /* renamed from: onNetWeakChange */
        void mo1151xa4d0ef26(boolean z17);
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$CronetTaskResult */
    /* loaded from: classes7.dex */
    public static class CronetTaskResult {

        /* renamed from: webPageProfile */
        public com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.WebPageProfile f18214x153dd026;

        /* renamed from: data */
        public byte[] f18198x2eefaa = null;

        /* renamed from: statusCode */
        public int f18207xec0a8ff = 0;

        /* renamed from: rawHeader */
        public java.lang.String f18206x7a6ac8d5 = "";

        /* renamed from: newLocation */
        public java.lang.String f18203xbc380d75 = "";

        /* renamed from: statusText */
        public java.lang.String f18208xec8403f = "";

        /* renamed from: totalReceiveByte */
        public long f18209x953f8a7 = 0;

        /* renamed from: totalWriteByte */
        public long f18211xdd08d6a3 = 0;

        /* renamed from: originTaskId */
        public java.lang.String f18204x68b31846 = "";

        /* renamed from: errorMsg */
        public java.lang.String f18201x5336c059 = "";

        /* renamed from: errorCode */
        public int f18200x139cb015 = 0;

        /* renamed from: quicErrorCode */
        public int f18205xe1495377 = 0;

        /* renamed from: headers */
        public com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap[] f18202x2f676f86 = null;

        /* renamed from: cronetErrorCode */
        public int f18197x85358d8 = 0;

        /* renamed from: totalSendByte */
        public long f18210x4be65c14 = 0;

        /* renamed from: useQuic */
        public boolean f18213xf72c4065 = false;

        /* renamed from: useHttp2 */
        public boolean f18212xeddcaf63 = false;

        /* renamed from: dnsType */
        public int f18199x6c20cc03 = 0;

        /* renamed from: getDataString */
        public java.lang.String m37974x3a5e0c51() {
            try {
                return new java.lang.String(this.f18198x2eefaa, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            } catch (java.lang.Exception unused) {
                return "";
            }
        }

        /* renamed from: getHeaderMap */
        public java.util.Map<java.lang.String, java.lang.String> m37975xf2b694d9() {
            java.lang.String str;
            java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap();
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap[] headerMapArr = this.f18202x2f676f86;
            if (headerMapArr != null) {
                for (com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap headerMap : headerMapArr) {
                    if (headerMap != null && (str = headerMap.key) != null && headerMap.f18216x6ac9171 != null) {
                        identityHashMap.put(new java.lang.String(str), headerMap.f18216x6ac9171);
                    }
                }
            }
            return identityHashMap;
        }

        /* renamed from: getHeaderMapList */
        public java.util.Map<java.lang.String, java.util.List<java.lang.String>> m37976xd962a517() {
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : m37975xf2b694d9().entrySet()) {
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

    /* renamed from: com.tencent.mars.cdn.CronetLogic$DefaultHttpTaskParams */
    /* loaded from: classes7.dex */
    public static class DefaultHttpTaskParams {

        /* renamed from: reportId */
        public int f18215xe68be16f = 0;
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$HeaderMap */
    /* loaded from: classes7.dex */
    public static class HeaderMap {
        public java.lang.String key = "";

        /* renamed from: value */
        public java.lang.String f18216x6ac9171 = "";
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$HostIPHint */
    /* loaded from: classes7.dex */
    public static class HostIPHint {

        /* renamed from: hostMap */
        public com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HostIpMap[] f18217x417c7694;
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$HostIpMap */
    /* loaded from: classes7.dex */
    public static class HostIpMap {

        /* renamed from: host */
        public java.lang.String f18218x30f5a8;

        /* renamed from: ip, reason: collision with root package name */
        public java.lang.String f134056ip;

        /* renamed from: port */
        public int f18219x349881;
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$IGetHostIps */
    /* loaded from: classes7.dex */
    public interface IGetHostIps {
        /* renamed from: getNewDnsIps */
        java.lang.String[] mo37977xc1fe6d4d(java.lang.String str);
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$QuicForceHost */
    /* loaded from: classes6.dex */
    public static class QuicForceHost {

        /* renamed from: host */
        public java.lang.String f18220x30f5a8;

        /* renamed from: port */
        public int f18221x349881;
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$QuicHostMap */
    /* loaded from: classes6.dex */
    public static class QuicHostMap {

        /* renamed from: host */
        public java.lang.String f18222x30f5a8;

        /* renamed from: ip, reason: collision with root package name */
        public java.lang.String f134057ip;

        /* renamed from: port */
        public int f18223x349881;
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$QuicTaskParams */
    /* loaded from: classes6.dex */
    public static class QuicTaskParams {

        /* renamed from: quicForceHosts */
        public com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.QuicForceHost[] f18224xeeaa287e;

        /* renamed from: quicHostMaps */
        public com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.QuicHostMap[] f18225xec72c4bd;
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$ResponseHeader */
    /* loaded from: classes7.dex */
    public static class ResponseHeader {

        /* renamed from: headers */
        public com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap[] f18226x2f676f86 = null;
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$UploadParams */
    /* loaded from: classes7.dex */
    public static class UploadParams {

        /* renamed from: endData */
        public byte[] f18227xa02c0725;

        /* renamed from: filePath */
        public java.lang.String f18228xd426afc1;

        /* renamed from: formData */
        public byte[] f18229x1c346e8e;

        /* renamed from: uploadOffset */
        public long f18231x93c419f4 = 0;

        /* renamed from: uploadRange */
        public long f18232x3ebad3bc = 0;

        /* renamed from: vfsPath */
        public boolean f18233x16a80688 = false;

        /* renamed from: reportId */
        public int f18230xe68be16f = 0;
    }

    /* renamed from: com.tencent.mars.cdn.CronetLogic$WebPageProfile */
    /* loaded from: classes7.dex */
    public static class WebPageProfile {

        /* renamed from: SSLconnectionEnd */
        public long f18234x33aefab1;

        /* renamed from: SSLconnectionStart */
        public long f18235x4a318b8;

        /* renamed from: connectEnd */
        public long f18236xd1c3f791;

        /* renamed from: connectStart */
        public long f18237x716c5d98;

        /* renamed from: domainLookUpEnd */
        public long f18238x4494b47d;

        /* renamed from: domainLookUpStart */
        public long f18239x73018f84;

        /* renamed from: downstreamThroughputKbpsEstimate */
        public int f18240xf406656e;

        /* renamed from: fetchStart */
        public long f18241x1193f1c8;

        /* renamed from: httpRttEstimate */
        public int f18242x6b4f2c12;

        /* renamed from: networkTypeEstimate */
        public int f18243x64c417d0;

        /* renamed from: port */
        public int f18245x349881;

        /* renamed from: receivedBytedCount */
        public long f18247x806c1ad4;

        /* renamed from: redirectEnd */
        public long f18248x7570bb5f;

        /* renamed from: redirectStart */
        public long f18249xdcf765e6;

        /* renamed from: requestEnd */
        public long f18250x235dfcc;

        /* renamed from: requestStart */
        public long f18251x4d052313;

        /* renamed from: responseEnd */
        public long f18252x6e1f08da;

        /* renamed from: responseStart */
        public long f18253x634840a1;
        public int rtt;

        /* renamed from: sendBytesCount */
        public long f18254xd0450d0c;

        /* renamed from: socketReused */
        public boolean f18255xfad511c3;

        /* renamed from: statusCode */
        public int f18256xec0a8ff;

        /* renamed from: throughputKbps */
        public int f18257xad79e6e4;

        /* renamed from: transportRttEstimate */
        public int f18258x16957ed1;

        /* renamed from: protocol */
        public java.lang.String f18246xc50a8e98 = "";

        /* renamed from: peerIP */
        public java.lang.String f18244xc4ddaa09 = "";

        /* renamed from: toString */
        public java.lang.String m37978x9616526c() {
            return "WebPageProfile{redirectStart=" + this.f18249xdcf765e6 + ", redirectEnd=" + this.f18248x7570bb5f + ", fetchStart=" + this.f18241x1193f1c8 + ", domainLookUpStart=" + this.f18239x73018f84 + ", domainLookUpEnd=" + this.f18238x4494b47d + ", connectStart=" + this.f18237x716c5d98 + ", connectEnd=" + this.f18236xd1c3f791 + ", SSLconnectionStart=" + this.f18235x4a318b8 + ", SSLconnectionEnd=" + this.f18234x33aefab1 + ", requestStart=" + this.f18251x4d052313 + ", requestEnd=" + this.f18250x235dfcc + ", responseStart=" + this.f18253x634840a1 + ", responseEnd=" + this.f18252x6e1f08da + ", protocol='" + this.f18246xc50a8e98 + "', rtt=" + this.rtt + ", statusCode=" + this.f18256xec0a8ff + ", networkTypeEstimate=" + this.f18243x64c417d0 + ", httpRttEstimate=" + this.f18242x6b4f2c12 + ", transportRttEstimate=" + this.f18258x16957ed1 + ", downstreamThroughputKbpsEstimate=" + this.f18240xf406656e + ", throughputKbps=" + this.f18257xad79e6e4 + ", peerIP='" + this.f18244xc4ddaa09 + "', port=" + this.f18245x349881 + ", socketReused=" + this.f18255xfad511c3 + ", sendBytesCount=" + this.f18254xd0450d0c + ", receivedBytedCount=" + this.f18247x806c1ad4 + '}';
        }
    }

    /* renamed from: addCronetTaskNetworkStateCallback */
    public static void m37940xb2713b6b(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskNetworkStateCallback cronetTaskNetworkStateCallback) {
        f18143xf3682628.add(cronetTaskNetworkStateCallback);
    }

    /* renamed from: cancelCronetTask */
    public static native void m37941xd93b98fc(java.lang.String str);

    /* renamed from: getHeaderList */
    public static java.util.Map<java.lang.String, java.util.List<java.lang.String>> m37942x641bb0c1(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ResponseHeader responseHeader) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : m37943xf2b694d9(responseHeader).entrySet()) {
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

    /* renamed from: getHeaderMap */
    public static java.util.Map<java.lang.String, java.lang.String> m37943xf2b694d9(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ResponseHeader responseHeader) {
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap[] headerMapArr;
        java.lang.String str;
        java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap();
        if (responseHeader != null && (headerMapArr = responseHeader.f18226x2f676f86) != null) {
            for (com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap headerMap : headerMapArr) {
                if (headerMap != null && (str = headerMap.key) != null && headerMap.f18216x6ac9171 != null) {
                    identityHashMap.put(new java.lang.String(str), headerMap.f18216x6ac9171);
                }
            }
        }
        return identityHashMap;
    }

    /* renamed from: getSystemProperty */
    public static java.lang.String m37944x585ae21a(java.lang.String str) {
        return java.lang.System.getProperty(str);
    }

    /* renamed from: getUseHttpdns */
    public static boolean m37945xd7afe410() {
        return f18147xe96f2c1a;
    }

    /* renamed from: newDns */
    public static java.lang.String[] m37946xc17b7f69(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.IGetHostIps iGetHostIps = f18144x69eaf55e;
        if (iGetHostIps != null) {
            return iGetHostIps.mo37977xc1fe6d4d(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "null");
        return null;
    }

    /* renamed from: notifyCronetWeaknet */
    public static void m37947xd8cbabdf(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "receive weaknet notify " + (z17 ? 1 : 0));
        java.util.List<com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskNetworkStateCallback> list = f18143xf3682628;
        if (list == null || list.size() <= 0) {
            return;
        }
        java.util.Iterator<com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskNetworkStateCallback> it = f18143xf3682628.iterator();
        while (it.hasNext()) {
            it.next().mo1151xa4d0ef26(z17);
        }
    }

    /* renamed from: removeCronetTaskNetworkStateCallback */
    public static void m37948x9abc0c0e(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskNetworkStateCallback cronetTaskNetworkStateCallback) {
        f18143xf3682628.remove(cronetTaskNetworkStateCallback);
    }

    /* renamed from: removeUserCert */
    public static native void m37949x910ca533();

    /* renamed from: reportGroupIDKey */
    public static void m37950xc9114479(int[] iArr, int[] iArr2, int[] iArr3, int i17) {
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CallBack callBack = f18145x1aab3bf2;
        if (callBack == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "CallBack is null");
        } else {
            callBack.mo37965xc9114479(iArr, iArr2, iArr3, i17);
        }
    }

    /* renamed from: reportIDKey */
    public static void m37951xf0018e90(long j17, long j18, long j19) {
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CallBack callBack = f18145x1aab3bf2;
        if (callBack == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "CallBack is null");
        } else {
            callBack.mo37966xf0018e90(j17, j18, j19);
        }
    }

    /* renamed from: reportKV */
    public static void m37952xe68be19f(long j17, java.lang.String str, long j18) {
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CallBack callBack = f18145x1aab3bf2;
        if (callBack == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "CallBack is null");
        } else {
            callBack.mo37967xe68be19f(j17, str, j18);
        }
    }

    /* renamed from: setCallback */
    public static void m37953x6c4ebec7(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CallBack callBack) {
        f18145x1aab3bf2 = callBack;
    }

    /* renamed from: setGetHostImpl */
    public static void m37954xda26af9c(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.IGetHostIps iGetHostIps) {
        f18144x69eaf55e = iGetHostIps;
    }

    /* renamed from: setGoodNetNotifyInterval */
    public static native void m37955xf6319bac(int i17);

    /* renamed from: setSimpleDnsCallback */
    public static void m37956xc461373a(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDnsCallback cronetDnsCallback) {
        f18146x9596a37c = cronetDnsCallback;
    }

    /* renamed from: setUseHttpdns */
    public static void m37957x5d4321c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "use httpdns " + z17);
        f18147xe96f2c1a = z17;
    }

    /* renamed from: setUserCertVerify */
    public static native void m37958xae0bceea(boolean z17);

    /* renamed from: simpleDns */
    public static java.lang.String[] m37959x81602617(java.lang.String str) {
        return f18146x9596a37c.dns(str);
    }

    /* renamed from: startCronetDefaultHttpTask */
    public static native com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetHttpsCreateResult m37960x884bdecf(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback cronetTaskCallback);

    /* renamed from: startCronetDownloadTask */
    public static native com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetHttpsCreateResult m37961xaa3ad68c(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback cronetTaskCallback);

    /* renamed from: startCronetHttpTask */
    public static native com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetHttpsCreateResult m37962x5ffa1e0c(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback cronetTaskCallback);

    /* renamed from: startCronetTask */
    public static native com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetHttpsCreateResult m37963x6897ece4(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback cronetTaskCallback);

    /* renamed from: startCronetUploadTask */
    public static native com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetHttpsCreateResult m37964x2ef4345(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback cronetTaskCallback);
}
