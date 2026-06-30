package nn0;

/* loaded from: classes10.dex */
public abstract class i extends com.p314xaae8f345.p2926x359365.C25485x5a0a6891 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f420116a;

    /* renamed from: b, reason: collision with root package name */
    public final nn0.o f420117b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f420118c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f420119d;

    public i(android.content.Context context, boolean z17, int i17) {
        super(context);
        this.f420116a = false;
        this.f420117b = null;
        this.f420118c = false;
        this.f420119d = false;
        this.f420116a = z17;
        if (z17) {
            nn0.o a17 = a(context);
            this.f420117b = a17;
            a17.n7(i17);
            a17.d1(true);
        }
    }

    public abstract nn0.o a(android.content.Context context);

    public void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pauseRender: mUseTXLivePlayerCustomRender=");
        boolean z17 = this.f420116a;
        sb6.append(z17);
        sb6.append(", mCustomRender=");
        nn0.o oVar = this.f420117b;
        sb6.append(oVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CustomRender.CustomTXLivePlayer", sb6.toString());
        this.f420119d = true;
        if (!z17 || oVar == null) {
            return;
        }
        super.m94531x2fcefe03(null, null);
    }

    public void c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resumeRender: mUseTXLivePlayerCustomRender=");
        boolean z17 = this.f420116a;
        sb6.append(z17);
        sb6.append(", mCustomRender=");
        nn0.o oVar = this.f420117b;
        sb6.append(oVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CustomRender.CustomTXLivePlayer", sb6.toString());
        this.f420119d = false;
        if (!z17 || oVar == null || this.f420118c) {
            return;
        }
        super.m94531x2fcefe03((com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXLivePlayVideoRenderListener) oVar, null);
    }

    public void d(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, nn0.c0 c0Var) {
        nn0.o oVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CustomRender.CustomTXLivePlayer", "setPlayerView with function");
        if (!this.f420116a || (oVar = this.f420117b) == null) {
            super.mo94524x9951f728(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
        } else {
            oVar.j4(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, c0Var);
        }
    }

    public int e(boolean z17, boolean z18) {
        nn0.o oVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopPlay: clearLastFrame=");
        sb6.append(z17 ? "true" : "false");
        sb6.append(", onlyPause=");
        sb6.append(z18 ? "true" : "false");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CustomRender.CustomTXLivePlayer", sb6.toString());
        if (this.f420116a && (oVar = this.f420117b) != null) {
            if (z18) {
                oVar.f(z17);
            } else {
                oVar.mo149802x66343656(z17);
            }
        }
        return super.mo94537x66343656(z17);
    }

    @Override // com.p314xaae8f345.p2926x359365.C25485x5a0a6891
    /* renamed from: pause */
    public void mo94516x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CustomRender.CustomTXLivePlayer", "pause");
        this.f420118c = true;
        super.mo94516x65825f6();
        if (!this.f420116a || this.f420117b == null) {
            return;
        }
        super.m94531x2fcefe03(null, null);
        super.m94518x7d94ff92(null);
    }

    @Override // com.p314xaae8f345.p2926x359365.C25485x5a0a6891
    /* renamed from: resume */
    public void mo94517xc84dc82d() {
        nn0.o oVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CustomRender.CustomTXLivePlayer", "resume");
        this.f420118c = false;
        super.mo94517xc84dc82d();
        if (!this.f420116a || (oVar = this.f420117b) == null) {
            return;
        }
        if (!this.f420119d) {
            super.m94531x2fcefe03((com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXLivePlayVideoRenderListener) oVar, null);
        }
        super.m94518x7d94ff92((com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioRawDataListener) oVar);
    }

    @Override // com.p314xaae8f345.p2926x359365.C25485x5a0a6891
    /* renamed from: setPlayListener */
    public void mo94523xbdb2cd8a(com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1) {
        nn0.o oVar;
        if (this.f420116a && (oVar = this.f420117b) != null) {
            oVar.mo149798xbdb2cd8a(interfaceC25479x1853e9c1);
        }
        super.mo94523xbdb2cd8a(interfaceC25479x1853e9c1);
    }

    @Override // com.p314xaae8f345.p2926x359365.C25485x5a0a6891
    /* renamed from: setPlayerView */
    public void mo94524x9951f728(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        nn0.o oVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CustomRender.CustomTXLivePlayer", "setPlayerView");
        if (!this.f420116a || (oVar = this.f420117b) == null) {
            super.mo94524x9951f728(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
        } else {
            oVar.j4(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, null);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.C25485x5a0a6891
    /* renamed from: setRenderMode */
    public void mo94525x638e3a5b(int i17) {
        nn0.o oVar;
        if (this.f420116a && (oVar = this.f420117b) != null) {
            oVar.mo149799x638e3a5b(i17);
        }
        super.mo94525x638e3a5b(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.C25485x5a0a6891
    /* renamed from: setRenderRotation */
    public void mo94526x4594f436(int i17) {
        nn0.o oVar;
        if (this.f420116a && (oVar = this.f420117b) != null) {
            oVar.mo149800x4594f436(i17);
        }
        super.mo94526x4594f436(i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.C25485x5a0a6891
    /* renamed from: startLivePlay */
    public int mo94535x5c1200c2(java.lang.String str, int i17) {
        nn0.o oVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = this.f420118c ? "true" : "false";
        objArr[3] = this.f420119d ? "true" : "false";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CustomRender.CustomTXLivePlayer", "startLivePlay: url=%s, playType=%d, isPaused=%s, isPauseRender=%s", objArr);
        if (this.f420118c || this.f420119d) {
            this.f420118c = false;
            this.f420119d = false;
            if (this.f420116a && (oVar = this.f420117b) != null) {
                super.m94531x2fcefe03((com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXLivePlayVideoRenderListener) oVar, null);
                super.m94518x7d94ff92((com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioRawDataListener) oVar);
            }
        }
        return super.mo94535x5c1200c2(str, i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.C25485x5a0a6891
    /* renamed from: stopPlay */
    public int mo94537x66343656(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CustomRender.CustomTXLivePlayer", "stopPlay");
        return e(z17, false);
    }
}
