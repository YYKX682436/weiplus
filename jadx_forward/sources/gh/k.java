package gh;

/* loaded from: classes7.dex */
public class k extends android.view.TextureView implements gh.r, android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f353367d;

    /* renamed from: e, reason: collision with root package name */
    public gh.t f353368e;

    /* renamed from: f, reason: collision with root package name */
    public final gh.y f353369f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f353367d = this;
        super.setSurfaceTextureListener(this);
        this.f353369f = gh.y.TextureView;
    }

    @Override // gh.r
    /* renamed from: getSurface */
    public java.lang.Object mo131547xcf572877() {
        return gh.q.a(this);
    }

    @Override // gh.r
    /* renamed from: getThisView */
    public android.view.View mo131549xc514bbd9() {
        return this.f353367d;
    }

    @Override // gh.r
    /* renamed from: getViewType */
    public gh.y mo131550xc321a0f5() {
        return this.f353369f;
    }

    @Override // gh.r
    public void n(boolean z17, int i17, yz5.l callback, com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        callback.mo146xb9724478(java.lang.Boolean.TRUE);
    }

    @Override // gh.r
    /* renamed from: onDestroy */
    public void mo131551xac79a11b() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        gh.t tVar = this.f353368e;
        if (tVar != null) {
            gh.s.a(tVar, surface, i17, i18, true, false, 16, null);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        gh.t tVar = this.f353368e;
        if (tVar != null) {
            tVar.a(surface, false);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        gh.t tVar = this.f353368e;
        if (tVar != null) {
            tVar.c(surface, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }

    @Override // gh.r
    /* renamed from: setSurfaceListener */
    public void mo131552xb06c83bf(gh.t tVar) {
        this.f353368e = tVar;
    }
}
