package dm1;

/* loaded from: classes5.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f323176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f323177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dm1.m f323178f;

    public l(boolean z17, android.view.View view, dm1.m mVar) {
        this.f323176d = z17;
        this.f323177e = view;
        this.f323178f = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f323176d) {
            android.view.View view = this.f323177e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$6$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$6$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f323177e;
        int measuredHeight = view2.getMeasuredHeight();
        dm1.m mVar = this.f323178f;
        mVar.f323183e = measuredHeight;
        android.animation.Animator animator = mVar.f323184f;
        if (animator != null) {
            animator.cancel();
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(-mVar.f323183e, 0);
        android.view.View view3 = mVar.f323181c;
        if (view3 != null) {
            ofInt.addUpdateListener(new dm1.j(view3, mVar));
        }
        ofInt.addListener(new dm1.k(view2, mVar));
        ofInt.setDuration(200L);
        ofInt.start();
        mVar.f323184f = ofInt;
    }
}
