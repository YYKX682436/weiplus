package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class y7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 f255984d;

    public y7(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9) {
        this.f255984d = activityC18635xb8188ef9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9 = this.f255984d;
        android.view.View findViewById = activityC18635xb8188ef9.findViewById(com.p314xaae8f345.mm.R.id.d9q);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = activityC18635xb8188ef9.f255070e;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.setVisibility(0);
        }
        android.view.View a76 = activityC18635xb8188ef9.a7();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(a76, arrayList3.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a76.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(a76, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View e76 = activityC18635xb8188ef9.e7();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(e76, arrayList4.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        e76.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(e76, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        bi4.d1 d1Var = activityC18635xb8188ef9.f255077n;
        if (d1Var != null) {
            d1Var.f436478o = 1;
        }
        if (activityC18635xb8188ef9.c7().y() || activityC18635xb8188ef9.c7().z()) {
            activityC18635xb8188ef9.b7().setVisibility(0);
        } else if (activityC18635xb8188ef9.c7().x() || activityC18635xb8188ef9.c7().D()) {
            activityC18635xb8188ef9.b7().setVisibility(8);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showEducationLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
