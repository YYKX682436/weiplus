package os3;

/* loaded from: classes8.dex */
public class y1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16934xe33e503a f429787d;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16934xe33e503a activityC16934xe33e503a) {
        this.f429787d = activityC16934xe33e503a;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16934xe33e503a activityC16934xe33e503a = this.f429787d;
        os3.f2 f2Var = activityC16934xe33e503a.f236407h;
        ks3.u uVar = (ks3.u) f2Var.f429612f.f236408i.get(i17 - activityC16934xe33e503a.f236405f.getHeaderViewsCount());
        java.lang.String str2 = uVar.f393284f;
        java.util.HashMap hashMap = (java.util.HashMap) f2Var.f429611e;
        if (hashMap.containsKey(str2)) {
            hashMap.remove(str2);
        } else {
            hashMap.put(str2, uVar);
        }
        f2Var.notifyDataSetChanged();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(activityC16934xe33e503a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjk));
        if (((java.util.HashMap) activityC16934xe33e503a.f236407h.f429611e).size() > 0) {
            str = "(" + ((java.util.HashMap) activityC16934xe33e503a.f236407h.f429611e).size() + ")";
        } else {
            str = "";
        }
        sb6.append(str);
        activityC16934xe33e503a.mo54450xbf7c1df6(sb6.toString());
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/MailAddrListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
