package wa2;

/* loaded from: classes2.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f525639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f525640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f525641f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f525642g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f525643h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.view.View view, android.view.View view2, android.content.Intent intent, android.view.View view3, android.app.Activity activity) {
        super(1);
        this.f525639d = view;
        this.f525640e = view2;
        this.f525641f = intent;
        this.f525642g = view3;
        this.f525643h = activity;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.animation.Animator it = (android.animation.Animator) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.view.View view = this.f525639d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$2", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$2", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f525640e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$2", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1$2", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.content.Intent intent = this.f525641f;
        intent.removeExtra("key_intent_animating_flag");
        if (!intent.hasExtra("KEY_INTENT_ENTER_ITEM_ID")) {
            wa2.u uVar = wa2.u.f525714d;
            android.view.View view3 = this.f525642g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view3, "null cannot be cast to non-null type android.view.ViewGroup");
            intent.putExtra("KEY_INTENT_ENTER_ITEM_ID", uVar.Bi((android.view.ViewGroup) view3));
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5151xfdcfc6b3 c5151xfdcfc6b3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5151xfdcfc6b3();
        c5151xfdcfc6b3.f135500g.f88248a = this.f525643h.hashCode();
        c5151xfdcfc6b3.e();
        return jz5.f0.f384359a;
    }
}
