package ig2;

/* loaded from: classes3.dex */
public final class b implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ig2.d f372898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mn0.b0 f372899e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 f372900f;

    public b(ig2.d dVar, mn0.b0 b0Var, com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614) {
        this.f372898d = dVar;
        this.f372899e = b0Var;
        this.f372900f = c10850xc00cf614;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        ls5.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        this.f372898d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentShopWindowDirector", "switchInLiveRoom switch view success. #1");
        mn0.b0 b0Var = this.f372899e;
        if (b0Var != null) {
            b0Var.z(this.f372900f, i17, i18);
        }
        if (b0Var == null || (dVar = ((mn0.y) b0Var).f411340f) == null) {
            return;
        }
        dVar.f402661h = null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }
}
