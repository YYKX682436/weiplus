package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public class b0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f74520d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f74521e = new java.util.ArrayList();

    public b0(com.tencent.mm.plugin.address.ui.InvoiceListUI invoiceListUI, android.content.Context context) {
        this.f74520d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f74521e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (i83.b) this.f74521e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.tencent.mm.plugin.address.ui.a0 a0Var = new com.tencent.mm.plugin.address.ui.a0(this);
        if (view == null) {
            view2 = android.view.View.inflate(this.f74520d, com.tencent.mm.R.layout.d4z, null);
            a0Var.f74511a = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f482740mn);
            a0Var.f74512b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f482747mv);
            android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.ptv);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/InvoiceListUI$InvoicesAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/address/ui/InvoiceListUI$InvoicesAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.sbg);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/address/ui/InvoiceListUI$InvoicesAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/address/ui/InvoiceListUI$InvoicesAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setTag(a0Var);
        } else {
            a0Var = (com.tencent.mm.plugin.address.ui.a0) view.getTag();
            view2 = view;
        }
        i83.b bVar = (i83.b) this.f74521e.get(i17);
        java.lang.String str = bVar.f289635e;
        if (str == null || !str.equals("0")) {
            java.lang.String str2 = bVar.f289635e;
            if (str2 != null && str2.equals("1")) {
                a0Var.f74511a.setText(com.tencent.mm.R.string.g2t);
                a0Var.f74512b.setText(bVar.f289637g);
            }
        } else {
            a0Var.f74511a.setText(com.tencent.mm.R.string.g2p);
            a0Var.f74512b.setText(bVar.f289636f);
        }
        return view2;
    }
}
