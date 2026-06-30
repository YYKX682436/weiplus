package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes11.dex */
public final class e2 extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 implements l75.z0 {

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2802xd031a825.ui.c2 f295666n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.HashMap f295667o;

    /* renamed from: p, reason: collision with root package name */
    public android.util.SparseArray f295668p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f295669q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f295670r;

    /* renamed from: s, reason: collision with root package name */
    public int f295671s;

    public e2(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, boolean z17, boolean z18, com.p314xaae8f345.mm.p2802xd031a825.ui.c2 c2Var) {
        super((com.p314xaae8f345.mm.ui.p2690x38b72420.l4) abstractActivityC22312xbd689c47, list, z17, z18, false);
        this.f295669q = new java.util.ArrayList();
        this.f295670r = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphabetContactAdapter", "create!");
        if (c2Var != null) {
            this.f295666n = c2Var;
        } else {
            this.f295666n = new com.p314xaae8f345.mm.p2802xd031a825.ui.c2();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        com.p314xaae8f345.mm.p2802xd031a825.ui.c2 c2Var2 = this.f295666n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2Var2);
        a17.W0(c2Var2.f295656c);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        s();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 stg, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stg, "stg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphabetContactAdapter", "onNotifyChange evnet = " + i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphabetContactAdapter", "onNotifyChange stg = " + stg);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphabetContactAdapter", "onNotifyChange obj = " + obj);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(obj.toString());
        if (L == null || !L.r2()) {
            return;
        }
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int size = this.f295670r.size();
        android.util.SparseArray sparseArray = this.f295668p;
        return size + (sparseArray != null ? sparseArray.size() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar;
        android.util.SparseArray sparseArray = this.f295668p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseArray);
        boolean z17 = false;
        if (sparseArray.indexOfKey(i17) >= 0) {
            android.util.SparseArray sparseArray2 = this.f295668p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseArray2);
            java.lang.Object obj = sparseArray2.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            com.p314xaae8f345.mm.p2802xd031a825.ui.y1 y1Var = new com.p314xaae8f345.mm.p2802xd031a825.ui.y1(i17);
            y1Var.f295804y = (java.lang.String) obj;
            y1Var.f288367c = false;
            if (i17 == 0 && this.f295671s > 0) {
                z17 = true;
            }
            y1Var.f295805z = z17;
            uVar = y1Var;
        } else {
            int i18 = i17;
            int i19 = 0;
            do {
                android.util.SparseArray sparseArray3 = this.f295668p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseArray3);
                if (i19 > sparseArray3.size()) {
                    break;
                }
                android.util.SparseArray sparseArray4 = this.f295668p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseArray4);
                if (sparseArray4.indexOfKey(i18) >= 0) {
                    i19++;
                }
                i18--;
            } while (i18 >= 0);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = ((com.p314xaae8f345.mm.p2802xd031a825.ui.f2) ((java.util.ArrayList) this.f295670r).get(i17 - i19)).f295675b;
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar2 = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u(i17);
            uVar2.f(z3Var);
            com.p314xaae8f345.mm.p2802xd031a825.ui.c2 c2Var = this.f295666n;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c2Var.f295656c)) {
                uVar2.f288382r = c2Var.f295656c;
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var.d1())) {
                uVar2.f288369e = false;
                uVar2.f288372h = false;
                uVar2.f288371g = false;
                uVar2.F = true;
            } else {
                uVar2.f288369e = this.f288611f;
                uVar2.f288372h = this.f288612g;
                uVar2.F = false;
            }
            uVar2.f288367c = false;
            uVar2.G = false;
            uVar = uVar2;
        }
        return uVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphabetContactAdapter", "finish!");
        this.f295670r.clear();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public int m() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public boolean o(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        int i17 = item.f288366b + 1;
        android.util.SparseArray sparseArray = this.f295668p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseArray);
        return sparseArray.indexOfKey(i17) >= 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public int r(java.lang.String header) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(header, "header");
        int hashCode = header.hashCode();
        if (hashCode == -1010580210 ? header.equals("openIm") : !(hashCode == 8593 ? !header.equals("↑") : !(hashCode == 1772656 && header.equals("🔍")))) {
            return 0;
        }
        java.util.HashMap hashMap = this.f295667o;
        if (hashMap != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hashMap);
            if (hashMap.containsKey(header)) {
                java.util.HashMap hashMap2 = this.f295667o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hashMap2);
                java.lang.Object obj = hashMap2.get(header);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                return ((java.lang.Number) obj).intValue() + this.f288609d.O3().getHeaderViewsCount();
            }
        }
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphabetContactAdapter", "resetData");
        ((java.util.ArrayList) this.f295670r).clear();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f295669q;
        arrayList.clear();
        java.util.HashMap hashMap = this.f295667o;
        if (hashMap != null) {
            hashMap.clear();
        } else {
            this.f295667o = new java.util.HashMap();
        }
        android.util.SparseArray sparseArray = this.f295668p;
        if (sparseArray != null) {
            sparseArray.clear();
        } else {
            this.f295668p = new android.util.SparseArray();
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.c2 c2Var = this.f295666n;
        boolean z17 = c2Var.f295654a;
        java.lang.Object obj = this.f288609d;
        if (z17) {
            java.lang.String str = null;
            java.util.List O1 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c2Var.f295655b) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(c2Var.f295655b, ",") : null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(O1)) {
                ((java.util.ArrayList) this.f295670r).clear();
            } else {
                int i17 = 1;
                if (O1 != null) {
                    ((java.util.ArrayList) this.f295670r).clear();
                    int size = O1.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) O1.get(i18), true);
                        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c2Var.f295656c) ? ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(c2Var.f295656c) : null;
                        rd0.g1 g1Var = (rd0.g1) i95.n0.c(rd0.g1.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
                        ((qd0.u0) g1Var).getClass();
                        ((java.util.ArrayList) this.f295670r).add(new com.p314xaae8f345.mm.p2802xd031a825.ui.f2(si5.b.f489858a.c(0, n17, z07), n17));
                    }
                }
                if (((java.util.ArrayList) this.f295670r).size() > 0) {
                    kz5.g0.t(this.f295670r, com.p314xaae8f345.mm.p2802xd031a825.ui.d2.f295662d);
                    java.util.List S0 = kz5.n0.S0(this.f295670r);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    ((java.util.ArrayList) this.f295670r).clear();
                    int size2 = S0.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(((com.p314xaae8f345.mm.p2802xd031a825.ui.f2) S0.get(i19)).f295675b.d1())) {
                            ((java.util.ArrayList) this.f295670r).add(S0.get(i19));
                        } else {
                            arrayList2.add(S0.get(i19));
                        }
                    }
                    this.f295671s = ((java.util.ArrayList) this.f295670r).size();
                    this.f295670r = kz5.n0.V0(kz5.n0.t0(this.f295670r, arrayList2));
                }
                arrayList.add("🔍");
                if (this.f295671s > 0) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.content.Context");
                    java.lang.String string = ((android.content.Context) obj).getString(com.p314xaae8f345.mm.R.C30867xcad56011.gnl);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    t(0, string);
                    arrayList.add("openIm");
                } else {
                    i17 = 0;
                }
                java.util.Iterator it = ((java.util.ArrayList) this.f295670r).iterator();
                int i27 = 0;
                while (it.hasNext()) {
                    int i28 = i27 + 1;
                    com.p314xaae8f345.mm.p2802xd031a825.ui.f2 f2Var = (com.p314xaae8f345.mm.p2802xd031a825.ui.f2) it.next();
                    int i29 = this.f295671s;
                    if (i27 < i29) {
                        i27 = i28;
                    } else {
                        java.lang.String str2 = f2Var.f295674a.f489861c;
                        if (i27 != i29 || str2 == null) {
                            if (str != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str) && str2 != null) {
                                t(i27 + i17, str2);
                                arrayList.add(str2);
                            }
                            i27 = i28;
                            str = str2;
                        } else {
                            t(i27 + i17, str2);
                            arrayList.add(str2);
                        }
                        i17++;
                        i27 = i28;
                        str = str2;
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyExclusiveSelectContactUI");
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16365xb36db592 activityC16365xb36db592 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16365xb36db592) obj;
            java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
            activityC16365xb36db592.I = strArr;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3 c21465x84498b3 = activityC16365xb36db592.f287980e;
            if (c21465x84498b3 != null) {
                c21465x84498b3.m78861xe90b84f5(strArr);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphabetContactAdapter", "memberList:%d headerPosMap=%s", java.lang.Integer.valueOf(((java.util.ArrayList) this.f295670r).size()), java.lang.String.valueOf(this.f295667o));
        h();
        notifyDataSetChanged();
    }

    public final void t(int i17, java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.HashMap hashMap = this.f295667o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hashMap);
        hashMap.put(str, valueOf);
        android.util.SparseArray sparseArray = this.f295668p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sparseArray);
        sparseArray.put(i17, str);
    }
}
