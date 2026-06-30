package ul5;

/* loaded from: classes15.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public int f510169a;

    public boolean a(ul5.m overScroll, android.view.View child, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(overScroll, "overScroll");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        return true;
    }

    public int b(ul5.m overScroll, android.view.View child, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(overScroll, "overScroll");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        return (i17 == 2 || i17 == 8) ? child.getWidth() / 10 : (-child.getWidth()) / 10;
    }

    public int c(ul5.m overScroll, android.view.View child, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(overScroll, "overScroll");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        if (this.f510169a <= 0) {
            this.f510169a = android.view.ViewConfiguration.get(child.getContext()).getScaledMinimumFlingVelocity() * 15;
        }
        return this.f510169a;
    }
}
