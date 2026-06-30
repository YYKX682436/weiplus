package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class j extends android.widget.Filter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.k f236726a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.a aVar) {
        this.f236726a = kVar;
    }

    @Override // android.widget.Filter
    public synchronized android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence charSequence) {
        boolean z17;
        int[] iArr;
        android.widget.Filter.FilterResults filterResults = new android.widget.Filter.FilterResults();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String a17 = charSequence != null ? vs3.b.a(charSequence.toString()) : "";
        if (a17.equals(this.f236726a.f236732h)) {
            this.f236726a.f236733i.f236619g.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.g(this));
            return filterResults;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.k kVar = this.f236726a;
        kVar.f236732h = a17;
        boolean a18 = kVar.f236733i.a();
        boolean z18 = false;
        if (a18) {
            java.lang.System.currentTimeMillis();
            java.util.Objects.toString(charSequence);
            for (vs3.a aVar : this.f236726a.f236730f) {
                if (aVar.f521408a.equals(this.f236726a.f236732h)) {
                    aVar.f521412e = vs3.a.f521406f;
                    arrayList.clear();
                    arrayList.add(aVar);
                }
            }
            if (arrayList.size() <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ViewOnFocusChangeListenerC16958xba487cab viewOnFocusChangeListenerC16958xba487cab = this.f236726a.f236733i;
                if (viewOnFocusChangeListenerC16958xba487cab.f236629t == null) {
                    try {
                        viewOnFocusChangeListenerC16958xba487cab.f236629t = o25.b.e(viewOnFocusChangeListenerC16958xba487cab.getContext());
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallEditText", e17, "", new java.lang.Object[0]);
                    }
                }
                java.util.List list = this.f236726a.f236733i.f236629t;
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.String[] strArr = (java.lang.String[]) it.next();
                        java.lang.String a19 = vs3.b.a(strArr[2]);
                        java.lang.String str = this.f236726a.f236732h;
                        if (str.equals(a19)) {
                            iArr = vs3.a.f521406f;
                        } else {
                            if (a19 != null && str.length() == a19.length()) {
                                int[] iArr2 = {-1, -1};
                                int i17 = 0;
                                for (int length = str.length() - 1; length > 0; length--) {
                                    if (a19.charAt(length) != str.charAt(length)) {
                                        i17++;
                                        if (i17 > 2) {
                                            break;
                                        }
                                        iArr2[i17 - 1] = length;
                                    }
                                }
                                if (i17 <= 2) {
                                    iArr = iArr2;
                                }
                            }
                            iArr = vs3.a.f521407g;
                        }
                        int[] iArr3 = vs3.a.f521406f;
                        if (iArr3.equals(iArr)) {
                            vs3.a aVar2 = new vs3.a(a19, strArr[1], 1);
                            aVar2.f521412e = iArr3;
                            arrayList.clear();
                            arrayList.add(aVar2);
                            break;
                        }
                        if (!vs3.a.f521407g.equals(iArr) && arrayList.size() < 5) {
                            vs3.a aVar3 = new vs3.a(a19, strArr[1], 1);
                            aVar3.f521412e = iArr;
                            arrayList.add(aVar3);
                        }
                    }
                }
            }
            java.lang.System.currentTimeMillis();
            z17 = true;
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f236726a.f236732h)) {
                arrayList.addAll(this.f236726a.f236730f);
            } else {
                java.util.Objects.toString(charSequence);
                for (vs3.a aVar4 : this.f236726a.f236730f) {
                    if (aVar4.f521408a.startsWith(this.f236726a.f236732h)) {
                        arrayList.add(aVar4);
                    }
                }
            }
            z17 = false;
        }
        if (arrayList.size() == 0) {
            this.f236726a.f236733i.f236619g.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.h(this));
        } else {
            if (arrayList.size() == 1 && this.f236726a.f236733i.a()) {
                vs3.a aVar5 = (vs3.a) arrayList.get(0);
                if (vs3.a.f521406f.equals(aVar5.f521412e)) {
                    this.f236726a.f236733i.f236619g.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.i(this, aVar5));
                }
            }
            z18 = z17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.k kVar2 = this.f236726a;
        java.util.List list2 = kVar2.f236728d;
        kVar2.f236728d = arrayList;
        kVar2.f236729e = z18;
        filterResults.count = arrayList.size();
        filterResults.values = this.f236726a.f236728d;
        list2.clear();
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
    }
}
