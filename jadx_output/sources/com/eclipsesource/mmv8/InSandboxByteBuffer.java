package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public class InSandboxByteBuffer implements com.eclipsesource.mmv8.Releasable {
    private final java.nio.ByteBuffer mByteBuffer;
    private boolean mIsReleased = false;

    private InSandboxByteBuffer(int i17) {
        this.mByteBuffer = com.eclipsesource.mmv8.V8.allocateDirectByteBufferInSandbox(i17);
    }

    public static com.eclipsesource.mmv8.InSandboxByteBuffer allocate(int i17) {
        return new com.eclipsesource.mmv8.InSandboxByteBuffer(i17);
    }

    public synchronized java.nio.ByteBuffer asByteBuffer() {
        if (this.mIsReleased) {
            return null;
        }
        return this.mByteBuffer;
    }

    public synchronized boolean isReleased() {
        return this.mIsReleased;
    }

    @Override // com.eclipsesource.mmv8.Releasable
    public synchronized void release() {
        if (this.mIsReleased) {
            return;
        }
        java.nio.ByteBuffer byteBuffer = this.mByteBuffer;
        if (byteBuffer != null) {
            com.eclipsesource.mmv8.V8.releaseDirectByteBufferInSandbox(byteBuffer, byteBuffer.capacity());
            this.mIsReleased = true;
        }
    }
}
