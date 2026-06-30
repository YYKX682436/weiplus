package ck3;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f42475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f42476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f42477f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f42478g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.view.View view, android.app.Activity activity, android.widget.ImageView imageView, android.view.View view2) {
        super(1);
        this.f42475d = view;
        this.f42476e = activity;
        this.f42477f = imageView;
        this.f42478g = view2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.animation.Animator it = (android.animation.Animator) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskAnimHelper", "onAnimationEnd");
        android.view.View view = this.f42475d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper$createFadeOutListener$3", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper$createFadeOutListener$3", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f42475d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper$createFadeOutListener$3", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper$createFadeOutListener$3", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        ck3.j.f42490b = false;
        ck3.j.f42489a.b(this.f42476e, this.f42477f, this.f42478g);
        it.removeAllListeners();
        return jz5.f0.f302826a;
    }
}
