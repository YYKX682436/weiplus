package or1;

/* loaded from: classes12.dex */
public class m extends fb5.e {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f429060g;

    /* renamed from: h, reason: collision with root package name */
    public int f429061h;

    /* renamed from: i, reason: collision with root package name */
    public int f429062i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f429063m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f429064n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f429065o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f429066p;

    /* renamed from: q, reason: collision with root package name */
    public int f429067q;

    /* renamed from: r, reason: collision with root package name */
    public long[] f429068r;

    /* renamed from: s, reason: collision with root package name */
    public or1.l f429069s;

    public m(android.content.Context context) {
        super(context);
        this.f429060g = new java.util.ArrayList();
        this.f429066p = true;
        this.f429065o = true;
        this.f429064n = true;
        this.f429068r = new long[]{1};
    }

    @Override // fb5.e
    public java.lang.Object[] a(int i17) {
        or1.k l17 = l(i17);
        r45.qp j17 = j(i17);
        java.lang.String str = j17 != null ? j17.f465693m : "";
        if (l17 != null) {
            return new java.lang.Object[]{this, l17.f429050d, java.lang.Integer.valueOf(this.f429062i), str};
        }
        return null;
    }

    public final synchronized void d() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.f429060g).size(); i17++) {
            or1.k kVar = (or1.k) ((java.util.ArrayList) this.f429060g).get(i17);
            if (kVar != null) {
                hashMap.put(java.lang.Long.valueOf(kVar.f429047a), kVar);
            }
        }
        ((java.util.ArrayList) this.f429060g).clear();
        this.f429061h = 0;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f429068r;
            if (i18 >= jArr.length) {
                break;
            }
            or1.k kVar2 = (or1.k) hashMap.get(java.lang.Long.valueOf(jArr[i18]));
            if (kVar2 != null) {
                ((java.util.ArrayList) this.f429060g).add(kVar2);
                this.f429061h += m(kVar2);
            }
            i18++;
        }
        if (((java.util.ArrayList) this.f429060g).size() > 0) {
            java.util.List list = this.f429060g;
            or1.k kVar3 = (or1.k) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 1);
            boolean z17 = kVar3.f429053g;
            boolean z18 = this.f429064n;
            if (z17 == z18) {
                this.f429061h += z17 ? -1 : 1;
                kVar3.f429053g = z18 ? false : true;
            }
        }
        hashMap.clear();
    }

    public void f(r45.qp qpVar, boolean z17) {
        if ((this.f429064n && qpVar == null) || qpVar.f465691h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.BizSearchResultAdapter", "The content or content.ItemList is null or the mode do not support to append data.");
            return;
        }
        if (isEmpty()) {
            this.f429067q = (int) (java.lang.System.currentTimeMillis() / 1000);
        }
        or1.k k17 = k(qpVar.f465687d);
        if (k17 != null) {
            if (k17.f429051e == null) {
                k17.f429051e = new java.util.LinkedList();
            }
            java.util.List list = k17.f429051e;
            java.util.LinkedList linkedList = qpVar.f465691h;
            ((java.util.LinkedList) list).addAll(linkedList);
            if (k17.f429054h == null) {
                k17.f429054h = new java.util.LinkedList();
            }
            ((java.util.LinkedList) k17.f429054h).add(qpVar);
            k17.f429048b += linkedList.size();
            this.f429061h += linkedList.size();
        } else if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.BizSearchResultAdapter", "The type(%d) do not exist.", java.lang.Long.valueOf(qpVar.f465687d));
            return;
        } else {
            ((java.util.ArrayList) this.f429060g).add(h(qpVar));
            d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f342420f);
    }

    public void g() {
        n(null, null);
        this.f429067q = 0;
    }

    @Override // fb5.e, android.widget.Adapter
    public int getCount() {
        return this.f429061h;
    }

    public final or1.k h(r45.qp qpVar) {
        or1.k kVar = new or1.k();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        kVar.f429054h = linkedList;
        linkedList.add(qpVar);
        kVar.f429047a = qpVar.f465687d;
        java.util.LinkedList linkedList2 = qpVar.f465691h;
        kVar.f429048b = linkedList2.size();
        kVar.f429049c = qpVar.f465688e;
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        kVar.f429051e = linkedList3;
        linkedList3.addAll(linkedList2);
        kVar.f429050d = qpVar.f465690g;
        kVar.f429052f = this.f429066p;
        kVar.f429053g = this.f429065o && kVar.f429049c != 0;
        return kVar;
    }

    public r45.qp j(int i17) {
        if (i17 < 0) {
            return null;
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            java.util.List list = this.f429060g;
            if (i18 >= ((java.util.ArrayList) list).size()) {
                return null;
            }
            or1.k kVar = (or1.k) ((java.util.ArrayList) list).get(i18);
            int m17 = m(kVar);
            i19 += m17;
            if (i17 < i19) {
                int i27 = (i19 - m17) + (kVar.f429052f ? 1 : 0);
                for (int i28 = 0; i28 < kVar.f429054h.size(); i28++) {
                    r45.qp qpVar = (r45.qp) kVar.f429054h.get(i28);
                    i27 += qpVar.f465691h.size();
                    if (i17 < i27) {
                        return qpVar;
                    }
                }
                return null;
            }
            i18++;
        }
    }

    public final or1.k k(long j17) {
        java.util.List list;
        int i17 = 0;
        while (true) {
            list = this.f429060g;
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (i17 >= arrayList.size()) {
                i17 = -1;
                break;
            }
            if (((or1.k) arrayList.get(i17)).f429047a == j17) {
                break;
            }
            i17++;
        }
        if (i17 >= 0) {
            return (or1.k) ((java.util.ArrayList) list).get(i17);
        }
        return null;
    }

    public or1.k l(int i17) {
        if (i17 < 0) {
            return null;
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            java.util.List list = this.f429060g;
            if (i18 >= ((java.util.ArrayList) list).size()) {
                return null;
            }
            or1.k kVar = (or1.k) ((java.util.ArrayList) list).get(i18);
            i19 += m(kVar);
            if (i17 < i19) {
                return kVar;
            }
            i18++;
        }
    }

    public final int m(or1.k kVar) {
        if (kVar == null) {
            return 0;
        }
        return (kVar.f429053g ? 1 : 0) + kVar.f429048b + (kVar.f429052f ? 1 : 0);
    }

    public void n(java.lang.String str, java.util.List list) {
        java.util.LinkedList linkedList;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f429060g;
        arrayList.clear();
        this.f342418d.clear();
        java.lang.Runnable runnable = this.f342420f;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        this.f429061h = 0;
        this.f429063m = str;
        if (list != null) {
            this.f429067q = (int) (java.lang.System.currentTimeMillis() / 1000);
            for (int i17 = 0; i17 < list.size(); i17++) {
                r45.qp qpVar = (r45.qp) list.get(i17);
                if (qpVar != null && (linkedList = qpVar.f465691h) != null && linkedList.size() > 0) {
                    or1.k h17 = h(qpVar);
                    this.f429061h += m(h17);
                    arrayList.add(h17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BizSearchResultAdapter", "type(%d) , count(%d) , offset(%d)", java.lang.Long.valueOf(h17.f429047a), java.lang.Integer.valueOf(h17.f429048b), java.lang.Integer.valueOf(this.f429061h));
                }
            }
            d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
    }
}
