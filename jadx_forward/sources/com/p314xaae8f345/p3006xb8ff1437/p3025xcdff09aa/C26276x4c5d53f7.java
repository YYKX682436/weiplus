package com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa;

/* renamed from: com.tencent.thumbplayer.composition.TPMediaRtcAsset */
/* loaded from: classes16.dex */
public class C26276x4c5d53f7 extends com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd implements com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26220xcb931c8e {
    private static final java.lang.String TAG = "TPMediaWebrtcAsset";

    /* renamed from: mSdpExchangeType */
    private int f51515x2037a1af;

    /* renamed from: mServerUrl */
    private java.lang.String f51516x6ef27d3f;

    /* renamed from: mStreamUrl */
    private java.lang.String f51517x67e717e2;

    public C26276x4c5d53f7(java.lang.String str, java.lang.String str2) {
        this.f51515x2037a1af = 0;
        this.f51517x67e717e2 = str;
        this.f51516x6ef27d3f = str2;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1
    /* renamed from: getMediaType */
    public int mo101277x7f025288() {
        return 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26220xcb931c8e
    /* renamed from: getRtcSdpExchangeType */
    public int mo101309x79d0a331() {
        return this.f51515x2037a1af;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26220xcb931c8e
    /* renamed from: getRtcServerUrl */
    public java.lang.String mo101310x29c34841() {
        return this.f51516x6ef27d3f;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26220xcb931c8e
    /* renamed from: getRtcStreamUrl */
    public java.lang.String mo101311x22b7e2e4() {
        return this.f51517x67e717e2;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1
    /* renamed from: getUrl */
    public java.lang.String mo101278xb5887639() {
        try {
            return com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26274xbc47d75e.m101619xee3ad487(this);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            return "";
        }
    }

    public C26276x4c5d53f7(java.lang.String str, java.lang.String str2, int i17) {
        this.f51517x67e717e2 = str;
        this.f51516x6ef27d3f = str2;
        this.f51515x2037a1af = i17;
    }
}
