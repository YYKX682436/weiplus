package com.tencent.liteav.videoproducer.capture;

/* loaded from: classes14.dex */
public class CameraCaptureParams extends com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Boolean f46992a = null;

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.liteav.videoproducer.capture.CameraCaptureParams)) {
            return false;
        }
        com.tencent.liteav.videoproducer.capture.CameraCaptureParams cameraCaptureParams = (com.tencent.liteav.videoproducer.capture.CameraCaptureParams) obj;
        return super.equals(cameraCaptureParams) && com.tencent.liteav.base.util.h.a(this.f46992a, cameraCaptureParams.f46992a);
    }

    @Override // com.tencent.liteav.videoproducer.capture.CaptureSourceInterface.CaptureParams
    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "%s, frontCamera: %b", super.toString(), this.f46992a);
    }
}
