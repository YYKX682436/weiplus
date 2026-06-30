package ck3;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f42468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f42469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f42470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f42471g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.app.Activity activity, android.widget.ImageView imageView, android.widget.TextView textView, android.view.View view) {
        super(1);
        this.f42468d = activity;
        this.f42469e = imageView;
        this.f42470f = textView;
        this.f42471g = view;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.animation.Animator it = (android.animation.Animator) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskAnimHelper", "onAnimationEnd");
        it.removeAllListeners();
        ck3.j jVar = ck3.j.f42489a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskAnimHelper", "animEnd2");
        android.view.View view = this.f42471g;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.hbl);
        android.app.Activity activity = this.f42468d;
        android.widget.ImageView imageView = this.f42469e;
        if (findViewById == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTaskAnimHelper", "text or backBtn is null");
            jVar.b(activity, imageView, view);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper", "startTextFadeOutAnim", "(Landroid/view/View;Landroid/app/Activity;Landroid/widget/ImageView;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper", "startTextFadeOutAnim", "(Landroid/view/View;Landroid/app/Activity;Landroid/widget/ImageView;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewPropertyAnimator duration = findViewById.animate().alpha(0.0f).setDuration(600L);
            ta5.h hVar = ta5.h.f416879a;
            android.view.ViewPropertyAnimator startDelay = duration.setInterpolator(hVar.b()).setStartDelay(3000L);
            ck3.f fVar = new ck3.f(findViewById, activity, imageView, view);
            android.widget.TextView textView = this.f42470f;
            startDelay.setListener(new ck3.a(fVar, new ck3.g(activity, view, textView))).start();
            textView.animate().alpha(1.0f).setInterpolator(hVar.c()).setDuration(600L).setStartDelay(3000L).setListener(new ck3.a(ck3.b.f42464d, new ck3.c(activity, view, textView))).start();
        }
        return jz5.f0.f302826a;
    }
}
