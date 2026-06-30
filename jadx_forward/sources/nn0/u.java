package nn0;

/* loaded from: classes14.dex */
public final class u extends nn0.h implements nn0.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f420096d = "OptCustomRender_" + hashCode();
    }

    @Override // nn0.h
    public boolean a(nn0.b bVar, java.lang.Object obj) {
        return false;
    }

    @Override // nn0.h, nn0.o
    public void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420096d, "pause: ");
        e(z17);
    }

    @Override // nn0.h
    public void g(nn0.b bVar, android.graphics.SurfaceTexture surfaceTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        try {
            android.view.Surface surface = this.f420106q;
            if (surface == null) {
                surface = new android.view.Surface(surfaceTexture);
            }
            this.f420107r = surface;
            if (bVar != null) {
                bVar.i(surface);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f420096d, e17, "CustomGLRenderImp eglSetupSurface failed!", new java.lang.Object[0]);
        }
    }

    @Override // nn0.p
    /* renamed from: getEGLContext */
    public android.opengl.EGLContext mo149803xe0fe423b() {
        nn0.b bVar = this.A;
        if (bVar != null) {
            return bVar.E;
        }
        return null;
    }

    @Override // nn0.h
    public void h(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture tXLiteAVTexture) {
        nn0.b bVar = this.A;
        boolean z17 = false;
        if (bVar != null && bVar.f420085w) {
            z17 = true;
        }
        if (!z17) {
            java.lang.String str = this.f420096d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("renderInternal: render error, has not init, isIsEGLInit=");
            nn0.b bVar2 = this.A;
            sb6.append(bVar2 != null ? java.lang.Boolean.valueOf(bVar2.f420085w) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, sb6.toString());
            return;
        }
        if (bVar.E != null) {
            super.h(tXLiteAVTexture);
            return;
        }
        java.lang.String str2 = this.f420096d;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("renderInternal: render error, egl context is null, mCustomGLRenderImp.eglContext14=");
        sb7.append(this.A.E);
        sb7.append(", txLiteAVTexture?.eglContext=");
        sb7.append(tXLiteAVTexture != null ? tXLiteAVTexture.f46516x77710645 : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, sb7.toString());
    }

    @Override // nn0.h, nn0.o
    public void n7(int i17) {
        this.N = i17;
        this.f420097e = i17 == 2;
    }

    @Override // nn0.p
    /* renamed from: release */
    public void mo149804x41012807() {
        nn0.g gVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420096d, "release: ");
        synchronized (this) {
            nn0.b bVar = this.A;
            if (bVar != null && (gVar = this.f420100h) != null) {
                gVar.obtainMessage(3, bVar).sendToTarget();
            }
        }
        i();
    }

    @Override // nn0.h, nn0.o
    /* renamed from: startPlay */
    public void mo149801x8113c2b6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420096d, "startPlay: ");
        d();
    }

    @Override // nn0.h, nn0.o
    /* renamed from: stopPlay */
    public void mo149802x66343656(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f420096d, "stopPlay: ");
        e(z17);
    }

    @Override // nn0.p
    public void y4(yz5.a afterInit) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(afterInit, "afterInit");
        c();
        nn0.t tVar = new nn0.t(this, afterInit);
        nn0.g gVar = this.f420100h;
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f420096d, "queue: gl handler is null");
        } else {
            gVar.post(tVar);
        }
    }
}
