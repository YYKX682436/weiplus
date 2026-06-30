package fg3;

/* loaded from: classes12.dex */
public class v extends mf3.e implements fg3.p, mg3.d, sf3.l, gg3.f, ig3.d {

    /* renamed from: o, reason: collision with root package name */
    public final mf3.p f343988o;

    /* renamed from: p, reason: collision with root package name */
    public em.r1 f343989p;

    /* renamed from: q, reason: collision with root package name */
    public ig3.a f343990q;

    /* renamed from: r, reason: collision with root package name */
    public gg3.b f343991r;

    /* renamed from: s, reason: collision with root package name */
    public sf3.f f343992s;

    /* renamed from: t, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f343993t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f343994u;

    /* renamed from: v, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f343995v;

    /* renamed from: w, reason: collision with root package name */
    public gg3.c f343996w;

    /* renamed from: x, reason: collision with root package name */
    public float f343997x;

    /* renamed from: y, reason: collision with root package name */
    public float f343998y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.VideoPreviewLayer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        this.f343988o = apiCenter;
        this.f343995v = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f343997x = -1.0f;
        this.f343998y = -1.0f;
    }

    public static void T(fg3.v vVar, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyErrorUI");
        }
        if ((i17 & 1) != 0) {
            str = null;
        }
        vVar.Q("applyErrorUI", new java.lang.Object[0]);
        vVar.V().c().setVisibility(0);
        android.widget.TextView d17 = vVar.V().d();
        if (str == null) {
            str = vVar.K().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pjg);
        }
        d17.setText(str);
        vVar.V().b().setVisibility(8);
        if (vVar.V().e().getDrawable() != null) {
            vVar.V().a().setVisibility(0);
            vVar.V().e().setVisibility(0);
            vVar.V().c().setBackgroundColor(b3.l.m9702x7444d5ad(vVar.K(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77632xb498d0de));
            vVar.V().d().setTextColor(b3.l.m9702x7444d5ad(vVar.K(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaz));
            em.r1 V = vVar.V();
            if (V.f336284d == null) {
                V.f336284d = (android.widget.ImageView) V.f336281a.findViewById(com.p314xaae8f345.mm.R.id.oyx);
            }
            V.f336284d.setColorFilter(b3.l.m9702x7444d5ad(vVar.K(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaz), android.graphics.PorterDuff.Mode.SRC_IN);
        } else {
            vVar.V().e().setVisibility(8);
            vVar.V().a().setVisibility(8);
            int currentTextColor = vVar.V().d().getCurrentTextColor();
            em.r1 V2 = vVar.V();
            if (V2.f336284d == null) {
                V2.f336284d = (android.widget.ImageView) V2.f336281a.findViewById(com.p314xaae8f345.mm.R.id.oyx);
            }
            V2.f336284d.setColorFilter(currentTextColor, android.graphics.PorterDuff.Mode.SRC_IN);
        }
        fg3.h hVar = (fg3.h) vVar.G().a(fg3.h.class);
        if (hVar != null) {
            hVar.mo129545x6761d4f();
        }
        fg3.h hVar2 = (fg3.h) vVar.G().a(fg3.h.class);
        if (hVar2 != null) {
            hVar2.s(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100 a17 = V().a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getPreviewGestureContainer(...)");
        em.r1 V = V();
        if (V.f336282b == null) {
            V.f336282b = (android.widget.RelativeLayout) V.f336281a.findViewById(com.p314xaae8f345.mm.R.id.jdk);
        }
        android.widget.RelativeLayout relativeLayout = V.f336282b;
        if (!(relativeLayout instanceof android.view.View)) {
            relativeLayout = null;
        }
        if (relativeLayout == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = ((ig3.i) U()).f372962b;
        if (!(c18697xb57c3465 instanceof android.view.View)) {
            c18697xb57c3465 = null;
        }
        int height = c18697xb57c3465 != null ? c18697xb57c3465.getHeight() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c34652 = ((ig3.i) U()).f372962b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c34653 = c18697xb57c34652 instanceof android.view.View ? c18697xb57c34652 : null;
        int width = c18697xb57c34653 != null ? c18697xb57c34653.getWidth() : 0;
        if (height <= 1) {
            Q("resetGesture default, video height: " + height, new java.lang.Object[0]);
            a17.O(relativeLayout, 1.0f, 1.0f, true);
            if (!this.f407644n || z17) {
                return;
            }
            ig3.a U = U();
            fg3.t tVar = new fg3.t(relativeLayout, this);
            com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c34654 = ((ig3.i) U).f372962b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c18697xb57c34654, "<this>");
            c18697xb57c34654.getViewTreeObserver().addOnGlobalLayoutListener(new ig3.j(c18697xb57c34654, tVar));
            return;
        }
        if (height <= 0 || width <= 0) {
            Q("resetGesture return, content w-h invalid", new java.lang.Object[0]);
            return;
        }
        Q("resetGesture containerWH: " + relativeLayout.getWidth() + '-' + relativeLayout.getHeight() + ", contentWH: " + width + '-' + height, new java.lang.Object[0]);
        float width2 = ((float) relativeLayout.getWidth()) / ((float) width);
        float height2 = ((float) relativeLayout.getHeight()) / ((float) height);
        if (width2 == this.f343997x) {
            if (height2 == this.f343998y) {
                return;
            }
        }
        this.f343997x = width2;
        this.f343998y = height2;
        a17.O(relativeLayout, width2, height2, true);
    }

    public static /* synthetic */ void Z(fg3.v vVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetGesture");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        vVar.Y(z17);
    }

    private final void a0() {
        Q("resetUI", new java.lang.Object[0]);
        V().c().setVisibility(8);
        V().b().setVisibility(8);
        V().b().m81381x3ae760af(0);
        V().e().setVisibility(0);
        fg3.h hVar = (fg3.h) G().a(fg3.h.class);
        if (hVar != null) {
            hVar.mo129545x6761d4f();
        }
    }

    @Override // mg3.d
    public void B(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        if (V().c().getVisibility() == 0) {
            return;
        }
        fg3.h hVar = (fg3.h) g(fg3.h.class);
        if (hVar != null) {
            hVar.c();
        }
        fg3.a aVar = (fg3.a) g(fg3.a.class);
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // ig3.d
    public void C(android.view.View view, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        Z(this, false, 1, null);
    }

    @Override // gg3.f
    public void E(gg3.c param, gg3.d state, gg3.e extraInfo) {
        mf3.k kVar;
        mf3.k kVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraInfo, "extraInfo");
        mf3.s sVar = this.f407643m;
        java.lang.String str = null;
        java.lang.String mo2110x5db1b11 = (sVar == null || (kVar2 = sVar.f407650a) == null) ? null : kVar2.mo2110x5db1b11();
        java.lang.String str2 = param.f353259a;
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
        P("onVideoStateChanged apply: " + state.name(), new java.lang.Object[0]);
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onVideoDownloading, progress:");
            float f17 = extraInfo.f353271c;
            sb7.append(f17);
            Q(sb7.toString(), new java.lang.Object[0]);
            V().f().setVisibility(8);
            V().b().setVisibility(0);
            V().b().m81381x3ae760af((int) (f17 * 100));
            return;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            T(this, null, 1, null);
            fg3.a aVar = (fg3.a) g(fg3.a.class);
            if (aVar != null) {
                aVar.b();
                return;
            }
            return;
        }
        a0();
        Q("onVideoLoadSuccess", new java.lang.Object[0]);
        this.f343996w = param;
        mf3.s sVar3 = this.f407643m;
        if (sVar3 != null && sVar3.f407652c) {
            ((ig3.i) U()).e(param);
            ((ig3.i) U()).g();
            mf3.s sVar4 = this.f407643m;
            if (sVar4 == null) {
                return;
            }
            sVar4.f407652c = false;
        }
    }

    @Override // mf3.e, mf3.l
    public void F() {
        mf3.k kVar;
        this.f407644n = true;
        ((ig3.i) U()).f372962b.mo69431xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN);
        mf3.s sVar = this.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null) {
            return;
        }
        gg3.b bVar = this.f343991r;
        if (bVar != null) {
            bVar.a5(kVar, this);
        }
        Z(this, false, 1, null);
    }

    @Override // mf3.e, mf3.n
    public mf3.p G() {
        return this.f343988o;
    }

    @Override // mf3.e, kg3.d
    public void H2() {
        Q("onVerticalUIApply", new java.lang.Object[0]);
        this.f343997x = -1.0f;
        this.f343998y = -1.0f;
        Z(this, false, 1, null);
    }

    @Override // ig3.d
    public void I(ig3.c state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        P("change video ui, onStateChanged: " + state.name(), new java.lang.Object[0]);
        int ordinal = state.ordinal();
        if (ordinal == 1) {
            Q("applyPlayingUI", new java.lang.Object[0]);
            V().c().setVisibility(8);
            V().b().setVisibility(8);
            V().f().setVisibility(0);
            fg3.h hVar = (fg3.h) G().a(fg3.h.class);
            if (hVar != null) {
                hVar.e(true);
            }
            android.content.Context context = M().getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null) {
                Q("keep screen on", new java.lang.Object[0]);
                activity.getWindow().addFlags(128);
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f343993t;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f343993t = p3325xe03a0797.p3326xc267989b.l.d(this.f343995v, null, null, new fg3.u(this, null), 3, null);
            return;
        }
        if (ordinal == 2) {
            Q("applyRenderUI", new java.lang.Object[0]);
            V().e().setVisibility(8);
            V().f().setVisibility(0);
            return;
        }
        if (ordinal != 3) {
            if (ordinal == 5) {
                Q("applyStopUI", new java.lang.Object[0]);
                a0();
                return;
            } else {
                if (ordinal != 6) {
                    return;
                }
                T(this, null, 1, null);
                return;
            }
        }
        Q("applyPauseUI", new java.lang.Object[0]);
        fg3.h hVar2 = (fg3.h) G().a(fg3.h.class);
        if (hVar2 != null) {
            hVar2.e(false);
        }
        android.content.Context context2 = M().getContext();
        android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if (activity2 != null) {
            Q("release screen on", new java.lang.Object[0]);
            activity2.getWindow().clearFlags(128);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f343993t;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        this.f343993t = null;
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f343989p = new em.r1(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ejq, (android.view.ViewGroup) null));
        android.view.View view = V().f336281a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "getInflateRootView(...)");
        return view;
    }

    public final ig3.a U() {
        ig3.a aVar = this.f343990q;
        if (aVar != null) {
            return aVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("controller");
        throw null;
    }

    public final em.r1 V() {
        em.r1 r1Var = this.f343989p;
        if (r1Var != null) {
            return r1Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
        throw null;
    }

    public void W(int i17) {
        Q("onSeekEnd: " + i17, new java.lang.Object[0]);
        ig3.i iVar = (ig3.i) U();
        iVar.f372962b.a((double) i17, true);
        iVar.i(ig3.c.f372950e);
    }

    public void X(int i17) {
        O("onSeeking: " + i17, new java.lang.Object[0]);
        if (((ig3.i) U()).b()) {
            ((ig3.i) U()).f();
        }
        ((ig3.i) U()).f372962b.a(i17, false);
    }

    public void b0() {
        boolean b17 = ((ig3.i) U()).b();
        boolean z17 = !b17;
        Q("toggle " + b17 + " -> " + z17, new java.lang.Object[0]);
        if (b17) {
            ((ig3.i) U()).f();
        } else {
            ((ig3.i) U()).e(this.f343996w);
            ((ig3.i) U()).g();
        }
        fg3.h hVar = (fg3.h) G().a(fg3.h.class);
        if (hVar != null) {
            hVar.e(z17);
        }
    }

    @Override // sf3.l
    public void f(sf3.k state, sf3.g param, mf3.w level) {
        mf3.k kVar;
        mf3.k kVar2;
        mf3.k kVar3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        mf3.s sVar = this.f407643m;
        java.lang.String str = null;
        java.lang.String mo2110x5db1b11 = (sVar == null || (kVar3 = sVar.f407650a) == null) ? null : kVar3.mo2110x5db1b11();
        java.lang.String str2 = param.f488921b;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, mo2110x5db1b11)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onImageStateChanged apply abort. callback id: ");
            sb6.append(str2);
            sb6.append(", bind id: ");
            mf3.s sVar2 = this.f407643m;
            if (sVar2 != null && (kVar2 = sVar2.f407650a) != null) {
                str = kVar2.mo2110x5db1b11();
            }
            sb6.append(str);
            P(sb6.toString(), new java.lang.Object[0]);
            return;
        }
        mf3.s sVar3 = this.f407643m;
        if (sVar3 != null && (kVar = sVar3.f407650a) != null) {
            str = kVar.mo2110x5db1b11();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onImageStateChanged: id:");
        sb7.append(str);
        sb7.append(" path:");
        sb7.append(param.c());
        sb7.append(", state: ");
        sb7.append(state.name());
        sb7.append(" videoState: ");
        sb7.append(((ig3.i) U()).f372962b.mo69311xc00617a4() ? ig3.c.f372950e : ig3.c.f372949d);
        sb7.append(" videoProgress: ");
        sb7.append(((ig3.i) U()).a());
        Q(sb7.toString(), new java.lang.Object[0]);
        if (fg3.r.f343981a[state.ordinal()] == 1) {
            java.lang.String c17 = param.c();
            android.graphics.Bitmap b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.b(c17, 4194304);
            if (((ig3.i) U()).b() || ((java.lang.Number) ((ig3.i) U()).a().f384366d).intValue() != 0) {
                V().e().setImageBitmap(b17);
                V().e().setVisibility(8);
                Q("set thumb, but hide, because video is playing", new java.lang.Object[0]);
            } else {
                if (b17 == null) {
                    P("set thumb failed, get bitmap null, file: " + c17, new java.lang.Object[0]);
                    return;
                }
                Q("set thumb success, file: " + c17 + ", w: " + b17.getWidth() + ", h: " + b17.getHeight(), new java.lang.Object[0]);
                V().e().setImageBitmap(b17);
                V().e().setVisibility(0);
            }
        }
    }

    @Override // mf3.e, kg3.d
    public void h4() {
        Q("onHorizontalUIApply", new java.lang.Object[0]);
        this.f343997x = -1.0f;
        this.f343998y = -1.0f;
        Z(this, false, 1, null);
    }

    @Override // mf3.e, mf3.l
    public void i() {
        this.f407644n = false;
        U();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((ig3.i) U()).h();
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = ((ig3.i) U()).f372962b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c18697xb57c3465, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
        c18697xb57c3465.mo69432x8983b21d(1.0f);
        c18697xb57c3465.getF();
        Q("onUnSelected cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis), new java.lang.Object[0]);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f343993t;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f343993t = null;
        Z(this, false, 1, null);
    }

    @Override // mg3.d
    public void k(android.view.MotionEvent e17) {
        mf3.s sVar;
        mf3.k kVar;
        dg3.m mVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        if (V().c().getVisibility() == 0 || (sVar = this.f407643m) == null || (kVar = sVar.f407650a) == null || (mVar = (dg3.m) H(dg3.m.class)) == null) {
            return;
        }
        mVar.y6(kVar, G());
    }

    @Override // mf3.l
    public mg3.b l() {
        return V().a();
    }

    @Override // mf3.l
    /* renamed from: onPause */
    public void mo129547xb01dfb57() {
        if (((ig3.i) U()).b()) {
            this.f343994u = true;
            ((ig3.i) U()).f();
        }
    }

    @Override // mf3.l
    /* renamed from: onResume */
    public void mo124474x57429eec() {
        if (this.f343994u) {
            ((ig3.i) U()).g();
            this.f343994u = false;
        }
    }

    @Override // mf3.l
    public void q(float f17) {
        if (f17 > 0.5f || !((ig3.i) U()).b()) {
            return;
        }
        ((ig3.i) U()).f();
    }

    @Override // mf3.e, mf3.l
    /* renamed from: recycle */
    public void mo129548x408b7293() {
        super.mo129548x408b7293();
        Q("recycle", new java.lang.Object[0]);
        ig3.i iVar = (ig3.i) U();
        iVar.h();
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = iVar.f372962b;
        c18697xb57c3465.mo69312x3f5eee52();
        c18697xb57c3465.mo69326x360a109e(null);
        c18697xb57c3465.mo69320x87223eb7(null);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f343993t;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f343993t = null;
    }

    @Override // mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        super.t(bindContext);
        mf3.k kVar = bindContext.f407650a;
        if (kVar == null) {
            return;
        }
        V().e().setVisibility(8);
        V().c().setVisibility(8);
        V().b().m81381x3ae760af(0);
        sf3.f fVar = this.f343992s;
        if (fVar != null) {
            fVar.W4(kVar, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mf3.e, mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        super.u(parentView);
        Q("attach", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100 a17 = V().a();
        a17.m81946x1a747dba(false);
        a17.m81870x2e3e4924(false);
        a17.m81943x9ee45726(false);
        a17.setBackgroundColor(b3.l.m9702x7444d5ad(a17.getContext(), android.R.color.transparent));
        a17.m66625xa8ac985b(this);
        gg3.a aVar = (gg3.a) H(gg3.a.class);
        if (aVar == null) {
            throw new java.lang.RuntimeException("must register IGalleryVideoFactory");
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 Z5 = aVar.Z5(K());
        ig3.a F6 = aVar.F6(this.f407639f, Z5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(F6, "<set-?>");
        this.f343990q = F6;
        ((ig3.i) U()).f372964d = aVar.r1();
        android.view.View view = Z5 instanceof android.view.View ? (android.view.View) Z5 : null;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        V().f().addView(view, layoutParams);
        this.f343991r = (gg3.b) H(gg3.b.class);
        this.f343992s = (sf3.f) H(sf3.f.class);
        ((ig3.i) U()).f372963c = new fg3.q(new java.lang.ref.WeakReference(this));
    }
}
