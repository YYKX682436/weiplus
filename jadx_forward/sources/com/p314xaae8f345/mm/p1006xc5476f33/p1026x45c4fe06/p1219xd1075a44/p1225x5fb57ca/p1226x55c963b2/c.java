package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2;

/* loaded from: classes15.dex */
public final class c extends android.widget.ArrayAdapter implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.LayoutInflater f172854d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.k f172855e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.e0 f172856f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f172857g;

    public c(android.content.Context context, java.util.List list) {
        super(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569581fe, list);
        this.f172857g = false;
        this.f172854d = android.view.LayoutInflater.from(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public android.widget.Filter getFilter() {
        return super.getFilter();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = this.f172854d.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569581fe, viewGroup, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.b) view.getTag();
        if (bVar == null) {
            bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.b(this, view);
            view.setTag(bVar);
        }
        pl1.b bVar2 = (pl1.b) getItem(i17);
        bVar.f172849i = bVar2;
        bVar.f172845e.setText(bVar2.f438111b);
        java.lang.String str = bVar2.f438112c;
        android.widget.TextView textView = bVar.f172846f;
        textView.setText(str);
        textView.setVisibility(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar2.f438112c) ? 8 : 0);
        android.view.View view2 = bVar.f172848h;
        int i18 = i17 != getCount() + (-1) ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
