package pf3;

/* loaded from: classes12.dex */
public abstract class g extends pf3.d implements pf3.h {

    /* renamed from: s, reason: collision with root package name */
    public final mf3.p f435359s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f435360t;

    /* renamed from: u, reason: collision with root package name */
    public final pf3.e f435361u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mf3.p apiCenter, java.lang.String logLabel) {
        super(apiCenter, logLabel);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logLabel, "logLabel");
        this.f435359s = apiCenter;
        this.f435360t = jz5.h.b(new pf3.f(this));
        this.f435361u = new pf3.e(this);
    }

    @Override // mf3.e, mf3.l
    public void F() {
        this.f407644n = true;
        Q("onSelected", new java.lang.Object[0]);
        e0();
    }

    @Override // mf3.e, mf3.n
    public mf3.p G() {
        return this.f435359s;
    }

    @Override // mf3.e, kg3.d
    public void H2() {
        new kg3.b().a(M());
    }

    public void a0() {
        android.view.View M = M();
        pf3.e eVar = this.f435361u;
        M.removeCallbacks(eVar);
        eVar.f435367d = false;
        M().postDelayed(eVar, 5000L);
    }

    public void b0() {
        pf3.e eVar = this.f435361u;
        eVar.f435367d = true;
        M().removeCallbacks(eVar);
    }

    @Override // pf3.h
    public void c() {
        if (M().getVisibility() == 0) {
            d0(false);
        } else {
            d0(true);
        }
        ((kg3.i) ((jz5.n) this.f435360t).mo141623x754a37bb()).b();
    }

    public void c0() {
        android.view.View M = M();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(M, arrayList.toArray(), "com/tencent/mm/plugin/media/common/BottomBarOperationLayer", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        M.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(M, "com/tencent/mm/plugin/media/common/BottomBarOperationLayer", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // mf3.l
    public void d(float f17) {
        if (f17 > 0.0f) {
            android.view.View M = M();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(M, arrayList.toArray(), "com/tencent/mm/plugin/media/common/BottomBarOperationLayer", "onPageVerticalExit", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            M.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(M, "com/tencent/mm/plugin/media/common/BottomBarOperationLayer", "onPageVerticalExit", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public void d0(boolean z17) {
    }

    public final void e0() {
        O("resetImpl", new java.lang.Object[0]);
        f0();
        M().clearAnimation();
    }

    public void f0() {
        android.view.View M = M();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(M, arrayList.toArray(), "com/tencent/mm/plugin/media/common/BottomBarOperationLayer", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        M.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(M, "com/tencent/mm/plugin/media/common/BottomBarOperationLayer", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // mf3.e, kg3.d
    public void h4() {
        new kg3.b().b(M());
    }

    @Override // mf3.e, mf3.l
    public void i() {
        this.f407644n = false;
        Q("onUnSelected", new java.lang.Object[0]);
        e0();
    }

    @Override // mf3.l
    public void q(float f17) {
        android.view.View M = M();
        float max = java.lang.Math.max(1.0f - ((1.0f - f17) * 2), 0.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(max));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(M, arrayList.toArray(), "com/tencent/mm/plugin/media/common/BottomBarOperationLayer", "onPageHorizontalScroll", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        M.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(M, "com/tencent/mm/plugin/media/common/BottomBarOperationLayer", "onPageHorizontalScroll", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (f17 == 1.0f) {
            a0();
        } else {
            b0();
        }
    }

    @Override // mf3.e, mf3.l
    /* renamed from: recycle */
    public void mo129548x408b7293() {
        super.mo129548x408b7293();
        b0();
    }

    /* renamed from: reset */
    public void mo129544x6761d4f() {
        e0();
    }

    @Override // mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        super.t(bindContext);
        e0();
    }

    @Override // mf3.e, mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        super.u(parentView);
        new kg3.b().a(M());
    }
}
