package com.tencent.ilink;

/* loaded from: classes15.dex */
class ZIDL_AbazarEPK {
    private static final java.lang.String TAG = "IlinkLogManagerK";
    private static final java.util.concurrent.atomic.AtomicLong taskId = new java.util.concurrent.atomic.AtomicLong(0);
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.ilink.IlinkLogManager.WriteLogEvent> writeLogEventMap = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.ilink.IlinkLogManager.FilterLogEvent> filterLogEventMap = new java.util.concurrent.ConcurrentHashMap<>();

    public static long GenTaskId() {
        return taskId.incrementAndGet();
    }

    private void ZIDL_FI(int i17, byte[] bArr, byte[] bArr2, byte[] bArr3, int i18, byte[] bArr4, long j17, long j18, long j19) {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onWriteLogEvent size: " + this.writeLogEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.ilink.IlinkLogManager.WriteLogEvent> entry : this.writeLogEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onWriteLogEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event(i17, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8), i18, new java.lang.String(bArr4, java.nio.charset.StandardCharsets.UTF_8), j17, j18, j19);
        }
    }

    private void ZIDL_GI(int i17, byte[] bArr, byte[] bArr2, byte[] bArr3, int i18, byte[] bArr4, long j17, long j18, long j19) {
        com.tencent.wechat.zlog.Zlog.a(TAG, "onFilterLogEvent size: " + this.filterLogEventMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.tencent.ilink.IlinkLogManager.FilterLogEvent> entry : this.filterLogEventMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a(TAG, "onFilterLogEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().event(i17, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8), i18, new java.lang.String(bArr4, java.nio.charset.StandardCharsets.UTF_8), j17, j18, j19);
        }
    }

    public native void ZIDL_A(long j17, byte[] bArr);

    public native void ZIDL_AbazarEPC(java.lang.Object obj, java.lang.String str, java.lang.String str2);

    public native void ZIDL_B(long j17, byte[] bArr, byte[] bArr2);

    public native void ZIDL_C(long j17, int i17, byte[] bArr, byte[] bArr2, byte[] bArr3, int i18, byte[] bArr4, long j18, long j19, long j27);

    public native void ZIDL_D(long j17);

    public native void ZIDL_E(long j17);

    public void subscribeFilterLogEvent(java.lang.String str, com.tencent.ilink.IlinkLogManager.FilterLogEvent filterLogEvent) {
        this.filterLogEventMap.put(str, filterLogEvent);
    }

    public void subscribeWriteLogEvent(java.lang.String str, com.tencent.ilink.IlinkLogManager.WriteLogEvent writeLogEvent) {
        this.writeLogEventMap.put(str, writeLogEvent);
    }

    public void unsubscribeFilterLogEvent(java.lang.String str) {
        this.filterLogEventMap.remove(str);
    }

    public void unsubscribeWriteLogEvent(java.lang.String str) {
        this.writeLogEventMap.remove(str);
    }
}
