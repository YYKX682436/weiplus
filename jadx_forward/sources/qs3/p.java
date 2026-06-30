package qs3;

/* loaded from: classes14.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 f447906d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 c16945xe78973e5) {
        this.f447906d = c16945xe78973e5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View currentFocus;
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 c16945xe78973e5 = this.f447906d;
        if (c16945xe78973e5.getContext() instanceof android.app.Activity) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5.B;
            android.content.Context context = c16945xe78973e5.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            java.lang.Object systemService = activity.getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
            if (inputMethodManager == null || (currentFocus = activity.getCurrentFocus()) == null || currentFocus.getWindowToken() == null) {
                return;
            }
            inputMethodManager.toggleSoftInput(0, 2);
        }
    }
}
