package fp3;

/* loaded from: classes9.dex */
public class k implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16777xd3921e27 f346846d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16777xd3921e27 activityC16777xd3921e27) {
        this.f346846d = activityC16777xd3921e27;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/MallOrderProductListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16777xd3921e27 activityC16777xd3921e27 = this.f346846d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49 c16775xba5fef49 = (com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49) ((java.util.ArrayList) activityC16777xd3921e27.f234382f).get(i17);
        if (c16775xba5fef49 != null) {
            activityC16777xd3921e27.getClass();
            if (!hp3.d.c(activityC16777xd3921e27, c16775xba5fef49.f234347i)) {
                hp3.d.b(activityC16777xd3921e27, c16775xba5fef49.f234348m);
            }
            hp3.d.d(java.lang.Boolean.FALSE, activityC16777xd3921e27.f234384h, activityC16777xd3921e27.f234383g, c16775xba5fef49.f234343e, c16775xba5fef49.f234348m);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/MallOrderProductListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
