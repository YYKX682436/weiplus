package et0;

/* loaded from: classes14.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10906xaf641c58 f338085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f338086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f338087f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f338088g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f338089h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10906xaf641c58 c10906xaf641c58, android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, android.graphics.SurfaceTexture surfaceTexture2) {
        super(0);
        this.f338085d = c10906xaf641c58;
        this.f338086e = surfaceTexture;
        this.f338087f = i17;
        this.f338088g = i18;
        this.f338089h = surfaceTexture2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.SurfaceTexture surfaceTexture = this.f338086e;
        com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10906xaf641c58 c10906xaf641c58 = this.f338085d;
        c10906xaf641c58.f150475m = surfaceTexture;
        int i17 = this.f338087f;
        c10906xaf641c58.f150477o = i17;
        int i18 = this.f338088g;
        c10906xaf641c58.f150478p = i18;
        android.view.Surface surface = new android.view.Surface(c10906xaf641c58.f150475m);
        c10906xaf641c58.f150476n = surface;
        c10906xaf641c58.f150474i = rs0.g.n(rs0.i.f480829a, surface, null, 0, 0, null, 16, null);
        ms0.c renderer = c10906xaf641c58.getRenderer();
        if (renderer != null) {
            renderer.onSurfaceCreated(null, null);
        }
        ms0.c renderer2 = c10906xaf641c58.getRenderer();
        if (renderer2 != null) {
            renderer2.t(i17, i18);
        }
        ms0.c renderer3 = c10906xaf641c58.getRenderer();
        if (renderer3 != null) {
            renderer3.k(true);
        }
        super/*com.tencent.mm.media.widget.camerarecordview.preview.CameraObservableTextureView*/.onSurfaceTextureAvailable(this.f338089h, i17, i18);
        c10906xaf641c58.f150483u = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewGLTextureView", "previewCallback?.invoke");
        yz5.l lVar = c10906xaf641c58.f150484v;
        if (lVar != null) {
            ft0.d dVar = c10906xaf641c58.f150482t;
            lVar.mo146xb9724478(dVar != null ? dVar.b() : null);
        }
        return jz5.f0.f384359a;
    }
}
