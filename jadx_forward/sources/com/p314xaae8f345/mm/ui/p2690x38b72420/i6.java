package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class i6 extends com.p314xaae8f345.mm.ui.p2690x38b72420.o4 {
    public final java.util.Map A;
    public final java.util.Map B;
    public int C;
    public final com.p314xaae8f345.mm.ui.p2690x38b72420.k1 D;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 E;
    public final o13.x F;
    public final int G;
    public final int H;
    public int I;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f288325m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.Map f288326n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f288327o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.Map f288328p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f288329q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f288330r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f288331s;

    /* renamed from: t, reason: collision with root package name */
    public p13.c f288332t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f288333u;

    /* renamed from: v, reason: collision with root package name */
    public int f288334v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Map f288335w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f288336x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f288337y;

    /* renamed from: z, reason: collision with root package name */
    public android.database.Cursor f288338z;

    public i6(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, java.util.List list2, java.util.List list3, boolean z17, int i17) {
        super(abstractActivityC22312xbd689c47, z17, i17);
        this.f288325m = new java.util.LinkedList();
        this.f288326n = null;
        this.f288327o = new java.util.HashMap();
        this.f288328p = null;
        this.f288334v = 0;
        this.f288335w = new java.util.HashMap();
        this.A = new java.util.HashMap();
        this.B = new java.util.HashMap();
        this.C = 0;
        this.D = new com.p314xaae8f345.mm.ui.p2690x38b72420.k1();
        this.E = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.F = new com.p314xaae8f345.mm.ui.p2690x38b72420.h6(this);
        this.G = 1;
        this.H = 1;
        this.I = 0;
        this.f288330r = list;
        this.f288329q = list2;
        this.f288331s = list3;
        this.f288337y = new java.util.ArrayList();
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(java.lang.String r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2690x38b72420.i6.A(java.lang.String, boolean, boolean):void");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        int i18;
        int i19;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.x0 x0Var;
        int i27;
        if (i17 >= this.I) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiSearchContactAdapter", "createDataItem err %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.I));
            return null;
        }
        java.util.List list = this.f288325m;
        boolean z17 = this.f288612g;
        com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var = this.f288609d;
        int i28 = this.G;
        if (list == null || list.size() <= 0) {
            i18 = 0;
        } else {
            if (i17 < this.f288325m.size() + i28) {
                if (i17 == 0) {
                    java.lang.String string = l4Var.mo8774x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ifx);
                    com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
                    n0Var.f288436y = string;
                    return n0Var;
                }
                gm0.j1.i();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) this.f288325m.get(i17 - i28), true);
                com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u(i17);
                uVar.f(n17);
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(n17.d1())) {
                    uVar.f288369e = false;
                    uVar.f288372h = false;
                    uVar.f288371g = false;
                    uVar.F = true;
                } else {
                    uVar.f288369e = this.f288611f;
                    uVar.f288372h = z17;
                    uVar.F = false;
                }
                return uVar;
            }
            i18 = this.f288325m.size() + i28 + 0;
        }
        int i29 = this.C;
        java.util.Map map = this.f288327o;
        int i37 = 3;
        if (i17 < i29) {
            for (java.lang.String str : this.f288333u) {
                if (((java.util.HashMap) this.f288326n).get(str) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiSearchContactAdapter", "word:%s, position:%d, count:%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.I));
                } else {
                    int size = ((java.util.List) ((java.util.HashMap) this.f288326n).get(str)).size();
                    if (z() && size > i37) {
                        if (!((java.lang.Boolean) ((java.util.HashMap) map).get(str)).booleanValue()) {
                            size = i37;
                        }
                        int i38 = this.H;
                        if (i17 < i18 + size + i28 + i38) {
                            i19 = i17 - i18;
                            break;
                        }
                        i27 = size + i28 + i38;
                        i18 += i27;
                        i37 = 3;
                    } else {
                        if (i17 < i18 + size + i28) {
                            i19 = i17 - i18;
                            break;
                        }
                        i27 = size + i28;
                        i18 += i27;
                        i37 = 3;
                    }
                }
            }
            str = null;
            i19 = 0;
            i29 = i18;
        } else {
            str = null;
            i19 = 0;
        }
        if (str == null) {
            int i39 = i17 - i29;
            java.util.HashMap hashMap = (java.util.HashMap) this.A;
            if (hashMap.get(java.lang.Integer.valueOf(i39)) != null) {
                java.lang.String str2 = (java.lang.String) hashMap.get(java.lang.Integer.valueOf(i39));
                com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var2 = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
                n0Var2.f288436y = str2;
                return n0Var2;
            }
            android.database.Cursor cursor = this.f288338z;
            java.util.Iterator it = hashMap.keySet().iterator();
            int i47 = 0;
            while (it.hasNext()) {
                if (i39 > ((java.lang.Integer) it.next()).intValue()) {
                    i47++;
                }
            }
            if (!cursor.moveToPosition(i39 - i47)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiSearchContactAdapter", "create contact item error: position=%d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.I));
                return null;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            z3Var.mo9015xbf5d97fd(this.f288338z);
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar2 = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u(i17);
            uVar2.f(z3Var);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var.d1())) {
                uVar2.f288369e = false;
                uVar2.f288372h = false;
                uVar2.f288371g = false;
                uVar2.F = true;
            } else {
                uVar2.f288369e = this.f288611f;
                uVar2.f288372h = z17;
                uVar2.F = false;
            }
            return uVar2;
        }
        if (i19 == 0) {
            java.lang.String str3 = "\"" + str + "\"";
            if (!z()) {
                str3 = l4Var.mo8774x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ffq);
            }
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var3 = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
            n0Var3.f288436y = str3;
            x0Var = n0Var3;
        } else if (i19 > ((!z() || ((java.lang.Boolean) ((java.util.HashMap) map).get(str)).booleanValue()) ? ((java.util.List) ((java.util.HashMap) this.f288326n).get(str)).size() : 3)) {
            boolean z18 = !((java.lang.Boolean) ((java.util.HashMap) map).get(str)).booleanValue();
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a1 a1Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a1(i17);
            a1Var.C = com.p314xaae8f345.mm.R.C30867xcad56011.ffq;
            a1Var.D = z18;
            x0Var = a1Var;
        } else {
            p13.y yVar = (p13.y) ((java.util.List) ((java.util.HashMap) this.f288326n).get(str)).get(i19 - 1);
            if (yVar.f432716a > 0) {
                com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar3 = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u(i17);
                uVar3.C = yVar;
                uVar3.f288369e = this.f288611f;
                uVar3.f288388x = true;
                uVar3.f288387w = i19 + 1;
                int i48 = yVar.f432717b;
                int i49 = yVar.f432718c;
                uVar3.f288386v = i48;
                uVar3.f288385u = i49;
                x0Var = uVar3;
            } else {
                x0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.x0(i17);
            }
        }
        x0Var.f288381q = str;
        if (x0Var instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) {
            x0Var.A = (p13.r) ((java.util.HashMap) this.f288328p).get(str);
        }
        x0Var.f288384t = this.f288613h;
        return x0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiSearchContactAdapter", "finish!");
        r();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public int m() {
        return this.f288325m.size();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public boolean n(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var = this.f288609d;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = getItem(i17 - l4Var.O3().getHeaderViewsCount());
        if (item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a1) {
            java.util.Map map = this.f288327o;
            java.util.HashMap hashMap = (java.util.HashMap) map;
            hashMap.put(item.f288381q, java.lang.Boolean.valueOf(!((java.lang.Boolean) hashMap.get(r4)).booleanValue()));
            A(null, true, false);
            l4Var.O3().setSelection(l4Var.O3().getSelectedItemPosition());
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f288381q) || !(item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u)) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) item).B;
        boolean contains = this.f288329q.contains(z3Var.d1());
        java.util.Map map2 = this.f288335w;
        if (contains) {
            java.util.HashMap hashMap2 = (java.util.HashMap) map2;
            if (hashMap2.get(item.f288381q) != null) {
                ((java.util.LinkedList) hashMap2.get(item.f288381q)).remove(z3Var.d1());
            }
        } else {
            java.util.HashMap hashMap3 = (java.util.HashMap) map2;
            if (hashMap3.get(item.f288381q) == null) {
                hashMap3.put(item.f288381q, new java.util.LinkedList());
            }
            ((java.util.LinkedList) hashMap3.get(item.f288381q)).add(z3Var.d1());
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.k1 k1Var = this.D;
        k1Var.f288516a = null;
        k1Var.f288517b = null;
        ((java.util.LinkedList) k1Var.f288518c).clear();
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public boolean o(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        int i17 = dVar.f288366b + 1;
        if (i17 >= this.I) {
            return true;
        }
        int i18 = this.C;
        if (i17 >= i18) {
            if (((java.util.HashMap) this.A).get(java.lang.Integer.valueOf(i17 - i18)) != null) {
                return true;
            }
        }
        if (this.f288325m.size() > 0 && i17 == this.f288325m.size() + this.G) {
            return true;
        }
        if (i17 >= this.C) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j17 = j(i17);
        return j17 == null && (j17 instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void r() {
        ((java.util.HashMap) this.f288335w).clear();
        ((java.util.HashMap) this.f288327o).clear();
        y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b A[LOOP:2: B:26:0x0099->B:27:0x009b, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(java.lang.String r7, int[] r8, boolean r9) {
        /*
            r6 = this;
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r6.f288326n = r9
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r6.f288328p = r9
            java.util.List r9 = r6.f288325m
            r9.clear()
            android.database.Cursor r9 = r6.f288338z
            if (r9 == 0) goto L2b
            r9.close()
            r9 = 0
            r6.f288338z = r9
            java.util.Map r9 = r6.A
            java.util.HashMap r9 = (java.util.HashMap) r9
            r9.clear()
            java.util.Map r9 = r6.B
            java.util.HashMap r9 = (java.util.HashMap) r9
            r9.clear()
        L2b:
            r9 = 0
            r6.I = r9
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.String r1 = " "
            java.lang.String[] r1 = r7.split(r1)
            int r2 = r1.length
            r3 = r9
        L3b:
            if (r3 >= r2) goto L4f
            r4 = r1[r3]
            java.lang.String r5 = r4.trim()
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5)
            if (r5 != 0) goto L4c
            r0.add(r4)
        L4c:
            int r3 = r3 + 1
            goto L3b
        L4f:
            java.util.Map r1 = r6.f288335w
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.util.Set r1 = r1.keySet()
            r0.addAll(r1)
            java.util.List r1 = r6.f288333u
            if (r1 == 0) goto L84
            int r1 = r0.size()
            java.util.List r2 = r6.f288333u
            int r2 = r2.size()
            if (r1 == r2) goto L6b
            goto L8a
        L6b:
            java.util.Iterator r1 = r0.iterator()
        L6f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r3 = r6.f288333u
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L6f
            goto L8a
        L84:
            java.util.List r1 = r6.f288333u
            if (r1 != 0) goto L89
            goto L8a
        L89:
            r0 = r1
        L8a:
            r6.f288333u = r0
            r6.f288334v = r9
            r6.f288336x = r8
            java.util.List r0 = r6.f288337y
            r1 = r0
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.clear()
            int r1 = r8.length
        L99:
            if (r9 >= r1) goto Laa
            r2 = r8[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = r0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r2)
            int r9 = r9 + 1
            goto L99
        Laa:
            java.util.List r8 = r6.f288333u
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8}
            java.lang.String r8 = "MicroMsg.MultiSearchContactAdapter"
            java.lang.String r9 = "doSearch: queryString:%s, queryWords:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r9, r7)
            r6.w()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2690x38b72420.i6.s(java.lang.String, int[], boolean):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public int t(java.lang.String str) {
        java.util.Map map = this.B;
        if (((java.util.HashMap) map).get(str) != null) {
            return ((java.lang.Integer) ((java.util.HashMap) map).get(str)).intValue() + this.C;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public boolean v() {
        return z();
    }

    public final boolean w() {
        java.util.List list = this.f288337y;
        if (((java.util.ArrayList) list).size() <= 0 || this.f288333u.size() <= 0) {
            if (this.f288334v >= this.f288333u.size() - 1) {
                return true;
            }
            this.f288334v++;
            ((java.util.ArrayList) list).clear();
            for (int i17 : this.f288336x) {
                ((java.util.ArrayList) list).add(java.lang.Integer.valueOf(i17));
            }
            w();
            return false;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        int intValue = ((java.lang.Integer) ((java.util.ArrayList) list).remove(0)).intValue();
        p13.u uVar = new p13.u();
        uVar.f432674c = (java.lang.String) this.f288333u.get(this.f288334v);
        uVar.f432678g = new int[]{intValue};
        uVar.f432681j = hashSet;
        uVar.f432684m = this.F;
        uVar.f432685n = this.E;
        if (intValue == 131075) {
            uVar.f432673b = 32;
            uVar.f432683l = r13.a.f450134d;
        } else {
            uVar.f432673b = 16;
            uVar.f432683l = r13.b.f450135d;
        }
        this.f288332t = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
        return false;
    }

    public java.lang.String x() {
        java.util.Map map = this.f288335w;
        for (java.lang.String str : ((java.util.HashMap) map).keySet()) {
            for (java.lang.String str2 : (java.lang.String[]) ((java.util.LinkedList) ((java.util.HashMap) map).get(str)).toArray(new java.lang.String[0])) {
                if (!this.f288329q.contains(str2)) {
                    ((java.util.LinkedList) ((java.util.HashMap) map).get(str)).remove(str2);
                }
            }
        }
        java.util.Iterator it = ((java.util.HashMap) map).keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str3 = (java.lang.String) it.next();
            if (((java.util.LinkedList) ((java.util.HashMap) map).get(str3)).size() == 0) {
                ((java.util.HashMap) map).remove(str3);
                break;
            }
        }
        java.lang.String str4 = "";
        for (java.lang.String str5 : this.f288333u) {
            if (!((java.util.HashMap) map).containsKey(str5)) {
                str4 = str4 + str5 + " ";
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && z()) {
            str4 = " ";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiSearchContactAdapter", "getRealSearchText %s", str4);
        return str4;
    }

    public final void y() {
        this.f288334v = 0;
        this.f288326n = new java.util.HashMap();
        this.f288328p = new java.util.HashMap();
        this.f288325m.clear();
        android.database.Cursor cursor = this.f288338z;
        if (cursor != null) {
            cursor.close();
            this.f288338z = null;
            this.A.clear();
            this.B.clear();
        }
        h();
        notifyDataSetChanged();
        if (this.f288332t != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f288332t);
            this.f288332t = null;
        }
        h();
    }

    public final boolean z() {
        java.util.List list = this.f288333u;
        return list != null && list.size() > 1;
    }
}
