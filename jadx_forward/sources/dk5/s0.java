package dk5;

/* loaded from: classes11.dex */
public class s0 extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f316398n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f316399o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f316400p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashSet f316401q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f316402r;

    /* renamed from: s, reason: collision with root package name */
    public final o13.x f316403s;

    /* renamed from: t, reason: collision with root package name */
    public int f316404t;

    public s0(com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var, java.util.List list, boolean z17, boolean z18, java.util.List list2, int i17) {
        super(l4Var, list, z17, z18, i17);
        this.f316402r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f316403s = new dk5.p0(this);
        this.f316404t = 0;
        this.f316398n = list2;
        this.f316400p = new java.util.ArrayList();
        this.f316401q = new java.util.HashSet();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f316404t;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        java.util.List list = this.f316400p;
        int size = ((java.util.ArrayList) list).size() - 1;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar = null;
        while (true) {
            if (size < 0) {
                break;
            }
            dk5.r0 r0Var = (dk5.r0) ((java.util.ArrayList) list).get(size);
            int i18 = r0Var.f316373c;
            if (i18 == i17) {
                com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
                n0Var.f288436y = this.f288609d.mo8774x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ig_, r0Var.f316371a);
                dVar = n0Var;
            } else {
                dVar = dVar;
                if (r0Var.f316374d == i17) {
                    com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a1 a1Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a1(i17);
                    a1Var.C = com.p314xaae8f345.mm.R.C30867xcad56011.ffq;
                    a1Var.D = r0Var.f316375e;
                    dVar = a1Var;
                } else if (i17 > i18) {
                    int i19 = (i17 - i18) - 1;
                    p13.y yVar = (p13.y) r0Var.f316376f.get(i19);
                    if (yVar.f432720e.equals("no_result\u200b")) {
                        dVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.x0(i17);
                    } else {
                        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u(i17);
                        uVar.C = yVar;
                        uVar.A = r0Var.f316372b;
                        uVar.f288388x = true;
                        uVar.f288387w = i19 + 1;
                        int i27 = yVar.f432717b;
                        int i28 = yVar.f432718c;
                        uVar.f288386v = i27;
                        uVar.f288385u = i28;
                        dVar = uVar;
                    }
                }
            }
            if (dVar != null) {
                dVar.f288381q = r0Var.f316371a;
                dVar.f288384t = this.f288613h;
                dVar.f288369e = true;
                break;
            }
            size--;
            dVar = dVar;
        }
        return dVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        h();
        java.util.Iterator it = ((java.util.ArrayList) this.f316399o).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public boolean n(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        return u(i17);
    }

    public java.util.List t() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = ((java.util.ArrayList) this.f316400p).iterator();
        while (it.hasNext()) {
            dk5.r0 r0Var = (dk5.r0) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0Var.f316377g)) {
                hashSet.add(r0Var.f316377g);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(hashSet);
        return arrayList;
    }

    public final boolean u(int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var = this.f288609d;
        int headerViewsCount = i17 - l4Var.O3().getHeaderViewsCount();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f316400p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            dk5.r0 r0Var = (dk5.r0) arrayList.get(size);
            p13.y yVar = null;
            if (r0Var.f316374d == headerViewsCount) {
                if (r0Var.f316375e) {
                    int selectedItemPosition = l4Var.O3().getSelectedItemPosition();
                    r0Var.f316375e = false;
                    v();
                    l4Var.O3().setSelection(selectedItemPosition);
                } else {
                    r0Var.f316375e = true;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= r0Var.f316376f.size()) {
                            i18 = 0;
                            break;
                        }
                        p13.y yVar2 = (p13.y) r0Var.f316376f.get(i18);
                        if (yVar2.f432720e.equals(r0Var.f316377g) && i18 > 2) {
                            yVar = yVar2;
                            break;
                        }
                        i18++;
                    }
                    if (yVar != null) {
                        r0Var.f316376f.remove(i18);
                        r0Var.f316376f.add(0, yVar);
                    }
                    v();
                    l4Var.O3().setSelection(i17);
                }
                notifyDataSetChanged();
                return true;
            }
            int i19 = r0Var.f316373c;
            if (headerViewsCount == i19) {
                return true;
            }
            if (i17 > i19) {
                p13.y yVar3 = (p13.y) r0Var.f316376f.get((headerViewsCount - i19) - 1);
                if (yVar3.f432720e.equals("no_result\u200b")) {
                    return true;
                }
                com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22566x6f3df1e3 activityC22566x6f3df1e3 = (com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22566x6f3df1e3) l4Var;
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0Var.f316377g);
                java.util.HashSet hashSet = this.f316401q;
                if (K0) {
                    if (hashSet.contains(yVar3.f432720e)) {
                        return true;
                    }
                    activityC22566x6f3df1e3.f287983h.a(yVar3.f432720e, false);
                    java.lang.String str = yVar3.f432720e;
                    r0Var.f316377g = str;
                    hashSet.add(str);
                } else if (r0Var.f316377g.equals(yVar3.f432720e)) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = activityC22566x6f3df1e3.f287983h;
                    java.lang.String str2 = r0Var.f316377g;
                    if (str2 != null) {
                        c19642xb279030.g(str2, false, false);
                    } else {
                        c19642xb279030.getClass();
                    }
                    hashSet.remove(r0Var.f316377g);
                    r0Var.f316377g = null;
                } else {
                    if (hashSet.contains(yVar3.f432720e)) {
                        return true;
                    }
                    hashSet.remove(r0Var.f316377g);
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb2790302 = activityC22566x6f3df1e3.f287983h;
                    java.lang.String str3 = r0Var.f316377g;
                    if (str3 != null) {
                        c19642xb2790302.g(str3, false, false);
                    } else {
                        c19642xb2790302.getClass();
                    }
                    java.lang.String str4 = yVar3.f432720e;
                    r0Var.f316377g = str4;
                    activityC22566x6f3df1e3.f287983h.a(str4, false);
                    hashSet.add(r0Var.f316377g);
                }
                activityC22566x6f3df1e3.x7();
                notifyDataSetChanged();
                return true;
            }
        }
        return false;
    }

    public final void v() {
        java.util.Iterator it = ((java.util.ArrayList) this.f316400p).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            dk5.r0 r0Var = (dk5.r0) it.next();
            if (r0Var.f316376f.size() > 0) {
                r0Var.f316373c = i17;
                int i18 = i17 + 1;
                if (r0Var.f316376f.size() > 3) {
                    int size = r0Var.f316375e ? i18 + 3 : i18 + r0Var.f316376f.size();
                    r0Var.f316374d = size;
                    i17 = size + 1;
                } else {
                    i17 = i18 + r0Var.f316376f.size();
                }
            }
        }
        this.f316404t = i17;
        h();
        notifyDataSetChanged();
    }
}
