package com.tencent.ilink;

/* loaded from: classes15.dex */
public class IlinkContext extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private static com.tencent.ilink.IlinkContext instance = new com.tencent.ilink.IlinkContext();
    com.tencent.ilink.ZIDL_AbazxgAmK jniCaller = new com.tencent.ilink.ZIDL_AbazxgAmK();

    private IlinkContext() {
        this.zidlCreateName = "ilink.IlinkContext@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("ilink2", "ilink2");
        this.jniCaller.ZIDL_AbazxgAmC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public static com.tencent.ilink.IlinkContext buildZidlObjForHolder(java.lang.String str, java.lang.String str2, long j17) {
        return getInstance();
    }

    public static com.tencent.ilink.IlinkContext getInstance() {
        return instance;
    }

    public void changeDomain(com.tencent.ilink.base.IlinkDomainType ilinkDomainType) {
        this.jniCaller.ZIDL_M(this.nativeHandler, ilinkDomainType.getNumber());
    }

    public com.tencent.ilink.network.IlinkStartConfig config() {
        return (com.tencent.ilink.network.IlinkStartConfig) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.ilink.network.IlinkStartConfig.getDefaultInstance(), this.jniCaller.ZIDL_C(this.nativeHandler));
    }

    public void foregroundChanged(boolean z17) {
        this.jniCaller.ZIDL_E(this.nativeHandler, z17);
    }

    public com.tencent.ilink.CloudSession getCloudSession() {
        return (com.tencent.ilink.CloudSession) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.jniCaller.ZIDL_N(this.nativeHandler), new com.tencent.ilink.IlinkContext$$e());
    }

    public com.tencent.ilink.SingletonSession getSingletonSession() {
        return (com.tencent.ilink.SingletonSession) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.jniCaller.ZIDL_O(this.nativeHandler), new com.tencent.ilink.IlinkContext$$c());
    }

    public void init(com.tencent.ilink.network.IlinkStartConfig ilinkStartConfig) {
        this.jniCaller.ZIDL_A(this.nativeHandler, ilinkStartConfig.toByteArrayOrNull());
    }

    public boolean isAlreadyGetStrategy() {
        return this.jniCaller.ZIDL_G(this.nativeHandler);
    }

    public void networkChanged() {
        this.jniCaller.ZIDL_D(this.nativeHandler);
    }

    public com.tencent.ilink.AppDeviceSession newAppDeviceSession(java.lang.String str, long j17) {
        return (com.tencent.ilink.AppDeviceSession) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.jniCaller.ZIDL_L(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), j17), new com.tencent.ilink.IlinkContext$$a());
    }

    public com.tencent.ilink.AppSession newAppSession(java.lang.String str) {
        return (com.tencent.ilink.AppSession) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.jniCaller.ZIDL_K(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8)), new com.tencent.ilink.IlinkContext$$b());
    }

    public com.tencent.ilink.DeviceSession newDeviceSession() {
        return (com.tencent.ilink.DeviceSession) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.jniCaller.ZIDL_J(this.nativeHandler), new com.tencent.ilink.IlinkContext$$d());
    }

    public com.tencent.ilink.NetworkManager newNetworkManager(java.lang.String str, long j17) {
        return (com.tencent.ilink.NetworkManager) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.jniCaller.ZIDL_P(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), j17), new com.tencent.ilink.AppDeviceSession$$a());
    }

    public void setLonglinkIplist(com.tencent.ilink.network.IlinkServerIplist ilinkServerIplist) {
        this.jniCaller.ZIDL_H(this.nativeHandler, ilinkServerIplist.toByteArrayOrNull());
    }

    public void setProxy(com.tencent.ilink.network.IlinkNetProxyInfo ilinkNetProxyInfo) {
        this.jniCaller.ZIDL_F(this.nativeHandler, ilinkNetProxyInfo.toByteArrayOrNull());
    }

    public void setShortlinkIplist(com.tencent.ilink.network.IlinkServerIplist ilinkServerIplist) {
        this.jniCaller.ZIDL_I(this.nativeHandler, ilinkServerIplist.toByteArrayOrNull());
    }

    public void uninit() {
        this.jniCaller.ZIDL_B(this.nativeHandler);
    }
}
