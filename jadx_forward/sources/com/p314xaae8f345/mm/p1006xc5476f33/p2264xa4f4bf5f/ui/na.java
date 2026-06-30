package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes5.dex */
public final class na implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 f255658d;

    public na(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078) {
        this.f255658d = activityC18639xf6f98078;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = this.f255658d;
        if (activityC18639xf6f98078.F1) {
            activityC18639xf6f98078.i7().clearFocus();
            activityC18639xf6f98078.mo48674x36654fab();
        } else {
            activityC18639xf6f98078.i7().requestFocus();
            activityC18639xf6f98078.mo26063x7b383410();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
