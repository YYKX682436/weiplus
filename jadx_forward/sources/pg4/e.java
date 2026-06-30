package pg4;

/* loaded from: classes7.dex */
public final class e extends hq0.i0 {
    public com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d A;
    public oe0.q B;
    public final java.util.Collection C;
    public final java.util.HashSet D;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f435768x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f435769y;

    /* renamed from: z, reason: collision with root package name */
    public hq0.e0 f435770z;

    public e() {
        super(null, 1, null);
        this.f435768x = "MagicGameLoading";
        this.f435769y = "";
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5 f5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) c17;
        this.C = kz5.n0.t0(kz5.c0.i(new lq0.g(), new og4.b(), new og4.a(), new og4.c()), ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f4.class))).Ni("MagicGameLoading"));
        ((et.o) ((ft.b4) i95.n0.c(ft.b4.class))).getClass();
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eb();
        this.D = kz5.p1.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eb.class.getName(), f5Var.Vc(969).getClass().getName(), f5Var.Vc(970).getClass().getName(), f5Var.Vc(984).getClass().getName(), f5Var.Vc(1065).getClass().getName(), f5Var.Vc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.r.f34013x366c91de).getClass().getName(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.g0.class.getName(), f5Var.Vc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.m0.f33740x366c91de).getClass().getName());
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        android.app.Activity activity;
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        if (k17 != null && (activity = (android.app.Activity) k17.get()) != null) {
            return activity;
        }
        java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
        if (j17 != null) {
            return (android.app.Activity) j17.get();
        }
        return null;
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerTag, "containerTag");
        return new tp0.l();
    }

    public final void J1(android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "createFrameSetView");
        if (viewGroup != null) {
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            this.A = new com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d(context, null, 0, 6, null);
        }
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = this.A;
        if (c10867x3e50a04d != null) {
            c10867x3e50a04d.e(this.f435768x);
        }
        int generateViewId = android.view.View.generateViewId();
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d2 = this.A;
        if (c10867x3e50a04d2 != null) {
            c10867x3e50a04d2.setId(generateViewId);
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, -1);
        if (viewGroup != null) {
            viewGroup.addView(this.A);
        }
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d3 = this.A;
        if (c10867x3e50a04d3 != null) {
            c10867x3e50a04d3.setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d4 = this.A;
        hq0.e0 e0Var = this.f435770z;
        if (e0Var != null && c10867x3e50a04d4 != null) {
            c10867x3e50a04d4.a(e0Var);
        }
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d5 = this.A;
        if (c10867x3e50a04d5 != null) {
            c10867x3e50a04d5.bringToFront();
        }
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d6 = this.A;
        if (c10867x3e50a04d6 != null) {
            c10867x3e50a04d6.getId();
        }
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        return "MagicGameLoading";
    }

    @Override // hq0.i0, jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envId, "envId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        super.Q9(envId, msg);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "onJSException envId:" + envId + ",msg:" + msg);
    }

    @Override // hq0.i0
    public void X0() {
        hq0.e0 e0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        super.X0();
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        jc3.j0 j0Var = this.f364528g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.T9((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) c17, ((rc3.w0) j0Var).f475620e, null, 2, null);
        this.f435768x = "MagicGameLoading";
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b(null, null, null, null, false, false, false, null, false, null, 1023, null);
        c16416x87606a7b.f229367x = this;
        c16416x87606a7b.f229354h = z65.c.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.y4.a(c16416x87606a7b, this.D);
        c16416x87606a7b.a(this.C);
        I1(c16416x87606a7b);
        mo123044x68ac462();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "createFrameSetRoot");
        java.lang.Object obj = new java.lang.Object();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f435770z = hq0.i0.K0(this, obj, context, "MagicGameLoading", "frames", "", false, 32, null);
        java.lang.String str = this.f435768x;
        if (str != null) {
            if (!(str.length() > 0) || (e0Var = this.f435770z) == null) {
                return;
            }
            cl0.g gVar = new cl0.g();
            gVar.h("frameSetName", str);
            e0Var.a(this.f435769y, gVar.toString());
        }
    }

    @Override // hq0.i0, jc3.u
    public void b1() {
        super.b1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "onConnException");
    }

    @Override // hq0.i0, jc3.u
    public void n() {
        super.n();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "onMainScriptInjected");
    }

    @Override // hq0.i0, jc3.u
    /* renamed from: onDestroy */
    public void mo123043xac79a11b(int i17) {
        super.mo123043xac79a11b(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "onDestroy");
        this.B = null;
    }

    @Override // hq0.i0
    public void s1(hq0.e0 root, fq0.x frameSet, java.lang.String info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "onBind: info is ".concat(info));
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = frameSet.f347021l;
        if (c10867x3e50a04d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "sclView empty, addCustomView error");
        } else if (frameSet.f347025p == 0) {
            int C0 = C0(c10867x3e50a04d);
            frameSet.f347025p = C0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "viewId is assigned:" + C0);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "viewId is already assigned:" + frameSet.f347025p);
        }
        super.s1(root, frameSet, info);
    }
}
