package gh5;

/* loaded from: classes5.dex */
public abstract class g {
    public static final void a(android.view.Window window) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "<this>");
        n3.h2.a(window, false);
        window.setSoftInputMode(0);
        gh5.e eVar = new gh5.e();
        n3.l1.o(window.getDecorView(), eVar);
        n3.a1.u(window.getDecorView(), eVar);
        android.view.View decorView = window.getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        if (n3.x0.b(decorView)) {
            decorView.requestApplyInsets();
        } else {
            decorView.addOnAttachStateChangeListener(new gh5.f(decorView));
        }
    }
}
