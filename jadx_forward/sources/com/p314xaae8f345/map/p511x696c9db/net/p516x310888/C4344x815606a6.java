package com.p314xaae8f345.map.p511x696c9db.net.p516x310888;

/* renamed from: com.tencent.map.tools.net.http.HttpProxy */
/* loaded from: classes13.dex */
public class C4344x815606a6 {

    /* renamed from: mIsForward */
    private final boolean f17021x2fcc244e;

    /* renamed from: mProxy */
    private final java.net.Proxy f17022xbe9d1601;

    /* renamed from: mProxyUrl */
    private final java.lang.String f17023xea44ebae;

    public C4344x815606a6(java.net.Proxy proxy, java.lang.String str, boolean z17) {
        this.f17022xbe9d1601 = proxy;
        this.f17023xea44ebae = str;
        this.f17021x2fcc244e = z17;
    }

    /* renamed from: getForwardProxy */
    public static java.net.Proxy m36049x4f81cd1f(com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4344x815606a6 c4344x815606a6) {
        return (c4344x815606a6 == null || !c4344x815606a6.m36053xb514da3b()) ? java.net.Proxy.NO_PROXY : c4344x815606a6.m36051x74fd70b8();
    }

    /* renamed from: getProxyURL */
    public static java.net.URL m36050x41217d97(com.p314xaae8f345.map.p511x696c9db.net.p516x310888.C4344x815606a6 c4344x815606a6) {
        if (c4344x815606a6 == null || c4344x815606a6.m36053xb514da3b()) {
            return null;
        }
        return new java.net.URL(c4344x815606a6.m36052x41218197());
    }

    /* renamed from: getProxy */
    public java.net.Proxy m36051x74fd70b8() {
        return this.f17022xbe9d1601;
    }

    /* renamed from: getProxyUrl */
    public java.lang.String m36052x41218197() {
        return this.f17023xea44ebae;
    }

    /* renamed from: isForward */
    public boolean m36053xb514da3b() {
        return this.f17021x2fcc244e;
    }

    /* renamed from: toString */
    public java.lang.String m36054x9616526c() {
        return "HttpProxy{mProxy=" + this.f17022xbe9d1601 + ", mProxyUrl='" + this.f17023xea44ebae + "', mIsForward=" + this.f17021x2fcc244e + '}';
    }
}
