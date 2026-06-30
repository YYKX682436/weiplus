package com.tencent.mars.account;

/* loaded from: classes12.dex */
public class AccountManager extends com.tencent.mars.app.BaseManager {
    public static final java.lang.String TAG = "MicroMsg.AccountManager";
    private long nativeHandle = 0;
    private long callbackHandle = 0;
    private long handle = 0;
    private com.tencent.mars.account.AccountManager.Callback callback = null;

    /* loaded from: classes8.dex */
    public static class AuthInfo {
        public java.lang.String identify = "";
        public int encryptAlgo = 0;
        public java.lang.String clientSessionKey = "";
        public java.lang.String serverSessionKey = "";
        public java.lang.String serverId = "";

        public java.lang.String toString() {
            return "AuthInfo{identify='" + this.identify + "', encryptAlgo=" + this.encryptAlgo + ", clientSessionKey='" + this.clientSessionKey + "', serverSessionKey='" + this.serverSessionKey + "', serverId='" + this.serverId + "'}";
        }
    }

    /* loaded from: classes12.dex */
    public interface Callback {
        int calcNoticeid(byte[] bArr, int i17, int i18);

        int genCheckSum(int i17, byte[] bArr, int i18);

        int getGroupKey();

        void reportKV(int i17, java.lang.String str, boolean z17, boolean z18, int i18, boolean z19);

        byte[] sm4gcmDecryptBuffer(byte[] bArr, byte[] bArr2);

        byte[] sm4gcmEncryptBuffer(byte[] bArr, byte[] bArr2);
    }

    public AccountManager(com.tencent.mars.app.Context context) {
        OnJniCreateAccountManagerFromContext(context);
    }

    private native void OnJniClearAxSession();

    private native void OnJniCreateAccountManagerFromContext(java.lang.Object obj);

    private native void OnJniCreateAccountManagerFromHandle(long j17);

    private native int OnJniGetGroupKey();

    private native byte[] OnJniGetMainHostServerId();

    private native java.lang.String OnJniGetOriginalSessionKey();

    private native int OnJniGetUin();

    private native java.lang.String OnJniGetUsername();

    private native java.lang.String OnJniGetWxUsername();

    private native void OnJniInit();

    private native boolean OnJniIsLogin();

    private native void OnJniOnDestroyAccountManager();

    private native void OnJniSetCallback(java.lang.Object obj);

    private native void OnJniSetMainHostServerId(byte[] bArr);

    private native void OnJniSetOriginalSessionKey(byte[] bArr);

    private native void OnJniSetUin(int i17);

    private native void OnJniSetUsername(java.lang.String str);

    private native void OnJniSetWxUsername(java.lang.String str);

    private native void OnJniUnInit();

    private native void OnJniUpdateAxAuthSecRespList(byte[] bArr);

    private native void OnJniUpdateAxHostAlgo(int i17, byte[] bArr);

    private native void OnJniUpdateAxSessionKey(int i17, byte[] bArr, byte[] bArr2, byte[] bArr3);

    private native void OnJniUpdateClientVersion(int i17);

    private native void OnJniUpdateDeviceInfo(int i17, java.lang.String str);

    private native void OnJniUpdateMainHostAlgo(byte[] bArr);

    private native void OnJniUpdateMainSessionKey(byte[] bArr, byte[] bArr2);

    private native void OnJniUpdateServerIndex(byte[] bArr);

    public void clearAxSession() {
        OnJniClearAxSession();
    }

    public void finalize() {
        try {
            OnJniOnDestroyAccountManager();
        } finally {
            super.finalize();
        }
    }

    public com.tencent.mars.account.AccountManager.Callback getCallback() {
        return this.callback;
    }

    public int getGroupKey() {
        return OnJniGetGroupKey();
    }

    public byte[] getMainHostServerId() {
        return OnJniGetMainHostServerId();
    }

    @Override // com.tencent.mars.app.BaseManager
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public java.lang.String getOriginalSessionKey() {
        return OnJniGetOriginalSessionKey();
    }

    public int getUin() {
        return OnJniGetUin();
    }

    public java.lang.String getUsername() {
        return OnJniGetUsername();
    }

    public java.lang.String getWxUsername() {
        return OnJniGetWxUsername();
    }

    public void init() {
        OnJniInit();
    }

    public boolean isLogin() {
        return OnJniIsLogin();
    }

    public void onDestroy() {
        OnJniUnInit();
        this.nativeHandle = 0L;
        this.callbackHandle = 0L;
    }

    public void setCallback(com.tencent.mars.account.AccountManager.Callback callback) {
        this.callback = callback;
        OnJniSetCallback(callback);
    }

    public void setMainHostServerId(byte[] bArr) {
        OnJniSetMainHostServerId(bArr);
    }

    public void setOriginalSessionKey(byte[] bArr) {
        OnJniSetOriginalSessionKey(bArr);
    }

    public void setUin(int i17) {
        OnJniSetUin(i17);
    }

    public void setUsername(java.lang.String str) {
        OnJniSetUsername(str);
    }

    public void setWxUsername(java.lang.String str) {
        OnJniSetWxUsername(str);
    }

    public void unInit() {
        OnJniUnInit();
    }

    public void updateAxAuthSecRespList(byte[] bArr) {
        OnJniUpdateAxAuthSecRespList(bArr);
    }

    public void updateAxHostAlgo(int i17, byte[] bArr) {
        OnJniUpdateAxHostAlgo(i17, bArr);
    }

    public void updateAxSessionKey(int i17, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        OnJniUpdateAxSessionKey(i17, bArr, bArr2, bArr3);
    }

    public void updateClientVersion(int i17) {
        OnJniUpdateClientVersion(i17);
    }

    public void updateDeviceInfo(int i17, java.lang.String str) {
        OnJniUpdateDeviceInfo(i17, str);
    }

    public void updateMainHostAlgo(byte[] bArr) {
        OnJniUpdateMainHostAlgo(bArr);
    }

    public void updateMainSessionKey(byte[] bArr, byte[] bArr2) {
        OnJniUpdateMainSessionKey(bArr, bArr2);
    }

    public void updateServerIndex(byte[] bArr) {
        OnJniUpdateServerIndex(bArr);
    }

    public AccountManager(long j17) {
        OnJniCreateAccountManagerFromHandle(j17);
    }
}
