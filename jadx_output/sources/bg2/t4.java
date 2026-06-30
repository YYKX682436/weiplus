package bg2;

/* loaded from: classes2.dex */
public final class t4 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final bg2.r4 f20521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg2.a5 f20522b;

    public t4(bg2.a5 a5Var, bg2.r4 config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f20522b = a5Var;
        this.f20521a = config;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        bg2.a5 a5Var = this.f20522b;
        a5Var.d7();
        kotlinx.coroutines.y0 y0Var = a5Var.f417141d.f417147g;
        kotlinx.coroutines.r2 r2Var = null;
        if (y0Var != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            r2Var = kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new bg2.s4(this, a5Var, null), 2, null);
        }
        a5Var.f19921h = r2Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        in5.s0 s0Var;
        bg2.r4 r4Var = this.f20521a;
        bg2.a5 a5Var = this.f20522b;
        a5Var.f19920g = r4Var;
        uc2.g gVar = (uc2.g) a5Var.O6(uc2.g.class);
        android.view.View p17 = (gVar == null || (s0Var = ((sb2.l) gVar).f417141d.f417149i) == null) ? null : s0Var.p(com.tencent.mm.R.id.f484484ee1);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertToastController$InAnimListener", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertToastController$InAnimListener", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        in5.s0 s0Var2 = a5Var.f417141d.f417149i;
        android.view.View p18 = s0Var2 != null ? s0Var2.p(com.tencent.mm.R.id.f484260dk3) : null;
        if (p18 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        android.view.View view = p18;
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertToastController$InAnimListener", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertToastController$InAnimListener", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
