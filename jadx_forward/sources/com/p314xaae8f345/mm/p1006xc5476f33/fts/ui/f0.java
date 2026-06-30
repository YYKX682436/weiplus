package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public abstract class f0 extends android.widget.BaseAdapter implements android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 f219580d;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.SparseArray f219582f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219583g;

    /* renamed from: h, reason: collision with root package name */
    public long f219584h;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d0 f219587n;

    /* renamed from: o, reason: collision with root package name */
    public int f219588o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.e0 f219589p;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f219581e = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public boolean f219585i = false;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j3 f219586m = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j3();

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseAdapter", "Create FTSBaseAdapter");
        this.f219580d = w0Var;
        this.f219582f = new android.util.SparseArray();
        ((s50.m0) ((u50.x) i95.n0.c(u50.x.class))).x1();
    }

    public void c() {
        this.f219582f.clear();
    }

    public abstract u13.g d(int i17);

    public abstract void f();

    public void g() {
        p();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f219581e.keySet());
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        Di.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(1024);
        sb6.append("select unReadCount, status, isSend, conversationTime, username, content, msgType,flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, editingQuoteMsgId, hasTodo, hbMarkRed, remitMarkRed, hasSpecialFollow, parentRef from rconversation where username in (");
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (i17 > 0) {
                sb6.append(',');
            }
            sb6.append('\'');
            sb6.append((java.lang.String) arrayList.get(i17));
            sb6.append('\'');
        }
        sb6.append(") and ");
        l75.e0 e0Var = pp.a.f438897e2;
        sb6.append("parentRef = 'hidden_conv_parent' ");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n("hidden_conv_parent");
        java.lang.String a17 = c01.e2.a(false, 1);
        if (a17 == null) {
            a17 = "";
        }
        sb6.append(a17);
        android.database.Cursor B = Di.f276650d.B(sb6.toString(), null);
        if (B != null) {
            while (B.moveToNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
                l4Var.mo9015xbf5d97fd(B);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21170, 1, l4Var.h1(), java.lang.Integer.valueOf(c01.h2.b(l4Var.h1())));
            }
            B.close();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f219586m.f219620d) {
            return this.f219588o;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        if (getItem(i17) != null) {
            return getItem(i17).f505291a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSBaseAdapter", "getItemViewType: get data item fail, return unknown Type, count=%d | position = %s", java.lang.Integer.valueOf(getCount()), java.lang.Integer.valueOf(i17));
        return -1;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        u13.g item = getItem(i17);
        if (view == null) {
            view = item.k().c(h(), viewGroup, view);
        }
        u13.e eVar = (u13.e) view.getTag();
        if (!item.f505293c) {
            item.a(h(), eVar, new java.lang.Object[0]);
            m(h(), item);
            item.f505293c = true;
        }
        item.k().b(h(), eVar, item, new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.e0 e0Var = this.f219589p;
        if (e0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q0 q0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.m0) e0Var).f219646a.G1;
            q0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.v2 v2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.v2();
            v2Var.f219734a = item instanceof e23.b1 ? 256 : 16386;
            q0Var.a(v2Var, item);
            q0Var.c(v2Var);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 25;
    }

    public android.content.Context h() {
        return this.f219580d.mo63597x76847179();
    }

    @Override // android.widget.Adapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public u13.g getItem(int i17) {
        android.util.SparseArray sparseArray = this.f219582f;
        if (sparseArray.indexOfKey(i17) >= 0) {
            return (u13.g) sparseArray.get(i17);
        }
        u13.g d17 = (i17 < 0 || i17 >= getCount()) ? null : d(i17);
        if (d17 == null) {
            return (u13.g) sparseArray.get(0);
        }
        sparseArray.put(i17, d17);
        return d17;
    }

    public abstract boolean k(android.view.View view, u13.g gVar, boolean z17);

    public void l(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j3 j3Var = this.f219586m;
        if (j3Var.f219620d) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d0 d0Var = this.f219587n;
            if (d0Var != null) {
                d0Var.R3(i17, z17);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d0 d0Var2 = j3Var.f219621e;
        if (d0Var2 != null) {
            ((k23.a1) d0Var2).R3(i17, z17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m(android.content.Context context, u13.g gVar) {
        boolean z17 = gVar instanceof e23.u1;
        java.util.HashMap hashMap = this.f219581e;
        if (z17) {
            hashMap.put(((e23.u1) gVar).f328374s, java.lang.Boolean.TRUE);
            return;
        }
        if (gVar instanceof e23.s1) {
            hashMap.put(((e23.s1) gVar).f328493s, java.lang.Boolean.TRUE);
            return;
        }
        if (gVar instanceof e23.p0) {
            hashMap.put(((e23.p0) gVar).f328460s, java.lang.Boolean.TRUE);
            return;
        }
        if (!(gVar instanceof e23.d0)) {
            if (gVar instanceof zq1.e0) {
                hashMap.put(((sr1.a0) ((zq1.e0) gVar)).f492982s, java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        int i17 = ((e23.d0) gVar).f328347v.f68145x818dc9ac;
        if (i17 == 23) {
            hashMap.put("qqmail", java.lang.Boolean.TRUE);
            return;
        }
        if (i17 == 27) {
            hashMap.put("masssendapp", java.lang.Boolean.TRUE);
            return;
        }
        if (i17 == 28) {
            hashMap.put("newsapp", java.lang.Boolean.TRUE);
            return;
        }
        if (i17 == 39) {
            hashMap.put("filehelper", java.lang.Boolean.TRUE);
            return;
        }
        if (i17 == 43) {
            hashMap.put("gh_43f2581f6fd6", java.lang.Boolean.TRUE);
            return;
        }
        if (i17 == 71) {
            hashMap.put("appbrand_notify_message", java.lang.Boolean.TRUE);
            return;
        }
        if (i17 == 69) {
            hashMap.put("appbrandcustomerservicemsg", java.lang.Boolean.TRUE);
            return;
        }
        if (i17 == 50 || i17 == 63 || i17 == 67) {
            hashMap.put("officialaccounts", java.lang.Boolean.TRUE);
            return;
        }
        if (i17 == 74) {
            hashMap.put("opencustomerservicemsg", java.lang.Boolean.TRUE);
        } else if (i17 == 78) {
            hashMap.put("gh_25d9ac85a4bc", java.lang.Boolean.TRUE);
        } else if (i17 == 97) {
            hashMap.put("schedule_message", java.lang.Boolean.TRUE);
        }
    }

    public void n(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseAdapter", "setCount %d", java.lang.Integer.valueOf(i17));
        this.f219588o = i17;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        if (this.f219586m.f219620d) {
            super.notifyDataSetChanged();
        }
    }

    public void o(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j3 j3Var) {
        if (j3Var == null) {
            j3Var = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j3.f219616f;
        }
        this.f219586m = j3Var;
        p();
        this.f219583g = str;
        this.f219584h = java.lang.System.currentTimeMillis();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.f219585i ? "voice" : "";
        objArr[1] = str;
        objArr[2] = j3Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseAdapter", "[fts] adapter.startSearch %s query=%s, config=%s", objArr);
        f();
        this.f219585i = false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var = this.f219580d;
        w0Var.m63624x36654fab();
        u13.g item = getItem(i17 - w0Var.mo63599xcc101dd9().getHeaderViewsCount());
        if (item != null) {
            w0Var.x6(view, item, k(view, item, item.k().d(h(), view, item, new java.lang.Object[0])));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    public void p() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseAdapter", "[fts] adapter.stopSearch query=%s", this.f219583g);
        this.f219588o = 0;
        this.f219583g = "";
        c();
        notifyDataSetChanged();
    }
}
