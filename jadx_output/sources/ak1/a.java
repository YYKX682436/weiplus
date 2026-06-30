package ak1;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f5560a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.ThreeDotsLoadingView f5561b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f5562c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f5563d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5564e;

    public a(android.view.ViewGroup parent, int i17) {
        android.widget.TextView textView;
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488072g3, parent, false);
        this.f5560a = inflate;
        this.f5561b = inflate != null ? (com.tencent.mm.ui.widget.ThreeDotsLoadingView) inflate.findViewById(com.tencent.mm.R.id.imn) : null;
        this.f5562c = inflate != null ? inflate.findViewById(com.tencent.mm.R.id.gcd) : null;
        this.f5563d = inflate;
        this.f5564e = true;
        if (inflate != null && (textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gbo)) != null) {
            textView.setText(i17);
        }
        a(true);
    }

    public final void a(boolean z17) {
        this.f5564e = z17;
        android.view.View view = this.f5562c;
        com.tencent.mm.ui.widget.ThreeDotsLoadingView threeDotsLoadingView = this.f5561b;
        if (z17) {
            if (threeDotsLoadingView != null) {
                threeDotsLoadingView.setVisibility(0);
                threeDotsLoadingView.e();
            }
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyFooterController", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyFooterController", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (threeDotsLoadingView != null) {
            threeDotsLoadingView.f();
            threeDotsLoadingView.setVisibility(8);
        }
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyFooterController", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyFooterController", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
