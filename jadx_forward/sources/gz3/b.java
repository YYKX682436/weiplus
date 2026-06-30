package gz3;

/* loaded from: classes4.dex */
public class b implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2040x373fe494.ui.ActivityC17273xa70a65ea f359281d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2040x373fe494.ui.ActivityC17273xa70a65ea activityC17273xa70a65ea) {
        this.f359281d = activityC17273xa70a65ea;
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
        yj0.a.b("com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (i17 == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i17 > 0) {
            i17--;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2040x373fe494.ui.ActivityC17273xa70a65ea activityC17273xa70a65ea = this.f359281d;
        fz3.a aVar = (fz3.a) activityC17273xa70a65ea.f240270f.getItem(i17);
        if (aVar != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(activityC17273xa70a65ea, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3.class);
            intent.setFlags(65536);
            intent.putExtra("key_Product_xml", aVar.f69421xcba638c7);
            intent.putExtra("key_Product_funcType", aVar.f69417x70042dc3);
            intent.putExtra("key_Qrcode_Url", aVar.f69419x873c61fc);
            intent.putExtra("key_need_add_to_history", false);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC17273xa70a65ea, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "OnItemClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC17273xa70a65ea.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC17273xa70a65ea, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI", "OnItemClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12684, 0, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/history/ui/ScannerHistoryUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
