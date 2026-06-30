package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes10.dex */
public class sa extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f288711n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f288712o;

    /* renamed from: p, reason: collision with root package name */
    public final android.util.SparseArray f288713p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f288714q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f288715r;

    /* renamed from: s, reason: collision with root package name */
    public final int f288716s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22328xf8c1b478 f288717t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22328xf8c1b478 activityC22328xf8c1b478, com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var, int i17) {
        super(l4Var, k35.c.a(), true, false);
        this.f288717t = activityC22328xf8c1b478;
        this.f288712o = new java.util.HashMap();
        this.f288713p = new android.util.SparseArray();
        this.f288714q = "";
        this.f288715r = new java.util.LinkedList();
        this.f288716s = i17;
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        android.database.Cursor cursor = this.f288711n;
        if (cursor == null) {
            return 0;
        }
        int count = cursor.getCount();
        android.util.SparseArray sparseArray = this.f288713p;
        return count + (sparseArray != null ? sparseArray.size() : 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        android.util.SparseArray sparseArray = this.f288713p;
        if (sparseArray.indexOfKey(i17) >= 0) {
            java.lang.String str = (java.lang.String) sparseArray.get(i17);
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
            n0Var.f288436y = str;
            return n0Var;
        }
        int i18 = i17;
        int i19 = 0;
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
        if (!this.f288711n.moveToPosition(i27)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactsFromRangeUI", "create contact item error: position=%d | index=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27));
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        z3Var.mo9015xbf5d97fd(this.f288711n);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactsFromRangeUI", "finish!");
        android.database.Cursor cursor = this.f288711n;
        if (cursor != null) {
            cursor.close();
            this.f288711n = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public int r(java.lang.String str) {
        java.util.HashMap hashMap = this.f288712o;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return -1;
        }
        return ((java.lang.Integer) hashMap.get(str)).intValue() + this.f288609d.O3().getHeaderViewsCount();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        java.lang.String[] strArr;
        android.database.Cursor cursor = this.f288711n;
        if (cursor != null) {
            cursor.close();
            this.f288711n = null;
        }
        java.util.HashMap hashMap = this.f288712o;
        hashMap.clear();
        android.util.SparseArray sparseArray = this.f288713p;
        sparseArray.clear();
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22328xf8c1b478 activityC22328xf8c1b478 = this.f288717t;
        if (("@all.contact.android".equals(activityC22328xf8c1b478.F) || "@all.contact.without.chatroom.without.openim".equals(activityC22328xf8c1b478.F)) && ((strArr = activityC22328xf8c1b478.G) == null || strArr.length == 0)) {
            return;
        }
        gm0.j1.i();
        this.f288711n = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U(activityC22328xf8c1b478.G, this.f288714q, activityC22328xf8c1b478.F, "", this.f288121m);
        java.lang.String[] strArr2 = activityC22328xf8c1b478.G;
        java.lang.String str = activityC22328xf8c1b478.F;
        java.lang.String str2 = this.f288714q;
        java.util.List list = this.f288121m;
        java.lang.String[] y17 = c01.e2.y(strArr2, str, "", str2, list);
        int[] w17 = c01.e2.w(activityC22328xf8c1b478.G, activityC22328xf8c1b478.F, "", list, this.f288714q);
        if (y17 != null && w17 != null) {
            int i17 = 0;
            for (int i18 = 0; i18 < y17.length; i18++) {
                if (i18 < w17.length) {
                    hashMap.put(y17[i18], java.lang.Integer.valueOf(w17[i18] + i17));
                    sparseArray.put(w17[i18] + i17, y17[i18]);
                    i17++;
                }
            }
        }
        h();
        notifyDataSetChanged();
    }

    public void t(java.lang.String str) {
        java.util.List list = this.f288715r;
        if (((java.util.LinkedList) list).contains(str)) {
            ((java.util.LinkedList) list).remove(str);
        } else {
            int size = ((java.util.LinkedList) list).size();
            int i17 = this.f288716s;
            if (size >= i17) {
                com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22328xf8c1b478 activityC22328xf8c1b478 = this.f288717t;
                db5.e1.t(activityC22328xf8c1b478.mo55332x76847179(), activityC22328xf8c1b478.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571412ea, java.lang.Integer.valueOf(i17)), "", new com.p314xaae8f345.mm.ui.p2690x38b72420.ra(this));
                return;
            }
            ((java.util.LinkedList) list).add(str);
        }
        notifyDataSetChanged();
    }
}
