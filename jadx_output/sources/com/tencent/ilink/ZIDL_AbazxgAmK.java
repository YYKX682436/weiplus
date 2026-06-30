package com.tencent.ilink;

/* loaded from: classes15.dex */
class ZIDL_AbazxgAmK {
    private static final java.lang.String TAG = "IlinkContextK";
    private static final java.util.concurrent.atomic.AtomicLong taskId = new java.util.concurrent.atomic.AtomicLong(0);

    public static long GenTaskId() {
        return taskId.incrementAndGet();
    }

    public native void ZIDL_A(long j17, byte[] bArr);

    public native void ZIDL_AbazxgAmC(java.lang.Object obj, java.lang.String str, java.lang.String str2);

    public native void ZIDL_B(long j17);

    public native byte[] ZIDL_C(long j17);

    public native void ZIDL_D(long j17);

    public native void ZIDL_E(long j17, boolean z17);

    public native void ZIDL_F(long j17, byte[] bArr);

    public native boolean ZIDL_G(long j17);

    public native void ZIDL_H(long j17, byte[] bArr);

    public native void ZIDL_I(long j17, byte[] bArr);

    public native com.tencent.wechat.zidl2.ZidlObjHolder2 ZIDL_J(long j17);

    public native com.tencent.wechat.zidl2.ZidlObjHolder2 ZIDL_K(long j17, byte[] bArr);

    public native com.tencent.wechat.zidl2.ZidlObjHolder2 ZIDL_L(long j17, byte[] bArr, long j18);

    public native void ZIDL_M(long j17, int i17);

    public native com.tencent.wechat.zidl2.ZidlObjHolder2 ZIDL_N(long j17);

    public native com.tencent.wechat.zidl2.ZidlObjHolder2 ZIDL_O(long j17);

    public native com.tencent.wechat.zidl2.ZidlObjHolder2 ZIDL_P(long j17, byte[] bArr, long j18);
}
