package com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa;

/* renamed from: com.tencent.thumbplayer.composition.TPMediaUrlAsset */
/* loaded from: classes16.dex */
public class C26277x299001a9 extends com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd implements com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26223x7c284640 {
    private static final java.lang.String TAG = "TPMediaUrlAsset";

    /* renamed from: mStreamUrl */
    private java.lang.String f51518x67e717e2;

    public C26277x299001a9(java.lang.String str) {
        this.f51518x67e717e2 = str;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1
    /* renamed from: getMediaType */
    public int mo101277x7f025288() {
        return 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26223x7c284640
    /* renamed from: getStreamUrl */
    public java.lang.String mo101331xec9d3f19() {
        return this.f51518x67e717e2;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1
    /* renamed from: getUrl */
    public java.lang.String mo101278xb5887639() {
        try {
            return com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26274xbc47d75e.m101621xcb6d8239(this);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            return "";
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26223x7c284640
    /* renamed from: setStreamUrl */
    public void mo101332x48f0ff8d(java.lang.String str) {
        this.f51518x67e717e2 = str;
    }
}
