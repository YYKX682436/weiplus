package com.tencent.maas.camerafun;

/* loaded from: classes5.dex */
public class MJVideoFrame implements com.tencent.maas.camstudio.frame.BufferVideoFrame {

    /* renamed from: a, reason: collision with root package name */
    public final int f47825a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47826b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47827c;

    /* renamed from: d, reason: collision with root package name */
    public final long f47828d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f47829e = false;

    /* renamed from: f, reason: collision with root package name */
    public final jg.e[] f47830f;

    public MJVideoFrame(int i17, int i18, int i19, int i27, java.nio.ByteBuffer byteBuffer, int i28, long j17) {
        this.f47825a = i17;
        this.f47826b = i18;
        this.f47827c = i28;
        this.f47828d = j17;
        this.f47830f = r2;
        jg.e[] eVarArr = {new jg.e(i19, i27, byteBuffer)};
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public int accessibility() {
        return 0;
    }

    public java.nio.ByteBuffer getBuffer() {
        return this.f47830f[0].f299536c;
    }

    @Override // com.tencent.maas.camstudio.frame.BufferVideoFrame
    public int getFormat() {
        return 0;
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public int getFrameCWAngle() {
        return this.f47827c;
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public int getHeight() {
        return this.f47826b;
    }

    public boolean getIsMirrored() {
        return this.f47829e;
    }

    public int getPixelStride() {
        return this.f47830f[0].f299535b;
    }

    @Override // com.tencent.maas.camstudio.frame.BufferVideoFrame
    public com.tencent.maas.camstudio.frame.Plane[] getPlanes() {
        return this.f47830f;
    }

    public int getRowStride() {
        return this.f47830f[0].f299534a;
    }

    @Override // com.tencent.maas.camstudio.frame.Frame
    public long getTimestamp() {
        return this.f47828d;
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public int getWidth() {
        return this.f47825a;
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public boolean isMirrored() {
        return this.f47829e;
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public void release() {
    }
}
