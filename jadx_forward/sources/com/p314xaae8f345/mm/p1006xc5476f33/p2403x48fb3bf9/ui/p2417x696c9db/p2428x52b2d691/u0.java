package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class u0 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268087e;

    public u0(java.lang.String str, java.lang.String str2) {
        this.f268086d = str;
        this.f268087e = str2;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDownloadMediaByUrl", "onProgress mediaId: " + str + ", offset: " + j17 + ", total: " + j18);
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        jz5.l lVar = (jz5.l) p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.v0.f268100e).remove(str);
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiDownloadMediaByUrl", "onFinish: no context found for mediaId: " + str);
            return;
        }
        nw4.k kVar = (nw4.k) lVar.f384366d;
        nw4.y2 y2Var = (nw4.y2) lVar.f384367e;
        if (i17 == 0) {
            java.lang.String str2 = this.f268086d;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.b(str2);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(b17);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(dm.i4.f66867x2a5c95c7, b17.f264269e);
                kVar.f422396d.e(y2Var.f422546c, "downloadMediaByUrl:ok", hashMap);
                return;
            }
        }
        kVar.f422396d.e(y2Var.f422546c, "downloadMediaByUrl failed url: " + this.f268087e, null);
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String str, long j17, long j18) {
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String str, java.lang.String str2) {
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
    }
}
