package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class l1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16818xbff037ef f234846d;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16818xbff037ef activityC16818xbff037ef) {
        this.f234846d = activityC16818xbff037ef;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        wq3.u uVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.x0 x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.x0) view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w wVar = this.f234846d.f234795w;
        wVar.getClass();
        if (x0Var != null && (uVar = x0Var.f234907f) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallProductUI", "goProductUI type : " + uVar.f530141c);
            int i18 = uVar.f530141c;
            android.app.Activity activity = wVar.f234897d;
            if (i18 == 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", uVar.f530142d);
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(activity, intent);
            } else if (i18 == 1) {
                java.lang.String replace = uVar.f530143e.replace("product_id=", "");
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_product_id", replace);
                intent2.putExtra("key_product_scene", 6);
                j45.l.j(activity, "mall", ".product.ui.MallProductUI", intent2, null);
                activity.finish();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
