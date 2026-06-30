package a24;

/* loaded from: classes3.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a24.g f877e;

    public e(in5.s0 s0Var, a24.g gVar) {
        this.f876d = s0Var;
        this.f877e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f876d;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.itemView.findViewById(com.tencent.mm.R.id.cgi);
        android.content.Context context = s0Var.f293121e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            kotlin.jvm.internal.o.d(viewGroup);
            this.f877e.getClass();
            int d17 = i65.a.d(activity, com.tencent.mm.R.color.ahd);
            android.view.View view = new android.view.View(activity);
            view.setBackgroundColor(d17);
            android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(view, -1, viewGroup.getHeight(), false);
            popupWindow.setOutsideTouchable(false);
            popupWindow.setFocusable(false);
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int i17 = iArr[1];
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setAnimationListener(new a24.d(popupWindow));
            android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation2.setDuration(300L);
            alphaAnimation2.setFillAfter(true);
            alphaAnimation2.setAnimationListener(new a24.c(view, alphaAnimation));
            popupWindow.showAtLocation(activity.getWindow().getDecorView(), 0, 0, i17);
            view.startAnimation(alphaAnimation2);
        }
    }
}
