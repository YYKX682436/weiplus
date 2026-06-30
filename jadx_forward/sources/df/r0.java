package df;

/* loaded from: classes15.dex */
public final class r0 extends df.c {

    /* renamed from: a, reason: collision with root package name */
    public final df.z f311075a;

    /* renamed from: b, reason: collision with root package name */
    public final int f311076b;

    public r0(df.z flutterView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterView, "flutterView");
        this.f311075a = flutterView;
        this.f311076b = i17;
        flutterView.m124146x3569ec4f();
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface;
        flutterView.m124152x2517081e(i17);
        flutterView.m137278x5a78fe54(false);
        df.b0 b0Var = df.b0.f310961d;
    }

    @Override // df.a0
    public void a(boolean z17) {
    }

    @Override // df.a0
    public void b(boolean z17) {
        this.f311075a.setVisibility(z17 ? 0 : 4);
    }

    @Override // df.a0
    public void d(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 renderMode, java.lang.Runnable finish) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderMode, "renderMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finish, "finish");
        if (renderMode == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture) {
            finish.run();
            return;
        }
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.e("SkylineFlutterViewWrapperTextureViewImpl", "addOnSwitchRenderListener " + renderMode + " not support");
    }

    @Override // df.a0
    public void e() {
        this.f311075a.d();
    }

    @Override // df.a0
    public void f(df.d dVar) {
        df.z flutterView = this.f311075a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterView, "flutterView");
        flutterView.m137283xa83bcec0(new df.a(dVar));
        flutterView.m124150x97646c1f(new df.b(dVar));
    }

    @Override // df.a0
    public void g() {
        df.z zVar = this.f311075a;
        try {
            com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95770x70229f4e(zVar);
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.a("SkylineFlutterViewWrapperTextureViewImpl", "detachFlutterView NPE, flutterView in partial-attach state", e17);
        }
        df.g.f310991a.c(zVar);
    }

    @Override // df.a0
    public void h(boolean z17) {
    }

    @Override // df.a0
    public void i(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f311075a.c(context);
    }

    @Override // df.a0
    public void j(android.view.ViewGroup contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        df.z zVar = this.f311075a;
        zVar.d();
        android.graphics.SurfaceTexture m124145x2556cec6 = zVar.m124145x2556cec6();
        if (zVar.getParent() instanceof android.view.ViewGroup) {
            android.view.ViewParent parent = zVar.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(zVar);
        }
        if (m124145x2556cec6 == null || zVar.m137271xccfd02b()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.a("SkylineFlutterViewWrapperTextureViewImpl", "switchContentView can't use oldRenderSurface ,oldRenderSurface: " + m124145x2556cec6 + " ,isInSwapSurface is " + zVar.m137271xccfd02b() + " may cause flash", new java.lang.Object[0]);
        } else {
            try {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 m124147x19cc2a81 = zVar.m124147x19cc2a81();
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 c28552x398ac0c4 = m124147x19cc2a81 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 ? (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4) m124147x19cc2a81 : null;
                if (c28552x398ac0c4 != null) {
                    c28552x398ac0c4.setSurfaceTexture(m124145x2556cec6);
                }
                com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineFlutterViewWrapperTextureViewImpl", "switchContentView setSurfaceTexture use oldRenderSurface");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.a("SkylineFlutterViewWrapperTextureViewImpl", "setSurfaceTexture error " + e17, new java.lang.Object[0]);
            }
        }
        m();
        contentView.addView(zVar);
    }

    @Override // df.a0
    public void l() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m95771xf7af55c8;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5 m137422x78d49c4b;
        df.z zVar = this.f311075a;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137262x60866884 = zVar.m137262x60866884();
        int i17 = this.f311076b;
        if (m137262x60866884 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m137262x60866884, com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95771xf7af55c8(i17))) {
            try {
                com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95763xf0c9f339(i17, zVar);
            } catch (java.lang.IllegalStateException e17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.a("SkylineFlutterViewWrapperTextureViewImpl", "attachFlutterEngine failed, retry after surface ready", e17);
                zVar.post(new df.q0(this));
            }
            if (df.h.f311011i.get() || (m95771xf7af55c8 = com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95771xf7af55c8(i17)) == null || (m137422x78d49c4b = m95771xf7af55c8.m137422x78d49c4b()) == null) {
                return;
            }
            m137422x78d49c4b.m138144x6479a43a();
        }
    }

    @Override // df.a0
    public void m() {
        df.z zVar = this.f311075a;
        if (zVar.f311150f.mo137196x1f8c622()) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137264x385aa5fd = zVar.m137264x385aa5fd();
            if ((m137264x385aa5fd == null || m137264x385aa5fd.m138028x6250be46()) ? false : true) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineFlutterViewWrapperTextureViewImpl", "reconnectSurfaceToRenderIfNotDisplaying", new java.lang.Object[0]);
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137264x385aa5fd2 = zVar.m137264x385aa5fd();
                if (m137264x385aa5fd2 != null) {
                    m137264x385aa5fd2.m138048x9a9e0888(zVar.m124147x19cc2a81().mo137194x19cc2a81(), false);
                }
            }
        }
    }

    @Override // df.a0
    /* renamed from: setBackgroundColor */
    public void mo124125x67f06213(int i17) {
        this.f311075a.setBackgroundColor(i17);
    }
}
