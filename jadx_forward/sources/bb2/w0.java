package bb2;

/* loaded from: classes5.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.s0 f100563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb2.z0 f100564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bb2.o f100565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bb2.q0 f100566g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bb2.r0 f100567h;

    public w0(bb2.s0 s0Var, bb2.z0 z0Var, bb2.o oVar, bb2.q0 q0Var, bb2.r0 r0Var) {
        this.f100563d = s0Var;
        this.f100564e = z0Var;
        this.f100565f = oVar;
        this.f100566g = q0Var;
        this.f100567h = r0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender$onBindViewHolder$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        hc2.f1.d(view);
        this.f100563d.f100521a = true;
        bb2.z0 z0Var = this.f100564e;
        yz5.q qVar = z0Var.f100626b;
        if (qVar != null) {
            bb2.o oVar = this.f100565f;
            java.lang.String m75945x2fec8307 = oVar.f100459a.m75945x2fec8307(2);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            qVar.mo147xb9724478(m75945x2fec8307, 6, java.lang.Long.valueOf(oVar.f100459a.m75942xfb822ef2(0)));
        }
        bb2.q0 q0Var = this.f100566g;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(q0Var.f100487g, "alpha", 1.0f, 0.0f);
        ofFloat.addListener(new bb2.v0(q0Var));
        ofFloat.setDuration(300L);
        ofFloat.start();
        android.animation.ObjectAnimator objectAnimator = q0Var.f100491k;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        q0Var.f100491k = ofFloat;
        android.animation.ValueAnimator valueAnimator = q0Var.f100489i;
        if (!(valueAnimator != null && valueAnimator.isRunning())) {
            z0Var.t(this.f100567h, q0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender$onBindViewHolder$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
