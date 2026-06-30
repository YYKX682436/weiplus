package com.tencent.map.tools.net;

/* loaded from: classes13.dex */
public interface NetAdapter {
    boolean cancel();

    com.tencent.map.tools.net.NetResponse doGet(com.tencent.map.tools.net.NetRequest netRequest);

    com.tencent.map.tools.net.NetResponse doPost(com.tencent.map.tools.net.NetRequest netRequest);

    com.tencent.map.tools.net.NetResponse doRequest(com.tencent.map.tools.net.NetRequest netRequest);

    java.util.HashSet<java.lang.Class<? extends com.tencent.mapsdk.internal.md>> getNetFlowProcessor();

    java.util.HashMap<java.lang.String, java.lang.String> getNetFlowRuleList();

    java.util.List<com.tencent.map.tools.net.http.HttpProxyRule> getProxyRuleList();

    java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> getRegionHostList();

    java.lang.String getSecretKey();

    void initNet(android.content.Context context, com.tencent.map.tools.net.NetConfig netConfig);

    boolean isForceHttps();

    boolean isLogEnable();

    com.tencent.map.tools.net.NetResponse openStream(com.tencent.map.tools.net.NetRequest netRequest);
}
