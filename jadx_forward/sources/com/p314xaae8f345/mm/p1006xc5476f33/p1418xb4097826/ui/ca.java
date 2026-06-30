package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class ca {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ca f210516a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ca();

    public final android.view.View a(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.view.View findViewById = activity.findViewById(com.p314xaae8f345.mm.R.id.he8);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderManagementUIHelper", "hideInteractiveInfo", "(Landroid/app/Activity;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/FinderManagementUIHelper", "hideInteractiveInfo", "(Landroid/app/Activity;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return findViewById;
    }
}
