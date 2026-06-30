package c61;

/* loaded from: classes4.dex */
public final class r9 implements cw2.eb {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.mc f120811d;

    public r9(zy2.mc mcVar) {
        this.f120811d = mcVar;
    }

    @Override // cw2.eb
    public void H(mn2.j4 video) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
    }

    @Override // cw2.eb
    public void K(int i17, int i18, mn2.j4 video, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
    }

    @Override // cw2.eb
    public void c(int i17, int i18, mn2.j4 video) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
    }

    @Override // cw2.eb
    public void k(java.lang.String mediaId, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
    }

    @Override // cw2.eb
    public void q(int i17, mn2.j4 video, dn.h hVar) {
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult;
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
        pv3.j jVar = (pv3.j) this.f120811d;
        jVar.getClass();
        java.lang.String str = (hVar == null || (c2CDownloadResult = hVar.f323314p) == null || (videoInfo = c2CDownloadResult.f17905xf2f04131) == null) ? null : videoInfo.f18116x4f713740;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f440136a.f440148b, "[onFinishDownload] ret:" + i17 + " videoUrl:" + str);
        pv3.f.f440122a.c(jVar.f440137b, str, jVar.f440138c);
    }

    @Override // cw2.eb
    public void z(mn2.j4 video, dn.o oVar, dn.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
    }
}
