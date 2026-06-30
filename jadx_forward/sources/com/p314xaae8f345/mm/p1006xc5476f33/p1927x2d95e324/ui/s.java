package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

/* loaded from: classes.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16731xe258a4be f233879d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16731xe258a4be activityC16731xe258a4be) {
        this.f233879d = activityC16731xe258a4be;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16731xe258a4be activityC16731xe258a4be = this.f233879d;
        intent.setClass(activityC16731xe258a4be.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16734xf3af640.class);
        activityC16731xe258a4be.startActivityForResult(intent, 2);
        yj0.a.h(this, "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
