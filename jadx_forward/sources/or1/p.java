package or1;

/* loaded from: classes10.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f429081a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f429082b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f429083c;

    public p(or1.n nVar) {
    }

    public void a(int i17) {
        if (i17 == 1) {
            b(true, false, false);
            return;
        }
        if (i17 == 2) {
            b(false, false, true);
        } else if (i17 != 3) {
            b(false, false, false);
        } else {
            b(false, false, false);
        }
    }

    public final void b(boolean z17, boolean z18, boolean z19) {
        android.view.View view = this.f429081a;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f429082b;
        int i18 = z18 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f429083c;
        int i19 = z19 ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
