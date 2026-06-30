package rx2;

/* loaded from: classes10.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1, p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void e(android.view.View targetView, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state, p012xc85e97e9.p103xe821e364.p104xd1075a44.e3 action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        int h17 = h(targetView, m());
        int i17 = i(targetView, n());
        double d17 = i17;
        int l17 = l((int) java.lang.Math.sqrt((h17 * h17) + (d17 * d17)));
        if (l17 > 0) {
            action.b(-h17, -i17, l17, this.f93708h);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int g(int i17, int i18, int i19, int i27, int i28) {
        return i27 - i18;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayMetrics, "displayMetrics");
        return 4000.0f / displayMetrics.widthPixels;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int k(int i17) {
        return l(i17);
    }
}
