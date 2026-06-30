package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class r3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f190418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pq5.g f190419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fp0.r f190420c;

    public r3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, pq5.g gVar, fp0.r rVar) {
        this.f190418a = a7Var;
        this.f190419b = gVar;
        this.f190420c = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        java.lang.String b17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p944x882e457a.i iVar = fVar2.f152153f;
        db2.j4 j4Var = iVar instanceof db2.j4 ? (db2.j4) iVar : null;
        java.lang.Long valueOf = j4Var != null ? java.lang.Long.valueOf(j4Var.f309558t) : null;
        r45.vg7 vg7Var = j4Var != null ? j4Var.f309562x : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209504ud).mo141623x754a37bb()).r()).booleanValue() && valueOf != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f190418a.f187745i;
            if (c14994x9b99c079 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            if (valueOf.longValue() != c14994x9b99c079.m59251x5db1b11()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.DrawerPresenter", "loadMore skip feedId not match");
                this.f190419b.j(true);
                this.f190420c.b(fp0.u.f346823f);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m2(false, null);
            }
        }
        if (this.f190418a.G() && vg7Var != this.f190418a.j0()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMore skip sortType not match, reqSortType = ");
            sb6.append(vg7Var != null ? java.lang.Integer.valueOf(vg7Var.f469761d) : null);
            sb6.append(", sortType = ");
            sb6.append(this.f190418a.j0().f469761d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.DrawerPresenter", sb6.toString());
            this.f190419b.j(true);
            this.f190420c.b(fp0.u.f346823f);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m2(false, null);
        }
        if (fVar2.f152148a != 0 || fVar2.f152149b != 0 || (fVar = fVar2.f152151d) == null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m2(false, new java.util.ArrayList());
        }
        this.f190418a.D0(((r45.j51) fVar).m75939xb282bd08(5) == 1);
        this.f190418a.f187755s = ((r45.j51) fVar2.f152151d).m75934xbce7f2f(3);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("loadMoreData after lastBuffer ");
        if (this.f190418a.f187755s == null) {
            b17 = "null";
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f190418a.f187755s;
            b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(gVar != null ? gVar.g() : null);
        }
        sb7.append(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", sb7.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f190418a;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> m75941xfb821914 = ((r45.j51) fVar2.f152151d).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCommentInfo(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 : m75941xfb821914) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19781xd1c47b87);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = a7Var.f187745i;
            if (c14994x9b99c0792 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            long m59251x5db1b11 = c14994x9b99c0792.m59251x5db1b11();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0793 = a7Var.f187745i;
            if (c14994x9b99c0793 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            java.lang.String m59229xb5af1dd5 = c14994x9b99c0793.m59229xb5af1dd5();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0();
            yj0Var.f68959xf9a02e3e = m59251x5db1b11;
            yj0Var.f68957xec748fc6 = m59229xb5af1dd5;
            yj0Var.f68965x29d3a50c = 2;
            yj0Var.f68953x27838069.set(1, c19781xd1c47b87);
            yj0Var.n1(0L);
            arrayList2.add(new so2.y0(yj0Var));
        }
        arrayList.addAll(arrayList2);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m2(true, this.f190418a.Q(arrayList, true));
    }
}
