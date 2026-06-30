package com.tencent.map.tools.net.adapter;

/* loaded from: classes13.dex */
public class URLNetImpl implements com.tencent.map.tools.net.NetAdapter {
    private com.tencent.map.tools.net.NetAdapter mProxy = new com.tencent.mapsdk.internal.lr();

    @Override // com.tencent.map.tools.net.NetAdapter
    public boolean cancel() {
        return this.mProxy.cancel();
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public com.tencent.map.tools.net.NetResponse doGet(com.tencent.map.tools.net.NetRequest netRequest) {
        return this.mProxy.doGet(netRequest);
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public com.tencent.map.tools.net.NetResponse doPost(com.tencent.map.tools.net.NetRequest netRequest) {
        return this.mProxy.doPost(netRequest);
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public com.tencent.map.tools.net.NetResponse doRequest(com.tencent.map.tools.net.NetRequest netRequest) {
        return this.mProxy.doRequest(netRequest);
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public java.util.HashSet<java.lang.Class<? extends com.tencent.mapsdk.internal.md>> getNetFlowProcessor() {
        return this.mProxy.getNetFlowProcessor();
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public java.util.HashMap<java.lang.String, java.lang.String> getNetFlowRuleList() {
        return this.mProxy.getNetFlowRuleList();
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> getProxyRuleList() {
        return this.mProxy.getProxyRuleList();
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> getRegionHostList() {
        return this.mProxy.getRegionHostList();
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public java.lang.String getSecretKey() {
        return this.mProxy.getSecretKey();
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public void initNet(android.content.Context context, com.tencent.map.tools.net.NetConfig netConfig) {
        this.mProxy.initNet(context, netConfig);
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public boolean isForceHttps() {
        return this.mProxy.isForceHttps();
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public boolean isLogEnable() {
        return this.mProxy.isLogEnable();
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public com.tencent.map.tools.net.NetResponse openStream(com.tencent.map.tools.net.NetRequest netRequest) {
        return this.mProxy.openStream(netRequest);
    }

    public void setProxyAdapter(com.tencent.map.tools.net.NetAdapter netAdapter) {
        this.mProxy = netAdapter;
    }
}
