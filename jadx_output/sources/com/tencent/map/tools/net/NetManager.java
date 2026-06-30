package com.tencent.map.tools.net;

/* loaded from: classes13.dex */
public class NetManager {
    private static com.tencent.map.tools.net.NetManager sInstance;
    private com.tencent.map.tools.net.NetAdapter mAdapter;
    private java.lang.String mGlobalSecretKey;
    private com.tencent.tencentmap.mapsdk.maps.model.LocationRegion thisLocationRegion;
    private com.tencent.mapsdk.internal.lp thisNetStatusObserverOwner;
    private boolean mInited = false;
    private boolean mGlobalForceHttps = true;
    private final java.util.HashMap<java.lang.String, java.lang.String> mGlobalNetFlowRuleList = new java.util.HashMap<>();
    private final java.util.HashSet<java.lang.Class<? extends com.tencent.mapsdk.internal.md>> mGlobalNetFlowProcessorClzList = new java.util.HashSet<>();
    private final com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener thisRegionChangedListener = new com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener() { // from class: com.tencent.map.tools.net.NetManager.1
        @Override // com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener
        public final void onLocationRegionChanged(com.tencent.tencentmap.mapsdk.maps.model.LocationRegion locationRegion, com.tencent.tencentmap.mapsdk.maps.model.LocationRegion locationRegion2) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50225z, "onLocationRegionChanged prev:" + locationRegion + " cur:" + locationRegion2);
            com.tencent.map.tools.net.NetManager.this.thisLocationRegion = locationRegion2;
        }
    };

    /* renamed from: com.tencent.map.tools.net.NetManager$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48687a;

        static {
            int[] iArr = new int[com.tencent.map.tools.net.AdapterType.values().length];
            f48687a = iArr;
            try {
                iArr[com.tencent.map.tools.net.AdapterType.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f48687a[com.tencent.map.tools.net.AdapterType.URL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f48687a[com.tencent.map.tools.net.AdapterType.Halley.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private NetManager() {
    }

    public static com.tencent.map.tools.net.NetAdapter createAdapter(android.content.Context context, com.tencent.map.tools.net.NetConfig netConfig) {
        if (netConfig == null) {
            netConfig = com.tencent.map.tools.net.NetConfig.create().setForceHttps(true).setAdapterType(com.tencent.map.tools.net.AdapterType.URL);
        }
        int[] iArr = com.tencent.map.tools.net.NetManager.AnonymousClass2.f48687a;
        netConfig.getAdapterType().ordinal();
        com.tencent.mapsdk.internal.lr lrVar = new com.tencent.mapsdk.internal.lr();
        lrVar.initNet(context, netConfig);
        return lrVar;
    }

    public static synchronized com.tencent.map.tools.net.NetManager getInstance() {
        com.tencent.map.tools.net.NetManager netManager;
        synchronized (com.tencent.map.tools.net.NetManager.class) {
            if (sInstance == null) {
                sInstance = new com.tencent.map.tools.net.NetManager();
            }
            netManager = sInstance;
        }
        return netManager;
    }

    public static void init(android.content.Context context, com.tencent.map.tools.net.NetConfig netConfig) {
        getInstance().initAdapter(context, createAdapter(context, netConfig));
    }

    public void addNetStatusListener(com.tencent.map.tools.net.NetStatusListener netStatusListener) {
        if (netStatusListener == null) {
            return;
        }
        com.tencent.mapsdk.internal.lp lpVar = this.thisNetStatusObserverOwner;
        if (lpVar.f50338a.containsKey(netStatusListener)) {
            return;
        }
        lpVar.f50338a.put(netStatusListener, java.lang.Boolean.TRUE);
        if (lpVar.f50338a.size() == 1) {
            lpVar.a();
        }
    }

    public void appendNetFlowRules(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        com.tencent.map.tools.net.NetAdapter netAdapter = this.mAdapter;
        if (netAdapter != null) {
            netAdapter.getNetFlowRuleList().putAll(hashMap);
        }
    }

    public boolean available() {
        return this.mAdapter != null && this.mInited;
    }

    public com.tencent.map.tools.net.NetRequest.NetRequestBuilder builder() {
        return builder("");
    }

    public com.tencent.map.tools.net.NetResponse doGet(java.lang.String str, java.lang.String str2, int i17, int i18, java.util.HashMap<java.lang.String, java.lang.String> hashMap, com.tencent.map.tools.net.http.HttpCanceler httpCanceler) {
        return builder().url(str).retryNum(i17).header(hashMap).userAgent(str2).timeOut(i18).canceler(httpCanceler).doGet();
    }

    public com.tencent.map.tools.net.NetResponse doPost(java.lang.String str, java.lang.String str2, byte[] bArr, int i17, int i18, java.util.HashMap<java.lang.String, java.lang.String> hashMap, com.tencent.map.tools.net.http.HttpCanceler httpCanceler) {
        return builder().url(str).userAgent(str2).postData(bArr).retryNum(i17).header(hashMap).timeOut(i18).canceler(httpCanceler).doPost();
    }

    public com.tencent.map.tools.net.NetResponse doRequest(com.tencent.map.tools.net.NetRequest netRequest) {
        return builder(netRequest).doRequest();
    }

    public com.tencent.map.tools.net.NetResponse doStream(com.tencent.map.tools.net.NetRequest netRequest) {
        return builder(netRequest).doStream();
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener getRegionChangedListener() {
        return this.thisRegionChangedListener;
    }

    public void initAdapter(android.content.Context context, com.tencent.map.tools.net.NetAdapter netAdapter) {
        if (netAdapter == null) {
            return;
        }
        com.tencent.map.tools.net.NetAdapter netAdapter2 = this.mAdapter;
        if (netAdapter2 != netAdapter) {
            this.mInited = false;
            if (netAdapter2 != null) {
                netAdapter.getNetFlowRuleList().putAll(this.mAdapter.getNetFlowRuleList());
            }
            this.mAdapter = netAdapter;
            init();
        }
        if (this.thisNetStatusObserverOwner == null) {
            this.thisNetStatusObserverOwner = new com.tencent.mapsdk.internal.lp(context);
        }
    }

    public void removeNetStatusListener(com.tencent.map.tools.net.NetStatusListener netStatusListener) {
        if (netStatusListener == null) {
            return;
        }
        com.tencent.mapsdk.internal.lp lpVar = this.thisNetStatusObserverOwner;
        if (java.lang.Boolean.TRUE.equals(lpVar.f50338a.remove(netStatusListener)) && lpVar.f50338a.isEmpty()) {
            try {
                android.net.ConnectivityManager connectivityManager = lpVar.f50339b.get();
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(lpVar);
                }
            } catch (java.lang.Exception unused) {
            } catch (java.lang.Throwable th6) {
                lpVar.f50341d.removeCallbacks(lpVar.f50340c);
                throw th6;
            }
            lpVar.f50341d.removeCallbacks(lpVar.f50340c);
        }
    }

    public void requestNetworkStatusAsync() {
        this.thisNetStatusObserverOwner.a();
    }

    public void setAdapter(android.content.Context context, com.tencent.map.tools.net.NetAdapter netAdapter) {
        if (netAdapter instanceof com.tencent.map.tools.net.adapter.URLNetImpl) {
            ((com.tencent.map.tools.net.adapter.URLNetImpl) netAdapter).setProxyAdapter(createAdapter(context, com.tencent.map.tools.net.NetConfig.create()));
        }
        initAdapter(context, netAdapter);
    }

    public com.tencent.map.tools.net.NetRequest.NetRequestBuilder builder(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = this.mGlobalSecretKey;
        }
        com.tencent.map.tools.net.NetRequest.NetRequestBuilder netRequestBuilder = new com.tencent.map.tools.net.NetRequest.NetRequestBuilder(this.mAdapter, str, this.thisLocationRegion);
        netRequestBuilder.forceHttps(this.mGlobalForceHttps);
        return netRequestBuilder;
    }

    private void init() {
        com.tencent.map.tools.net.NetAdapter netAdapter;
        if (this.mInited || (netAdapter = this.mAdapter) == null) {
            return;
        }
        this.mInited = true;
        this.thisLocationRegion = null;
        this.mGlobalForceHttps = netAdapter.isForceHttps();
        this.mGlobalSecretKey = this.mAdapter.getSecretKey();
        this.mGlobalNetFlowRuleList.putAll(this.mAdapter.getNetFlowRuleList());
        this.mGlobalNetFlowProcessorClzList.addAll(this.mAdapter.getNetFlowProcessor());
    }

    private com.tencent.map.tools.net.NetRequest.NetRequestBuilder builder(com.tencent.map.tools.net.NetRequest netRequest) {
        return new com.tencent.map.tools.net.NetRequest.NetRequestBuilder(this.mAdapter, this.mGlobalSecretKey, this.thisLocationRegion, netRequest);
    }
}
