package com.tencent.liteav.videobase.frame;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private int f46762a = -1;

    public final void a() {
        if (this.f46762a == -1) {
            this.f46762a = com.tencent.liteav.videobase.utils.OpenGlUtils.generateFrameBufferId();
        }
    }

    public final void b() {
        com.tencent.liteav.videobase.utils.OpenGlUtils.bindFramebuffer(36160, this.f46762a);
    }

    public final void c() {
        int i17 = this.f46762a;
        if (i17 == -1) {
            com.tencent.liteav.base.util.LiteavLog.d("GLFrameBuffer", "FrameBuffer is invalid");
        } else {
            com.tencent.liteav.videobase.utils.OpenGlUtils.detachTextureFromFrameBuffer(i17);
        }
    }

    public final void d() {
        int i17 = this.f46762a;
        if (i17 != -1) {
            com.tencent.liteav.videobase.utils.OpenGlUtils.deleteFrameBuffer(i17);
            this.f46762a = -1;
        }
    }

    public final void a(int i17) {
        int i18 = this.f46762a;
        if (i18 == -1) {
            com.tencent.liteav.base.util.LiteavLog.d("GLFrameBuffer", "FrameBuffer is invalid");
        } else {
            com.tencent.liteav.videobase.utils.OpenGlUtils.attachTextureToFrameBuffer(i17, i18);
        }
    }
}
