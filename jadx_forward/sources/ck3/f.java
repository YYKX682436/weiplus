package ck3;

/* loaded from: classes3.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f124008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f124009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f124010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f124011g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.view.View view, android.app.Activity activity, android.widget.ImageView imageView, android.view.View view2) {
        super(1);
        this.f124008d = view;
        this.f124009e = activity;
        this.f124010f = imageView;
        this.f124011g = view2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.animation.Animator it = (android.animation.Animator) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskAnimHelper", "onAnimationEnd");
        android.view.View view = this.f124008d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper$createFadeOutListener$3", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper$createFadeOutListener$3", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f124008d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper$createFadeOutListener$3", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper$createFadeOutListener$3", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        ck3.j.f124023b = false;
        ck3.j.f124022a.b(this.f124009e, this.f124010f, this.f124011g);
        it.removeAllListeners();
        return jz5.f0.f384359a;
    }
}
