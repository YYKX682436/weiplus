package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes.dex */
public class m5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16151x42cade4d f224476d;

    public m5(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16151x42cade4d activityC16151x42cade4d) {
        this.f224476d = activityC16151x42cade4d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16151x42cade4d activityC16151x42cade4d = this.f224476d;
        android.content.Intent intent = new android.content.Intent(activityC16151x42cade4d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16129xb3d75601.class);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16151x42cade4d.f224267t)) {
            intent.putExtra("IPCallAllRecordUI_contactId", activityC16151x42cade4d.f224267t);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16151x42cade4d.f224268u)) {
            intent.putExtra("IPCallAllRecordUI_phoneNumber", activityC16151x42cade4d.f224268u);
        }
        intent.putExtra("IPCallAllRecordUI_isSinglePhoneNumber", activityC16151x42cade4d.f224271x);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16151x42cade4d activityC16151x42cade4d2 = this.f224476d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC16151x42cade4d2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$11", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16151x42cade4d2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC16151x42cade4d2, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$11", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
