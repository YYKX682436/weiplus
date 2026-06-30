package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public final class b0 implements org.webrtc.EglRenderer.OnFrameInGLEnv {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f83796a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.webrtc.e0 f83798c;

    public b0(boolean z17, int i17, com.tencent.mm.plugin.appbrand.jsapi.webrtc.e0 e0Var) {
        this.f83796a = z17;
        this.f83797b = i17;
        this.f83798c = e0Var;
    }

    @Override // org.webrtc.EglRenderer.OnFrameInGLEnv
    public boolean doOnDrawFrameWithEGL(org.webrtc.EglBase eglBase, org.webrtc.VideoFrame videoFrame, org.webrtc.RendererCommon.GlDrawer drawer, org.webrtc.VideoFrameDrawer videoFrameDrawer, android.graphics.Matrix matrix) {
        kotlin.jvm.internal.o.g(eglBase, "eglBase");
        kotlin.jvm.internal.o.g(drawer, "drawer");
        boolean z17 = this.f83796a;
        int i17 = this.f83797b;
        if (!z17) {
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.e0.f83806v.put(java.lang.Integer.valueOf(i17), 0);
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.webrtc.e0 e0Var = this.f83798c;
        if (((java.lang.Boolean) ((jz5.n) e0Var.f83811n).getValue()).booleanValue() && ((java.lang.Boolean) ((jz5.n) e0Var.f83812o).getValue()).booleanValue()) {
            if (videoFrame != null && videoFrameDrawer != null) {
                com.tencent.mm.plugin.appbrand.jsapi.webrtc.w wVar = com.tencent.mm.plugin.appbrand.jsapi.webrtc.e0.f83805u;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateWebRTCRendererViewWC", "johnjh jsapiwc postUpdateview | beigin set size");
                int rotatedWidth = videoFrame.getRotatedWidth();
                int rotatedHeight = videoFrame.getRotatedHeight();
                org.webrtc.GlTextureFrameBuffer glTextureFrameBuffer = e0Var.f83817t;
                glTextureFrameBuffer.setSize(rotatedWidth, rotatedHeight);
                android.opengl.GLES20.glBindFramebuffer(36160, glTextureFrameBuffer.getFrameBufferId());
                android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, glTextureFrameBuffer.getTextureId(), 0);
                android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                android.opengl.GLES20.glClear(16384);
                videoFrameDrawer.drawFrame(videoFrame, drawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                android.opengl.GLES20.glActiveTexture(33984);
                jz5.g gVar = e0Var.f83809i;
                android.opengl.GLES20.glBindTexture(3553, ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateWebRTCRendererViewWC", "johnjh jsapiwc postUpdateview | beigin run sr");
                e0Var.f83807g = (videoFrame.getRotatedWidth() * 3) / 2;
                int rotatedHeight2 = (videoFrame.getRotatedHeight() * 3) / 2;
                e0Var.f83808h = rotatedHeight2;
                int i18 = e0Var.f83807g;
                int i19 = i18 % 8;
                if (i19 != 0) {
                    e0Var.f83807g = i18 - i19;
                }
                int i27 = rotatedHeight2 % 8;
                if (i27 != 0) {
                    e0Var.f83808h = rotatedHeight2 - i27;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateWebRTCRendererViewWC", "johnjh out width : " + e0Var.f83807g + "height: " + e0Var.f83808h);
                e0Var.f83813p = ((com.tencent.mm.libmmwebrtc.MMGameSRBinding) ((jz5.n) e0Var.f83810m).getValue()).a(glTextureFrameBuffer.getTextureId(), videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), e0Var.f83807g, e0Var.f83808h);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("johnjh jsapiwc postUpdateview | after runsr, return :");
                sb6.append(e0Var.f83813p);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateWebRTCRendererViewWC", sb6.toString());
                if (e0Var.f83813p) {
                    com.tencent.mm.plugin.appbrand.jsapi.webrtc.e0.f83806v.put(java.lang.Integer.valueOf(i17), 1);
                } else {
                    com.tencent.mm.plugin.appbrand.jsapi.webrtc.e0.f83806v.put(java.lang.Integer.valueOf(i17), -1);
                }
                drawer.drawRgb(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), e0Var.f83816s, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), 0, 0, eglBase.surfaceWidth(), eglBase.surfaceHeight());
                return e0Var.f83813p;
            }
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.w wVar2 = com.tencent.mm.plugin.appbrand.jsapi.webrtc.e0.f83805u;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdateWebRTCRendererViewWC", "johnjh jsapiwc postUpdateview | frame or framedrawer is null");
        }
        return false;
    }
}
