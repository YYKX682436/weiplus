package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes.dex */
public class i9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 f288341d;

    public i9(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8) {
        this.f288341d = activityC22325x8baa24f8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SelectContactUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContactWeCom.k(view.getContext(), null)) {
            yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8 = this.f288341d;
        android.content.Intent intent = new android.content.Intent(activityC22325x8baa24f8.getIntent());
        intent.setClass(activityC22325x8baa24f8.mo55332x76847179(), com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22323x39e3762a.class);
        intent.removeExtra("titile");
        intent.putExtra("openim_appid", "3552365301");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.String str : activityC22325x8baa24f8.R) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) {
                arrayList2.add(str);
            }
        }
        intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList2, ","));
        activityC22325x8baa24f8.startActivityForResult(intent, 5);
        yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
