package et0;

/* loaded from: classes14.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et0.k f338065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f338066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f338067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f338068g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(et0.k kVar, int i17, int i18, android.view.Surface surface) {
        super(0);
        this.f338065d = kVar;
        this.f338066e = i17;
        this.f338067f = i18;
        this.f338068g = surface;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        et0.k kVar = this.f338065d;
        kVar.getClass();
        android.view.Surface surface = this.f338068g;
        kVar.f338077e = surface;
        kVar.f338076d = rs0.g.n(rs0.i.f480829a, surface, null, 0, 0, null, 30, null);
        ms0.c cVar = kVar.f338080h;
        if (cVar != null) {
            cVar.onSurfaceCreated(null, null);
        }
        ms0.c cVar2 = kVar.f338080h;
        if (cVar2 != null) {
            cVar2.t(this.f338066e, this.f338067f);
        }
        ms0.c cVar3 = kVar.f338080h;
        if (cVar3 != null) {
            cVar3.k(true);
        }
        kVar.f338082m = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewGLTextureRender", "previewCallback?.invoke");
        yz5.l lVar = kVar.f338083n;
        if (lVar != null) {
            ft0.d dVar = kVar.f338081i;
            lVar.mo146xb9724478(dVar != null ? dVar.b() : null);
        }
        return jz5.f0.f384359a;
    }
}
