package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes10.dex */
public class j7 extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f288495n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f288496o;

    /* renamed from: p, reason: collision with root package name */
    public final android.util.SparseArray f288497p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f288498q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f288499r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 f288500s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 activityC22321x6fa86dd0, com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var) {
        super(l4Var, k35.c.a(), true, false);
        this.f288500s = activityC22321x6fa86dd0;
        this.f288496o = new java.util.HashMap();
        this.f288497p = new android.util.SparseArray();
        this.f288498q = "";
        this.f288499r = new java.util.LinkedList();
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int count = this.f288495n.getCount();
        android.util.SparseArray sparseArray = this.f288497p;
        return count + (sparseArray == null ? 0 : sparseArray.size()) + 1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        if (i17 == 0) {
            java.lang.String string = this.f288500s.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571416ee);
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
            n0Var.f288436y = string;
            return n0Var;
        }
        android.util.SparseArray sparseArray = this.f288497p;
        if (sparseArray.indexOfKey(i17) >= 0) {
            java.lang.String str = (java.lang.String) sparseArray.get(i17);
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var2 = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
            n0Var2.f288436y = str;
            return n0Var2;
        }
        int i18 = i17;
        int i19 = 1;
        while (i19 <= sparseArray.size()) {
            if (sparseArray.indexOfKey(i18) >= 0) {
                i19++;
            }
            i18--;
            if (i18 < 0) {
                break;
            }
        }
        int i27 = i17 - i19;
        if (!this.f288495n.moveToPosition(i27)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlyChatContactMgrUI", "create contact item error: position=%d | index=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27));
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        z3Var.mo9015xbf5d97fd(this.f288495n);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlyChatContactMgrUI", "finish!");
        android.database.Cursor cursor = this.f288495n;
        if (cursor != null) {
            cursor.close();
            this.f288495n = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public int r(java.lang.String str) {
        java.util.HashMap hashMap = this.f288496o;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return -1;
        }
        return ((java.lang.Integer) hashMap.get(str)).intValue() + this.f288609d.O3().getHeaderViewsCount();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        android.database.Cursor cursor = this.f288495n;
        if (cursor != null) {
            cursor.close();
            this.f288495n = null;
        }
        java.util.HashMap hashMap = this.f288496o;
        hashMap.clear();
        android.util.SparseArray sparseArray = this.f288497p;
        sparseArray.clear();
        gm0.j1.i();
        this.f288495n = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U(null, this.f288498q, "@social.black.android", "", this.f288121m);
        java.lang.String str = this.f288498q;
        java.util.List list = this.f288121m;
        java.lang.String[] y17 = c01.e2.y(null, "@social.black.android", "", str, list);
        int[] w17 = c01.e2.w(null, "@social.black.android", "", list, this.f288498q);
        if (y17 != null && w17 != null) {
            int i17 = 1;
            for (int i18 = 0; i18 < y17.length; i18++) {
                if (i18 < w17.length) {
                    hashMap.put(y17[i18], java.lang.Integer.valueOf(w17[i18] + i17));
                    sparseArray.put(w17[i18] + i17, y17[i18]);
                    i17++;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlyChatContactMgrUI", "datacount:%d headerPosMap=%s", java.lang.Integer.valueOf(this.f288495n.getCount()), hashMap.toString());
        h();
        notifyDataSetChanged();
    }

    public int t() {
        android.database.Cursor cursor = this.f288495n;
        if (cursor != null) {
            return cursor.getCount();
        }
        return 0;
    }
}
