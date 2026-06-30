package mo0;

/* loaded from: classes3.dex */
public final class e implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 f411792d;

    public e(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1) {
        this.f411792d = c10849x610a91e1;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = this.f411792d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c10849x610a91e1.f150138d, "onSurfaceTextureAvailable " + surface);
        yz5.l lVar = c10849x610a91e1.f150143i;
        if (lVar != null) {
        }
        yz5.p pVar = c10849x610a91e1.f150144m;
        if (pVar != null) {
        }
        yz5.a aVar = c10849x610a91e1.f150146o;
        if (aVar != null) {
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f411792d.f150138d, "onSurfaceTextureDestroyed " + surface);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = this.f411792d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c10849x610a91e1.f150138d, "onSurfaceTextureSizeChanged width is " + i17 + " and height is " + i18 + ' ' + surface);
        yz5.p pVar = c10849x610a91e1.f150144m;
        if (pVar != null) {
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f411792d.f150138d, "onSurfaceTextureUpdated " + surface);
    }
}
