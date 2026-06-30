package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public final class a4 {

    /* renamed from: a */
    public static final com.p314xaae8f345.mm.ui.a4 f278650a = new com.p314xaae8f345.mm.ui.a4();

    public static final jz5.o a(android.view.View view) {
        int i17;
        e3.d a17;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.g3 a18 = n3.b1.a(view);
        e3.d a19 = a18 != null ? a18.a(7) : null;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            if (a18 != null && (a17 = a18.a(android.view.WindowInsets.Type.tappableElement())) != null) {
                i17 = a17.f328580d;
            }
            i17 = 0;
        } else {
            if (a19 != null) {
                i17 = a19.f328580d;
            }
            i17 = 0;
        }
        return new jz5.o(java.lang.Integer.valueOf(a19 != null ? a19.f328580d : com.p314xaae8f345.mm.ui.bl.c(view.getContext())), a19, java.lang.Integer.valueOf(i17));
    }

    public static final void b(com.p314xaae8f345.mm.ui.a4 a4Var, int i17, e3.d dVar, android.view.View view, boolean z17, boolean z18) {
        a4Var.getClass();
        if (!z17) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            if (z18) {
                view.setTranslationY(0.0f - i17);
            } else {
                marginLayoutParams.bottomMargin = i17;
            }
            view.setLayoutParams(marginLayoutParams);
        } else if (z18) {
            view.setTranslationY(0.0f - i17);
        } else {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Edge2EdgeHelper", "AvoidNavigationBar " + view.getContext().getClass().getSimpleName() + '-' + view.getClass().getSimpleName() + ", sys: " + dVar + ", navHeight=" + i17 + ' ');
    }

    public static final void c(com.p314xaae8f345.mm.ui.a4 a4Var, android.view.View view, boolean z17) {
        a4Var.getClass();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.g3 a17 = n3.b1.a(view);
        e3.d a18 = a17 != null ? a17.a(7) : null;
        int h17 = a18 != null ? a18.f328578b : com.p314xaae8f345.mm.ui.bl.h(view.getContext());
        if (h17 > 0) {
            if (z17) {
                view.setPadding(view.getPaddingLeft(), h17, view.getPaddingRight(), view.getPaddingBottom());
            } else {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = h17;
                view.setLayoutParams(marginLayoutParams);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Edge2EdgeHelper", "AvoidStatusBar " + view.getContext().getClass().getSimpleName() + '-' + view.getClass().getSimpleName() + ", sys: " + a18 + ", statusHeight=" + h17 + ' ');
    }

    public static final void d(android.view.View view, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        f278650a.m(view, new com.p314xaae8f345.mm.ui.r3(z17, z18), null);
    }

    public static /* synthetic */ void e(android.view.View view, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        d(view, z17, z18);
    }

    public static final void f(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        g(view, false);
    }

    public static final void g(android.view.View view, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        if (com.p314xaae8f345.mm.ui.b4.c(view.getContext())) {
            com.p314xaae8f345.mm.ui.v3 v3Var = new com.p314xaae8f345.mm.ui.v3(z17);
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.a1.u(view, v3Var);
            if (!n3.x0.b(view)) {
                view.addOnAttachStateChangeListener(new com.p314xaae8f345.mm.ui.u3(view, view, z17));
            } else {
                c(f278650a, view, z17);
                n3.y0.c(view);
            }
        }
    }

    public final boolean h(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        jz5.g gVar = com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2527xae0a552.C20129x6763e612.f273746a;
        return (((java.lang.Boolean) ((jz5.n) com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2527xae0a552.C20129x6763e612.f273746a).mo141623x754a37bb()).booleanValue() && android.os.Build.VERSION.SDK_INT >= 34 && k(context)) || (com.p314xaae8f345.mm.ui.b4.c(context) && k(context));
    }

    public final void i(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "<this>");
        android.view.Window window = activity.getWindow();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
        j(window);
    }

    public final void j(android.view.Window window) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "<this>");
        android.content.Context context = window.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (!k(context) && !com.p314xaae8f345.mm.ui.b4.c(window.getContext())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Edge2EdgeHelper", "should not enable immersive NavigationBar");
            return;
        }
        java.lang.String simpleName = window.getClass().getSimpleName();
        android.view.View peekDecorView = window.peekDecorView();
        android.view.ViewGroup viewGroup = peekDecorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) peekDecorView : null;
        if (viewGroup != null) {
            viewGroup.setOnHierarchyChangeListener(new com.p314xaae8f345.mm.ui.w3(simpleName));
        }
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        android.view.View peekDecorView2 = window.peekDecorView();
        if (peekDecorView2 == null) {
            return;
        }
        peekDecorView2.setSystemUiVisibility(systemUiVisibility | 512);
    }

    public final boolean k(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return android.provider.Settings.Secure.getInt(context.getContentResolver(), "navigation_mode", 0) == 2;
    }

    public final void l(android.view.View view, yz5.r callback, p012xc85e97e9.p093xedfae76a.y yVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.ui.y3 y3Var = new com.p314xaae8f345.mm.ui.y3(callback, view);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.a1.u(view, y3Var);
        if (yVar != null) {
            yVar.mo273xed6858b4().a(new com.p314xaae8f345.mm.p819xedfae76a.C10825x73454863(new com.p314xaae8f345.mm.ui.z3(view)));
        }
        if (!n3.x0.b(view)) {
            view.addOnAttachStateChangeListener(new com.p314xaae8f345.mm.ui.x3(view, view, callback));
            return;
        }
        jz5.o a17 = a(view);
        callback.C(view, a17.f384374d, a17.f384375e, a17.f384376f);
        n3.y0.c(view);
    }

    public final void m(android.view.View view, yz5.r callback, p012xc85e97e9.p093xedfae76a.y yVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (com.p314xaae8f345.mm.ui.b4.c(view.getContext())) {
            l(view, callback, yVar);
        }
    }
}
