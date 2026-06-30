package com.p314xaae8f345.mm.p676x4c4db2ad.p677x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0086 J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0086 J\u0011\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0086 J!\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086 JQ\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0086 J\u0011\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0086 J!\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086 J9\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0086 ¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/dynamicbackground/model/DynamicBackgroundNative;", "", "", "nativeInit", "inst", "Ljz5/f0;", "nativeRelease", "draw", "", "width", "height", "surfaceCreated", "", "vertexShader", "fragmentShader", "vertexFrameBuffer", "fragFrameBuffer", "textureVertexShader", "textureFragmentShader", "bgVertexShader", "bgFragmentShader", "setupGlslFiles", "initView", "surfaceChanged", "particleColor1", "particleColor2", "particleColor3", "bgColor1", "bgColor2", "setColor", "dynamicbg_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.tencent.mm.dynamicbackground.model.DynamicBackgroundNative */
/* loaded from: classes8.dex */
public final class C10432x58e9524 {

    /* renamed from: a, reason: collision with root package name */
    public long f146409a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f146410b = -1;

    public C10432x58e9524() {
        lq.c cVar = lq.d.f401980a;
        lq.c cVar2 = lq.d.f401980a;
        if (cVar2 != null) {
            cVar2.mo43634xf6645c3d();
        }
    }

    public final void a() {
        if (this.f146410b > 0) {
            mq.h.b("MicroMsg.DynamicBackgroundNative", "destroy DynamicBackgroundNative toRelease: " + this.f146410b + " inst: " + this.f146409a, new java.lang.Object[0]);
            m43647x7f877f0(this.f146410b);
            this.f146410b = -1L;
        }
    }

    /* renamed from: draw */
    public final native void m43644x2f2d44(long j17);

    /* renamed from: initView */
    public final native void m43645x10010bd5(long j17);

    /* renamed from: nativeInit */
    public final native long m43646xb90145c7();

    /* renamed from: nativeRelease */
    public final native void m43647x7f877f0(long j17);

    /* renamed from: setColor */
    public final native void m43648x52d2f021(long j17, int i17, int i18, int i19, int i27, int i28);

    /* renamed from: setupGlslFiles */
    public final native void m43649x6b36c51c(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8);

    /* renamed from: surfaceChanged */
    public final native void m43650xaa23e147(long j17, int i17, int i18);

    /* renamed from: surfaceCreated */
    public final native void m43651xbb66fd7b(long j17, int i17, int i18);
}
