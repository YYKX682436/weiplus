package com.tencent.kinda.framework.module.impl;

/* loaded from: classes9.dex */
public class KindaSecureCtrItemImpl implements com.tencent.kinda.gen.SecureCtrItem {
    private java.lang.String rawValue;

    @Override // com.tencent.kinda.gen.SecureCtrItem
    public java.lang.String getValue() {
        return new com.tenpay.ndk.Encrypt().desedeEncode(this.rawValue);
    }

    @Override // com.tencent.kinda.gen.SecureCtrItem
    public void setRawValue(java.lang.String str) {
        this.rawValue = str;
    }
}
