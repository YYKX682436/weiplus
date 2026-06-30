package qd2;

/* loaded from: classes2.dex */
public class y implements cw2.eb {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f443384d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f443385e;

    /* renamed from: f, reason: collision with root package name */
    public final int f443386f;

    /* renamed from: g, reason: collision with root package name */
    public final int f443387g;

    public y(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        this.f443384d = context;
        this.f443385e = finderObject;
        this.f443386f = i17;
        this.f443387g = i18;
    }

    @Override // cw2.eb
    public void H(mn2.j4 video) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", "onStartDownload");
    }

    @Override // cw2.eb
    public void K(int i17, int i18, mn2.j4 video, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", "onMoovReadyDownload offset:" + i17 + " total:" + i18 + " moovFirstDownloaded:" + z17);
    }

    @Override // cw2.eb
    public void c(int i17, int i18, mn2.j4 video) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", "onProgressDownload offset:" + i17 + " total:" + i18);
    }

    @Override // cw2.eb
    public void k(java.lang.String mediaId, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", "onStopDownload mediaId:" + mediaId + " offset:" + i17 + " length:" + i18);
    }

    @Override // cw2.eb
    public void q(int i17, mn2.j4 video, dn.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
        java.lang.String mo148083xfb83cc9b = video.mo148083xfb83cc9b();
        qd2.d0 d0Var = qd2.d0.f443247a;
        boolean a17 = d0Var.a(mo148083xfb83cc9b);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinishDownload ret:");
        sb6.append(i17);
        sb6.append(" mediaId:");
        sb6.append(hVar != null ? hVar.f323299a : null);
        sb6.append(" videoPath:");
        sb6.append(mo148083xfb83cc9b);
        sb6.append(" isFileLegal:");
        sb6.append(a17);
        sb6.append(" feedId:");
        sb6.append(pm0.v.u(this.f443385e.m76784x5db1b11()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", sb6.toString());
        if (i17 == 0 && a17) {
            d0Var.c(this.f443384d, this.f443385e, mo148083xfb83cc9b, this.f443386f, this.f443387g);
        } else {
            d0Var.b(this.f443384d, true);
        }
    }

    @Override // cw2.eb
    public void z(mn2.j4 video, dn.o oVar, dn.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", "onStopDownload");
    }
}
