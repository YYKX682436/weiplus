package fg3;

/* loaded from: classes12.dex */
public class o extends pf3.d implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w6, fg3.h {

    /* renamed from: s, reason: collision with root package name */
    public final mf3.p f343973s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f343974t;

    /* renamed from: u, reason: collision with root package name */
    public em.s1 f343975u;

    /* renamed from: v, reason: collision with root package name */
    public int f343976v;

    /* renamed from: w, reason: collision with root package name */
    public int f343977w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.Runnable f343978x;

    /* renamed from: y, reason: collision with root package name */
    public final m34.e f343979y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.VideoOperationLayer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        this.f343973s = apiCenter;
        this.f343974t = jz5.h.b(new fg3.l(this));
        this.f343978x = new fg3.n(this);
        this.f343979y = new fg3.m(this);
    }

    @Override // mf3.e, mf3.n
    public mf3.p G() {
        return this.f343973s;
    }

    @Override // mf3.e, kg3.d
    public void H2() {
        new kg3.b().a(M());
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f343975u = new em.s1(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ejr, (android.view.ViewGroup) null));
        android.view.View view = a0().f336305a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w6
    public void a(float f17) {
        f06.d apiKClass = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(fg3.p.class);
        mf3.p pVar = this.f343973s;
        pVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiKClass, "apiKClass");
        fg3.p pVar2 = (fg3.p) pVar.a(xz5.a.b(apiKClass));
        if (pVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = ((ig3.i) ((fg3.v) pVar2).U()).f372962b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c18697xb57c3465, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
            c18697xb57c3465.mo69432x8983b21d(f17);
            float f18 = c18697xb57c3465.getF();
            a0().c().mo75801x41557a06(f18);
            a0().c().y();
            Q("onVideoSpeedChanged " + f18, new java.lang.Object[0]);
        }
    }

    public final em.s1 a0() {
        em.s1 s1Var = this.f343975u;
        if (s1Var != null) {
            return s1Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
        throw null;
    }

    @Override // fg3.h
    public void c() {
        ((kg3.i) ((jz5.n) this.f343974t).mo141623x754a37bb()).b();
    }

    @Override // mf3.l
    public void d(float f17) {
        if (f17 > 0.0f) {
            android.view.View M = M();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(M, arrayList.toArray(), "com/tencent/mm/plugin/media/video/VideoOperationLayer", "onPageVerticalExit", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            M.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(M, "com/tencent/mm/plugin/media/video/VideoOperationLayer", "onPageVerticalExit", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    @Override // fg3.h
    public void e(boolean z17) {
        a0().c().mo61296x11f3be80(z17);
    }

    @Override // mf3.e, kg3.d
    public void h4() {
        new kg3.b().b(M());
    }

    @Override // mf3.e, mf3.l
    public void i() {
        this.f407644n = false;
        a0().c().mo75801x41557a06(1.0f);
        a0().c().y();
        mo129545x6761d4f();
    }

    @Override // mf3.l
    public void q(float f17) {
        android.view.View view = a0().f336305a;
        float max = java.lang.Math.max(1.0f - ((1.0f - f17) * 2), 0.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(max));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/media/video/VideoOperationLayer", "onPageHorizontalScroll", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/media/video/VideoOperationLayer", "onPageHorizontalScroll", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // fg3.h
    /* renamed from: reset */
    public void mo129545x6761d4f() {
        a0().a().setVisibility(8);
        a0().c().mo61296x11f3be80(false);
        a0().c().a(0);
        M().clearAnimation();
        android.view.View M = M();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(M, arrayList.toArray(), "com/tencent/mm/plugin/media/video/VideoOperationLayer", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        M.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(M, "com/tencent/mm/plugin/media/video/VideoOperationLayer", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // fg3.h
    public void s(boolean z17) {
        a0().c().E(z17);
    }

    @Override // mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        super.t(bindContext);
        mo129545x6761d4f();
        gg3.c a17 = bindContext.f407650a.a();
        w(0, (int) (a17 != null ? a17.f353263e : 0L));
    }

    @Override // mf3.e, mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        super.u(parentView);
        new kg3.b().a(M());
        android.widget.FrameLayout b17 = a0().b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getCloseBtn(...)");
        pf3.d.U(this, b17, null, new fg3.i(this), 1, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16494x7edfff8e c17 = a0().c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getSeekBar(...)");
        X(c17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16494x7edfff8e c18 = a0().c();
        c18.setVisibility(0);
        c18.m75807x1db7aeeb(new fg3.j(this));
        c18.C(c18.getLightStyle());
        c18.m75797x45fe8c1c(true);
        a0().c().m75826x325c7617(new fg3.k(this));
        a0().c().mo69283xbdcdae58(this.f343979y);
        a0().c().m75798x905e0b31(this);
    }

    @Override // fg3.h
    public void w(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.VideoOperationLayer", "progress: " + i17 + ' ' + i18);
        this.f343976v = i17 / 1000;
        this.f343977w = a06.d.a(((double) i18) / 1000.0d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16494x7edfff8e c17 = a0().c();
        java.lang.Runnable runnable = this.f343978x;
        c17.removeCallbacks(runnable);
        a0().c().post(runnable);
    }
}
