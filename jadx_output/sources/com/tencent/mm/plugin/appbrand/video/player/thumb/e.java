package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes7.dex */
public final class e implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleDataListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.video.player.thumb.l f90880d;

    public e(com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar) {
        this.f90880d = lVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleDataListener
    public final void onSubtitleData(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.thumbplayer.api.TPSubtitleData tPSubtitleData) {
        com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar = this.f90880d;
        com.tencent.mars.xlog.Log.i(lVar.f90889r, "onSubtitleData, subtitleData: " + tPSubtitleData.subtitleData);
        ye1.o oVar = lVar.f461174m;
        if (oVar != null) {
            java.lang.String str = tPSubtitleData.subtitleData;
            bg.e0 e0Var = (bg.e0) oVar;
            e0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "onSubtitleDataChange subtitleContent:%s", str);
            e0Var.f19758a.Q(new bg.d0(e0Var, str));
        }
    }
}
