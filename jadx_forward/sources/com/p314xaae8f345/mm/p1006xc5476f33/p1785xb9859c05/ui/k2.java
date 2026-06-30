package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes4.dex */
public class k2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16139x444a8b0 f224421d;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16139x444a8b0 activityC16139x444a8b0) {
        this.f224421d = activityC16139x444a8b0;
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
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16139x444a8b0 activityC16139x444a8b0 = this.f224421d;
        s83.g gVar = (s83.g) activityC16139x444a8b0.f224166e.getItem(i17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f67908xd15e26d9)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13780, java.lang.Integer.valueOf(gVar.f67910xc4aab016));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", gVar.f67908xd15e26d9);
            intent.putExtra("showShare", false);
            j45.l.j(activityC16139x444a8b0, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
