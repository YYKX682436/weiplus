package pc3;

/* loaded from: classes7.dex */
public final class c implements gh.r {

    /* renamed from: d, reason: collision with root package name */
    public gh.t f434903d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f434904e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 f434905f;

    public c(android.content.Context context, com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad magicBrush) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(magicBrush, "magicBrush");
        pc3.b bVar = new pc3.b(context, this, magicBrush);
        bVar.m34866xdd3a8900(false);
        bVar.m34867x7867078f(magicBrush);
        this.f434905f = bVar;
    }

    @Override // gh.r
    /* renamed from: getSurface */
    public java.lang.Object mo131547xcf572877() {
        return this.f434904e;
    }

    @Override // gh.r
    /* renamed from: getThisView */
    public android.view.View mo131549xc514bbd9() {
        return this.f434905f;
    }

    @Override // gh.r
    /* renamed from: getViewType */
    public gh.y mo131550xc321a0f5() {
        return gh.y.SurfaceView;
    }

    @Override // gh.r
    public void n(boolean z17, int i17, yz5.l callback, com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        callback.mo146xb9724478(java.lang.Boolean.FALSE);
    }

    @Override // gh.r
    /* renamed from: onDestroy */
    public void mo131551xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBRendererView", "onDestroy() called");
        this.f434904e = null;
        this.f434903d = null;
    }

    @Override // gh.r
    /* renamed from: setSurfaceListener */
    public void mo131552xb06c83bf(gh.t tVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBRendererView", "setSurfaceListener() called with: l = " + tVar);
        this.f434903d = tVar;
    }
}
