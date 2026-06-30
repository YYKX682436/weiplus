package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes.dex */
public class ha implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 f288290d;

    public ha(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8) {
        this.f288290d = activityC22325x8baa24f8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SelectContactUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("privacy_from_select_contact_ui", true);
        intent.putExtra("option_button_wording_res_id", com.p314xaae8f345.mm.R.C30867xcad56011.f571992vn);
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8 = this.f288290d;
        intent.setClassName(activityC22325x8baa24f8, "com.tencent.mm.plugin.label.ui.ContactLabelSelectUI");
        activityC22325x8baa24f8.startActivityForResult(intent, 7);
        activityC22325x8baa24f8.f288075e2 = java.lang.System.currentTimeMillis();
        yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
