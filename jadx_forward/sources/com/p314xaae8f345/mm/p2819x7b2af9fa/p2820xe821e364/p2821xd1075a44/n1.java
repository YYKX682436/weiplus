package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f296121a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f296122b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f296123c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f296124d;

    /* renamed from: e, reason: collision with root package name */
    public int f296125e;

    /* renamed from: f, reason: collision with root package name */
    public int f296126f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.m1 f296127g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 f296128h;

    public n1(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4) {
        this.f296128h = c22949xf1deaba4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f296121a = arrayList;
        this.f296122b = null;
        this.f296123c = new java.util.ArrayList();
        this.f296124d = java.util.Collections.unmodifiableList(arrayList);
        this.f296125e = 2;
        this.f296126f = 2;
    }

    public void a(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var, boolean z17) {
        int i17;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u0 m83594xf939df19;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.j(y1Var);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba42 = this.f296128h;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a2 a2Var = c22949xf1deaba42.M1;
        android.view.View view = y1Var.f296236d;
        if (a2Var != null) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.z1 z1Var = a2Var.f295985f;
            n3.l1.l(view, z1Var instanceof com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.z1 ? (n3.c) ((java.util.WeakHashMap) z1Var.f296262f).remove(view) : null);
        }
        if (z17) {
            c22949xf1deaba42.getClass();
            java.util.List list = c22949xf1deaba42.f295947u;
            if (((java.util.ArrayList) list).size() > 0) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((java.util.ArrayList) list).get(0));
                throw null;
            }
            if (c22949xf1deaba42.f295945s != null) {
                mf3.r rVar = (mf3.r) y1Var;
                if (rVar.f296254y == null || (c22949xf1deaba4 = rVar.f296253x) == null || (m83594xf939df19 = c22949xf1deaba4.m83594xf939df19()) == null || (i17 = rVar.f296253x.I(rVar)) == -1 || rVar.f296254y != m83594xf939df19) {
                    i17 = -1;
                }
                if (i17 != -1) {
                    rVar.mo129548x408b7293();
                }
            }
            if (c22949xf1deaba42.F1 != null) {
                c22949xf1deaba42.f295937m.d(y1Var);
            }
            if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Z1) {
                java.util.Objects.toString(y1Var);
            }
        }
        y1Var.f296254y = null;
        y1Var.f296253x = null;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.m1 b17 = b();
        b17.getClass();
        int i18 = y1Var.f296241i;
        java.util.ArrayList arrayList = b17.a(i18).f296101a;
        if (((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.l1) b17.f296113a.get(i18)).f296102b <= arrayList.size()) {
            s3.a.a(view);
        } else {
            if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Y1 && arrayList.contains(y1Var)) {
                throw new java.lang.IllegalArgumentException("this scrap item already exists");
            }
            y1Var.w();
            arrayList.add(y1Var);
        }
    }

    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.m1 b() {
        if (this.f296127g == null) {
            this.f296127g = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.m1();
            c();
        }
        return this.f296127g;
    }

    public final void c() {
        if (this.f296127g != null) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296128h;
            if (c22949xf1deaba4.f295945s == null || !c22949xf1deaba4.isAttachedToWindow()) {
                return;
            }
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.m1 m1Var = this.f296127g;
            m1Var.f296115c.add(c22949xf1deaba4.f295945s);
        }
    }

    public final void d(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u0 u0Var, boolean z17) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.m1 m1Var = this.f296127g;
        if (m1Var == null) {
            return;
        }
        java.util.Set set = m1Var.f296115c;
        set.remove(u0Var);
        if (set.size() != 0 || z17) {
            return;
        }
        int i17 = 0;
        while (true) {
            android.util.SparseArray sparseArray = m1Var.f296113a;
            if (i17 >= sparseArray.size()) {
                return;
            }
            java.util.ArrayList arrayList = ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.l1) sparseArray.get(sparseArray.keyAt(i17))).f296101a;
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                s3.a.a(((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1) arrayList.get(i18)).f296236d);
            }
            i17++;
        }
    }

    public void e() {
        java.util.ArrayList arrayList = this.f296123c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.f295925e2) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.x xVar = this.f296128h.E1;
            int[] iArr = xVar.f296221c;
            if (iArr != null) {
                java.util.Arrays.fill(iArr, -1);
            }
            xVar.f296222d = 0;
        }
    }

    public void f(int i17) {
        boolean z17 = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Y1;
        java.util.ArrayList arrayList = this.f296123c;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1) arrayList.get(i17);
        if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Z1) {
            java.util.Objects.toString(y1Var);
        }
        a(y1Var, true);
        arrayList.remove(i17);
    }

    public void g(android.view.View view) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 K = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(view);
        boolean s17 = K.s();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296128h;
        if (s17) {
            c22949xf1deaba4.removeDetachedView(view, false);
        }
        if (K.r()) {
            K.f296249t.k(K);
        } else {
            int i17 = K.f296245p;
            if ((i17 & 32) != 0) {
                K.f296245p = i17 & (-33);
            }
        }
        h(K);
        if (c22949xf1deaba4.S == null || K.k()) {
            return;
        }
        c22949xf1deaba4.S.d(K);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a1, code lost:
    
        if (r7 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a5, code lost:
    
        if (r5 < 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a7, code lost:
    
        r7 = ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1) r6.get(r5)).f296238f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
    
        if (r8.f296221c == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r9 = r8.f296222d * 2;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
    
        if (r10 >= r9) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00be, code lost:
    
        if (r8.f296221c[r10] != r7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c2, code lost:
    
        r10 = r10 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c0, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c6, code lost:
    
        if (r7 != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c8, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c5, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 r13) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1.h(com.tencent.mm.xcompat.recyclerview.widget.y1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(android.view.View r6) {
        /*
            r5 = this;
            com.tencent.mm.xcompat.recyclerview.widget.y1 r6 = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(r6)
            int r0 = r6.f296245p
            r1 = 12
            r1 = r1 & r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Lf
            r1 = r2
            goto L10
        Lf:
            r1 = r3
        L10:
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView r4 = r5.f296128h
            if (r1 != 0) goto L5f
            r0 = r0 & 2
            if (r0 == 0) goto L1a
            r0 = r2
            goto L1b
        L1a:
            r0 = r3
        L1b:
            if (r0 == 0) goto L5f
            com.tencent.mm.xcompat.recyclerview.widget.b1 r0 = r4.S
            if (r0 == 0) goto L46
            java.util.List r1 = r6.f()
            com.tencent.mm.xcompat.recyclerview.widget.q r0 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.q) r0
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L40
            boolean r0 = r0.f296000g
            if (r0 == 0) goto L3a
            boolean r0 = r6.j()
            if (r0 == 0) goto L38
            goto L3a
        L38:
            r0 = r3
            goto L3b
        L3a:
            r0 = r2
        L3b:
            if (r0 == 0) goto L3e
            goto L40
        L3e:
            r0 = r3
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 == 0) goto L44
            goto L46
        L44:
            r0 = r3
            goto L47
        L46:
            r0 = r2
        L47:
            if (r0 == 0) goto L4a
            goto L5f
        L4a:
            java.util.ArrayList r0 = r5.f296122b
            if (r0 != 0) goto L55
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f296122b = r0
        L55:
            r6.f296249t = r5
            r6.f296250u = r2
            java.util.ArrayList r0 = r5.f296122b
            r0.add(r6)
            goto L92
        L5f:
            boolean r0 = r6.j()
            if (r0 == 0) goto L89
            boolean r0 = r6.m()
            if (r0 == 0) goto L6c
            goto L89
        L6c:
            com.tencent.mm.xcompat.recyclerview.widget.u0 r6 = r4.f295945s
            r6.getClass()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
            r0.<init>(r1)
            java.lang.String r1 = r4.B()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L89:
            r6.f296249t = r5
            r6.f296250u = r3
            java.util.ArrayList r0 = r5.f296121a
            r0.add(r6)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1.i(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x03f9, code lost:
    
        if (r10.j() == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x044a, code lost:
    
        if ((r11 == 0 || r11 + r8 < r26) == false) goto L253;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x065b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 j(int r24, boolean r25, long r26) {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1.j(int, boolean, long):com.tencent.mm.xcompat.recyclerview.widget.y1");
    }

    public void k(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var) {
        if (y1Var.f296250u) {
            this.f296122b.remove(y1Var);
        } else {
            this.f296121a.remove(y1Var);
        }
        y1Var.f296249t = null;
        y1Var.f296250u = false;
        y1Var.f296245p &= -33;
    }

    public void l() {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 g1Var = this.f296128h.f295946t;
        this.f296126f = this.f296125e + (g1Var != null ? g1Var.f296061h : 0);
        java.util.ArrayList arrayList = this.f296123c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f296126f; size--) {
            f(size);
        }
    }
}
