package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class r extends android.widget.RelativeLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f264136n = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f264137d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1 f264138e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f264139f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.GestureDetector f264140g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f264141h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f264142i;

    /* renamed from: m, reason: collision with root package name */
    public int f264143m;

    public r(android.content.Context context) {
        super(context);
        this.f264139f = true;
        this.f264142i = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.o(this);
        this.f264140g = new android.view.GestureDetector(getContext(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.q(this), null);
    }

    public final void a() {
        int mo120162x95a6d12e = this.f264137d.mo120162x95a6d12e();
        if (mo120162x95a6d12e < 300) {
            this.f264138e.g();
        } else if (mo120162x95a6d12e > 450) {
            this.f264138e.setAlpha(1.0f);
        } else {
            this.f264138e.setAlpha((mo120162x95a6d12e + org.p3343x72743996.net.InterfaceC29524x4f65168b.f74012x19a9deed) / 150.0f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImmersivePageView", "setActionBarAlpha, scrollY : %d", java.lang.Integer.valueOf(mo120162x95a6d12e));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        this.f264141h = false;
        if (this.f264139f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        android.view.GestureDetector gestureDetector = this.f264140g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/webview/luggage/ImmersivePageView", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/webview/luggage/ImmersivePageView", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        int action = motionEvent.getAction();
        if (action == 2 || action == 1) {
            a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: setActionBar */
    public void m74236x679283bb(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1 y1Var) {
        this.f264138e = y1Var;
    }

    /* renamed from: setDisable */
    public void m74237x14dcac26(boolean z17) {
        this.f264139f = z17;
    }

    /* renamed from: setWebView */
    public void m74238xfa2b3957(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        this.f264137d = c27816xac2547f9;
    }
}
