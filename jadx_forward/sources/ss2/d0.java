package ss2;

/* loaded from: classes10.dex */
public final class d0 implements ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f493470d;

    /* renamed from: e, reason: collision with root package name */
    public int f493471e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f493472f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f493473g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f493474h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f493475i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f493476m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f493477n;

    /* renamed from: o, reason: collision with root package name */
    public int f493478o;

    public d0(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f493470d = activity;
        this.f493478o = 2;
    }

    public final void a() {
        int i17 = this.f493478o;
        android.app.Activity activity = this.f493470d;
        if (i17 == 2) {
            android.view.View view = this.f493476m;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchSceneFinderLogo");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "refreshCommentScene", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "refreshCommentScene", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView = this.f493473g;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchSceneAvatar");
                throw null;
            }
            ng5.a.a(imageView, c01.z1.r());
        } else {
            android.view.View view2 = this.f493476m;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchSceneFinderLogo");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "refreshCommentScene", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "refreshCommentScene", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ya2.b2 b17 = ya2.h.f542017a.b(xy2.c.e(activity));
            java.lang.String m176700xe5e0d2a0 = b17 != null ? b17.m176700xe5e0d2a0() : "";
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(m176700xe5e0d2a0, null, 2, null);
            android.widget.ImageView imageView2 = this.f493473g;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchSceneAvatar");
                throw null;
            }
            a17.c(nVar, imageView2, g1Var.h(mn2.f1.f411490h));
        }
        android.widget.TextView textView = this.f493474h;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchSceneName");
            throw null;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String b18 = hc2.t.b(activity, this.f493478o);
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(activity, b18));
    }
}
