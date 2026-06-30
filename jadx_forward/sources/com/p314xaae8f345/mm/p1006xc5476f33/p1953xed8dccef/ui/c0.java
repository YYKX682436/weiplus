package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes8.dex */
public class c0 extends android.widget.Filter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.e0 f234808a;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.e0 e0Var) {
        this.f234808a = e0Var;
    }

    @Override // android.widget.Filter
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence charSequence) {
        android.widget.Filter.FilterResults filterResults = new android.widget.Filter.FilterResults();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f234808a.f234814e).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (str != null && charSequence != null && str.contains(charSequence)) {
                arrayList.add(str);
            }
        }
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    public synchronized void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.e0 e0Var = this.f234808a;
        e0Var.f234815f = (java.util.List) filterResults.values;
        e0Var.notifyDataSetChanged();
    }
}
