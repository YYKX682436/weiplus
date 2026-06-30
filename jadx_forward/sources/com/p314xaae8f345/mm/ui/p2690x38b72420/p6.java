package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class p6 extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 implements l75.z0 {
    public int A;
    public int B;
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o6 C;
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.e1 D;
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1 E;
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u0 F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f288615J;
    public final android.content.Context K;

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f288616n;

    /* renamed from: o, reason: collision with root package name */
    public android.database.Cursor f288617o;

    /* renamed from: p, reason: collision with root package name */
    public android.database.Cursor f288618p;

    /* renamed from: q, reason: collision with root package name */
    public int f288619q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f288620r;

    /* renamed from: s, reason: collision with root package name */
    public final int f288621s;

    /* renamed from: t, reason: collision with root package name */
    public final int f288622t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f288623u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Map f288624v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Map f288625w;

    /* renamed from: x, reason: collision with root package name */
    public int f288626x;

    /* renamed from: y, reason: collision with root package name */
    public int f288627y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f288628z;

    public p6(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, boolean z17, boolean z18, boolean z19, int i17) {
        super(abstractActivityC22312xbd689c47, list, z17, z18);
        this.f288619q = -1;
        this.f288621s = 0;
        this.f288622t = 1;
        this.f288623u = false;
        this.f288624v = new java.util.HashMap();
        this.f288625w = new java.util.HashMap();
        this.f288626x = 0;
        this.f288627y = 0;
        this.f288628z = "";
        this.A = 0;
        this.B = 0;
        new java.util.ArrayList();
        this.G = false;
        this.H = false;
        this.I = false;
        this.f288615J = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRecentConversationAdapter", "create!");
        this.f288620r = z19;
        this.f288621s = i17;
        this.K = abstractActivityC22312xbd689c47;
        s();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        s();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f288618p != null) {
            return this.B != 0 ? this.A + 1 + 1 : this.A + 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewRecentConversationAdapter", "getCount: dataCursor == null ");
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4, android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        if (this.B == 0 || i17 >= this.f288619q) {
            return super.getItemViewType(i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRecentConversationAdapter", "getItemViewType:  return HORIZONTAL_RECENT_FORWARD_LIST Type");
        return 9;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        int i18;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u0 u0Var;
        int i19 = this.f288619q;
        int i27 = this.B;
        if (i27 != 0 && i17 == 0) {
            return v(i17);
        }
        if (i17 == i19) {
            return u(i17);
        }
        if (i17 < 0) {
            return null;
        }
        if (this.f288622t == 1) {
            i18 = i27 != 0 ? i17 - 2 : i17 - 1;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewRecentConversationAdapter", "Actually dead branch. position=%d", java.lang.Integer.valueOf(i17));
            i18 = i17;
        }
        if (!this.f288618p.moveToPosition(i18)) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.k0 k0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.k0(4, i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewRecentConversationAdapter", "wrong case: %s, %s", java.lang.Boolean.valueOf(this.f288618p.isClosed()), java.lang.Integer.valueOf(i18));
            return k0Var;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c0 c0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c0(i17);
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
        l4Var.mo9015xbf5d97fd(this.f288618p);
        gm0.j1.i();
        c0Var.f(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(l4Var.h1()));
        if (c0Var.B == null) {
            gm0.j1.i();
            c0Var.f(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(l4Var.h1()));
        }
        c0Var.f288369e = this.f288611f;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(l4Var.h1())) {
            c0Var.f288377m = true;
            if (i17 == this.f288619q + 1 && (u0Var = this.F) != null) {
                this.G = true;
                u0Var.h(com.p314xaae8f345.mm.R.C30861xcebc809e.agd);
            }
        }
        if (i17 == this.f288619q - 1) {
            c0Var.f288376l = true;
        }
        java.lang.String str = c0Var.f288383s;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(str)) {
            this.f288626x++;
        }
        ((java.util.HashMap) this.f288624v).put(str, java.lang.Integer.valueOf(i17 - this.f288619q));
        return c0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRecentConversationAdapter", "finish!");
        t();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().e(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public boolean n(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1 q1Var = this.E;
        if (q1Var != null && i17 != q1Var.f288366b && q1Var != null) {
            q1Var.i(false);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void q(boolean z17) {
        super.q(z17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        android.database.Cursor cursor;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRecentConversationAdapter", "resetData");
        t();
        new java.util.ArrayList();
        this.B = 0;
        int i17 = this.f288621s;
        java.util.List list = null;
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(i17, 4)) {
            if (!this.I) {
                list = com.p314xaae8f345.mm.ui.p2690x38b72420.k3.c();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                    java.util.List list2 = this.f288121m;
                    l75.e0 e0Var = pp.a.f438897e2;
                    this.f288617o = Di.t(list, 3, list2, null, this.f288120i, "");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRecentConversationAdapter", "resetData: recent forward control switch on");
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list3 = this.f288121m;
            l75.e0 e0Var2 = pp.a.f438897e2;
            this.f288616n = Di2.C(3, list3, null, this.f288120i, "");
        } else if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(i17, 16)) {
            if (!this.I) {
                list = com.p314xaae8f345.mm.ui.p2690x38b72420.k3.b();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                    java.util.List list4 = this.f288121m;
                    l75.e0 e0Var3 = pp.a.f438897e2;
                    this.f288617o = Di3.t(list, 5, list4, null, this.f288120i, "");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRecentConversationAdapter", "resetData: recent forward control switch on");
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list5 = this.f288121m;
            l75.e0 e0Var4 = pp.a.f438897e2;
            this.f288616n = Di4.C(5, list5, null, this.f288120i, "");
        } else {
            if (!this.I) {
                list = com.p314xaae8f345.mm.ui.p2690x38b72420.k3.d();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                    java.util.List list6 = this.f288121m;
                    l75.e0 e0Var5 = pp.a.f438897e2;
                    this.f288617o = Di5.t(list, 1, list6, null, this.f288120i, "");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRecentConversationAdapter", "resetData: recent forward control switch on");
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list7 = this.f288121m;
            l75.e0 e0Var6 = pp.a.f438897e2;
            this.f288616n = Di6.C(1, list7, null, this.f288120i, "");
        }
        int i18 = this.f288620r ? 2 : 0;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list) && (cursor = this.f288617o) != null) {
            this.B = cursor.getCount();
        }
        int count = this.f288616n.getCount();
        this.A = count;
        if (count <= 0) {
            this.f288619q = this.f288609d.O3().getHeaderViewsCount();
        } else if (this.B == 0) {
            this.f288619q = 0 + i18;
        } else {
            this.f288619q = 0 + i18 + 1;
        }
        this.f288618p = this.f288616n;
        h();
    }

    public void t() {
        android.database.Cursor cursor = this.f288616n;
        if (cursor != null) {
            cursor.close();
            this.f288616n = null;
        }
        android.database.Cursor cursor2 = this.f288617o;
        if (cursor2 != null) {
            cursor2.close();
            this.f288617o = null;
        }
        android.database.Cursor cursor3 = this.f288618p;
        if (cursor3 != null) {
            cursor3.close();
            this.f288618p = null;
        }
    }

    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u0 u(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRecentConversationAdapter", "createHeaderViewDataItem: isSupportForwardToWeWork:%s", java.lang.Boolean.valueOf(this.H));
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u0 u0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u0(i17);
        u0Var.I = this.H;
        u0Var.H = this.f288615J;
        u0Var.C = new com.p314xaae8f345.mm.ui.p2690x38b72420.k6(this);
        this.F = u0Var;
        return u0Var;
    }

    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1 v(int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1 q1Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1(i17);
        this.E = q1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursor = this.f288617o;
        if (cursor != null && cursor.getCount() > 0) {
            int i18 = 1;
            while (this.f288617o.moveToNext()) {
                android.database.Cursor cursor2 = this.f288617o;
                java.lang.String contactUserName = cursor2.getString(cursor2.getColumnIndex(dm.i4.f66875xa013b0d5));
                gm0.j1.i();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(contactUserName);
                if (L == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRecentConversationAdapter", "parse: contact == null");
                    gm0.j1.i();
                    L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(contactUserName);
                }
                java.lang.String displayNickName = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(L);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contactUserName, "contactUserName");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayNickName, "displayNickName");
                com.p314xaae8f345.mm.ui.p2690x38b72420.v8 v8Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.v8(new com.p314xaae8f345.mm.ui.p2690x38b72420.w8(contactUserName, displayNickName, false, false, false, 28, null));
                arrayList.add(v8Var);
                this.f288625w.put(v8Var.f288753d.f288764a, java.lang.Integer.valueOf(i18));
                i18++;
            }
        }
        q1Var.C = arrayList;
        com.p314xaae8f345.mm.ui.p2690x38b72420.v8 v8Var2 = new com.p314xaae8f345.mm.ui.p2690x38b72420.v8(new com.p314xaae8f345.mm.ui.p2690x38b72420.w8("", "", false, false, false, 28, null));
        v8Var2.f288754e = 1;
        arrayList.add(v8Var2);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1 q1Var2 = this.E;
        q1Var2.f288369e = this.f288611f;
        com.p314xaae8f345.mm.ui.p2690x38b72420.m6 m6Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.m6(this);
        q1Var2.getClass();
        q1Var2.D = m6Var;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1 q1Var3 = this.E;
        com.p314xaae8f345.mm.ui.p2690x38b72420.n6 n6Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.n6(this);
        q1Var3.getClass();
        q1Var3.E = n6Var;
        this.E.getClass();
        this.f288623u = true;
        return this.E;
    }

    public void w(java.util.List list) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1 q1Var = this.E;
        if (q1Var != null) {
            java.util.ArrayList<com.p314xaae8f345.mm.ui.p2690x38b72420.v8> arrayList = q1Var.C;
            if (arrayList != null) {
                for (com.p314xaae8f345.mm.ui.p2690x38b72420.v8 v8Var : arrayList) {
                    v8Var.f288753d.f288766c = false;
                    if (list != null) {
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            java.lang.String str = (java.lang.String) it.next();
                            com.p314xaae8f345.mm.ui.p2690x38b72420.w8 w8Var = v8Var.f288753d;
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(w8Var.f288764a, str)) {
                                w8Var.f288766c = true;
                            }
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = q1Var.G;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8146xced61ae5();
            }
        }
    }
}
