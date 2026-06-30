package cl;

/* loaded from: classes7.dex */
public interface u {
    void bufferStoreBindTo(long j17, long j18);

    int generateId();

    java.nio.ByteBuffer getBuffer(int i17, boolean z17);

    void releaseDirectByteBuffer(java.nio.ByteBuffer byteBuffer);

    void setBuffer(int i17, java.nio.ByteBuffer byteBuffer);

    boolean supportBufferStoreBindTo();
}
