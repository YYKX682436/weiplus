package aa3;

/* loaded from: classes3.dex */
public final class h implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aa3.e f84056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f84057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f84058c;

    public h(aa3.e eVar, android.view.View view, yz5.a aVar) {
        this.f84056a = eVar;
        this.f84057b = view;
        this.f84058c = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        aa3.e eVar = this.f84056a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.f84045b, animation)) {
            android.view.View view = this.f84057b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/lite/keyboard/KeyboardAnimation$hideWithAnimation$1$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/lite/keyboard/KeyboardAnimation$hideWithAnimation$1$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            eVar.f84044a = false;
            eVar.f84047d = false;
            eVar.f84045b = null;
            yz5.a aVar = this.f84058c;
            if (aVar != null) {
                aVar.mo152xb9724478();
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
