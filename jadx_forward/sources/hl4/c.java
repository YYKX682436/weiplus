package hl4;

/* loaded from: classes11.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2292xb01d87d6.p2293x373aa5.DialogC18718x36d28c3a f363648d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2292xb01d87d6.p2293x373aa5.DialogC18718x36d28c3a dialogC18718x36d28c3a) {
        this.f363648d = dialogC18718x36d28c3a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View.OnClickListener onClickListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/membership/view/TingMembershipInfoDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2292xb01d87d6.p2293x373aa5.DialogC18718x36d28c3a dialogC18718x36d28c3a = this.f363648d;
        hl4.b bVar = dialogC18718x36d28c3a.f256244z;
        if (bVar != null && (onClickListener = bVar.f363641e) != null) {
            onClickListener.onClick(view);
        }
        dialogC18718x36d28c3a.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/ting/membership/view/TingMembershipInfoDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
