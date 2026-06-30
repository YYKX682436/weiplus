package os3;

/* loaded from: classes8.dex */
public class r2 extends android.widget.Filter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ os3.t2 f429719a;

    public r2(os3.t2 t2Var, os3.h2 h2Var) {
        this.f429719a = t2Var;
    }

    @Override // android.widget.Filter
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence charSequence) {
        android.widget.Filter.FilterResults filterResults = new android.widget.Filter.FilterResults();
        os3.t2 t2Var = this.f429719a;
        if (t2Var.f429745g == null) {
            synchronized (t2Var.f429743e) {
                this.f429719a.f429745g = new java.util.ArrayList(this.f429719a.f429742d);
            }
        }
        if (charSequence == null || charSequence.length() == 0) {
            synchronized (this.f429719a.f429743e) {
                java.util.ArrayList arrayList = new java.util.ArrayList(this.f429719a.f429745g);
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
            }
        } else {
            java.lang.String lowerCase = charSequence.toString().toLowerCase();
            java.util.ArrayList arrayList2 = this.f429719a.f429745g;
            int size = arrayList2.size();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
            for (int i17 = 0; i17 < size; i17++) {
                ks3.u uVar = (ks3.u) arrayList2.get(i17);
                if (uVar.f393283e.toLowerCase().contains(lowerCase) || uVar.f393284f.toLowerCase().contains(lowerCase)) {
                    arrayList3.add(uVar);
                }
            }
            filterResults.values = arrayList3;
            filterResults.count = arrayList3.size();
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
        java.util.List list = (java.util.List) filterResults.values;
        os3.t2 t2Var = this.f429719a;
        t2Var.f429742d = list;
        if (filterResults.count > 0) {
            t2Var.notifyDataSetChanged();
        } else {
            t2Var.f429742d = new java.util.ArrayList(t2Var.f429745g);
            t2Var.notifyDataSetInvalidated();
        }
    }
}
