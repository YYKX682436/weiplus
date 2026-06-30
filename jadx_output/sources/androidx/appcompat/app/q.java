package androidx.appcompat.app;

/* loaded from: classes14.dex */
public class q implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.g0 f9203a;

    public q(androidx.appcompat.app.g0 g0Var) {
        this.f9203a = g0Var;
    }

    @Override // n3.k0
    public n3.g3 a(android.view.View view, n3.g3 g3Var) {
        int i17;
        boolean z17;
        android.view.View view2;
        n3.g3 g3Var2;
        boolean z18;
        int e17 = g3Var.e();
        androidx.appcompat.app.g0 g0Var = this.f9203a;
        androidx.appcompat.widget.ActionBarContextView actionBarContextView = g0Var.f9121s;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            i17 = e17;
            z17 = false;
        } else {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) g0Var.f9121s.getLayoutParams();
            if (g0Var.f9121s.isShown()) {
                if (g0Var.U == null) {
                    g0Var.U = new android.graphics.Rect();
                    g0Var.V = new android.graphics.Rect();
                }
                android.graphics.Rect rect = g0Var.U;
                android.graphics.Rect rect2 = g0Var.V;
                rect.set(0, e17, 0, 0);
                android.view.ViewGroup viewGroup = g0Var.f9126x;
                java.lang.reflect.Method method = androidx.appcompat.widget.h3.f9604a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (java.lang.Exception unused) {
                    }
                }
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? e17 : 0)) {
                    marginLayoutParams.topMargin = e17;
                    android.view.View view3 = g0Var.f9128z;
                    if (view3 == null) {
                        android.content.Context context = g0Var.f9109d;
                        android.view.View view4 = new android.view.View(context);
                        g0Var.f9128z = view4;
                        view4.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478566b0));
                        g0Var.f9126x.addView(g0Var.f9128z, -1, new android.view.ViewGroup.LayoutParams(-1, e17));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                        if (layoutParams.height != e17) {
                            layoutParams.height = e17;
                            g0Var.f9128z.setLayoutParams(layoutParams);
                        }
                    }
                    z18 = true;
                } else {
                    z18 = false;
                }
                r6 = g0Var.f9128z != null;
                i17 = (g0Var.E || !r6) ? e17 : 0;
                boolean z19 = r6;
                r6 = z18;
                z17 = z19;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                i17 = e17;
                z17 = false;
            } else {
                i17 = e17;
                z17 = false;
                r6 = false;
            }
            if (r6) {
                g0Var.f9121s.setLayoutParams(marginLayoutParams);
            }
        }
        android.view.View view5 = g0Var.f9128z;
        if (view5 != null) {
            int i18 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view5, arrayList.toArray(), "androidx/appcompat/app/AppCompatDelegateImpl", "updateStatusGuard", "(I)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view5, "androidx/appcompat/app/AppCompatDelegateImpl", "updateStatusGuard", "(I)I", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (e17 != i17) {
            g3Var2 = g3Var.g(g3Var.c(), i17, g3Var.d(), g3Var.b());
            view2 = view;
        } else {
            view2 = view;
            g3Var2 = g3Var;
        }
        return n3.l1.i(view2, g3Var2);
    }
}
