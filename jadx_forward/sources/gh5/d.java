package gh5;

/* loaded from: classes5.dex */
public abstract class d {
    public static final gh5.b a(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "<this>");
        n3.h2.a(activity.getWindow(), false);
        android.view.View decorView = activity.getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        android.view.View findViewById = decorView.findViewById(com.p314xaae8f345.mm.R.id.f78293xc226dc16);
        if (findViewById == null) {
            findViewById = new android.view.View(activity);
            findViewById.setId(com.p314xaae8f345.mm.R.id.f78293xc226dc16);
            findViewById.setClickable(false);
            findViewById.setFocusable(false);
            findViewById.setImportantForAccessibility(2);
            findViewById.setLayoutParams(new android.widget.FrameLayout.LayoutParams(0, 0));
            ym5.v6.b(decorView, findViewById);
        }
        java.lang.Object tag = findViewById.getTag(com.p314xaae8f345.mm.R.id.f78292xcefc842e);
        gh5.b bVar = tag instanceof gh5.b ? (gh5.b) tag : null;
        if (bVar == null) {
            bVar = new gh5.b();
            n3.l1.o(findViewById, bVar);
            n3.a1.u(findViewById, bVar);
            if (n3.x0.b(findViewById)) {
                findViewById.requestApplyInsets();
            } else {
                findViewById.addOnAttachStateChangeListener(new gh5.c(findViewById));
            }
            findViewById.setTag(com.p314xaae8f345.mm.R.id.f78292xcefc842e, bVar);
        }
        return bVar;
    }

    public static final boolean b(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "<this>");
        android.view.View decorView = activity.getWindow().getDecorView();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.g3 a17 = n3.b1.a(decorView);
        if (a17 == null) {
            return false;
        }
        return a17.f(8);
    }
}
