package com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa;

/* renamed from: com.tencent.thumbplayer.composition.TPMediaAssetOrderedMap */
/* loaded from: classes13.dex */
public class C26268xcba0c8d7 implements com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26217xf3c57c60 {
    private static final java.lang.String TAG = "TPMediaAssetOrderedMap";

    /* renamed from: mOrderedStrings */
    private java.lang.StringBuilder f51453xba8e6722 = new java.lang.StringBuilder();

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26217xf3c57c60
    /* renamed from: addKeyValue */
    public void mo101287xe344d213(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "addKeyValue key:" + str + "=" + str2);
        java.lang.StringBuilder sb6 = this.f51453xba8e6722;
        sb6.append(str);
        sb6.append("=");
        sb6.append(str2);
        sb6.append(";");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26217xf3c57c60
    /* renamed from: getKeyValueStr */
    public java.lang.String mo101288x3a8bed49() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "getKeyValueStr " + this.f51453xba8e6722.toString());
        return this.f51453xba8e6722.toString();
    }
}
