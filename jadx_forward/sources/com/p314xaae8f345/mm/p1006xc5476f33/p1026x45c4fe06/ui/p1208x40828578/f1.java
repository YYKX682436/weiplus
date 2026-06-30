package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f171608a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9 f171609b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f171610c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f171611d;

    public f1(android.content.Context context, android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569614gg, viewGroup, false);
        this.f171608a = inflate;
        this.f171609b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9) inflate.findViewById(com.p314xaae8f345.mm.R.id.imn);
        this.f171610c = inflate.findViewById(com.p314xaae8f345.mm.R.id.gc9);
        this.f171611d = inflate.findViewById(com.p314xaae8f345.mm.R.id.dgm);
    }

    public void a(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9 c22651x9410f9f9 = this.f171609b;
            if (c22651x9410f9f9 != null) {
                c22651x9410f9f9.setVisibility(0);
                this.f171609b.e();
            }
            android.view.View view = this.f171611d;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9 c22651x9410f9f92 = this.f171609b;
        if (c22651x9410f9f92 != null) {
            c22651x9410f9f92.f();
            this.f171609b.setVisibility(8);
        }
        android.view.View view2 = this.f171611d;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
