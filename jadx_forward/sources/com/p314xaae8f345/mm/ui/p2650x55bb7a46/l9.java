package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public final class l9 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f283456d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f283457e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f283458f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Activity f283459g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l f283460h;

    /* renamed from: i, reason: collision with root package name */
    public float f283461i;

    /* renamed from: m, reason: collision with root package name */
    public int f283462m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f283463n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.j9 f283464o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(android.app.Activity context, yz5.l dragEnableBlock) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dragEnableBlock, "dragEnableBlock");
        this.f283456d = dragEnableBlock;
        this.f283459g = context;
        this.f283460h = new p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l(getContext(), this, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.k9(this));
    }

    public final void a(int i17) {
        android.app.Activity activity = this.f283459g;
        if (activity == null) {
            return;
        }
        android.view.View decorView = activity.getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView;
        this.f283457e = viewGroup;
        this.f283458f = viewGroup.getChildAt(0);
        android.view.ViewGroup viewGroup2 = this.f283457e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup2);
        viewGroup2.removeView(this.f283458f);
        addView(this.f283458f);
        android.view.ViewGroup viewGroup3 = this.f283457e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup3);
        viewGroup3.addView(this);
        fq1.e.f347040a.g(this.f283458f, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12), true, false);
        this.f283462m = i17;
        this.f283461i = i17 * 0.3f;
    }

    @Override // android.view.View
    public void computeScroll() {
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f283460h;
        boolean z17 = false;
        if (lVar != null && lVar.h(true)) {
            z17 = true;
        }
        if (z17) {
            invalidate();
        }
    }

    /* renamed from: getDialogActivityPullDownCallback */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.j9 m79762xcdfbcd79() {
        return this.f283464o;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!((java.lang.Boolean) this.f283456d.mo146xb9724478(event)).booleanValue() || (lVar = this.f283460h) == null) {
            return false;
        }
        return lVar.t(event);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f283460h;
        if (lVar == null) {
            return true;
        }
        lVar.m(event);
        return true;
    }

    /* renamed from: setDialogActivityPullDownCallback */
    public final void m79763xb4189d85(com.p314xaae8f345.mm.ui.p2650x55bb7a46.j9 j9Var) {
        this.f283464o = j9Var;
    }
}
