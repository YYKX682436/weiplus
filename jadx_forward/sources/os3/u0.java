package os3;

/* loaded from: classes8.dex */
public class u0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa f429749d;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa activityC16932x23233efa) {
        this.f429749d = activityC16932x23233efa;
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
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa activityC16932x23233efa = this.f429749d;
        os3.a1 item = activityC16932x23233efa.f236400q.getItem(i17);
        java.lang.String str = item.f429559a;
        os3.a1 a1Var = activityC16932x23233efa.f236400q.f429583d;
        if (str.equals(a1Var == null ? null : a1Var.f429559a)) {
            activityC16932x23233efa.U6(activityC16932x23233efa.f236400q.c());
            yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        boolean z17 = item.f429562d == 1;
        java.lang.String str2 = item.f429559a;
        if (z17) {
            activityC16932x23233efa.U6(str2);
            yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (item.f429564f) {
            java.lang.String[] strArr = {"mailid=" + activityC16932x23233efa.f236390d, "attachid=" + str2, "compressfilepath=" + activityC16932x23233efa.f236396m, "texttype=html"};
            android.content.Intent intent = new android.content.Intent(activityC16932x23233efa, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16939x74e056.class);
            intent.putExtra("uri", "/cgi-bin/viewdocument");
            intent.putExtra("params", strArr);
            intent.putExtra("baseurl", ks3.k0.c());
            intent.putExtra(ya.b.f77491x8758c4e1, "get");
            intent.putExtra("singleColumn", com.p314xaae8f345.mm.sdk.p2603x2137b148.g1.a(item.f429560b));
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, activityC16932x23233efa.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hrp));
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa activityC16932x23233efa2 = this.f429749d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC16932x23233efa2, arrayList2.toArray(), "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16932x23233efa2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC16932x23233efa2, "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
