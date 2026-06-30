package tn0;

/* loaded from: classes3.dex */
public final class r0 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f502274d;

    public r0(tn0.w0 w0Var) {
        this.f502274d = w0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "docMode onSurfaceTextureAvailable, surface:" + surface + ", size:[" + i17 + ", " + i18 + ']');
        tn0.w0 w0Var = this.f502274d;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = w0Var.f502307u;
        android.view.TextureView m46523x76530f60 = c10849x610a91e1 != null ? c10849x610a91e1.m46523x76530f60() : null;
        if (m46523x76530f60 != null) {
            m46523x76530f60.setSurfaceTextureListener(null);
        }
        w0Var.f502304r.a(surface, w0Var.L());
        w0Var.f502304r.i(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "docMode onSurfaceTextureDestroyed");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "docMode onSurfaceTextureSizeChanged, surface:" + surface + ", size:[" + i17 + ", " + i18 + ']');
        this.f502274d.f502304r.i(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }
}
