package gf;

/* loaded from: classes7.dex */
public final class a2 extends gf.w implements sf.g, ni1.f {

    /* renamed from: p, reason: collision with root package name */
    public static final gg.c f352544p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.HashMap f352545q = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final gf.d0 f352546e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.MutableContextWrapper f352547f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer f352548g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f352549h;

    /* renamed from: i, reason: collision with root package name */
    public final gf.k1 f352550i;

    /* renamed from: m, reason: collision with root package name */
    public final df.s0 f352551m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f352552n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f352553o;

    static {
        gg.c mo131512x21f05ec7 = gg.d.m131513x9cf0d20b().mo131512x21f05ec7();
        f352544p = mo131512x21f05ec7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo131512x21f05ec7);
        gg.a aVar = (gg.a) mo131512x21f05ec7;
        aVar.f353019c = new gf.q1();
        aVar.f353017a = eg.c.m127676x9cf0d20b();
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138825xe0688274(new gf.r1());
    }

    public a2(gf.d0 skylineRenderer, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(skylineRenderer, "skylineRenderer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f352546e = skylineRenderer;
        android.content.MutableContextWrapper mutableContextWrapper = new android.content.MutableContextWrapper(context);
        this.f352547f = mutableContextWrapper;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) skylineRenderer.F();
        this.f352548g = bVar != null ? java.lang.Integer.valueOf(bVar.b2()) : null;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar2 = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) skylineRenderer.F();
        this.f352549h = bVar2 != null ? java.lang.Integer.valueOf(bVar2.mo50260x9f1221c2()) : null;
        int i17 = gf.k1.f352635y;
        gf.k1 j1Var = android.os.Build.VERSION.SDK_INT >= 29 ? new gf.j1(mutableContextWrapper) : new gf.k1(mutableContextWrapper);
        gf.z1 z1Var = new gf.z1(j1Var, this);
        j1Var.addOnAttachStateChangeListener(new gf.w1(this));
        j1Var.m131398x7ab6cb8a(new gf.x1(z1Var));
        j1Var.addOnLayoutChangeListener(new gf.y1(z1Var));
        this.f352550i = j1Var;
        df.s0 s0Var = new df.s0();
        s0Var.f311081b = new gf.s1(this);
        this.f352551m = s0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dd
    public void D() {
        xi1.g mo50261xee5260a9;
        u(null);
        df.w0 w0Var = df.w0.f311102a;
        df.s0 handler = this.f352551m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        if (df.w0.f311106e == null) {
            ef.m mVar = new ef.m();
            mVar.f333657a = new df.v0();
            if (android.os.Build.VERSION.SDK_INT < 30) {
                mVar.f333671o = com.p314xaae8f345.mm.ui.bl.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            }
            df.w0.f311106e = mVar;
        }
        ((java.util.ArrayList) df.w0.f311112k).add(handler);
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) this.f352546e.F();
        if (bVar == null || (mo50261xee5260a9 = bVar.mo50261xee5260a9()) == null) {
            return;
        }
        F(mo50261xee5260a9);
    }

    public final void F(xi1.g windowAndroid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowAndroid, "windowAndroid");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineViewRenderEngine", "updateWindowAndroid windowAndroid:" + windowAndroid + " context:" + windowAndroid.mo52325x76847179());
        android.app.Activity a17 = q75.a.a(windowAndroid.mo52325x76847179());
        if (a17 != null) {
            df.w1 t17 = t();
            if (t17 != null) {
                t17.y(new df.m1(t17, new java.lang.ref.WeakReference(a17)));
                return;
            }
            return;
        }
        df.w1 t18 = t();
        if (t18 != null) {
            t18.m();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void N(int i17, int i18) {
        df.w1 t17 = t();
        if (t17 != null) {
            android.content.res.Resources resources = this.f352547f.getResources();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "getResources(...)");
            float f17 = resources.getDisplayMetrics().density;
            float f18 = i17 / f17;
            float f19 = i18 / f17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", "updateViewport, call view size[" + f18 + " x " + f19 + ']', new java.lang.Object[0]);
            t17.y(new df.u1(f18, f19, t17));
        }
    }

    @Override // ni1.f
    public void P() {
        df.w1 t17 = t();
        if (t17 != null) {
            t17.P();
        }
    }

    @Override // ni1.f
    public void V() {
        df.w1 t17;
        df.w1 t18 = t();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(t18 != null ? t18.f311116g : null, this.f352550i) || (t17 = t()) == null) {
            return;
        }
        t17.V();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void b() {
        java.lang.Integer num = this.f352548g;
        java.lang.Integer num2 = this.f352549h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineViewRenderEngine", "page [%d]-[%d] onForeground", num, num2);
        if (this.f352552n) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineViewRenderEngine", "skipAttachFlutterViewOnForeground", new java.lang.Object[0]);
            this.f352552n = false;
        } else {
            s();
        }
        df.w1 t17 = t();
        if (t17 != null) {
            java.util.ArrayList arrayList = t17.f311121o;
            if (num2 != null && !arrayList.contains(num2)) {
                arrayList.add(num2);
            }
            boolean z17 = (!t17.f311122p) & (arrayList.size() > 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", "id:" + t17.f311113d + " call resume,mResumedPages=" + arrayList + " ,switchResumed=" + z17, new java.lang.Object[0]);
            if (z17) {
                t17.f311122p = true;
                t17.y(new df.j1(t17));
                t17.y(new df.k1(t17));
                t17.u(t17.f311131y);
            }
        }
        gf.k1 k1Var = this.f352550i;
        if (k1Var.f352588o) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = k1Var.f352590q;
            n3Var.mo50300x3fa464aa(k1Var.f352593t);
            if (k1Var.getForeground() != null) {
                n3Var.mo50297x7c4d7ca2(k1Var.f352591r, android.animation.ValueAnimator.getFrameDelay() * 5);
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1) kz5.n0.Y(k1Var.f352589p);
                if (c28553x45ef20c1 != null) {
                    c28553x45ef20c1.m137255x6d15a5c6(k1Var.f352592s);
                }
            }
        }
        this.f352551m.f311080a = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void c() {
        df.w1 t17;
        java.lang.Integer num = this.f352548g;
        java.lang.Integer num2 = this.f352549h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineViewRenderEngine", "page [%d]-[%d] onBackground", num, num2);
        if (!this.f352553o && (t17 = t()) != null) {
            t17.t(num2);
        }
        this.f352553o = false;
        this.f352551m.f311080a = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: destroy */
    public void mo14659x5cd39ffa() {
        xi1.m mVar = this.f352714d;
        if (mVar != null) {
            mVar.b(null);
            mVar.mo53823x41012807();
        }
        this.f352714d = null;
        gf.k1 k1Var = this.f352550i;
        ze.n nVar = k1Var.f352639x;
        if (nVar != null && k1Var.f352637v != null && k1Var.f352638w != null) {
            gf.o1 a17 = gf.o1.f352688b.a(nVar);
            java.lang.Integer num = k1Var.f352637v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            df.w1 a18 = a17.a(num.intValue());
            java.lang.Integer num2 = k1Var.f352638w;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
            int intValue = num2.intValue();
            a18.t(java.lang.Integer.valueOf(intValue));
            java.util.LinkedList linkedList = a18.f311125s;
            linkedList.remove(java.lang.Integer.valueOf(intValue));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", "removeRefPage window " + a18.f311113d + " currentRef " + linkedList, new java.lang.Object[0]);
            if (linkedList.size() == 0) {
                a18.m();
                if (!a18.f311123q.getAndSet(true)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", "id:" + a18.f311113d + " release, cur window can't no longer be used", new java.lang.Object[0]);
                    yz5.a aVar = a18.f311126t;
                    if (aVar != null) {
                        aVar.mo152xb9724478();
                    }
                    a18.f311120n.clear();
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    a18.i(context);
                    df.w0 w0Var = df.w0.f311102a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(df.w0.f311111j).remove(a18.f311130x);
                    p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
                    p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                    p3325xe03a0797.p3326xc267989b.l.d(b17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new df.r1(a18, null), 2, null);
                }
            }
        }
        k1Var.f352639x = null;
        df.w0 w0Var2 = df.w0.f311102a;
        df.s0 handler = this.f352551m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        ((java.util.ArrayList) df.w0.f311112k).remove(handler);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void e0(java.lang.Runnable runnable) {
        df.w1 t17;
        if (runnable == null || (t17 = t()) == null) {
            return;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m95789xf25c5088 = com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95789xf25c5088(t17.f311113d);
        if (m95789xf25c5088 == null) {
            runnable.run();
        } else if (m95789xf25c5088.m138028x6250be46()) {
            android.view.Choreographer.getInstance().postFrameCallback(new gf.t1(runnable));
        } else {
            m95789xf25c5088.m138017x9a2d27f9(new gf.u1(m95789xf25c5088, runnable));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public android.graphics.Bitmap f() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getContentView */
    public android.view.View mo14662xc2a54588() {
        return this.f352550i;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getHeight */
    public int mo14664x1c4fb41d() {
        android.view.ViewGroup viewGroup;
        df.w1 t17 = t();
        if (t17 == null || (viewGroup = t17.f311116g) == null) {
            return 0;
        }
        return viewGroup.getMeasuredHeight();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getWebScrollX */
    public int mo14666x95a6d12d() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getWebScrollY */
    public int mo14667x95a6d12e() {
        return 0;
    }

    @Override // sf.g
    /* renamed from: getWebViewPluginClientProxy */
    public gg.c mo52236xa4c58e8d() {
        gg.c cVar = f352544p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
        return cVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getWidth */
    public int mo14668x755bd410() {
        android.view.ViewGroup viewGroup;
        df.w1 t17 = t();
        if (t17 == null || (viewGroup = t17.f311116g) == null) {
            return 0;
        }
        return viewGroup.getMeasuredWidth();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getWrapperView */
    public android.view.View mo14669x50cdf8a2() {
        return this.f352550i;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u h0(java.lang.Class cls) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cls);
        if (cls.isInstance(this)) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u) cls.cast(this);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void i(android.content.Context context) {
        if (context == null) {
            return;
        }
        this.f352547f.setBaseContext(context);
        df.w1 t17 = t();
        if (t17 != null) {
            t17.i(context);
        }
    }

    public final void s() {
        gf.k1 k1Var = this.f352550i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(k1Var, "null cannot be cast to non-null type android.view.ViewGroup");
        k1Var.getClass();
        ze.n nVar = k1Var.f352639x;
        java.lang.Integer num = k1Var.f352637v;
        if (num == null || nVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.a("SkylineViewContainer", "attachFlutterView error " + num + ", " + k1Var.f352638w + ',' + nVar, new java.lang.Object[0]);
            return;
        }
        df.w1 a17 = gf.o1.f352688b.a(nVar).a(num.intValue());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineViewContainer", "attachFlutterView  window-" + num + " to page-" + k1Var.f352638w, new java.lang.Object[0]);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k1Var, a17.f311116g)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", "switchContentView", new java.lang.Object[0]);
        a17.f311116g = k1Var;
        df.a0 a0Var = a17.f311118i;
        if (a0Var != null) {
            a0Var.j(k1Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setBackgroundColor */
    public void mo14671x67f06213(int i17) {
        df.a0 a0Var;
        df.w1 t17 = t();
        if (t17 == null || (a0Var = t17.f311118i) == null) {
            return;
        }
        a0Var.mo124125x67f06213(i17);
    }

    public final df.w1 t() {
        return this.f352550i.m131409x327797a4();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x017d A[LOOP:0: B:63:0x017a->B:65:0x017d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe r30) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.a2.u(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public boolean w() {
        return false;
    }

    public final void y(boolean z17, int i17) {
        gf.k1 k1Var = this.f352550i;
        if (z17) {
            k1Var.d();
            k1Var.m131399xbbaf7560(true);
            k1Var.m131397x9bf1b7f9(i17);
            k1Var.m131395x609ab971(true);
            return;
        }
        k1Var.d();
        k1Var.m131395x609ab971(false);
        k1Var.m131397x9bf1b7f9(0);
        k1Var.m131399xbbaf7560(false);
    }
}
