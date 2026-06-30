package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class lq implements com.tencent.map.tools.net.NetAdapter {

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f50344b = "NetImpl";

    /* renamed from: a, reason: collision with root package name */
    protected android.os.Bundle f50345a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f50347d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> f50348e;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f50352i;

    /* renamed from: c, reason: collision with root package name */
    private boolean f50346c = true;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.HashMap<java.lang.String, java.lang.String> f50349f = new java.util.HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final java.util.HashSet<java.lang.Class<? extends com.tencent.mapsdk.internal.md>> f50350g = new java.util.HashSet<>();

    /* renamed from: h, reason: collision with root package name */
    private final java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> f50351h = new java.util.HashMap<>();

    private void a(boolean z17) {
        this.f50346c = z17;
    }

    private void b(boolean z17) {
        this.f50347d = z17;
    }

    public abstract com.tencent.map.tools.net.NetResponse a(com.tencent.map.tools.net.NetRequest netRequest);

    public abstract void a();

    public abstract com.tencent.map.tools.net.NetResponse b(com.tencent.map.tools.net.NetRequest netRequest);

    @Override // com.tencent.map.tools.net.NetAdapter
    public com.tencent.map.tools.net.NetResponse doGet(com.tencent.map.tools.net.NetRequest netRequest) {
        return a(netRequest);
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public com.tencent.map.tools.net.NetResponse doPost(com.tencent.map.tools.net.NetRequest netRequest) {
        return b(netRequest);
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public java.util.HashSet<java.lang.Class<? extends com.tencent.mapsdk.internal.md>> getNetFlowProcessor() {
        return this.f50350g;
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public java.util.HashMap<java.lang.String, java.lang.String> getNetFlowRuleList() {
        return this.f50349f;
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> getProxyRuleList() {
        return this.f50348e;
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> getRegionHostList() {
        return this.f50351h;
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public java.lang.String getSecretKey() {
        return this.f50352i;
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public void initNet(android.content.Context context, com.tencent.map.tools.net.NetConfig netConfig) {
        try {
            this.f50346c = netConfig.isForceHttps();
            this.f50347d = netConfig.isLogEnable();
            this.f50348e = netConfig.getProxyRuleList();
            this.f50349f.putAll(netConfig.getNetFlowRuleList());
            this.f50352i = netConfig.getSecretKey();
            this.f50350g.add(netConfig.getProcessor());
            java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> regionHostList = netConfig.getRegionHostList();
            if (regionHostList != null) {
                this.f50351h.putAll(regionHostList);
            }
            this.f50345a = netConfig.getArguments();
            a();
        } catch (java.lang.Exception e17) {
            com.tencent.mapsdk.core.utils.log.LogUtil.e(f50344b, "initNet error:" + e17.toString());
        }
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public boolean isForceHttps() {
        return this.f50346c;
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public boolean isLogEnable() {
        return this.f50347d;
    }

    private void a(java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> list) {
        this.f50348e = list;
    }

    private void b(java.lang.String str) {
        this.f50352i = str;
    }

    private void a(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        this.f50349f.putAll(hashMap);
    }

    private void b(java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> hashMap) {
        if (hashMap != null) {
            this.f50351h.putAll(hashMap);
        }
    }

    private void a(java.lang.Class<? extends com.tencent.mapsdk.internal.md> cls) {
        this.f50350g.add(cls);
    }

    public static java.lang.String a(java.lang.String str) {
        if (str != null) {
            java.lang.String[] split = str.split(";");
            int length = split.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                java.lang.String str2 = split[i17];
                if (str2.contains("charset")) {
                    java.lang.String[] split2 = str2.split("=");
                    if (split2.length > 1) {
                        return split2[1].trim();
                    }
                } else {
                    i17++;
                }
            }
        }
        return "GBK";
    }
}
