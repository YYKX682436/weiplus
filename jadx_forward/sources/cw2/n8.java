package cw2;

/* loaded from: classes2.dex */
public final class n8 implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 f305421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305422e;

    public n8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 c15183xcf23ff21, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f) {
        this.f305421d = c15183xcf23ff21;
        this.f305422e = c15196x85976f5f;
    }

    @Override // m34.e
    public void a(int i17) {
        int m61459x96d8bb66;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 c15183xcf23ff21 = this.f305421d;
        cw2.e4 e4Var = c15183xcf23ff21.playStatusListener;
        if (e4Var != null) {
            e4Var.a(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305422e;
        cw2.da videoView = c15196x85976f5f.getVideoView();
        if (videoView != null) {
            m61459x96d8bb66 = c15196x85976f5f.m61459x96d8bb66();
            videoView.r(i17, true, m61459x96d8bb66);
        }
        cw2.v9.n(this.f305422e, 0, null, null, 7, null);
        c15183xcf23ff21.mo61296x11f3be80(true);
        yz5.a onSeekEnd = c15183xcf23ff21.getOnSeekEnd();
        if (onSeekEnd != null) {
            onSeekEnd.mo152xb9724478();
        }
        bb2.y2 bulletLifecycle = c15196x85976f5f.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bb2.y2.r(bulletLifecycle, i17, false, 2, null);
        }
        cw2.h8 playInfo = c15196x85976f5f.getPlayInfo();
        if (playInfo != null) {
            if (!playInfo.f305284g) {
                playInfo = null;
            }
            if (playInfo != null) {
                ec2.g m61491xe16f3d0b = c15196x85976f5f.m61491xe16f3d0b();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = playInfo.f305278a;
                if (m61491xe16f3d0b != null) {
                    long m59124x87980ca = c14989xf862ae88.m59124x87980ca();
                    java.lang.String dupFlag = c14989xf862ae88.getDupFlag();
                    r45.mb4 mb4Var = playInfo.f305280c.f411535e;
                    cw2.da videoView2 = c15196x85976f5f.getVideoView();
                    ((ec2.h) m61491xe16f3d0b).d(m59124x87980ca, dupFlag, mb4Var, videoView2 != null ? videoView2.mo56686xe906e26b() : 0, i17, playInfo.f305280c);
                }
                long m59124x87980ca2 = c14989xf862ae88.m59124x87980ca();
                cw2.da videoView3 = c15196x85976f5f.getVideoView();
                java.lang.String mo56696x9040359a = videoView3 != null ? videoView3.mo56696x9040359a() : null;
                cw2.da videoView4 = c15196x85976f5f.getVideoView();
                c15196x85976f5f.R(m59124x87980ca2, mo56696x9040359a, videoView4 != null ? videoView4.mo56686xe906e26b() : 0, i17);
            }
        }
    }

    @Override // m34.e
    public void b() {
        this.f305422e.b0(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 c15183xcf23ff21 = this.f305421d;
        c15183xcf23ff21.mo61296x11f3be80(false);
        yz5.a onSeekStart = c15183xcf23ff21.getOnSeekStart();
        if (onSeekStart != null) {
            onSeekStart.mo152xb9724478();
        }
    }

    @Override // m34.e
    public void d(int i17) {
    }
}
