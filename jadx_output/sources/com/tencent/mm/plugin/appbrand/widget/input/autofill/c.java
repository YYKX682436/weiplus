package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public final class c extends android.widget.ArrayAdapter implements com.tencent.mm.plugin.appbrand.widget.input.autofill.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.LayoutInflater f91321d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.autofill.k f91322e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.autofill.e0 f91323f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f91324g;

    public c(android.content.Context context, java.util.List list) {
        super(context, com.tencent.mm.R.layout.f488048fe, list);
        this.f91324g = false;
        this.f91321d = android.view.LayoutInflater.from(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public android.widget.Filter getFilter() {
        return super.getFilter();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = this.f91321d.inflate(com.tencent.mm.R.layout.f488048fe, viewGroup, false);
        }
        com.tencent.mm.plugin.appbrand.widget.input.autofill.b bVar = (com.tencent.mm.plugin.appbrand.widget.input.autofill.b) view.getTag();
        if (bVar == null) {
            bVar = new com.tencent.mm.plugin.appbrand.widget.input.autofill.b(this, view);
            view.setTag(bVar);
        }
        pl1.b bVar2 = (pl1.b) getItem(i17);
        bVar.f91316i = bVar2;
        bVar.f91312e.setText(bVar2.f356578b);
        java.lang.String str = bVar2.f356579c;
        android.widget.TextView textView = bVar.f91313f;
        textView.setText(str);
        textView.setVisibility(com.tencent.mm.sdk.platformtools.t8.K0(bVar2.f356579c) ? 8 : 0);
        android.view.View view2 = bVar.f91315h;
        int i18 = i17 != getCount() + (-1) ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
