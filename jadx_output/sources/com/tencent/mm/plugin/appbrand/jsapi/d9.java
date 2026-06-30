package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes8.dex */
public final class d9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.e9 f80750d;

    public d9(com.tencent.mm.plugin.appbrand.jsapi.e9 e9Var) {
        this.f80750d = e9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = new com.tencent.mm.modelcontrol.VideoTransPara();
        videoTransPara.f71195h = 60;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider g17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.g("", "", videoTransPara, 60 * 1000, 16);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        g17.f155681s = bool;
        g17.f155682t = java.lang.Boolean.FALSE;
        g17.f155684v = bool;
        g17.f155687y = false;
        g17.f155688z = false;
        g17.f155677o.f64783o = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.hku);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.appbrand.jsapi.c9(this.f80750d, g17, null), 3, null);
    }
}
