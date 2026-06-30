package gh;

/* loaded from: classes7.dex */
public final class j0 implements gh.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 f353366a;

    public j0(com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2) {
        this.f353366a = c4216x654bedf2;
    }

    @Override // gh.t
    public void a(java.lang.Object surface, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = this.f353366a;
        ah.i.b("MagicBrushView", "onSurfaceDestroyed %s, %d, %d", surface, java.lang.Integer.valueOf(c4216x654bedf2.getWidth()), java.lang.Integer.valueOf(c4216x654bedf2.getHeight()));
        c4216x654bedf2.getSurfaceListener().d(new gh.f0(surface));
        try {
            if (surface instanceof android.view.Surface) {
                com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = c4216x654bedf2.f130191n;
                if (c4209xd2d3ddad == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicbrush");
                    throw null;
                }
                c4209xd2d3ddad.l(c4216x654bedf2.getVirtualElementId(), (android.view.Surface) surface, z17);
            } else {
                if (!(surface instanceof android.graphics.SurfaceTexture)) {
                    java.lang.String format = java.lang.String.format("SurfaceType invalid. [%s]", java.util.Arrays.copyOf(new java.lang.Object[]{surface}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    throw new java.lang.RuntimeException(format);
                }
                com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad2 = c4216x654bedf2.f130191n;
                if (c4209xd2d3ddad2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicbrush");
                    throw null;
                }
                c4209xd2d3ddad2.k(c4216x654bedf2.getVirtualElementId(), (android.graphics.SurfaceTexture) surface, true);
            }
        } finally {
            c4216x654bedf2.getSurfaceListener().d(new gh.g0(surface));
        }
    }

    @Override // gh.t
    public void b(java.lang.Object surface, int i17, int i18, boolean z17, boolean z18) {
        gh.e0 e0Var = gh.e0.f353349d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        ah.i.b("MagicBrushView", "onSurfaceAvailable %s, %d, %d", surface, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = this.f353366a;
        c4216x654bedf2.getSurfaceListener().d(new gh.c0(surface, i17, i18));
        try {
            if (surface instanceof android.view.Surface) {
                com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = c4216x654bedf2.f130191n;
                if (c4209xd2d3ddad == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicbrush");
                    throw null;
                }
                c4209xd2d3ddad.i(c4216x654bedf2.getCanvasId(), c4216x654bedf2.getVirtualElementId(), (android.view.Surface) surface, i17, i18, z18);
            } else {
                if (!(surface instanceof android.graphics.SurfaceTexture)) {
                    java.lang.String format = java.lang.String.format("SurfaceType invalid. [%s]", java.util.Arrays.copyOf(new java.lang.Object[]{surface}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    throw new java.lang.RuntimeException(format);
                }
                com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad2 = c4216x654bedf2.f130191n;
                if (c4209xd2d3ddad2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicbrush");
                    throw null;
                }
                c4209xd2d3ddad2.h(c4216x654bedf2.getCanvasId(), c4216x654bedf2.getVirtualElementId(), (android.graphics.SurfaceTexture) surface, i17, i18, z17);
            }
        } finally {
            c4216x654bedf2.getSurfaceListener().d(new gh.d0(surface, i17, i18));
            c4216x654bedf2.getClass();
            c4216x654bedf2.getPreparedListeners().d(e0Var);
            c4216x654bedf2.getPreparedListeners().b();
        }
    }

    @Override // gh.t
    public void c(java.lang.Object surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        ah.i.b("MagicBrushView", "onSurfaceSizeChanged %s, %d, %d", surface, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = this.f353366a;
        c4216x654bedf2.getSurfaceListener().d(new gh.h0(surface, i17, i18));
        try {
            if (surface instanceof android.view.Surface) {
                com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = c4216x654bedf2.f130191n;
                if (c4209xd2d3ddad == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicbrush");
                    throw null;
                }
                c4209xd2d3ddad.j(c4216x654bedf2.getVirtualElementId(), (android.view.Surface) surface, i17, i18);
            } else {
                if (!(surface instanceof android.graphics.SurfaceTexture)) {
                    java.lang.String format = java.lang.String.format("SurfaceType invalid. [%s]", java.util.Arrays.copyOf(new java.lang.Object[]{surface}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    throw new java.lang.RuntimeException(format);
                }
                com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad2 = c4216x654bedf2.f130191n;
                if (c4209xd2d3ddad2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicbrush");
                    throw null;
                }
                int virtualElementId = c4216x654bedf2.getVirtualElementId();
                android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) surface;
                ah.i.b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.notifyWindowChanged ", new java.lang.Object[0]);
                if (c4209xd2d3ddad2.f130111b.f16199x4fc22df5) {
                    c4209xd2d3ddad2.j(virtualElementId, null, i17, i18);
                } else {
                    if (virtualElementId < 0) {
                        throw new java.lang.IllegalArgumentException("windowId < 0");
                    }
                    c4209xd2d3ddad2.o(new yg.u(c4209xd2d3ddad2, surfaceTexture, virtualElementId, i17, i18));
                }
            }
        } finally {
            c4216x654bedf2.getSurfaceListener().d(new gh.i0(surface, i17, i18));
        }
    }
}
