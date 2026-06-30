package d92;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final d92.f f309003a = new d92.f();

    public static void a(d92.f fVar, android.content.Context context, android.widget.TextView textView, float f17, float f18, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            fVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            f18 = i65.a.s(context);
        }
        fVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (textView != null && i65.a.q(context) > f18) {
            textView.setTextSize(1, f17 * f18);
        }
    }

    public static /* synthetic */ void j(d92.f fVar, android.view.View view, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = true;
        }
        fVar.i(view, z17, z18);
    }

    public static /* synthetic */ void m(d92.f fVar, android.widget.TextView textView, float f17, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        fVar.l(textView, f17, z17);
    }

    public static void n(d92.f fVar, android.content.Context context, android.view.View view, float f17, int i17, java.lang.Object obj) {
        android.view.ViewGroup.LayoutParams layoutParams;
        if ((i17 & 4) != 0) {
            fVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            f17 = i65.a.s(context);
        }
        fVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        float q17 = i65.a.q(context);
        if (q17 <= f17) {
            f17 = q17;
        }
        int i18 = layoutParams.width;
        if (i18 > 0) {
            layoutParams.width = (int) (i18 * f17);
        }
        int i19 = layoutParams.height;
        if (i19 > 0) {
            layoutParams.height = (int) (i19 * f17);
        }
    }

    public static void o(d92.f fVar, android.view.View view, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = true;
        }
        if ((i17 & 4) != 0) {
            z19 = false;
        }
        fVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        d92.e eVar = new d92.e(view, z19, z17);
        if (z18) {
            view.post(new d92.d(eVar));
        } else {
            eVar.mo152xb9724478();
        }
    }

    public final int b(java.lang.Number number) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(number, "<this>");
        return i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, number.floatValue()));
    }

    public final java.lang.CharSequence c(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (i17 == 1) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.clx);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        if (i17 != 2) {
            return "";
        }
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.clu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        return string2;
    }

    public final float d(android.content.Context context, float f17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        float f18 = displayMetrics.density;
        float f19 = context.getResources().getDisplayMetrics().density;
        return (!z17 || java.lang.Math.abs(f18 - f19) >= 0.1f) ? (f17 * f18) / f19 : f17;
    }

    public final float e(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        float q17 = i65.a.q(context);
        float s17 = i65.a.s(context);
        return q17 > s17 ? s17 : q17;
    }

    public final java.lang.CharSequence f(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (i17 != 2) {
            if (i17 != 4) {
                if (i17 == 9) {
                    java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eld);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    return string;
                }
                if (i17 != 3001) {
                    if (i17 != 3002) {
                        return "";
                    }
                }
            }
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ele);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            return string2;
        }
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.elb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
        return string3;
    }

    public final float g(android.content.Context context, float f17) {
        return ((f17 * 1.0f) * j65.f.g()) / 400;
    }

    public final void h(android.widget.TextView textView, java.lang.Number dpSize) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dpSize, "dpSize");
        textView.setTextSize(1, g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, dpSize.floatValue()));
    }

    public final void i(android.view.View view, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        d92.c cVar = new d92.c(view, z17);
        if (z18) {
            view.post(new d92.b(cVar));
        } else {
            cVar.mo152xb9724478();
        }
    }

    public final void k(android.view.View view, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (f17 > 0.0f) {
            layoutParams.width = i65.a.a(view.getContext(), g(view.getContext(), f17));
        }
        if (layoutParams.height > 0) {
            layoutParams.height = i65.a.b(view.getContext(), (int) g(view.getContext(), f18));
        }
    }

    public final void l(android.widget.TextView textView, float f17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        textView.setTextSize(1, d(context, f17, z17));
    }

    public final void p(android.view.ViewGroup viewGroup, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<this>");
        i(viewGroup, z17, z18);
        n3.t1 t1Var = new n3.t1(viewGroup);
        while (t1Var.hasNext()) {
            android.view.View view = (android.view.View) t1Var.next();
            jz5.f0 f0Var = null;
            android.view.ViewGroup viewGroup2 = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
            d92.f fVar = f309003a;
            if (viewGroup2 != null) {
                fVar.p(viewGroup2, z17, z18);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                fVar.i(view, z17, z18);
            }
        }
    }
}
