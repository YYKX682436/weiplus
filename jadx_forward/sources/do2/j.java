package do2;

/* loaded from: classes10.dex */
public final class j implements zy2.ub {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f f323621d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f c14446xd52a323f) {
        this.f323621d = c14446xd52a323f;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f c14446xd52a323f = this.f323621d;
        c14446xd52a323f.setContentDescription(c14446xd52a323f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jp7));
        c14446xd52a323f.m58257xbb3304e2(true);
        c14446xd52a323f.m58249xa2fbf520(false);
        yz5.a onVideoCompletion = c14446xd52a323f.getOnVideoCompletion();
        if (onVideoCompletion != null) {
            onVideoCompletion.mo152xb9724478();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f c14446xd52a323f = this.f323621d;
        c14446xd52a323f.setContentDescription(c14446xd52a323f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jp8));
        c14446xd52a323f.m58257xbb3304e2(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd m58245x4ee17f0a = c14446xd52a323f.m58245x4ee17f0a();
        if (m58245x4ee17f0a != null) {
            m58245x4ee17f0a.mo58801x360802();
        }
        c14446xd52a323f.m58248x52f092c6(true);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        bool.booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f c14446xd52a323f = this.f323621d;
        c14446xd52a323f.m58257xbb3304e2(false);
        c14446xd52a323f.setContentDescription(c14446xd52a323f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jp8));
    }

    @Override // zy2.ub
    public void e3(int i17, int i18) {
        yz5.p onPlayProgressUpdated = this.f323621d.getOnPlayProgressUpdated();
        if (onPlayProgressUpdated != null) {
            onPlayProgressUpdated.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f c14446xd52a323f = this.f323621d;
        c14446xd52a323f.m58249xa2fbf520(false);
        yz5.a onVideoPause = c14446xd52a323f.getOnVideoPause();
        if (onVideoPause != null) {
            onVideoPause.mo152xb9724478();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        do2.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f.f202579s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f c14446xd52a323f = this.f323621d;
        c14446xd52a323f.e();
        c14446xd52a323f.m58249xa2fbf520(true);
        yz5.a onVideoPlay = c14446xd52a323f.getOnVideoPlay();
        if (onVideoPlay != null) {
            onVideoPlay.mo152xb9724478();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        do2.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f.f202579s;
        this.f323621d.e();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    /* renamed from: onSeekComplete */
    public void mo55683xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
