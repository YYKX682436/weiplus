package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes3.dex */
public class r3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.t3 f288686d;

    public r3(com.p314xaae8f345.mm.ui.p2690x38b72420.t3 t3Var) {
        this.f288686d = t3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/EnterpriseBizViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("enterprise_from_scene", 2);
        intent.putExtra("enterprise_biz_name", this.f288686d.f288724e);
        j45.l.j(view.getContext(), "brandservice", ".ui.EnterpriseBizContactListUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/ui/contact/EnterpriseBizViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
