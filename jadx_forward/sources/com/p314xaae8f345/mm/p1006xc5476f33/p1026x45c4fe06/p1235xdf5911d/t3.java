package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes5.dex */
public final class t3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public float f173845d;

    /* renamed from: e, reason: collision with root package name */
    public float f173846e;

    /* renamed from: f, reason: collision with root package name */
    public float f173847f;

    /* renamed from: g, reason: collision with root package name */
    public float f173848g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w3 f173849h;

    public t3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w3 w3Var) {
        this.f173849h = w3Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindow$setEventsListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int action = event.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w3 w3Var = this.f173849h;
        if (action != 0) {
            if (action == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w3.a(w3Var);
            } else if (action == 2) {
                float rawX = event.getRawX();
                float rawY = event.getRawY();
                float f17 = this.f173845d;
                float f18 = this.f173846e;
                w3Var.getClass();
                double d17 = 2;
                w3Var.f173869m = java.lang.Math.abs((float) java.lang.Math.sqrt((double) (((float) java.lang.Math.pow((double) (rawX - f17), d17)) + ((float) java.lang.Math.pow((double) (rawY - f18), d17))))) > ((float) android.view.ViewConfiguration.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getScaledTouchSlop());
                w3Var.f173867h.y += (int) (event.getRawY() - this.f173848g);
                w3Var.f173867h.x += (int) (event.getRawX() - this.f173847f);
                this.f173847f = event.getRawX();
                this.f173848g = event.getRawY();
                w3Var.f173868i.updateViewLayout(w3Var, w3Var.f173867h);
            }
        } else {
            w3Var.f173869m = false;
            this.f173845d = event.getRawX();
            this.f173846e = event.getRawY();
            this.f173847f = event.getRawX();
            this.f173848g = event.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindow$setEventsListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
