package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes4.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u f288478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f288479e;

    public y(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.z zVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar, android.content.Context context) {
        this.f288478d = uVar;
        this.f288479e = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/item/ContactViewItemDelegate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar = this.f288478d;
        intent.putExtra("Contact_User", uVar.f288352z);
        intent.putExtra("Contact_Scene", 3);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 4);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uVar.f288352z)) {
            j45.l.j(this.f288479e, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/item/ContactViewItemDelegate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
