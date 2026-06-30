package com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa;

/* renamed from: com.tencent.thumbplayer.composition.TPMediaDRMAsset */
/* loaded from: classes16.dex */
public class C26275x71ee6379 extends com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd implements com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26219xc486a810 {
    private static final java.lang.String TAG = "TPMediaDRMAsset";

    /* renamed from: mDrmPropertyMap */
    private java.util.Map<java.lang.String, java.lang.String> f51511x72a6c5f5 = new java.util.HashMap();

    /* renamed from: mDrmType */
    @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TP_DRM_TYPE
    private int f51512x10b8544c;

    /* renamed from: mLicenseHttpHeaders */
    private java.util.Map<java.lang.String, java.lang.String> f51513xb27ed22a;

    /* renamed from: mPlayUrl */
    private java.lang.String f51514x80ad386e;

    public C26275x71ee6379(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TP_DRM_TYPE int i17, java.lang.String str) {
        this.f51514x80ad386e = str;
        this.f51512x10b8544c = i17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26219xc486a810
    /* renamed from: getDrmAllProperties */
    public java.util.Map<java.lang.String, java.lang.String> mo101300xd24879cb() {
        return this.f51511x72a6c5f5;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26219xc486a810
    /* renamed from: getDrmPlayUrl */
    public java.lang.String mo101301xe2178ef2() {
        return this.f51514x80ad386e;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26219xc486a810
    /* renamed from: getDrmProperty */
    public java.lang.String mo101302xb5abff5e(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.util.Map<java.lang.String, java.lang.String> map = this.f51511x72a6c5f5;
        return (map == null || map.isEmpty() || (str3 = this.f51511x72a6c5f5.get(str)) == null) ? str2 : str3;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26219xc486a810
    @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TP_DRM_TYPE
    /* renamed from: getDrmType */
    public int mo101303xb06cdd43() {
        return this.f51512x10b8544c;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26219xc486a810
    /* renamed from: getLicenseHttpHeaders */
    public java.util.Map<java.lang.String, java.lang.String> mo101304xc68bd8d3() {
        return this.f51513xb27ed22a;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1
    /* renamed from: getMediaType */
    public int mo101277x7f025288() {
        return 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1
    /* renamed from: getUrl */
    public java.lang.String mo101278xb5887639() {
        try {
            return com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26274xbc47d75e.m101617xe72e6009(this);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            return "";
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26219xc486a810
    /* renamed from: setDrmPlayUrl */
    public void mo101305x103bdcfe(java.lang.String str) {
        this.f51514x80ad386e = str;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26219xc486a810
    /* renamed from: setDrmProperty */
    public void mo101306x4c1172d2(java.lang.String str, java.lang.String str2) {
        this.f51511x72a6c5f5.put(str, str2);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26219xc486a810
    /* renamed from: setDrmType */
    public void mo101307x23de2ab7(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TP_DRM_TYPE int i17) {
        this.f51512x10b8544c = i17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26219xc486a810
    /* renamed from: setLicenseHttpHeaders */
    public void mo101308x5db75adf(java.util.Map<java.lang.String, java.lang.String> map) {
        this.f51513xb27ed22a = map;
    }
}
