package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes14.dex */
public final class b5 {

    /* renamed from: b, reason: collision with root package name */
    public static int f291831b = 1;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2740x696c9db.b5 f291830a = new com.p314xaae8f345.mm.ui.p2740x696c9db.b5();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f291832c = new java.util.LinkedHashSet();

    public final void a(com.p314xaae8f345.mm.ui.p2740x696c9db.w4 w4Var, android.app.Activity activity, boolean z17) {
        android.view.Window window;
        if (w4Var == null || activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KeyBoardHeightProviderUtil", "register: NPE");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("register: activity:");
        sb6.append(activity);
        sb6.append(" , observer: ");
        sb6.append(w4Var);
        sb6.append(" , hasWindowFocus: ");
        sb6.append(activity.hasWindowFocus());
        sb6.append("  isFinishing:");
        sb6.append(activity.isFinishing());
        sb6.append(" decorView:");
        android.view.Window window2 = activity.getWindow();
        sb6.append(window2 != null ? window2.getDecorView() : null);
        sb6.append(" observer.getActivity:");
        sb6.append(w4Var.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KeyBoardHeightProviderUtil", sb6.toString());
        f291832c.add(w4Var);
        android.app.Activity a17 = w4Var.a();
        if (a17 == null || (window = a17.getWindow()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KeyBoardHeightProviderUtil", "setOnApplyWindowInsetsListener fail");
            return;
        }
        android.view.View decorView = window.getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.post(new com.p314xaae8f345.mm.ui.p2740x696c9db.z4(window, activity));
    }

    public final void b(com.p314xaae8f345.mm.ui.p2740x696c9db.w4 w4Var) {
        android.view.Window window;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = w4Var != null ? w4Var.a() : null;
        objArr[1] = w4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KeyBoardHeightProviderUtil", "unRegister: activity:%s observer:%s ", objArr);
        if (w4Var != null) {
            f291832c.remove(w4Var);
            android.app.Activity a17 = w4Var.a();
            if (a17 == null || (window = a17.getWindow()) == null) {
                return;
            }
            android.view.View decorView = window.getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
            decorView.post(new com.p314xaae8f345.mm.ui.p2740x696c9db.a5(window));
        }
    }
}
