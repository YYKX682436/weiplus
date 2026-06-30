package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes5.dex */
public final class t3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public float f92312d;

    /* renamed from: e, reason: collision with root package name */
    public float f92313e;

    /* renamed from: f, reason: collision with root package name */
    public float f92314f;

    /* renamed from: g, reason: collision with root package name */
    public float f92315g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.wxassistant.w3 f92316h;

    public t3(com.tencent.mm.plugin.appbrand.wxassistant.w3 w3Var) {
        this.f92316h = w3Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindow$setEventsListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(event, "event");
        int action = event.getAction();
        com.tencent.mm.plugin.appbrand.wxassistant.w3 w3Var = this.f92316h;
        if (action != 0) {
            if (action == 1) {
                com.tencent.mm.plugin.appbrand.wxassistant.w3.a(w3Var);
            } else if (action == 2) {
                float rawX = event.getRawX();
                float rawY = event.getRawY();
                float f17 = this.f92312d;
                float f18 = this.f92313e;
                w3Var.getClass();
                double d17 = 2;
                w3Var.f92336m = java.lang.Math.abs((float) java.lang.Math.sqrt((double) (((float) java.lang.Math.pow((double) (rawX - f17), d17)) + ((float) java.lang.Math.pow((double) (rawY - f18), d17))))) > ((float) android.view.ViewConfiguration.get(com.tencent.mm.sdk.platformtools.x2.f193071a).getScaledTouchSlop());
                w3Var.f92334h.y += (int) (event.getRawY() - this.f92315g);
                w3Var.f92334h.x += (int) (event.getRawX() - this.f92314f);
                this.f92314f = event.getRawX();
                this.f92315g = event.getRawY();
                w3Var.f92335i.updateViewLayout(w3Var, w3Var.f92334h);
            }
        } else {
            w3Var.f92336m = false;
            this.f92312d = event.getRawX();
            this.f92313e = event.getRawY();
            this.f92314f = event.getRawX();
            this.f92315g = event.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindow$setEventsListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
