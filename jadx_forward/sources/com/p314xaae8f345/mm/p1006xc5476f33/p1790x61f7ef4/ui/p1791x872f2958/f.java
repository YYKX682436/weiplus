package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958;

/* loaded from: classes.dex */
public final class f extends ym3.a implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f224891d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f224892e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashSet f224893f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b f224894g;

    /* renamed from: h, reason: collision with root package name */
    public o13.x f224895h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f224896i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f224897m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f224898n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f224899o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f224900p;

    public f(java.lang.String query, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f224891d = "";
        this.f224891d = query;
        this.f224892e = handler;
        this.f224893f = new java.util.HashSet();
        java.lang.Object l17 = gm0.j1.u().c().l(2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.String");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f224896i = (java.lang.String) l17;
        this.f224897m = new java.util.ArrayList();
        this.f224898n = new java.util.ArrayList();
        this.f224899o = new java.util.ArrayList();
        this.f224900p = new java.util.ArrayList();
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.ContactDataSource", "ftsResult = " + vVar);
        if (vVar == null) {
            return;
        }
        java.util.ArrayList arrayList = this.f224897m;
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = this.f224899o;
        arrayList4.clear();
        java.util.ArrayList arrayList5 = this.f224898n;
        arrayList5.clear();
        java.util.ArrayList arrayList6 = this.f224900p;
        arrayList6.clear();
        java.util.List list = vVar.f432693e;
        if (list != null && list.size() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b c16173x548f83b = this.f224894g;
            if (c16173x548f83b != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.w(c16173x548f83b, arrayList, false, 2, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b c16173x548f83b2 = this.f224894g;
            if (c16173x548f83b2 != null) {
                c16173x548f83b2.A = arrayList2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b c16173x548f83b3 = this.f224894g;
            if (c16173x548f83b3 != null) {
                c16173x548f83b3.B = arrayList3;
            }
            o13.x xVar = this.f224895h;
            if (xVar != null) {
                xVar.X2(vVar);
                return;
            }
            return;
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        int i17 = 0;
        for (p13.y yVar : vVar.f432693e) {
            arrayList7.add(yVar.f432720e);
            arrayList8.add(yVar.f432720e);
            hashMap.put(yVar.f432720e, yVar);
            if (arrayList7.size() > 300) {
                java.util.HashMap hashMap2 = hashMap;
                i17 = e(arrayList7, arrayList2, vVar, i17, arrayList3, hashMap2);
                arrayList8 = arrayList8;
                hashMap = hashMap2;
                arrayList7 = arrayList7;
            }
        }
        java.util.ArrayList arrayList9 = arrayList8;
        java.util.HashMap hashMap3 = hashMap;
        java.util.ArrayList arrayList10 = arrayList7;
        if (arrayList10.size() > 0) {
            e(arrayList10, arrayList2, vVar, i17, arrayList3, hashMap3);
        }
        arrayList5.addAll(arrayList9);
        java.util.Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!arrayList4.contains(str)) {
                arrayList6.add(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true).f2());
                if (arrayList6.size() >= 2) {
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b c16173x548f83b4 = this.f224894g;
        if (c16173x548f83b4 != null) {
            c16173x548f83b4.A = arrayList2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b c16173x548f83b5 = this.f224894g;
        if (c16173x548f83b5 != null) {
            c16173x548f83b5.B = arrayList3;
        }
        o13.x xVar2 = this.f224895h;
        if (xVar2 != null) {
            xVar2.X2(vVar);
        }
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f224897m;
        int size = arrayList.size();
        int i17 = request.f544677b;
        if (i17 < size) {
            int size2 = arrayList.size();
            int i18 = request.f544678c + i17;
            if (size2 > i18) {
                dVar.f544681b = true;
            } else {
                i18 = arrayList.size();
            }
            while (i17 < i18) {
                dVar.f544682c.add(arrayList.get(i17));
                i17++;
            }
        }
        k0Var.e(dVar);
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.r(k0Var);
    }

    public final void d(java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(query)) {
            return;
        }
        java.util.HashSet hashSet = this.f224893f;
        if (hashSet != null) {
            hashSet.add(this.f224896i);
        }
        p13.u uVar = new p13.u();
        uVar.f432674c = query;
        uVar.f432678g = new int[]{131072, 131081};
        uVar.f432683l = r13.b.f450135d;
        uVar.f432681j = this.f224893f;
        uVar.f432684m = this;
        uVar.f432685n = this.f224892e;
        uVar.f432673b = 16;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r7.contains(r4.d1()) == true) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(java.util.ArrayList r10, java.util.List r11, p13.v r12, int r13, java.util.ArrayList r14, java.util.HashMap r15) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            c01.f r1 = c01.d9.b()
            com.tencent.mm.storage.e8 r1 = r1.q()
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.Object[] r3 = r10.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.tencent.mm.storage.k4 r1 = (com.p314xaae8f345.mm.p2621x8fb0427b.k4) r1
            java.lang.String r5 = "@all.contact.android"
            r6 = 0
            android.database.Cursor r1 = r1.W(r3, r5, r6, r4)
            java.util.ArrayList r3 = r9.f224897m
            if (r1 == 0) goto L9a
            int r4 = r1.getCount()
            if (r4 <= 0) goto L9a
        L2e:
            boolean r4 = r1.moveToNext()
            if (r4 == 0) goto L97
            com.tencent.mm.storage.z3 r4 = new com.tencent.mm.storage.z3
            r4.<init>()
            r4.mo9015xbf5d97fd(r1)
            com.tencent.mm.plugin.label.ui.searchContact.d r5 = new com.tencent.mm.plugin.label.ui.searchContact.d
            r5.<init>(r13)
            r5.f224887m = r4
            java.lang.String r7 = r4.d1()
            java.lang.Object r7 = r15.get(r7)
            p13.y r7 = (p13.y) r7
            r5.f224882e = r7
            java.lang.String r7 = r9.f224891d
            r5.f224888n = r7
            if (r12 == 0) goto L58
            p13.r r7 = r12.f432692d
            goto L59
        L58:
            r7 = r6
        L59:
            r5.f224889o = r7
            com.tencent.mm.storage.z3 r7 = r5.f224887m
            if (r7 == 0) goto L62
            r0.add(r7)
        L62:
            r3.add(r5)
            com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList r7 = r9.f224894g
            if (r7 == 0) goto L79
            java.util.List r7 = r7.A
            if (r7 == 0) goto L79
            java.lang.String r8 = r4.d1()
            boolean r7 = r7.contains(r8)
            r8 = 1
            if (r7 != r8) goto L79
            goto L7a
        L79:
            r8 = r2
        L7a:
            if (r8 == 0) goto L8b
            java.lang.String r7 = r4.d1()
            java.lang.String r8 = "getUsername(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r8)
            r11.add(r7)
            r14.add(r5)
        L8b:
            int r13 = r13 + 1
            java.util.ArrayList r5 = r9.f224899o
            java.lang.String r4 = r4.d1()
            r5.add(r4)
            goto L2e
        L97:
            r1.close()
        L9a:
            com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList r11 = r9.f224894g
            if (r11 == 0) goto La2
            r12 = 2
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.w(r11, r3, r2, r12, r6)
        La2:
            r10.clear()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.f.e(java.util.ArrayList, java.util.List, p13.v, int, java.util.ArrayList, java.util.HashMap):int");
    }

    @Override // ym3.f
    /* renamed from: getPriority */
    public int mo57139x3662b71a() {
        return 1;
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        this.f224897m.clear();
        d(this.f224891d);
    }
}
