package df;

/* loaded from: classes15.dex */
public final class p0 extends df.c {

    /* renamed from: a, reason: collision with root package name */
    public final df.z f311065a;

    /* renamed from: b, reason: collision with root package name */
    public final int f311066b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f311067c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f311068d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f311069e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f311070f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f311071g;

    public p0(df.z flutterView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterView, "flutterView");
        this.f311065a = flutterView;
        this.f311066b = i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f311067c = hashMap;
        flutterView.m137278x5a78fe54(true);
        flutterView.m124152x2517081e(i17);
        hashMap.put(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface, new java.util.ArrayList());
        hashMap.put(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture, new java.util.ArrayList());
        df.b0 b0Var = df.b0.f310961d;
        this.f311069e = p3325xe03a0797.p3326xc267989b.z0.b();
    }

    public static final java.lang.Object n(df.p0 p0Var, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p0Var.getClass();
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        c28641x1f60b8df.m138030x29812006(new df.n0(rVar));
        c28641x1f60b8df.m138039x4fb41144();
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f440719d ? j17 : jz5.f0.f384359a;
    }

    @Override // df.a0
    public void a(boolean z17) {
        p(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface, z17);
    }

    @Override // df.a0
    public void b(boolean z17) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137264x385aa5fd;
        int i17 = z17 ? 0 : 4;
        df.z zVar = this.f311065a;
        zVar.setVisibility(i17);
        if (!z17 || (m137264x385aa5fd = zVar.m137264x385aa5fd()) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "setRenderSurfaceVisible " + this.f311066b + ", visible:" + z17 + ", displaying:" + m137264x385aa5fd.m138028x6250be46());
        if (m137264x385aa5fd.m138028x6250be46()) {
            return;
        }
        m137264x385aa5fd.m138039x4fb41144();
    }

    @Override // df.a0
    public void d(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 renderMode, java.lang.Runnable finish) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderMode, "renderMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finish, "finish");
        synchronized (this.f311067c) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f311067c.get(renderMode);
            if (arrayList == null) {
                return;
            }
            if (!arrayList.contains(finish)) {
                arrayList.add(finish);
            }
        }
    }

    @Override // df.a0
    public void e() {
        this.f311065a.d();
    }

    @Override // df.a0
    public void f(df.d dVar) {
        df.z flutterView = this.f311065a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterView, "flutterView");
        flutterView.m137283xa83bcec0(new df.a(dVar));
        flutterView.m124150x97646c1f(new df.b(dVar));
    }

    @Override // df.a0
    public void g() {
        df.z zVar = this.f311065a;
        try {
            com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95770x70229f4e(zVar);
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.a("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "detachFlutterView NPE, flutterView in partial-attach state", e17);
        }
        df.g.f310991a.c(zVar);
    }

    @Override // df.a0
    public void h(boolean z17) {
        p(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture, z17);
    }

    @Override // df.a0
    public void i(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f311065a.c(context);
    }

    @Override // df.a0
    public void j(android.view.ViewGroup contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        df.z zVar = this.f311065a;
        zVar.d();
        android.graphics.SurfaceTexture m124145x2556cec6 = zVar.m124145x2556cec6();
        if (zVar.getParent() instanceof android.view.ViewGroup) {
            android.view.ViewParent parent = zVar.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(zVar);
        }
        if (m124145x2556cec6 == null || zVar.m137271xccfd02b()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.a("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "switchContentView can't use oldRenderSurface ,oldRenderSurface: " + m124145x2556cec6 + " ,isInSwapSurface is " + zVar.m137271xccfd02b() + " may cause flash", new java.lang.Object[0]);
        } else {
            try {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 m124147x19cc2a81 = zVar.m124147x19cc2a81();
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 c28552x398ac0c4 = m124147x19cc2a81 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 ? (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4) m124147x19cc2a81 : null;
                if (c28552x398ac0c4 != null) {
                    c28552x398ac0c4.setSurfaceTexture(m124145x2556cec6);
                }
                com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "switchContentView setSurfaceTexture use oldRenderSurface");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.a("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "setSurfaceTexture error " + e17, new java.lang.Object[0]);
            }
        }
        m();
        contentView.addView(zVar);
    }

    @Override // df.a0
    public void k(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 renderMode, java.lang.Runnable finish) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderMode, "renderMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finish, "finish");
        synchronized (this.f311067c) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f311067c.get(renderMode);
            if (arrayList == null) {
                return;
            }
            arrayList.remove(finish);
        }
    }

    @Override // df.a0
    public void l() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m95771xf7af55c8;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28652xd6ce13f5 m137422x78d49c4b;
        int i17 = this.f311066b;
        df.z zVar = this.f311065a;
        com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95763xf0c9f339(i17, zVar);
        if (!df.h.f311011i.get() && (m95771xf7af55c8 = com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95771xf7af55c8(i17)) != null && (m137422x78d49c4b = m95771xf7af55c8.m137422x78d49c4b()) != null) {
            m137422x78d49c4b.m138144x6479a43a();
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137264x385aa5fd = zVar.m137264x385aa5fd();
        if (m137264x385aa5fd == null) {
            return;
        }
        m137264x385aa5fd.m138044xfa000f4b(true);
    }

    @Override // df.a0
    public void m() {
        df.z zVar = this.f311065a;
        if (zVar.f311150f.mo137196x1f8c622()) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137264x385aa5fd = zVar.m137264x385aa5fd();
            if ((m137264x385aa5fd == null || m137264x385aa5fd.m138028x6250be46()) ? false : true) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "reconnectSurfaceToRenderIfNotDisplaying", new java.lang.Object[0]);
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137264x385aa5fd2 = zVar.m137264x385aa5fd();
                if (m137264x385aa5fd2 != null) {
                    m137264x385aa5fd2.m138048x9a9e0888(zVar.m124147x19cc2a81().mo137194x19cc2a81(), false);
                }
            }
        }
    }

    public final void o(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079) {
        synchronized (this.f311067c) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f311067c.get(enumC28568xbdfb1079);
            if (arrayList == null) {
                return;
            }
            java.util.Iterator it = new java.util.ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df.p0.p(io.flutter.embedding.android.RenderMode, boolean):void");
    }

    @Override // df.a0
    /* renamed from: setBackgroundColor */
    public void mo124125x67f06213(int i17) {
        this.f311065a.setBackgroundColor(i17);
    }
}
