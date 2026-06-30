package ws2;

/* loaded from: classes3.dex */
public final class i1 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.k1 f530587d;

    public i1(ws2.k1 k1Var) {
        this.f530587d = k1Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onVideoEnded,");
        ws2.u0 u0Var = ws2.k1.f530599r;
        ws2.k1 k1Var = this.f530587d;
        sb6.append(k1Var.i());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", sb6.toString());
        dt2.a0 a0Var = k1Var.f530616o;
        if (a0Var != null) {
            a0Var.i();
        }
        ws2.k1.b(k1Var, 1);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        java.lang.Boolean bool;
        android.content.Context mo58769xfdd9c5e5;
        android.content.res.Resources resources;
        android.content.res.Configuration configuration;
        ws2.k1 k1Var = this.f530587d;
        mm2.c1 c1Var = (mm2.c1) k1Var.e(mm2.c1.class);
        if (c1Var != null) {
            c1Var.f410412s2 = i17;
        }
        mm2.c1 c1Var2 = (mm2.c1) k1Var.e(mm2.c1.class);
        if (c1Var2 != null) {
            c1Var2.f410418t2 = i18;
        }
        mm2.c1 c1Var3 = (mm2.c1) k1Var.e(mm2.c1.class);
        boolean z17 = c1Var3 != null && c1Var3.L9();
        mm2.c1 c1Var4 = (mm2.c1) k1Var.e(mm2.c1.class);
        boolean z18 = c1Var4 != null && c1Var4.R7();
        dt2.b0 b0Var = k1Var.f530606e;
        boolean z19 = (b0Var == null || (mo58769xfdd9c5e5 = b0Var.mo58769xfdd9c5e5()) == null || (resources = mo58769xfdd9c5e5.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) ? false : true;
        ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
        boolean z27 = jVar != null && jVar.f303805p;
        dt2.a0 a0Var = k1Var.f530616o;
        java.lang.Boolean bool2 = null;
        if (a0Var != null) {
            bool = java.lang.Boolean.valueOf(a0Var.f324691a.m58783x8f7ec8ee() == 1);
        } else {
            bool = null;
        }
        dt2.a0 a0Var2 = k1Var.f530616o;
        if (a0Var2 != null) {
            bool2 = java.lang.Boolean.valueOf(a0Var2.f324691a.m58783x8f7ec8ee() == 0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", "onGetVideoSize sessionId:" + str + ",mediaId:" + str2 + ",width:" + i17 + "-height:" + i18 + ",supportScreenRotation:" + z17 + ",isLandscapeVideo:" + z18 + ",orientationLandscape:" + z19 + ",isScreenShareMode:" + z27 + ",isFitScaleType:" + bool + ",isFillScaleType:" + bool2 + ',' + k1Var.i());
        if ((z17 && z18) || z19 || z27) {
            dt2.a0 a0Var3 = k1Var.f530616o;
            if (a0Var3 != null) {
                a0Var3.h();
            }
        } else {
            dt2.a0 a0Var4 = k1Var.f530616o;
            if (a0Var4 != null) {
                a0Var4.g();
            }
        }
        dt2.b0 b0Var2 = k1Var.f530606e;
        if (b0Var2 != null) {
            b0Var2.l(i17, i18);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        bool.booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", "onVideoWaiting sessionId:" + str + ",mediaId:" + str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onVideoPause,");
        ws2.u0 u0Var = ws2.k1.f530599r;
        ws2.k1 k1Var = this.f530587d;
        sb6.append(k1Var.i());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", sb6.toString());
        dt2.b0 b0Var = k1Var.f530606e;
        if (b0Var != null) {
            b0Var.k();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onVideoPlay,");
        ws2.u0 u0Var = ws2.k1.f530599r;
        ws2.k1 k1Var = this.f530587d;
        sb6.append(k1Var.i());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", sb6.toString());
        dt2.b0 b0Var = k1Var.f530606e;
        if (b0Var != null) {
            b0Var.f();
        }
        ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
        if (jVar == null) {
            return;
        }
        jVar.d7(1);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", "onVideoWaitingEnd sessionId:" + str + ",mediaId:" + str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    /* renamed from: onSeekComplete */
    public void mo55683xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        int mo100915xddd35a52 = (int) ((interfaceC26164x73fc6bc6 != null ? interfaceC26164x73fc6bc6.mo100915xddd35a52() : 0L) / 1000);
        ws2.k1 k1Var = this.f530587d;
        ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
        int i17 = jVar != null ? jVar.f303806q : 0;
        int i18 = mo100915xddd35a52 > 0 ? mo100915xddd35a52 : i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", "onSeekComplete playCurPositionMs:" + mo100915xddd35a52 + ",curOffset:" + i17);
        ws2.k1.c(k1Var, i18);
        java.util.Iterator it = k1Var.f530612k.iterator();
        while (it.hasNext()) {
            ((xs2.c1) it.next()).a(i18);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", "onVideoFirstFrameDraw sessionId:" + str + ",mediaId:" + str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
