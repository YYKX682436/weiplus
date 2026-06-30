package pw3;

/* loaded from: classes8.dex */
public class f extends android.widget.Filter {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f440232a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pw3.h f440233b;

    public f(pw3.h hVar, pw3.e eVar) {
        this.f440233b = hVar;
    }

    @Override // android.widget.Filter
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence charSequence) {
        java.util.List list = this.f440232a;
        ((java.util.ArrayList) list).clear();
        pw3.h hVar = this.f440233b;
        ((java.util.ArrayList) hVar.f440239f).clear();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65 c17100xa183cf65 : hVar.f440237d) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence) && c17100xa183cf65.f238008i.contains(charSequence)) {
                java.lang.String str = c17100xa183cf65.f238008i;
                int indexOf = str.indexOf((java.lang.String) charSequence);
                int length = charSequence.length() + indexOf;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayeeAutoCompleteAdapter", "match payee: %s, start: %s, end: %s", str, java.lang.Integer.valueOf(indexOf), java.lang.Integer.valueOf(length));
                ((java.util.ArrayList) hVar.f440239f).add(new android.util.Pair(java.lang.Integer.valueOf(indexOf), java.lang.Integer.valueOf(length)));
                ((java.util.ArrayList) list).add(c17100xa183cf65);
            }
        }
        android.widget.Filter.FilterResults filterResults = new android.widget.Filter.FilterResults();
        filterResults.count = ((java.util.ArrayList) list).size();
        filterResults.values = list;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
        java.util.List list = (java.util.List) filterResults.values;
        pw3.h hVar = this.f440233b;
        hVar.f440238e = list;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayeeAutoCompleteAdapter", "match count: %d", java.lang.Integer.valueOf(list.size()));
        hVar.notifyDataSetChanged();
    }
}
