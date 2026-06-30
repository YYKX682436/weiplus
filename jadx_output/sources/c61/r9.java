package c61;

/* loaded from: classes4.dex */
public final class r9 implements cw2.eb {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.mc f39278d;

    public r9(zy2.mc mcVar) {
        this.f39278d = mcVar;
    }

    @Override // cw2.eb
    public void H(mn2.j4 video) {
        kotlin.jvm.internal.o.g(video, "video");
    }

    @Override // cw2.eb
    public void K(int i17, int i18, mn2.j4 video, boolean z17) {
        kotlin.jvm.internal.o.g(video, "video");
    }

    @Override // cw2.eb
    public void c(int i17, int i18, mn2.j4 video) {
        kotlin.jvm.internal.o.g(video, "video");
    }

    @Override // cw2.eb
    public void k(java.lang.String mediaId, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
    }

    @Override // cw2.eb
    public void q(int i17, mn2.j4 video, dn.h hVar) {
        com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult;
        com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo;
        kotlin.jvm.internal.o.g(video, "video");
        pv3.j jVar = (pv3.j) this.f39278d;
        jVar.getClass();
        java.lang.String str = (hVar == null || (c2CDownloadResult = hVar.f241781p) == null || (videoInfo = c2CDownloadResult.snsVideoInfo) == null) ? null : videoInfo.videoPath;
        if (str == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i(jVar.f358603a.f358615b, "[onFinishDownload] ret:" + i17 + " videoUrl:" + str);
        pv3.f.f358589a.c(jVar.f358604b, str, jVar.f358605c);
    }

    @Override // cw2.eb
    public void z(mn2.j4 video, dn.o oVar, dn.h hVar) {
        kotlin.jvm.internal.o.g(video, "video");
    }
}
