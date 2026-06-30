package ak1;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f87093a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9 f87094b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f87095c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f87096d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f87097e;

    public a(android.view.ViewGroup parent, int i17) {
        android.widget.TextView textView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569605g3, parent, false);
        this.f87093a = inflate;
        this.f87094b = inflate != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9) inflate.findViewById(com.p314xaae8f345.mm.R.id.imn) : null;
        this.f87095c = inflate != null ? inflate.findViewById(com.p314xaae8f345.mm.R.id.gcd) : null;
        this.f87096d = inflate;
        this.f87097e = true;
        if (inflate != null && (textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gbo)) != null) {
            textView.setText(i17);
        }
        a(true);
    }

    public final void a(boolean z17) {
        this.f87097e = z17;
        android.view.View view = this.f87095c;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9 c22651x9410f9f9 = this.f87094b;
        if (z17) {
            if (c22651x9410f9f9 != null) {
                c22651x9410f9f9.setVisibility(0);
                c22651x9410f9f9.e();
            }
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyFooterController", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyFooterController", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (c22651x9410f9f9 != null) {
            c22651x9410f9f9.f();
            c22651x9410f9f9.setVisibility(8);
        }
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyFooterController", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyFooterController", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
