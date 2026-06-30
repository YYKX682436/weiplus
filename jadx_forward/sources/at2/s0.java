package at2;

/* loaded from: classes3.dex */
public final class s0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f95277d;

    /* renamed from: e, reason: collision with root package name */
    public int f95278e;

    /* renamed from: f, reason: collision with root package name */
    public int f95279f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f95280g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f95281h;

    /* renamed from: i, reason: collision with root package name */
    public int f95282i;

    /* renamed from: m, reason: collision with root package name */
    public int f95283m;

    public s0(java.lang.ref.WeakReference rDragPlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rDragPlugin, "rDragPlugin");
        this.f95277d = rDragPlugin;
        this.f95281h = jz5.h.b(new at2.r0(this));
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17;
        ys2.o oVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        at2.u0 u0Var = (at2.u0) this.f95277d.get();
        if (u0Var == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (u0Var.f95291q) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        at2.u1 u1Var = (at2.u1) u0Var.X0(at2.u1.class);
        if (u1Var == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        boolean z18 = ((mm2.c1) u0Var.P0(mm2.c1.class)).N1;
        if (motionEvent == null) {
            u0Var.t1(0, 0, false);
            yj0.a.i(false, this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        dt2.a0 a0Var = u1Var.f95295q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = a0Var != null ? a0Var.f324691a : null;
        int S6 = ((ct2.j) u1Var.P0(ct2.j.class)).S6();
        int i17 = S6 <= 600 ? S6 : 600;
        if (c14932xfc4acec9 == null || S6 <= 0) {
            this.f95280g = false;
            this.f95282i = 0;
            this.f95283m = 0;
            u0Var.t1(0, 0, false);
            yj0.a.i(false, this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f95278e = (int) motionEvent.getX();
            this.f95279f = (int) motionEvent.getY();
            yj0.a.i(true, this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        jz5.g gVar = this.f95281h;
        android.view.ViewGroup viewGroup = u0Var.f446856d;
        if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    z17 = false;
                }
            } else {
                if (motionEvent.getPointerCount() > 1) {
                    u0Var.t1(0, 0, false);
                    yj0.a.i(false, this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
                int x17 = (int) motionEvent.getX();
                int y17 = (int) motionEvent.getY();
                if (this.f95280g || (java.lang.Math.abs((x17 - this.f95278e) / (y17 - this.f95279f)) > 1.0f && java.lang.Math.abs(x17 - this.f95278e) > ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue())) {
                    if (!this.f95280g) {
                        this.f95282i = c14932xfc4acec9.mo56686xe906e26b();
                        c14932xfc4acec9.mo58788x65825f6();
                        at2.y1 y1Var = (at2.y1) u0Var.X0(at2.y1.class);
                        if (y1Var != null) {
                            y1Var.f95314q.m58814x44707bd1(true);
                        }
                        if (!z18 && (oVar = (ys2.o) u0Var.U0(ys2.o.class)) != null) {
                            oVar.e7(true);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReplayScreenDragLazyPlugin", "onFinderLiveTPProxyTouch: start track move, startTime = " + this.f95282i + " videoTotalTime=" + S6 + ",maxDragDuration:" + i17);
                    }
                    this.f95280g = true;
                    viewGroup.requestDisallowInterceptTouchEvent(true);
                    int b17 = this.f95282i + a06.d.b(((x17 - this.f95278e) / c14932xfc4acec9.getWidth()) * i17);
                    this.f95283m = b17 < 0 ? 0 : b17;
                    at2.y1 y1Var2 = (at2.y1) u0Var.X0(at2.y1.class);
                    if (y1Var2 != null) {
                        y1Var2.u1(this.f95283m / S6);
                    }
                    at2.y1 y1Var3 = (at2.y1) u0Var.X0(at2.y1.class);
                    if (y1Var3 != null) {
                        y1Var3.y1(this.f95283m);
                    }
                    u0Var.t1(this.f95283m, S6, z18);
                    yj0.a.i(true, this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
            }
            yj0.a.i(false, this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        z17 = false;
        viewGroup.requestDisallowInterceptTouchEvent(z17);
        at2.y1 y1Var4 = (at2.y1) u0Var.X0(at2.y1.class);
        if (y1Var4 != null) {
            y1Var4.f95314q.m58814x44707bd1(z17);
        }
        ys2.o oVar2 = (ys2.o) u0Var.U0(ys2.o.class);
        if (oVar2 != null) {
            oVar2.c7();
        }
        if (!this.f95280g) {
            if (java.lang.Math.abs(motionEvent.getX() - this.f95278e) < ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() && java.lang.Math.abs(motionEvent.getY() - this.f95279f) < ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReplayScreenDragLazyPlugin", "onFinderLiveTPProxyTouch: performClick");
                c14932xfc4acec9.performClick();
                u0Var.t1(this.f95283m, S6, false);
            }
            yj0.a.i(false, this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReplayScreenDragLazyPlugin", "onFinderLiveTPProxyTouch: seek end, target time = " + this.f95283m);
        this.f95280g = false;
        this.f95282i = 0;
        u0Var.t1(this.f95283m, S6, false);
        u1Var.w1(this.f95283m, true);
        this.f95283m = 0;
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayScreenDragLazyPlugin$ScreenTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
