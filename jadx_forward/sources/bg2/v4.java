package bg2;

/* loaded from: classes2.dex */
public final class v4 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final bg2.r4 f102108a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f102109b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f102110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.a5 f102111d;

    public v4(bg2.a5 a5Var, bg2.r4 config, boolean z17, yz5.a onOutAnimStart) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onOutAnimStart, "onOutAnimStart");
        this.f102111d = a5Var;
        this.f102108a = config;
        this.f102109b = z17;
        this.f102110c = onOutAnimStart;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        bg2.r4 r4Var = this.f102108a;
        android.view.View view = r4Var.f101990a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertToastController$OutAnimListener", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertToastController$OutAnimListener", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r4Var.f101990a.post(new bg2.u4(this.f102111d));
        yz5.l lVar = r4Var.f101994e;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(this.f102109b));
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        this.f102110c.mo152xb9724478();
    }
}
