package in0;

/* loaded from: classes3.dex */
public final class d implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in0.q f374277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn0.a f374278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.TextureView f374279f;

    public d(in0.q qVar, long j17, jn0.a aVar, android.view.TextureView textureView) {
        this.f374277d = qVar;
        this.f374278e = aVar;
        this.f374279f = textureView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "float onSurfaceTextureAvailable, surface:" + surface + ", size:[" + i17 + ", " + i18 + ']');
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        jn0.a aVar = this.f374278e;
        int i19 = com.p314xaae8f345.mm.ui.bl.b(aVar.f382008a).x;
        int i27 = com.p314xaae8f345.mm.ui.bl.b(aVar.f382008a).y;
        if (i19 <= i27) {
            i19 = i27;
            i27 = i19;
        }
        fn0.g gVar = fn0.g.f345728a;
        boolean z18 = false;
        if (fn0.g.f345729b != null) {
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.I5).mo141623x754a37bb()).r()).intValue() == 0) {
                z18 = true;
            }
        }
        if (!z18) {
            if (i17 < i18) {
                i18 = (int) (i17 * (i19 / i27));
            } else if (i18 < i17) {
                i17 = (int) (i18 * (i19 / i27));
            }
        }
        in0.q qVar = this.f374277d;
        qVar.f502304r.a(this.f374279f.getSurfaceTexture(), qVar.L());
        qVar.f502304r.i(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "float onSurfaceTextureDestroyed");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "float onSurfaceTextureSizeChanged, surface:" + surface + ", size:[" + i17 + ", " + i18 + ']');
        this.f374277d.f502304r.i(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }
}
