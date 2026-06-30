package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes15.dex */
public class b0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f156053d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f156054e = new java.util.ArrayList();

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11489x419d951f activityC11489x419d951f, android.content.Context context) {
        this.f156053d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f156054e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (i83.b) this.f156054e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.a0(this);
        if (view == null) {
            view2 = android.view.View.inflate(this.f156053d, com.p314xaae8f345.mm.R.C30864xbddafb2a.d4z, null);
            a0Var.f156044a = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f564273mn);
            a0Var.f156045b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f564280mv);
            android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.ptv);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/InvoiceListUI$InvoicesAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/address/ui/InvoiceListUI$InvoicesAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.sbg);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/address/ui/InvoiceListUI$InvoicesAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/address/ui/InvoiceListUI$InvoicesAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setTag(a0Var);
        } else {
            a0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.a0) view.getTag();
            view2 = view;
        }
        i83.b bVar = (i83.b) this.f156054e.get(i17);
        java.lang.String str = bVar.f371168e;
        if (str == null || !str.equals("0")) {
            java.lang.String str2 = bVar.f371168e;
            if (str2 != null && str2.equals("1")) {
                a0Var.f156044a.setText(com.p314xaae8f345.mm.R.C30867xcad56011.g2t);
                a0Var.f156045b.setText(bVar.f371170g);
            }
        } else {
            a0Var.f156044a.setText(com.p314xaae8f345.mm.R.C30867xcad56011.g2p);
            a0Var.f156045b.setText(bVar.f371169f);
        }
        return view2;
    }
}
