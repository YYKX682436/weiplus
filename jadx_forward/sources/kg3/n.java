package kg3;

/* loaded from: classes12.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f389254a;

    /* renamed from: b, reason: collision with root package name */
    public final kg3.d f389255b;

    public n(android.content.Context context, kg3.d dVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f389254a = context;
        this.f389255b = dVar;
    }

    public final boolean a() {
        android.content.Context context = this.f389254a;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            return false;
        }
        return com.p314xaae8f345.mm.ui.bk.N(activity.getTaskId()) || com.p314xaae8f345.mm.ui.bk.P(activity);
    }

    public final boolean b(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.view.Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        return defaultDisplay.getWidth() < defaultDisplay.getHeight();
    }

    public final void c(android.content.res.Configuration newConfig) {
        android.app.Activity activity;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        boolean a17 = a();
        int i17 = newConfig.orientation;
        android.content.Context context = this.f389254a;
        if (i17 == 1 || a17) {
            activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null) {
                return;
            }
            android.view.View decorView = activity.getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(new kg3.k(decorView, activity, this));
            return;
        }
        if (i17 == 2) {
            activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null) {
                return;
            }
            android.view.View decorView2 = activity.getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView2, "getDecorView(...)");
            decorView2.getViewTreeObserver().addOnGlobalLayoutListener(new kg3.j(decorView2, activity, this));
        }
    }
}
