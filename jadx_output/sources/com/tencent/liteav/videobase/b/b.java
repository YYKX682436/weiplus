package com.tencent.liteav.videobase.b;

/* loaded from: classes14.dex */
public final class b extends com.tencent.liteav.videobase.a.a {

    /* renamed from: i, reason: collision with root package name */
    private int f46637i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f46638j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f46639k = -1;

    @Override // com.tencent.liteav.videobase.a.a
    public final void a(int i17, com.tencent.liteav.videobase.frame.d dVar, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2) {
        super.a(this.f46639k, dVar, floatBuffer, floatBuffer2);
    }

    @Override // com.tencent.liteav.videobase.a.a
    public final void d() {
        super.d();
        com.tencent.liteav.videobase.utils.OpenGlUtils.deleteTexture(this.f46639k);
        this.f46639k = -1;
    }

    public final void a(java.nio.Buffer buffer, int i17, int i18) {
        if (this.f46637i != i17 || this.f46638j != i18) {
            this.f46637i = i17;
            this.f46638j = i18;
            com.tencent.liteav.videobase.utils.OpenGlUtils.deleteTexture(this.f46639k);
            this.f46639k = -1;
        }
        this.f46639k = com.tencent.liteav.videobase.utils.OpenGlUtils.loadTexture(com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, buffer, i17, i18, this.f46639k);
    }
}
