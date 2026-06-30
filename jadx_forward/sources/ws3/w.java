package ws3;

/* loaded from: classes9.dex */
public class w extends android.widget.Filter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ws3.y f530725a;

    public w(ws3.y yVar, ws3.r rVar) {
        this.f530725a = yVar;
    }

    public final int[] a(java.lang.String str, java.lang.String str2) {
        if (str.equals(str2)) {
            return vs3.a.f521406f;
        }
        if (str2 != null && str.length() == str2.length()) {
            int[] iArr = {-1, -1};
            int i17 = 0;
            for (int length = str.length() - 1; length > 0; length--) {
                if (str2.charAt(length) != str.charAt(length)) {
                    i17++;
                    if (i17 > 2) {
                        break;
                    }
                    iArr[i17 - 1] = length;
                }
            }
            if (i17 <= 2) {
                return iArr;
            }
        }
        return vs3.a.f521407g;
    }

    @Override // android.widget.Filter
    public synchronized android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence charSequence) {
        boolean z17;
        android.widget.Filter.FilterResults filterResults = new android.widget.Filter.FilterResults();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String a17 = charSequence != null ? vs3.b.a(charSequence.toString()) : "";
        if (a17.equals(this.f530725a.f530734h) && !a17.equals("")) {
            this.f530725a.f530736m.post(new ws3.v(this));
            filterResults.count = this.f530725a.f530730d.size();
            filterResults.values = this.f530725a.f530730d;
            return filterResults;
        }
        ws3.y yVar = this.f530725a;
        yVar.f530734h = a17;
        java.util.List list = yVar.f530732f;
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = this.f530725a.f530732f.iterator();
            while (it.hasNext()) {
                ((vs3.a) it.next()).f521412e = vs3.a.f521406f;
            }
        }
        if (this.f530725a.f530737n.b()) {
            java.lang.System.currentTimeMillis();
            int i17 = ws3.y.f530729q;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileHistoryAdapter", "performFiltering2 " + ((java.lang.Object) charSequence));
            vs3.a Di = us3.e.Di();
            if (Di != null && a17.equals(Di.f521408a)) {
                return filterResults;
            }
            java.util.List list2 = this.f530725a.f530738o;
            if (list2 == null || list2.isEmpty()) {
                ws3.y yVar2 = this.f530725a;
                yVar2.f530738o = o25.b.e(yVar2.f530735i);
            }
            java.util.List<java.lang.String[]> list3 = this.f530725a.f530738o;
            if (list3 != null) {
                for (java.lang.String[] strArr : list3) {
                    java.lang.String a18 = vs3.b.a(strArr[2]);
                    int[] a19 = a(this.f530725a.f530734h, a18);
                    if (vs3.a.f521406f.equals(a19)) {
                        return filterResults;
                    }
                    if (!vs3.a.f521407g.equals(a19) && arrayList.size() < 4) {
                        vs3.a aVar = new vs3.a(a18, strArr[1], 1);
                        aVar.f521412e = a19;
                        arrayList.add(aVar);
                    }
                }
            }
            for (vs3.a aVar2 : us3.e.Ai().Bi()) {
                int[] a27 = a(this.f530725a.f530734h, vs3.b.a(aVar2.f521408a));
                if (vs3.a.f521406f.equals(a27)) {
                    return filterResults;
                }
                if (!vs3.a.f521407g.equals(a27) && arrayList.size() < 4) {
                    aVar2.f521412e = a27;
                    arrayList.add(aVar2);
                }
            }
            int i18 = ws3.y.f530729q;
            java.lang.System.currentTimeMillis();
            z17 = true;
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f530725a.f530734h)) {
                arrayList.addAll(this.f530725a.f530732f);
            } else {
                int i19 = ws3.y.f530729q;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileHistoryAdapter", "performFiltering1 " + ((java.lang.Object) charSequence));
                for (vs3.a aVar3 : this.f530725a.f530732f) {
                    if (aVar3.f521408a.startsWith(this.f530725a.f530734h)) {
                        arrayList.add(aVar3);
                    }
                }
            }
            z17 = false;
        }
        filterResults.count = arrayList.size();
        filterResults.values = arrayList;
        this.f530725a.f530731e = z17;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
        java.lang.Object obj = filterResults.values;
        ws3.y yVar = this.f530725a;
        if (obj == null) {
            yVar.f530730d = new java.util.ArrayList();
        } else {
            yVar.f530730d = (java.util.List) obj;
        }
        if (filterResults.count == 0) {
            yVar.f530737n.L = true;
        } else {
            yVar.f530737n.L = false;
        }
        int i17 = ws3.y.f530729q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileHistoryAdapter", "results.count " + filterResults.count);
        if (filterResults.count > 0) {
            yVar.notifyDataSetChanged();
        }
    }
}
