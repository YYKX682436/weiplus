package rf3;

/* loaded from: classes12.dex */
public class u extends mf3.e implements rf3.q, mg3.d, sf3.l, ml5.g, rf3.v {

    /* renamed from: o, reason: collision with root package name */
    public final mf3.p f476535o;

    /* renamed from: p, reason: collision with root package name */
    public em.l1 f476536p;

    /* renamed from: q, reason: collision with root package name */
    public em.k1 f476537q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f476538r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f476539s;

    /* renamed from: t, reason: collision with root package name */
    public sf3.d f476540t;

    /* renamed from: u, reason: collision with root package name */
    public lf3.k f476541u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.l f476542v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.ImagePreviewLayer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        this.f476535o = apiCenter;
        this.f476538r = jz5.h.b(new rf3.r(this));
        this.f476539s = jz5.h.b(new rf3.t(this));
    }

    public static /* synthetic */ void X(rf3.u uVar, java.lang.String str, sf3.g gVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLoadFailed");
        }
        if ((i17 & 2) != 0) {
            gVar = null;
        }
        uVar.W(str, gVar);
    }

    @Override // mg3.d
    public void B(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        mf3.o oVar = (mf3.o) g(mf3.o.class);
        if (oVar != null) {
            oVar.j();
        }
    }

    @Override // mf3.e, mf3.l
    public void F() {
        mf3.k kVar;
        java.lang.String g17;
        this.f407644n = true;
        R();
        cg3.a aVar = (cg3.a) H(cg3.a.class);
        if (aVar != null) {
            aVar.u3(new rf3.s(this));
        }
        mf3.s sVar = this.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null || (g17 = kVar.g()) == null) {
            return;
        }
        Y(g17);
    }

    @Override // mf3.e, mf3.n
    public mf3.p G() {
        return this.f476535o;
    }

    @Override // mf3.e, kg3.d
    public void H2() {
        Q("onVerticalUIApply", new java.lang.Object[0]);
        Z(true);
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f476536p = new em.l1(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ejh, (android.view.ViewGroup) null));
        android.view.View view = S().f336069a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "getInflateRootView(...)");
        return view;
    }

    public final em.l1 S() {
        em.l1 l1Var = this.f476536p;
        if (l1Var != null) {
            return l1Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
        throw null;
    }

    public final void T() {
        em.k1 k1Var = this.f476537q;
        android.view.View view = k1Var != null ? k1Var.f336031a : null;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/media/image/ImagePreviewLayer", "hideFailedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/media/image/ImagePreviewLayer", "hideFailedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        S().a().setVisibility(0);
    }

    public final void U(sf3.g param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        em.l1 S = S();
        if (S.f336076h == null) {
            S.f336076h = (android.widget.ProgressBar) S.f336069a.findViewById(com.p314xaae8f345.mm.R.id.h9c);
        }
        S.f336076h.setVisibility(8);
        T();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4) ((jz5.n) this.f476539s).mo141623x754a37bb()).e(param);
        lf3.k a17 = lf3.l.f399859a.a(param.c());
        this.f476541u = a17;
        if (a17 != null) {
            Q("parserImageInfo: " + this.f476541u, new java.lang.Object[0]);
        }
        R();
    }

    public final void V(sf3.g param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        em.l1 S = S();
        if (S.f336076h == null) {
            S.f336076h = (android.widget.ProgressBar) S.f336069a.findViewById(com.p314xaae8f345.mm.R.id.h9c);
        }
        S.f336076h.setVisibility(0);
        T();
    }

    public final void W(java.lang.String failMsg, sf3.g gVar) {
        android.widget.TextView b17;
        android.widget.ImageView a17;
        android.widget.ImageView a18;
        android.widget.TextView b18;
        android.view.View view;
        android.widget.ImageView a19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(failMsg, "failMsg");
        em.l1 S = S();
        if (S.f336076h == null) {
            S.f336076h = (android.widget.ProgressBar) S.f336069a.findViewById(com.p314xaae8f345.mm.R.id.h9c);
        }
        S.f336076h.setVisibility(8);
        em.k1 k1Var = this.f476537q;
        android.view.View view2 = k1Var != null ? k1Var.f336031a : null;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/media/image/ImagePreviewLayer", "showFailedView", "(Ljava/lang/String;Lcom/tencent/mm/plugin/media/image/api/ImageLoadParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/media/image/ImagePreviewLayer", "showFailedView", "(Ljava/lang/String;Lcom/tencent/mm/plugin/media/image/api/ImageLoadParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        em.k1 k1Var2 = this.f476537q;
        if (k1Var2 != null && (a19 = k1Var2.a()) != null) {
            a19.requestLayout();
        }
        em.k1 k1Var3 = this.f476537q;
        android.widget.TextView b19 = k1Var3 != null ? k1Var3.b() : null;
        if (b19 != null) {
            b19.setText(failMsg);
        }
        java.lang.String c17 = gVar != null ? gVar.a(sf3.m.f488939h).c() : null;
        if ((c17 == null || c17.length() == 0) || !com.p314xaae8f345.mm.vfs.w6.j(c17)) {
            S().a().setVisibility(8);
            em.k1 k1Var4 = this.f476537q;
            if (k1Var4 != null && (b17 = k1Var4.b()) != null) {
                int currentTextColor = b17.getCurrentTextColor();
                em.k1 k1Var5 = this.f476537q;
                if (k1Var5 != null && (a17 = k1Var5.a()) != null) {
                    a17.setColorFilter(currentTextColor, android.graphics.PorterDuff.Mode.SRC_IN);
                }
            }
        } else {
            S().a().setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4 c16491xb6370bb4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4) ((jz5.n) this.f476539s).mo141623x754a37bb();
            gVar.getClass();
            c16491xb6370bb4.e(gVar.a(sf3.m.f488939h));
            em.k1 k1Var6 = this.f476537q;
            if (k1Var6 != null && (view = k1Var6.f336031a) != null) {
                view.setBackgroundColor(b3.l.m9702x7444d5ad(K(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77632xb498d0de));
            }
            em.k1 k1Var7 = this.f476537q;
            if (k1Var7 != null && (b18 = k1Var7.b()) != null) {
                b18.setTextColor(b3.l.m9702x7444d5ad(K(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaz));
            }
            em.k1 k1Var8 = this.f476537q;
            if (k1Var8 != null && (a18 = k1Var8.a()) != null) {
                a18.setColorFilter(b3.l.m9702x7444d5ad(K(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaz), android.graphics.PorterDuff.Mode.SRC_IN);
            }
        }
        rf3.h hVar = (rf3.h) g(rf3.h.class);
        if (hVar != null) {
            hVar.b();
        }
    }

    public final void Y(java.lang.String path) {
        cg3.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (this.f407644n && (aVar = (cg3.a) H(cg3.a.class)) != null) {
            aVar.o4(path);
        }
    }

    public final void Z(boolean z17) {
        float height;
        mg3.l lVar;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a b17 = S().b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getNormalImage(...)");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a b18 = S().b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "getNormalImage(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100 c16501x5a606100 = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100) ((jz5.n) this.f476538r).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c16501x5a606100, "<get-gestureContainer>(...)");
        em.l1 S = S();
        if (S.f336074f == null) {
            S.f336074f = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1857x32b0ec.C16493x22c368e7) S.f336069a.findViewById(com.p314xaae8f345.mm.R.id.ubo);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1857x32b0ec.C16493x22c368e7 c16493x22c368e7 = S.f336074f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c16493x22c368e7, "getLiveSwitchableContainer(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4 d17 = S().d();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = d17.f230095d;
        if (c21524xecd57b9a != null) {
            c21524xecd57b9a.i();
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = d17.sampleImageView;
        if (c21537x5f41189f != null) {
            c21537x5f41189f.i();
        }
        lf3.k kVar = this.f476541u;
        int mo79182x97cbed21 = kVar != null ? kVar.f399855a : b18.mo79182x97cbed21();
        lf3.k kVar2 = this.f476541u;
        int mo79180x47e2bd2c = kVar2 != null ? kVar2.f399856b : b18.mo79180x47e2bd2c();
        java.lang.Boolean valueOf = (java.lang.Float.isNaN(b17.f279187q) || java.lang.Float.isInfinite(b17.f279187q)) ? null : java.lang.Boolean.valueOf(b17.G);
        boolean booleanValue = valueOf == null ? false : valueOf.booleanValue();
        float f17 = 1.0f;
        if (mo79182x97cbed21 <= 0 || mo79180x47e2bd2c <= 0) {
            c16501x5a606100.m66626x9204e394(booleanValue);
            c16501x5a606100.O(c16493x22c368e7, 1.0f, 1.0f, false);
            Q("resetGesture default, isLongVerticalImage=" + booleanValue, new java.lang.Object[0]);
            return;
        }
        float f18 = mo79180x47e2bd2c / mo79182x97cbed21;
        float f19 = (com.p314xaae8f345.mm.ui.bh.a(K()).f278669b <= 0 || com.p314xaae8f345.mm.ui.bh.a(K()).f278668a <= 0 || ((float) com.p314xaae8f345.mm.ui.bh.a(K()).f278669b) / ((float) com.p314xaae8f345.mm.ui.bh.a(K()).f278668a) >= 1.5f) ? 2.2f : 2.5f;
        boolean z18 = f18 > f19 || booleanValue;
        Q("resetGesture2 removeListener containerWH: " + c16493x22c368e7.getWidth() + '-' + c16493x22c368e7.getHeight() + ", contentWH: " + mo79182x97cbed21 + '-' + mo79180x47e2bd2c + ", isScreenVertical: " + z17 + " imageRatio:" + f18 + " longRatio:" + f19 + " finalLongVertical: " + z18, new java.lang.Object[0]);
        if (z17 || z18) {
            height = c16493x22c368e7.getHeight() / (c16493x22c368e7.getWidth() * f18);
        } else {
            f17 = c16493x22c368e7.getWidth() / (c16493x22c368e7.getHeight() / f18);
            height = 1.0f;
        }
        S().c().invalidate();
        c16501x5a606100.m66626x9204e394(z18);
        yz5.l lVar2 = this.f476542v;
        if (lVar2 != null && (lVar = (mg3.l) lVar2.mo146xb9724478(this.f476541u)) != null) {
            c16501x5a606100.m66628x23c5936a(lVar);
        }
        c16501x5a606100.O(c16493x22c368e7, f17, height, true);
    }

    public void a0() {
        mf3.k kVar;
        cg3.b bVar;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a b17 = S().b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getNormalImage(...)");
        mf3.s sVar = this.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null || (bVar = (cg3.b) H(cg3.b.class)) == null) {
            return;
        }
        android.graphics.Bitmap b18 = ug5.x.b(b17);
        cg3.g gVar = (cg3.g) bVar;
        cg3.a aVar = (cg3.a) gVar.U6(cg3.a.class);
        if (aVar != null) {
            aVar.u0(kVar, b18, gVar);
        }
    }

    @Override // sf3.l
    public void f(sf3.k state, sf3.g param, mf3.w level) {
        mf3.k kVar;
        mf3.k kVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        mf3.s sVar = this.f407643m;
        java.lang.String str = null;
        java.lang.String mo2110x5db1b11 = (sVar == null || (kVar2 = sVar.f407650a) == null) ? null : kVar2.mo2110x5db1b11();
        java.lang.String str2 = param.f488921b;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, mo2110x5db1b11)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStateChanged apply abort. callback id: ");
            sb6.append(str2);
            sb6.append(", bind id: ");
            mf3.s sVar2 = this.f407643m;
            if (sVar2 != null && (kVar = sVar2.f407650a) != null) {
                str = kVar.mo2110x5db1b11();
            }
            sb6.append(str);
            P(sb6.toString(), new java.lang.Object[0]);
            return;
        }
        Q("onImageStateChanged: id:" + str2 + " path:" + param.c() + ", state: " + state.name(), new java.lang.Object[0]);
        int ordinal = state.ordinal();
        if (ordinal == 1) {
            V(param);
            return;
        }
        if (ordinal == 2) {
            V(param);
            return;
        }
        if (ordinal == 3) {
            U(param);
            Q("onImageParserSuccess, start preScan: " + param.c(), new java.lang.Object[0]);
            Y(param.c());
            return;
        }
        if (ordinal == 4) {
            java.lang.String string = K().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p_u);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            W(string, param);
        } else {
            if (ordinal == 5) {
                U(param);
                return;
            }
            java.lang.String string2 = K().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjg);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            X(this, string2, null, 2, null);
        }
    }

    @Override // mf3.e, kg3.d
    public void h4() {
        Q("onHorizontalUIApply", new java.lang.Object[0]);
        Z(false);
    }

    @Override // mf3.e, mf3.l
    public void i() {
        this.f407644n = false;
        R();
    }

    @Override // mg3.d
    public void k(android.view.MotionEvent e17) {
        mf3.s sVar;
        mf3.k kVar;
        dg3.m mVar;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        em.k1 k1Var = this.f476537q;
        boolean z17 = false;
        if (k1Var != null && (view = k1Var.f336031a) != null && view.getVisibility() == 0) {
            z17 = true;
        }
        if (z17 || (sVar = this.f407643m) == null || (kVar = sVar.f407650a) == null || (mVar = (dg3.m) H(dg3.m.class)) == null) {
            return;
        }
        mVar.y6(kVar, this.f476535o);
    }

    @Override // mf3.l
    public mg3.b l() {
        return S().a();
    }

    @Override // ml5.g
    /* renamed from: onScroll */
    public void mo68312x58dabd8c(float f17, float f18) {
        S().c().A(f17, f18);
    }

    @Override // mf3.e, rf3.v
    public void r(int i17, int i18) {
        Q("onImageParserSuccess, width: " + i17 + " height: " + i18, new java.lang.Object[0]);
        R();
    }

    @Override // mf3.e, mf3.l
    /* renamed from: recycle */
    public void mo129548x408b7293() {
        super.mo129548x408b7293();
        sf3.d dVar = this.f476540t;
        if (dVar != null) {
            dVar.mo162295x408b7293();
        }
    }

    @Override // mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        mf3.k kVar;
        sf3.f fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        super.t(bindContext);
        this.f476541u = null;
        this.f407642i = bindContext.f407651b;
        mf3.s sVar = this.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null || (fVar = (sf3.f) H(sf3.f.class)) == null) {
            return;
        }
        fVar.W4(kVar, this);
    }

    @Override // mf3.e, mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        super.u(parentView);
        if (this.f476537q == null) {
            em.l1 S = S();
            if (S.f336072d == null) {
                S.f336072d = (android.view.ViewStub) S.f336069a.findViewById(com.p314xaae8f345.mm.R.id.h9d);
            }
            this.f476537q = new em.k1(((android.view.ViewStub) S.f336072d.findViewById(com.p314xaae8f345.mm.R.id.h9d)).inflate());
        }
        sf3.e eVar = (sf3.e) H(sf3.e.class);
        this.f476540t = eVar != null ? eVar.mo162294xaf65a0fc() : null;
        em.k1 k1Var = this.f476537q;
        android.view.View view = k1Var != null ? k1Var.f336031a : null;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/media/image/ImagePreviewLayer", "attach", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/media/image/ImagePreviewLayer", "attach", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4 d17 = S().d();
        d17.m66595x41568c47(this.f476540t);
        d17.m66597x6de50754(S().c());
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f sampleImageView = d17.getSampleImageView();
        if (sampleImageView != null) {
            sampleImageView.m79314xbc839517(true);
        }
        d17.d();
        d17.m66596xc6cf6336(this);
        em.l1 S2 = S();
        if (S2.f336074f == null) {
            S2.f336074f = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1857x32b0ec.C16493x22c368e7) S2.f336069a.findViewById(com.p314xaae8f345.mm.R.id.ubo);
        }
        S2.f336074f.m66599xa7687c07(S().d());
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100 a17 = S().a();
        a17.m81946x1a747dba(false);
        a17.m81870x2e3e4924(false);
        a17.m81943x9ee45726(false);
        a17.setBackgroundColor(b3.l.m9702x7444d5ad(a17.getContext(), android.R.color.transparent));
        a17.m66625xa8ac985b(this);
        a17.m81912xdc0d3297(this);
    }

    @Override // ml5.g
    public void y(float f17, float f18, float f19) {
        S().c().z(f17, f18, f19);
    }

    @Override // rf3.v
    public void z(sf3.g param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        java.lang.String string = K().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        X(this, string, null, 2, null);
    }
}
