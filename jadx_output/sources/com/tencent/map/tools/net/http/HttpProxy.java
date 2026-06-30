package com.tencent.map.tools.net.http;

/* loaded from: classes13.dex */
public class HttpProxy {
    private final boolean mIsForward;
    private final java.net.Proxy mProxy;
    private final java.lang.String mProxyUrl;

    public HttpProxy(java.net.Proxy proxy, java.lang.String str, boolean z17) {
        this.mProxy = proxy;
        this.mProxyUrl = str;
        this.mIsForward = z17;
    }

    public static java.net.Proxy getForwardProxy(com.tencent.map.tools.net.http.HttpProxy httpProxy) {
        return (httpProxy == null || !httpProxy.isForward()) ? java.net.Proxy.NO_PROXY : httpProxy.getProxy();
    }

    public static java.net.URL getProxyURL(com.tencent.map.tools.net.http.HttpProxy httpProxy) {
        if (httpProxy == null || httpProxy.isForward()) {
            return null;
        }
        return new java.net.URL(httpProxy.getProxyUrl());
    }

    public java.net.Proxy getProxy() {
        return this.mProxy;
    }

    public java.lang.String getProxyUrl() {
        return this.mProxyUrl;
    }

    public boolean isForward() {
        return this.mIsForward;
    }

    public java.lang.String toString() {
        return "HttpProxy{mProxy=" + this.mProxy + ", mProxyUrl='" + this.mProxyUrl + "', mIsForward=" + this.mIsForward + '}';
    }
}
