package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes8.dex */
public final class gc extends p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18646xfde55447 f255445a;

    public gc(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18646xfde55447 activityC18646xfde55447) {
        this.f255445a = activityC18646xfde55447;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18646xfde55447 activityC18646xfde55447 = this.f255445a;
        android.view.View view = activityC18646xfde55447.f255164h;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusHalfScreenLikeListUI$initData$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusHalfScreenLikeListUI$initData$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (activityC18646xfde55447.f255161e.isEmpty()) {
            android.widget.TextView textView = activityC18646xfde55447.f255163g;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        android.widget.TextView textView2 = activityC18646xfde55447.f255163g;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }
}
