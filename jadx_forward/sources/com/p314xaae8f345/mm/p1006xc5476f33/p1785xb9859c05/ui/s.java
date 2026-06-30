package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.w f224532d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.w wVar) {
        this.f224532d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof java.lang.Integer) {
            int intValue = ((java.lang.Integer) view.getTag()).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.w wVar = this.f224532d;
            s83.c item = wVar.getItem(intValue);
            android.content.Intent intent = new android.content.Intent(wVar.f294141e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16151x42cade4d.class);
            intent.putExtra("IPCallProfileUI_contactid", item.f67827x821cd056);
            intent.putExtra("IPCallProfileUI_systemUsername", item.f67829x5c31173f);
            intent.putExtra("IPCallProfileUI_wechatUsername", item.f67830xf13c6c01);
            android.content.Context context = wVar.f294141e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
