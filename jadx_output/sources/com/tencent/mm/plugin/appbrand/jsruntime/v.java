package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public interface v extends com.tencent.mm.plugin.appbrand.jsruntime.u {
    void B(com.tencent.mm.plugin.appbrand.jsruntime.d1 d1Var);

    com.tencent.mm.plugin.appbrand.jsruntime.d1 H();

    int K();

    void U(int i17, java.nio.ByteBuffer byteBuffer);

    void bufferStoreBindTo(long j17, long j18);

    java.nio.ByteBuffer j0(int i17, boolean z17);

    void releaseDirectByteBuffer(java.nio.ByteBuffer byteBuffer);

    boolean supportBufferStoreBindTo();
}
