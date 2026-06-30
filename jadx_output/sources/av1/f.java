package av1;

/* loaded from: classes5.dex */
public final class f implements com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cast.ui.CastUIC f14179a;

    public f(com.tencent.mm.plugin.cast.ui.CastUIC castUIC) {
        this.f14179a = castUIC;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void a() {
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void b(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void c(boolean z17, java.util.List lyricsInfos) {
        kotlin.jvm.internal.o.g(lyricsInfos, "lyricsInfos");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void d() {
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void g(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void m(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        java.util.Map map = tv3.e.f422353a;
        java.lang.String str = (java.lang.String) this.f14179a.f95483f.getValue();
        kotlin.jvm.internal.o.f(str, "access$getActivityCallbackId(...)");
        if (audioCacheInfo != null) {
            java.lang.String d17 = audioCacheInfo.d();
            java.lang.String str2 = audioCacheInfo.f155712f;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = str2;
            java.lang.String str4 = audioCacheInfo.f155723t;
            java.util.ArrayList arrayList = audioCacheInfo.f155714h;
            java.lang.String str5 = audioCacheInfo.f155725v;
            int i17 = audioCacheInfo.f155720q;
            r45.pg4 pg4Var = audioCacheInfo.A;
            r1 = new com.tencent.mm.feature_api.recordvideo.INewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo(d17, str3, str4, arrayList, str5, i17, (pg4Var != null ? pg4Var.f383018d : null) == null ? 0 : 1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeMusicPanelFeatureService", "callRet " + str + ", " + r1 + ", true");
        yz5.p pVar = (yz5.p) ((java.util.LinkedHashMap) tv3.e.f422353a).get(str);
        if (pVar != null) {
            pVar.invoke(r1, java.lang.Boolean.TRUE);
        }
    }
}
