package uh3;

/* loaded from: classes15.dex */
public final class a implements android.view.TextureView.SurfaceTextureListener, vh3.a, rh3.k, rh3.d, rh3.n, rh3.i, rh3.m, rh3.e, rh3.g, rh3.h, rh3.j, rh3.f, rh3.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c f509488d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c c16524xfd73a13c) {
        this.f509488d = c16524xfd73a13c;
    }

    @Override // rh3.f
    public void a(wh3.b mediaSource, int i17, dn.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        this.f509488d.f(i17, hVar);
    }

    @Override // rh3.k
    public void b(rh3.o mp6, rh3.s mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mp6, "mp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        this.f509488d.k(mp6, mediaInfo);
    }

    @Override // rh3.e
    public void c(rh3.o player) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        this.f509488d.e();
    }

    @Override // rh3.l
    public void d(rh3.o mp6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mp6, "mp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c c16524xfd73a13c = this.f509488d;
        java.lang.String m66740xe56ce956 = c16524xfd73a13c.m66740xe56ce956();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FTPP.onInfo#handleOnSeekComplete ");
        wh3.b bVar = c16524xfd73a13c.mediaSource;
        sb6.append(bVar != null ? bVar.f527498a : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m66740xe56ce956, sb6.toString());
    }

    @Override // rh3.f
    public void e(wh3.b mediaSource, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
    }

    @Override // rh3.f
    public void f(wh3.b mediaSource, int i17, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        this.f509488d.g(i17, i18, z17);
    }

    @Override // rh3.f
    public void g(wh3.b mediaSource, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        this.f509488d.getClass();
    }

    @Override // rh3.m
    public void h(rh3.o mp6, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mp6, "mp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c c16524xfd73a13c = this.f509488d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16524xfd73a13c.m66740xe56ce956(), "FTPP.onStateChange() preState:" + i17 + " curState:" + i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16524xfd73a13c.m66740xe56ce956(), "FTPP.handleOnStateChange");
    }

    @Override // rh3.h
    public void i(rh3.o mp6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mp6, "mp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c c16524xfd73a13c = this.f509488d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16524xfd73a13c.m66740xe56ce956(), "FTPP.onInfo#firstVideoFrameRendered");
        c16524xfd73a13c.j("onFirstFrameRendered", c16524xfd73a13c.f230317q);
    }

    @Override // rh3.i
    public void j(rh3.o mp6, int i17, long j17, long j18, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mp6, "mp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c c16524xfd73a13c = this.f509488d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16524xfd73a13c.m66740xe56ce956(), "FTPP.onInfo() what:" + i17 + " arg1:" + j17 + " arg2:" + j18 + " extraObject:" + obj);
        if (i17 != 105) {
            if (i17 == 108) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16524xfd73a13c.m66740xe56ce956(), "FTPP.onInfo#firstVideoFrameRenderedAfterSurfaceChange");
                vh3.b bVar = c16524xfd73a13c.renderView;
                com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16525x59ce5768 c16525x59ce5768 = bVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16525x59ce5768 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16525x59ce5768) bVar : null;
                if (c16525x59ce5768 != null) {
                    c16525x59ce5768.post(new uh3.b(c16524xfd73a13c));
                }
            } else if (i17 == 150) {
                c16524xfd73a13c.m();
            } else if (i17 == 204) {
                int i18 = (int) j17;
                c16524xfd73a13c.getClass();
                java.lang.String m66740xe56ce956 = c16524xfd73a13c.m66740xe56ce956();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FTPP.onInfo#videoDecodeType:");
                sb6.append(i18);
                sb6.append(' ');
                wh3.b bVar2 = c16524xfd73a13c.mediaSource;
                sb6.append(bVar2 != null ? bVar2.f527498a : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m66740xe56ce956, sb6.toString());
            } else if (i17 == 502) {
                c16524xfd73a13c.getClass();
            } else if (i17 == 1006 && (obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16524xfd73a13c.m66740xe56ce956(), "FTPP.onInfo#downloadProgressUpdate: " + ((com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo) obj).f50885x990e2b68);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16524xfd73a13c.m66740xe56ce956(), "FTPP.onInfo#firstAudioFrameRendered");
        }
        c16524xfd73a13c.getClass();
    }

    @Override // rh3.f
    public void k(wh3.b mediaSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        this.f509488d.getClass();
    }

    @Override // rh3.f
    public void l(wh3.b mediaSource, dn.o oVar, dn.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        this.f509488d.h(oVar, hVar);
    }

    @Override // rh3.n
    public void m(rh3.o player, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c c16524xfd73a13c = this.f509488d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16524xfd73a13c.m66740xe56ce956(), "FTPP.OnVideoSizeChanged() width:" + i17 + " height:" + i18);
        vh3.b renderView = c16524xfd73a13c.getRenderView();
        if (renderView != null) {
            renderView.a(i17, i18);
        }
        c16524xfd73a13c.n(i17, i18);
    }

    @Override // rh3.j
    public void n(rh3.o mp6, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mp6, "mp");
        this.f509488d.l(mp6, j17, j18);
    }

    @Override // rh3.f
    public void o(wh3.b mediaSource, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        this.f509488d.getClass();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f509488d.m66740xe56ce956(), "FTPP.onSurfaceTextureAvailable  surfaceTexture:" + surfaceTexture.hashCode() + ' ' + i17 + ' ' + i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f509488d.m66740xe56ce956(), "FTPP.onSurfaceTextureDestroyed() surfaceTexture:" + surfaceTexture.hashCode());
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f509488d.m66740xe56ce956(), "FTPP.onSurfaceTextureSizeChanged  surfaceTexture:" + surfaceTexture.hashCode() + ' ' + i17 + ' ' + i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        this.f509488d.getClass();
    }

    @Override // rh3.d
    public void p(rh3.o mp6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mp6, "mp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c c16524xfd73a13c = this.f509488d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16524xfd73a13c.m66740xe56ce956(), "FTPP.onInfo#onBufferingEnd() pos:" + c16524xfd73a13c.m66738x3d7f3f1d());
        c16524xfd73a13c.c();
    }

    @Override // rh3.d
    public void q(rh3.o mp6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mp6, "mp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c c16524xfd73a13c = this.f509488d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16524xfd73a13c.m66740xe56ce956(), "FTPP.onInfo#onBufferingStart() pos:" + c16524xfd73a13c.m66738x3d7f3f1d());
        wh3.b mediaSource = c16524xfd73a13c.getMediaSource();
        c16524xfd73a13c.d(mediaSource != null ? mediaSource.f527498a : null);
    }

    @Override // rh3.g
    public void r(rh3.o mp6, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mp6, "mp");
        this.f509488d.i(mp6, i17, i18);
    }

    public void s(java.lang.Object surface) {
        android.graphics.SurfaceTexture surfaceTexture;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        boolean z17 = surface instanceof android.graphics.SurfaceTexture;
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c c16524xfd73a13c = this.f509488d;
        if (!z17) {
            if (!(surface instanceof android.view.SurfaceHolder)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c16524xfd73a13c.m66740xe56ce956(), "FTPP.onSurfaceAvailable() width:" + c16524xfd73a13c.getWidth() + " height:" + c16524xfd73a13c.getHeight() + " surface:" + surface);
                return;
            }
            android.view.SurfaceHolder surfaceHolder = (android.view.SurfaceHolder) surface;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c.f230306s;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16524xfd73a13c.m66740xe56ce956(), "FTPP.handleOnSurfaceHolderAvailable() width:" + c16524xfd73a13c.getWidth() + " height:" + c16524xfd73a13c.getHeight() + " surfaceHolder:" + surfaceHolder.hashCode());
            ((rh3.q) c16524xfd73a13c.m66742xdce4ea8b()).f477212b = surfaceHolder.getSurface();
            c16524xfd73a13c.m66744x2a55bdd7().mo162430x42c875eb(surfaceHolder.getSurface());
            c16524xfd73a13c.s();
            return;
        }
        android.graphics.SurfaceTexture surfaceTexture2 = (android.graphics.SurfaceTexture) surface;
        if (!(c16524xfd73a13c.renderView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16524xfd73a13c.m66740xe56ce956(), "handleOnSurfaceAvailable return for renderView:" + c16524xfd73a13c.renderView);
            return;
        }
        java.lang.String m66740xe56ce956 = c16524xfd73a13c.m66740xe56ce956();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FTPP.handleOnSurfaceAvailable() width:");
        sb6.append(c16524xfd73a13c.getWidth());
        sb6.append(" height:");
        sb6.append(c16524xfd73a13c.getHeight());
        sb6.append(" surfaceTexture:");
        sb6.append(surfaceTexture2.hashCode());
        sb6.append(" curSurfaceTexture:");
        android.graphics.SurfaceTexture surfaceTexture3 = c16524xfd73a13c.f230316p;
        sb6.append(surfaceTexture3 != null ? java.lang.Integer.valueOf(surfaceTexture3.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m66740xe56ce956, sb6.toString());
        c16524xfd73a13c.m66742xdce4ea8b().getClass();
        if (((rh3.q) c16524xfd73a13c.m66742xdce4ea8b()).f477212b == null || (surfaceTexture = c16524xfd73a13c.f230316p) == null) {
            c16524xfd73a13c.f230316p = surfaceTexture2;
            ((rh3.q) c16524xfd73a13c.m66742xdce4ea8b()).f477212b = new android.view.Surface(surfaceTexture2);
            c16524xfd73a13c.m66744x2a55bdd7().mo162430x42c875eb(((rh3.q) c16524xfd73a13c.m66742xdce4ea8b()).f477212b);
            c16524xfd73a13c.s();
            return;
        }
        java.lang.Boolean valueOf = android.os.Build.VERSION.SDK_INT < 26 ? java.lang.Boolean.FALSE : java.lang.Boolean.valueOf(surfaceTexture.isReleased());
        java.lang.String m66740xe56ce9562 = c16524xfd73a13c.m66740xe56ce956();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("FTPP.handleOnSurfaceAvailable() return for surface:");
        android.view.Surface surface2 = ((rh3.q) c16524xfd73a13c.m66742xdce4ea8b()).f477212b;
        sb7.append(surface2 != null ? java.lang.Integer.valueOf(surface2.hashCode()) : null);
        sb7.append(" valid:");
        android.view.Surface surface3 = ((rh3.q) c16524xfd73a13c.m66742xdce4ea8b()).f477212b;
        sb7.append(surface3 != null ? java.lang.Boolean.valueOf(surface3.isValid()) : null);
        sb7.append(" released:");
        sb7.append(valueOf);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m66740xe56ce9562, sb7.toString());
        vh3.b bVar = c16524xfd73a13c.renderView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender");
        android.graphics.SurfaceTexture surfaceTexture4 = c16524xfd73a13c.f230316p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surfaceTexture4);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56) bVar).setSurfaceTexture(surfaceTexture4);
    }

    public void t(java.lang.Object surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f509488d.m66740xe56ce956(), "FTPP.onSurfaceChange  surface:" + surface.hashCode() + ' ' + i17 + ' ' + i18);
    }

    public boolean u(java.lang.Object surface) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c c16524xfd73a13c = this.f509488d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16524xfd73a13c.m66740xe56ce956(), "FTPP.onSurfaceDestroy  surface:" + surface.hashCode());
        if (surface instanceof android.graphics.SurfaceTexture) {
            return false;
        }
        if (!(surface instanceof android.view.SurfaceHolder)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c16524xfd73a13c.m66740xe56ce956(), "FTPP.onSurfaceDestroy() surface:" + surface);
            return false;
        }
        jz5.f0 f0Var2 = null;
        c16524xfd73a13c.m66744x2a55bdd7().mo162430x42c875eb(null);
        a01.d dVar = c16524xfd73a13c.f230313m;
        java.lang.Object renderView = c16524xfd73a13c.getRenderView();
        dVar.getClass();
        if ((renderView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16525x59ce5768 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16525x59ce5768) renderView : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.b(), "captureFrame return for renderView:" + renderView + '.');
            return false;
        }
        android.view.View findViewWithTag = dVar.f81902a.findViewWithTag("MMSurfaceViewSwitchHelper.COVER_VIEW");
        jz5.f0 f0Var3 = jz5.f0.f384359a;
        if (findViewWithTag != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(dVar.b(), "showCoverBitmap return for duplicated.");
            f0Var = f0Var3;
        } else {
            f0Var = null;
        }
        if (f0Var != null) {
            return false;
        }
        android.graphics.Bitmap bitmap = dVar.f81906e;
        if (bitmap != null) {
            dVar.c((android.view.View) renderView, bitmap, " captureFrame success.");
            f0Var2 = f0Var3;
        }
        if (f0Var2 != null) {
            return false;
        }
        dVar.c((android.view.View) renderView, dVar.f81905d, "captureFrame fail.");
        return false;
    }
}
