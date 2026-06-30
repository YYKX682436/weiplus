package wh5;

/* loaded from: classes12.dex */
public final class s extends pf3.g implements uf3.a {
    public boolean A;
    public long B;
    public final java.util.Set C;
    public final pf3.a D;
    public final pf3.a E;
    public final pf3.a F;
    public final pf3.a G;

    /* renamed from: v, reason: collision with root package name */
    public em.n1 f527622v;

    /* renamed from: w, reason: collision with root package name */
    public lg3.a f527623w;

    /* renamed from: x, reason: collision with root package name */
    public vh5.a f527624x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f527625y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f527626z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.ChatLiveBottomBarLayer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        this.C = new java.util.LinkedHashSet();
        this.D = Z(this, "disabled", wh5.m.f527610d);
        this.E = Z(this, "translate", new wh5.r(this));
        this.F = Z(this, "normal", new wh5.o(this));
        this.G = Z(this, "normalHd", new wh5.n(this));
    }

    public static final void g0(wh5.s sVar, dg3.q qVar) {
        mf3.k kVar;
        dg3.m mVar;
        mf3.s sVar2 = sVar.f407643m;
        if (sVar2 == null || (kVar = sVar2.f407650a) == null || (mVar = (dg3.m) sVar.H(dg3.m.class)) == null) {
            return;
        }
        mVar.Z0(kVar, sVar.f435359s, qVar);
    }

    @Override // rf3.h
    public void D() {
        mf3.k kVar;
        e0();
        mf3.s sVar = this.f407643m;
        if (((sVar == null || (kVar = sVar.f407650a) == null) ? null : kVar.mo147256x74bf41ce()) == mf3.w.f407661d) {
            S(this, this.F);
        } else {
            S(this, this.G);
        }
        a0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        mf3.k kVar;
        super.F();
        i0();
        a0();
        for (java.lang.String viewId : this.C) {
            vh5.a aVar = this.f527624x;
            if (aVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Ui(aVar.f518733a, aVar.f518734b, 1, viewId);
            }
        }
        mf3.s sVar = this.f407643m;
        if (((sVar == null || (kVar = sVar.f407650a) == null) ? null : kVar.mo147256x74bf41ce()) == mf3.w.f407661d) {
            vh5.a.f518732e = false;
        } else {
            vh5.a.f518732e = true;
        }
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ejk, (android.view.ViewGroup) null);
        this.f527622v = new em.n1(inflate);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // rf3.h
    public void b() {
        S(this, this.D);
    }

    @Override // pf3.g, pf3.h
    public void c() {
        if (this.f527625y) {
            return;
        }
        super.c();
    }

    @Override // pf3.g
    public void c0() {
        super.c0();
        b0();
    }

    @Override // pf3.g
    public void d0(boolean z17) {
        if (z17) {
            return;
        }
        for (java.lang.String viewId : this.C) {
            vh5.a aVar = this.f527624x;
            if (aVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
                h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
                ((g90.s) vVar).Vi(aVar.f518733a, aVar.f518734b, 1, viewId);
            }
        }
    }

    @Override // pf3.g
    public void f0() {
        if (this.f527625y) {
            return;
        }
        super.f0();
    }

    @Override // rf3.h
    public void h() {
        e0();
        S(this, this.E);
        a0();
    }

    public final boolean h0() {
        mf3.k kVar;
        vf3.a aVar;
        vf3.b T4;
        mf3.s sVar = this.f407643m;
        return (sVar == null || (kVar = sVar.f407650a) == null || (aVar = (vf3.a) H(vf3.a.class)) == null || (T4 = aVar.T4(kVar)) == null || T4.f517899b <= 0 || T4.f517901d <= 0 || T4.f517903f) ? false : true;
    }

    public final void i0() {
        mf3.k kVar;
        vf3.a aVar;
        vf3.f X6;
        mf3.s sVar = this.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null || (aVar = (vf3.a) H(vf3.a.class)) == null || (X6 = ((vf3.i) aVar).X6(kVar)) == null) {
            return;
        }
        lg3.a aVar2 = this.f527623w;
        if (aVar2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar2).h(kVar, X6);
        }
        if (X6.f517922a == vf3.e.f517917n) {
            S(this, this.E);
        } else if (kVar.mo147256x74bf41ce() == mf3.w.f407661d) {
            S(this, this.F);
        } else {
            S(this, this.G);
        }
    }

    public final void j0(android.view.View view, java.lang.String str, android.view.View.OnClickListener onClickListener) {
        wh5.p pVar = new wh5.p(this, str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        java.lang.String V = V(view);
        java.util.Map map = this.f435355q;
        if (map.containsKey(V)) {
            throw new java.lang.RuntimeException("register visibilityListener, duplicate id: " + V);
        }
        map.put(V, pVar);
        pf3.d.U(this, view, null, new wh5.q(onClickListener, view, this, str), 1, null);
    }

    public final void k0() {
        mf3.k kVar;
        vf3.a aVar;
        vf3.f X6;
        vf3.e eVar;
        mf3.s sVar = this.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null || (aVar = (vf3.a) H(vf3.a.class)) == null || (X6 = ((vf3.i) aVar).X6(kVar)) == null || !((eVar = X6.f517922a) == vf3.e.f517911e || eVar == vf3.e.f517914h || eVar == vf3.e.f517917n)) {
            Q("isResourceNotReady, delay startPlay", new java.lang.Object[0]);
            this.f527626z = true;
        } else {
            uf3.c cVar = (uf3.c) g(uf3.c.class);
            if (cVar != null) {
                ((uf3.g) cVar).X();
            }
        }
    }

    public final void l0() {
        mf3.k kVar;
        mf3.s sVar = this.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null || kVar.mo147256x74bf41ce() != mf3.w.f407661d) {
            return;
        }
        Q("tryDownloadHD execute", new java.lang.Object[0]);
        kVar.f(mf3.w.f407662e);
        uf3.c cVar = (uf3.c) g(uf3.c.class);
        if (cVar != null) {
            ((uf3.g) cVar).V();
        }
    }

    @Override // uf3.a
    public void m(vf3.e state, vf3.f extraInfo) {
        vh5.a aVar;
        mf3.k kVar;
        lg3.a aVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraInfo, "extraInfo");
        mf3.s sVar = this.f407643m;
        java.lang.Object obj = sVar != null ? sVar.f407650a : null;
        wh5.v vVar = obj instanceof wh5.v ? (wh5.v) obj : null;
        if (vVar == null) {
            return;
        }
        if (vVar.f527631c == mf3.w.f407662e) {
            vf3.e eVar = extraInfo.f517922a;
            if (sVar != null && (kVar = sVar.f407650a) != null && (aVar2 = this.f527623w) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar2).h(kVar, extraInfo);
            }
            if (eVar == vf3.e.f517913g) {
                a0();
            }
            if (eVar == vf3.e.f517916m) {
                S(this, this.F);
            }
            if (eVar == vf3.e.f517914h && (aVar = this.f527624x) != null) {
                android.app.Activity activity = aVar.f518733a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.gallery.ImageGalleryUI");
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b) activity;
                h90.v vVar2 = (h90.v) i95.n0.c(h90.v.class);
                android.app.Activity activity2 = aVar.f518733a;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = aVar.f518734b;
                ((g90.s) vVar2).ij(activity2, f9Var, 1, 0, vh5.a.f518731d, viewOnClickListenerC21748xb3d38e6b.d7(f9Var));
                h90.v vVar3 = (h90.v) i95.n0.c(h90.v.class);
                android.app.Activity activity3 = aVar.f518733a;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = aVar.f518734b;
                ((g90.s) vVar3).cj(activity3, f9Var2, 1, vh5.a.f518731d, viewOnClickListenerC21748xb3d38e6b.c7(f9Var2));
                vh5.a.f518732e = true;
            }
        }
        if (state == vf3.e.f517919p) {
            this.f527625y = true;
            c0();
        } else {
            this.f527625y = false;
            f0();
        }
        if (state == vf3.e.f517914h) {
            if (this.f527626z) {
                Q("startPlay after onLiveLoadSuccess", new java.lang.Object[0]);
                k0();
                this.f527626z = false;
            }
            if (this.A) {
                Q("tryDownloadHD after onLiveLoadSuccess", new java.lang.Object[0]);
                l0();
                this.A = false;
            }
        }
    }

    @Override // mf3.l
    /* renamed from: onPause */
    public void mo129547xb01dfb57() {
        b0();
    }

    @Override // mf3.l
    /* renamed from: onResume */
    public void mo124474x57429eec() {
        e0();
        a0();
    }

    @Override // pf3.g, mf3.l
    public void q(float f17) {
        super.q(f17);
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        super.t(bindContext);
        this.A = false;
        this.f527626z = false;
        vh5.a aVar = this.f527624x;
        if (aVar != null) {
            vh5.a.f518730c = 0;
        }
        mf3.s sVar = this.f407643m;
        java.lang.Object obj = sVar != null ? sVar.f407650a : null;
        wh5.v vVar = obj instanceof wh5.v ? (wh5.v) obj : null;
        if (vVar != null) {
            if (aVar != null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo = vVar.f527629a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
                aVar.f518734b = msgInfo;
            }
            lg3.a aVar2 = this.f527623w;
            if (aVar2 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar2).h(vVar, new vf3.f(vf3.e.f517910d, null, 0, 0.0f, 14, null));
            }
        }
        i0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        super.u(parentView);
        android.content.Context K = K();
        android.app.Activity activity = K instanceof android.app.Activity ? (android.app.Activity) K : null;
        if (activity != null) {
            this.f527624x = new vh5.a(activity);
        }
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2549xbc1609e9.C20473x21afd34e()) == 1) {
            em.n1 n1Var = this.f527622v;
            if (n1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            n1Var.g().setImageResource(com.p314xaae8f345.mm.R.raw.f79963x411ef6b4);
        }
        em.n1 n1Var2 = this.f527622v;
        if (n1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        if (n1Var2.f336170i == null) {
            n1Var2.f336170i = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16498xbbb303ca) n1Var2.f336162a.findViewById(com.p314xaae8f345.mm.R.id.u9w);
        }
        n1Var2.f336170i.m66609x311b1826(0);
        em.n1 n1Var3 = this.f527622v;
        if (n1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        if (n1Var3.f336168g == null) {
            n1Var3.f336168g = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16498xbbb303ca) n1Var3.f336162a.findViewById(com.p314xaae8f345.mm.R.id.uzd);
        }
        n1Var3.f336168g.m66609x311b1826(1);
        em.n1 n1Var4 = this.f527622v;
        if (n1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        n1Var4.b().m66605x311b1826(0);
        em.n1 n1Var5 = this.f527622v;
        if (n1Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        n1Var5.c().m66605x311b1826(1);
        em.n1 n1Var6 = this.f527622v;
        if (n1Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.view.View b17 = n1Var6.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getBtnHd(...)");
        pf3.d.W(this, b17, null, 1, null);
        j0(b17, "pic_video_full_image", new wh5.g(this));
        em.n1 n1Var7 = this.f527622v;
        if (n1Var7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        this.f527623w = n1Var7.b();
        em.n1 n1Var8 = this.f527622v;
        if (n1Var8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.view.View c17 = n1Var8.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getBtnLive(...)");
        pf3.d.W(this, c17, null, 1, null);
        T(c17, new pf3.j(0, kg3.c.a(java.lang.Double.valueOf(1.5d)), 0, kg3.c.a(java.lang.Double.valueOf(1.5d))), new wh5.h(this));
        em.n1 n1Var9 = this.f527622v;
        if (n1Var9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 f17 = n1Var9.f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getBtnShare(...)");
        f17.m66605x311b1826(0);
        f17.m66606xd5938adf(new wh5.l0(f17));
        pf3.d.W(this, f17, null, 1, null);
        j0(f17, "pic_video_forward", new wh5.i(this));
        em.n1 n1Var10 = this.f527622v;
        if (n1Var10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 a17 = n1Var10.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getBtnGrid(...)");
        a17.m66605x311b1826(1);
        a17.m66606xd5938adf(new wh5.l0(a17));
        pf3.d.W(this, a17, null, 1, null);
        j0(a17, "pic_video_wall", new wh5.j(this));
        em.n1 n1Var11 = this.f527622v;
        if (n1Var11 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 e17 = n1Var11.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getBtnSave(...)");
        e17.m66605x311b1826(2);
        e17.m66606xd5938adf(new wh5.l0(e17));
        pf3.d.W(this, e17, null, 1, null);
        j0(e17, "pic_video_save", new wh5.k(this));
        em.n1 n1Var12 = this.f527622v;
        if (n1Var12 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 d17 = n1Var12.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getBtnMore(...)");
        d17.m66605x311b1826(3);
        d17.m66606xd5938adf(new wh5.l0(d17));
        pf3.d.W(this, d17, null, 1, null);
        j0(d17, "pic_video_three_dot", new wh5.l(this));
    }

    @Override // uf3.a
    public void v(vf3.b bVar) {
        lg3.a aVar = this.f527623w;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar).g(bVar);
        }
        i0();
    }
}
