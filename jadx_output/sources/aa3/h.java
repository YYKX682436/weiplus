package aa3;

/* loaded from: classes3.dex */
public final class h implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aa3.e f2523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f2524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f2525c;

    public h(aa3.e eVar, android.view.View view, yz5.a aVar) {
        this.f2523a = eVar;
        this.f2524b = view;
        this.f2525c = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        aa3.e eVar = this.f2523a;
        if (kotlin.jvm.internal.o.b(eVar.f2512b, animation)) {
            android.view.View view = this.f2524b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/lite/keyboard/KeyboardAnimation$hideWithAnimation$1$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/lite/keyboard/KeyboardAnimation$hideWithAnimation$1$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            eVar.f2511a = false;
            eVar.f2514d = false;
            eVar.f2512b = null;
            yz5.a aVar = this.f2525c;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
