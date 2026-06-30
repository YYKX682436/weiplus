package com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa;

/* renamed from: com.tencent.thumbplayer.composition.TPMediaAssetExtraParam */
/* loaded from: classes13.dex */
public class C26267xc9f5a585 implements com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26215xf21a590e {
    private static final java.lang.String TAG = "TPMediaAssetExtraParam";

    /* renamed from: mExtraParamMap */
    private java.util.HashMap<java.lang.String, java.io.Serializable> f51452xc7f51e52 = new java.util.HashMap<>();

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26215xf21a590e
    /* renamed from: getExtraInt */
    public int mo101281x10028f35(java.lang.String str) {
        if (this.f51452xc7f51e52.containsKey(str)) {
            return ((java.lang.Integer) this.f51452xc7f51e52.get(str)).intValue();
        }
        return -1;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26215xf21a590e
    /* renamed from: getExtraObject */
    public com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26216xb8f84ffd mo101282x23681e39(java.lang.String str) {
        if (this.f51452xc7f51e52.get(str) instanceof com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26216xb8f84ffd) {
            return (com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26216xb8f84ffd) this.f51452xc7f51e52.get(str);
        }
        return null;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26215xf21a590e
    /* renamed from: getExtraString */
    public java.lang.String mo101283x2b3cdb0b(java.lang.String str) {
        return this.f51452xc7f51e52.containsKey(str) ? (java.lang.String) this.f51452xc7f51e52.get(str) : "";
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26215xf21a590e
    /* renamed from: setExtraInt */
    public void mo101284xabaf041(java.lang.String str, int i17) {
        this.f51452xc7f51e52.put(str, java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26215xf21a590e
    /* renamed from: setExtraObject */
    public void mo101285xb9cd91ad(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26216xb8f84ffd interfaceC26216xb8f84ffd) {
        this.f51452xc7f51e52.put(str, interfaceC26216xb8f84ffd);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26215xf21a590e
    /* renamed from: setExtraString */
    public void mo101286xc1a24e7f(java.lang.String str, java.lang.String str2) {
        this.f51452xc7f51e52.put(str, str2);
    }
}
