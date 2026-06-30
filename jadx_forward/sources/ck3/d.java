package ck3;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f124001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f124002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f124003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f124004g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.app.Activity activity, android.widget.ImageView imageView, android.widget.TextView textView, android.view.View view) {
        super(1);
        this.f124001d = activity;
        this.f124002e = imageView;
        this.f124003f = textView;
        this.f124004g = view;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.animation.Animator it = (android.animation.Animator) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskAnimHelper", "onAnimationEnd");
        it.removeAllListeners();
        ck3.j jVar = ck3.j.f124022a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskAnimHelper", "animEnd2");
        android.view.View view = this.f124004g;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.hbl);
        android.app.Activity activity = this.f124001d;
        android.widget.ImageView imageView = this.f124002e;
        if (findViewById == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTaskAnimHelper", "text or backBtn is null");
            jVar.b(activity, imageView, view);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper", "startTextFadeOutAnim", "(Landroid/view/View;Landroid/app/Activity;Landroid/widget/ImageView;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper", "startTextFadeOutAnim", "(Landroid/view/View;Landroid/app/Activity;Landroid/widget/ImageView;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewPropertyAnimator duration = findViewById.animate().alpha(0.0f).setDuration(600L);
            ta5.h hVar = ta5.h.f498412a;
            android.view.ViewPropertyAnimator startDelay = duration.setInterpolator(hVar.b()).setStartDelay(3000L);
            ck3.f fVar = new ck3.f(findViewById, activity, imageView, view);
            android.widget.TextView textView = this.f124003f;
            startDelay.setListener(new ck3.a(fVar, new ck3.g(activity, view, textView))).start();
            textView.animate().alpha(1.0f).setInterpolator(hVar.c()).setDuration(600L).setStartDelay(3000L).setListener(new ck3.a(ck3.b.f123997d, new ck3.c(activity, view, textView))).start();
        }
        return jz5.f0.f384359a;
    }
}
