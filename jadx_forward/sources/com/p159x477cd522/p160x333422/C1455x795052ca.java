package com.p159x477cd522.p160x333422;

/* renamed from: com.eclipsesource.mmv8.InSandboxByteBuffer */
/* loaded from: classes7.dex */
public class C1455x795052ca implements com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98 {

    /* renamed from: mByteBuffer */
    private final java.nio.ByteBuffer f4722xdcc5f3b5;

    /* renamed from: mIsReleased */
    private boolean f4723x8c0d78d4 = false;

    private C1455x795052ca(int i17) {
        this.f4722xdcc5f3b5 = com.p159x477cd522.p160x333422.V8.m16048xd37907f4(i17);
    }

    /* renamed from: allocate */
    public static com.p159x477cd522.p160x333422.C1455x795052ca m15822x6c090f3d(int i17) {
        return new com.p159x477cd522.p160x333422.C1455x795052ca(i17);
    }

    /* renamed from: asByteBuffer */
    public synchronized java.nio.ByteBuffer m15823x4471cd3a() {
        if (this.f4723x8c0d78d4) {
            return null;
        }
        return this.f4722xdcc5f3b5;
    }

    /* renamed from: isReleased */
    public synchronized boolean m15824xafdb8087() {
        return this.f4723x8c0d78d4;
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98
    /* renamed from: release */
    public synchronized void mo15825x41012807() {
        if (this.f4723x8c0d78d4) {
            return;
        }
        java.nio.ByteBuffer byteBuffer = this.f4722xdcc5f3b5;
        if (byteBuffer != null) {
            com.p159x477cd522.p160x333422.V8.m16091xdac7866a(byteBuffer, byteBuffer.capacity());
            this.f4723x8c0d78d4 = true;
        }
    }
}
