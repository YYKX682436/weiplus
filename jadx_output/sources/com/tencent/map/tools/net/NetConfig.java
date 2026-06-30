package com.tencent.map.tools.net;

/* loaded from: classes13.dex */
public class NetConfig {
    private android.os.Bundle mArguments;
    private java.util.HashMap<java.lang.String, java.lang.String> mNetFlowRuleList;
    private java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> mProxyRuleList;
    private java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> mRegionHostList;
    private java.lang.String mSecretKey;
    private java.lang.Class<? extends com.tencent.mapsdk.internal.md> processorClass;
    private com.tencent.map.tools.net.AdapterType mAdapterType = com.tencent.map.tools.net.AdapterType.URL;
    private boolean mForceHttps = true;
    private boolean mIsLogEnable = false;

    private NetConfig() {
    }

    public static com.tencent.map.tools.net.NetConfig create() {
        return new com.tencent.map.tools.net.NetConfig();
    }

    public com.tencent.map.tools.net.AdapterType getAdapterType() {
        return this.mAdapterType;
    }

    public android.os.Bundle getArguments() {
        return this.mArguments;
    }

    public java.util.HashMap<java.lang.String, java.lang.String> getNetFlowRuleList() {
        return this.mNetFlowRuleList;
    }

    public java.lang.Class<? extends com.tencent.mapsdk.internal.md> getProcessor() {
        return this.processorClass;
    }

    public java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> getProxyRuleList() {
        return this.mProxyRuleList;
    }

    public java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> getRegionHostList() {
        return this.mRegionHostList;
    }

    public java.lang.String getSecretKey() {
        return this.mSecretKey;
    }

    public boolean isForceHttps() {
        return this.mForceHttps;
    }

    public boolean isLogEnable() {
        return this.mIsLogEnable;
    }

    public com.tencent.map.tools.net.NetConfig setAdapterType(com.tencent.map.tools.net.AdapterType adapterType) {
        this.mAdapterType = adapterType;
        return this;
    }

    public com.tencent.map.tools.net.NetConfig setArguments(android.os.Bundle bundle) {
        this.mArguments = bundle;
        return this;
    }

    public com.tencent.map.tools.net.NetConfig setForceHttps(boolean z17) {
        this.mForceHttps = z17;
        return this;
    }

    public com.tencent.map.tools.net.NetConfig setLogEnable(boolean z17) {
        this.mIsLogEnable = z17;
        return this;
    }

    public com.tencent.map.tools.net.NetConfig setNetFlowRuleList(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        this.mNetFlowRuleList = hashMap;
        return this;
    }

    public com.tencent.map.tools.net.NetConfig setProcessor(java.lang.Class<? extends com.tencent.mapsdk.internal.md> cls) {
        this.processorClass = cls;
        return this;
    }

    public com.tencent.map.tools.net.NetConfig setProxyRuleList(java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> list) {
        this.mProxyRuleList = list;
        return this;
    }

    public com.tencent.map.tools.net.NetConfig setRegionHostList(java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> hashMap) {
        this.mRegionHostList = hashMap;
        return this;
    }

    public com.tencent.map.tools.net.NetConfig setSecretKey(java.lang.String str) {
        this.mSecretKey = str;
        return this;
    }
}
