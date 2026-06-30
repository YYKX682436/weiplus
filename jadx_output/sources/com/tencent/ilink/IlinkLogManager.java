package com.tencent.ilink;

/* loaded from: classes15.dex */
public class IlinkLogManager extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private static com.tencent.ilink.IlinkLogManager instance = new com.tencent.ilink.IlinkLogManager();
    com.tencent.ilink.ZIDL_AbazarEPK jniCaller = new com.tencent.ilink.ZIDL_AbazarEPK();

    /* loaded from: classes15.dex */
    public interface FilterLogEvent {
        void event(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, long j17, long j18, long j19);
    }

    /* loaded from: classes15.dex */
    public interface WriteLogEvent {
        void event(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, long j17, long j18, long j19);
    }

    private IlinkLogManager() {
        this.zidlCreateName = "ilink.IlinkLogManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("ilink2", "ilink2");
        this.jniCaller.ZIDL_AbazarEPC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public static com.tencent.ilink.IlinkLogManager buildZidlObjForHolder(java.lang.String str, java.lang.String str2, long j17) {
        return getInstance();
    }

    public static com.tencent.ilink.IlinkLogManager getInstance() {
        return instance;
    }

    public void close() {
        this.jniCaller.ZIDL_E(this.nativeHandler);
    }

    public void flush() {
        this.jniCaller.ZIDL_D(this.nativeHandler);
    }

    public void init(com.tencent.ilink.base.IlinkLogConfig ilinkLogConfig) {
        this.jniCaller.ZIDL_A(this.nativeHandler, ilinkLogConfig.toByteArrayOrNull());
    }

    public void open(java.lang.String str, byte[] bArr) {
        this.jniCaller.ZIDL_B(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), bArr);
    }

    public void subscribeFilterLogEvent(java.lang.String str, com.tencent.ilink.IlinkLogManager.FilterLogEvent filterLogEvent) {
        this.jniCaller.subscribeFilterLogEvent(str, filterLogEvent);
    }

    public void subscribeWriteLogEvent(java.lang.String str, com.tencent.ilink.IlinkLogManager.WriteLogEvent writeLogEvent) {
        this.jniCaller.subscribeWriteLogEvent(str, writeLogEvent);
    }

    public void unsubscribeFilterLogEvent(java.lang.String str) {
        this.jniCaller.unsubscribeFilterLogEvent(str);
    }

    public void unsubscribeWriteLogEvent(java.lang.String str) {
        this.jniCaller.unsubscribeWriteLogEvent(str);
    }

    public void write(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, long j17, long j18, long j19) {
        this.jniCaller.ZIDL_C(this.nativeHandler, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), str3.getBytes(java.nio.charset.StandardCharsets.UTF_8), i18, str4.getBytes(java.nio.charset.StandardCharsets.UTF_8), j17, j18, j19);
    }
}
