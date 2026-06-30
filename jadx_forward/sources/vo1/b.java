package vo1;

/* loaded from: classes.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f520028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f520029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f520030f;

    public b(android.view.View view, int i17, yz5.a aVar) {
        this.f520028d = view;
        this.f520029e = i17;
        this.f520030f = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f520028d.getLayoutParams().height = this.f520029e;
        android.view.View view = this.f520028d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/AnimUtils$animCollapseGone$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/anim/AnimUtils$animCollapseGone$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yz5.a aVar = this.f520030f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
