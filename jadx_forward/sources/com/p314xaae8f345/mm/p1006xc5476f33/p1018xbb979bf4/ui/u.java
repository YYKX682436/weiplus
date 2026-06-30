package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes15.dex */
public class u implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11489x419d951f f156161d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11489x419d951f activityC11489x419d951f) {
        this.f156161d = activityC11489x419d951f;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        i83.b bVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/InvoiceListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        synchronized (this.f156161d.f155961g) {
            if (i17 < this.f156161d.f155963i.size()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11489x419d951f activityC11489x419d951f = this.f156161d;
                activityC11489x419d951f.f155958d = (i83.b) activityC11489x419d951f.f155963i.get(i17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11489x419d951f activityC11489x419d951f2 = this.f156161d;
                if (activityC11489x419d951f2.f155964m || (bVar = activityC11489x419d951f2.f155958d) == null) {
                    i83.b bVar2 = activityC11489x419d951f2.f155958d;
                    if (bVar2 != null && bVar2.f371167d != 0) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("choose_invoice_title_info", t71.e.a(this.f156161d.f155958d));
                        this.f156161d.setResult(-1, intent);
                        this.f156161d.finish();
                    }
                } else {
                    activityC11489x419d951f2.T6(bVar.f371167d);
                }
            }
        }
        this.f156161d.f155959e.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/InvoiceListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
