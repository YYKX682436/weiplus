package bg2;

/* loaded from: classes2.dex */
public final class v4 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final bg2.r4 f20575a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20576b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f20577c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.a5 f20578d;

    public v4(bg2.a5 a5Var, bg2.r4 config, boolean z17, yz5.a onOutAnimStart) {
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(onOutAnimStart, "onOutAnimStart");
        this.f20578d = a5Var;
        this.f20575a = config;
        this.f20576b = z17;
        this.f20577c = onOutAnimStart;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        bg2.r4 r4Var = this.f20575a;
        android.view.View view = r4Var.f20457a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertToastController$OutAnimListener", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertToastController$OutAnimListener", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r4Var.f20457a.post(new bg2.u4(this.f20578d));
        yz5.l lVar = r4Var.f20461e;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(this.f20576b));
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        this.f20577c.invoke();
    }
}
