package gc0;

/* loaded from: classes5.dex */
public final class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f351812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f351814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.kl5 f351815g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f351816h;

    public t1(yz5.l lVar, java.lang.String str, gc0.p2 p2Var, r45.kl5 kl5Var, android.view.View view) {
        this.f351812d = lVar;
        this.f351813e = str;
        this.f351814f = p2Var;
        this.f351815g = kl5Var;
        this.f351816h = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/profile/remark/RecommendRemarkUIC$initRecommendPhone$1$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((java.lang.Boolean) this.f351812d.mo146xb9724478(this.f351813e)).booleanValue()) {
            gc0.p2 p2Var = this.f351814f;
            java.util.ArrayList arrayList2 = (java.util.ArrayList) p2Var.f351781m.f351681g;
            r45.kl5 kl5Var = this.f351815g;
            arrayList2.add(kl5Var);
            r45.ml5 S6 = p2Var.S6();
            java.lang.String m75945x2fec8307 = kl5Var.m75945x2fec8307(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75945x2fec8307, "getPhone(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(S6, "<this>");
            java.util.LinkedList m75941xfb821914 = S6.m75941xfb821914(5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getPhoneInfo(...)");
            gc0.f1.a(m75941xfb821914, m75945x2fec8307).set(2, 1);
        }
        android.view.View view2 = this.f351816h;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/feature/profile/remark/RecommendRemarkUIC$initRecommendPhone$1$1$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/feature/profile/remark/RecommendRemarkUIC$initRecommendPhone$1$1$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/feature/profile/remark/RecommendRemarkUIC$initRecommendPhone$1$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
