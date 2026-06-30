package pv3;

/* loaded from: classes4.dex */
public final class i implements zy2.ub {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.ub f440130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pv3.m f440131e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f440132f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f440133g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f440134h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f440135i;

    public i(pv3.m mVar, android.widget.FrameLayout frameLayout, android.view.View view, long j17, in5.s0 s0Var) {
        this.f440131e = mVar;
        this.f440132f = frameLayout;
        this.f440133g = view;
        this.f440134h = j17;
        this.f440135i = s0Var;
        if (!zy2.ub.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(zy2.ub.class.getClassLoader(), new java.lang.Class[]{zy2.ub.class}, pm0.v.f438336b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.findersdk.api.IFinderVideoViewCallback");
        }
        this.f440130d = (zy2.ub) newProxyInstance;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        this.f440130d.E(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f440130d.I(str, str2, i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f440131e.f440148b, "[onError] sessionId:" + str + " mediaId:" + str2 + " errorMsg:" + str3 + " what:" + i17 + " extra:" + i18);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        android.view.View view;
        this.f440131e.getClass();
        android.widget.FrameLayout frameLayout = this.f440132f;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.a(frameLayout != null ? java.lang.Float.valueOf(frameLayout.getAlpha()) : null, 0.0f) || (view = this.f440133g) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/manager/MusicPickerFinderFeedPlayManager", "showLoading", "(Landroid/widget/FrameLayout;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/manager/MusicPickerFinderFeedPlayManager", "showLoading", "(Landroid/widget/FrameLayout;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // zy2.ub
    public void e3(int i17, int i18) {
        this.f440130d.e3(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        this.f440130d.i(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        this.f440130d.l(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        this.f440131e.a(this.f440133g);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        this.f440130d.o(str, str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    /* renamed from: onSeekComplete */
    public void mo55683xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        this.f440130d.mo55683xe1fdf750(interfaceC26164x73fc6bc6);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        pv3.m mVar = this.f440131e;
        nv3.l lVar = (nv3.l) ((jz5.n) mVar.f440151e).mo141623x754a37bb();
        if (lVar != null) {
            lVar.a(this.f440134h);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mVar.f440148b, "[onVideoFirstFrameDraw] sessionId:" + str + " mediaId:" + str2);
        mVar.b(this.f440135i, true);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        this.f440130d.v3(str, str2, i17, i18, i19);
    }
}
