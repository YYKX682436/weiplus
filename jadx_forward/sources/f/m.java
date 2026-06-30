package f;

/* loaded from: classes14.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final android.view.ViewGroup.LayoutParams f339522a = new android.view.ViewGroup.LayoutParams(-2, -2);

    public static void a(p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c, n0.g1 g1Var, yz5.p content, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            g1Var = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityC0053x3d3f670c, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        android.view.View childAt = ((android.view.ViewGroup) activityC0053x3d3f670c.getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1064x3122af37 c1064x3122af37 = childAt instanceof p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1064x3122af37 ? (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1064x3122af37) childAt : null;
        if (c1064x3122af37 != null) {
            c1064x3122af37.m7016xae77971(g1Var);
            c1064x3122af37.m7061xe9f5bdb7(content);
            return;
        }
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1064x3122af37 c1064x3122af372 = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1064x3122af37(activityC0053x3d3f670c, null, 0, 6, null);
        c1064x3122af372.m7016xae77971(g1Var);
        c1064x3122af372.m7061xe9f5bdb7(content);
        android.view.View decorView = activityC0053x3d3f670c.getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "window.decorView");
        if (p012xc85e97e9.p093xedfae76a.n1.a(decorView) == null) {
            decorView.setTag(com.p314xaae8f345.mm.R.id.p28, activityC0053x3d3f670c);
        }
        if (p012xc85e97e9.p093xedfae76a.o1.a(decorView) == null) {
            decorView.setTag(com.p314xaae8f345.mm.R.id.p2_, activityC0053x3d3f670c);
        }
        if (o4.j.a(decorView) == null) {
            o4.j.b(decorView, activityC0053x3d3f670c);
        }
        activityC0053x3d3f670c.setContentView(c1064x3122af372, f339522a);
    }
}
