package bb2;

/* loaded from: classes5.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.s0 f19030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb2.z0 f19031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bb2.o f19032f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bb2.q0 f19033g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bb2.r0 f19034h;

    public w0(bb2.s0 s0Var, bb2.z0 z0Var, bb2.o oVar, bb2.q0 q0Var, bb2.r0 r0Var) {
        this.f19030d = s0Var;
        this.f19031e = z0Var;
        this.f19032f = oVar;
        this.f19033g = q0Var;
        this.f19034h = r0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender$onBindViewHolder$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.d(view);
        hc2.f1.d(view);
        this.f19030d.f18988a = true;
        bb2.z0 z0Var = this.f19031e;
        yz5.q qVar = z0Var.f19093b;
        if (qVar != null) {
            bb2.o oVar = this.f19032f;
            java.lang.String string = oVar.f18926a.getString(2);
            if (string == null) {
                string = "";
            }
            qVar.invoke(string, 6, java.lang.Long.valueOf(oVar.f18926a.getLong(0)));
        }
        bb2.q0 q0Var = this.f19033g;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(q0Var.f18954g, "alpha", 1.0f, 0.0f);
        ofFloat.addListener(new bb2.v0(q0Var));
        ofFloat.setDuration(300L);
        ofFloat.start();
        android.animation.ObjectAnimator objectAnimator = q0Var.f18958k;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        q0Var.f18958k = ofFloat;
        android.animation.ValueAnimator valueAnimator = q0Var.f18956i;
        if (!(valueAnimator != null && valueAnimator.isRunning())) {
            z0Var.t(this.f19034h, q0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender$onBindViewHolder$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
