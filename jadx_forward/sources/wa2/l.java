package wa2;

/* loaded from: classes.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f525667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f525668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f525669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f525670g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f525671h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.view.View view, android.widget.ImageView imageView, yz5.a aVar, android.app.Activity activity, android.content.Intent intent) {
        super(1);
        this.f525667d = view;
        this.f525668e = imageView;
        this.f525669f = aVar;
        this.f525670g = activity;
        this.f525671h = intent;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.animation.Animator it = (android.animation.Animator) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.view.View view = this.f525667d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1$6", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1$6", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yz5.a aVar = this.f525669f;
        android.widget.ImageView imageView = this.f525668e;
        imageView.post(new wa2.k(imageView, aVar, this.f525670g, this.f525671h));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ActivityToggleAnimator", "[exitAnimation] end");
        return jz5.f0.f384359a;
    }
}
