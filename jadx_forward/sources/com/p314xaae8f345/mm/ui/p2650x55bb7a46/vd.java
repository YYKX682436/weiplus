package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class vd implements db5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f f284338a;

    public vd(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f) {
        this.f284338a = activityC21642xe60a98f;
    }

    @Override // db5.i
    public void a(android.widget.ScrollView scrollView, int i17, int i18, int i19, int i27) {
        android.view.View view;
        boolean z17 = scrollView.getChildAt(0).getMeasuredHeight() == scrollView.getHeight() + scrollView.getScrollY();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f = this.f284338a;
        if (z17) {
            activityC21642xe60a98f.f279873v = scrollView.getScrollY();
        }
        if (scrollView.getScrollY() > 0) {
            int scrollY = scrollView.getScrollY();
            int i28 = activityC21642xe60a98f.f279873v;
            if (scrollY < i28 - 10 || i28 <= 0) {
                if (activityC21642xe60a98f.f279874w) {
                    if (i27 > i18) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.V6(activityC21642xe60a98f);
                    } else if (i27 < i18 && (view = activityC21642xe60a98f.F) != null) {
                        view.setAnimation(activityC21642xe60a98f.f279871t);
                        android.view.View view2 = activityC21642xe60a98f.F;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/TextPreviewUI", "hideToolsBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/ui/chatting/TextPreviewUI", "hideToolsBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    activityC21642xe60a98f.f279874w = false;
                }
                int i29 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.H;
                activityC21642xe60a98f.Y6();
                activityC21642xe60a98f.getClass();
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.V6(activityC21642xe60a98f);
        int i292 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.H;
        activityC21642xe60a98f.Y6();
        activityC21642xe60a98f.getClass();
    }
}
