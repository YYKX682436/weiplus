package com.p314xaae8f345.p2981xfaaf2ff7.net;

/* renamed from: com.tencent.tencentmap.net.NetResponse */
/* loaded from: classes13.dex */
public class C26125xdd3bdcde {

    /* renamed from: charset */
    public java.lang.String f49880x2c0d614c;

    /* renamed from: data */
    public byte[] f49881x2eefaa;

    /* renamed from: errorCode */
    public int f49882x139cb015;

    /* renamed from: errorData */
    public byte[] f49883x139cf1d2;

    /* renamed from: exception */
    public java.lang.Exception f49884x584fd04f;

    /* renamed from: statusCode */
    public int f49885xec0a8ff;

    public C26125xdd3bdcde() {
        this.f49882x139cb015 = -1;
        this.f49880x2c0d614c = "GBK";
    }

    /* renamed from: available */
    public boolean m100244xd4418ac9() {
        if (this.f49882x139cb015 == 0 && this.f49885xec0a8ff == 200) {
            return true;
        }
        byte[] bArr = this.f49881x2eefaa;
        return bArr != null && bArr.length > 0;
    }

    /* renamed from: toString */
    public java.lang.String m100245x9616526c() {
        try {
            byte[] bArr = this.f49881x2eefaa;
            return bArr != null ? new java.lang.String(bArr, this.f49880x2c0d614c) : "";
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public C26125xdd3bdcde(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde) {
        this.f49882x139cb015 = -1;
        this.f49880x2c0d614c = "GBK";
        if (c4330xdd3bdcde != null) {
            this.f49882x139cb015 = c4330xdd3bdcde.f16979x139cb015;
            this.f49885xec0a8ff = c4330xdd3bdcde.f16986xec0a8ff;
            this.f49881x2eefaa = c4330xdd3bdcde.f16977x2eefaa;
            this.f49880x2c0d614c = c4330xdd3bdcde.f16974x2c0d614c;
            this.f49884x584fd04f = c4330xdd3bdcde.f16981x584fd04f;
            this.f49883x139cf1d2 = c4330xdd3bdcde.f16980x139cf1d2;
        }
    }

    public C26125xdd3bdcde(java.lang.Exception exc) {
        this.f49882x139cb015 = -1;
        this.f49880x2c0d614c = "GBK";
        this.f49884x584fd04f = exc;
        if (exc instanceof com.p314xaae8f345.map.p511x696c9db.net.p515x584fd04f.C4338xf5960604) {
            com.p314xaae8f345.map.p511x696c9db.net.p515x584fd04f.C4338xf5960604 c4338xf5960604 = (com.p314xaae8f345.map.p511x696c9db.net.p515x584fd04f.C4338xf5960604) exc;
            this.f49882x139cb015 = c4338xf5960604.f17011x139cb015;
            this.f49885xec0a8ff = c4338xf5960604.f17012xec0a8ff;
        }
    }
}
