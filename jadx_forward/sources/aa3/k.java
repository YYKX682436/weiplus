package aa3;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f84073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aa3.e f84074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f84075f;

    public k(android.view.View view, aa3.e eVar, yz5.a aVar) {
        this.f84073d = view;
        this.f84074e = eVar;
        this.f84075f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f84073d;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(view.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0);
        loadAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator());
        loadAnimation.setDuration(200L);
        yz5.a aVar = this.f84075f;
        aa3.e eVar = this.f84074e;
        loadAnimation.setAnimationListener(new aa3.j(eVar, aVar));
        android.view.View view2 = this.f84073d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/lite/keyboard/KeyboardAnimation$showWithAnimation$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/lite/keyboard/KeyboardAnimation$showWithAnimation$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        eVar.f84045b = loadAnimation;
        view.startAnimation(loadAnimation);
    }
}
