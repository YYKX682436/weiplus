package hn2;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final hn2.k f364067a = new hn2.k();

    public final void a(java.lang.String inputText, android.view.View view, android.view.View view2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputText, "inputText");
        if (view != null) {
            int i17 = inputText.length() > 0 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveSongSearchHelper", "updateSearchIcons", "(Ljava/lang/String;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveSongSearchHelper", "updateSearchIcons", "(Ljava/lang/String;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view2 == null) {
            return;
        }
        int i18 = inputText.length() > 0 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveSongSearchHelper", "updateSearchIcons", "(Ljava/lang/String;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/singlist/common/FinderLiveSongSearchHelper", "updateSearchIcons", "(Ljava/lang/String;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
