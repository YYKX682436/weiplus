package com.tencent.mm.dynamicbackground.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0086 J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0086 J\u0011\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0086 J!\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086 JQ\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0086 J\u0011\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0086 J!\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086 J9\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0086 ¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/dynamicbackground/model/DynamicBackgroundNative;", "", "", "nativeInit", "inst", "Ljz5/f0;", "nativeRelease", "draw", "", "width", "height", "surfaceCreated", "", "vertexShader", "fragmentShader", "vertexFrameBuffer", "fragFrameBuffer", "textureVertexShader", "textureFragmentShader", "bgVertexShader", "bgFragmentShader", "setupGlslFiles", "initView", "surfaceChanged", "particleColor1", "particleColor2", "particleColor3", "bgColor1", "bgColor2", "setColor", "dynamicbg_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes8.dex */
public final class DynamicBackgroundNative {

    /* renamed from: a, reason: collision with root package name */
    public long f64876a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f64877b = -1;

    public DynamicBackgroundNative() {
        lq.c cVar = lq.d.f320447a;
        lq.c cVar2 = lq.d.f320447a;
        if (cVar2 != null) {
            cVar2.loadDynamicBgLibrary();
        }
    }

    public final void a() {
        if (this.f64877b > 0) {
            mq.h.b("MicroMsg.DynamicBackgroundNative", "destroy DynamicBackgroundNative toRelease: " + this.f64877b + " inst: " + this.f64876a, new java.lang.Object[0]);
            nativeRelease(this.f64877b);
            this.f64877b = -1L;
        }
    }

    public final native void draw(long j17);

    public final native void initView(long j17);

    public final native long nativeInit();

    public final native void nativeRelease(long j17);

    public final native void setColor(long j17, int i17, int i18, int i19, int i27, int i28);

    public final native void setupGlslFiles(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8);

    public final native void surfaceChanged(long j17, int i17, int i18);

    public final native void surfaceCreated(long j17, int i17, int i18);
}
