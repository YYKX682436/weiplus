package uf5;

/* loaded from: classes10.dex */
public abstract class w0 extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f508847n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f508848o;

    /* renamed from: p, reason: collision with root package name */
    public final android.util.SparseArray f508849p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f508850q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f508851r;

    public w0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d abstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var) {
        super(l4Var, k35.c.a(), true, false);
        new java.util.ArrayList();
        new java.util.ArrayList();
        this.f508848o = new java.util.HashMap();
        this.f508849p = new android.util.SparseArray();
        this.f508850q = "";
        this.f508851r = new java.util.LinkedList();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        android.database.Cursor cursor = this.f508847n;
        int count = cursor == null ? 0 : cursor.getCount();
        android.util.SparseArray sparseArray = this.f508849p;
        return count + (sparseArray != null ? sparseArray.size() : 0) + (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("") ? 1 : 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        if ((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("")) && i17 == 0) {
            return t(i17, "");
        }
        android.util.SparseArray sparseArray = this.f508849p;
        if (sparseArray.indexOfKey(i17) >= 0) {
            return t(i17, (java.lang.String) sparseArray.get(i17));
        }
        int i18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("") ? 1 : 0;
        int i19 = i17;
        while (i18 <= sparseArray.size()) {
            if (sparseArray.indexOfKey(i19) >= 0) {
                i18++;
            }
            i19--;
            if (i19 < 0) {
                break;
            }
        }
        int i27 = i17 - i18;
        if (!this.f508847n.moveToPosition(i27)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMgrUIBase", "create contact item error: position=%d | index=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27));
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        z3Var.mo9015xbf5d97fd(this.f508847n);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u(i17);
        uVar.f(z3Var);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var.d1())) {
            uVar.f288369e = false;
            uVar.f288372h = false;
            uVar.f288371g = false;
            uVar.F = true;
        } else {
            uVar.f288369e = this.f288611f;
            uVar.f288372h = this.f288612g;
            uVar.F = false;
        }
        return uVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMgrUIBase", "finish!");
        android.database.Cursor cursor = this.f508847n;
        if (cursor != null) {
            cursor.close();
            this.f508847n = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public int r(java.lang.String str) {
        java.util.HashMap hashMap = this.f508848o;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return -1;
        }
        return ((java.lang.Integer) hashMap.get(str)).intValue() + this.f288609d.O3().getHeaderViewsCount();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        android.database.Cursor cursor = this.f508847n;
        if (cursor != null) {
            cursor.close();
            this.f508847n = null;
        }
        java.util.HashMap hashMap = this.f508848o;
        hashMap.clear();
        android.util.SparseArray sparseArray = this.f508849p;
        sparseArray.clear();
        gm0.j1.i();
        this.f508847n = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U(null, this.f508850q, v(), "", this.f288121m);
        java.lang.String v17 = v();
        java.lang.String str = this.f508850q;
        java.util.List list = this.f288121m;
        java.lang.String[] y17 = c01.e2.y(null, v17, "", str, list);
        int[] w17 = c01.e2.w(null, v(), "", list, this.f508850q);
        if (y17 != null && w17 != null) {
            int i17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("") ? 1 : 0;
            for (int i18 = 0; i18 < y17.length; i18++) {
                if (i18 < w17.length) {
                    hashMap.put(y17[i18], java.lang.Integer.valueOf(w17[i18] + i17));
                    sparseArray.put(w17[i18] + i17, y17[i18]);
                    i17++;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMgrUIBase", "datacount:%d headerPosMap=%s, getdat: %s, this.query: %s.", java.lang.Integer.valueOf(this.f508847n.getCount()), hashMap.toString(), v(), this.f508850q);
        h();
        notifyDataSetChanged();
    }

    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d t(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
        n0Var.f288436y = str;
        return n0Var;
    }

    public int u() {
        android.database.Cursor cursor = this.f508847n;
        if (cursor != null) {
            return cursor.getCount();
        }
        return 0;
    }

    public abstract java.lang.String v();
}
