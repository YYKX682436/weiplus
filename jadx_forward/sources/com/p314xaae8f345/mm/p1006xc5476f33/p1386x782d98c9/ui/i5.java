package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class i5 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f181037d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f181038e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f181039f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f181041h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.b7 f181042i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f181043m;

    /* renamed from: o, reason: collision with root package name */
    public r45.dh7 f181045o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f181046p;

    /* renamed from: n, reason: collision with root package name */
    public boolean f181044n = false;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.d7 f181047q = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.d7();

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View.OnClickListener f181048r = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.d5(this);

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View.OnClickListener f181049s = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e5(this);

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnClickListener f181050t = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.f5(this);

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f181040g = c01.z1.r();

    public i5(android.content.Context context, java.lang.String str) {
        this.f181037d = context;
        this.f181043m = str;
    }

    public java.util.List a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, boolean z17) {
        if (arrayList == null) {
            try {
                arrayList = new java.util.ArrayList();
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceRankAdapter", "ap: rank exception,null info");
                return new java.util.ArrayList();
            }
        }
        if (arrayList2 == null) {
            arrayList2 = new java.util.ArrayList();
        }
        java.util.List d17 = d(arrayList, arrayList2, z17);
        this.f181046p = d17;
        return d17;
    }

    public r32.d c(java.lang.String str, java.util.ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r32.d dVar = (r32.d) it.next();
            if (str.equalsIgnoreCase(dVar.f67224xdec927b)) {
                return dVar;
            }
        }
        return null;
    }

    public final java.util.List d(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, boolean z17) {
        boolean z18;
        java.util.LinkedList linkedList = new java.util.LinkedList(arrayList);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.String str = this.f181040g;
        r32.d c17 = c(str, arrayList2);
        java.lang.String str2 = this.f181043m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.d7 d7Var = this.f181047q;
        if (c17 != null) {
            d7Var.f180966e = c17;
            d7Var.f180963b = 3;
            if (c17.f67221x29cc1f0d == 0) {
                ve4.e eVar = (ve4.e) i95.n0.c(ve4.e.class);
                android.app.Activity activity = (android.app.Activity) this.f181037d;
                ue4.w wVar = (ue4.w) eVar;
                wVar.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ue4.v(wVar, activity, str));
            }
        } else {
            d7Var.f180966e = null;
            d7Var.f180964c = str2;
            d7Var.f180965d = str;
            d7Var.f180963b = 7;
        }
        if (z17) {
            d7Var.f180962a = 2;
        } else {
            d7Var.f180962a = 1;
        }
        arrayList3.add(d7Var.a());
        d7Var.f180962a = 0;
        arrayList3.add(d7Var.a());
        f(linkedList, str);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        linkedList.size();
        linkedList.toString();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            r32.d dVar = (r32.d) it.next();
            d7Var.f180966e = dVar;
            d7Var.f180962a = 1;
            d7Var.f180963b = 4;
            arrayList4.add(d7Var.a());
            if (linkedList.size() > 0) {
                java.lang.String str3 = dVar.f67224xdec927b;
                try {
                    java.util.Iterator it6 = linkedList.iterator();
                    while (it6.hasNext()) {
                        if (((r32.c) it6.next()).f67118xdec927b.equalsIgnoreCase(str3)) {
                            z18 = true;
                            break;
                        }
                    }
                } catch (java.lang.Exception e17) {
                    e17.toString();
                }
                z18 = false;
                if (z18) {
                    d7Var.f180966e = dVar;
                    d7Var.f180962a = 1;
                    d7Var.f180963b = 2;
                    arrayList3.add(d7Var.a());
                    f(linkedList, dVar.f67224xdec927b);
                }
            }
        }
        if (linkedList.size() > 0) {
            java.util.Iterator it7 = linkedList.iterator();
            while (it7.hasNext()) {
                d7Var.f180965d = ((r32.c) it7.next()).f67118xdec927b;
                d7Var.f180964c = str2;
                d7Var.f180966e = null;
                d7Var.f180962a = 1;
                d7Var.f180963b = 6;
                arrayList3.add(d7Var.a());
            }
        }
        if (arrayList3.size() > 2) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e7) arrayList3.get(arrayList3.size() - 1)).f180982c = 2 | ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e7) arrayList3.get(arrayList3.size() - 1)).f180982c | 1;
            d7Var.f180962a = 0;
            d7Var.f180966e = null;
            arrayList3.add(d7Var.a());
        }
        if (arrayList4.size() > 1) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e7) arrayList4.get(arrayList4.size() - 1)).f180982c = 5;
        }
        arrayList3.addAll(arrayList4);
        arrayList2.size();
        arrayList2.toString();
        arrayList3.size();
        arrayList3.toString();
        return arrayList3;
    }

    public final void f(java.util.LinkedList linkedList, java.lang.String str) {
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r32.c cVar = (r32.c) it.next();
                if (cVar.f67118xdec927b.equalsIgnoreCase(str)) {
                    cVar.m161429x9616526c();
                    it.remove();
                }
            }
        }
    }

    public void g(r45.dh7 dh7Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceRankAdapter", "setMySelfInfo: mySelfInfo:%s", dh7Var);
        this.f181045o = dh7Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f181038e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e7) this.f181038e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e7) this.f181038e.get(i17)).f180981b;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b7  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r31, android.view.View r32, android.view.ViewGroup r33) {
        /*
            Method dump skipped, instructions count: 1797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.i5.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        return false;
    }
}
