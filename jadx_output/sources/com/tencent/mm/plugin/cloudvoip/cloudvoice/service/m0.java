package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class m0 implements br4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.n0 f95945a;

    public m0(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.n0 n0Var) {
        this.f95945a = n0Var;
    }

    public void a() {
        com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.n0 n0Var = this.f95945a;
        android.graphics.SurfaceTexture surfaceTexture = com.tencent.mm.plugin.voip.model.v2protocal.f176827n2;
        is0.c cVar = com.tencent.mm.plugin.voip.model.v2protocal.f176826m2;
        n0Var.getClass();
        if (surfaceTexture == null || cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "setSurfaceTexture error, videoTexture:%s, videoTexture:%s", surfaceTexture, cVar);
            return;
        }
        if (!n0Var.f95959o || (openGlRender = n0Var.f95957m) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "setSurfaceTexture failed , texId:%d,mInitDone:%b", java.lang.Integer.valueOf(cVar.f294395e), java.lang.Boolean.valueOf(n0Var.f95959o));
            return;
        }
        br4.g gVar = openGlRender.f177064l;
        if (gVar != null && gVar.f23723b != null) {
            br4.b bVar = gVar.f23723b;
            bVar.f23691e = surfaceTexture;
            bVar.f23690d = cVar;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "setSurfaceTexture OK , videoTexture:%d", java.lang.Integer.valueOf(cVar.f294395e));
    }
}
