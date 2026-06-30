package in5;

/* loaded from: classes10.dex */
public class s0 extends in5.r0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f374654e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f374655f;

    /* renamed from: g, reason: collision with root package name */
    public final x4.a f374656g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f374657h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f374658i;

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f374659m;

    public s0(android.view.View view, x4.a aVar) {
        super(view);
        this.f374659m = null;
        new java.util.LinkedHashSet();
        new java.util.LinkedHashSet();
        this.f374654e = view.getContext();
        this.f374656g = aVar;
    }

    public java.lang.Object l() {
        return this.f374658i;
    }

    public android.content.Context n() {
        return this.f374654e;
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o() {
        if (this.f374659m != null || !(this.f3639x46306858.getParent() instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4)) {
            return this.f374659m;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) this.f3639x46306858.getParent();
        this.f374659m = c1163xf1deaba4;
        return c1163xf1deaba4;
    }

    public android.view.View p(int i17) {
        return this.f3639x46306858.findViewById(i17);
    }

    public void q(java.lang.Object obj) {
        this.f374658i = obj;
    }

    public in5.s0 r(int i17, int i18) {
        ((android.widget.TextView) p(i17)).setText(i18);
        return this;
    }

    public in5.s0 s(int i17, java.lang.CharSequence charSequence) {
        ((android.widget.TextView) p(i17)).setText(charSequence);
        return this;
    }

    public in5.s0 v(int i17, int i18) {
        ((android.widget.TextView) p(i17)).setTextColor(i18);
        return this;
    }

    public in5.s0 w(int i17, int i18) {
        android.view.View p17 = p(i17);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/view/recyclerview/SimpleViewHolder", "setVisible", "(II)Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/view/recyclerview/SimpleViewHolder", "setVisible", "(II)Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return this;
    }

    public s0(android.view.View view) {
        super(view);
        this.f374659m = null;
        new java.util.LinkedHashSet();
        new java.util.LinkedHashSet();
        this.f374654e = view.getContext();
    }
}
