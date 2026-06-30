package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class m0 implements br4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.n0 f177478a;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.n0 n0Var) {
        this.f177478a = n0Var;
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.n0 n0Var = this.f177478a;
        android.graphics.SurfaceTexture surfaceTexture = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.f258360n2;
        is0.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.f258359m2;
        n0Var.getClass();
        if (surfaceTexture == null || cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "setSurfaceTexture error, videoTexture:%s, videoTexture:%s", surfaceTexture, cVar);
            return;
        }
        if (!n0Var.f177492o || (c18924x4c862f65 = n0Var.f177490m) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "setSurfaceTexture failed , texId:%d,mInitDone:%b", java.lang.Integer.valueOf(cVar.f375928e), java.lang.Boolean.valueOf(n0Var.f177492o));
            return;
        }
        br4.g gVar = c18924x4c862f65.f258597l;
        if (gVar != null && gVar.f105256b != null) {
            br4.b bVar = gVar.f105256b;
            bVar.f105224e = surfaceTexture;
            bVar.f105223d = cVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "setSurfaceTexture OK , videoTexture:%d", java.lang.Integer.valueOf(cVar.f375928e));
    }
}
