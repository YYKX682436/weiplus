package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult f218669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.h f218670e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.h hVar, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult) {
        this.f218670e = hVar;
        this.f218669d = cronetTaskResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "GetFaceCheckLiveType use http response");
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.h hVar = this.f218670e;
        wu5.b bVar = hVar.f218675a.f218617x0;
        if (bVar != null) {
            bVar.b();
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult = this.f218669d;
        java.lang.String m37974x3a5e0c51 = cronetTaskResult.m37974x3a5e0c51();
        if (cronetTaskResult.f18207xec0a8ff != 200 || cronetTaskResult.f18200x139cb015 != 0) {
            hVar.f218675a.f218600f.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad4809 = hVar.f218675a;
            textureViewSurfaceTextureListenerC15532xe9ad4809.f218611s.a7(textureViewSurfaceTextureListenerC15532xe9ad4809.d(90037, i65.a.r(textureViewSurfaceTextureListenerC15532xe9ad4809.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.c7q)));
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(m37974x3a5e0c51);
            int optInt = jSONObject.optInt("errcode");
            java.lang.String optString = jSONObject.optString("msg");
            vz2.c.k("rspVerify", java.lang.Integer.valueOf(optInt));
            vz2.c.c().f137741j = optInt;
            if (optInt == 0) {
                int optInt2 = jSONObject.getJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306).optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54530xa4e1ea94);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "GetFaceCheckLiveType use http ret_code: %s, ret_msg: %s, liveType: %s", java.lang.Integer.valueOf(optInt), optString, java.lang.Integer.valueOf(optInt2));
                hVar.f218675a.b(optInt2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "GetFaceCheckLiveType use http ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(optInt), optString);
                hVar.f218675a.f218600f.setVisibility(8);
                com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad48092 = hVar.f218675a;
                textureViewSurfaceTextureListenerC15532xe9ad48092.f218611s.a7(textureViewSurfaceTextureListenerC15532xe9ad48092.d(optInt, optString));
            }
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionPreviewLayout", "GetFaceCheckLiveType use http JSON error!");
            hVar.f218675a.f218600f.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad48093 = hVar.f218675a;
            textureViewSurfaceTextureListenerC15532xe9ad48093.f218611s.a7(textureViewSurfaceTextureListenerC15532xe9ad48093.d(90037, i65.a.r(textureViewSurfaceTextureListenerC15532xe9ad48093.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.c7q)));
        }
    }
}
