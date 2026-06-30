package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public abstract class cl {

    /* renamed from: a, reason: collision with root package name */
    public static int f287828a;

    public static final n3.g3 a(android.content.Context context) {
        n3.g3 g3Var;
        android.view.View peekDecorView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<this>");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            android.view.Window window = activity.getWindow();
            if (window == null || (peekDecorView = window.peekDecorView()) == null) {
                g3Var = null;
            } else {
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                g3Var = n3.b1.a(peekDecorView);
            }
            if (g3Var != null) {
                return g3Var;
            }
        }
        com.p314xaae8f345.mm.ui.yk.f("MicroMsg.WeUIToolHelper", "getContextInsets, context is not activity", new java.lang.Object[0]);
        return null;
    }

    public static final int b(android.content.Context context) {
        n3.g3 a17;
        e3.d a18;
        return (context == null || (a17 = a(context)) == null || (a18 = a17.a(2)) == null) ? f287828a : a18.f328580d;
    }

    public static final int c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<this>");
        n3.g3 a17 = a(context);
        return (a17 == null || !com.p314xaae8f345.mm.ui.b4.c(context)) ? com.p314xaae8f345.mm.ui.bl.c(context) : android.os.Build.VERSION.SDK_INT >= 30 ? a17.a(android.view.WindowInsets.Type.tappableElement()).f328580d : com.p314xaae8f345.mm.ui.bl.c(context);
    }
}
