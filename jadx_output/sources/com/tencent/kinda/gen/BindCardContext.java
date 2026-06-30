package com.tencent.kinda.gen;

/* loaded from: classes11.dex */
public final class BindCardContext {
    public java.lang.String mBindCardUuid;
    public java.lang.String mDeviceName;
    public java.lang.String mDeviceType;

    public BindCardContext() {
    }

    public BindCardContext(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.mBindCardUuid = str;
        this.mDeviceName = str2;
        this.mDeviceType = str3;
    }

    public java.lang.String getBindCardUuid() {
        return this.mBindCardUuid;
    }

    public java.lang.String getDeviceName() {
        return this.mDeviceName;
    }

    public java.lang.String getDeviceType() {
        return this.mDeviceType;
    }

    public java.lang.String toString() {
        return "BindCardContext{mBindCardUuid=" + this.mBindCardUuid + ",mDeviceName=" + this.mDeviceName + ",mDeviceType=" + this.mDeviceType + "}";
    }
}
