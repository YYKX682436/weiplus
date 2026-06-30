package o20;

/* loaded from: classes14.dex */
public final class y implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p737xc53e9ae1.C10556x2b36b1cb f423934d;

    public y(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p737xc53e9ae1.C10556x2b36b1cb c10556x2b36b1cb) {
        this.f423934d = c10556x2b36b1cb;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        o20.c0 c0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        if (this.f423934d.f147470h != null) {
            android.graphics.SurfaceTexture surfaceTexture2 = this.f423934d.f147469g;
            if (surfaceTexture2 != null) {
                this.f423934d.f147466d.setSurfaceTexture(surfaceTexture2);
                return;
            }
            return;
        }
        this.f423934d.f147469g = surfaceTexture;
        this.f423934d.f147470h = new android.view.Surface(surfaceTexture);
        android.view.Surface surface = this.f423934d.f147470h;
        if (surface == null || (c0Var = this.f423934d.f147471i) == null) {
            return;
        }
        kk4.b.h(((o20.i) c0Var).f423915a, surface, false, 2, null);
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
