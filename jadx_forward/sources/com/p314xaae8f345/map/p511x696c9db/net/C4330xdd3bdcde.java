package com.p314xaae8f345.map.p511x696c9db.net;

/* renamed from: com.tencent.map.tools.net.NetResponse */
/* loaded from: classes13.dex */
public class C4330xdd3bdcde {

    /* renamed from: contentEncoding */
    public java.lang.String f16975xf6753cec;

    /* renamed from: contentLength */
    public int f16976xdfc55cbf;

    /* renamed from: data */
    public byte[] f16977x2eefaa;

    /* renamed from: dataStream */
    public java.io.InputStream f16978x4c1d43ca;

    /* renamed from: errorData */
    public byte[] f16980x139cf1d2;

    /* renamed from: exception */
    public java.lang.Exception f16981x584fd04f;

    /* renamed from: mRequestId */
    public long f16982xa413de1d;

    /* renamed from: requestUrl */
    public java.lang.String f16983x2361c60;

    /* renamed from: respProcessorSet */
    private java.util.List<com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4348x36316c72> f16985x37f64e60;

    /* renamed from: statusCode */
    public int f16986xec0a8ff;

    /* renamed from: errorCode */
    public int f16979x139cb015 = -1;

    /* renamed from: charset */
    public java.lang.String f16974x2c0d614c = "GBK";

    /* renamed from: respHeads */
    public final java.util.Map<java.lang.String, java.lang.String> f16984x890184a3 = new java.util.HashMap();

    public C4330xdd3bdcde() {
    }

    /* renamed from: available */
    public boolean mo36017xd4418ac9() {
        if (this.f16979x139cb015 == 0 && this.f16986xec0a8ff == 200) {
            return true;
        }
        byte[] bArr = this.f16977x2eefaa;
        return bArr != null && bArr.length > 0;
    }

    /* renamed from: clone */
    public void m36018x5a5dd5d(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde) {
        if (c4330xdd3bdcde != null) {
            this.f16979x139cb015 = c4330xdd3bdcde.f16979x139cb015;
            this.f16986xec0a8ff = c4330xdd3bdcde.f16986xec0a8ff;
            this.f16977x2eefaa = c4330xdd3bdcde.f16977x2eefaa;
            this.f16974x2c0d614c = c4330xdd3bdcde.f16974x2c0d614c;
            this.f16981x584fd04f = c4330xdd3bdcde.f16981x584fd04f;
            this.f16980x139cf1d2 = c4330xdd3bdcde.f16980x139cf1d2;
        }
    }

    /* renamed from: exception */
    public void m36019x584fd04f(java.lang.Exception exc) {
        this.f16981x584fd04f = exc;
        if (exc instanceof com.p314xaae8f345.map.p511x696c9db.net.p515x584fd04f.C4338xf5960604) {
            com.p314xaae8f345.map.p511x696c9db.net.p515x584fd04f.C4338xf5960604 c4338xf5960604 = (com.p314xaae8f345.map.p511x696c9db.net.p515x584fd04f.C4338xf5960604) exc;
            this.f16979x139cb015 = c4338xf5960604.f17011x139cb015;
            this.f16986xec0a8ff = c4338xf5960604.f17012xec0a8ff;
        }
    }

    /* renamed from: getData */
    public java.lang.String m36020xfb7e5820() {
        byte[] bArr = this.f16977x2eefaa;
        return bArr != null ? new java.lang.String(bArr) : "";
    }

    /* renamed from: getErrorCode */
    public int m36021x130a215f() {
        return this.f16979x139cb015;
    }

    /* renamed from: getErrorMessage */
    public java.lang.String m36022xa8aa7f55() {
        byte[] bArr = this.f16980x139cf1d2;
        if (bArr != null) {
            return new java.lang.String(bArr);
        }
        java.lang.Exception exc = this.f16981x584fd04f;
        return exc != null ? exc.getMessage() : "";
    }

    /* renamed from: getHeaderField */
    public java.lang.String m36023x1f05a537(java.lang.String str) {
        return this.f16984x890184a3.get(str);
    }

    /* renamed from: getInputStream */
    public java.io.InputStream m36024xc7995ab4() {
        return this.f16978x4c1d43ca;
    }

    /* renamed from: getProcessors */
    public java.util.List<com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4348x36316c72> m36025x76afe17() {
        return this.f16985x37f64e60;
    }

    /* renamed from: getStatusCode */
    public int m36026xfd0160f5() {
        return this.f16986xec0a8ff;
    }

    /* renamed from: toHumanString */
    public java.lang.String m36027xbbe5a623() {
        if (this.f16977x2eefaa != null) {
            return "[DATA] " + (this.f16977x2eefaa.length / 1024.0f) + "KB " + new java.lang.String(this.f16977x2eefaa, java.nio.charset.Charset.forName(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        }
        if (this.f16980x139cf1d2 == null) {
            return "";
        }
        java.lang.Exception exc = this.f16981x584fd04f;
        if (exc != null) {
            exc.getClass();
        }
        return "[ERROR] ".concat(new java.lang.String(this.f16980x139cf1d2));
    }

    /* renamed from: toString */
    public java.lang.String m36028x9616526c() {
        try {
            byte[] bArr = this.f16977x2eefaa;
            return bArr != null ? new java.lang.String(bArr, this.f16974x2c0d614c) : "";
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public C4330xdd3bdcde(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
        this.f16982xa413de1d = c4329xa3f02252.f16964xa413de1d;
        this.f16985x37f64e60 = c4329xa3f02252.f16968x192a4621;
        this.f16983x2361c60 = c4329xa3f02252.url;
    }
}
