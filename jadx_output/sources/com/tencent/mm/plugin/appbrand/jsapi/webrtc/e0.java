package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public final class e0 extends com.tencent.mm.plugin.appbrand.jsapi.webrtc.v {

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.webrtc.w f83805u = new com.tencent.mm.plugin.appbrand.jsapi.webrtc.w(null);

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.HashMap f83806v = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f83807g;

    /* renamed from: h, reason: collision with root package name */
    public int f83808h;

    /* renamed from: p, reason: collision with root package name */
    public boolean f83813p;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f83809i = jz5.h.b(com.tencent.mm.plugin.appbrand.jsapi.webrtc.d0.f83801d);

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f83810m = jz5.h.b(new com.tencent.mm.plugin.appbrand.jsapi.webrtc.z(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f83811n = jz5.h.b(new com.tencent.mm.plugin.appbrand.jsapi.webrtc.y(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f83812o = jz5.h.b(new com.tencent.mm.plugin.appbrand.jsapi.webrtc.x(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f83814q = jz5.h.b(com.tencent.mm.plugin.appbrand.jsapi.webrtc.a0.f83795d);

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f83815r = jz5.h.b(com.tencent.mm.plugin.appbrand.jsapi.webrtc.c0.f83800d);

    /* renamed from: s, reason: collision with root package name */
    public final float[] f83816s = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: t, reason: collision with root package name */
    public final org.webrtc.GlTextureFrameBuffer f83817t = new org.webrtc.GlTextureFrameBuffer(com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.webrtc.v
    public void M(com.tencent.mm.plugin.appbrand.jsapi.l appBrandComponent, org.webrtc.VideoSink videoSink, com.tencent.mm.plugin.appbrand.jsapi.webrtc.i0 videoSinkErrCode, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(appBrandComponent, "appBrandComponent");
        kotlin.jvm.internal.o.g(videoSink, "videoSink");
        kotlin.jvm.internal.o.g(videoSinkErrCode, "videoSinkErrCode");
        super.M(appBrandComponent, videoSink, videoSinkErrCode, jSONObject);
        boolean optBoolean = jSONObject != null ? jSONObject.optBoolean("useSR", false) : false;
        int optInt = jSONObject != null ? jSONObject.optInt("mediaStreamTrackId", -1) : -1;
        if (videoSink instanceof org.webrtc.IRenderer) {
            org.webrtc.IRenderer iRenderer = (org.webrtc.IRenderer) videoSink;
            if (iRenderer.getFrameWithGLCallback() == null) {
                iRenderer.setFrameWithGLCallback(new com.tencent.mm.plugin.appbrand.jsapi.webrtc.b0(optBoolean, optInt, this));
            }
        }
    }
}
